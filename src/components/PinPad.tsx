import React from "react";
import { StyleSheet, Text, TouchableOpacity, View } from "react-native";
import { MaterialIcons } from "@expo/vector-icons";
import { Colors, Fonts } from "../theme/colors";

// PIN keypad recovered from the original: digits 1-9, an empty cell, 0, and a backspace.
const KEYS = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "", "0", "del"];

export function PinPad({
  onDigit,
  onDelete,
  disabled,
  dark,
}: {
  onDigit: (d: string) => void;
  onDelete: () => void;
  disabled?: boolean;
  dark?: boolean;
}) {
  const keyBg = dark ? "#2A2A2A" : "#FAFAFA";
  const keyText = dark ? "#fff" : "#1E1E1E";
  return (
    <View style={styles.grid}>
      {KEYS.map((k, i) => {
        if (k === "") return <View key={i} style={styles.key} />;
        if (k === "del") {
          return (
            <TouchableOpacity
              key={i}
              style={[styles.key, styles.delBtn]}
              activeOpacity={0.6}
              disabled={disabled}
              onPress={onDelete}
            >
              <MaterialIcons name="backspace" size={26} color={dark ? "#fff" : "#555555"} />
            </TouchableOpacity>
          );
        }
        return (
          <TouchableOpacity
            key={i}
            style={[styles.key, { backgroundColor: keyBg }]}
            activeOpacity={0.6}
            disabled={disabled}
            onPress={() => onDigit(k)}
          >
            <Text style={[styles.keyText, { color: keyText }]}>{k}</Text>
          </TouchableOpacity>
        );
      })}
    </View>
  );
}

export function PinDots({ length, filled, color }: { length: number; filled: number; color?: string }) {
  const on = color ?? Colors.primary;
  return (
    <View style={styles.dotsRow}>
      {Array.from({ length }).map((_, i) => (
        <View
          key={i}
          style={[styles.dot, { borderColor: on, backgroundColor: i < filled ? on : "transparent" }]}
        />
      ))}
    </View>
  );
}

const styles = StyleSheet.create({
  grid: {
    flexDirection: "row",
    flexWrap: "wrap",
    justifyContent: "center",
  },
  key: {
    width: "30%",
    aspectRatio: 1.7,
    margin: "1.5%",
    borderRadius: 14,
    alignItems: "center",
    justifyContent: "center",
  },
  delBtn: { backgroundColor: "transparent" },
  keyText: { fontSize: 26, fontFamily: Fonts.semiBold },
  dotsRow: { flexDirection: "row", justifyContent: "center", gap: 18 },
  dot: { width: 16, height: 16, borderRadius: 8, borderWidth: 2 },
});

