// Send Money — reconstructed interactive form with the validation the original
// app described (amount limits + a consent checkbox). NOTE: there is no real
// /api/send endpoint in the backend yet, so this confirms locally only.
import { useState } from "react";
import { View, Text, TextInput, Pressable, StyleSheet, Switch } from "react-native";
import { ScreenScaffold } from "@/components/ScreenScaffold";
import { usePalette } from "@/theme/colors";
import { normalizePhone } from "@/api/client";

const MIN = 10;
const MAX = 250000;

export default function Send() {
  const p = usePalette();
  const [recipient, setRecipient] = useState("");
  const [amount, setAmount] = useState("");
  const [consent, setConsent] = useState(false);
  const [error, setError] = useState("");
  const [done, setDone] = useState(false);

  function submit() {
    const amt = Number(amount);
    if (recipient.replace(/\D/g, "").length < 9) return setError("Enter a valid recipient phone number.");
    if (!amt || amt < MIN || amt > MAX)
      return setError(`Failed, please enter amount between Ksh ${MIN} and Ksh ${MAX.toLocaleString()}`);
    if (!consent) return setError("Please confirm the recipient details to continue.");
    setError("");
    // TODO: replace with a real authenticated POST /api/send (idempotency key).
    setDone(true);
  }

  if (done) {
    return (
      <ScreenScaffold title="Send Money">
        <View style={styles.center}>
          <Text style={[styles.success, { color: p.brand.green }]}>✓ Request submitted</Text>
          <Text style={[styles.note, { color: p.textSecondary }]}>
            Ksh {Number(amount).toLocaleString()} to {normalizePhone(recipient)} (demo — not a real transfer).
          </Text>
          <Pressable style={[styles.cta, { backgroundColor: p.brand.green }]} onPress={() => { setDone(false); setAmount(""); setRecipient(""); setConsent(false); }}>
            <Text style={styles.ctaText}>Send another</Text>
          </Pressable>
        </View>
      </ScreenScaffold>
    );
  }

  return (
    <ScreenScaffold title="Send Money">
      <TextInput
        placeholder="Recipient phone"
        placeholderTextColor={p.textMuted}
        value={recipient}
        onChangeText={setRecipient}
        keyboardType="phone-pad"
        style={[styles.input, { color: p.textPrimary, borderColor: p.border, backgroundColor: p.surface }]}
      />
      <TextInput
        placeholder="Amount (Ksh)"
        placeholderTextColor={p.textMuted}
        value={amount}
        onChangeText={setAmount}
        keyboardType="number-pad"
        style={[styles.input, { color: p.textPrimary, borderColor: p.border, backgroundColor: p.surface }]}
      />
      <View style={styles.consentRow}>
        <Switch value={consent} onValueChange={setConsent} trackColor={{ true: p.brand.green }} />
        <Text style={[styles.consentText, { color: p.textSecondary }]}>I confirm the recipient details are correct</Text>
      </View>
      {!!error && <Text style={styles.error}>{error}</Text>}
      <Pressable style={[styles.cta, { backgroundColor: p.brand.green }]} onPress={submit}>
        <Text style={styles.ctaText}>Continue</Text>
      </Pressable>
    </ScreenScaffold>
  );
}

const styles = StyleSheet.create({
  input: { width: "100%", borderWidth: 1, borderRadius: 12, paddingHorizontal: 16, paddingVertical: 14, fontSize: 16, marginTop: 14 },
  consentRow: { flexDirection: "row", alignItems: "center", gap: 10, marginTop: 18 },
  consentText: { flex: 1, fontSize: 14 },
  error: { color: "#E53935", marginTop: 14 },
  cta: { width: "100%", borderRadius: 12, paddingVertical: 16, alignItems: "center", marginTop: 22 },
  ctaText: { color: "#fff", fontSize: 16, fontWeight: "700" },
  center: { flex: 1, alignItems: "center", justifyContent: "center", gap: 14 },
  success: { fontSize: 22, fontWeight: "800" },
  note: { fontSize: 14, textAlign: "center", paddingHorizontal: 20 },
});
