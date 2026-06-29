import React, { useState } from "react";
import {
  ScrollView,
  StyleSheet,
  Switch,
  Text,
  TouchableOpacity,
  View,
} from "react-native";
import { router } from "expo-router";
import { SafeAreaView } from "react-native-safe-area-context";
import { MaterialIcons } from "@expo/vector-icons";
import { useAuth } from "../../src/auth/AuthContext";
import { ACCOUNT_SETTINGS, DEMO_USER, QUICK_CARE } from "../../src/data/mock";
import { Colors, Fonts } from "../../src/theme/colors";

export default function AccountScreen() {
  const { user, logout } = useAuth();
  const [biometric, setBiometric] = useState(false);

  const onLogout = async () => {
    await logout();
    router.replace("/pin");
  };

  return (
    <SafeAreaView style={styles.safe} edges={["top"]}>
      <View style={styles.titleBar}>
        <Text style={styles.title}>Profile</Text>
      </View>

      <ScrollView showsVerticalScrollIndicator={false} contentContainerStyle={{ paddingBottom: 28 }}>
        {/* User card */}
        <View style={styles.userCard}>
          <View style={styles.avatarWrap}>
            <Text style={styles.avatarText}>{user?.initials ?? DEMO_USER.initials}</Text>
            <View style={styles.cameraBtn}>
              <MaterialIcons name="photo-camera" size={14} color={Colors.primary} />
            </View>
          </View>
          <Text style={styles.userName}>{user?.name ?? DEMO_USER.name}</Text>

          <View style={styles.userMeta}>
            <View style={styles.metaItem}>
              <Text style={styles.metaLabel}>Phone No.</Text>
              <Text style={styles.metaValue}>{user?.phone ?? DEMO_USER.phone}</Text>
            </View>
            <View style={styles.metaItem}>
              <Text style={styles.metaLabel}>Status</Text>
              <Text style={styles.metaValue}>{user?.status ?? DEMO_USER.status}</Text>
            </View>
            <View style={styles.metaItem}>
              <Text style={styles.metaLabel}>Tariff</Text>
              <Text style={styles.metaValue}>{user?.tariff ?? DEMO_USER.tariff}</Text>
            </View>
            <View style={styles.metaItem}>
              <Text style={styles.metaLabel}>Bonga</Text>
              <Text style={styles.metaValue}>0</Text>
            </View>
          </View>
        </View>

        {/* Quick actions: Appearance + Biometric */}
        <Text style={styles.sectionTitle}>Quick actions</Text>
        <View style={styles.quickActionsRow}>
          <TouchableOpacity style={styles.qaCard} activeOpacity={0.8}>
            <View style={[styles.qaIcon, { backgroundColor: Colors.purpleLight }]}>
              <MaterialIcons name="palette" size={20} color={Colors.purple} />
            </View>
            <Text style={styles.qaLabel}>Appearance</Text>
          </TouchableOpacity>
          <View style={styles.qaCard}>
            <View style={styles.qaIconRow}>
              <View style={[styles.qaIcon, { backgroundColor: Colors.blueLight }]}>
                <MaterialIcons name="fingerprint" size={20} color={Colors.blue} />
              </View>
              <Switch
                value={biometric}
                onValueChange={setBiometric}
                trackColor={{ false: "#E0E0E0", true: Colors.primaryLight }}
                thumbColor={biometric ? Colors.primary : "#f4f3f4"}
              />
            </View>
            <Text style={styles.qaLabel}>Biometric{"\n"}Authentication</Text>
          </View>
        </View>

        {/* Quick Care */}
        <Text style={styles.sectionTitle}>Quick Care</Text>
        <View style={styles.careGrid}>
          {QUICK_CARE.map((c) => (
            <TouchableOpacity key={c.id} style={styles.careCard} activeOpacity={0.8}>
              <MaterialIcons name={c.icon as any} size={24} color={Colors.primary} />
              <Text style={styles.careLabel}>{c.label}</Text>
            </TouchableOpacity>
          ))}
        </View>

        {/* Account and Settings */}
        <Text style={styles.sectionTitle}>Account and Settings</Text>
        <View style={styles.settingsList}>
          {ACCOUNT_SETTINGS.map((s, i) => (
            <TouchableOpacity
              key={s.id}
              style={[styles.settingsRow, i < ACCOUNT_SETTINGS.length - 1 && styles.settingsBorder]}
              activeOpacity={0.7}
            >
              <MaterialIcons name={s.icon as any} size={22} color={Colors.textSecondary} />
              <Text style={styles.settingsLabel}>{s.label}</Text>
              <MaterialIcons name="chevron-right" size={22} color={Colors.textMuted} />
            </TouchableOpacity>
          ))}
        </View>

        <TouchableOpacity style={styles.logoutBtn} activeOpacity={0.85} onPress={onLogout}>
          <MaterialIcons name="logout" size={20} color={Colors.danger} />
          <Text style={styles.logoutText}>Log Out</Text>
        </TouchableOpacity>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: { flex: 1, backgroundColor: Colors.background },
  titleBar: { paddingHorizontal: 16, paddingVertical: 12, backgroundColor: Colors.background },
  title: { fontSize: 20, fontFamily: Fonts.bold, color: Colors.textPrimary, textAlign: "center" },

  userCard: {
    backgroundColor: "#fff",
    marginHorizontal: 16,
    marginBottom: 8,
    borderRadius: 16,
    padding: 20,
    alignItems: "center",
    elevation: 2,
  },
  avatarWrap: {
    width: 76,
    height: 76,
    borderRadius: 38,
    backgroundColor: Colors.avatarBg,
    alignItems: "center",
    justifyContent: "center",
    position: "relative",
    marginBottom: 12,
  },
  avatarText: { fontSize: 26, fontFamily: Fonts.bold, color: Colors.primaryDark },
  cameraBtn: {
    position: "absolute",
    bottom: 0,
    right: 0,
    backgroundColor: "#fff",
    borderRadius: 12,
    width: 26,
    height: 26,
    alignItems: "center",
    justifyContent: "center",
    borderWidth: 1,
    borderColor: Colors.border,
  },
  userName: { fontSize: 18, fontFamily: Fonts.bold, color: Colors.textPrimary, marginBottom: 14 },
  userMeta: { flexDirection: "row", gap: 18, flexWrap: "wrap", justifyContent: "center" },
  metaItem: { alignItems: "center" },
  metaLabel: { fontSize: 12, color: Colors.textSecondary, fontFamily: Fonts.regular, marginBottom: 4 },
  metaValue: { fontSize: 13, fontFamily: Fonts.semiBold, color: Colors.textPrimary },

  sectionTitle: {
    fontSize: 15,
    fontFamily: Fonts.bold,
    color: Colors.textPrimary,
    paddingHorizontal: 16,
    paddingTop: 18,
    paddingBottom: 10,
  },
  quickActionsRow: { flexDirection: "row", gap: 12, paddingHorizontal: 16 },
  qaCard: {
    flex: 1,
    backgroundColor: "#fff",
    borderRadius: 14,
    padding: 14,
    alignItems: "flex-start",
    gap: 10,
    elevation: 2,
  },
  qaIcon: { width: 40, height: 40, borderRadius: 20, alignItems: "center", justifyContent: "center" },
  qaIconRow: { flexDirection: "row", alignItems: "center", justifyContent: "space-between", width: "100%" },
  qaLabel: { fontSize: 13, color: Colors.textPrimary, fontFamily: Fonts.medium },

  careGrid: { flexDirection: "row", flexWrap: "wrap", paddingHorizontal: 12, gap: 10 },
  careCard: {
    width: "30.5%",
    backgroundColor: "#fff",
    borderRadius: 14,
    padding: 14,
    alignItems: "center",
    gap: 8,
    elevation: 2,
    flexGrow: 1,
  },
  careLabel: { fontSize: 12, color: Colors.textPrimary, textAlign: "center", fontFamily: Fonts.medium },

  settingsList: { backgroundColor: "#fff", marginHorizontal: 16, borderRadius: 14, elevation: 2 },
  settingsRow: { flexDirection: "row", alignItems: "center", paddingHorizontal: 16, paddingVertical: 16, gap: 14 },
  settingsBorder: { borderBottomWidth: 1, borderBottomColor: "#F1F1F1" },
  settingsLabel: { flex: 1, fontSize: 14, color: Colors.textPrimary, fontFamily: Fonts.medium },

  logoutBtn: {
    flexDirection: "row",
    alignItems: "center",
    justifyContent: "center",
    gap: 8,
    marginHorizontal: 16,
    marginTop: 20,
    paddingVertical: 14,
    borderRadius: 14,
    backgroundColor: Colors.dangerLight,
  },
  logoutText: { color: Colors.danger, fontSize: 15, fontFamily: Fonts.bold },
});

