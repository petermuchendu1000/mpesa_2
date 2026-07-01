package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.chart;

import com.alibaba.ariver.kernel.RVParams;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.ConvertersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/chart/ChartFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "<init>", "()V", "getPointLabel", "", RVParams.LONG_URL_WITH_ENTRY_KEY, "Lcom/github/mikephil/charting/data/Entry;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChartFormatter extends ValueFormatter {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public String getPointLabel(Entry entry) {
        float y;
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (entry != null) {
            y = entry.getY();
            int i4 = copydefault + 51;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            y = 0.0f;
        }
        if (y > 0.0f) {
            int i6 = component1 + 69;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return ConvertersKt.byteConversion(y);
        }
        return "";
    }

    static {
        int i = 1 + 25;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
