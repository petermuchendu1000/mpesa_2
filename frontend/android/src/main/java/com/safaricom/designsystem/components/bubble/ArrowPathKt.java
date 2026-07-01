package com.safaricom.designsystem.components.bubble;

import androidx.compose.ui.graphics.Path;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000\u001a(\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0000\u001aD\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0000\u001a(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0000¨\u0006\u0016"}, d2 = {"addHorizontalArrowToPath", "", "Landroidx/compose/ui/graphics/Path;", "alignment", "Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "arrowShape", "Lcom/safaricom/designsystem/components/bubble/ArrowShape;", "arrowLeft", "", "arrowRight", "arrowTop", "arrowBottom", "arrowHeight", "calculateArrowTopPosition", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/safaricom/designsystem/components/bubble/BubbleState;", "contentHeight", "density", "addVerticalArrowToPath", "arrowWidth", "calculateArrowLeftPosition", "contentWidth", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ArrowPathKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ArrowShape.values().length];
            try {
                iArr[ArrowShape.HalfTriangle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArrowShape.FullTriangle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ArrowAlignment.values().length];
            try {
                iArr2[ArrowAlignment.LeftTop.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ArrowAlignment.LeftCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ArrowAlignment.LeftBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ArrowAlignment.RightTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ArrowAlignment.RightCenter.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ArrowAlignment.RightBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ArrowAlignment.BottomLeft.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ArrowAlignment.BottomCenter.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ArrowAlignment.BottomRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ArrowAlignment.TopLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ArrowAlignment.TopCenter.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ArrowAlignment.TopRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void addHorizontalArrowToPath(Path path, ArrowAlignment arrowAlignment, ArrowShape arrowShape, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(arrowAlignment, "");
        Intrinsics.checkNotNullParameter(arrowShape, "");
        switch (WhenMappings.$EnumSwitchMapping$1[arrowAlignment.ordinal()]) {
            case 1:
                path.moveTo(f2, f3);
                int i = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i == 1) {
                    path.lineTo(f, f3);
                    path.lineTo(f2, f4);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f, f4 - (f5 / 2));
                    path.lineTo(f2, f4);
                }
                break;
            case 2:
                path.moveTo(f2, f4);
                int i2 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i2 == 1) {
                    path.lineTo(f, f3);
                    path.lineTo(f2, f3);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f, f4 - (f5 / 2));
                    path.lineTo(f2, f3);
                }
                break;
            case 3:
                path.moveTo(f2, f4);
                int i3 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i3 == 1) {
                    path.lineTo(f, f4);
                    path.lineTo(f2, f3);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f, f4 - (f5 / 2));
                    path.lineTo(f2, f3);
                }
                break;
            case 4:
                path.moveTo(f, f3);
                int i4 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i4 == 1) {
                    path.lineTo(f2, f3);
                    path.lineTo(f, f4);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f2, f4 - (f5 / 2));
                    path.lineTo(f, f4);
                }
                break;
            case 5:
                path.moveTo(f, f3);
                int i5 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i5 == 1) {
                    path.lineTo(f2, f3);
                    path.lineTo(f, f4);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f2, f4 - (f5 / 2));
                    path.lineTo(f, f4);
                }
                break;
            case 6:
                path.moveTo(f, f3);
                int i6 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i6 == 1) {
                    path.lineTo(f2, f4);
                    path.lineTo(f, f4);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f2, f4 - (f5 / 2));
                    path.lineTo(f, f4);
                }
                break;
        }
        path.close();
    }

    public static final float calculateArrowTopPosition(BubbleState bubbleState, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(bubbleState, "");
        float shareDataUIState = bubbleState.getShareDataUIState() * f3;
        if (!bubbleState.isHorizontalTopAligned()) {
            shareDataUIState = bubbleState.isHorizontalBottomAligned() ? (shareDataUIState + f2) - f : shareDataUIState + ((f2 - f) / 2.0f);
        }
        if (shareDataUIState < 0.0f) {
            shareDataUIState = 0.0f;
        }
        return shareDataUIState + f > f2 ? f2 - f : shareDataUIState;
    }

    public static final void addVerticalArrowToPath(Path path, ArrowAlignment arrowAlignment, ArrowShape arrowShape, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(arrowAlignment, "");
        Intrinsics.checkNotNullParameter(arrowShape, "");
        switch (WhenMappings.$EnumSwitchMapping$1[arrowAlignment.ordinal()]) {
            case 7:
                path.moveTo(f2, f4);
                int i = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i == 1) {
                    path.lineTo(f, f3);
                    path.lineTo(f, f4);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f2 - (f5 / 2), f3);
                    path.lineTo(f, f4);
                }
                break;
            case 8:
                path.moveTo(f2, f4);
                int i2 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i2 == 1) {
                    path.lineTo(f, f3);
                    path.lineTo(f, f4);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f2 - (f5 / 2), f3);
                    path.lineTo(f, f4);
                }
                break;
            case 9:
                path.moveTo(f2, f4);
                int i3 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i3 == 1) {
                    path.lineTo(f2, f3);
                    path.lineTo(f, f4);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f2 - (f5 / 2), f3);
                    path.lineTo(f, f4);
                }
                break;
            case 10:
                path.moveTo(f, f3);
                int i4 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i4 == 1) {
                    path.lineTo(f, f4);
                    path.lineTo(f2, f3);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f + (f5 / 2), f4);
                    path.lineTo(f2, f3);
                }
                break;
            case 11:
                path.moveTo(f, f3);
                int i5 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i5 == 1) {
                    path.lineTo(f, f4);
                    path.lineTo(f2, f3);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo(f + (f5 / 2), f4);
                    path.lineTo(f2, f3);
                }
                break;
            case 12:
                path.moveTo(f2, f3);
                int i6 = WhenMappings.$EnumSwitchMapping$0[arrowShape.ordinal()];
                if (i6 == 1) {
                    path.lineTo(f2, f4);
                    path.lineTo(f, f3);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    path.lineTo((f5 / 2) + f, f4);
                    path.lineTo(f, f3);
                }
                break;
        }
        path.close();
    }

    public static final float calculateArrowLeftPosition(BubbleState bubbleState, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(bubbleState, "");
        float component2 = bubbleState.getComponent2() * f3;
        if (!bubbleState.isVerticalLeftAligned()) {
            component2 = bubbleState.isVerticalRightAligned() ? (component2 + f2) - f : component2 + ((f2 - f) / 2.0f);
        }
        if (component2 < 0.0f) {
            component2 = 0.0f;
        }
        return component2 + f > f2 ? f2 - f : component2;
    }
}
