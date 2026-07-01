package com.huawei.digitalpayment.customer.dynamics.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.customer.dynamics.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u000bJ(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0014J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/widget/ScanIDMarkView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "scanAreaWidth", "scanAreaHeight", "scanAreaRoundCorner", "scanAreaBorderWidth", "scanAreaBorderColor", "markBackgroundColor", "paint", "Landroid/graphics/Paint;", "backgroundRect", "Landroid/graphics/RectF;", "backgroundPath", "Landroid/graphics/Path;", "areaPath", "modeSRCOUT", "Landroid/graphics/PorterDuffXfermode;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setMarkBackgroundColor", "color", "setAreaBorderColor", "setAreaBorderWidth", "width", "setAreaRoundCorner", "corner", "setAreaSize", "size", "Landroid/util/Size;", "Companion", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanIDMarkView extends View {

    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "ScanIDMarkView";
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Path areaPath;
    private final Path backgroundPath;
    private RectF backgroundRect;
    private int markBackgroundColor;
    private final PorterDuffXfermode modeSRCOUT;
    private final Paint paint;
    private int scanAreaBorderColor;
    private int scanAreaBorderWidth;
    private int scanAreaHeight;
    private int scanAreaRoundCorner;
    private int scanAreaWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanIDMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.scanAreaWidth = SizeUtils.dp2px(312.0f);
        this.scanAreaHeight = SizeUtils.dp2px(200.0f);
        this.scanAreaRoundCorner = SizeUtils.dp2px(8.0f);
        this.scanAreaBorderWidth = SizeUtils.dp2px(2.0f);
        this.scanAreaBorderColor = ColorUtils.getColor(R.color.common_colorWhite);
        this.markBackgroundColor = ColorUtils.setAlphaComponent(ColorUtils.getColor(R.color.common_colorBlack), 0.5f);
        this.paint = new Paint();
        this.backgroundRect = new RectF();
        this.backgroundPath = new Path();
        this.areaPath = new Path();
        this.modeSRCOUT = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanIDMarkView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanIDMarkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        int i;
        int i2;
        int i3 = 2 % 2;
        L.d(TAG, "onSizeChanged w: " + w + "  h: " + h);
        this.backgroundPath.reset();
        this.areaPath.reset();
        RectF rectF = new RectF(0.0f, 0.0f, (float) w, (float) h);
        this.backgroundRect = rectF;
        L.d(TAG, "onSizeChanged backgroundRect: " + rectF);
        this.backgroundPath.addRect(this.backgroundRect, Path.Direction.CW);
        int i4 = this.scanAreaWidth;
        if (i4 > w) {
            i = w;
        } else {
            int i5 = component2 + 59;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 3;
            }
            i = i4;
        }
        int i7 = this.scanAreaHeight;
        if (i7 > h) {
            int i8 = component2 + 117;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            i2 = h;
        } else {
            i2 = i7;
        }
        RectF rectF2 = new RectF((w - i4) / 2, (h - i7) / 2, r6 + i, r7 + i2);
        L.d(TAG, "onSizeChanged areaRect: " + rectF2);
        Path path = this.areaPath;
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = this.scanAreaRoundCorner;
        }
        path.addRoundRect(rectF2, fArr, Path.Direction.CW);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.saveLayer(this.backgroundRect, this.paint);
        this.paint.setColor(this.markBackgroundColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.backgroundPath, this.paint);
        this.paint.setColor(this.scanAreaBorderColor);
        this.paint.setStrokeWidth(this.scanAreaBorderWidth);
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(this.areaPath, this.paint);
        this.paint.setColor(-1);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setXfermode(this.modeSRCOUT);
        canvas.drawPath(this.areaPath, this.paint);
        Object obj = null;
        this.paint.setXfermode(null);
        canvas.restore();
        int i4 = component2 + 61;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setMarkBackgroundColor(int color) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.markBackgroundColor = color;
        invalidate();
        int i4 = component2 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setAreaBorderColor(int color) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            this.scanAreaBorderColor = color;
            invalidate();
        } else {
            this.scanAreaBorderColor = color;
            invalidate();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setAreaBorderWidth(int width) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.scanAreaBorderWidth = width;
            invalidate();
            int i3 = 14 / 0;
        } else {
            this.scanAreaBorderWidth = width;
            invalidate();
        }
    }

    public final void setAreaRoundCorner(int corner) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.scanAreaRoundCorner = corner;
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        invalidate();
        int i4 = component2 + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAreaSize(Size size) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(size, "");
            this.scanAreaWidth = size.getWidth();
            this.scanAreaHeight = size.getHeight();
            onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
            invalidate();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(size, "");
        this.scanAreaWidth = size.getWidth();
        this.scanAreaHeight = size.getHeight();
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        invalidate();
        int i3 = component2 + 17;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i = component1 + 9;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/widget/ScanIDMarkView$Companion;", "", "<init>", "()V", "TAG", "", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
