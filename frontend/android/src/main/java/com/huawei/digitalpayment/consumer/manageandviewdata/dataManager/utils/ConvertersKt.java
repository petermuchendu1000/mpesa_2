package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils;

import android.util.Log;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0001¨\u0006\u0005"}, d2 = {"byteDivision", "", "", "byteConversion", "", "ConsumerSfcManageAndViewData_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConvertersKt {
    private static int ShareDataUIState = 1;
    private static int component2;

    public static final float byteDivision(long j) {
        String str = "";
        int i = 2 % 2;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        float f = j;
        float f2 = 0.0f;
        try {
            String str2 = decimalFormat.format(Float.valueOf(f / 1024.0f));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            float f3 = Float.parseFloat(str2);
            double d2 = 1024.0f;
            String str3 = decimalFormat.format(Float.valueOf(f / ((float) Math.pow(d2, 2))));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            float f4 = Float.parseFloat(str3);
            String str4 = decimalFormat.format(Float.valueOf(f / ((float) Math.pow(d2, 3))));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            float f5 = Float.parseFloat(str4);
            if (f5 > 1.0f) {
                int i2 = ShareDataUIState + 35;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                f2 = f5;
            } else if (f4 > 1.0f) {
                int i4 = ShareDataUIState + 27;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                f2 = f4;
            } else {
                f2 = f3;
            }
            System.out.println((Object) ("Converted Size: " + f2));
        } catch (Exception e) {
            String name = Long.TYPE.getName();
            String message = e.getMessage();
            if (message == null) {
                int i6 = ShareDataUIState + 121;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str = message;
            }
            Log.d(name, str);
        }
        int i8 = ShareDataUIState + 9;
        component2 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 46 / 0;
        }
        return f2;
    }

    public static final String byteConversion(long j) {
        Exception e;
        String str;
        String str2 = "";
        int i = 2 % 2;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        float f = j;
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
            } else if (f3 > 1.0f) {
                str = f3 + " MB";
                int i2 = ShareDataUIState + 117;
                component2 = i2 % 128;
                int i3 = i2 % 2;
            } else {
                str = f2 + " KB";
            }
            try {
                System.out.println((Object) ("Converted Size: " + str));
            } catch (Exception e2) {
                e = e2;
                String name = Long.TYPE.getName();
                String message = e.getMessage();
                if (message == null) {
                    int i4 = ShareDataUIState + 9;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    str2 = message;
                }
                Log.d(name, str2);
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        return str;
    }

    public static final String byteConversion(float f) {
        Exception e;
        String str;
        String str2 = "";
        int i = 2 % 2;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
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
            } else if (f3 > 1.0f) {
                str = f3 + " MB";
            } else {
                str = f2 + " KB";
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
        }
        try {
            System.out.println((Object) ("Converted Size: " + str));
            int i2 = component2 + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 4;
            }
        } catch (Exception e3) {
            e = e3;
            String name = Float.TYPE.getName();
            String message = e.getMessage();
            if (message == null) {
                int i4 = component2 + 29;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            } else {
                str2 = message;
            }
            Log.d(name, str2);
        }
        return str;
    }
}
