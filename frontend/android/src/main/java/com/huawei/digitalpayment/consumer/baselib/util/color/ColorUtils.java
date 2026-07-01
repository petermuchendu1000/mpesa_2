package com.huawei.digitalpayment.consumer.baselib.util.color;

import android.graphics.Color;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "使用CommonBaseLib里面的")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/util/color/ColorUtils;", "", "<init>", "()V", "parseColor", "", "color", "", "defaultColor", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    private ColorUtils() {
    }

    public final int parseColor(String color, int defaultColor) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(color, "");
        try {
            int color2 = Color.parseColor(color);
            int i4 = ShareDataUIState + 91;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return color2;
        } catch (Exception unused) {
            return com.blankj.utilcode.util.ColorUtils.getColor(defaultColor);
        }
    }

    static {
        int i = component1 + 59;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
