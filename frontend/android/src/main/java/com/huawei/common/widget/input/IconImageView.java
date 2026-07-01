package com.huawei.common.widget.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class IconImageView extends AppCompatImageView {
    public IconImageView(Context context) {
        super(context);
    }

    public IconImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IconImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override
    public void setImageResource(int i) {
        if (i == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setImageResource(i);
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setImageDrawable(drawable);
    }
}
