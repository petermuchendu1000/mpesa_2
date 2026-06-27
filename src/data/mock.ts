// Sample data for the dashboard's "recent transactions" list and quick actions.
//
// SECURITY NOTE: the ORIGINAL shipped bundle hardcoded a real-looking user
// (name, phone, balance) AND a default PIN ("1234"). That is a data-leak and was
// removed here (see docs/AUDIT.md §4.2). The values below are obviously-fake
// placeholders and contain NO credentials. Recents should ultimately come from a
// real `/api/transactions` endpoint, not from this file (see docs/AUDIT.md §6.2).

export type Transaction = {
  id: number;
  date: string;
  name: string;
  phone: string;
  amount: number; // negative = money out, positive = money in
  time: string;
  initials: string;
  avatarColor: string;
};

export const sampleTransactions: Transaction[] = [
  { id: 1, date: "2026-05-07", name: "Demo Recipient A", phone: "2547xxxxx001", amount: -50, time: "07:49 AM", initials: "DA", avatarColor: "#BBDEFB" },
  { id: 2, date: "2026-05-06", name: "Demo Recipient B", phone: "2547xxxxx002", amount: -100, time: "06:55 PM", initials: "DB", avatarColor: "#FCE4EC" },
  { id: 3, date: "2026-05-06", name: "Demo Recipient C", phone: "2547xxxxx003", amount: -50, time: "05:36 PM", initials: "DC", avatarColor: "#E8F5E9" },
  { id: 4, date: "2026-05-06", name: "Fuliza Repayment", phone: "—", amount: -172.24, time: "02:04 PM", initials: "FR", avatarColor: "#EDE7F6" },
  { id: 5, date: "2026-05-06", name: "Demo Sender E", phone: "2547xxxxx005", amount: 400, time: "02:04 PM", initials: "DE", avatarColor: "#E3F2FD" },
];

export type QuickAction = {
  key: string;
  label: string;
  icon: string; // Ionicons name
  route: string;
};

export const quickActions: QuickAction[] = [
  { key: "send", label: "Send Money", icon: "send", route: "/send" },
  { key: "withdraw", label: "Withdraw", icon: "cash-outline", route: "/withdraw" },
  { key: "airtime", label: "Buy Airtime", icon: "call-outline", route: "/airtime" },
  { key: "bundles", label: "Buy Bundles", icon: "wifi-outline", route: "/bundles" },
  { key: "pay", label: "Pay (Lipa)", icon: "pricetags-outline", route: "/pay" },
  { key: "request", label: "Request Money", icon: "download-outline", route: "/request" },
  { key: "scan", label: "Scan", icon: "scan-outline", route: "/scan" },
  { key: "statements", label: "Statements", icon: "document-text-outline", route: "/statements" },
];
