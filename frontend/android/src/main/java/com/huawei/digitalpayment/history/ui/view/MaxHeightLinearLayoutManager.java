package com.huawei.digitalpayment.history.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

public class MaxHeightLinearLayoutManager extends LinearLayoutManager {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private int component2;

    public MaxHeightLinearLayoutManager(Context context) {
        super(context);
    }

    public MaxHeightLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public MaxHeightLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public int getMaxHeight() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.component2;
        int i6 = i3 + 85;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        this.component2 = i;
        int i6 = i3 + 63;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setMeasuredDimension(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 93;
        int i5 = i4 % 128;
        copydefault = i5;
        int i6 = i4 % 2;
        int i7 = this.component2;
        if (i7 == 0) {
            int i8 = i5 + 17;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                super.setMeasuredDimension(i, i2);
                int i9 = 96 / 0;
            } else {
                super.setMeasuredDimension(i, i2);
            }
        } else {
            super.setMeasuredDimension(i, Math.min(i2, i7));
        }
        int i10 = copydefault + 89;
        ShareDataUIState = i10 % 128;
        int i11 = i10 % 2;
    }
}
