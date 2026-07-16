'use strict';

/**
 * Wallet money rules — the server-side mirror of the app's AppState.
 *
 * FULIZA: an overdraft. When a payment exceeds the M-PESA balance, Fuliza tops up the
 * shortfall (up to the granted limit); the borrowed amount becomes a debt (fulizaUsed)
 * that reduces the available Fuliza. Received money repays Fuliza first, then the balance.
 */

function round2(n) {
  return Math.round((n + Number.EPSILON) * 100) / 100;
}

function fulizaAvailable(user) {
  return round2(Math.max(0, user.fulizaLimit - user.fulizaUsed));
}

function balances(user) {
  return {
    balance: round2(user.balance),
    airtime: round2(user.airtime),
    fulizaLimit: round2(user.fulizaLimit),
    fulizaUsed: round2(user.fulizaUsed),
    fulizaAvailable: fulizaAvailable(user),
  };
}

function canAfford(user, amount) {
  return amount > 0 && amount <= user.balance + fulizaAvailable(user);
}

/** Debit the wallet (balance first, Fuliza covers the rest). Returns a result object. */
function send(user, { amount, recipient = '', title = 'Send Money', actionId = 'send_money' }) {
  amount = Number(amount);
  if (!(amount > 0)) return { ok: false, error: 'INVALID_AMOUNT' };
  if (!canAfford(user, amount)) return { ok: false, error: 'INSUFFICIENT_FUNDS' };

  const fromBalance = Math.min(amount, user.balance);
  const fromFuliza = round2(amount - fromBalance);
  user.balance = round2(user.balance - fromBalance);
  user.fulizaUsed = round2(user.fulizaUsed + fromFuliza);
  if (actionId === 'airtime') user.airtime = round2(user.airtime + amount);

  const tx = {
    id: reference(),
    title,
    recipient,
    amount: round2(amount),
    fulizaUsed: fromFuliza,
    incoming: false,
    date: new Date().toISOString(),
  };
  user.transactions.unshift(tx);
  return { ok: true, tx, balances: balances(user) };
}

/** Credit the wallet (repay Fuliza first, then top up balance). */
function deposit(user, { amount, from = '', title = 'Received' }) {
  amount = Number(amount);
  if (!(amount > 0)) return { ok: false, error: 'INVALID_AMOUNT' };
  const repay = Math.min(amount, user.fulizaUsed);
  user.fulizaUsed = round2(user.fulizaUsed - repay);
  user.balance = round2(user.balance + (amount - repay));

  const tx = {
    id: reference(),
    title,
    recipient: from,
    amount: round2(amount),
    fulizaRepaid: round2(repay),
    incoming: true,
    date: new Date().toISOString(),
  };
  user.transactions.unshift(tx);
  return { ok: true, tx, balances: balances(user) };
}

function reference() {
  const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
  let s = 'T';
  for (let i = 0; i < 9; i++) s += chars[Math.floor(Math.random() * chars.length)];
  return s;
}

module.exports = { round2, fulizaAvailable, balances, canAfford, send, deposit, reference };

