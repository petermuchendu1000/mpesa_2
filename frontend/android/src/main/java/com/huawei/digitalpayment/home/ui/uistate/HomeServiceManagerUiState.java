package com.huawei.digitalpayment.home.ui.uistate;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/home/ui/uistate/HomeServiceManagerUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", "saveSuccess", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "groupName", "", "currentHomeServiceFunctions", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "homeServiceGroups", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "<init>", "(ZZLcom/huawei/common/exception/BaseException;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getLoading", "()Z", "getSaveSuccess", "getException", "()Lcom/huawei/common/exception/BaseException;", "getGroupName", "()Ljava/lang/String;", "getCurrentHomeServiceFunctions", "()Ljava/util/List;", "getHomeServiceGroups", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeServiceManagerUiState extends BaseResp {
    private static int component2 = 1;
    private static int copydefault;
    private final List<LocalHomeFunction> currentHomeServiceFunctions;
    private final BaseException exception;
    private final String groupName;
    private final List<LocalFunctionGroup> homeServiceGroups;
    private final boolean loading;
    private final boolean saveSuccess;

    public HomeServiceManagerUiState(boolean z, boolean z2, BaseException baseException, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = false;
        if ((i & 1) != 0) {
            int i2 = component2 + 81;
            copydefault = i2 % 128;
            z = i2 % 2 != 0;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i3 = component2 + 117;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        } else {
            z3 = z2;
        }
        BaseException baseException2 = (i & 4) != 0 ? null : baseException;
        if ((i & 8) != 0) {
            int i4 = component2 + 83;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        }
        String str2 = str;
        if ((i & 16) != 0) {
            list = new ArrayList();
            int i5 = 2 % 2;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            int i6 = copydefault + 31;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list2 = CollectionsKt.emptyList();
        }
        this(z, z3, baseException2, str2, list3, list2);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.loading;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean getSaveSuccess() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.saveSuccess;
        int i4 = i3 + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final BaseException getException() {
        BaseException baseException;
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            baseException = this.exception;
            int i4 = 41 / 0;
        } else {
            baseException = this.exception;
        }
        int i5 = i3 + 107;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupName;
        }
        throw null;
    }

    public final List<LocalHomeFunction> getCurrentHomeServiceFunctions() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = this.currentHomeServiceFunctions;
        int i5 = i2 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<LocalFunctionGroup> getHomeServiceGroups() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<LocalFunctionGroup> list = this.homeServiceGroups;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public HomeServiceManagerUiState(boolean z, boolean z2, BaseException baseException, String str, List<LocalHomeFunction> list, List<LocalFunctionGroup> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.loading = z;
        this.saveSuccess = z2;
        this.exception = baseException;
        this.groupName = str;
        this.currentHomeServiceFunctions = list;
        this.homeServiceGroups = list2;
    }

    public HomeServiceManagerUiState() {
        this(false, false, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HomeServiceManagerUiState copy$default(HomeServiceManagerUiState homeServiceManagerUiState, boolean z, boolean z2, BaseException baseException, String str, List list, List list2, int i, Object obj) {
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        int i3 = copydefault + 15;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            z3 = homeServiceManagerUiState.loading;
            int i6 = i4 + 95;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z3 = z;
        }
        if ((i & 2) != 0) {
            int i8 = i4 + 1;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            z4 = homeServiceManagerUiState.saveSuccess;
        } else {
            z4 = z2;
        }
        HomeServiceManagerUiState homeServiceManagerUiStateCopy = homeServiceManagerUiState.copy(z3, z4, (i & 4) != 0 ? homeServiceManagerUiState.exception : baseException, (i & 8) != 0 ? homeServiceManagerUiState.groupName : str, (i & 16) != 0 ? homeServiceManagerUiState.currentHomeServiceFunctions : list, (i & 32) != 0 ? homeServiceManagerUiState.homeServiceGroups : list2);
        int i10 = copydefault + 43;
        component2 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
        }
        return homeServiceManagerUiStateCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.saveSuccess;
        }
        throw null;
    }

    public final BaseException component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.groupName;
        int i5 = i2 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<LocalHomeFunction> component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = this.currentHomeServiceFunctions;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<LocalFunctionGroup> component6() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<LocalFunctionGroup> list = this.homeServiceGroups;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final HomeServiceManagerUiState copy(boolean loading, boolean saveSuccess, BaseException exception, String groupName, List<LocalHomeFunction> currentHomeServiceFunctions, List<LocalFunctionGroup> homeServiceGroups) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupName, "");
        Intrinsics.checkNotNullParameter(currentHomeServiceFunctions, "");
        Intrinsics.checkNotNullParameter(homeServiceGroups, "");
        HomeServiceManagerUiState homeServiceManagerUiState = new HomeServiceManagerUiState(loading, saveSuccess, exception, groupName, currentHomeServiceFunctions, homeServiceGroups);
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return homeServiceManagerUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof HomeServiceManagerUiState)) {
            int i4 = component2 + 61;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        HomeServiceManagerUiState homeServiceManagerUiState = (HomeServiceManagerUiState) other;
        if (this.loading != homeServiceManagerUiState.loading) {
            int i5 = component2 + 45;
            copydefault = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.saveSuccess != homeServiceManagerUiState.saveSuccess || (!Intrinsics.areEqual(this.exception, homeServiceManagerUiState.exception)) || !Intrinsics.areEqual(this.groupName, homeServiceManagerUiState.groupName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.currentHomeServiceFunctions, homeServiceManagerUiState.currentHomeServiceFunctions)) {
            int i6 = component2 + 99;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.homeServiceGroups, homeServiceManagerUiState.homeServiceGroups)) {
            return false;
        }
        int i8 = copydefault + 5;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.loading);
        int iHashCode3 = Boolean.hashCode(this.saveSuccess);
        BaseException baseException = this.exception;
        if (baseException == null) {
            int i2 = copydefault + 121;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        int iHashCode4 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.groupName.hashCode()) * 31) + this.currentHomeServiceFunctions.hashCode()) * 31) + this.homeServiceGroups.hashCode();
        int i4 = component2 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeServiceManagerUiState(loading=" + this.loading + ", saveSuccess=" + this.saveSuccess + ", exception=" + this.exception + ", groupName=" + this.groupName + ", currentHomeServiceFunctions=" + this.currentHomeServiceFunctions + ", homeServiceGroups=" + this.homeServiceGroups + ")";
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
