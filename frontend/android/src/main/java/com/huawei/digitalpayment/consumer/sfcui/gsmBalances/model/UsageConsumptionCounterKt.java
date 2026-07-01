package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUsageConsumptionCounterUIModel", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounterUIModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionCounter;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UsageConsumptionCounterKt {
    private static int ShareDataUIState = 1;
    private static int component3;

    public static final UsageConsumptionCounterUIModel toUsageConsumptionCounterUIModel(UsageConsumptionCounter usageConsumptionCounter) {
        String strName;
        String strName2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(usageConsumptionCounter, "");
        CounterType type = usageConsumptionCounter.getType();
        String strName3 = null;
        if (type != null) {
            int i2 = component3 + 7;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            strName = type.name();
        } else {
            int i4 = ShareDataUIState + 21;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            strName = null;
        }
        String amount = usageConsumptionCounter.getAmount();
        CounterUnits units = usageConsumptionCounter.getUnits();
        if (units != null) {
            int i6 = component3 + 1;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            strName2 = units.name();
        } else {
            strName2 = null;
        }
        Float remaining = usageConsumptionCounter.getRemaining();
        AccountStatus status = usageConsumptionCounter.getStatus();
        if (status != null) {
            strName3 = status.name();
            int i8 = ShareDataUIState + 97;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 5;
            }
        }
        return new UsageConsumptionCounterUIModel(strName, amount, strName2, remaining, strName3, usageConsumptionCounter.getTotal(), usageConsumptionCounter.getOutstandingAmount(), usageConsumptionCounter.getDueDate(), usageConsumptionCounter.getDisplayName(), usageConsumptionCounter.getDisplayOrder(), false, 1024, null);
    }
}
