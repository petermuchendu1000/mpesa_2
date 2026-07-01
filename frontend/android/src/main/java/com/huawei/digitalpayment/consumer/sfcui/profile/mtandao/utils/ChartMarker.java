package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.Context;
import android.widget.TextView;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.MPPointF;
import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ChartMarker;", "Lcom/github/mikephil/charting/components/MarkerView;", "context", "Landroid/content/Context;", "layout", "", "<init>", "(Landroid/content/Context;I)V", "txtViewData", "Landroid/widget/TextView;", "refreshContent", "", "e", "Lcom/github/mikephil/charting/data/Entry;", "highlight", "Lcom/github/mikephil/charting/highlight/Highlight;", "mOffset", "Lcom/github/mikephil/charting/utils/MPPointF;", "getOffset", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChartMarker extends MarkerView {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 109 % 128;
    private static int component2 = 0;
    private static int component3 = 1;
    private MPPointF mOffset;
    private TextView txtViewData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartMarker(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.txtViewData = (TextView) findViewById(R.id.markerText);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refreshContent(com.github.mikephil.charting.data.Entry r8, com.github.mikephil.charting.highlight.Highlight r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component2
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            r1 = 5
            int r1 = r1 / 0
            if (r8 == 0) goto L25
            goto L17
        L15:
            if (r8 == 0) goto L25
        L17:
            float r1 = r8.getX()
            long r3 = (long) r1
            r1 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r1
            long r3 = r3 * r5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L26
        L25:
            r1 = r2
        L26:
            if (r1 == 0) goto L3d
            java.util.Date r3 = new java.util.Date
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            r3.<init>(r4)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component3
            int r1 = r1 + 83
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component2 = r4
            int r1 = r1 % r0
            goto L3e
        L3d:
            r3 = r2
        L3e:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd HH:mm"
            java.util.Locale r5 = java.util.Locale.ENGLISH
            r1.<init>(r4, r5)
            android.widget.TextView r4 = r7.txtViewData
            if (r4 == 0) goto L7b
            if (r8 == 0) goto L55
            float r2 = r8.getY()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L55:
            java.lang.String r1 = r1.format(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "\n"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4.setText(r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component2
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component3 = r2
            int r1 = r1 % r0
        L7b:
            super.refreshContent(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.refreshContent(com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.highlight.Highlight):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.github.mikephil.charting.utils.MPPointF getOffset() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component3
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            com.github.mikephil.charting.utils.MPPointF r1 = r5.mOffset
            r2 = 54
            int r2 = r2 / 0
            if (r1 != 0) goto L31
            goto L1b
        L17:
            com.github.mikephil.charting.utils.MPPointF r1 = r5.mOffset
            if (r1 != 0) goto L31
        L1b:
            com.github.mikephil.charting.utils.MPPointF r1 = new com.github.mikephil.charting.utils.MPPointF
            int r2 = r5.getWidth()
            int r2 = r2 / r0
            float r2 = (float) r2
            float r2 = -r2
            int r3 = r5.getHeight()
            float r3 = (float) r3
            float r3 = -r3
            float r4 = (float) r0
            float r3 = r3 * r4
            r1.<init>(r2, r3)
            r5.mOffset = r1
        L31:
            com.github.mikephil.charting.utils.MPPointF r1 = r5.mOffset
            int r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component3
            int r2 = r2 + 37
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.component2 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L3f
            return r1
        L3f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ChartMarker.getOffset():com.github.mikephil.charting.utils.MPPointF");
    }

    static {
        int i = 109 % 2;
    }
}
