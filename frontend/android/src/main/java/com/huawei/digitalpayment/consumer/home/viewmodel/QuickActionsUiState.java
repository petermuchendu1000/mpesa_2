package com.huawei.digitalpayment.consumer.home.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction;
import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunctionGroup;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÇ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020.H×\u0001J\t\u0010/\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/QuickActionsUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", "saveSuccess", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "groupName", "", "searchQuery", "isInEditMode", "categoryMutableList", "", "currentHomeServiceFunctions", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "homeServiceGroups", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunctionGroup;", "<init>", "(ZZLcom/huawei/common/exception/BaseException;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLoading", "()Z", "getSaveSuccess", "getException", "()Lcom/huawei/common/exception/BaseException;", "getGroupName", "()Ljava/lang/String;", "getSearchQuery", "getCategoryMutableList", "()Ljava/util/List;", "getCurrentHomeServiceFunctions", "getHomeServiceGroups", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsUiState extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final List<String> categoryMutableList;
    private final List<SFCLocalHomeFunction> currentHomeServiceFunctions;
    private final BaseException exception;
    private final String groupName;
    private final List<SFCLocalHomeFunctionGroup> homeServiceGroups;
    private final boolean isInEditMode;
    private final boolean loading;
    private final boolean saveSuccess;
    private final String searchQuery;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionsUiState(boolean z, boolean z2, BaseException baseException, String str, String str2, boolean z3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4;
        boolean z5;
        String str3;
        List listEmptyList;
        if ((i & 1) != 0) {
            int i2 = component2 + 113;
            copydefault = i2 % 128;
            z4 = i2 % 2 != 0;
        } else {
            z4 = z;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z5 = false;
        } else {
            z5 = z2;
        }
        Object obj = null;
        BaseException baseException2 = (i & 4) != 0 ? null : baseException;
        String str4 = "";
        if ((i & 8) != 0) {
            int i6 = component2 + 27;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 16) != 0) {
            int i7 = component2 + 5;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 38 / 0;
            }
        } else {
            str4 = str2;
        }
        boolean z6 = (i & 32) == 0 ? z3 : false;
        ArrayList arrayList = (i & 64) != 0 ? new ArrayList() : list;
        ArrayList arrayList2 = (i & 128) != 0 ? new ArrayList() : list2;
        if ((i & 256) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i9 = copydefault + 49;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        } else {
            listEmptyList = list3;
        }
        this(z4, z5, baseException2, str3, str4, z6, arrayList, arrayList2, listEmptyList);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.loading;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getSaveSuccess() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault + 33;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            z = this.saveSuccess;
            int i4 = 86 / 0;
        } else {
            z = this.saveSuccess;
        }
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return z;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final String getGroupName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.groupName;
        int i4 = i2 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSearchQuery() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.searchQuery;
            int i4 = 95 / 0;
        } else {
            str = this.searchQuery;
        }
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isInEditMode() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isInEditMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> getCategoryMutableList() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<String> list = this.categoryMutableList;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return list;
    }

    public final List<SFCLocalHomeFunction> getCurrentHomeServiceFunctions() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.currentHomeServiceFunctions;
        }
        throw null;
    }

    public final List<SFCLocalHomeFunctionGroup> getHomeServiceGroups() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.homeServiceGroups;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QuickActionsUiState(boolean z, boolean z2, BaseException baseException, String str, String str2, boolean z3, List<String> list, List<SFCLocalHomeFunction> list2, List<SFCLocalHomeFunctionGroup> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.loading = z;
        this.saveSuccess = z2;
        this.exception = baseException;
        this.groupName = str;
        this.searchQuery = str2;
        this.isInEditMode = z3;
        this.categoryMutableList = list;
        this.currentHomeServiceFunctions = list2;
        this.homeServiceGroups = list3;
    }

    static {
        int i = 1 + 21;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public QuickActionsUiState() {
        this(false, false, null, null, null, false, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QuickActionsUiState copy$default(QuickActionsUiState quickActionsUiState, boolean z, boolean z2, BaseException baseException, String str, String str2, boolean z3, List list, List list2, List list3, int i, Object obj) {
        boolean z4;
        String str3;
        List list4;
        List list5;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        boolean z5 = (i & 1) != 0 ? quickActionsUiState.loading : z;
        if ((i & 2) != 0) {
            int i6 = i3 + 77;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                z4 = quickActionsUiState.saveSuccess;
                int i7 = 31 / 0;
            } else {
                z4 = quickActionsUiState.saveSuccess;
            }
        } else {
            z4 = z2;
        }
        BaseException baseException2 = (i & 4) != 0 ? quickActionsUiState.exception : baseException;
        String str4 = (i & 8) != 0 ? quickActionsUiState.groupName : str;
        if ((i & 16) != 0) {
            int i8 = component2 + 49;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                String str5 = quickActionsUiState.searchQuery;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = quickActionsUiState.searchQuery;
        } else {
            str3 = str2;
        }
        boolean z6 = (i & 32) != 0 ? quickActionsUiState.isInEditMode : z3;
        if ((i & 64) != 0) {
            int i9 = copydefault + 31;
            int i10 = i9 % 128;
            component2 = i10;
            int i11 = i9 % 2;
            list4 = quickActionsUiState.categoryMutableList;
            int i12 = i10 + 83;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
        } else {
            list4 = list;
        }
        if ((i & 128) != 0) {
            list5 = quickActionsUiState.currentHomeServiceFunctions;
            int i14 = component2 + 85;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
        } else {
            list5 = list2;
        }
        return quickActionsUiState.copy(z5, z4, baseException2, str4, str3, z6, list4, list5, (i & 256) != 0 ? quickActionsUiState.homeServiceGroups : list3);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.saveSuccess;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final BaseException component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return baseException;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.groupName;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.searchQuery;
        int i5 = i3 + 69;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isInEditMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> component7() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<String> list = this.categoryMutableList;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return list;
    }

    public final List<SFCLocalHomeFunction> component8() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.currentHomeServiceFunctions;
        }
        throw null;
    }

    public final List<SFCLocalHomeFunctionGroup> component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<SFCLocalHomeFunctionGroup> list = this.homeServiceGroups;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final QuickActionsUiState copy(boolean loading, boolean saveSuccess, BaseException exception, String groupName, String searchQuery, boolean isInEditMode, List<String> categoryMutableList, List<SFCLocalHomeFunction> currentHomeServiceFunctions, List<SFCLocalHomeFunctionGroup> homeServiceGroups) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupName, "");
        Intrinsics.checkNotNullParameter(searchQuery, "");
        Intrinsics.checkNotNullParameter(categoryMutableList, "");
        Intrinsics.checkNotNullParameter(currentHomeServiceFunctions, "");
        Intrinsics.checkNotNullParameter(homeServiceGroups, "");
        QuickActionsUiState quickActionsUiState = new QuickActionsUiState(loading, saveSuccess, exception, groupName, searchQuery, isInEditMode, categoryMutableList, currentHomeServiceFunctions, homeServiceGroups);
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return quickActionsUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof QuickActionsUiState)) {
            return false;
        }
        QuickActionsUiState quickActionsUiState = (QuickActionsUiState) other;
        if (this.loading != quickActionsUiState.loading || this.saveSuccess != quickActionsUiState.saveSuccess || !Intrinsics.areEqual(this.exception, quickActionsUiState.exception)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.groupName, quickActionsUiState.groupName)) {
            int i4 = copydefault + 109;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.searchQuery, quickActionsUiState.searchQuery) || this.isInEditMode != quickActionsUiState.isInEditMode) {
            return false;
        }
        if (Intrinsics.areEqual(this.categoryMutableList, quickActionsUiState.categoryMutableList)) {
            if (Intrinsics.areEqual(this.currentHomeServiceFunctions, quickActionsUiState.currentHomeServiceFunctions)) {
                return Intrinsics.areEqual(this.homeServiceGroups, quickActionsUiState.homeServiceGroups);
            }
            int i5 = component2 + 5;
            copydefault = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = copydefault;
        int i7 = i6 + 103;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 79;
        component2 = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.loading);
        int iHashCode3 = Boolean.hashCode(this.saveSuccess);
        BaseException baseException = this.exception;
        if (baseException == null) {
            int i2 = component2;
            int i3 = i2 + 43;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.groupName.hashCode()) * 31) + this.searchQuery.hashCode()) * 31) + Boolean.hashCode(this.isInEditMode)) * 31) + this.categoryMutableList.hashCode()) * 31) + this.currentHomeServiceFunctions.hashCode()) * 31) + this.homeServiceGroups.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuickActionsUiState(loading=" + this.loading + ", saveSuccess=" + this.saveSuccess + ", exception=" + this.exception + ", groupName=" + this.groupName + ", searchQuery=" + this.searchQuery + ", isInEditMode=" + this.isInEditMode + ", categoryMutableList=" + this.categoryMutableList + ", currentHomeServiceFunctions=" + this.currentHomeServiceFunctions + ", homeServiceGroups=" + this.homeServiceGroups + ")";
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return str;
    }
}
