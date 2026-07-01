package com.huawei.digitalpayment.consumer.fixeddata.util;

import com.alibaba.griver.base.common.utils.NetworkUtils;
import com.huawei.common.language.LanguageConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/MoneyFormatter;", "", "<init>", "()V", "CURRENCY_CODE", "", "kenyaLocale", "Ljava/util/Locale;", "formatToKsh", "amount", "Ljava/math/BigDecimal;", "decimalMode", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/MoneyFormatter$DecimalMode;", "roundingIntent", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/MoneyFormatter$RoundingIntent;", "includeSymbol", "", "DecimalMode", "RoundingIntent", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MoneyFormatter {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final String component2 = "Ksh";
    private static int copydefault = 0;
    private static int equals = 1;
    public static final MoneyFormatter INSTANCE = new MoneyFormatter();
    private static final Locale component3 = new Locale(LanguageConstants.EN, "KE");
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 1;
        private static int component1;

        static {
            int[] iArr = new int[RoundingIntent.values().length];
            try {
                iArr[RoundingIntent.CHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundingIntent.DISPLAY.ordinal()] = 2;
                int i = ShareDataUIState + 95;
                component1 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundingIntent.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i3 = ShareDataUIState + 67;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 90 / 0;
            }
        }
    }

    private MoneyFormatter() {
    }

    static {
        int i = ShareDataUIState + 25;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/MoneyFormatter$DecimalMode;", "", "<init>", "(Ljava/lang/String;I)V", NetworkUtils.NETWORK_TYPE_NONE, "TWO", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DecimalMode {
        private static final EnumEntries $ENTRIES;
        private static final DecimalMode[] $VALUES;
        public static final DecimalMode NONE = new DecimalMode(NetworkUtils.NETWORK_TYPE_NONE, 0);
        public static final DecimalMode TWO = new DecimalMode("TWO", 1);
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private DecimalMode(String str, int i) {
        }

        static {
            DecimalMode[] decimalModeArr$values = $values();
            $VALUES = decimalModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(decimalModeArr$values);
            int i = component2 + 99;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static DecimalMode valueOf(String str) {
            int i = 2 % 2;
            int i2 = component1 + 35;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DecimalMode decimalMode = (DecimalMode) Enum.valueOf(DecimalMode.class, str);
            int i3 = component1 + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return decimalMode;
        }

        public static DecimalMode[] values() {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return (DecimalMode[]) $VALUES.clone();
            }
            int i3 = 62 / 0;
            return (DecimalMode[]) $VALUES.clone();
        }

        private static final DecimalMode[] $values() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            DecimalMode[] decimalModeArr = {NONE, TWO};
            int i5 = i2 + 37;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return decimalModeArr;
        }

        public static EnumEntries<DecimalMode> getEntries() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<DecimalMode> enumEntries = $ENTRIES;
            int i5 = i2 + 19;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/MoneyFormatter$RoundingIntent;", "", "<init>", "(Ljava/lang/String;I)V", "CHARGE", "DISPLAY", NetworkUtils.NETWORK_TYPE_NONE, "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoundingIntent {
        private static final EnumEntries $ENTRIES;
        private static final RoundingIntent[] $VALUES;
        public static final RoundingIntent CHARGE = new RoundingIntent("CHARGE", 0);
        public static final RoundingIntent DISPLAY = new RoundingIntent("DISPLAY", 1);
        public static final RoundingIntent NONE = new RoundingIntent(NetworkUtils.NETWORK_TYPE_NONE, 2);
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private RoundingIntent(String str, int i) {
        }

        static {
            RoundingIntent[] roundingIntentArr$values = $values();
            $VALUES = roundingIntentArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(roundingIntentArr$values);
            int i = component2 + 101;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public static RoundingIntent valueOf(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            RoundingIntent roundingIntent = (RoundingIntent) Enum.valueOf(RoundingIntent.class, str);
            int i4 = component3 + 91;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return roundingIntent;
        }

        public static RoundingIntent[] values() {
            int i = 2 % 2;
            int i2 = component3 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RoundingIntent[] roundingIntentArr = (RoundingIntent[]) $VALUES.clone();
            int i4 = ShareDataUIState + 75;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return roundingIntentArr;
            }
            throw null;
        }

        private static final RoundingIntent[] $values() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            RoundingIntent[] roundingIntentArr = {CHARGE, DISPLAY, NONE};
            int i5 = i3 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return roundingIntentArr;
        }

        public static EnumEntries<RoundingIntent> getEntries() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 107;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<RoundingIntent> enumEntries = $ENTRIES;
            int i5 = i2 + 87;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }
    }

    public static String formatToKsh$default(MoneyFormatter moneyFormatter, BigDecimal bigDecimal, DecimalMode decimalMode, RoundingIntent roundingIntent, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            decimalMode = DecimalMode.TWO;
        }
        if ((i & 4) != 0) {
            int i3 = equals + 121;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                roundingIntent = RoundingIntent.DISPLAY;
                int i4 = 69 / 0;
            } else {
                roundingIntent = RoundingIntent.DISPLAY;
            }
        }
        if ((i & 8) != 0) {
            int i5 = component1 + 5;
            equals = i5 % 128;
            z = i5 % 2 != 0;
        }
        return moneyFormatter.formatToKsh(bigDecimal, decimalMode, roundingIntent, z);
    }

    public final String formatToKsh(BigDecimal amount, DecimalMode decimalMode, RoundingIntent roundingIntent, boolean includeSymbol) {
        RoundingMode roundingMode;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(decimalMode, "");
        Intrinsics.checkNotNullParameter(roundingIntent, "");
        int i4 = WhenMappings.$EnumSwitchMapping$0[roundingIntent.ordinal()];
        if (i4 == 1) {
            roundingMode = RoundingMode.CEILING;
        } else if (i4 == 2) {
            roundingMode = RoundingMode.HALF_UP;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = equals + 97;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                roundingMode = RoundingMode.DOWN;
                int i6 = 90 / 0;
            } else {
                roundingMode = RoundingMode.DOWN;
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance(component3);
        if (decimalMode == DecimalMode.TWO) {
            int i7 = component1 + 111;
            equals = i7 % 128;
            int i8 = i7 % 2;
            i = 2;
        } else {
            i = 0;
        }
        numberInstance.setMinimumFractionDigits(i);
        if (decimalMode == DecimalMode.TWO) {
            int i9 = component1 + 57;
            equals = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 11 / 0;
            }
        } else {
            i2 = 0;
        }
        numberInstance.setMaximumFractionDigits(i2);
        numberInstance.setRoundingMode(roundingMode);
        String str = numberInstance.format(amount);
        if (!includeSymbol) {
            Intrinsics.checkNotNull(str);
            return str;
        }
        return "Ksh " + str;
    }
}
