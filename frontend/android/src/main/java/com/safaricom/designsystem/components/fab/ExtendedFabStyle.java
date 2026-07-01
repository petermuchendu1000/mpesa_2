package com.safaricom.designsystem.components.fab;

import androidx.compose.ui.graphics.Color;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/safaricom/designsystem/components/fab/ExtendedFabStyle;", "", CdpConstants.CONTENT_TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "iconColor", "containerColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextColor-0d7_KjU", "()J", "J", "getIconColor-0d7_KjU", "getContainerColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/safaricom/designsystem/components/fab/ExtendedFabStyle;", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExtendedFabStyle {
    public static final int $stable = 0;
    private final long ShareDataUIState;
    private final long component1;
    private final long copydefault;

    private ExtendedFabStyle(long j, long j2, long j3) {
        this.ShareDataUIState = j;
        this.component1 = j2;
        this.copydefault = j3;
    }

    public final long m12530getTextColor0d7_KjU() {
        return this.ShareDataUIState;
    }

    public final long m12529getIconColor0d7_KjU() {
        return this.component1;
    }

    public final long m12528getContainerColor0d7_KjU() {
        return this.copydefault;
    }

    public ExtendedFabStyle(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public static ExtendedFabStyle m12523copyysEtTa8$default(ExtendedFabStyle extendedFabStyle, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = extendedFabStyle.ShareDataUIState;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = extendedFabStyle.component1;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = extendedFabStyle.copydefault;
        }
        return extendedFabStyle.m12527copyysEtTa8(j4, j5, j3);
    }

    public final long getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final long getComponent1() {
        return this.component1;
    }

    public final long getCopydefault() {
        return this.copydefault;
    }

    public final ExtendedFabStyle m12527copyysEtTa8(long textColor, long iconColor, long containerColor) {
        return new ExtendedFabStyle(textColor, iconColor, containerColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedFabStyle)) {
            return false;
        }
        ExtendedFabStyle extendedFabStyle = (ExtendedFabStyle) other;
        return Color.m6055equalsimpl0(this.ShareDataUIState, extendedFabStyle.ShareDataUIState) && Color.m6055equalsimpl0(this.component1, extendedFabStyle.component1) && Color.m6055equalsimpl0(this.copydefault, extendedFabStyle.copydefault);
    }

    public int hashCode() {
        return (((Color.m6061hashCodeimpl(this.ShareDataUIState) * 31) + Color.m6061hashCodeimpl(this.component1)) * 31) + Color.m6061hashCodeimpl(this.copydefault);
    }

    public String toString() {
        return "ExtendedFabStyle(textColor=" + Color.m6062toStringimpl(this.ShareDataUIState) + ", iconColor=" + Color.m6062toStringimpl(this.component1) + ", containerColor=" + Color.m6062toStringimpl(this.copydefault) + ")";
    }
}
