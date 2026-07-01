package com.huawei.digitalpayment.home.ui.uistate;

import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/home/ui/uistate/HomeServiceUiState;", "Lcom/huawei/http/BaseResp;", "homeServiceGroup", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "<init>", "(Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;)V", "getHomeServiceGroup", "()Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeServiceUiState extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final LocalFunctionGroup homeServiceGroup;

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeServiceUiState(LocalFunctionGroup localFunctionGroup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault;
            int i3 = i2 + 101;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            localFunctionGroup = null;
        }
        this(localFunctionGroup);
    }

    public final LocalFunctionGroup getHomeServiceGroup() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        LocalFunctionGroup localFunctionGroup = this.homeServiceGroup;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return localFunctionGroup;
        }
        throw null;
    }

    public HomeServiceUiState(LocalFunctionGroup localFunctionGroup) {
        this.homeServiceGroup = localFunctionGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeServiceUiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static HomeServiceUiState copy$default(HomeServiceUiState homeServiceUiState, LocalFunctionGroup localFunctionGroup, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 3;
        copydefault = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            localFunctionGroup = homeServiceUiState.homeServiceGroup;
        }
        HomeServiceUiState homeServiceUiStateCopy = homeServiceUiState.copy(localFunctionGroup);
        int i4 = copydefault + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return homeServiceUiStateCopy;
    }

    public final LocalFunctionGroup component1() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        LocalFunctionGroup localFunctionGroup = this.homeServiceGroup;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return localFunctionGroup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final HomeServiceUiState copy(LocalFunctionGroup homeServiceGroup) {
        int i = 2 % 2;
        HomeServiceUiState homeServiceUiState = new HomeServiceUiState(homeServiceGroup);
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return homeServiceUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeServiceUiState)) {
            int i5 = i3 + 31;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 77;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.homeServiceGroup, ((HomeServiceUiState) other).homeServiceGroup)) {
            return false;
        }
        int i10 = component2 + 43;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LocalFunctionGroup localFunctionGroup = this.homeServiceGroup;
        int iHashCode = localFunctionGroup == null ? 0 : localFunctionGroup.hashCode();
        int i4 = copydefault + 81;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeServiceUiState(homeServiceGroup=" + this.homeServiceGroup + ")";
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
