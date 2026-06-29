import React, { useState } from "react";
import {
  ActivityIndicator,
  Animated,
  KeyboardAvoidingView,
  Platform,
  ScrollView,
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  View,
} from "react-native";
import { router } from "expo-router";
import { SafeAreaView } from "react-native-safe-area-context";
import { MaterialIcons } from "@expo/vector-icons";
import * as SecureStore from "expo-secure-store";
import { PinDots, PinPad } from "../src/components/PinPad";
import { register, PIN_LENGTH } from "../src/api/client";
import { KEY_NAME, KEY_PHONE, KEY_REGISTERED } from "../src/auth/AuthContext";
import { Colors, Fonts } from "../src/theme/colors";

type Step = "details" | "pin" | "confirm";

export default function RegisterScreen() {
  const [step, setStep] = useState<Step>("details");
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");
  const [pin, setPin] = useState("");
  const [confirm, setConfirm] = useState("");
  const [error, setError] = useState("");
  const [busy, setBusy] = useState(false);
  const shake = useState(new Animated.Value(0))[0];

  const doShake = () => {
    Animated.sequence([
      Animated.timing(shake, { toValue: 10, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: -10, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: 6, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: 0, duration: 50, useNativeDriver: true }),
    ]).start();
  };

  const validPhone = (p: string) => /^(?:\+?254|0)?[17]\d{8}$/.test(p.replace(/\s/g, ""));

  const onNext = () => {
    setError("");
    if (!name.trim()) {
      setError("Please enter your full name");
      return;
    }
    if (!validPhone(phone)) {
      setError("Please enter a valid phone number");
      return;
    }
    setStep("pin");
  };

  const title = step === "details" ? "Create Account" : step === "pin" ? "Set your PIN" : "Confirm your PIN";

  const submit = async (confirmPin: string) => {
    if (confirmPin !== pin) {
      setError("PINs do not match. Try again.");
      setConfirm("");
      doShake();
      return;
    }
    setBusy(true);
    setError("");
    const res = await register(phone, pin, name);
    setBusy(false);
    if (res.kind === "ok") {
      await SecureStore.setItemAsync(KEY_REGISTERED, "true");
      await SecureStore.setItemAsync(KEY_PHONE, phone);
      await SecureStore.setItemAsync(KEY_NAME, name);
      router.replace("/pin");
    } else if (res.kind === "network_error") {
      setError(res.message);
      setConfirm("");
    } else {
      setError(`Error: ${res.message}`);
      setConfirm("");
    }
  };

  const onPinDigit = (d: string) => {
    if (busy) return;
    if (step === "pin") {
      if (pin.length >= PIN_LENGTH) return;
      const next = pin + d;
      setPin(next);
      if (next.length === PIN_LENGTH) {
        setError("");
        setStep("confirm");
      }
    } else if (step === "confirm") {
      if (confirm.length >= PIN_LENGTH) return;
      const next = confirm + d;
      setConfirm(next);
      if (next.length === PIN_LENGTH) submit(next);
    }
  };

  const onPinDelete = () => {
    if (busy) return;
    if (step === "pin") setPin((p) => p.slice(0, -1));
    else if (step === "confirm") setConfirm((p) => p.slice(0, -1));
  };

  const onBack = () => {
    setError("");
    if (step === "confirm") {
      setConfirm("");
      setStep("pin");
    } else if (step === "pin") {
      setPin("");
      setStep("details");
    } else {
      router.back();
    }
  };

  return (
    <SafeAreaView style={styles.safe} edges={["top", "bottom"]}>
      <View style={styles.header}>
        <TouchableOpacity style={styles.backBtn} onPress={onBack} activeOpacity={0.6}>
          <MaterialIcons name="chevron-left" size={28} color="#fff" />
        </TouchableOpacity>
        <Text style={styles.headerTitle}>{title}</Text>
        <View style={{ width: 28 }} />
      </View>

      <KeyboardAvoidingView
        style={{ flex: 1 }}
        behavior={Platform.OS === "ios" ? "padding" : undefined}
      >
        {step === "details" ? (
          <ScrollView
            contentContainerStyle={styles.detailsScroll}
            keyboardShouldPersistTaps="handled"
            showsVerticalScrollIndicator={false}
          >
            <View style={styles.iconCircle}>
              <MaterialIcons name="person" size={34} color="#fff" />
            </View>
            <Text style={styles.subtitle}>Enter your details to get started</Text>

            <View style={styles.fieldGroup}>
              <Text style={styles.fieldLabel}>Full Name</Text>
              <TextInput
                style={styles.input}
                placeholder="e.g. James Nthiga"
                placeholderTextColor={Colors.textMuted}
                value={name}
                onChangeText={setName}
                autoCapitalize="words"
                returnKeyType="next"
              />
            </View>

            <View style={styles.fieldGroup}>
              <Text style={styles.fieldLabel}>Phone Number</Text>
              <TextInput
                style={styles.input}
                placeholder="e.g. 0712345678"
                placeholderTextColor={Colors.textMuted}
                value={phone}
                onChangeText={setPhone}
                keyboardType="phone-pad"
                returnKeyType="done"
              />
            </View>

            {!!error && <Text style={styles.error}>{error}</Text>}

            <TouchableOpacity style={styles.nextBtn} activeOpacity={0.85} onPress={onNext}>
              <Text style={styles.nextText}>Next</Text>
            </TouchableOpacity>

            <TouchableOpacity style={styles.signinRow} onPress={() => router.replace("/pin")}>
              <Text style={styles.signinMuted}>Already have an account? </Text>
              <Text style={styles.signinLink}>Sign in</Text>
            </TouchableOpacity>
          </ScrollView>
        ) : (
          <View style={styles.pinArea}>
            <Text style={styles.phoneLabel}>Phone Number {phone}</Text>
            <Animated.View style={{ transform: [{ translateX: shake }] }}>
              <PinDots length={PIN_LENGTH} filled={step === "pin" ? pin.length : confirm.length} />
            </Animated.View>
            <View style={styles.statusArea}>
              {busy ? (
                <ActivityIndicator size="large" color={Colors.primary} />
              ) : error ? (
                <Text style={styles.error}>{error}</Text>
              ) : null}
            </View>
            <PinPad onDigit={onPinDigit} onDelete={onPinDelete} disabled={busy} />
          </View>
        )}
      </KeyboardAvoidingView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: { flex: 1, backgroundColor: "#fff" },
  header: {
    backgroundColor: Colors.brandDeep,
    flexDirection: "row",
    alignItems: "center",
    justifyContent: "space-between",
    paddingHorizontal: 12,
    paddingVertical: 14,
  },
  backBtn: { padding: 2 },
  headerTitle: { fontSize: 18, fontFamily: Fonts.bold, color: "#fff" },
  detailsScroll: { padding: 24, alignItems: "center" },
  iconCircle: {
    width: 72,
    height: 72,
    borderRadius: 36,
    backgroundColor: Colors.brandDeep,
    alignItems: "center",
    justifyContent: "center",
    marginTop: 12,
    marginBottom: 14,
  },
  subtitle: { fontSize: 15, fontFamily: Fonts.regular, color: Colors.textSecondary, marginBottom: 24 },
  fieldGroup: { width: "100%", marginBottom: 16 },
  fieldLabel: { fontSize: 13, fontFamily: Fonts.medium, color: Colors.textSecondary, marginBottom: 8 },
  input: {
    backgroundColor: "#FAFAFA",
    borderWidth: 1,
    borderColor: Colors.border,
    borderRadius: 12,
    paddingHorizontal: 16,
    paddingVertical: 14,
    fontSize: 16,
    fontFamily: Fonts.regular,
    color: Colors.textPrimary,
  },
  nextBtn: {
    backgroundColor: Colors.primary,
    borderRadius: 12,
    paddingVertical: 16,
    alignItems: "center",
    width: "100%",
    marginTop: 8,
  },
  nextText: { color: "#fff", fontSize: 16, fontFamily: Fonts.bold },
  signinRow: { flexDirection: "row", marginTop: 22 },
  signinMuted: { color: Colors.textSecondary, fontSize: 14, fontFamily: Fonts.regular },
  signinLink: { color: Colors.primary, fontSize: 14, fontFamily: Fonts.semiBold },
  error: { color: Colors.danger, fontSize: 14, fontFamily: Fonts.medium, textAlign: "center", marginBottom: 12 },
  pinArea: { flex: 1, paddingHorizontal: 24, paddingTop: 28, alignItems: "center" },
  phoneLabel: { fontSize: 14, fontFamily: Fonts.medium, color: Colors.textSecondary, marginBottom: 24 },
  statusArea: { height: 48, justifyContent: "center" },
});

