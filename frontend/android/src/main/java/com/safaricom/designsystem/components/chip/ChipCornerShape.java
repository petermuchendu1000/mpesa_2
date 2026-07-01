package com.safaricom.designsystem.components.chip;

import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/components/chip/ChipCornerShape;", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(Landroidx/compose/ui/graphics/Shape;)V", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChipCornerShape {
    public static final int $stable = 0;
    private final Shape component2;

    public ChipCornerShape(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "");
        this.component2 = shape;
    }

    public ChipCornerShape(Shape shape, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RectangleShapeKt.getRectangleShape() : shape);
    }

    public final Shape getShape() {
        return this.component2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChipCornerShape() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static ChipCornerShape copy$default(ChipCornerShape chipCornerShape, Shape shape, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = chipCornerShape.component2;
        }
        return chipCornerShape.copy(shape);
    }

    public final Shape getComponent2() {
        return this.component2;
    }

    public final ChipCornerShape copy(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "");
        return new ChipCornerShape(shape);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChipCornerShape) && Intrinsics.areEqual(this.component2, ((ChipCornerShape) other).component2);
    }

    public int hashCode() {
        return this.component2.hashCode();
    }

    public String toString() {
        return "ChipCornerShape(shape=" + this.component2 + ")";
    }
}
