package com.huawei.digitalpayment.consumer.sfcui.extensions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"parcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntentExtKt {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r6
  0x0031: PHI (r6v8 android.os.Bundle) = (r6v7 android.os.Bundle), (r6v20 android.os.Bundle) binds: [B:10:0x002f, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.os.Parcelable> T parcelable(android.content.Intent r6, java.lang.String r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.String r3 = "T"
            r4 = 0
            r5 = 3
            if (r1 < r2) goto L66
            int r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2b
            android.os.Bundle r6 = r6.getExtras()
            r1 = 82
            int r1 = r1 / 0
            if (r6 == 0) goto L59
            goto L31
        L2b:
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L59
        L31:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault = r2
            int r1 = r1 % r0
            r1 = r6
            android.os.Bundle r1 = (android.os.Bundle) r1
            r1 = 4
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r3)
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            java.lang.Object r6 = androidx.core.os.BundleCompat.getParcelable(r6, r7, r1)
            r4 = r6
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r6 = r4
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            int r6 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault
            int r6 = r6 + r5
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState = r7
            int r6 = r6 % r0
        L59:
            r6 = r4
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            int r6 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault
            int r6 = r6 + 103
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState = r7
            int r6 = r6 % r0
            goto L7e
        L66:
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L78
            int r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState
            int r1 = r1 + r5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault = r2
            int r1 = r1 % r0
            android.os.Parcelable r4 = r6.getParcelable(r7)
        L78:
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r3)
            r6 = r4
            android.os.Parcelable r6 = (android.os.Parcelable) r6
        L7e:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault
            int r6 = r6 + 29
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L8b
            int r5 = r5 / 0
        L8b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.parcelable(android.content.Intent, java.lang.String):android.os.Parcelable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r4 = (T) r4.getParcelable(r5);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return (T) androidx.core.os.BundleCompat.getParcelable(r4, r5, android.os.Parcelable.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return (T) androidx.core.os.BundleCompat.getParcelable(r4, r5, android.os.Parcelable.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 108) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState + 85;
        com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.os.Parcelable> T parcelable(android.os.Bundle r4, java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState = r2
            int r1 = r1 % r0
            java.lang.String r2 = "T"
            java.lang.String r3 = ""
            if (r1 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 108(0x6c, float:1.51E-43)
            if (r1 < r3) goto L57
            goto L2b
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r1 < r3) goto L57
        L2b:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.ShareDataUIState
            int r1 = r1 + 85
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.copydefault = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L46
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r2)
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            java.lang.Object r4 = androidx.core.os.BundleCompat.getParcelable(r4, r5, r0)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            goto L64
        L46:
            r0 = 4
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r2)
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            java.lang.Object r4 = androidx.core.os.BundleCompat.getParcelable(r4, r5, r0)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            goto L64
        L57:
            android.os.Parcelable r4 = r4.getParcelable(r5)
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r2)
            r5 = r4
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            r5 = r4
            android.os.Parcelable r5 = (android.os.Parcelable) r5
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.extensions.IntentExtKt.parcelable(android.os.Bundle, java.lang.String):android.os.Parcelable");
    }
}
