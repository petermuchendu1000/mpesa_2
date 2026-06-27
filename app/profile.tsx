import { useEffect, useState } from "react";
import { View, Text, Pressable, StyleSheet } from "react-native";
import { router } from "expo-router";
import { ScreenScaffold } from "@/components/ScreenScaffold";
import { getSession, clearSession } from "@/auth/session";
import { usePalette } from "@/theme/colors";

export default function Profile() {
  const p = usePalette();
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");

  useEffect(() => {
    getSession().then((s) => { setName(s.name ?? ""); setPhone(s.phone ?? ""); });
  }, []);

  async function logout() {
    await clearSession();
    router.replace("/register");
  }

  return (
    <ScreenScaffold title="My OneApp">
      <View style={styles.block}>
        <Text style={[styles.name, { color: p.textPrimary }]}>{name || "—"}</Text>
        <Text style={[styles.phone, { color: p.textSecondary }]}>{phone || "—"}</Text>
      </View>
      <Pressable style={[styles.row, { borderBottomColor: p.border }]} onPress={() => router.push("/settings")}>
        <Text style={[styles.rowText, { color: p.textPrimary }]}>Settings</Text>
      </Pressable>
      <Pressable style={[styles.row, { borderBottomColor: p.border }]} onPress={() => {}}>
        <Text style={[styles.rowText, { color: p.textPrimary }]}>Stuck? Ask Zuri</Text>
      </Pressable>
      <Pressable style={[styles.cta, { borderColor: p.brand.red }]} onPress={logout}>
        <Text style={[styles.ctaText, { color: p.brand.red }]}>Log out</Text>
      </Pressable>
    </ScreenScaffold>
  );
}

const styles = StyleSheet.create({
  block: { paddingVertical: 24, alignItems: "center" },
  name: { fontSize: 22, fontWeight: "700" },
  phone: { fontSize: 15, marginTop: 4 },
  row: { paddingVertical: 18, borderBottomWidth: StyleSheet.hairlineWidth },
  rowText: { fontSize: 16 },
  cta: { marginTop: 28, borderWidth: 1, borderRadius: 12, paddingVertical: 14, alignItems: "center" },
  ctaText: { fontSize: 16, fontWeight: "700" },
});
