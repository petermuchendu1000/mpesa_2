import React, { useEffect, useState } from "react";
import {
  ScrollView,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
} from "react-native";
import { router } from "expo-router";
import { SafeAreaView } from "react-native-safe-area-context";
import { LinearGradient } from "expo-linear-gradient";
import { MaterialIcons } from "@expo/vector-icons";
import { useAuth } from "../../src/auth/AuthContext";
import {
  DISCOVER_CATEGORIES,
  QUICK_ACTIONS,
} from "../../src/data/mock";
import { formatBalance } from "../../src/lib/format";
import { Colors, Fonts } from "../../src/theme/colors";

export default function HomeScreen() {
  const { user, balance, fuliza, refreshBalance } = useAuth();
  const [showBalance, setShowBalance] = useState(true);

  useEffect(() => {
    refreshBalance();
  }, [refreshBalance]);

  const masked = "••••••";

  return (
    <SafeAreaView style={styles.safe} edges={["top"]}>
      {/* Top bar */}
      <View style={styles.topBar}>
        <View style={styles.avatarWrap}>
          <Text style={styles.avatarText}>{user?.initials ?? "JN"}</Text>
        </View>
        <View style={styles.searchBox}>
          <MaterialIcons name="search" size={20} color={Colors.textSecondary} />
          <Text style={styles.searchHint}>Search</Text>
        </View>
        <TouchableOpacity style={styles.langBtn} activeOpacity={0.7}>
          <Text style={styles.langText}>EN</Text>
        </TouchableOpacity>
        <TouchableOpacity style={styles.bellBtn} activeOpacity={0.7}>
          <MaterialIcons name="notifications-none" size={24} color={Colors.textPrimary} />
        </TouchableOpacity>
      </View>

      <ScrollView showsVerticalScrollIndicator={false} contentContainerStyle={{ paddingBottom: 28 }}>
        {/* M-PESA balance card */}
        <View style={styles.cardGradientWrap}>
          <LinearGradient
            colors={["#4CAF50", "#319B46", "#1B3A20"]}
            start={{ x: 0, y: 0 }}
            end={{ x: 1, y: 1 }}
            style={styles.card}
          >
            <Text style={styles.cardLabel}>M-PESA Balance</Text>
            <View style={styles.balanceRow}>
              <Text style={styles.balanceText}>
                Ksh {showBalance ? formatBalance(balance) : masked}
              </Text>
              <TouchableOpacity style={styles.eyeBtn} onPress={() => setShowBalance((v) => !v)}>
                <MaterialIcons
                  name={showBalance ? "visibility" : "visibility-off"}
                  size={22}
                  color="#A9A9A9"
                />
              </TouchableOpacity>
            </View>
            <Text style={styles.fulizaText}>Available Fuliza: Ksh {formatBalance(fuliza)}</Text>
            <TouchableOpacity style={styles.stmtBtn} onPress={() => router.push("/statements")}>
              <Text style={styles.stmtText}>View statements</Text>
            </TouchableOpacity>
          </LinearGradient>
        </View>

        {/* Quick actions */}
        <Text style={styles.sectionTitle}>Quick actions</Text>
        <View style={styles.quickGrid}>
          {QUICK_ACTIONS.map((qa) => (
            <TouchableOpacity key={qa.id} style={styles.quickItem} activeOpacity={0.7}>
              <View style={[styles.quickIcon, { backgroundColor: Colors.primaryMuted }]}>
                <MaterialIcons name={qa.icon as any} size={24} color={qa.color} />
              </View>
              <Text style={styles.quickLabel}>{qa.label}</Text>
            </TouchableOpacity>
          ))}
        </View>

        {/* My Balances */}
        <View style={styles.myBalancesCard}>
          <View style={{ flex: 1 }}>
            <Text style={styles.myBalancesTitle}>My Balances</Text>
            <View style={styles.balanceCols}>
              <View style={styles.balanceCol}>
                <Text style={styles.colLabel}>M-PESA</Text>
                <Text style={styles.colValue}>Ksh {formatBalance(balance)}</Text>
              </View>
              <View style={styles.divider} />
              <View style={styles.balanceCol}>
                <Text style={styles.colLabel}>Fuliza</Text>
                <Text style={styles.colValue}>Ksh {formatBalance(fuliza)}</Text>
              </View>
            </View>
          </View>
          <TouchableOpacity onPress={() => router.push("/statements")}>
            <Text style={styles.viewAll}>View All Balances</Text>
          </TouchableOpacity>
        </View>

        {/* Discover */}
        <Text style={styles.sectionTitle}>Explore &amp; Discover Deals 🔥</Text>
        <View style={styles.discoverGrid}>
          {DISCOVER_CATEGORIES.map((c) => (
            <TouchableOpacity key={c.id} style={styles.discoverItem} activeOpacity={0.7}>
              <View style={[styles.discoverEmojiWrap, { backgroundColor: c.color }]}>
                <Text style={styles.discoverEmoji}>{c.emoji}</Text>
              </View>
              <Text style={styles.discoverLabel}>{c.label}</Text>
            </TouchableOpacity>
          ))}
        </View>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: { flex: 1, backgroundColor: Colors.background },
  topBar: {
    flexDirection: "row",
    alignItems: "center",
    gap: 10,
    paddingHorizontal: 16,
    paddingVertical: 10,
    backgroundColor: Colors.background,
  },
  avatarWrap: {
    width: 40,
    height: 40,
    borderRadius: 20,
    backgroundColor: Colors.avatarBg,
    alignItems: "center",
    justifyContent: "center",
  },
  avatarText: { fontSize: 15, fontFamily: Fonts.bold, color: Colors.primaryDark },
  searchBox: {
    flex: 1,
    flexDirection: "row",
    alignItems: "center",
    gap: 8,
    backgroundColor: "#fff",
    borderRadius: 22,
    paddingHorizontal: 14,
    height: 40,
  },
  searchHint: { color: Colors.textSecondary, fontFamily: Fonts.regular, fontSize: 14 },
  langBtn: {
    width: 36,
    height: 36,
    borderRadius: 18,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  langText: { fontFamily: Fonts.semiBold, fontSize: 13, color: Colors.textPrimary },
  bellBtn: { width: 36, height: 36, alignItems: "center", justifyContent: "center" },

  cardGradientWrap: {
    marginHorizontal: 16,
    marginTop: 6,
    borderRadius: 18,
    overflow: "hidden",
    elevation: 4,
    shadowColor: "#000",
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.15,
    shadowRadius: 6,
  },
  card: { padding: 20 },
  cardLabel: { fontSize: 14, color: "#FFFFFF", fontFamily: Fonts.semiBold, marginBottom: 6, opacity: 0.9 },
  balanceRow: { flexDirection: "row", alignItems: "center", marginBottom: 8 },
  balanceText: { fontSize: 30, fontFamily: Fonts.bold, color: "#FFFFFF" },
  eyeBtn: { padding: 8 },
  fulizaText: { fontSize: 13, color: "#E8F5E9", fontFamily: Fonts.regular, marginBottom: 16 },
  stmtBtn: {
    borderWidth: 1,
    borderColor: "rgba(255,255,255,0.6)",
    borderRadius: 10,
    paddingVertical: 10,
    alignItems: "center",
  },
  stmtText: { color: "#fff", fontSize: 14, fontFamily: Fonts.semiBold },

  sectionTitle: {
    fontSize: 16,
    fontFamily: Fonts.bold,
    color: Colors.textPrimary,
    paddingHorizontal: 16,
    paddingTop: 20,
    paddingBottom: 12,
  },
  quickGrid: { flexDirection: "row", flexWrap: "wrap", paddingHorizontal: 8 },
  quickItem: { width: "25%", alignItems: "center", paddingVertical: 10, paddingHorizontal: 4 },
  quickIcon: {
    width: 52,
    height: 52,
    borderRadius: 26,
    alignItems: "center",
    justifyContent: "center",
    marginBottom: 8,
  },
  quickLabel: { fontSize: 11, textAlign: "center", lineHeight: 14, fontFamily: Fonts.regular, color: Colors.textPrimary },

  myBalancesCard: {
    flexDirection: "row",
    alignItems: "center",
    backgroundColor: "#fff",
    marginHorizontal: 16,
    marginTop: 8,
    borderRadius: 16,
    padding: 16,
    elevation: 2,
  },
  myBalancesTitle: { fontSize: 14, fontFamily: Fonts.semiBold, color: Colors.textPrimary, marginBottom: 10 },
  balanceCols: { flexDirection: "row", alignItems: "center", gap: 16 },
  balanceCol: {},
  colLabel: { fontSize: 12, color: Colors.textSecondary, fontFamily: Fonts.regular, marginBottom: 4 },
  colValue: { fontSize: 14, color: Colors.textPrimary, fontFamily: Fonts.semiBold },
  divider: { width: 1, height: 32, backgroundColor: Colors.border },
  viewAll: { color: Colors.primary, fontSize: 12, fontFamily: Fonts.semiBold, maxWidth: 80, textAlign: "right" },

  discoverGrid: { flexDirection: "row", flexWrap: "wrap", paddingHorizontal: 8 },
  discoverItem: { width: "25%", alignItems: "center", paddingVertical: 10, paddingHorizontal: 4 },
  discoverEmojiWrap: {
    width: 52,
    height: 52,
    borderRadius: 14,
    alignItems: "center",
    justifyContent: "center",
    marginBottom: 8,
  },
  discoverEmoji: { fontSize: 24 },
  discoverLabel: { fontSize: 11, textAlign: "center", lineHeight: 14, fontFamily: Fonts.regular, color: Colors.textPrimary },
});



