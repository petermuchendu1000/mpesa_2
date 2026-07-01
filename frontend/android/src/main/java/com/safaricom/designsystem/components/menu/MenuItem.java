package com.safaricom.designsystem.components.menu;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/safaricom/designsystem/components/menu/MenuItem;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "label", "", "iconRes", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getId", "()I", "getLabel", "()Ljava/lang/String;", "getIconRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/safaricom/designsystem/components/menu/MenuItem;", "equals", "", "other", "hashCode", "toString", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuItem {
    public static final int $stable = 0;
    private final String ShareDataUIState;
    private final Integer component1;
    private final int component3;

    public MenuItem(int i, String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = i;
        this.ShareDataUIState = str;
        this.component1 = num;
    }

    public MenuItem(int i, String str, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : num);
    }

    public final int getId() {
        return this.component3;
    }

    public final String getLabel() {
        return this.ShareDataUIState;
    }

    public final Integer getIconRes() {
        return this.component1;
    }

    public static MenuItem copy$default(MenuItem menuItem, int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = menuItem.component3;
        }
        if ((i2 & 2) != 0) {
            str = menuItem.ShareDataUIState;
        }
        if ((i2 & 4) != 0) {
            num = menuItem.component1;
        }
        return menuItem.copy(i, str, num);
    }

    public final int getComponent3() {
        return this.component3;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final Integer getComponent1() {
        return this.component1;
    }

    public final MenuItem copy(int id, String label, Integer iconRes) {
        Intrinsics.checkNotNullParameter(label, "");
        return new MenuItem(id, label, iconRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) other;
        return this.component3 == menuItem.component3 && Intrinsics.areEqual(this.ShareDataUIState, menuItem.ShareDataUIState) && Intrinsics.areEqual(this.component1, menuItem.component1);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.component3);
        int iHashCode2 = this.ShareDataUIState.hashCode();
        Integer num = this.component1;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "MenuItem(id=" + this.component3 + ", label=" + this.ShareDataUIState + ", iconRes=" + this.component1 + ")";
    }
}
