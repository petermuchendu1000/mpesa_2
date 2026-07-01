package com.huawei.digitalpayment.consumer.baselib.view;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0002¨\u0006\u0005"}, d2 = {"toIntColor", "", "Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;", "getShowValue", "", "ConsumerBaseLib_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SealedRichTextKt {
    private static int component2 = 1;
    private static int component3;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int toIntColor(com.huawei.digitalpayment.consumer.baselib.view.RichText r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = "#666666"
            if (r4 == 0) goto L23
            int r2 = com.huawei.digitalpayment.consumer.baselib.view.SealedRichTextKt.component3
            int r2 = r2 + 85
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.view.SealedRichTextKt.component2 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1d
            java.lang.String r4 = r4.getTextColor()     // Catch: java.lang.Exception -> L32
            r2 = 58
            int r2 = r2 / 0
            if (r4 != 0) goto L24
            goto L23
        L1d:
            java.lang.String r4 = r4.getTextColor()     // Catch: java.lang.Exception -> L32
            if (r4 != 0) goto L24
        L23:
            r4 = r1
        L24:
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Exception -> L32
            int r1 = com.huawei.digitalpayment.consumer.baselib.view.SealedRichTextKt.component2
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.view.SealedRichTextKt.component3 = r2
            int r1 = r1 % r0
            goto L36
        L32:
            int r4 = android.graphics.Color.parseColor(r1)
        L36:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.view.SealedRichTextKt.toIntColor(com.huawei.digitalpayment.consumer.baselib.view.RichText):int");
    }

    public static final CharSequence getShowValue(RichText richText) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (richText == null) {
            return "";
        }
        CharSequence charSequence = richText.getCharSequence();
        if (charSequence != null) {
            return charSequence;
        }
        int i3 = component3 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return richText.getText();
    }
}
