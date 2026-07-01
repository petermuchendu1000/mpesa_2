package com.safaricom.designsystem.components.menu;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/safaricom/designsystem/components/menu/MenuActionStyle;", "", "iconTint", "Landroidx/compose/ui/graphics/Color;", "containerColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIconTint-0d7_KjU", "()J", "J", "getContainerColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lcom/safaricom/designsystem/components/menu/MenuActionStyle;", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuActionStyle {
    public static final int $stable = 0;
    private final long component3;
    private final long copydefault;

    private MenuActionStyle(long j, long j2) {
        this.component3 = j;
        this.copydefault = j2;
    }

    public final long m12583getIconTint0d7_KjU() {
        return this.component3;
    }

    public final long m12582getContainerColor0d7_KjU() {
        return this.copydefault;
    }

    public MenuActionStyle(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public static MenuActionStyle m12578copyOWjLjI$default(MenuActionStyle menuActionStyle, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = menuActionStyle.component3;
        }
        if ((i & 2) != 0) {
            j2 = menuActionStyle.copydefault;
        }
        return menuActionStyle.m12581copyOWjLjI(j, j2);
    }

    public final long getComponent3() {
        return this.component3;
    }

    public final long getCopydefault() {
        return this.copydefault;
    }

    public final MenuActionStyle m12581copyOWjLjI(long iconTint, long containerColor) {
        return new MenuActionStyle(iconTint, containerColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuActionStyle)) {
            return false;
        }
        MenuActionStyle menuActionStyle = (MenuActionStyle) other;
        return Color.m6055equalsimpl0(this.component3, menuActionStyle.component3) && Color.m6055equalsimpl0(this.copydefault, menuActionStyle.copydefault);
    }

    public int hashCode() {
        return (Color.m6061hashCodeimpl(this.component3) * 31) + Color.m6061hashCodeimpl(this.copydefault);
    }

    public String toString() {
        return "MenuActionStyle(iconTint=" + Color.m6062toStringimpl(this.component3) + ", containerColor=" + Color.m6062toStringimpl(this.copydefault) + ")";
    }
}
