package com.safaricom.designsystem.components.bubble;

import androidx.compose.ui.unit.Dp;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/safaricom/designsystem/components/bubble/BubbleCornerRadius;", "", "topLeft", "Landroidx/compose/ui/unit/Dp;", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTopLeft-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getTopRight-D9Ej5fM", "getBottomLeft-D9Ej5fM", "getBottomRight-D9Ej5fM", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BubbleCornerRadius {
    public static final int $stable = 0;
    private final float component1;
    private final float component2;
    private final float component3;
    private final float copydefault;

    private BubbleCornerRadius(float f, float f2, float f3, float f4) {
        this.component1 = f;
        this.component3 = f2;
        this.component2 = f3;
        this.copydefault = f4;
    }

    public final float getComponent1() {
        return this.component1;
    }

    public final float getComponent3() {
        return this.component3;
    }

    public final float getComponent2() {
        return this.component2;
    }

    public final float getCopydefault() {
        return this.copydefault;
    }

    public BubbleCornerRadius(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8795constructorimpl(0) : f, (i & 2) != 0 ? Dp.m8795constructorimpl(0) : f2, (i & 4) != 0 ? Dp.m8795constructorimpl(0) : f3, (i & 8) != 0 ? Dp.m8795constructorimpl(0) : f4, null);
    }

    public BubbleCornerRadius(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}
