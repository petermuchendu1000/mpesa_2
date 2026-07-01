package com.huawei.digitalpayment.consumer.home.ui.homebalancesection;

import android.content.Context;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel;
import com.safaricom.consumer.commons.util.TextResourceKt;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/BalancesExt;", "", "<init>", "()V", "toRemainingBalanceText", "", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel;", "context", "Landroid/content/Context;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesExt {
    public static final int $stable = 0;
    public static final BalancesExt INSTANCE = new BalancesExt();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component1 = 1;
        private static int component3;

        static {
            int[] iArr = new int[CounterUnits.values().length];
            try {
                iArr[CounterUnits.KES.ordinal()] = 1;
                int i = component1 + 57;
                component3 = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterUnits.POINTS.ordinal()] = 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterUnits.MINUTES.ordinal()] = 3;
                int i4 = component1 + 29;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CounterUnits.MBs.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BalancesExt() {
    }

    public final String toRemainingBalanceText(UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModel, Context context) {
        int i;
        Pair pair;
        Float fValueOf;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(usageConsumptionDetailsUIModel, "");
        Intrinsics.checkNotNullParameter(context, "");
        DecimalFormat decimalFormat = new DecimalFormat(Constants.AMOUNT_TWO_DECIMALS_FORMAT);
        Float remaining = usageConsumptionDetailsUIModel.getRemaining();
        float fFloatValue = remaining != null ? remaining.floatValue() : 0.0f;
        CounterUnits units = usageConsumptionDetailsUIModel.getUnits();
        if (units == null) {
            int i4 = component2 + 103;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[units.ordinal()];
        }
        if (i != 1) {
            int i5 = ShareDataUIState + 1;
            int i6 = i5 % 128;
            component2 = i6;
            if (i5 % 2 != 0 ? i == 2 : i == 3) {
                pair = TuplesKt.to(Float.valueOf(fFloatValue), Integer.valueOf(R.string.gsm_balances_remaining_points));
            } else if (i == 3) {
                pair = TuplesKt.to(Float.valueOf(fFloatValue), Integer.valueOf(R.string.gsm_balances_remaining_mins));
            } else if (i != 4) {
                int i7 = i6 + 17;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                pair = TuplesKt.to(Float.valueOf(fFloatValue), Integer.valueOf(R.string.gsm_balances_remaining_undefined));
            } else {
                if (fFloatValue >= 1024.0f) {
                    fValueOf = Float.valueOf(fFloatValue / 1024.0f);
                    i2 = R.string.gsm_balances_remaining_gbs;
                } else {
                    fValueOf = Float.valueOf(fFloatValue);
                    i2 = R.string.gsm_balances_remaining_mbs;
                }
                pair = TuplesKt.to(fValueOf, Integer.valueOf(i2));
            }
        } else {
            pair = TuplesKt.to(Float.valueOf(fFloatValue), Integer.valueOf(R.string.gsm_balances_remaining_ksh));
        }
        return TextResourceKt.getStringRes(context, ((Number) pair.component2()).intValue(), decimalFormat.format(Float.valueOf(((Number) pair.component1()).floatValue())));
    }

    static {
        int i = copydefault + 25;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
