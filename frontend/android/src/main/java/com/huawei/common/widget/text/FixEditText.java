package com.huawei.common.widget.text;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;

public class FixEditText extends AppCompatEditText {
    public FixEditText(Context context) {
        super(context);
    }

    public FixEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.onTouchEvent(motionEvent);
    }

    @Override
    public Editable getText() {
        Editable text = super.getText();
        return text == null ? new SpannableStringBuilder() : text;
    }
}
