package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginSettingUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "showFingerprint", "showFaceId", "isOpenFingerprint", "isOpenFaceId", Keys.KEY_IS_SUCCESS, "operator", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginOperator;", "<init>", "(ZLcom/huawei/common/exception/BaseException;ZZZZZLcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginOperator;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getShowFingerprint", "getShowFaceId", "getOperator", "()Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginOperator;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginSettingUiState extends BaseResp {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final BaseException exception;
    private final boolean isOpenFaceId;
    private final boolean isOpenFingerprint;
    private final boolean isSuccess;
    private final boolean loading;
    private final LoginOperator operator;
    private final boolean showFaceId;
    private final boolean showFingerprint;

    /* JADX WARN: Illegal instructions before constructor call */
    public LoginSettingUiState(boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LoginOperator loginOperator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z7;
        BaseException baseException2;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if ((i & 1) != 0) {
            int i2 = copydefault + 119;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            z7 = false;
        } else {
            z7 = z;
        }
        LoginOperator loginOperator2 = null;
        if ((i & 2) != 0) {
            int i4 = component3 + 5;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            baseException2 = null;
        } else {
            baseException2 = baseException;
        }
        if ((i & 4) != 0) {
            int i6 = copydefault + 39;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            z8 = false;
        } else {
            z8 = z2;
        }
        boolean z11 = (i & 8) != 0 ? false : z3;
        if ((i & 16) != 0) {
            int i8 = component3 + 53;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            z9 = false;
        } else {
            z9 = z4;
        }
        boolean z12 = (i & 32) != 0 ? false : z5;
        if ((i & 64) != 0) {
            int i10 = 2 % 2;
        } else {
            z10 = z6;
        }
        if ((i & 128) != 0) {
            int i11 = copydefault + 5;
            component3 = i11 % 128;
            if (i11 % 2 != 0) {
                loginOperator2.hashCode();
                throw null;
            }
            int i12 = 2 % 2;
        } else {
            loginOperator2 = loginOperator;
        }
        this(z7, baseException2, z8, z11, z9, z12, z10, loginOperator2);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        BaseException baseException = this.exception;
        int i5 = i3 + 7;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return baseException;
        }
        throw null;
    }

    public final boolean getShowFingerprint() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.showFingerprint;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getShowFaceId() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.showFaceId;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return z;
    }

    public final boolean isOpenFingerprint() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isOpenFingerprint;
        }
        throw null;
    }

    public final boolean isOpenFaceId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isOpenFaceId;
        int i4 = i2 + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isSuccess() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            z = this.isSuccess;
            int i4 = 47 / 0;
        } else {
            z = this.isSuccess;
        }
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final LoginOperator getOperator() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.operator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LoginSettingUiState(boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LoginOperator loginOperator) {
        this.loading = z;
        this.exception = baseException;
        this.showFingerprint = z2;
        this.showFaceId = z3;
        this.isOpenFingerprint = z4;
        this.isOpenFaceId = z5;
        this.isSuccess = z6;
        this.operator = loginOperator;
    }

    public LoginSettingUiState() {
        this(false, null, false, false, false, false, false, null, 255, null);
    }

    public static LoginSettingUiState copy$default(LoginSettingUiState loginSettingUiState, boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LoginOperator loginOperator, int i, Object obj) {
        boolean z7;
        boolean z8;
        boolean z9;
        LoginOperator loginOperator2;
        int i2 = 2 % 2;
        boolean z10 = (i & 1) != 0 ? loginSettingUiState.loading : z;
        BaseException baseException2 = (i & 2) != 0 ? loginSettingUiState.exception : baseException;
        boolean z11 = (i & 4) != 0 ? loginSettingUiState.showFingerprint : z2;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i3 = copydefault + 91;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z12 = loginSettingUiState.showFaceId;
                obj2.hashCode();
                throw null;
            }
            z7 = loginSettingUiState.showFaceId;
        } else {
            z7 = z3;
        }
        if ((i & 16) != 0) {
            z8 = loginSettingUiState.isOpenFingerprint;
            int i4 = copydefault + 87;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z8 = z4;
        }
        if ((i & 32) != 0) {
            int i6 = copydefault + 17;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            z9 = loginSettingUiState.isOpenFaceId;
        } else {
            z9 = z5;
        }
        boolean z13 = (i & 64) != 0 ? loginSettingUiState.isSuccess : z6;
        if ((i & 128) != 0) {
            int i8 = copydefault + 63;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                LoginOperator loginOperator3 = loginSettingUiState.operator;
                obj2.hashCode();
                throw null;
            }
            loginOperator2 = loginSettingUiState.operator;
        } else {
            loginOperator2 = loginOperator;
        }
        return loginSettingUiState.copy(z10, baseException2, z11, z7, z8, z9, z13, loginOperator2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.loading;
        int i4 = i3 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.showFingerprint;
        int i5 = i3 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.showFaceId;
        int i4 = i2 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isOpenFingerprint;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return z;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isOpenFaceId;
        int i5 = i3 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isSuccess;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LoginOperator component8() {
        LoginOperator loginOperator;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            loginOperator = this.operator;
            int i4 = 27 / 0;
        } else {
            loginOperator = this.operator;
        }
        int i5 = i2 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return loginOperator;
    }

    public final LoginSettingUiState copy(boolean loading, BaseException exception, boolean showFingerprint, boolean showFaceId, boolean isOpenFingerprint, boolean isOpenFaceId, boolean isSuccess, LoginOperator operator) {
        int i = 2 % 2;
        LoginSettingUiState loginSettingUiState = new LoginSettingUiState(loading, exception, showFingerprint, showFaceId, isOpenFingerprint, isOpenFaceId, isSuccess, operator);
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return loginSettingUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LoginSettingUiState)) {
            return false;
        }
        LoginSettingUiState loginSettingUiState = (LoginSettingUiState) other;
        if (this.loading != loginSettingUiState.loading) {
            int i4 = copydefault + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.exception, loginSettingUiState.exception)) {
            return false;
        }
        if (this.showFingerprint != loginSettingUiState.showFingerprint) {
            int i6 = copydefault + 55;
            component3 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (this.showFaceId == loginSettingUiState.showFaceId) {
            return this.isOpenFingerprint == loginSettingUiState.isOpenFingerprint && this.isOpenFaceId == loginSettingUiState.isOpenFaceId && this.isSuccess == loginSettingUiState.isSuccess && this.operator == loginSettingUiState.operator;
        }
        int i7 = copydefault + 65;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.loading);
        BaseException baseException = this.exception;
        if (baseException == null) {
            int i4 = copydefault + 67;
            component3 = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        int iHashCode3 = Boolean.hashCode(this.showFingerprint);
        int iHashCode4 = Boolean.hashCode(this.showFaceId);
        int iHashCode5 = Boolean.hashCode(this.isOpenFingerprint);
        int iHashCode6 = Boolean.hashCode(this.isOpenFaceId);
        int iHashCode7 = Boolean.hashCode(this.isSuccess);
        LoginOperator loginOperator = this.operator;
        return (((((((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (loginOperator != null ? loginOperator.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoginSettingUiState(loading=" + this.loading + ", exception=" + this.exception + ", showFingerprint=" + this.showFingerprint + ", showFaceId=" + this.showFaceId + ", isOpenFingerprint=" + this.isOpenFingerprint + ", isOpenFaceId=" + this.isOpenFaceId + ", isSuccess=" + this.isSuccess + ", operator=" + this.operator + ")";
        int i2 = copydefault + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return str;
    }
}
