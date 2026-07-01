package com.huawei.digitalpayment.consumer.baselib.widget.imageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class RatioImageView extends AppCompatImageView {
    private static int component2 = 0;
    private static int component3 = 1;

    public RatioImageView(Context context) {
        super(context);
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size;
        float intrinsicHeight;
        int i3 = 2 % 2;
        int i4 = component2 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if (getDrawable() == null) {
            super.onMeasure(i, i2);
            return;
        }
        int i6 = component2 + 81;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            size = View.MeasureSpec.getSize(i);
            intrinsicHeight = (size % r1.getIntrinsicHeight()) - r1.getIntrinsicWidth();
        } else {
            size = View.MeasureSpec.getSize(i);
            intrinsicHeight = (size * r1.getIntrinsicHeight()) / r1.getIntrinsicWidth();
        }
        setMeasuredDimension(size, (int) Math.ceil(intrinsicHeight));
        int i7 = component3 + 17;
        component2 = i7 % 128;
        int i8 = i7 % 2;
    }
}
