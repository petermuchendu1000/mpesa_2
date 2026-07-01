package com.huawei.digitalpayment.consumer.sfcqrcode.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/widget/AutoFitSurfaceView;", "Landroid/view/SurfaceView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aspectRatio", "", "setAspectRatio", "", "width", "height", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoFitSurfaceView extends SurfaceView {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private float aspectRatio;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = "AutoFitSurfaceView";

    /* JADX WARN: Illegal instructions before constructor call */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = component3 + 121;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = component3 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAspectRatio(int r4, int r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcqrcode.widget.AutoFitSurfaceView.copydefault
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.widget.AutoFitSurfaceView.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 14
            int r1 = r1 / 0
            if (r4 <= 0) goto L32
            goto L17
        L15:
            if (r4 <= 0) goto L32
        L17:
            if (r5 <= 0) goto L32
            float r1 = (float) r4
            float r2 = (float) r5
            float r1 = r1 / r2
            r3.aspectRatio = r1
            android.view.SurfaceHolder r1 = r3.getHolder()
            r1.setFixedSize(r4, r5)
            r3.requestLayout()
            int r4 = com.huawei.digitalpayment.consumer.sfcqrcode.widget.AutoFitSurfaceView.copydefault
            int r4 = r4 + 21
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcqrcode.widget.AutoFitSurfaceView.component3 = r5
            int r4 = r4 % r0
            return
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Size cannot be negative"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.widget.AutoFitSurfaceView.setAspectRatio(int, int):void");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = 2 % 2;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        float f = this.aspectRatio;
        if (f == 0.0f) {
            int i2 = component3 + 31;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                setMeasuredDimension(size, size2);
                return;
            } else {
                setMeasuredDimension(size, size2);
                int i3 = 40 / 0;
                return;
            }
        }
        if (size > size2) {
            int i4 = copydefault + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            f = 1.0f / f;
        }
        float f2 = size;
        float f3 = size2 * f;
        if (f2 < f3) {
            size = MathKt.roundToInt(f3);
        } else {
            size2 = MathKt.roundToInt(f2 / f);
        }
        Log.d(TAG, "Measured dimensions set: " + size + " x " + size2);
        setMeasuredDimension(size, size2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/widget/AutoFitSurfaceView$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = ShareDataUIState + 83;
        component2 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
