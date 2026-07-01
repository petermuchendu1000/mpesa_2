package com.huawei.digitalpayment.consumer.baselib.widget.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class PaymentTypefaceSpan extends MetricAffectingSpan {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Typeface ShareDataUIState;

    public PaymentTypefaceSpan(Typeface typeface) {
        this.ShareDataUIState = typeface;
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component2(textPaint);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = copydefault + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component2(textPaint);
        int i4 = component2 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
    }

    private void component2(Paint paint) {
        int style;
        int i = 2 % 2;
        Typeface typeface = paint.getTypeface();
        if (typeface != null) {
            int i2 = copydefault + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            style = typeface.getStyle();
        } else {
            int i4 = copydefault + 73;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            style = 0;
        }
        int i6 = style & (~this.ShareDataUIState.getStyle());
        if ((i6 & 1) != 0) {
            int i7 = component2 + 13;
            copydefault = i7 % 128;
            paint.setFakeBoldText(i7 % 2 != 0);
            int i8 = copydefault + 109;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i6 & 2) != 0) {
            int i10 = copydefault + 39;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(this.ShareDataUIState);
    }
}
