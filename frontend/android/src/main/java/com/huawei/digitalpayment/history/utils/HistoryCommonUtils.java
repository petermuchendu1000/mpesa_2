package com.huawei.digitalpayment.history.utils;

public class HistoryCommonUtils {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final String copydefault = "%s %tT";

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r3 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r3 = new java.lang.Object[3];
        r3[1] = com.blankj.utilcode.util.ActivityUtils.getTopActivity().getString(com.huawei.history.R.string.history_list_title2);
        r3[1] = java.lang.Long.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        return java.lang.String.format(r1, com.huawei.digitalpayment.history.utils.HistoryCommonUtils.copydefault, com.blankj.utilcode.util.ActivityUtils.getTopActivity().getString(com.huawei.history.R.string.history_list_title2), java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r7 < (r3 - 86400000)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        return java.lang.String.format(r1, com.huawei.digitalpayment.history.utils.HistoryCommonUtils.copydefault, com.blankj.utilcode.util.ActivityUtils.getTopActivity().getString(com.huawei.history.R.string.history_list_title3), java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
    
        return com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.formatDayAndMonth(java.lang.String.valueOf(r7)) + java.lang.String.format(r1, " %tT", java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return java.lang.String.format(r1, com.huawei.digitalpayment.history.utils.HistoryCommonUtils.copydefault, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r7 >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r7 >= r3) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r3 = com.huawei.digitalpayment.history.utils.HistoryCommonUtils.ShareDataUIState + 57;
        com.huawei.digitalpayment.history.utils.HistoryCommonUtils.component1 = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getTransactionTime(long r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.history.utils.HistoryCommonUtils.ShareDataUIState
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.utils.HistoryCommonUtils.component1 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "%s %tT"
            if (r1 == 0) goto L21
            long r3 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.getTodayStartTime()
            java.util.Locale r1 = com.blankj.utilcode.util.LanguageUtils.getAppliedLanguage()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r6 = 59
            int r6 = r6 / 0
            if (r5 < 0) goto L6a
            goto L2d
        L21:
            long r3 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.getTodayStartTime()
            java.util.Locale r1 = com.blankj.utilcode.util.LanguageUtils.getAppliedLanguage()
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L6a
        L2d:
            int r3 = com.huawei.digitalpayment.history.utils.HistoryCommonUtils.ShareDataUIState
            int r3 = r3 + 57
            int r4 = r3 % 128
            com.huawei.digitalpayment.history.utils.HistoryCommonUtils.component1 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L53
            android.app.Activity r0 = com.blankj.utilcode.util.ActivityUtils.getTopActivity()
            int r3 = com.huawei.history.R.string.history_list_title2
            java.lang.String r0 = r0.getString(r3)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 1
            r3[r4] = r0
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3[r4] = r7
            java.lang.String r7 = java.lang.String.format(r1, r2, r3)
            goto L69
        L53:
            android.app.Activity r0 = com.blankj.utilcode.util.ActivityUtils.getTopActivity()
            int r3 = com.huawei.history.R.string.history_list_title2
            java.lang.String r0 = r0.getString(r3)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7}
            java.lang.String r7 = java.lang.String.format(r1, r2, r7)
        L69:
            return r7
        L6a:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 - r5
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L89
            android.app.Activity r0 = com.blankj.utilcode.util.ActivityUtils.getTopActivity()
            int r3 = com.huawei.history.R.string.history_list_title3
            java.lang.String r0 = r0.getString(r3)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7}
            java.lang.String r7 = java.lang.String.format(r1, r2, r7)
            return r7
        L89:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils.formatDayAndMonth(r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = " %tT"
            java.lang.String r7 = java.lang.String.format(r1, r8, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.utils.HistoryCommonUtils.getTransactionTime(long):java.lang.String");
    }
}
