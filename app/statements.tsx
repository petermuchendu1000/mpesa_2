import React from "react";
import {
  SectionList,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
} from "react-native";
import { router } from "expo-router";
import { SafeAreaView } from "react-native-safe-area-context";
import { MaterialIcons } from "@expo/vector-icons";
import { STATEMENTS, Transaction } from "../src/data/mock";
import { formatBalance } from "../src/lib/format";
import { Colors, Fonts } from "../src/theme/colors";

function formatDate(iso: string): string {
  try {
    const d = new Date(iso);
    return new Intl.DateTimeFormat("en-GB", { day: "2-digit", month: "long", year: "numeric" }).format(d);
  } catch {
    return iso;
  }
}

export default function StatementsScreen() {
  // Group transactions by date (preserving the original order).
  const groups: { title: string; data: Transaction[] }[] = [];
  for (const t of STATEMENTS) {
    const title = formatDate(t.date);
    const last = groups[groups.length - 1];
    if (last && last.title === title) last.data.push(t);
    else groups.push({ title, data: [t] });
  }

  return (
    <SafeAreaView style={styles.safe} edges={["top", "bottom"]}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()} activeOpacity={0.6}>
          <MaterialIcons name="chevron-left" size={28} color="#fff" />
        </TouchableOpacity>
        <Text style={styles.headerTitle}>M-PESA Statements</Text>
        <TouchableOpacity activeOpacity={0.6}>
          <MaterialIcons name="more-vert" size={24} color="#fff" />
        </TouchableOpacity>
      </View>

      <TouchableOpacity style={styles.optionsRow} activeOpacity={0.7}>
        <MaterialIcons name="tune" size={20} color={Colors.primary} />
        <Text style={styles.optionsText}>Statement Options</Text>
      </TouchableOpacity>

      <SectionList
        sections={groups}
        keyExtractor={(item) => String(item.id)}
        stickySectionHeadersEnabled={false}
        contentContainerStyle={{ paddingBottom: 24 }}
        renderSectionHeader={({ section }) => <Text style={styles.dateHeader}>{section.title}</Text>}
        renderItem={({ item }) => {
          const positive = item.amount >= 0;
          return (
            <View style={styles.row}>
              <View style={[styles.avatar, { backgroundColor: item.avatarColor }]}>
                <Text style={styles.avatarText}>{item.initials}</Text>
              </View>
              <View style={{ flex: 1 }}>
                <Text style={styles.name}>{item.name}</Text>
                <Text style={styles.sub}>
                  {item.phone} · {item.time}
                </Text>
              </View>
              <Text style={[styles.amount, { color: positive ? Colors.primary : Colors.danger }]}>
                {positive ? "+" : "-"}Ksh {formatBalance(Math.abs(item.amount))}
              </Text>
            </View>
          );
        }}
      />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: { flex: 1, backgroundColor: Colors.background },
  header: {
    backgroundColor: Colors.brandDeep,
    flexDirection: "row",
    alignItems: "center",
    justifyContent: "space-between",
    paddingHorizontal: 12,
    paddingVertical: 14,
  },
  headerTitle: { fontSize: 18, fontFamily: Fonts.bold, color: "#fff" },
  optionsRow: {
    flexDirection: "row",
    alignItems: "center",
    gap: 8,
    backgroundColor: "#fff",
    paddingHorizontal: 16,
    paddingVertical: 14,
  },
  optionsText: { fontSize: 14, fontFamily: Fonts.semiBold, color: Colors.textPrimary },
  dateHeader: {
    fontSize: 13,
    fontFamily: Fonts.semiBold,
    color: Colors.textSecondary,
    paddingHorizontal: 16,
    paddingTop: 16,
    paddingBottom: 6,
  },
  row: {
    flexDirection: "row",
    alignItems: "center",
    gap: 12,
    backgroundColor: "#fff",
    paddingHorizontal: 16,
    paddingVertical: 12,
    marginHorizontal: 12,
    marginBottom: 1,
    borderRadius: 8,
  },
  avatar: { width: 44, height: 44, borderRadius: 22, alignItems: "center", justifyContent: "center" },
  avatarText: { fontSize: 15, fontFamily: Fonts.bold, color: Colors.textPrimary },
  name: { fontSize: 15, fontFamily: Fonts.semiBold, color: Colors.textPrimary },
  sub: { fontSize: 12, fontFamily: Fonts.regular, color: Colors.textSecondary, marginTop: 2 },
  amount: { fontSize: 14, fontFamily: Fonts.bold },
});

