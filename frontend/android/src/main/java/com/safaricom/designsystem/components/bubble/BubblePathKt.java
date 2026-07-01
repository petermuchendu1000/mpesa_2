package com.safaricom.designsystem.components.bubble;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Path;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"addRoundedBubbleRect", "", "Landroidx/compose/ui/graphics/Path;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/safaricom/designsystem/components/bubble/BubbleState;", "contentRect", "Lcom/safaricom/designsystem/components/bubble/BubbleRect;", "density", "", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BubblePathKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArrowAlignment.values().length];
            try {
                iArr[ArrowAlignment.LeftTop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArrowAlignment.LeftCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArrowAlignment.LeftBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ArrowAlignment.RightTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ArrowAlignment.RightCenter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ArrowAlignment.RightBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ArrowAlignment.BottomLeft.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ArrowAlignment.BottomCenter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ArrowAlignment.BottomRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ArrowAlignment.TopLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ArrowAlignment.TopCenter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ArrowAlignment.TopRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addRoundedBubbleRect(Path path, BubbleState bubbleState, BubbleRect bubbleRect, float f) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(bubbleState, "");
        Intrinsics.checkNotNullParameter(bubbleRect, "");
        ArrowAlignment copydefault = bubbleState.getCopydefault();
        BubbleCornerRadius getAsAtTimestamp = bubbleState.getGetAsAtTimestamp();
        float width = bubbleRect.getWidth();
        float height = bubbleRect.getHeight();
        float left = bubbleRect.getLeft();
        float right = bubbleRect.getRight();
        float top = bubbleRect.getTop();
        float bottom = bubbleRect.getBottom();
        float fCoerceAtMost = RangesKt.coerceAtMost(width, height) / 2.0f;
        boolean getRequestBeneficiariesState = bubbleState.getGetRequestBeneficiariesState();
        float component1 = getAsAtTimestamp.getComponent1() * RangesKt.coerceAtMost(f, fCoerceAtMost);
        float component3 = getAsAtTimestamp.getComponent3() * RangesKt.coerceAtMost(f, fCoerceAtMost);
        float component2 = getAsAtTimestamp.getComponent2() * RangesKt.coerceAtMost(f, fCoerceAtMost);
        float copydefault2 = getAsAtTimestamp.getCopydefault() * RangesKt.coerceAtMost(f, fCoerceAtMost);
        float arrowTop = bubbleState.getArrowTop();
        float arrowBottom = bubbleState.getArrowBottom();
        float arrowLeft = bubbleState.getArrowLeft();
        float arrowRight = bubbleState.getArrowRight();
        if (getRequestBeneficiariesState) {
            switch (WhenMappings.$EnumSwitchMapping$0[copydefault.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    component1 = Math.min(arrowTop, component1);
                    component2 = Math.min(component2, height - arrowBottom);
                    break;
                case 4:
                case 5:
                case 6:
                    component3 = Math.min(arrowTop, component3);
                    copydefault2 = Math.min(copydefault2, height - arrowBottom);
                    break;
                case 7:
                case 8:
                case 9:
                    component2 = Math.min(arrowLeft, component2);
                    copydefault2 = Math.min(copydefault2, width - arrowRight);
                    break;
                case 10:
                case 11:
                case 12:
                    component1 = Math.min(arrowLeft, component1);
                    component3 = Math.min(component3, width - arrowRight);
                    break;
            }
        }
        Rect rect = new Rect(left, top, right, bottom);
        long j = -1;
        long jM5730constructorimpl = CornerRadius.m5730constructorimpl((((long) Float.floatToRawIntBits(component1)) << 32) | (((long) Float.floatToRawIntBits(component1)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        long j2 = -1;
        long jM5730constructorimpl2 = CornerRadius.m5730constructorimpl((((long) Float.floatToRawIntBits(component3)) << 32) | (((long) Float.floatToRawIntBits(component3)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        long j3 = -1;
        long j4 = -1;
        Path.addRoundRect$default(path, RoundRectKt.m5828RoundRectZAM2FJo(rect, jM5730constructorimpl, jM5730constructorimpl2, CornerRadius.m5730constructorimpl((((long) Float.floatToRawIntBits(copydefault2)) << 32) | (((long) Float.floatToRawIntBits(copydefault2)) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))))), CornerRadius.m5730constructorimpl((((long) Float.floatToRawIntBits(component2)) << 32) | (((long) Float.floatToRawIntBits(component2)) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)))))), null, 2, null);
    }
}
