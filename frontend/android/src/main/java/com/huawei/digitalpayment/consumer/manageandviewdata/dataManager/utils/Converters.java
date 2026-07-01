package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils;

import android.util.Log;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/utils/Converters;", "", "<init>", "()V", "byteConversion", "", "value", "", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Converters {
    public static final int $stable = 0;
    public static final Converters INSTANCE = new Converters();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private Converters() {
    }

    public final String byteConversion(long value) {
        Exception e;
        String str;
        int i;
        int i2;
        String str2 = "";
        int i3 = 2 % 2;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        float f = value;
        try {
            String str3 = decimalFormat.format(Float.valueOf(f / 1024.0f));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            float f2 = Float.parseFloat(str3);
            double d2 = 1024.0f;
            String str4 = decimalFormat.format(Float.valueOf(f / ((float) Math.pow(d2, 2))));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            float f3 = Float.parseFloat(str4);
            String str5 = decimalFormat.format(Float.valueOf(f / ((float) Math.pow(d2, 3))));
            Intrinsics.checkNotNullExpressionValue(str5, "");
            float f4 = Float.parseFloat(str5);
            if (f4 > 1.0f) {
                str = f4 + " GB";
            } else {
                if (f3 > 1.0f) {
                    str = f3 + " MB";
                    i = component2 + 79;
                    i2 = i % 128;
                } else {
                    str = f2 + " KB";
                    i = component2 + 103;
                    i2 = i % 128;
                }
                component3 = i2;
                int i4 = i % 2;
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        try {
            System.out.println((Object) ("Converted Size: " + str));
        } catch (Exception e3) {
            e = e3;
            String name = getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                int i5 = component3 + 29;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            } else {
                str2 = message;
            }
            Log.d(name, str2);
            int i6 = component3 + 73;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return str;
    }

    static {
        int i = copydefault + 49;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
