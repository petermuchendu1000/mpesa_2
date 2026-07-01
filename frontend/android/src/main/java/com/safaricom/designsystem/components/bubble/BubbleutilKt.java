package com.safaricom.designsystem.components.bubble;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005\u001a(\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0005H\u0000\u001aC\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"getArrowRect", "Lcom/safaricom/designsystem/components/bubble/BubbleRect;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/safaricom/designsystem/components/bubble/BubbleState;", "arrowWidth", "", "arrowHeight", "density", "contentWidth", "contentHeight", "getContentRect", "bubbleState", "width", "", "height", "addRoundedRect", "", "Landroidx/compose/ui/graphics/Path;", "radiusTopLeft", "radiusTopRight", "radiusBottomRight", "radiusBottomLeft", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "addRoundedRect-Cl_7yfc", "(Landroidx/compose/ui/graphics/Path;FFFFJJ)V", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BubbleutilKt {
    public static final BubbleRect getArrowRect(BubbleState bubbleState, float f, float f2, float f3, float f4, float f5) {
        float f6;
        Intrinsics.checkNotNullParameter(bubbleState, "");
        if (bubbleState.isArrowHorizontallyPositioned()) {
            float fCalculateArrowTopPosition = ArrowPathKt.calculateArrowTopPosition(bubbleState, f2, f5, f3);
            f6 = bubbleState.isHorizontalLeftAligned() ? 0.0f : f4 - f;
            return new BubbleRect(f6, fCalculateArrowTopPosition, f + f6, f2 + fCalculateArrowTopPosition);
        }
        float fCalculateArrowLeftPosition = ArrowPathKt.calculateArrowLeftPosition(bubbleState, f, f4, f3);
        f6 = bubbleState.isVerticalBottomAligned() ? f5 - f2 : 0.0f;
        return new BubbleRect(fCalculateArrowLeftPosition, f6, f + fCalculateArrowLeftPosition, f2 + f6);
    }

    public static final BubbleRect getContentRect(BubbleState bubbleState, int i, int i2, float f) {
        BubbleRect bubbleRect;
        Intrinsics.checkNotNullParameter(bubbleState, "");
        boolean zIsHorizontalRightAligned = bubbleState.isHorizontalRightAligned();
        boolean zIsHorizontalLeftAligned = bubbleState.isHorizontalLeftAligned();
        boolean zIsVerticalBottomAligned = bubbleState.isVerticalBottomAligned();
        boolean zIsVerticalTopAligned = bubbleState.isVerticalTopAligned();
        float equals = bubbleState.getEquals() * f;
        float component3 = bubbleState.getComponent3() * f;
        if (zIsHorizontalLeftAligned) {
            return new BubbleRect(equals, 0.0f, i, i2);
        }
        if (zIsHorizontalRightAligned) {
            return new BubbleRect(0.0f, 0.0f, i - equals, i2);
        }
        if (zIsVerticalBottomAligned) {
            bubbleRect = new BubbleRect(0.0f, 0.0f, i, i2 - component3);
        } else if (zIsVerticalTopAligned) {
            bubbleRect = new BubbleRect(0.0f, component3, i, i2);
        } else {
            return new BubbleRect(0.0f, 0.0f, i, i2);
        }
        return bubbleRect;
    }

    public static final void m12412addRoundedRectCl_7yfc(Path path, float f, float f2, float f3, float f4, long j, long j2) {
        Intrinsics.checkNotNullParameter(path, "");
        float f5 = 2;
        float f6 = f * f5;
        float f7 = f2 * f5;
        float f8 = f3 * f5;
        float f9 = f5 * f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        long j3 = -1;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))));
        int i = (int) (j >> 32);
        long j4 = -1;
        int i2 = (int) (j & ((j4 - ((j4 >> 63) << 32)) | (((long) 0) << 32)));
        path.arcTo(new Rect(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + f6, Float.intBitsToFloat(i2) + f6), 180.0f, 90.0f, false);
        path.lineTo((Float.intBitsToFloat(i) + fIntBitsToFloat) - f7, Float.intBitsToFloat(i2));
        path.arcTo(new Rect((Float.intBitsToFloat(i) + fIntBitsToFloat) - f7, Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + fIntBitsToFloat, Float.intBitsToFloat(i2) + f7), -90.0f, 90.0f, false);
        path.lineTo(Float.intBitsToFloat(i) + fIntBitsToFloat, (Float.intBitsToFloat(i2) + fIntBitsToFloat2) - f8);
        path.arcTo(new Rect((Float.intBitsToFloat(i) + fIntBitsToFloat) - f8, (Float.intBitsToFloat(i2) + fIntBitsToFloat2) - f8, Float.intBitsToFloat(i) + fIntBitsToFloat, Float.intBitsToFloat(i2) + fIntBitsToFloat2), 0.0f, 90.0f, false);
        path.lineTo(Float.intBitsToFloat(i) + f9, Float.intBitsToFloat(i2) + fIntBitsToFloat2);
        path.arcTo(new Rect(Float.intBitsToFloat(i), (Float.intBitsToFloat(i2) + fIntBitsToFloat2) - f9, Float.intBitsToFloat(i) + f9, Float.intBitsToFloat(i2) + fIntBitsToFloat2), 90.0f, 90.0f, false);
        path.lineTo(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + f6);
        path.close();
    }
}
