package com.huawei.digitalpayment.consumer.baselib.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import com.blankj.utilcode.util.ColorUtils;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.baselib.R;

public class StateListImageView extends RoundImageView {
    private static int component3 = 1;
    private static int copydefault;
    private final int activeTintcolor;
    private final int inactiveTintcolor;

    public StateListImageView(Context context) {
        this(context, null);
    }

    public StateListImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StateListImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.StateListImageView);
        this.activeTintcolor = typedArrayObtainStyledAttributes.getColor(R.styleable.StateListImageView_activeTintColor, ColorUtils.getColor(R.color.colorPrimary));
        this.inactiveTintcolor = typedArrayObtainStyledAttributes.getColor(R.styleable.StateListImageView_inactiveTintColor, ColorUtils.getColor(R.color.colorPlaceholderText));
        typedArrayObtainStyledAttributes.recycle();
        setActivated(isActivated());
    }

    @Override
    public void setActivated(boolean z) {
        int i = 2 % 2;
        super.setActivated(z);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int i2 = copydefault + 119;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (z) {
                int i5 = i3 + 29;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                DrawableCompat.setTint(drawable, this.activeTintcolor);
                int i7 = component3 + 27;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            } else {
                DrawableCompat.setTint(drawable, this.inactiveTintcolor);
            }
            setImageDrawable(drawable);
            int i9 = component3 + 77;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
    }
}
