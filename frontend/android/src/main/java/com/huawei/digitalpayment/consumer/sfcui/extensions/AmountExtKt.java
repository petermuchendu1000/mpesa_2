package com.huawei.digitalpayment.consumer.sfcui.extensions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.StringResources_androidKt;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u000b"}, d2 = {"formatUnits", "", "", "units", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "(Ljava/lang/Float;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatKsh", "(Ljava/lang/Float;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatAmount", "(Ljava/lang/Float;)Ljava/lang/String;", "formatRemainingCounterUnits", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AmountExtKt {
    private static int component2 = 1;
    private static int component3;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component1 = 1;
        private static int component3;

        static {
            int[] iArr = new int[CounterUnits.values().length];
            try {
                iArr[CounterUnits.KES.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterUnits.POINTS.ordinal()] = 2;
                int i2 = component1 + 113;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterUnits.MINUTES.ordinal()] = 3;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CounterUnits.MBs.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CounterUnits.SMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CounterUnits.SECONDS.ordinal()] = 6;
                int i6 = component1 + 113;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String formatUnits(Float f, CounterUnits counterUnits, Composer composer, int i) {
        int i2;
        String strStringResource;
        int i3 = 2 % 2;
        composer.startReplaceGroup(-1806837945);
        String str = new DecimalFormat(Constants.AMOUNT_TWO_DECIMALS_FORMAT).format(f);
        if (counterUnits == null) {
            int i4 = component3 + 93;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[counterUnits.ordinal()];
        }
        switch (i2) {
            case 1:
                composer.startReplaceGroup(348808784);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_ksh, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(348811539);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_points, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(348814417);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_mins, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(348817104);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_mbs, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(348819760);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_sms, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
            case 6:
                composer.startReplaceGroup(348822548);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_seconds, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(348824950);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_undefined, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
                break;
        }
        composer.endReplaceGroup();
        int i5 = component2 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return strStringResource;
    }

    public static final String formatKsh(Float f, Composer composer, int i) {
        int i2 = 2 % 2;
        composer.startReplaceGroup(257090155);
        String strStringResource = StringResources_androidKt.stringResource(R.string.gsm_unit_ksh, new Object[]{new DecimalFormat(Constants.AMOUNT_TWO_DECIMALS_FORMAT).format(f)}, composer, 64);
        composer.endReplaceGroup();
        int i3 = component2 + 75;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return strStringResource;
    }

    public static final String formatAmount(Float f) {
        int i = 2 % 2;
        String str = new DecimalFormat(Constants.AMOUNT_TWO_DECIMALS_FORMAT).format(f);
        Intrinsics.checkNotNull(str);
        int i2 = component2 + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String formatRemainingCounterUnits(Float f, CounterUnits counterUnits, Composer composer, int i) {
        String strStringResource;
        int i2 = 2 % 2;
        composer.startReplaceGroup(-541975487);
        String str = new DecimalFormat(Constants.AMOUNT_TWO_DECIMALS_FORMAT).format(f);
        int i3 = counterUnits == null ? -1 : WhenMappings.$EnumSwitchMapping$0[counterUnits.ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(-1634391176);
            strStringResource = StringResources_androidKt.stringResource(R.string.gsm_balances_remaining_ksh, new Object[]{str}, composer, 64);
            composer.endReplaceGroup();
        } else if (i3 == 2) {
            composer.startReplaceGroup(-1634387973);
            strStringResource = StringResources_androidKt.stringResource(R.string.gsm_balances_remaining_points, new Object[]{str}, composer, 64);
            composer.endReplaceGroup();
        } else if (i3 == 3) {
            composer.startReplaceGroup(-1634384647);
            strStringResource = StringResources_androidKt.stringResource(R.string.gsm_balances_remaining_mins, new Object[]{str}, composer, 64);
            composer.endReplaceGroup();
            int i4 = component3 + 111;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else if (i3 != 4) {
            int i6 = component2 + 55;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            if (i3 != 5) {
                composer.startReplaceGroup(-1634375682);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_balances_remaining_undefined, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1634378408);
                strStringResource = StringResources_androidKt.stringResource(R.string.gsm_balances_remaining_sms, new Object[]{str}, composer, 64);
                composer.endReplaceGroup();
            }
        } else {
            composer.startReplaceGroup(-1634381512);
            strStringResource = StringResources_androidKt.stringResource(R.string.gsm_balances_remaining_mbs, new Object[]{str}, composer, 64);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }
}
