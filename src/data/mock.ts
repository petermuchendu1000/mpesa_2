// Demo data recovered verbatim from the original Mpesa.apk Hermes bundle.
// These are the exact objects the original app ships with (demo user, statements,
// quick actions, discover categories, quick-care tiles, account settings list).

import { Colors } from "../theme/colors";

export type DemoUser = {
  name: string;
  firstName: string;
  initials: string;
  phone: string;
  status: string;
  tariff: string;
  mpesaBalance: number;
  fulizaAvailable: number;
  airtime: number;
  data: string;
  pin: string;
};

// Original: { 'name':'James Nthiga', 'firstName':'James', 'initials':'JN', 'phone':'0702283114',
//   'status':'Active', 'tariff':'Prepaid', 'mpesaBalance':27670.76, 'fulilaAvailable':1500,
//   'airtime':0, 'data':'--', 'pin':'1234' }
export const DEMO_USER: DemoUser = {
  name: "James Nthiga",
  firstName: "James",
  initials: "JN",
  phone: "0702283114",
  status: "Active",
  tariff: "Prepaid",
  mpesaBalance: 27670.76,
  fulizaAvailable: 1500,
  airtime: 0,
  data: "--",
  pin: "1234",
};

export type Transaction = {
  id: number;
  date: string;
  name: string;
  phone: string;
  amount: number;
  time: string;
  initials: string;
  avatarColor: string;
};

// Note: in the original bundle some amounts are stored as unsigned-32-bit wraps of a
// negative number (e.g. 4294967246 === -50). They are written here already decoded.
export const STATEMENTS: Transaction[] = [
  { id: 1, date: "2026-05-07", name: "Stephen Njuguna", phone: "254725***794", amount: -50, time: "07:49 AM", initials: "SN", avatarColor: "#BBDEFB" },
  { id: 2, date: "2026-05-06", name: "Margret Ndwiga", phone: "254707***205", amount: -100, time: "06:55 PM", initials: "MN", avatarColor: "#FCE4EC" },
  { id: 3, date: "2026-05-06", name: "Martin Gathogo", phone: "0703***464", amount: -50, time: "05:36 PM", initials: "MG", avatarColor: "#E8F5E9" },
  { id: 4, date: "2026-05-06", name: "M-Pesa Overdraw", phone: "232323", amount: -172.24, time: "02:04 PM", initials: "MO", avatarColor: "#EDE7F6" },
  { id: 5, date: "2026-05-06", name: "Emmaculate Nthiga", phone: "254725***192", amount: 400, time: "02:04 PM", initials: "EN", avatarColor: "#E3F2FD" },
  { id: 6, date: "2026-05-06", name: "Simon Kiarie", phone: "0700***740", amount: -70, time: "07:47 AM", initials: "SK", avatarColor: "#F1F8E9" },
  { id: 7, date: "2026-05-06", name: "M-Pesa Overdraw", phone: "232323", amount: -86, time: "07:30 AM", initials: "MO", avatarColor: "#EDE7F6" },
  { id: 8, date: "2026-05-06", name: "Im App", phone: "517819", amount: 400, time: "07:29 AM", initials: "IA", avatarColor: "#E8EAF6" },
  { id: 9, date: "2026-05-05", name: "John Kamau", phone: "0722***111", amount: -200, time: "03:15 PM", initials: "JK", avatarColor: "#FFF8E1" },
  { id: 10, date: "2026-05-05", name: "Mary Wanjiru", phone: "254701***320", amount: 1000, time: "11:22 AM", initials: "MW", avatarColor: "#FCE4EC" },
];

export type QuickAction = { id: string; label: string; icon: string; color: string };

