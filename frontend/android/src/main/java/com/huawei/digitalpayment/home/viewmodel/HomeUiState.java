package com.huawei.digitalpayment.home.viewmodel;

import androidx.core.app.NotificationCompat;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J4\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/home/viewmodel/HomeUiState;", "", "refreshFinish", "", "refreshBalanceFinish", NotificationCompat.CATEGORY_NAVIGATION, "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "<init>", "(ZLjava/lang/Boolean;Ljava/util/List;)V", "getRefreshFinish", "()Z", "getRefreshBalanceFinish", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNavigation", "()Ljava/util/List;", "setNavigation", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "(ZLjava/lang/Boolean;Ljava/util/List;)Lcom/huawei/digitalpayment/home/viewmodel/HomeUiState;", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeUiState {
    private static int component2 = 1;
    private static int component3;
    private List<LocalHomeFunction> ShareDataUIState;
    private final Boolean component1;
    private final boolean copydefault;

    public HomeUiState(boolean z, Boolean bool, List<LocalHomeFunction> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.component1 = bool;
        this.ShareDataUIState = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeUiState(boolean z, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            bool = null;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
            int i8 = component3 + 37;
            component2 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
        }
        this(z, bool, list);
    }

    public final boolean getRefreshFinish() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final Boolean getRefreshBalanceFinish() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.component1;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final List<LocalHomeFunction> getNavigation() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<LocalHomeFunction> list = this.ShareDataUIState;
        int i4 = i3 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final void setNavigation(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.ShareDataUIState = list;
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = list;
        int i3 = component3 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public HomeUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HomeUiState copy$default(HomeUiState homeUiState, boolean z, Boolean bool, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            z = homeUiState.copydefault;
            int i3 = component3 + 27;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 3;
            }
        }
        if ((i & 2) != 0) {
            bool = homeUiState.component1;
        }
        if ((i & 4) != 0) {
            list = homeUiState.ShareDataUIState;
        }
        HomeUiState homeUiStateCopy = homeUiState.copy(z, bool, list);
        int i5 = component3 + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return homeUiStateCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 53;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = this.component1;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return bool;
    }

    public final List<LocalHomeFunction> component3() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<LocalHomeFunction> list = this.ShareDataUIState;
        int i4 = i3 + 9;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final HomeUiState copy(boolean refreshFinish, Boolean refreshBalanceFinish, List<LocalHomeFunction> navigation) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(navigation, "");
        HomeUiState homeUiState = new HomeUiState(refreshFinish, refreshBalanceFinish, navigation);
        int i2 = component3 + 77;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return homeUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeUiState)) {
            int i2 = component2 + 51;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        HomeUiState homeUiState = (HomeUiState) other;
        if (this.copydefault == homeUiState.copydefault) {
            return !(Intrinsics.areEqual(this.component1, homeUiState.component1) ^ true) && Intrinsics.areEqual(this.ShareDataUIState, homeUiState.ShareDataUIState);
        }
        int i3 = component3 + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.copydefault);
        Boolean bool = this.component1;
        if (bool == null) {
            int i4 = component2 + 7;
            component3 = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = bool.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeUiState(refreshFinish=" + this.copydefault + ", refreshBalanceFinish=" + this.component1 + ", navigation=" + this.ShareDataUIState + ")";
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
