package com.huawei.common.widget.banner;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.common.R;
import com.huawei.common.widget.banner.RatioMeasureDelegate;

public final class RatioLayoutDelegate<TARGET extends View & RatioMeasureDelegate> {
    private float ShareDataUIState;
    private float component1;
    private int component2;
    private float component3;
    private int copy;
    private boolean copydefault;
    private final TARGET equals;
    private RatioDatumMode getAsAtTimestamp;

    private int component3(int i, int i2) {
        return i;
    }

    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet) {
        return obtain(target, attributeSet, 0);
    }

    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet, int i) {
        return obtain(target, attributeSet, 0, 0);
    }

    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet, int i, int i2) {
        return new RatioLayoutDelegate(target, attributeSet, i, i2);
    }

    private RatioLayoutDelegate(TARGET target, AttributeSet attributeSet, int i, int i2) {
        this.component1 = 0.0f;
        this.ShareDataUIState = 0.0f;
        this.component3 = 0.0f;
        this.equals = target;
        TypedArray typedArrayObtainStyledAttributes = target.getContext().obtainStyledAttributes(attributeSet, R.styleable.ViewSizeCalculate, i, i2);
        this.getAsAtTimestamp = RatioDatumMode.valueOf(typedArrayObtainStyledAttributes.getInt(R.styleable.ViewSizeCalculate_datumRatio, 0));
        this.component1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewSizeCalculate_widthRatio, this.component1);
        this.ShareDataUIState = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewSizeCalculate_heightRatio, this.ShareDataUIState);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewSizeCalculate_layoutSquare, false);
        this.component3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewSizeCalculate_layoutAspectRatio, this.component3);
        typedArrayObtainStyledAttributes.recycle();
    }

    private RatioDatumMode component2(ViewGroup.LayoutParams layoutParams) {
        RatioDatumMode ratioDatumMode = this.getAsAtTimestamp;
        if (ratioDatumMode == null || ratioDatumMode == RatioDatumMode.DATUM_AUTO) {
            if (layoutParams.width > 0 || ShareDataUIState(layoutParams) || layoutParams.width == -1) {
                return RatioDatumMode.DATUM_WIDTH;
            }
            if (layoutParams.height > 0 || component1(layoutParams) || layoutParams.height == -1) {
                return RatioDatumMode.DATUM_HEIGHT;
            }
            return null;
        }
        return this.getAsAtTimestamp;
    }

    private boolean component1(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        return layoutParams2.height == 0 && layoutParams2.weight > 0.0f;
    }

    private boolean ShareDataUIState(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        return layoutParams2.width == 0 && layoutParams2.weight > 0.0f;
    }

    public final void update(int i, int i2) {
        this.copy = i;
        this.component2 = i2;
        RatioDatumMode ratioDatumModeComponent2 = component2(this.equals.getLayoutParams());
        int paddingLeft = this.equals.getPaddingLeft() + this.equals.getPaddingRight();
        int paddingTop = this.equals.getPaddingTop() + this.equals.getPaddingBottom();
        if (ratioDatumModeComponent2 == RatioDatumMode.DATUM_WIDTH) {
            int size = View.MeasureSpec.getSize(i);
            if (this.copydefault) {
                this.component2 = View.MeasureSpec.makeMeasureSpec(component3((size - paddingLeft) + paddingTop, i2), 1073741824);
                return;
            }
            float f = this.component3;
            if (f > 0.0f) {
                this.component2 = View.MeasureSpec.makeMeasureSpec(component3(Math.round(((size - paddingLeft) / f) + paddingTop), i2), 1073741824);
                return;
            }
            float f2 = this.component1;
            if (f2 > 0.0f) {
                float f3 = this.ShareDataUIState;
                if (f3 > 0.0f) {
                    this.component2 = View.MeasureSpec.makeMeasureSpec(component3(Math.round((((size - paddingLeft) / f2) * f3) + paddingTop), i2), 1073741824);
                    return;
                }
                return;
            }
            return;
        }
        if (ratioDatumModeComponent2 == RatioDatumMode.DATUM_HEIGHT) {
            int size2 = View.MeasureSpec.getSize(i2);
            if (this.copydefault) {
                this.copy = View.MeasureSpec.makeMeasureSpec(component3((size2 - paddingTop) + paddingLeft, i), 1073741824);
                return;
            }
            float f4 = this.component3;
            if (f4 > 0.0f) {
                this.copy = View.MeasureSpec.makeMeasureSpec(component3(Math.round(((size2 - paddingTop) / f4) + paddingLeft), i), 1073741824);
                return;
            }
            float f5 = this.component1;
            if (f5 > 0.0f) {
                float f6 = this.ShareDataUIState;
                if (f6 > 0.0f) {
                    this.copy = View.MeasureSpec.makeMeasureSpec(component3(Math.round((((size2 - paddingTop) / f6) * f5) + paddingLeft), i), 1073741824);
                }
            }
        }
    }

    public final int getWidthMeasureSpec() {
        return this.copy;
    }

    public final int getHeightMeasureSpec() {
        return this.component2;
    }

    private void component3() {
        this.equals.requestLayout();
    }

    public final void setRatio(RatioDatumMode ratioDatumMode, float f, float f2) {
        this.getAsAtTimestamp = ratioDatumMode;
        this.component1 = f;
        this.ShareDataUIState = f2;
        component3();
    }

    public final void setSquare(boolean z) {
        this.copydefault = z;
        component3();
    }

    public final void setAspectRatio(float f) {
        this.component3 = f;
        component3();
    }
}
