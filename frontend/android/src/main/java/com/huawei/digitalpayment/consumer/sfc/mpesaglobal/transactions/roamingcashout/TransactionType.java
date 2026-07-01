package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "", "<init>", "(Ljava/lang/String;I)V", "ROAMING_CASH_OUT", "SEND_MONEY", "SEND_MONEY_TO_MOBILE", "SEND_MONEY_TO_OTHER_NETWORKS", "SEND_TO_BANK", "SEND_TO_BUSINESS", "BILL_PAYMENT", "PAY_BILL", "BUY_GOODS", "BUY_AIRTIME", "WITHDRAW", "WITHDRAW_AT_AGENT", "BUSINESS_WITHDRAWAL", "DEPOSIT", "POCHI_LA_BIASHARA", "PAY_TO_MOBILE", "PAYPAL_TOP_UP", "UNDEFINED", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionType {
    private static final EnumEntries $ENTRIES;
    private static final TransactionType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    public static final TransactionType ROAMING_CASH_OUT = new TransactionType("ROAMING_CASH_OUT", 0);
    public static final TransactionType SEND_MONEY = new TransactionType("SEND_MONEY", 1);
    public static final TransactionType SEND_MONEY_TO_MOBILE = new TransactionType("SEND_MONEY_TO_MOBILE", 2);
    public static final TransactionType SEND_MONEY_TO_OTHER_NETWORKS = new TransactionType("SEND_MONEY_TO_OTHER_NETWORKS", 3);
    public static final TransactionType SEND_TO_BANK = new TransactionType("SEND_TO_BANK", 4);
    public static final TransactionType SEND_TO_BUSINESS = new TransactionType("SEND_TO_BUSINESS", 5);
    public static final TransactionType BILL_PAYMENT = new TransactionType("BILL_PAYMENT", 6);
    public static final TransactionType PAY_BILL = new TransactionType("PAY_BILL", 7);
    public static final TransactionType BUY_GOODS = new TransactionType("BUY_GOODS", 8);
    public static final TransactionType BUY_AIRTIME = new TransactionType("BUY_AIRTIME", 9);
    public static final TransactionType WITHDRAW = new TransactionType("WITHDRAW", 10);
    public static final TransactionType WITHDRAW_AT_AGENT = new TransactionType("WITHDRAW_AT_AGENT", 11);
    public static final TransactionType BUSINESS_WITHDRAWAL = new TransactionType("BUSINESS_WITHDRAWAL", 12);
    public static final TransactionType DEPOSIT = new TransactionType("DEPOSIT", 13);
    public static final TransactionType POCHI_LA_BIASHARA = new TransactionType("POCHI_LA_BIASHARA", 14);
    public static final TransactionType PAY_TO_MOBILE = new TransactionType("PAY_TO_MOBILE", 15);
    public static final TransactionType PAYPAL_TOP_UP = new TransactionType("PAYPAL_TOP_UP", 16);
    public static final TransactionType UNDEFINED = new TransactionType("UNDEFINED", 17);

    private TransactionType(String str, int i) {
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(transactionTypeArr$values);
        int i = component1 + 61;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static TransactionType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TransactionType transactionType = (TransactionType) Enum.valueOf(TransactionType.class, str);
        int i4 = ShareDataUIState + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionType;
        }
        throw null;
    }

    public static TransactionType[] values() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        TransactionType[] transactionTypeArr = (TransactionType[]) $VALUES.clone();
        int i3 = component2 + 71;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return transactionTypeArr;
        }
        obj.hashCode();
        throw null;
    }

    private static final TransactionType[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        TransactionType[] transactionTypeArr = {ROAMING_CASH_OUT, SEND_MONEY, SEND_MONEY_TO_MOBILE, SEND_MONEY_TO_OTHER_NETWORKS, SEND_TO_BANK, SEND_TO_BUSINESS, BILL_PAYMENT, PAY_BILL, BUY_GOODS, BUY_AIRTIME, WITHDRAW, WITHDRAW_AT_AGENT, BUSINESS_WITHDRAWAL, DEPOSIT, POCHI_LA_BIASHARA, PAY_TO_MOBILE, PAYPAL_TOP_UP, UNDEFINED};
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return transactionTypeArr;
        }
        throw null;
    }

    public static EnumEntries<TransactionType> getEntries() {
        EnumEntries<TransactionType> enumEntries;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 8 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
