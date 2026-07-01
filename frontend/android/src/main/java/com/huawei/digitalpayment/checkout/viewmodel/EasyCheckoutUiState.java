package com.huawei.digitalpayment.checkout.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/checkout/viewmodel/EasyCheckoutUiState;", "", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "checkoutResp", "Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "<init>", "(ZLcom/huawei/common/exception/BaseException;Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getCheckoutResp", "()Lcom/huawei/digitalpayment/checkout/model/response/CheckoutResp;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "CustomerCheckOutModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EasyCheckoutUiState {
    private static int component1 = 0;
    private static int component3 = 1;
    private final BaseException ShareDataUIState;
    private final CheckoutResp component2;
    private final boolean copydefault;

    public EasyCheckoutUiState(boolean z, BaseException baseException, CheckoutResp checkoutResp) {
        this.copydefault = z;
        this.ShareDataUIState = baseException;
        this.component2 = checkoutResp;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EasyCheckoutUiState(boolean z, BaseException baseException, CheckoutResp checkoutResp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        Object obj = null;
        baseException = (i & 2) != 0 ? null : baseException;
        if ((i & 4) != 0) {
            int i5 = component3 + 45;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            checkoutResp = null;
        }
        this(z, baseException, checkoutResp);
    }

    public final boolean getLoading() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.copydefault;
            int i4 = 91 / 0;
        } else {
            z = this.copydefault;
        }
        int i5 = i2 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.ShareDataUIState;
        int i5 = i2 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final CheckoutResp getCheckoutResp() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        CheckoutResp checkoutResp = this.component2;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return checkoutResp;
        }
        throw null;
    }

    public EasyCheckoutUiState() {
        this(false, null, null, 7, null);
    }

    public static EasyCheckoutUiState copy$default(EasyCheckoutUiState easyCheckoutUiState, boolean z, BaseException baseException, CheckoutResp checkoutResp, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            z = easyCheckoutUiState.copydefault;
        }
        if ((i & 2) != 0) {
            baseException = easyCheckoutUiState.ShareDataUIState;
            int i3 = component3 + 85;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = component3 + 77;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                CheckoutResp checkoutResp2 = easyCheckoutUiState.component2;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            checkoutResp = easyCheckoutUiState.component2;
        }
        return easyCheckoutUiState.copy(z, baseException, checkoutResp);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.copydefault;
        int i4 = i2 + 9;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        BaseException baseException = this.ShareDataUIState;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final CheckoutResp component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        CheckoutResp checkoutResp = this.component2;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return checkoutResp;
    }

    public final EasyCheckoutUiState copy(boolean loading, BaseException exception, CheckoutResp checkoutResp) {
        int i = 2 % 2;
        EasyCheckoutUiState easyCheckoutUiState = new EasyCheckoutUiState(loading, exception, checkoutResp);
        int i2 = component3 + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return easyCheckoutUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 85;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof EasyCheckoutUiState)) {
            int i3 = component1 + 67;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        EasyCheckoutUiState easyCheckoutUiState = (EasyCheckoutUiState) other;
        if (this.copydefault != easyCheckoutUiState.copydefault) {
            int i5 = component1 + 15;
            component3 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, easyCheckoutUiState.ShareDataUIState)) {
            return Intrinsics.areEqual(this.component2, easyCheckoutUiState.component2);
        }
        int i6 = component1 + 95;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.copydefault);
        BaseException baseException = this.ShareDataUIState;
        int iHashCode2 = 0;
        int iHashCode3 = baseException == null ? 0 : baseException.hashCode();
        CheckoutResp checkoutResp = this.component2;
        if (checkoutResp == null) {
            int i4 = component3 + 17;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = checkoutResp.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyCheckoutUiState(loading=" + this.copydefault + ", exception=" + this.ShareDataUIState + ", checkoutResp=" + this.component2 + ")";
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