// iconFamily was 'MaterialIcons' for all of these in the original.
export const QUICK_ACTIONS: QuickAction[] = [
  { id: "send", label: "Send Money", icon: "send", color: "#4CAF50" },
  { id: "lipa", label: "Lipa na M-PESA", icon: "shopping-basket", color: "#E53935" },
  { id: "withdraw", label: "Withdraw Money", icon: "receipt", color: "#4CAF50" },
  { id: "bundles", label: "Buy Bundles", icon: "import-export", color: "#4CAF50" },
  { id: "airtime", label: "Airtime Top up", icon: "phone-in-talk", color: "#4CAF50" },
  { id: "tunukiwa", label: "Tunukiwa Bundles", icon: "card-giftcard", color: "#E53935" },
  { id: "intl", label: "International Transfers", icon: "language", color: "#E53935" },
  { id: "home", label: "Home Internet", icon: "home", color: "#4CAF50" },
];

export type DiscoverCategory = { id: string; label: string; color: string; emoji: string };

export const DISCOVER_CATEGORIES: DiscoverCategory[] = [
  { id: "financial", label: "Financial Services", color: "#FFF8E1", emoji: "💰" },
  { id: "global", label: "Global Payments", color: "#FFF8E1", emoji: "💸" },
  { id: "transport", label: "Transport & Travel", color: "#FFF8E1", emoji: "🚌" },
  { id: "shop", label: "Shop & Gift", color: "#E8F5E9", emoji: "🎁" },
  { id: "govt", label: "Govt Services", color: "#EDE7F6", emoji: "🏛️" },
  { id: "insurance", label: "Get Insurance", color: "#EDE7F6", emoji: "🛡️" },
  { id: "manage", label: "Manage My Services", color: "#E0F7FA", emoji: "⚙️" },
  { id: "games", label: "Mobile Games", color: "#FFF3E0", emoji: "🎮" },
  { id: "money", label: "Money Management", color: "#FFFDE7", emoji: "💰" },
  { id: "betting", label: "Betting", color: "#FAFAFA", emoji: "🎮" },
  { id: "loyalty", label: "Loyalty & Marketing", color: "#E0F7FA", emoji: "🏅" },
  { id: "health", label: "Health & Wellness", color: "#EDE7F6", emoji: "🏥" },
  { id: "entertainment", label: "Entertainment", color: "#FFF3E0", emoji: "🎁" },
  { id: "utilities", label: "Utilities", color: "#E0F7FA", emoji: "📁" },
  { id: "education", label: "Education", color: "#FFF8E1", emoji: "🗼" },
  { id: "trading", label: "Trading", color: "#FFF8E1", emoji: "📈" },
  { id: "news", label: "News", color: "#FAFAFA", emoji: "💡" },
  { id: "biz", label: "Safaricom Business", color: "#FFF3E0", emoji: "🏪" },
];

export type CareItem = { id: string; label: string; icon: string };

// Quick Care tiles on the Account screen (original order).
export const QUICK_CARE: CareItem[] = [
  { id: "security", label: "Security Centre", icon: "security" },
  { id: "puk", label: "Get PUK", icon: "lock" },
  { id: "fraud", label: "Report Fraud", icon: "warning" },
  { id: "subscriptions", label: "My Subscriptions", icon: "event" },
  { id: "help", label: "Get Help", icon: "support-agent" },
  { id: "shop", label: "Find a Safaricom Shop", icon: "store" },
];

// "Account and Settings" list rows (original order).
export const ACCOUNT_SETTINGS: CareItem[] = [
  { id: "line", label: "Manage My Line", icon: "sim-card" },
  { id: "personal", label: "Personal Details", icon: "person" },
  { id: "mpesa", label: "M-PESA Settings", icon: "settings" },
  { id: "notification", label: "Notification Preferences", icon: "notifications" },
  { id: "privacy", label: "Privacy", icon: "privacy-tip" },
  { id: "language", label: "Language", icon: "language" },
];

// Frequents row prefixes shown on the home screen.
export const FREQUENTS = ["0701", "0711", "0720", "0722", "0733", "0740", "0745", "0757", "0768", "0790"];

export { Colors };

