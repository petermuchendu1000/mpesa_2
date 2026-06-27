// Numeric keypad + PIN dots, reconstructed from the original layout
// (keys: 1-9, blank, 0, del). Shared by the login (/pin) and register screens.
import React from "react";
import { View, Text, Pressable, StyleSheet, Animated } from "react-native";
import { Ionicons } from "@expo/vector-icons";
import { usePalette } from "@/theme/colors";

const KEYS = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "", "0", "del"];

export function PinDots({ filled, total, shake }: { filled: number; total: number; shake?: Animated.Value }) {
  const p = usePalette();
  return (
    <Animated.View style={[styles.dotsRow, shake ? { transform: [{ translateX: shake }] } : null]}>
      {Array.from({ length: total }).map((_, i) => (
        <View
          key={i}
          style={[
            styles.dot,
            { borderColor: p.brand.green },
            i < filled && { backgroundColor: p.brand.green },
          ]}
        />
      ))}
    </Animated.View>
  );
}

export function PinPad({
  onDigit,
  onBackspace,
  disabled,
}: {
  onDigit: (d: string) => void;
  onBackspace: () => void;
  disabled?: boolean;
}) {
  const p = usePalette();
  return (
    <View style={styles.pad}>
      {KEYS.map((k, idx) => {
        if (k === "") return <View key={idx} style={styles.key} />;
        const isDel = k === "del";
        return (
          <Pressable
            key={idx}
            disabled={disabled}
            onPress={() => (isDel ? onBackspace() : onDigit(k))}
            android_ripple={{ color: p.border, radius: 36, borderless: true }}
            style={({ pressed }) => [styles.key, pressed && { opacity: 0.5 }]}
            accessibilityRole="button"
            accessibilityLabel={isDel ? "Delete" : `Digit ${k}`}
          >
            {isDel ? (
              <Ionicons name="backspace-outline" size={26} color={p.textPrimary} />
            ) : (
              <Text style={[styles.keyText, { color: p.textPrimary }]}>{k}</Text>
            )}
          </Pressable>
        );
      })}
    </View>
  );
}

const styles = StyleSheet.create({
  dotsRow: { flexDirection: "row", justifyContent: "center", gap: 18, marginVertical: 28 },
  dot: { width: 16, height: 16, borderRadius: 8, borderWidth: 2 },
  pad: { flexDirection: "row", flexWrap: "wrap", justifyContent: "center" },
  key: { width: "33.33%", height: 72, alignItems: "center", justifyContent: "center" },
  keyText: { fontSize: 28, fontWeight: "600" },
});
