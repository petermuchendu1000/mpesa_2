package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.LanguageUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ReceiptToolsUtils {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    public static String getTransactionTime(long j) {
        int i = 2 % 2;
        long todayStartTime = getTodayStartTime();
        Locale appliedLanguage = LanguageUtils.getAppliedLanguage();
        if (j >= todayStartTime) {
            String str = String.format(appliedLanguage, "%s %tT", ActivityUtils.getTopActivity().getString(R.string.today), Long.valueOf(j));
            int i2 = component3 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        if (j < todayStartTime - 86400000) {
            return formatDayAndMonth(String.valueOf(j)) + String.format(appliedLanguage, " %tT", Long.valueOf(j));
        }
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return String.format(appliedLanguage, "%s %tT", ActivityUtils.getTopActivity().getString(R.string.yesterday), Long.valueOf(j));
        }
        Object[] objArr = new Object[2];
        objArr[1] = ActivityUtils.getTopActivity().getString(R.string.yesterday);
        objArr[1] = Long.valueOf(j);
        return String.format(appliedLanguage, "%s %tT", objArr);
    }

    public static String getTransactionTime(String str) {
        String transactionTime;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                transactionTime = getTransactionTime(Long.parseLong(str));
                int i3 = 30 / 0;
            } else {
                transactionTime = getTransactionTime(Long.parseLong(str));
            }
            return transactionTime;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(String str) {
        int i = 2 % 2;
        try {
            String str2 = new SimpleDateFormat(TimeUtils.DAY_MONTH_YEAR_HH_MM_SS, Locale.ENGLISH).format(new Date(Long.parseLong(str)));
            int i2 = ShareDataUIState + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatDayAndMonth(String str) {
        int i = 2 % 2;
        try {
            String str2 = new SimpleDateFormat("dd/MM", Locale.ENGLISH).format(new Date(Long.parseLong(str)));
            int i2 = component3 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkTimeStrIsValid(java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.ShareDataUIState
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L20
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L3f
            long r5 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L3f
            long r7 = java.lang.Long.parseLong(r8)     // Catch: java.lang.NumberFormatException -> L3f
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L3e
            goto L30
        L20:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L3f
            long r5 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L3f
            long r7 = java.lang.Long.parseLong(r8)     // Catch: java.lang.NumberFormatException -> L3f
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L3e
        L30:
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 >= 0) goto L3e
            int r7 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.component3
            int r7 = r7 + 23
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.ShareDataUIState = r8
            int r7 = r7 % r0
            r2 = 1
        L3e:
            return r2
        L3f:
            r7 = move-exception
            java.lang.String r8 = "====="
            java.lang.String r7 = r7.getMessage()
            com.huawei.common.util.L.d(r8, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.checkTimeStrIsValid(java.lang.String, java.lang.String):boolean");
    }

    public static long getTodayStartTime() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long time = calendar.getTime().getTime();
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return time;
    }

    public static String addComma3(String str) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i4 = component3 + 105;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return "";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        try {
            return new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US)).format(Math.abs(Double.parseDouble(str)));
        } catch (Exception unused) {
            return "";
        }
    }

    public static DisplayMetrics getWindowDisplayMetrics(Context context) {
        int i = 2 % 2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return displayMetrics;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap generateImageFromView(android.view.View r4, int r5, int r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.component3
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            if (r1 == 0) goto L2f
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            r1 = 1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r4.measure(r5, r1)
            int r5 = r4.getMeasuredWidth()
            int r1 = r4.getMeasuredHeight()
            r4.layout(r3, r3, r5, r1)
            int r5 = r4.getHeight()
            if (r6 >= r5) goto L5c
            goto L4b
        L2f:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r4.measure(r5, r1)
            int r5 = r4.getMeasuredWidth()
            int r1 = r4.getMeasuredHeight()
            r4.layout(r3, r3, r5, r1)
            int r5 = r4.getHeight()
            if (r6 >= r5) goto L5c
        L4b:
            int r6 = r4.getHeight()
            int r5 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.component3
            int r5 = r5 + 49
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.ShareDataUIState = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L5c
            int r0 = r0 / 5
        L5c:
            int r5 = r4.getWidth()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r0)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            android.content.Context r0 = r4.getContext()
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.color.colorPrimary
            int r0 = r0.getColor(r1)
            r6.drawColor(r0)
            r4.draw(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.generateImageFromView(android.view.View, int, int):android.graphics.Bitmap");
    }

    public static boolean saveImageToGallery(Context context, Bitmap bitmap) throws Throwable {
        int i = 2 % 2;
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zSaveImageToGallery = ImageUtil.saveImageToGallery(context, bitmap);
        int i4 = ShareDataUIState + 83;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return zSaveImageToGallery;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
