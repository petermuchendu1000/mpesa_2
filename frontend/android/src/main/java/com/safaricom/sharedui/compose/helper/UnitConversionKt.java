package com.safaricom.sharedui.compose.helper;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"pxToDp", "Landroidx/compose/ui/unit/Dp;", "density", "Landroidx/compose/ui/unit/Density;", "px", "", "(Landroidx/compose/ui/unit/Density;F)F", "dpToPx", "dp", "dpToPx-3ABfNKs", "SharedUiCompose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UnitConversionKt {
    public static final float pxToDp(Density density, float f) {
        Intrinsics.checkNotNullParameter(density, "");
        return density.mo742toDpu2uoSUM(f);
    }

    public static final float m12828dpToPx3ABfNKs(Density density, float f) {
        Intrinsics.checkNotNullParameter(density, "");
        return density.mo746toPx0680j_4(f);
    }
}
