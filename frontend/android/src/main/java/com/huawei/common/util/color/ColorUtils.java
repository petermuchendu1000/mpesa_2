package com.huawei.common.util.color;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/huawei/common/util/color/ColorUtils;", "", "<init>", "()V", "parseColor", "", "color", "", "defaultColor", "withAlpha", "alpha", "", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ColorUtils {
    public static final ColorUtils INSTANCE = new ColorUtils();

    private ColorUtils() {
    }

    public final int parseColor(String color, int defaultColor) {
        Intrinsics.checkNotNullParameter(color, "");
        try {
            return Color.parseColor(color);
        } catch (Exception unused) {
            return com.blankj.utilcode.util.ColorUtils.getColor(defaultColor);
        }
    }

    public final int withAlpha(int alpha, int color) {
        return Color.argb(alpha, Color.red(color), Color.green(color), Color.blue(color));
    }

    public final int withAlpha(float alpha, int color) {
        return withAlpha((int) (alpha * 255), color);
    }
}
