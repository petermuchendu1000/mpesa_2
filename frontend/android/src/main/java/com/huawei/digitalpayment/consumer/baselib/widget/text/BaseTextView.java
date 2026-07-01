package com.huawei.digitalpayment.consumer.baselib.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.R;

public class BaseTextView extends RoundTextView {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public BaseTextView(Context context) {
        this(context, null);
    }

    public BaseTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initTypeFace(context, attributeSet, i);
    }

    private void initTypeFace(Context context, AttributeSet attributeSet, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextView);
        TypefaceManager.INSTANCE.setTextStyle(this, typedArrayObtainStyledAttributes.getInt(R.styleable.TextView_text_style, 0));
        typedArrayObtainStyledAttributes.recycle();
        int i5 = component2 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
    }
}
