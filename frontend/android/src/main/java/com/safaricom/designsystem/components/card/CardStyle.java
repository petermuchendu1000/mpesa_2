package com.safaricom.designsystem.components.card;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0012J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u0015J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÇ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00100\u001a\u000201H×\u0001J\t\u00102\u001a\u000203H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/safaricom/designsystem/components/card/CardStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shadowShape", "Landroidx/compose/ui/graphics/Shape;", "hasStroke", "", "strokeColors", "", "shape", "brush", "Landroidx/compose/ui/graphics/Brush;", "<init>", "(JFLandroidx/compose/ui/graphics/Shape;ZLjava/util/List;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getElevation-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getShadowShape", "()Landroidx/compose/ui/graphics/Shape;", "getHasStroke", "()Z", "getStrokeColors", "()Ljava/util/List;", "getShape", "getBrush$annotations", "()V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "component1", "component1-0d7_KjU", "component2", "component2-D9Ej5fM", "component3", "component4", "component5", "component6", "component7", "copy", "copy-THPkMYs", "(JFLandroidx/compose/ui/graphics/Shape;ZLjava/util/List;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Brush;)Lcom/safaricom/designsystem/components/card/CardStyle;", "equals", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardStyle {
    public static final int $stable = 8;
    private final Brush ShareDataUIState;
    private final float component1;
    private final long component2;
    private final boolean component3;
    private final Shape copy;
    private final Shape copydefault;
    private final List<Color> getRequestBeneficiariesState;

    @Deprecated(message = "To be removed once deprecated BasicCard's usage has been removed")
    public static void getBrush$annotations() {
    }

    private CardStyle(long j, float f, Shape shape, boolean z, List<Color> list, Shape shape2, Brush brush) {
        Intrinsics.checkNotNullParameter(shape, "");
        Intrinsics.checkNotNullParameter(shape2, "");
        this.component2 = j;
        this.component1 = f;
        this.copydefault = shape;
        this.component3 = z;
        this.getRequestBeneficiariesState = list;
        this.copy = shape2;
        this.ShareDataUIState = brush;
    }

    public CardStyle(long j, float f, Shape shape, boolean z, List list, Shape shape2, Brush brush, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.INSTANCE.m6090getUnspecified0d7_KjU() : j, (i & 2) != 0 ? Dp.m8795constructorimpl(0) : f, (i & 4) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 8) == 0 ? z : false, (i & 16) != 0 ? null : list, (i & 32) != 0 ? RectangleShapeKt.getRectangleShape() : shape2, (i & 64) == 0 ? brush : null, null);
    }

    public final long m12478getColor0d7_KjU() {
        return this.component2;
    }

    public final float m12479getElevationD9Ej5fM() {
        return this.component1;
    }

    public final Shape getShadowShape() {
        return this.copydefault;
    }

    public final boolean getHasStroke() {
        return this.component3;
    }

    public final List<Color> getStrokeColors() {
        return this.getRequestBeneficiariesState;
    }

    public final Shape getShape() {
        return this.copy;
    }

    public final Brush getBrush() {
        return this.ShareDataUIState;
    }

    public CardStyle(long j, float f, Shape shape, boolean z, List list, Shape shape2, Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, shape, z, list, shape2, brush);
    }

    public final long getComponent2() {
        return this.component2;
    }

    public final float getComponent1() {
        return this.component1;
    }

    public final Shape getCopydefault() {
        return this.copydefault;
    }

    public final boolean getComponent3() {
        return this.component3;
    }

    public final List<Color> component5() {
        return this.getRequestBeneficiariesState;
    }

    public final Shape getCopy() {
        return this.copy;
    }

    public final Brush getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final CardStyle m12477copyTHPkMYs(long color, float elevation, Shape shadowShape, boolean hasStroke, List<Color> strokeColors, Shape shape, Brush brush) {
        Intrinsics.checkNotNullParameter(shadowShape, "");
        Intrinsics.checkNotNullParameter(shape, "");
        return new CardStyle(color, elevation, shadowShape, hasStroke, strokeColors, shape, brush, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStyle)) {
            return false;
        }
        CardStyle cardStyle = (CardStyle) other;
        return Color.m6055equalsimpl0(this.component2, cardStyle.component2) && Dp.m8800equalsimpl0(this.component1, cardStyle.component1) && Intrinsics.areEqual(this.copydefault, cardStyle.copydefault) && this.component3 == cardStyle.component3 && Intrinsics.areEqual(this.getRequestBeneficiariesState, cardStyle.getRequestBeneficiariesState) && Intrinsics.areEqual(this.copy, cardStyle.copy) && Intrinsics.areEqual(this.ShareDataUIState, cardStyle.ShareDataUIState);
    }

    public int hashCode() {
        int iM6061hashCodeimpl = Color.m6061hashCodeimpl(this.component2);
        int iM8801hashCodeimpl = Dp.m8801hashCodeimpl(this.component1);
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = Boolean.hashCode(this.component3);
        List<Color> list = this.getRequestBeneficiariesState;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = this.copy.hashCode();
        Brush brush = this.ShareDataUIState;
        return (((((((((((iM6061hashCodeimpl * 31) + iM8801hashCodeimpl) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (brush != null ? brush.hashCode() : 0);
    }

    public String toString() {
        return "CardStyle(color=" + Color.m6062toStringimpl(this.component2) + ", elevation=" + Dp.m8806toStringimpl(this.component1) + ", shadowShape=" + this.copydefault + ", hasStroke=" + this.component3 + ", strokeColors=" + this.getRequestBeneficiariesState + ", shape=" + this.copy + ", brush=" + this.ShareDataUIState + ")";
    }
}
