// Money formatting recovered from the original ("en-KE", "Ksh " prefix, 2 decimals).

export function formatBalance(amount: number): string {
  return new Intl.NumberFormat("en-KE", {
    minimumFractionDigits: 2,
    maximumFractionDigits: 2,
  }).format(amount);
}

export function formatKsh(amount: number): string {
  return `Ksh ${formatBalance(amount)}`;
}

