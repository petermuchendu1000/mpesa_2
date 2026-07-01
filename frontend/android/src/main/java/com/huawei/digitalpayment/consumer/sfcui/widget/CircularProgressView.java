package com.huawei.digitalpayment.consumer.sfcui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/widget/CircularProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "oneMunite", "", "progressPaint", "Landroid/graphics/Paint;", "progressBgFillPaint", "progressBgSmallPaint", "textPaint", "oval", "Landroid/graphics/RectF;", "progressWidth", "", "progress", "maxProgress", "countdownText", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setProgress", "lastTime", "setMaxProcess", "setCountdownText", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CircularProgressView extends View {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private String countdownText;
    private int maxProgress;
    private final long oneMunite;
    private final RectF oval;
    private float progress;
    private final Paint progressBgFillPaint;
    private final Paint progressBgSmallPaint;
    private final Paint progressPaint;
    private float progressWidth;
    private final Paint textPaint;

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = component2 + 5;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 62 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = copydefault + 117;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.oneMunite = 60000L;
        Paint paint = new Paint();
        this.progressPaint = paint;
        Paint paint2 = new Paint();
        this.progressBgFillPaint = paint2;
        Paint paint3 = new Paint();
        this.progressBgSmallPaint = paint3;
        Paint paint4 = new Paint();
        this.textPaint = paint4;
        this.oval = new RectF();
        this.progressWidth = ConvertUtils.dp2px(3.0f);
        this.maxProgress = 100;
        this.countdownText = "0";
        paint.setColor(ColorUtils.getColor(R.color.color_35a839));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.progressWidth);
        paint.setAntiAlias(true);
        paint2.setColor(ColorUtils.getColor(R.color.color_f2f2f2));
        paint2.setStyle(Paint.Style.FILL);
        paint3.setColor(ColorUtils.getColor(R.color.white));
        paint3.setStyle(Paint.Style.FILL);
        paint4.setColor(ColorUtils.getColor(R.color.color_35a839));
        paint4.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint4.setTextSize(50.0f);
        paint4.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float f = 2;
        float fMin = (Math.min(getWidth(), getHeight()) / 2) - (this.progressPaint.getStrokeWidth() / f);
        this.oval.set((getWidth() / 2) - fMin, (getHeight() / 2) - fMin, (getWidth() / 2) + fMin, (getHeight() / 2) + fMin);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, this.progressBgFillPaint);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - this.progressWidth, this.progressBgSmallPaint);
        canvas.drawArc(this.oval, -180.0f, (AUScreenAdaptTool.WIDTH_BASE * this.progress) / this.maxProgress, false, this.progressPaint);
        float f2 = this.textPaint.getFontMetrics().descent;
        float f3 = this.textPaint.getFontMetrics().ascent;
        canvas.drawText(this.countdownText, (getWidth() / 2.0f) - (this.textPaint.measureText(this.countdownText) / 2.0f), ((getHeight() / 2) + ((f2 - f3) / f)) - this.textPaint.getFontMetrics().descent, this.textPaint);
        int i4 = component2 + 105;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setProgress(float progress, long lastTime) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.progress = progress;
        if (lastTime > this.oneMunite) {
            this.progressPaint.setColor(ColorUtils.getColor(R.color.color_35a839));
            this.textPaint.setColor(ColorUtils.getColor(R.color.color_35a839));
            int i4 = copydefault + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            this.progressPaint.setColor(ColorUtils.getColor(R.color.color_ff2a58));
            this.textPaint.setColor(ColorUtils.getColor(R.color.color_ff2a58));
        }
        invalidate();
    }

    public final void setMaxProcess(int maxProgress) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.maxProgress = maxProgress;
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = i2 + 99;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setCountdownText(String countdownText) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(countdownText, "");
            this.countdownText = countdownText;
            invalidate();
        } else {
            Intrinsics.checkNotNullParameter(countdownText, "");
            this.countdownText = countdownText;
            invalidate();
            int i3 = 56 / 0;
        }
    }

    static {
        int i = 1 + 47;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
