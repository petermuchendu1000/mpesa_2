package com.huawei.digitalpayment.home.data.source.locaL;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/SearchMiniAppUiState;", "", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "miniApps", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalMiniApp;", "<init>", "(ZLcom/huawei/common/exception/BaseException;Ljava/util/List;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getMiniApps", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchMiniAppUiState {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final BaseException exception;
    private final boolean loading;
    private final List<LocalMiniApp> miniApps;

    public SearchMiniAppUiState(boolean z, BaseException baseException, List<LocalMiniApp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.loading = z;
        this.exception = baseException;
        this.miniApps = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchMiniAppUiState(boolean z, BaseException baseException, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 123;
            int i3 = i2 % 128;
            component2 = i3;
            z = i2 % 2 == 0;
            int i4 = i3 + 13;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i6 = ShareDataUIState + 77;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i7 = 2 % 2;
            baseException = null;
        }
        this(z, baseException, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.loading;
        int i4 = i2 + 119;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return baseException;
        }
        throw null;
    }

    public final List<LocalMiniApp> getMiniApps() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalMiniApp> list = this.miniApps;
        int i5 = i3 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public SearchMiniAppUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SearchMiniAppUiState copy$default(SearchMiniAppUiState searchMiniAppUiState, boolean z, BaseException baseException, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 95;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 95;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            z = searchMiniAppUiState.loading;
        }
        if ((i & 2) != 0) {
            baseException = searchMiniAppUiState.exception;
        }
        if ((i & 4) != 0) {
            int i8 = ShareDataUIState + 125;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                List<LocalMiniApp> list2 = searchMiniAppUiState.miniApps;
                throw null;
            }
            list = searchMiniAppUiState.miniApps;
        }
        return searchMiniAppUiState.copy(z, baseException, list);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.loading;
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final List<LocalMiniApp> component3() {
        List<LocalMiniApp> list;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.miniApps;
            int i4 = 89 / 0;
        } else {
            list = this.miniApps;
        }
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final SearchMiniAppUiState copy(boolean loading, BaseException exception, List<LocalMiniApp> miniApps) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(miniApps, "");
        SearchMiniAppUiState searchMiniAppUiState = new SearchMiniAppUiState(loading, exception, miniApps);
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return searchMiniAppUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMiniAppUiState)) {
            int i2 = ShareDataUIState + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SearchMiniAppUiState searchMiniAppUiState = (SearchMiniAppUiState) other;
        if (this.loading != searchMiniAppUiState.loading) {
            int i4 = component2 + 83;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.exception, searchMiniAppUiState.exception)) {
            return Intrinsics.areEqual(this.miniApps, searchMiniAppUiState.miniApps);
        }
        int i6 = ShareDataUIState;
        int i7 = i6 + 125;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 75;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.loading);
        BaseException baseException = this.exception;
        if (baseException == null) {
            int i4 = component2 + 51;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.miniApps.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SearchMiniAppUiState(loading=" + this.loading + ", exception=" + this.exception + ", miniApps=" + this.miniApps + ")";
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
