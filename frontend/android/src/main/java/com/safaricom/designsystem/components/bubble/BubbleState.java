package com.safaricom.designsystem.components.bubble;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import com.iap.ac.android.acs.operation.log.LogConstants;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u00107\u001a\u00020\u000eJ\u0006\u00108\u001a\u00020\u000eJ\u0006\u00109\u001a\u00020\u000eJ\u0006\u0010:\u001a\u00020\u000eJ\u0006\u0010;\u001a\u00020\u000eJ\u0006\u0010<\u001a\u00020\u000eJ\u0006\u0010=\u001a\u00020\u000eJ\u0006\u0010>\u001a\u00020\u000eJ\u0006\u0010?\u001a\u00020\u000eJ\u0006\u0010@\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\f\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0018R\u0011\u0010(\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0011\u0010*\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0018R\u0011\u0010,\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R+\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020/8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006A"}, d2 = {"Lcom/safaricom/designsystem/components/bubble/BubbleState;", "", CdpConstants.CONTENT_CORNER_RADIUS, "Lcom/safaricom/designsystem/components/bubble/BubbleCornerRadius;", "alignment", "Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "arrowShape", "Lcom/safaricom/designsystem/components/bubble/ArrowShape;", "arrowOffsetX", "Landroidx/compose/ui/unit/Dp;", "arrowOffsetY", "arrowWidth", "arrowHeight", "drawArrow", "", "<init>", "(Lcom/safaricom/designsystem/components/bubble/BubbleCornerRadius;Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;Lcom/safaricom/designsystem/components/bubble/ArrowShape;FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCornerRadius", "()Lcom/safaricom/designsystem/components/bubble/BubbleCornerRadius;", "getAlignment", "()Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "getArrowShape", "()Lcom/safaricom/designsystem/components/bubble/ArrowShape;", "getArrowOffsetX-D9Ej5fM", "()F", LogConstants.RESULT_FALSE, "getArrowOffsetY-D9Ej5fM", "getArrowWidth-D9Ej5fM", "getArrowHeight-D9Ej5fM", "getDrawArrow", "()Z", "arrowRect", "Lcom/safaricom/designsystem/components/bubble/BubbleRect;", "getArrowRect", "()Lcom/safaricom/designsystem/components/bubble/BubbleRect;", "setArrowRect", "(Lcom/safaricom/designsystem/components/bubble/BubbleRect;)V", "arrowTop", "", "getArrowTop", "arrowBottom", "getArrowBottom", "arrowLeft", "getArrowLeft", "arrowRight", "getArrowRight", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "arrowTip", "getArrowTip-F1C5BW0", "()J", "setArrowTip-k-4lQ0M", "(J)V", "arrowTip$delegate", "Landroidx/compose/runtime/MutableState;", "isHorizontalLeftAligned", "isHorizontalRightAligned", "isHorizontalTopAligned", "isHorizontalBottomAligned", "isArrowHorizontallyPositioned", "isVerticalBottomAligned", "isVerticalTopAligned", "isVerticalLeftAligned", "isVerticalRightAligned", "isArrowVerticallyPositioned", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BubbleState {
    public static final int $stable = 0;
    private final float ShareDataUIState;
    private BubbleRect component1;
    private final float component2;
    private final float component3;
    private final ArrowShape component4;
    private final MutableState copy;
    private final ArrowAlignment copydefault;
    private final float equals;
    private final BubbleCornerRadius getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;

    private BubbleState(BubbleCornerRadius bubbleCornerRadius, ArrowAlignment arrowAlignment, ArrowShape arrowShape, float f, float f2, float f3, float f4, boolean z) {
        Intrinsics.checkNotNullParameter(bubbleCornerRadius, "");
        Intrinsics.checkNotNullParameter(arrowAlignment, "");
        Intrinsics.checkNotNullParameter(arrowShape, "");
        this.getAsAtTimestamp = bubbleCornerRadius;
        this.copydefault = arrowAlignment;
        this.component4 = arrowShape;
        this.component2 = f;
        this.ShareDataUIState = f2;
        this.equals = f3;
        this.component3 = f4;
        this.getRequestBeneficiariesState = z;
        this.component1 = BubbleRect.INSTANCE.getZero();
        this.copy = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m5765boximpl(Offset.INSTANCE.m5791getUnspecifiedF1C5BW0()), null, 2, null);
    }

    public final BubbleCornerRadius getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final ArrowAlignment getCopydefault() {
        return this.copydefault;
    }

    public final ArrowShape getComponent4() {
        return this.component4;
    }

    public final float getComponent2() {
        return this.component2;
    }

    public final float getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final float getEquals() {
        return this.equals;
    }

    public final float getComponent3() {
        return this.component3;
    }

    public final boolean getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final BubbleRect getComponent1() {
        return this.component1;
    }

    public final void setArrowRect(BubbleRect bubbleRect) {
        Intrinsics.checkNotNullParameter(bubbleRect, "");
        this.component1 = bubbleRect;
    }

    public final float getArrowTop() {
        return this.component1.getTop();
    }

    public final float getArrowBottom() {
        return this.component1.getBottom();
    }

    public final float getArrowLeft() {
        return this.component1.getLeft();
    }

    public final float getArrowRight() {
        return this.component1.getRight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m12407getArrowTipF1C5BW0() {
        return ((Offset) this.copy.getValue()).m5786unboximpl();
    }

    public final void m12409setArrowTipk4lQ0M(long j) {
        this.copy.setValue(Offset.m5765boximpl(j));
    }

    public final boolean isHorizontalLeftAligned() {
        return this.copydefault == ArrowAlignment.LeftTop || this.copydefault == ArrowAlignment.LeftBottom || this.copydefault == ArrowAlignment.LeftCenter;
    }

    public final boolean isHorizontalRightAligned() {
        return this.copydefault == ArrowAlignment.RightTop || this.copydefault == ArrowAlignment.RightBottom || this.copydefault == ArrowAlignment.RightCenter;
    }

    public final boolean isHorizontalTopAligned() {
        return this.copydefault == ArrowAlignment.LeftTop || this.copydefault == ArrowAlignment.RightTop;
    }

    public final boolean isHorizontalBottomAligned() {
        return this.copydefault == ArrowAlignment.LeftBottom || this.copydefault == ArrowAlignment.RightBottom;
    }

    public final boolean isArrowHorizontallyPositioned() {
        return isHorizontalLeftAligned() || isHorizontalRightAligned();
    }

    public final boolean isVerticalBottomAligned() {
        return this.copydefault == ArrowAlignment.BottomLeft || this.copydefault == ArrowAlignment.BottomRight || this.copydefault == ArrowAlignment.BottomCenter;
    }

    public final boolean isVerticalTopAligned() {
        return this.copydefault == ArrowAlignment.TopLeft || this.copydefault == ArrowAlignment.TopRight || this.copydefault == ArrowAlignment.TopCenter;
    }

    public final boolean isVerticalLeftAligned() {
        return this.copydefault == ArrowAlignment.BottomLeft || this.copydefault == ArrowAlignment.TopLeft;
    }

    public final boolean isVerticalRightAligned() {
        return this.copydefault == ArrowAlignment.BottomRight || this.copydefault == ArrowAlignment.TopRight;
    }

    public final boolean isArrowVerticallyPositioned() {
        return isVerticalBottomAligned() || isVerticalTopAligned();
    }

    public BubbleState(BubbleCornerRadius bubbleCornerRadius, ArrowAlignment arrowAlignment, ArrowShape arrowShape, float f, float f2, float f3, float f4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BubbleCornerRadius bubbleCornerRadius2;
        if ((i & 1) != 0) {
            float f5 = 8;
            bubbleCornerRadius2 = new BubbleCornerRadius(Dp.m8795constructorimpl(f5), Dp.m8795constructorimpl(f5), Dp.m8795constructorimpl(f5), Dp.m8795constructorimpl(f5), null);
        } else {
            bubbleCornerRadius2 = bubbleCornerRadius;
        }
        this(bubbleCornerRadius2, (i & 2) != 0 ? ArrowAlignment.None : arrowAlignment, (i & 4) != 0 ? ArrowShape.HalfTriangle : arrowShape, (i & 8) != 0 ? Dp.m8795constructorimpl(0) : f, (i & 16) != 0 ? Dp.m8795constructorimpl(0) : f2, (i & 32) != 0 ? Dp.m8795constructorimpl(14) : f3, (i & 64) != 0 ? Dp.m8795constructorimpl(14) : f4, (i & 128) != 0 ? true : z, null);
    }

    public BubbleState(BubbleCornerRadius bubbleCornerRadius, ArrowAlignment arrowAlignment, ArrowShape arrowShape, float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(bubbleCornerRadius, arrowAlignment, arrowShape, f, f2, f3, f4, z);
    }
}
