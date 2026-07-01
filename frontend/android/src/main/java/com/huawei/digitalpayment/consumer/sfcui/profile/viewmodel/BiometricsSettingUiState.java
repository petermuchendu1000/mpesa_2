package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÇ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020&H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsSettingUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "showFingerprintLogin", "showFingerprintPay", "isOpenFingerprintLogin", "isOpenFingerprintPay", Keys.KEY_IS_SUCCESS, "operator", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsOperator;", "<init>", "(ZLcom/huawei/common/exception/BaseException;ZZZZZLcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsOperator;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getShowFingerprintLogin", "getShowFingerprintPay", "getOperator", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsOperator;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BiometricsSettingUiState extends BaseResp {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 3 % 128;
    private final BaseException exception;
    private final boolean isOpenFingerprintLogin;
    private final boolean isOpenFingerprintPay;
    private final boolean isSuccess;
    private final boolean loading;
    private final BiometricsOperator operator;
    private final boolean showFingerprintLogin;
    private final boolean showFingerprintPay;

    /* JADX WARN: Illegal instructions before constructor call */
    public BiometricsSettingUiState(boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BiometricsOperator biometricsOperator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z7;
        boolean z8;
        boolean z9 = (i & 1) != 0 ? false : z;
        BiometricsOperator biometricsOperator2 = null;
        BaseException baseException2 = (i & 2) != 0 ? null : baseException;
        boolean z10 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            int i2 = component2 + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z7 = false;
        } else {
            z7 = z3;
        }
        boolean z11 = (i & 16) != 0 ? false : z4;
        if ((i & 32) != 0) {
            int i5 = component2 + 73;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            z8 = false;
        } else {
            z8 = z5;
        }
        boolean z12 = (i & 64) == 0 ? z6 : false;
        if ((i & 128) != 0) {
            int i7 = 2 % 2;
        } else {
            biometricsOperator2 = biometricsOperator;
        }
        this(z9, baseException2, z10, z7, z11, z8, z12, biometricsOperator2);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return baseException;
        }
        throw null;
    }

    public final boolean getShowFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.showFingerprintLogin;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return z;
    }

    public final boolean getShowFingerprintPay() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.showFingerprintPay;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return z;
    }

    public final boolean isOpenFingerprintLogin() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isOpenFingerprintLogin;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean isOpenFingerprintPay() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.isOpenFingerprintPay;
        int i4 = i3 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isSuccess() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.isSuccess;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final BiometricsOperator getOperator() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        BiometricsOperator biometricsOperator = this.operator;
        int i4 = i2 + 75;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return biometricsOperator;
        }
        obj.hashCode();
        throw null;
    }

    public BiometricsSettingUiState(boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BiometricsOperator biometricsOperator) {
        this.loading = z;
        this.exception = baseException;
        this.showFingerprintLogin = z2;
        this.showFingerprintPay = z3;
        this.isOpenFingerprintLogin = z4;
        this.isOpenFingerprintPay = z5;
        this.isSuccess = z6;
        this.operator = biometricsOperator;
    }

    static {
        if (3 % 2 == 0) {
            int i = 74 / 0;
        }
    }

    public BiometricsSettingUiState() {
        this(false, null, false, false, false, false, false, null, 255, null);
    }

    public static BiometricsSettingUiState copy$default(BiometricsSettingUiState biometricsSettingUiState, boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BiometricsOperator biometricsOperator, int i, Object obj) {
        boolean z7;
        boolean z8;
        BiometricsOperator biometricsOperator2;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        boolean z9 = (i & 1) != 0 ? biometricsSettingUiState.loading : z;
        BaseException baseException2 = (i & 2) != 0 ? biometricsSettingUiState.exception : baseException;
        boolean z10 = (i & 4) != 0 ? biometricsSettingUiState.showFingerprintLogin : z2;
        boolean z11 = (i & 8) != 0 ? biometricsSettingUiState.showFingerprintPay : z3;
        if ((i & 16) != 0) {
            int i6 = i3 + 1;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z12 = biometricsSettingUiState.isOpenFingerprintLogin;
                throw null;
            }
            z7 = biometricsSettingUiState.isOpenFingerprintLogin;
            int i7 = i3 + 107;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 5;
            }
        } else {
            z7 = z4;
        }
        boolean z13 = (i & 32) != 0 ? biometricsSettingUiState.isOpenFingerprintPay : z5;
        if ((i & 64) != 0) {
            z8 = biometricsSettingUiState.isSuccess;
            int i9 = component2 + 13;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z8 = z6;
        }
        if ((i & 128) != 0) {
            biometricsOperator2 = biometricsSettingUiState.operator;
            int i11 = component2 + 65;
            component3 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            biometricsOperator2 = biometricsOperator;
        }
        return biometricsSettingUiState.copy(z9, baseException2, z10, z11, z7, z13, z8, biometricsOperator2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.loading;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return z;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return baseException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.showFingerprintLogin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.showFingerprintPay;
        }
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isOpenFingerprintLogin;
        }
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.isOpenFingerprintPay;
        int i4 = i3 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isSuccess;
        int i4 = i2 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final BiometricsOperator component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        BiometricsOperator biometricsOperator = this.operator;
        int i4 = i2 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return biometricsOperator;
    }

    public final BiometricsSettingUiState copy(boolean loading, BaseException exception, boolean showFingerprintLogin, boolean showFingerprintPay, boolean isOpenFingerprintLogin, boolean isOpenFingerprintPay, boolean isSuccess, BiometricsOperator operator) {
        int i = 2 % 2;
        BiometricsSettingUiState biometricsSettingUiState = new BiometricsSettingUiState(loading, exception, showFingerprintLogin, showFingerprintPay, isOpenFingerprintLogin, isOpenFingerprintPay, isSuccess, operator);
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return biometricsSettingUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 113;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BiometricsSettingUiState)) {
            return false;
        }
        BiometricsSettingUiState biometricsSettingUiState = (BiometricsSettingUiState) other;
        if (this.loading != biometricsSettingUiState.loading || !Intrinsics.areEqual(this.exception, biometricsSettingUiState.exception)) {
            return false;
        }
        if (this.showFingerprintLogin == biometricsSettingUiState.showFingerprintLogin) {
            return this.showFingerprintPay == biometricsSettingUiState.showFingerprintPay && this.isOpenFingerprintLogin == biometricsSettingUiState.isOpenFingerprintLogin && this.isOpenFingerprintPay == biometricsSettingUiState.isOpenFingerprintPay && this.isSuccess == biometricsSettingUiState.isSuccess && this.operator == biometricsSettingUiState.operator;
        }
        int i7 = component3 + 93;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.loading);
        BaseException baseException = this.exception;
        int iHashCode3 = 0;
        if (baseException == null) {
            int i2 = component3 + 17;
            component2 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        int iHashCode4 = Boolean.hashCode(this.showFingerprintLogin);
        int iHashCode5 = Boolean.hashCode(this.showFingerprintPay);
        int iHashCode6 = Boolean.hashCode(this.isOpenFingerprintLogin);
        int iHashCode7 = Boolean.hashCode(this.isOpenFingerprintPay);
        int iHashCode8 = Boolean.hashCode(this.isSuccess);
        BiometricsOperator biometricsOperator = this.operator;
        if (biometricsOperator != null) {
            iHashCode3 = biometricsOperator.hashCode();
            int i3 = component2 + 61;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BiometricsSettingUiState(loading=" + this.loading + ", exception=" + this.exception + ", showFingerprintLogin=" + this.showFingerprintLogin + ", showFingerprintPay=" + this.showFingerprintPay + ", isOpenFingerprintLogin=" + this.isOpenFingerprintLogin + ", isOpenFingerprintPay=" + this.isOpenFingerprintPay + ", isSuccess=" + this.isSuccess + ", operator=" + this.operator + ")";
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
