package com.huawei.digitalpayment.consumer.sfcui.favorites.viewall;

import com.huawei.digitalpayment.consumer.sfcui.favorites.FavoriteFilterTab;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/viewall/ViewFavoritesState;", "", "selectedTab", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "searchText", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;Ljava/lang/String;)V", "getSelectedTab", "()Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "getSearchText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewFavoritesState {
    public static final int $stable = 0;
    private static int component1 = 123 % 128;
    private static int component2 = 0;
    private static int copy = 1;
    private static int copydefault;
    private final String ShareDataUIState;
    private final FavoriteFilterTab component3;

    public ViewFavoritesState(FavoriteFilterTab favoriteFilterTab, String str) {
        Intrinsics.checkNotNullParameter(favoriteFilterTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = favoriteFilterTab;
        this.ShareDataUIState = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewFavoritesState(FavoriteFilterTab favoriteFilterTab, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 33;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                favoriteFilterTab = FavoriteFilterTab.Send.INSTANCE;
                int i3 = copy + 19;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                FavoriteFilterTab.Send send = FavoriteFilterTab.Send.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(favoriteFilterTab, (i & 2) != 0 ? "" : str);
    }

    public final FavoriteFilterTab getSelectedTab() {
        int i = 2 % 2;
        int i2 = copy + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        FavoriteFilterTab favoriteFilterTab = this.component3;
        int i5 = i3 + 23;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return favoriteFilterTab;
    }

    public final String getSearchText() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    static {
        int i = 123 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewFavoritesState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static ViewFavoritesState copy$default(ViewFavoritesState viewFavoritesState, FavoriteFilterTab favoriteFilterTab, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 57;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            favoriteFilterTab = viewFavoritesState.component3;
            int i5 = i4 + 107;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            int i7 = copy + 85;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                str = viewFavoritesState.ShareDataUIState;
                int i8 = 24 / 0;
            } else {
                str = viewFavoritesState.ShareDataUIState;
            }
        }
        return viewFavoritesState.copy(favoriteFilterTab, str);
    }

    public final FavoriteFilterTab component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        FavoriteFilterTab favoriteFilterTab = this.component3;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return favoriteFilterTab;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 3 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ViewFavoritesState copy(FavoriteFilterTab selectedTab, String searchText) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedTab, "");
        Intrinsics.checkNotNullParameter(searchText, "");
        ViewFavoritesState viewFavoritesState = new ViewFavoritesState(selectedTab, searchText);
        int i2 = copydefault + 119;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
        }
        return viewFavoritesState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 107;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof ViewFavoritesState)) {
            int i3 = copydefault + 89;
            copy = i3 % 128;
            return i3 % 2 == 0;
        }
        ViewFavoritesState viewFavoritesState = (ViewFavoritesState) other;
        if (!(!Intrinsics.areEqual(this.component3, viewFavoritesState.component3))) {
            return !(Intrinsics.areEqual(this.ShareDataUIState, viewFavoritesState.ShareDataUIState) ^ true);
        }
        int i4 = copydefault + 43;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component3.hashCode() * 31) + this.ShareDataUIState.hashCode();
        int i4 = copy + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ViewFavoritesState(selectedTab=" + this.component3 + ", searchText=" + this.ShareDataUIState + ")";
        int i2 = copydefault + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
