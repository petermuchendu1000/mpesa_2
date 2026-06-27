// Theme palette reconstructed from the original bundle.
// Primary brand green (#4CAF50) and the dark/light surface colors were taken
// from the decompiled resource strings.
import { useColorScheme } from "react-native";

export const Brand = {
  green: "#4CAF50",
  greenDark: "#1B3A20",
  greenTintLight: "#E8F5E9",
  red: "#E53935",
  blue: "#2196F3",
  orange: "#FF9800",
};

export const Light = {
  background: "#FFFFFF",
  surface: "#FAFAFA",
  surfaceAlt: "#F7F7F7",
  border: "#E0E0E0",
  textPrimary: "#151718",
  textSecondary: "#666666",
  textMuted: "#AAAAAA",
  card: "#FFFFFF",
};

export const Dark = {
  background: "#121212",
  surface: "#1E1E1E",
  surfaceAlt: "#2A2A2A",
  border: "#333333",
  textPrimary: "#FAFAFA",
  textSecondary: "#BBBBBB",
  textMuted: "#AAAAAA",
  card: "#1E1E1E",
};

export type Palette = typeof Light;

export function usePalette(): Palette & { brand: typeof Brand; isDark: boolean } {
  const scheme = useColorScheme();
  const isDark = scheme === "dark";
  return { ...(isDark ? Dark : Light), brand: Brand, isDark };
}
