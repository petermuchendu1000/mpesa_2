package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.askzuri;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/askzuri/SFCAskZuriButtonShape;", "Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCAskZuriButtonShape implements Shape {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 63 % 128;

    @Override
    public Outline mo648createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutDirection, "");
        Intrinsics.checkNotNullParameter(density, "");
        float fMo746toPx0680j_4 = density.mo746toPx0680j_4(Dp.m8795constructorimpl((float) 26.5d));
        Path Path = AndroidPath_androidKt.Path();
        Path.reset();
        Path.moveTo(fMo746toPx0680j_4, 0.0f);
        Path.quadraticTo(0.0f, 0.0f, 0.0f, fMo746toPx0680j_4);
        long j = -1;
        int i2 = (int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & size);
        Path.lineTo(0.0f, Float.intBitsToFloat(i2) - fMo746toPx0680j_4);
        Path.quadraticTo(0.0f, Float.intBitsToFloat(i2), fMo746toPx0680j_4, Float.intBitsToFloat(i2));
        int i3 = (int) (size >> 32);
        Path.lineTo(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
        Path.lineTo(Float.intBitsToFloat(i3), 0.0f);
        Path.lineTo(fMo746toPx0680j_4, 0.0f);
        Path.close();
        Outline.Generic generic = new Outline.Generic(Path);
        int i4 = component1 + 41;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return generic;
    }

    static {
        if (63 % 2 == 0) {
            throw null;
        }
    }
}
