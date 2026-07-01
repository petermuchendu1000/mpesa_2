package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/XAxisFormatter;", "Lcom/github/mikephil/charting/formatter/IndexAxisValueFormatter;", "<init>", "()V", "getFormattedValue", "", "value", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class XAxisFormatter extends IndexAxisValueFormatter {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @Override
    public String getFormattedValue(float value) {
        int i = 2 % 2;
        String str = new SimpleDateFormat("dd-MMM", Locale.ENGLISH).format(new Date(((long) value) * ((long) 1000)));
        int i2 = component1 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = 1 + 43;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
