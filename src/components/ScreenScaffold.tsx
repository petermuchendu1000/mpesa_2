import React from "react";
import { View, Text, Pressable, StyleSheet } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { router } from "expo-router";
import { Ionicons } from "@expo/vector-icons";
import { usePalette } from "@/theme/colors";

export function ScreenScaffold({ title, children }: { title: string; children?: React.ReactNode }) {
  const p = usePalette();
  return (
    <SafeAreaView style={[styles.safe, { backgroundColor: p.background }]}>
      <View style={styles.header}>
        <Pressable onPress={() => router.back()} style={[styles.backBtn, { backgroundColor: p.surfaceAlt }]} hitSlop={10}>
          <Ionicons name="arrow-back" size={22} color={p.textPrimary} />
        </Pressable>
        <Text style={[styles.title, { color: p.textPrimary }]}>{title}</Text>
        <View style={{ width: 40 }} />
      </View>
      <View style={styles.body}>{children}</View>
    </SafeAreaView>
  );
}

export function ComingSoon({ title, note }: { title: string; note?: string }) {
  const p = usePalette();
  return (
    <ScreenScaffold title={title}>
      <View style={styles.center}>
        <Ionicons name="construct-outline" size={48} color={p.textMuted} />
        <Text style={[styles.csTitle, { color: p.textPrimary }]}>{title}</Text>
        <Text style={[styles.csNote, { color: p.textSecondary }]}>
          {note ?? "This flow is reconstructed UI only — it isn't wired to a backend transaction endpoint yet (see docs/AUDIT.md §6.2)."}
        </Text>
      </View>
    </ScreenScaffold>
  );
}

const styles = StyleSheet.create({
  safe: { flex: 1 },
  header: { height: 56, flexDirection: "row", alignItems: "center", justifyContent: "space-between", paddingHorizontal: 16 },
  backBtn: { width: 40, height: 40, borderRadius: 20, alignItems: "center", justifyContent: "center" },
  title: { fontSize: 18, fontWeight: "700" },
  body: { flex: 1, paddingHorizontal: 20 },
  center: { flex: 1, alignItems: "center", justifyContent: "center", gap: 12, paddingHorizontal: 24 },
  csTitle: { fontSize: 18, fontWeight: "700" },
  csNote: { fontSize: 14, textAlign: "center", lineHeight: 20 },
});
