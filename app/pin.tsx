import React, { useState } from "react";
import {
  ActivityIndicator,
  Animated,
  StyleSheet,
  Text,
  View,
} from "react-native";
import { router } from "expo-router";
import { SafeAreaView } from "react-native-safe-area-context";
import { MaterialIcons } from "@expo/vector-icons";
import { PinDots, PinPad } from "../src/components/PinPad";
import { useAuth } from "../src/auth/AuthContext";
import { PIN_LENGTH } from "../src/api/client";
import { Colors, Fonts } from "../src/theme/colors";

export default function PinScreen() {
  const { validatePin, isLocked, user } = useAuth();
  const [pin, setPin] = useState("");
  const [error, setError] = useState("");
  const [busy, setBusy] = useState(false);
  const shake = useState(new Animated.Value(0))[0];

  const doShake = () => {
    Animated.sequence([
      Animated.timing(shake, { toValue: 10, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: -10, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: 6, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: -6, duration: 50, useNativeDriver: true }),
      Animated.timing(shake, { toValue: 0, duration: 50, useNativeDriver: true }),
    ]).start();
  };

  const submit = async (full: string) => {
    setBusy(true);
    setError("");
    const res = await validatePin(full);
    setBusy(false);
    if (res.ok) {
      setPin("");
      router.replace("/(tabs)/home");
    } else {
      setError(res.message);
      setPin("");
      doShake();
    }
  };

  const onDigit = (d: string) => {
    if (isLocked || busy) return;
    if (pin.length >= PIN_LENGTH) return;
    const next = pin + d;
    setPin(next);
    if (next.length === PIN_LENGTH) submit(next);
  };

  const onDelete = () => {
    if (isLocked || busy) return;
    setPin((p) => p.slice(0, -1));
  };

  return (
    <SafeAreaView style={styles.safe} edges={["top", "bottom"]}>
      <View style={styles.header}>
        <View style={styles.iconCircle}>
          <MaterialIcons name="lock" size={30} color="#fff" />
        </View>
        <Text style={styles.title}>Enter your M-PESA PIN</Text>
        {!!user?.phone && <Text style={styles.phone}>{user.phone}</Text>}
      </View>

      <View style={styles.body}>
        <Animated.View style={{ transform: [{ translateX: shake }] }}>
          <PinDots length={PIN_LENGTH} filled={pin.length} />
        </Animated.View>

        <View style={styles.statusArea}>
          {busy ? (
            <ActivityIndicator size="small" color={Colors.primary} />
          ) : error ? (
            <Text style={styles.error}>{error}</Text>
          ) : null}
        </View>

        <PinPad onDigit={onDigit} onDelete={onDelete} disabled={isLocked || busy} />
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: { flex: 1, backgroundColor: "#fff" },
  header: {
    backgroundColor: Colors.brandDeep,
    paddingTop: 24,
    paddingBottom: 32,
    alignItems: "center",
    borderBottomLeftRadius: 28,
    borderBottomRightRadius: 28,
  },
  iconCircle: {
    width: 64,
    height: 64,
    borderRadius: 32,
    backgroundColor: "rgba(255,255,255,0.12)",
    alignItems: "center",
    justifyContent: "center",
    marginBottom: 14,
  },
  title: { fontSize: 20, fontFamily: Fonts.bold, color: "#fff" },
  phone: { fontSize: 14, fontFamily: Fonts.regular, color: "#C8E6C9", marginTop: 6 },
  body: { flex: 1, paddingHorizontal: 24, paddingTop: 36, alignItems: "center" },
  statusArea: { height: 40, justifyContent: "center" },
  error: { color: Colors.danger, fontSize: 14, fontFamily: Fonts.medium, textAlign: "center" },
});

