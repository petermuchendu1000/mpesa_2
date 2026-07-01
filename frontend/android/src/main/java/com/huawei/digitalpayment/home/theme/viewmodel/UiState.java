package com.huawei.digitalpayment.home.theme.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/viewmodel/UiState;", "", "loading", "", "data", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "<init>", "(ZLcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;Lcom/huawei/common/exception/BaseException;)V", "getLoading", "()Z", "getData", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalHomeTheme;", "getException", "()Lcom/huawei/common/exception/BaseException;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UiState {
    private static int component1 = 0;
    private static int component2 = 1;
    private final boolean ShareDataUIState;
    private final BaseException component3;
    private final LocalHomeTheme copydefault;

    public UiState(boolean z, LocalHomeTheme localHomeTheme, BaseException baseException) {
        this.ShareDataUIState = z;
        this.copydefault = localHomeTheme;
        this.component3 = baseException;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UiState(boolean z, LocalHomeTheme localHomeTheme, BaseException baseException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 91;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        localHomeTheme = (i & 2) != 0 ? null : localHomeTheme;
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            baseException = null;
        }
        this(z, localHomeTheme, baseException);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final LocalHomeTheme getData() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        LocalHomeTheme localHomeTheme = this.copydefault;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return localHomeTheme;
        }
        throw null;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseException baseException = this.component3;
        int i4 = i2 + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return baseException;
    }

    public UiState() {
        this(false, null, null, 7, null);
    }

    public static UiState copy$default(UiState uiState, boolean z, LocalHomeTheme localHomeTheme, BaseException baseException, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 97;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z2 = uiState.ShareDataUIState;
                throw null;
            }
            z = uiState.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i7 = component2 + 105;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            localHomeTheme = uiState.copydefault;
        }
        if ((i & 4) != 0) {
            baseException = uiState.component3;
            int i9 = component2 + 119;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 4;
            }
        }
        return uiState.copy(z, localHomeTheme, baseException);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i2 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final LocalHomeTheme component2() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        LocalHomeTheme localHomeTheme = this.copydefault;
        int i4 = i3 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return localHomeTheme;
        }
        throw null;
    }

    public final BaseException component3() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UiState copy(boolean loading, LocalHomeTheme data, BaseException exception) {
        int i = 2 % 2;
        UiState uiState = new UiState(loading, data, exception);
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return uiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 87;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof UiState)) {
            int i3 = component1 + 17;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 84 / 0;
            }
            return false;
        }
        UiState uiState = (UiState) other;
        if (this.ShareDataUIState != uiState.ShareDataUIState) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, uiState.copydefault)) {
            return Intrinsics.areEqual(this.component3, uiState.component3);
        }
        int i5 = component1 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        LocalHomeTheme localHomeTheme = this.copydefault;
        if (localHomeTheme == null) {
            int i2 = component2 + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = localHomeTheme.hashCode();
        }
        BaseException baseException = this.component3;
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + (baseException != null ? baseException.hashCode() : 0);
        int i4 = component2 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UiState(loading=" + this.ShareDataUIState + ", data=" + this.copydefault + ", exception=" + this.component3 + ")";
        int i2 = component1 + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
