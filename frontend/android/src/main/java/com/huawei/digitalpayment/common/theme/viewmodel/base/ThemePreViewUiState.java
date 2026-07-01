package com.huawei.digitalpayment.common.theme.viewmodel.base;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.common.theme.data.HomeThemeResp;
import com.huawei.digitalpayment.common.theme.data.NavigationComponent;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/ThemePreViewUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", "data", "Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;", "homeTheme", "Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "<init>", "(ZLcom/huawei/digitalpayment/common/theme/data/NavigationComponent;Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;Lcom/huawei/common/exception/BaseException;)V", "getLoading", "()Z", "getData", "()Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;", "getHomeTheme", "()Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;", "getException", "()Lcom/huawei/common/exception/BaseException;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemePreViewUiState extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final NavigationComponent data;
    private final BaseException exception;
    private final HomeThemeResp homeTheme;
    private final boolean loading;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemePreViewUiState(boolean z, NavigationComponent navigationComponent, HomeThemeResp homeThemeResp, BaseException baseException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        NavigationComponent navigationComponent2;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        BaseException baseException2 = null;
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 121;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 85;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            navigationComponent2 = null;
        } else {
            navigationComponent2 = navigationComponent;
        }
        HomeThemeResp homeThemeResp2 = (i & 4) != 0 ? new HomeThemeResp(null, null, null, null, null, null, null, 127, null) : homeThemeResp;
        if ((i & 8) != 0) {
            int i11 = 2 % 2;
        } else {
            baseException2 = baseException;
        }
        this(z2, navigationComponent2, homeThemeResp2, baseException2);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final NavigationComponent getData() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final HomeThemeResp getHomeTheme() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.homeTheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public ThemePreViewUiState(boolean z, NavigationComponent navigationComponent, HomeThemeResp homeThemeResp, BaseException baseException) {
        Intrinsics.checkNotNullParameter(homeThemeResp, "");
        this.loading = z;
        this.data = navigationComponent;
        this.homeTheme = homeThemeResp;
        this.exception = baseException;
    }

    public ThemePreViewUiState() {
        this(false, null, null, null, 15, null);
    }

    public static ThemePreViewUiState copy$default(ThemePreViewUiState themePreViewUiState, boolean z, NavigationComponent navigationComponent, HomeThemeResp homeThemeResp, BaseException baseException, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            z = themePreViewUiState.loading;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 1;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                NavigationComponent navigationComponent2 = themePreViewUiState.data;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            navigationComponent = themePreViewUiState.data;
        }
        if ((i & 4) != 0) {
            homeThemeResp = themePreViewUiState.homeTheme;
            int i7 = copydefault + 123;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 4;
            }
        }
        if ((i & 8) != 0) {
            baseException = themePreViewUiState.exception;
        }
        return themePreViewUiState.copy(z, navigationComponent, homeThemeResp, baseException);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final NavigationComponent component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        NavigationComponent navigationComponent = this.data;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return navigationComponent;
    }

    public final HomeThemeResp component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        HomeThemeResp homeThemeResp = this.homeTheme;
        int i4 = i3 + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return homeThemeResp;
    }

    public final BaseException component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        BaseException baseException = this.exception;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return baseException;
        }
        throw null;
    }

    public final ThemePreViewUiState copy(boolean loading, NavigationComponent data, HomeThemeResp homeTheme, BaseException exception) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeTheme, "");
        ThemePreViewUiState themePreViewUiState = new ThemePreViewUiState(loading, data, homeTheme, exception);
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return themePreViewUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 83;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof ThemePreViewUiState)) {
            return false;
        }
        ThemePreViewUiState themePreViewUiState = (ThemePreViewUiState) other;
        if (this.loading != themePreViewUiState.loading) {
            return false;
        }
        if (!Intrinsics.areEqual(this.data, themePreViewUiState.data)) {
            int i3 = ShareDataUIState + 43;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.homeTheme, themePreViewUiState.homeTheme)) {
            int i5 = copydefault + 3;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.exception, themePreViewUiState.exception)) {
            return true;
        }
        int i7 = ShareDataUIState + 105;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        NavigationComponent navigationComponent;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        int iHashCode3 = 0;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.loading);
            navigationComponent = this.data;
            iHashCode2 = 1;
            if (navigationComponent != null) {
                iHashCode3 = 1;
                iHashCode2 = iHashCode3;
                iHashCode3 = navigationComponent.hashCode();
            }
        } else {
            iHashCode = Boolean.hashCode(this.loading);
            navigationComponent = this.data;
            if (navigationComponent == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = iHashCode3;
                iHashCode3 = navigationComponent.hashCode();
            }
        }
        int iHashCode4 = this.homeTheme.hashCode();
        BaseException baseException = this.exception;
        if (baseException != null) {
            iHashCode2 = baseException.hashCode();
        }
        int i3 = (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ThemePreViewUiState(loading=" + this.loading + ", data=" + this.data + ", homeTheme=" + this.homeTheme + ", exception=" + this.exception + ")";
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
