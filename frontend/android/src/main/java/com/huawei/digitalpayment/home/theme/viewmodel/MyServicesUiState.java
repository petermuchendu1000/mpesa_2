package com.huawei.digitalpayment.home.theme.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/viewmodel/MyServicesUiState;", "", "loading", "", "refreshSuccess", "data", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "<init>", "(ZLjava/lang/Boolean;Ljava/util/List;Lcom/huawei/common/exception/BaseException;)V", "getLoading", "()Z", "getRefreshSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData", "()Ljava/util/List;", "getException", "()Lcom/huawei/common/exception/BaseException;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Boolean;Ljava/util/List;Lcom/huawei/common/exception/BaseException;)Lcom/huawei/digitalpayment/home/theme/viewmodel/MyServicesUiState;", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyServicesUiState {
    private static int ShareDataUIState = 0;
    private static int getRequestBeneficiariesState = 1;
    private final Boolean component1;
    private final boolean component2;
    private final BaseException component3;
    private final List<LocalHomeFunction> copydefault;

    public MyServicesUiState(boolean z, Boolean bool, List<LocalHomeFunction> list, BaseException baseException) {
        this.component2 = z;
        this.component1 = bool;
        this.copydefault = list;
        this.component3 = baseException;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MyServicesUiState(boolean z, Boolean bool, List list, BaseException baseException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 103;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i7 = 2 % 2;
            bool = null;
        }
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            list = null;
        }
        this(z, bool, list, (i & 8) != 0 ? null : baseException);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 51;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return z;
    }

    public final Boolean getRefreshSuccess() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.component1;
        int i5 = i2 + 101;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final List<LocalHomeFunction> getData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        BaseException baseException = this.component3;
        int i4 = i2 + 59;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return baseException;
    }

    public MyServicesUiState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MyServicesUiState copy$default(MyServicesUiState myServicesUiState, boolean z, Boolean bool, List list, BaseException baseException, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            z = myServicesUiState.component2;
        }
        if ((i & 2) != 0) {
            bool = myServicesUiState.component1;
        }
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 25;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            list = myServicesUiState.copydefault;
        }
        if ((i & 8) != 0) {
            int i7 = getRequestBeneficiariesState + 91;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                baseException = myServicesUiState.component3;
                int i8 = 61 / 0;
            } else {
                baseException = myServicesUiState.component3;
            }
        }
        return myServicesUiState.copy(z, bool, list, baseException);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.component1;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return bool;
    }

    public final List<LocalHomeFunction> component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.copydefault;
        int i5 = i3 + 77;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BaseException component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        BaseException baseException = this.component3;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return baseException;
    }

    public final MyServicesUiState copy(boolean loading, Boolean refreshSuccess, List<LocalHomeFunction> data, BaseException exception) {
        int i = 2 % 2;
        MyServicesUiState myServicesUiState = new MyServicesUiState(loading, refreshSuccess, data, exception);
        int i2 = getRequestBeneficiariesState + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return myServicesUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getRequestBeneficiariesState + 117;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            boolean z = !(i2 % 2 != 0);
            int i4 = i3 + 21;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        if (!(other instanceof MyServicesUiState)) {
            int i6 = ShareDataUIState + 61;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        MyServicesUiState myServicesUiState = (MyServicesUiState) other;
        if (this.component2 != myServicesUiState.component2) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, myServicesUiState.component1)) {
            int i8 = ShareDataUIState + 79;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, myServicesUiState.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, myServicesUiState.component3)) {
            int i10 = getRequestBeneficiariesState + 117;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = getRequestBeneficiariesState + 99;
        ShareDataUIState = i12 % 128;
        if (i12 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Boolean.hashCode(this.component2);
        Boolean bool = this.component1;
        if (bool == null) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
            int i7 = ShareDataUIState + 9;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
        }
        List<LocalHomeFunction> list = this.copydefault;
        if (list == null) {
            int i9 = getRequestBeneficiariesState + 47;
            int i10 = i9 % 128;
            ShareDataUIState = i10;
            iHashCode2 = (i9 % 2 != 0 ? 0 : 1) ^ 1;
            int i11 = i10 + 1;
            getRequestBeneficiariesState = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iHashCode2 = list.hashCode();
        }
        BaseException baseException = this.component3;
        int iHashCode4 = (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (baseException != null ? baseException.hashCode() : 0);
        int i13 = ShareDataUIState + 109;
        getRequestBeneficiariesState = i13 % 128;
        if (i13 % 2 != 0) {
            return iHashCode4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyServicesUiState(loading=" + this.component2 + ", refreshSuccess=" + this.component1 + ", data=" + this.copydefault + ", exception=" + this.component3 + ")";
        int i2 = getRequestBeneficiariesState + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
