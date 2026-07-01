package com.safaricom.sharedui.compose.utils;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"calculateHeight", "Landroidx/compose/ui/unit/Dp;", "itemsCount", "", "itemsPerRow", "itemHeight", "verticalPadding", "calculateHeight-4j6BHR0", "(IIFF)F", "SharedUiCompose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LayoutUtilsKt {
    public static final float m12849calculateHeight4j6BHR0(int i, int i2, float f, float f2) {
        return Dp.m8795constructorimpl(Dp.m8795constructorimpl(f * ((int) Math.ceil(((double) i) / ((double) i2)))) + Dp.m8795constructorimpl(f2 * (r2 - 1)));
    }
}
