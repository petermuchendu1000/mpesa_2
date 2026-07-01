package com.huawei.digitalpayment.checkout.ui.view.banner;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.digitalpayment.checkout.ui.view.banner.RatioMeasureDelegate;
import com.huawei.digitalpayment.checkoutModule.R;

public final class RatioLayoutDelegate<TARGET extends View & RatioMeasureDelegate> {
    private static int component4 = 0;
    private static int copy = 1;
    private float ShareDataUIState;
    private int component1;
    private float component2;
    private float component3;
    private boolean copydefault;
    private final TARGET equals;
    private RatioDatumMode getAsAtTimestamp;
    private int getRequestBeneficiariesState;

    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = copy + 25;
        component4 = i2 % 128;
        RatioLayoutDelegate ratioLayoutDelegateObtain = i2 % 2 != 0 ? obtain(target, attributeSet, 1) : obtain(target, attributeSet, 0);
        int i3 = component4 + 63;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
        return ratioLayoutDelegateObtain;
    }

    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 117;
        copy = i3 % 128;
        int i4 = i3 % 2;
        RatioLayoutDelegate ratioLayoutDelegateObtain = obtain(target, attributeSet, 0, 0);
        int i5 = component4 + 87;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return ratioLayoutDelegateObtain;
    }

    public static <TARGET extends View & RatioMeasureDelegate> RatioLayoutDelegate obtain(TARGET target, AttributeSet attributeSet, int i, int i2) {
        int i3 = 2 % 2;
        RatioLayoutDelegate ratioLayoutDelegate = new RatioLayoutDelegate(target, attributeSet, i, i2);
        int i4 = copy + 53;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return ratioLayoutDelegate;
    }

    private RatioLayoutDelegate(TARGET target, AttributeSet attributeSet, int i, int i2) {
        this.equals = target;
        TypedArray typedArrayObtainStyledAttributes = target.getContext().obtainStyledAttributes(attributeSet, R.styleable.ViewSizeCalculate, i, i2);
        this.getAsAtTimestamp = RatioDatumMode.valueOf(typedArrayObtainStyledAttributes.getInt(R.styleable.ViewSizeCalculate_datumRatio, 0));
        this.ShareDataUIState = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewSizeCalculate_widthRatio, this.ShareDataUIState);
        this.component3 = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewSizeCalculate_heightRatio, this.component3);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewSizeCalculate_layoutSquare, false);
        this.component2 = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewSizeCalculate_layoutAspectRatio, this.component2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private RatioDatumMode copydefault(ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        RatioDatumMode ratioDatumMode = this.getAsAtTimestamp;
        Object obj = null;
        if (ratioDatumMode != null) {
            int i2 = copy + 111;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                RatioDatumMode ratioDatumMode2 = RatioDatumMode.DATUM_AUTO;
                obj.hashCode();
                throw null;
            }
            if (ratioDatumMode != RatioDatumMode.DATUM_AUTO) {
                RatioDatumMode ratioDatumMode3 = this.getAsAtTimestamp;
                int i3 = copy + 41;
                component4 = i3 % 128;
                if (i3 % 2 == 0) {
                    return ratioDatumMode3;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (layoutParams.width <= 0) {
            int i4 = copy + 75;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                component2(layoutParams);
                throw null;
            }
            if (!component2(layoutParams) && layoutParams.width != -1) {
                if (layoutParams.height > 0 || component1(layoutParams) || layoutParams.height == -1) {
                    return RatioDatumMode.DATUM_HEIGHT;
                }
                return null;
            }
        }
        return RatioDatumMode.DATUM_WIDTH;
    }

    private boolean component1(ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = copy + 109;
        component4 = i2 % 128;
        if (i2 % 2 == 0 ? !(layoutParams instanceof LinearLayout.LayoutParams) : (!(layoutParams instanceof LinearLayout.LayoutParams))) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2.height == 0) {
            int i3 = component4 + 43;
            copy = i3 % 128;
            if (i3 % 2 != 0 ? layoutParams2.weight > 0.0f : layoutParams2.weight > 2.0f) {
                int i4 = copy + 71;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    private boolean component2(ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2.width != 0 || layoutParams2.weight <= 0.0f) {
                return false;
            }
            int i2 = copy + 57;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = copy + 3;
        component4 = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[PHI: r9
  0x005b: PHI (r9v11 int) = (r9v10 int), (r9v40 int) binds: [B:10:0x0059, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[PHI: r9
  0x0077: PHI (r9v21 int) = (r9v10 int), (r9v40 int) binds: [B:10:0x0059, B:7:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.banner.RatioLayoutDelegate.update(int, int):void");
    }

    public final int getWidthMeasureSpec() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 39;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getRequestBeneficiariesState;
        int i6 = i2 + 51;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getHeightMeasureSpec() {
        int i = 2 % 2;
        int i2 = copy + 11;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    private void component1() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.equals.requestLayout();
        int i4 = component4 + 39;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void setRatio(RatioDatumMode ratioDatumMode, float f, float f2) {
        int i = 2 % 2;
        int i2 = component4 + 99;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.getAsAtTimestamp = ratioDatumMode;
        this.ShareDataUIState = f;
        this.component3 = f2;
        component1();
        int i4 = component4 + 53;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    public final void setSquare(boolean z) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault = z;
        component1();
        int i4 = component4 + 101;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setAspectRatio(float f) {
        int i = 2 % 2;
        int i2 = copy + 29;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            this.component2 = f;
            component1();
        } else {
            this.component2 = f;
            component1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private int component2(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component4 + 33;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 113;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return i;
    }
}
