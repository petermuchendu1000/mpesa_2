package com.huawei.digitalpayment.common.theme.viewmodel.base;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.common.theme.data.MultiBalanceItem;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nHÆ\u0003J`\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR(\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BalanceUiState;", "Lcom/huawei/http/BaseResp;", "refreshFinish", "", "loading", "changeCurrencySuccess", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "changeCurrencyException", "multiBalance", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/common/theme/data/MultiBalanceItem;", "<init>", "(Ljava/lang/Boolean;ZLjava/lang/Boolean;Lcom/huawei/common/exception/BaseException;Lcom/huawei/common/exception/BaseException;Lcom/huawei/payment/mvvm/Resource;)V", "getRefreshFinish", "()Ljava/lang/Boolean;", "setRefreshFinish", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLoading", "()Z", "setLoading", "(Z)V", "getChangeCurrencySuccess", "setChangeCurrencySuccess", "getException", "()Lcom/huawei/common/exception/BaseException;", "setException", "(Lcom/huawei/common/exception/BaseException;)V", "getChangeCurrencyException", "setChangeCurrencyException", "getMultiBalance", "()Lcom/huawei/payment/mvvm/Resource;", "setMultiBalance", "(Lcom/huawei/payment/mvvm/Resource;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;ZLjava/lang/Boolean;Lcom/huawei/common/exception/BaseException;Lcom/huawei/common/exception/BaseException;Lcom/huawei/payment/mvvm/Resource;)Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BalanceUiState;", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BalanceUiState extends BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;
    private BaseException changeCurrencyException;
    private Boolean changeCurrencySuccess;
    private BaseException exception;
    private boolean loading;
    private Resource<List<MultiBalanceItem>> multiBalance;
    private Boolean refreshFinish;

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceUiState(Boolean bool, boolean z, Boolean bool2, BaseException baseException, BaseException baseException2, Resource resource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bool3;
        BaseException baseException3 = null;
        Boolean bool4 = (i & 1) != 0 ? null : bool;
        boolean z2 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            int i2 = component1 + 69;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            bool3 = null;
        } else {
            bool3 = bool2;
        }
        BaseException baseException4 = (i & 8) != 0 ? null : baseException;
        if ((i & 16) != 0) {
            int i4 = component1 + 85;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            baseException3 = baseException2;
        }
        if ((i & 32) != 0) {
            int i7 = component2 + 61;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            resource = Resource.none();
            int i9 = component2 + 43;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        this(bool4, z2, bool3, baseException4, baseException3, resource);
    }

    public final Boolean getRefreshFinish() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.refreshFinish;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRefreshFinish(Boolean bool) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.refreshFinish = bool;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.loading;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setLoading(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.loading = z;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
    }

    public final Boolean getChangeCurrencySuccess() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Boolean bool = this.changeCurrencySuccess;
        int i4 = i3 + 33;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return bool;
    }

    public final void setChangeCurrencySuccess(Boolean bool) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.changeCurrencySuccess = bool;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return baseException;
    }

    public final void setException(BaseException baseException) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.exception = baseException;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 41;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
    }

    public final BaseException getChangeCurrencyException() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.changeCurrencyException;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return baseException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setChangeCurrencyException(BaseException baseException) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.changeCurrencyException = baseException;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Resource<List<MultiBalanceItem>> getMultiBalance() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Resource<List<MultiBalanceItem>> resource = this.multiBalance;
        int i4 = i2 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return resource;
    }

    public final void setMultiBalance(Resource<List<MultiBalanceItem>> resource) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resource, "");
            this.multiBalance = resource;
            throw null;
        }
        Intrinsics.checkNotNullParameter(resource, "");
        this.multiBalance = resource;
        int i3 = component1 + 79;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
    }

    public BalanceUiState(Boolean bool, boolean z, Boolean bool2, BaseException baseException, BaseException baseException2, Resource<List<MultiBalanceItem>> resource) {
        Intrinsics.checkNotNullParameter(resource, "");
        this.refreshFinish = bool;
        this.loading = z;
        this.changeCurrencySuccess = bool2;
        this.exception = baseException;
        this.changeCurrencyException = baseException2;
        this.multiBalance = resource;
    }

    public BalanceUiState() {
        this(null, false, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BalanceUiState copy$default(BalanceUiState balanceUiState, Boolean bool, boolean z, Boolean bool2, BaseException baseException, BaseException baseException2, Resource resource, int i, Object obj) {
        boolean z2;
        BaseException baseException3;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 5;
        component1 = i4 % 128;
        Boolean bool3 = (i4 % 2 == 0 && (i & 1) != 0) ? balanceUiState.refreshFinish : bool;
        if ((i & 2) != 0) {
            z2 = balanceUiState.loading;
            int i5 = i3 + 63;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z2 = z;
        }
        Boolean bool4 = (i & 4) != 0 ? balanceUiState.changeCurrencySuccess : bool2;
        BaseException baseException4 = (i & 8) != 0 ? balanceUiState.exception : baseException;
        if ((i & 16) != 0) {
            int i7 = i3 + 41;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                BaseException baseException5 = balanceUiState.changeCurrencyException;
                throw null;
            }
            baseException3 = balanceUiState.changeCurrencyException;
        } else {
            baseException3 = baseException2;
        }
        return balanceUiState.copy(bool3, z2, bool4, baseException4, baseException3, (i & 32) != 0 ? balanceUiState.multiBalance : resource);
    }

    public final Boolean component1() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.refreshFinish;
        }
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.loading;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Boolean component3() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.changeCurrencySuccess;
            int i4 = 97 / 0;
        } else {
            bool = this.changeCurrencySuccess;
        }
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final BaseException component4() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.exception;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BaseException component5() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.changeCurrencyException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Resource<List<MultiBalanceItem>> component6() {
        Resource<List<MultiBalanceItem>> resource;
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            resource = this.multiBalance;
            int i4 = 50 / 0;
        } else {
            resource = this.multiBalance;
        }
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return resource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BalanceUiState copy(Boolean refreshFinish, boolean loading, Boolean changeCurrencySuccess, BaseException exception, BaseException changeCurrencyException, Resource<List<MultiBalanceItem>> multiBalance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(multiBalance, "");
        BalanceUiState balanceUiState = new BalanceUiState(refreshFinish, loading, changeCurrencySuccess, exception, changeCurrencyException, multiBalance);
        int i2 = component2 + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return balanceUiState;
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
        if (!(other instanceof BalanceUiState)) {
            return false;
        }
        BalanceUiState balanceUiState = (BalanceUiState) other;
        if (!Intrinsics.areEqual(this.refreshFinish, balanceUiState.refreshFinish)) {
            int i2 = component2 + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.loading != balanceUiState.loading) {
            return false;
        }
        if (Intrinsics.areEqual(this.changeCurrencySuccess, balanceUiState.changeCurrencySuccess)) {
            if (!Intrinsics.areEqual(this.exception, balanceUiState.exception)) {
                return false;
            }
            if (Intrinsics.areEqual(this.changeCurrencyException, balanceUiState.changeCurrencyException)) {
                return Intrinsics.areEqual(this.multiBalance, balanceUiState.multiBalance);
            }
            int i4 = component2 + 95;
            component1 = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = component2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int i2 = 2 % 2;
        Boolean bool = this.refreshFinish;
        int iHashCode3 = 0;
        if (bool == null) {
            int i3 = component1 + 19;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        int iHashCode4 = Boolean.hashCode(this.loading);
        Boolean bool2 = this.changeCurrencySuccess;
        if (bool2 == null) {
            int i5 = component2 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool2.hashCode();
        }
        BaseException baseException = this.exception;
        int iHashCode5 = baseException == null ? 0 : baseException.hashCode();
        BaseException baseException2 = this.changeCurrencyException;
        if (baseException2 == null) {
            i = component2 + 63;
            component1 = i % 128;
        } else {
            iHashCode3 = baseException2.hashCode();
            i = component1 + 33;
            component2 = i % 128;
        }
        int i7 = i % 2;
        return (((((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + this.multiBalance.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceUiState(refreshFinish=" + this.refreshFinish + ", loading=" + this.loading + ", changeCurrencySuccess=" + this.changeCurrencySuccess + ", exception=" + this.exception + ", changeCurrencyException=" + this.changeCurrencyException + ", multiBalance=" + this.multiBalance + ")";
        int i2 = component2 + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
