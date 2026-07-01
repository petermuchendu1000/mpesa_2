package com.huawei.common.util.drawable;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.ColorUtils;

public class DrawableUtils {
    public static Drawable getDrawableWithColor(Context context, int i, int i2) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable != null) {
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
        return drawable;
    }

    public static Drawable getDrawableWithColorId(Context context, int i, int i2) {
        return getDrawableWithColor(context, i, ColorUtils.getColor(i2));
    }
}
