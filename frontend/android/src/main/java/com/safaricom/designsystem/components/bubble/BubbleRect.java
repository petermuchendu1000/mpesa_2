package com.safaricom.designsystem.components.bubble;

import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/safaricom/designsystem/components/bubble/BubbleRect;", "", "left", "", "top", "right", ThemeConstants.INDICA_POSITION_BOTTOM, "<init>", "(FFFF)V", "getLeft", "()F", "getTop", "getRight", "getBottom", "height", "getHeight", "width", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BubbleRect {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static final BubbleRect ShareDataUIState = new BubbleRect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float component1;
    private final float component2;
    private final float component3;
    private final float copydefault;

    public BubbleRect(float f, float f2, float f3, float f4) {
        this.component1 = f;
        this.component3 = f2;
        this.copydefault = f3;
        this.component2 = f4;
    }

    public BubbleRect(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final float getLeft() {
        return this.component1;
    }

    public final float getTop() {
        return this.component3;
    }

    public final float getRight() {
        return this.copydefault;
    }

    public final float getBottom() {
        return this.component2;
    }

    public final float getHeight() {
        return this.component2 - this.component3;
    }

    public final float getWidth() {
        return this.copydefault - this.component1;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/safaricom/designsystem/components/bubble/BubbleRect$Companion;", "", "<init>", "()V", "Zero", "Lcom/safaricom/designsystem/components/bubble/BubbleRect;", "getZero$annotations", "getZero", "()Lcom/safaricom/designsystem/components/bubble/BubbleRect;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static void getZero$annotations() {
        }

        private Companion() {
        }

        public final BubbleRect getZero() {
            return BubbleRect.ShareDataUIState;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BubbleRect() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static BubbleRect copy$default(BubbleRect bubbleRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bubbleRect.component1;
        }
        if ((i & 2) != 0) {
            f2 = bubbleRect.component3;
        }
        if ((i & 4) != 0) {
            f3 = bubbleRect.copydefault;
        }
        if ((i & 8) != 0) {
            f4 = bubbleRect.component2;
        }
        return bubbleRect.copy(f, f2, f3, f4);
    }

    public final float getComponent1() {
        return this.component1;
    }

    public final float getComponent3() {
        return this.component3;
    }

    public final float getCopydefault() {
        return this.copydefault;
    }

    public final float getComponent2() {
        return this.component2;
    }

    public final BubbleRect copy(float left, float top, float right, float bottom) {
        return new BubbleRect(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BubbleRect)) {
            return false;
        }
        BubbleRect bubbleRect = (BubbleRect) other;
        return Float.compare(this.component1, bubbleRect.component1) == 0 && Float.compare(this.component3, bubbleRect.component3) == 0 && Float.compare(this.copydefault, bubbleRect.copydefault) == 0 && Float.compare(this.component2, bubbleRect.component2) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.component1) * 31) + Float.hashCode(this.component3)) * 31) + Float.hashCode(this.copydefault)) * 31) + Float.hashCode(this.component2);
    }

    public String toString() {
        return "BubbleRect(left=" + this.component1 + ", top=" + this.component3 + ", right=" + this.copydefault + ", bottom=" + this.component2 + ")";
    }
}
