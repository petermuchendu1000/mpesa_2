package com.huawei.digitalpayment.checkout.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.digitalpayment.checkoutModule.R;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;

public class DotPollingView extends View {
    private static final int DOT_STATUS_BIG = 257;
    private static final int DOT_STATUS_SMALL = 258;
    private static int component1 = 1;
    private static int component3;
    private final String TAG;
    private int mAlphaChange;
    private int mAlphaChangeTotal;
    private int mColor;
    private int mCurrentDot;
    private int mDotChangeStatus;
    private float mDotCurrentRadiusChange;
    private int mDotMaxRadius;
    private int mDotRadius;
    private int mDotSpacing;
    private int mDotTotalCount;
    private Paint mNormalPaint;
    private float mRadiusChangeRate;
    private int mSelectedColor;
    private Paint mSelectedPaint;

    public void setColor(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.mColor = i;
        this.mNormalPaint.setColor(i);
        int i5 = component1 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSelectedColor(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.mSelectedColor = i;
        this.mSelectedPaint.setColor(i);
        int i5 = component3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDotTotalCount(int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.mDotTotalCount = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 71;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setDotRadius(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 67;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.mDotRadius = i;
        int i6 = i4 + 85;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
    }

    public void setRadiusChangeRate(float f) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.mRadiusChangeRate = f;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setDotMaxRadius(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.mDotMaxRadius = i;
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
    }

    public void setDotSpacing(int i) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.mDotSpacing = i;
        int i6 = i3 + 31;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public DotPollingView(Context context) {
        this(context, null);
    }

    public DotPollingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DotPollingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = getClass().getSimpleName();
        this.mSelectedPaint = new Paint();
        this.mNormalPaint = new Paint();
        this.mDotTotalCount = 3;
        this.mCurrentDot = 0;
        this.mAlphaChange = 0;
        this.mAlphaChangeTotal = 220;
        this.mDotChangeStatus = 257;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DotPollingView, i, 0);
        initAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    private void initAttributes(TypedArray typedArray) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.mColor = typedArray.getColor(R.styleable.DotPollingView_dotP_dot_color, ContextCompat.getColor(getContext(), R.color.auxiliaryText));
        this.mSelectedColor = typedArray.getColor(R.styleable.DotPollingView_dotP_dot_selected_color, ContextCompat.getColor(getContext(), R.color.white));
        this.mDotRadius = typedArray.getDimensionPixelSize(R.styleable.DotPollingView_dotP_dot_radius, DensityUtils.dp2px(getContext(), 3.0f));
        this.mDotMaxRadius = typedArray.getDimensionPixelSize(R.styleable.DotPollingView_dotP_dot_max_radius, DensityUtils.dp2px(getContext(), 5.0f));
        this.mDotSpacing = typedArray.getDimensionPixelSize(R.styleable.DotPollingView_dotP_dot_spacing, DensityUtils.dp2px(getContext(), 6.0f));
        this.mDotTotalCount = typedArray.getInteger(R.styleable.DotPollingView_dotP_dot_count, 3);
        this.mRadiusChangeRate = typedArray.getFloat(R.styleable.DotPollingView_dotP_dot_size_change_rate, 0.3f);
        int i4 = component1 + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void init() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.mDotCurrentRadiusChange = 0.0f;
        this.mSelectedPaint.setColor(this.mSelectedColor);
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mNormalPaint.setColor(this.mColor);
        this.mNormalPaint.setAntiAlias(true);
        this.mNormalPaint.setStyle(Paint.Style.FILL);
        int i4 = component3 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[PHI: r1 r4 r10 r11
  0x005c: PHI (r1v17 int) = (r1v4 int), (r1v19 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r4v3 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r10v4 int) = (r10v1 int), (r10v7 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r11v7 int) = (r11v1 int), (r11v8 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r4 r10 r11
  0x003b: PHI (r4v1 int) = (r4v0 int), (r4v4 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r10v2 int) = (r10v1 int), (r10v7 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r11v2 int) = (r11v1 int), (r11v8 int) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.DotPollingView.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.DotPollingView.onDraw(android.graphics.Canvas):void");
    }
}
