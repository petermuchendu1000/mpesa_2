package com.safaricom.designsystem.components.bubble;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.unit.Dp;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006 "}, d2 = {"Lcom/safaricom/designsystem/components/bubble/BubbleShadow;", "", "elevation", "Landroidx/compose/ui/unit/Dp;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "<init>", "(FJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getElevation-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getAmbientColor-0d7_KjU", "()J", "J", "getSpotColor-0d7_KjU", "component1", "component1-D9Ej5fM", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-hOCwus4", "(FJJ)Lcom/safaricom/designsystem/components/bubble/BubbleShadow;", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BubbleShadow {
    public static final int $stable = 0;
    private final float component1;
    private final long component2;
    private final long component3;

    private BubbleShadow(float f, long j, long j2) {
        this.component1 = f;
        this.component3 = j;
        this.component2 = j2;
    }

    public final float m12402getElevationD9Ej5fM() {
        return this.component1;
    }

    public BubbleShadow(float f, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j, (i & 4) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, null);
    }

    public final long m12401getAmbientColor0d7_KjU() {
        return this.component3;
    }

    public final long m12403getSpotColor0d7_KjU() {
        return this.component2;
    }

    public BubbleShadow(float f, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, j2);
    }

    public static BubbleShadow m12396copyhOCwus4$default(BubbleShadow bubbleShadow, float f, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bubbleShadow.component1;
        }
        if ((i & 2) != 0) {
            j = bubbleShadow.component3;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = bubbleShadow.component2;
        }
        return bubbleShadow.m12400copyhOCwus4(f, j3, j2);
    }

    public final float getComponent1() {
        return this.component1;
    }

    public final long getComponent3() {
        return this.component3;
    }

    public final long getComponent2() {
        return this.component2;
    }

    public final BubbleShadow m12400copyhOCwus4(float elevation, long ambientColor, long spotColor) {
        return new BubbleShadow(elevation, ambientColor, spotColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BubbleShadow)) {
            return false;
        }
        BubbleShadow bubbleShadow = (BubbleShadow) other;
        return Dp.m8800equalsimpl0(this.component1, bubbleShadow.component1) && Color.m6055equalsimpl0(this.component3, bubbleShadow.component3) && Color.m6055equalsimpl0(this.component2, bubbleShadow.component2);
    }

    public int hashCode() {
        return (((Dp.m8801hashCodeimpl(this.component1) * 31) + Color.m6061hashCodeimpl(this.component3)) * 31) + Color.m6061hashCodeimpl(this.component2);
    }

    public String toString() {
        return "BubbleShadow(elevation=" + Dp.m8806toStringimpl(this.component1) + ", ambientColor=" + Color.m6062toStringimpl(this.component3) + ", spotColor=" + Color.m6062toStringimpl(this.component2) + ")";
    }
}
