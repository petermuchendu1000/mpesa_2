package com.huawei.digitalpayment.consumer.sfcui.reportfraud.components;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/components/TicketCardShape;", "Landroidx/compose/ui/graphics/Shape;", "radius", "", "offsetY", "<init>", "(FF)V", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketCardShape implements Shape {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 15 % 128;
    private static int component2 = 0;
    private static int equals = 1;
    private final float component3;
    private final float copydefault;

    public TicketCardShape(float f, float f2) {
        this.component3 = f;
        this.copydefault = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TicketCardShape(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 23;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f = 15.0f;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 67;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            f2 = 0.45f;
        }
        this(f, f2);
    }

    @Override
    public Outline mo648createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutDirection, "");
        Intrinsics.checkNotNullParameter(density, "");
        Path Path = AndroidPath_androidKt.Path();
        long j = -1;
        int i2 = (int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & size);
        float fIntBitsToFloat = Float.intBitsToFloat(i2) * this.copydefault;
        Path.moveTo(0.0f, 0.0f);
        int i3 = (int) (size >> 32);
        Path.lineTo(Float.intBitsToFloat(i3), 0.0f);
        Path.lineTo(Float.intBitsToFloat(i3), fIntBitsToFloat - this.component3);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3);
        float f = this.component3;
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        float f2 = this.component3;
        Path.arcTo(new Rect(fIntBitsToFloat2 - f, fIntBitsToFloat - f, fIntBitsToFloat3 + f2, f2 + fIntBitsToFloat), -90.0f, -180.0f, false);
        Path.lineTo(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2));
        Path.lineTo(0.0f, Float.intBitsToFloat(i2));
        Path.lineTo(0.0f, this.component3 + fIntBitsToFloat);
        float f3 = this.component3;
        Path.arcTo(new Rect(-f3, fIntBitsToFloat - f3, f3, fIntBitsToFloat + f3), 90.0f, -180.0f, false);
        Path.close();
        Outline.Generic generic = new Outline.Generic(Path);
        int i4 = ShareDataUIState + 17;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return generic;
    }

    static {
        if (15 % 2 == 0) {
            int i = 72 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TicketCardShape() {
        float f = 0.0f;
        this(f, f, 3, null);
    }
}
