package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import com.alibaba.griver.api.constants.GriverErrors;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig;", "", "<init>", "()V", "getMaxAmount", "Ljava/math/BigDecimal;", "transactionType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "getMinAmount", "isOverdraftEnabled", "", "supportsOutdatedBalance", "calculateFee", "amount", "isAmountValid", "getLimitRangeText", "", "currency", "Companion", "AmountLimits", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultTransactionConfig {
    public static final int $stable = 0;

    public static final Companion INSTANCE;
    private static final List<Pair<BigDecimal, BigDecimal>> ShareDataUIState = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(new BigDecimal("100"), new BigDecimal("0")), TuplesKt.to(new BigDecimal("500"), new BigDecimal("11")), TuplesKt.to(new BigDecimal(Result.ERROR_CODE_UNKNOWN_ERROR), new BigDecimal("29")), TuplesKt.to(new BigDecimal("1500"), new BigDecimal("44")), TuplesKt.to(new BigDecimal("2500"), new BigDecimal("59")), TuplesKt.to(new BigDecimal("5000"), new BigDecimal("77")), TuplesKt.to(new BigDecimal("7500"), new BigDecimal("109")), TuplesKt.to(new BigDecimal(GriverErrors.ERROR_UNKNOWN), new BigDecimal("133"))});
    private static final double component1 = 0.015d;
    private static final double component2 = 500000.0d;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static final double copydefault = 10.0d;
    private static int equals = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component1 = 0;
        private static int component3 = 1;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.ROAMING_CASH_OUT.ordinal()] = 1;
                int i = component1 + 9;
                component3 = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.SEND_MONEY.ordinal()] = 2;
                int i4 = component1 + 123;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.SEND_MONEY_TO_MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionType.SEND_MONEY_TO_OTHER_NETWORKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig$Companion;", "", "<init>", "()V", "DEFAULT_MIN", "", "DEFAULT_MAX", "FEE_TIERS", "", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "PERCENTAGE_FEE_RATE", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component4 + 63;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0082\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig$AmountLimits;", "", "transactionType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", LottieConstants.PARAM_MIN_VALUE, "", LottieConstants.PARAM_MAX_VALUE, "<init>", "(Ljava/lang/String;ILcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;DD)V", "getTransactionType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "getMin", "()D", "getMax", "BUSINESS_WITHDRAWAL", "BUY_AIRTIME", "BUY_GOODS", "PAY_BILL", "PAY_CUSTOMER", "PAYPAL_TOP_UP", "ROAMING_CASH_OUT", "SEND_MONEY", "SEND_MONEY_TO_MOBILE", "SEND_MONEY_TO_OTHER_NETWORKS", "SEND_TO_BANK", "SEND_TO_BUSINESS", "WITHDRAW_AT_AGENT", "DEFAULT", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AmountLimits {

        private static int f2710a = 1;
        private static final AmountLimits[] accessartificialFrame;

        private static int f2711c = 0;
        public static final Companion component1;

        private static int f2712d = 1;
        private static final EnumEntries getARTIFICIAL_FRAME_PACKAGE_NAME;
        private static int invoke;
        private final double CoroutineDebuggingKt;
        private final double coroutineBoundary;
        private final TransactionType coroutineCreation;
        public static final AmountLimits ShareDataUIState = new AmountLimits("BUSINESS_WITHDRAWAL", 0, TransactionType.BUSINESS_WITHDRAWAL, 50.0d, 400000.0d);
        public static final AmountLimits component2 = new AmountLimits("BUY_AIRTIME", 1, TransactionType.BUY_AIRTIME, 1.0d, 10000.0d);
        public static final AmountLimits copydefault = new AmountLimits("BUY_GOODS", 2, TransactionType.BUY_GOODS, DefaultTransactionConfig.copydefault, DefaultTransactionConfig.component2);
        public static final AmountLimits copy = new AmountLimits("PAY_BILL", 3, TransactionType.PAY_BILL, DefaultTransactionConfig.copydefault, DefaultTransactionConfig.component2);
        public static final AmountLimits getAsAtTimestamp = new AmountLimits("PAY_CUSTOMER", 4, TransactionType.PAY_TO_MOBILE, DefaultTransactionConfig.copydefault, DefaultTransactionConfig.component2);
        public static final AmountLimits component4 = new AmountLimits("PAYPAL_TOP_UP", 5, TransactionType.PAYPAL_TOP_UP, 101.0d, DefaultTransactionConfig.component2);
        public static final AmountLimits getRequestBeneficiariesState = new AmountLimits("ROAMING_CASH_OUT", 6, TransactionType.ROAMING_CASH_OUT, 2400.0d, 1.0E7d);
        public static final AmountLimits equals = new AmountLimits("SEND_MONEY", 7, TransactionType.SEND_MONEY, DefaultTransactionConfig.copydefault, 250000.0d);
        public static final AmountLimits ArtificialStackFrames = new AmountLimits("SEND_MONEY_TO_MOBILE", 8, TransactionType.SEND_MONEY_TO_MOBILE, 101.0d, DefaultTransactionConfig.component2);
        public static final AmountLimits getShareableDataState = new AmountLimits("SEND_MONEY_TO_OTHER_NETWORKS", 9, TransactionType.SEND_MONEY_TO_OTHER_NETWORKS, DefaultTransactionConfig.copydefault, DefaultTransactionConfig.component2);
        public static final AmountLimits hashCode = new AmountLimits("SEND_TO_BANK", 10, TransactionType.SEND_TO_BANK, 101.0d, DefaultTransactionConfig.component2);
        public static final AmountLimits getSponsorBeneficiariesState = new AmountLimits("SEND_TO_BUSINESS", 11, TransactionType.POCHI_LA_BIASHARA, DefaultTransactionConfig.copydefault, DefaultTransactionConfig.component2);
        public static final AmountLimits toString = new AmountLimits("WITHDRAW_AT_AGENT", 12, TransactionType.WITHDRAW_AT_AGENT, 50.0d, 150000.0d);
        public static final AmountLimits component3 = new AmountLimits("DEFAULT", 13, TransactionType.UNDEFINED, DefaultTransactionConfig.copydefault, DefaultTransactionConfig.component2);

        private AmountLimits(String str, int i, TransactionType transactionType, double d2, double d3) {
            this.coroutineCreation = transactionType;
            this.coroutineBoundary = d2;
            this.CoroutineDebuggingKt = d3;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        AmountLimits(String str, int i, TransactionType transactionType, double d2, double d3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            double d4;
            double d5;
            if ((i2 & 2) != 0) {
                int i3 = f2711c + 5;
                f2712d = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
                d4 = 10.0d;
            } else {
                d4 = d2;
            }
            if ((i2 & 4) != 0) {
                int i5 = f2711c + 93;
                int i6 = i5 % 128;
                f2712d = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 105;
                f2711c = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 5;
                } else {
                    int i10 = 2 % 2;
                }
                d5 = 500000.0d;
            } else {
                d5 = d3;
            }
            this(str, i, transactionType, d4, d5);
        }

        public final TransactionType copydefault() {
            int i = 2 % 2;
            int i2 = f2711c;
            int i3 = i2 + 21;
            f2712d = i3 % 128;
            int i4 = i3 % 2;
            TransactionType transactionType = this.coroutineCreation;
            int i5 = i2 + 85;
            f2712d = i5 % 128;
            int i6 = i5 % 2;
            return transactionType;
        }

        public final double component1() {
            int i = 2 % 2;
            int i2 = f2711c + 49;
            int i3 = i2 % 128;
            f2712d = i3;
            int i4 = i2 % 2;
            double d2 = this.coroutineBoundary;
            int i5 = i3 + 3;
            f2711c = i5 % 128;
            int i6 = i5 % 2;
            return d2;
        }

        public final double component3() {
            int i = 2 % 2;
            int i2 = f2712d + 121;
            int i3 = i2 % 128;
            f2711c = i3;
            int i4 = i2 % 2;
            double d2 = this.CoroutineDebuggingKt;
            int i5 = i3 + 107;
            f2712d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 15 / 0;
            }
            return d2;
        }

        static {
            AmountLimits[] amountLimitsArrComponent2 = component2();
            accessartificialFrame = amountLimitsArrComponent2;
            getARTIFICIAL_FRAME_PACKAGE_NAME = EnumEntriesKt.enumEntries(amountLimitsArrComponent2);
            component1 = new Companion(null);
            int i = f2710a + 11;
            invoke = i % 128;
            int i2 = i % 2;
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig$AmountLimits$Companion;", "", "<init>", "()V", "getForTransactionType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/DefaultTransactionConfig$AmountLimits;", "transactionType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionType;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            private Companion() {
            }

            public final AmountLimits getForTransactionType(TransactionType transactionType) {
                AmountLimits amountLimits;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(transactionType, "");
                AmountLimits[] amountLimitsArrValues = AmountLimits.values();
                int length = amountLimitsArrValues.length;
                int i2 = 0;
                while (true) {
                    amountLimits = null;
                    if (i2 < length) {
                        int i3 = component1 + 107;
                        ShareDataUIState = i3 % 128;
                        if (i3 % 2 != 0) {
                            amountLimitsArrValues[i2].copydefault();
                            throw null;
                        }
                        amountLimits = amountLimitsArrValues[i2];
                        if (amountLimits.copydefault() == transactionType) {
                            int i4 = ShareDataUIState + 37;
                            component1 = i4 % 128;
                            int i5 = i4 % 2;
                            break;
                        }
                        i2++;
                    } else {
                        int i6 = ShareDataUIState + 57;
                        component1 = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 3 % 5;
                        }
                    }
                }
                if (amountLimits != null) {
                    return amountLimits;
                }
                AmountLimits amountLimits2 = AmountLimits.component3;
                int i8 = component1 + 103;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                return amountLimits2;
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static AmountLimits valueOf(String str) {
            int i = 2 % 2;
            int i2 = f2711c + 5;
            f2712d = i2 % 128;
            int i3 = i2 % 2;
            AmountLimits amountLimits = (AmountLimits) Enum.valueOf(AmountLimits.class, str);
            int i4 = f2711c + 17;
            f2712d = i4 % 128;
            int i5 = i4 % 2;
            return amountLimits;
        }

        public static AmountLimits[] values() {
            int i = 2 % 2;
            int i2 = f2712d + 45;
            f2711c = i2 % 128;
            if (i2 % 2 == 0) {
                return (AmountLimits[]) accessartificialFrame.clone();
            }
            int i3 = 12 / 0;
            return (AmountLimits[]) accessartificialFrame.clone();
        }

        private static final AmountLimits[] component2() {
            int i = 2 % 2;
            int i2 = f2711c + 21;
            int i3 = i2 % 128;
            f2712d = i3;
            int i4 = i2 % 2;
            AmountLimits[] amountLimitsArr = {ShareDataUIState, component2, copydefault, copy, getAsAtTimestamp, component4, getRequestBeneficiariesState, equals, ArtificialStackFrames, getShareableDataState, hashCode, getSponsorBeneficiariesState, toString, component3};
            int i5 = i3 + 39;
            f2711c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 21 / 0;
            }
            return amountLimitsArr;
        }

        public static EnumEntries<AmountLimits> ShareDataUIState() {
            int i = 2 % 2;
            int i2 = f2711c + 89;
            f2712d = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<AmountLimits> enumEntries = getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return enumEntries;
        }
    }

    public final BigDecimal getMaxAmount(TransactionType transactionType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(AmountLimits.component1.getForTransactionType(transactionType).component3()));
        int i2 = equals + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return bigDecimal;
    }

    public final BigDecimal getMinAmount(TransactionType transactionType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(AmountLimits.component1.getForTransactionType(transactionType).component1()));
        int i2 = copy + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return bigDecimal;
    }

    public final boolean isOverdraftEnabled(TransactionType transactionType) {
        int i = 2 % 2;
        int i2 = copy + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i4 = WhenMappings.$EnumSwitchMapping$0[transactionType.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return true;
        }
        int i5 = copy + 39;
        int i6 = i5 % 128;
        equals = i6;
        if (i5 % 2 == 0) {
            if (i4 == 4) {
                return true;
            }
        } else if (i4 == 4) {
            return true;
        }
        int i7 = i6 + 5;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final BigDecimal calculateFee(TransactionType transactionType, BigDecimal amount) {
        int i = 2 % 2;
        int i2 = equals + 35;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        for (Pair<BigDecimal, BigDecimal> pair : ShareDataUIState) {
            BigDecimal bigDecimalComponent1 = pair.component1();
            BigDecimal bigDecimalComponent2 = pair.component2();
            if (amount.compareTo(bigDecimalComponent1) <= 0) {
                return bigDecimalComponent2;
            }
        }
        BigDecimal bigDecimalMultiply = amount.multiply(new BigDecimal("0.015"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        int i4 = copy + 77;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return bigDecimalMultiply;
    }

    public final boolean isAmountValid(TransactionType transactionType, BigDecimal amount) {
        int i = 2 % 2;
        int i2 = copy + 121;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(amount, "");
            BigDecimal minAmount = getMinAmount(transactionType);
            getMaxAmount(transactionType);
            amount.compareTo(minAmount);
            throw null;
        }
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        BigDecimal minAmount2 = getMinAmount(transactionType);
        BigDecimal maxAmount = getMaxAmount(transactionType);
        if (amount.compareTo(minAmount2) < 0 || amount.compareTo(maxAmount) > 0) {
            return false;
        }
        int i3 = copy + 3;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public final String getLimitRangeText(TransactionType transactionType, String currency) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(currency, "");
        String str = currency + ' ' + getMinAmount(transactionType).toPlainString() + ConstantsKt.SEPARATOR_STRING + currency + ' ' + getMaxAmount(transactionType).toPlainString();
        int i2 = equals + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean supportsOutdatedBalance(TransactionType transactionType) {
        int i = 2 % 2;
        int i2 = copy + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i4 = copy + 77;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }
}
