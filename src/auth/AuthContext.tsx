// AuthProvider — reproduces the original app's auth context recovered from the bundle.
//
// State: { isAuthenticated, wrongAttempts, isLocked, balance, fuliza, isBalanceLoading,
//          user, userLoaded }
// Methods: validatePin, logout, refreshBalance, loadUser
//
// Persistence uses expo-secure-store with the original keys:
//   mpesa_registered, mpesa_phone, mpesa_name
//
// validatePin -> POST /api/login { phone, pin }; on success it persists the profile and
// pulls the wallet from GET /api/balance?phone=. Three wrong attempts locks the keypad.

import React, { createContext, useCallback, useContext, useEffect, useMemo, useState } from "react";
import * as SecureStore from "expo-secure-store";
import { getBalance, login, MAX_PIN_ATTEMPTS, clearToken } from "../api/client";
import { DEMO_USER } from "../data/mock";

export const KEY_REGISTERED = "mpesa_registered";
export const KEY_PHONE = "mpesa_phone";
export const KEY_NAME = "mpesa_name";

export type AuthUser = {
  name: string;
  firstName: string;
  initials: string;
  phone: string;
  status: string;
  tariff: string;
};

export type ValidatePinResult =
  | { ok: true }
  | { ok: false; locked: boolean; remaining: number; message: string };

type AuthState = {
  isAuthenticated: boolean;
  wrongAttempts: number;
  isLocked: boolean;
  balance: number;
  fuliza: number;
  isBalanceLoading: boolean;
  user: AuthUser | null;
  userLoaded: boolean;
  validatePin: (pin: string) => Promise<ValidatePinResult>;
  logout: () => Promise<void>;
  refreshBalance: () => Promise<void>;
  loadUser: () => Promise<void>;
};

const AuthContext = createContext<AuthState | null>(null);

function deriveInitials(name: string): string {
  const parts = name.trim().split(/\s+/).filter(Boolean);
  if (parts.length === 0) return "";
  if (parts.length === 1) return parts[0].slice(0, 2).toUpperCase();
  return (parts[0][0] + parts[parts.length - 1][0]).toUpperCase();
}

export function AuthProvider({ children }: { children: React.ReactNode }) {
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [wrongAttempts, setWrongAttempts] = useState(0);
  const [isLocked, setIsLocked] = useState(false);
  const [balance, setBalance] = useState(0);
  const [fuliza, setFuliza] = useState(0);
  const [isBalanceLoading, setIsBalanceLoading] = useState(false);
  const [user, setUser] = useState<AuthUser | null>(null);
  const [userLoaded, setUserLoaded] = useState(false);

  const loadUser = useCallback(async () => {
    try {
      const phone = (await SecureStore.getItemAsync(KEY_PHONE)) ?? DEMO_USER.phone;
      const name = (await SecureStore.getItemAsync(KEY_NAME)) ?? DEMO_USER.name;
      const firstName = name.trim().split(/\s+/)[0] || DEMO_USER.firstName;
      setUser({
        name,
        firstName,
        initials: deriveInitials(name) || DEMO_USER.initials,
        phone,
        status: DEMO_USER.status,
        tariff: DEMO_USER.tariff,
      });
    } catch {
      setUser({ ...DEMO_USER });
    } finally {
      setUserLoaded(true);
    }
  }, []);

  const refreshBalance = useCallback(async () => {
    setIsBalanceLoading(true);
    try {
      const phone = (await SecureStore.getItemAsync(KEY_PHONE)) ?? DEMO_USER.phone;
      const res = await getBalance(phone);
      if (res.kind === "ok") {
        setBalance(res.balance);
        setFuliza(res.fuliza || DEMO_USER.fulizaAvailable);
      } else {
        // Fall back to the demo figures so the dashboard is never blank.
        setBalance(DEMO_USER.mpesaBalance);
        setFuliza(DEMO_USER.fulizaAvailable);
      }
    } catch {
      setBalance(DEMO_USER.mpesaBalance);
      setFuliza(DEMO_USER.fulizaAvailable);
    } finally {
      setIsBalanceLoading(false);
    }
  }, []);

  const validatePin = useCallback(
    async (pin: string): Promise<ValidatePinResult> => {
      if (isLocked) {
        return { ok: false, locked: true, remaining: 0, message: "Account locked. Too many wrong attempts." };
      }
      const phone = (await SecureStore.getItemAsync(KEY_PHONE)) ?? DEMO_USER.phone;
      const name = (await SecureStore.getItemAsync(KEY_NAME)) ?? DEMO_USER.name;
      const res = await login(phone, pin);

      if (res.kind === "success") {
        await SecureStore.setItemAsync(KEY_REGISTERED, "true");
        await SecureStore.setItemAsync(KEY_PHONE, res.data?.phone ?? phone);
        await SecureStore.setItemAsync(KEY_NAME, res.data?.name ?? name);
        setWrongAttempts(0);
        setIsLocked(false);
        setIsAuthenticated(true);
        await loadUser();
        await refreshBalance();
        return { ok: true };
      }

      if (res.kind === "network_error") {
        return { ok: false, locked: false, remaining: MAX_PIN_ATTEMPTS - wrongAttempts, message: res.message };
      }

      // wrong_pin
      const attempts = wrongAttempts + 1;
      setWrongAttempts(attempts);
      const remaining = Math.max(0, MAX_PIN_ATTEMPTS - attempts);
      if (remaining <= 0) {
        setIsLocked(true);
        return { ok: false, locked: true, remaining: 0, message: "Account locked. Too many wrong attempts." };
      }
      return {
        ok: false,
        locked: false,
        remaining,
        message: `Wrong PIN, try again. ${remaining} attempt${remaining === 1 ? "" : "s"} left.`,
      };
    },
    [isLocked, wrongAttempts, loadUser, refreshBalance],
  );

  const logout = useCallback(async () => {
    await clearToken();
    setIsAuthenticated(false);
    setBalance(0);
    setFuliza(0);
    setWrongAttempts(0);
    setIsLocked(false);
  }, []);

  useEffect(() => {
    loadUser();
  }, [loadUser]);

  const value = useMemo<AuthState>(
    () => ({
      isAuthenticated,
      wrongAttempts,
      isLocked,
      balance,
      fuliza,
      isBalanceLoading,
      user,
      userLoaded,
      validatePin,
      logout,
      refreshBalance,
      loadUser,
    }),
    [isAuthenticated, wrongAttempts, isLocked, balance, fuliza, isBalanceLoading, user, userLoaded, validatePin, logout, refreshBalance, loadUser],
  );

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
}

export function useAuth(): AuthState {
  const ctx = useContext(AuthContext);
  if (!ctx) throw new Error("useAuth must be used within an AuthProvider");
  return ctx;
}



