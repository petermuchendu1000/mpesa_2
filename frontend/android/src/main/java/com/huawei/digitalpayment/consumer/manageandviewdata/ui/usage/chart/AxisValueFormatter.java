package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.chart;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.ConvertersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/chart/AxisValueFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "getAxisLabel", "", "value", "", "axis", "Lcom/github/mikephil/charting/components/AxisBase;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AxisValueFormatter extends ValueFormatter {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public String getAxisLabel(float value, AxisBase axis) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0 ? value <= 0.0f : value <= 0.0f) {
            return "";
        }
        int i4 = i3 + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return ConvertersKt.byteConversion(value);
        }
        int i5 = 67 / 0;
        return ConvertersKt.byteConversion(value);
    }

    static {
        int i = 1 + 3;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
