package com.safaricom.consumer.commons.amountvalidation;

import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.HttpConstants;
import com.safaricom.consumer.commons.transaction.ITransactionType;
import com.safaricom.consumer.commons.transaction.TransactionType;
import com.safaricom.mpesa.logging.L;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB'\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountLimits;", "", "transactionType", "Lcom/safaricom/consumer/commons/transaction/TransactionType;", LottieConstants.PARAM_MIN_VALUE, "", LottieConstants.PARAM_MAX_VALUE, "<init>", "(Ljava/lang/String;ILcom/safaricom/consumer/commons/transaction/TransactionType;DD)V", "getTransactionType", "()Lcom/safaricom/consumer/commons/transaction/TransactionType;", "getMin", "()D", "getMax", "BUSINESS_WITHDRAWAL", "BUY_AIRTIME", "BUY_GOODS", "DEFAULT", "PAY_BILL", "PAY_CUSTOMER", "PAYPAL_TOP_UP", "ROAMING_CASH_OUT", "SEND_MONEY", "SEND_MONEY_TO_MOBILE", "SEND_MONEY_TO_OTHER_NETWORKS", "SEND_TO_BANK", "WESTERN_UNION", "SEND_TO_BUSINESS", "UNREGISTERED_CUSTOMER", "WITHDRAW_AT_AGENT", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountLimits {
    private static final EnumEntries $ENTRIES;
    private static final AmountLimits[] $VALUES;

    public static final Companion INSTANCE;
    public static final AmountLimits DEFAULT;
    public static final AmountLimits PAYPAL_TOP_UP;
    public static final AmountLimits PAY_BILL;
    public static final AmountLimits PAY_CUSTOMER;
    public static final AmountLimits SEND_MONEY_TO_OTHER_NETWORKS;
    public static final AmountLimits SEND_TO_BANK;
    public static final AmountLimits SEND_TO_BUSINESS;
    public static final AmountLimits UNREGISTERED_CUSTOMER;
    public static final AmountLimits WESTERN_UNION;
    public static final AmountLimits WITHDRAW_AT_AGENT;
    private final double max;
    private final double min;
    private final TransactionType transactionType;
    public static final AmountLimits BUSINESS_WITHDRAWAL = new AmountLimits("BUSINESS_WITHDRAWAL", 0, TransactionType.BUSINESS_WITHDRAWAL, 50.0d, 400000.0d);
    public static final AmountLimits BUY_AIRTIME = new AmountLimits("BUY_AIRTIME", 1, TransactionType.BUY_AIRTIME, 1.0d, 10000.0d);
    public static final AmountLimits BUY_GOODS = new AmountLimits("BUY_GOODS", 2, TransactionType.BUY_GOODS, 0.0d, 0.0d, 6, null);
    public static final AmountLimits ROAMING_CASH_OUT = new AmountLimits("ROAMING_CASH_OUT", 7, TransactionType.ROAMING_CASH_OUT, 2400.0d, 1.0E7d);
    public static final AmountLimits SEND_MONEY = new AmountLimits("SEND_MONEY", 8, TransactionType.SEND_MONEY, 0.0d, 0.0d, 6, null);
    public static final AmountLimits SEND_MONEY_TO_MOBILE = new AmountLimits("SEND_MONEY_TO_MOBILE", 9, TransactionType.GLOBAL_SEND_TO_MOBILE, 101.0d, 0.0d, 4, null);

    private AmountLimits(String str, int i, TransactionType transactionType, double d2, double d3) {
        this.transactionType = transactionType;
        this.min = d2;
        this.max = d3;
    }

    AmountLimits(String str, int i, TransactionType transactionType, double d2, double d3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 1) != 0 ? TransactionType.UNDEFINED : transactionType, (i2 & 2) != 0 ? 1.0d : d2, (i2 & 4) != 0 ? 250000.0d : d3);
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public final TransactionType getTransactionType() {
        return this.transactionType;
    }

    static {
        double d2 = 0.0d;
        double d3 = 0.0d;
        DefaultConstructorMarker defaultConstructorMarker = null;
        DEFAULT = new AmountLimits("DEFAULT", 3, null, d2, d3, 7, defaultConstructorMarker);
        double d4 = 0.0d;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        PAY_BILL = new AmountLimits("PAY_BILL", 4, TransactionType.PAY_BILL, 0.0d, d4, 6, defaultConstructorMarker2);
        PAY_CUSTOMER = new AmountLimits("PAY_CUSTOMER", 5, TransactionType.PAY_TO_MOBILE, d2, d3, 6, defaultConstructorMarker);
        PAYPAL_TOP_UP = new AmountLimits("PAYPAL_TOP_UP", 6, TransactionType.PAYPAL_TOP_UP, 101.0d, d4, 4, defaultConstructorMarker2);
        double d5 = 0.0d;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        SEND_MONEY_TO_OTHER_NETWORKS = new AmountLimits("SEND_MONEY_TO_OTHER_NETWORKS", 10, TransactionType.SEND_MONEY_TO_OTHER_NETWORKS, 0.0d, d5, 6, defaultConstructorMarker3);
        double d6 = 0.0d;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        SEND_TO_BANK = new AmountLimits("SEND_TO_BANK", 11, TransactionType.GLOBAL_SEND_TO_BANK, 101.0d, d6, 4, defaultConstructorMarker4);
        WESTERN_UNION = new AmountLimits("WESTERN_UNION", 12, TransactionType.SEND_MONEY_TO_WESTERN_UNION, 101.0d, d5, 4, defaultConstructorMarker3);
        SEND_TO_BUSINESS = new AmountLimits("SEND_TO_BUSINESS", 13, TransactionType.POCHI_LA_BIASHARA, 0.0d, d6, 6, defaultConstructorMarker4);
        UNREGISTERED_CUSTOMER = new AmountLimits("UNREGISTERED_CUSTOMER", 14, null, 1.0d, 250000.0d, 1, defaultConstructorMarker3);
        WITHDRAW_AT_AGENT = new AmountLimits("WITHDRAW_AT_AGENT", 15, TransactionType.WITHDRAW_AT_AGENT, 50.0d, d6, 4, defaultConstructorMarker4);
        AmountLimits[] amountLimitsArr$values = $values();
        $VALUES = amountLimitsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(amountLimitsArr$values);
        INSTANCE = new Companion(null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountLimits$Companion;", "", "<init>", "()V", "getForTransactionType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountLimits;", "transactionType", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AmountLimits getForTransactionType(ITransactionType transactionType) {
            AmountLimits next;
            Iterator<AmountLimits> it = AmountLimits.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getTransactionType() == transactionType) {
                    break;
                }
            }
            AmountLimits amountLimits = next;
            if (amountLimits == null) {
                amountLimits = AmountLimits.DEFAULT;
            }
            L.INSTANCE.d("AmountLimits", "Limits for " + transactionType + HttpConstants.HEADER_VALUE_DELIMITER + amountLimits, new Object[0]);
            return amountLimits;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static AmountLimits valueOf(String str) {
        return (AmountLimits) Enum.valueOf(AmountLimits.class, str);
    }

    public static AmountLimits[] values() {
        return (AmountLimits[]) $VALUES.clone();
    }

    private static final AmountLimits[] $values() {
        return new AmountLimits[]{BUSINESS_WITHDRAWAL, BUY_AIRTIME, BUY_GOODS, DEFAULT, PAY_BILL, PAY_CUSTOMER, PAYPAL_TOP_UP, ROAMING_CASH_OUT, SEND_MONEY, SEND_MONEY_TO_MOBILE, SEND_MONEY_TO_OTHER_NETWORKS, SEND_TO_BANK, WESTERN_UNION, SEND_TO_BUSINESS, UNREGISTERED_CUSTOMER, WITHDRAW_AT_AGENT};
    }

    public static EnumEntries<AmountLimits> getEntries() {
        return $ENTRIES;
    }
}
