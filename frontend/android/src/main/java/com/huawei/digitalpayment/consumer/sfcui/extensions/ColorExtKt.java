package com.huawei.digitalpayment.consumer.sfcui.extensions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"toHslColor", "", "", "saturation", "", "lightness", "adjustLightness", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorExtKt {
    private static int component2 = 0;
    private static int component3 = 1;

    public static int toHslColor$default(String str, float f, float f2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 109;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 67 / 0;
            }
            f = 0.5f;
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            f2 = 0.85f;
        }
        if ((i & 4) != 0) {
            int i7 = component2 + 43;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        int hslColor = toHslColor(str, f, f2, z);
        int i9 = component3 + 107;
        component2 = i9 % 128;
        if (i9 % 2 == 0) {
            return hslColor;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int toHslColor(java.lang.String r4, float r5, float r6, boolean r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.extensions.ColorExtKt.component3
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.ColorExtKt.component2 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L1a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            r1 = 41
            int r1 = r1 / r3
            if (r7 == 0) goto L20
            goto L23
        L1a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            if (r7 == 0) goto L20
            goto L23
        L20:
            r6 = 1050253722(0x3e99999a, float:0.3)
        L23:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7 = r3
            r1 = r7
        L27:
            int r2 = r4.length()
            if (r7 >= r2) goto L37
            int r1 = r1 * 37
            char r2 = r4.charAt(r7)
            int r1 = r1 + r2
            int r7 = r7 + 1
            goto L27
        L37:
            int r1 = r1 % 360
            int r4 = java.lang.Math.abs(r1)
            float r4 = (float) r4
            r7 = 3
            float[] r7 = new float[r7]
            r7[r3] = r4
            r4 = 1
            r7[r4] = r5
            r7[r0] = r6
            int r4 = androidx.core.graphics.ColorUtils.HSLToColor(r7)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.extensions.ColorExtKt.component2
            int r5 = r5 + 9
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.extensions.ColorExtKt.component3 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L58
            return r4
        L58:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.extensions.ColorExtKt.toHslColor(java.lang.String, float, float, boolean):int");
    }
}
