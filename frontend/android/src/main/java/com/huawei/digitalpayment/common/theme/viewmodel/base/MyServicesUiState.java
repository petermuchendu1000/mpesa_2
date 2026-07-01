package com.huawei.digitalpayment.common.theme.viewmodel.base;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.common.theme.data.FunctionResp;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/MyServicesUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", "refreshSuccess", "data", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "<init>", "(ZLjava/lang/Boolean;Ljava/util/List;Lcom/huawei/common/exception/BaseException;)V", "getLoading", "()Z", "getRefreshSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getData", "()Ljava/util/List;", "getException", "()Lcom/huawei/common/exception/BaseException;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Boolean;Ljava/util/List;Lcom/huawei/common/exception/BaseException;)Lcom/huawei/digitalpayment/common/theme/viewmodel/base/MyServicesUiState;", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MyServicesUiState extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final List<FunctionResp> data;
    private final BaseException exception;
    private final boolean loading;
    private final Boolean refreshSuccess;

    /* JADX WARN: Illegal instructions before constructor call */
    public MyServicesUiState(boolean z, Boolean bool, List list, BaseException baseException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            z = i2 % 2 != 0;
            int i3 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 35;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            bool = null;
        }
        if ((i & 4) != 0) {
            int i7 = component2 + 113;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 5;
            } else {
                int i9 = 2 % 2;
            }
            list = null;
        }
        if ((i & 8) != 0) {
            int i10 = component2 + 109;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            baseException = null;
        }
        this(z, bool, list, baseException);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loading;
        }
        throw null;
    }

    public final Boolean getRefreshSuccess() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.refreshSuccess;
            int i4 = 95 / 0;
        } else {
            bool = this.refreshSuccess;
        }
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final List<FunctionResp> getData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<FunctionResp> list = this.data;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.exception;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyServicesUiState(boolean z, Boolean bool, List<? extends FunctionResp> list, BaseException baseException) {
        this.loading = z;
        this.refreshSuccess = bool;
        this.data = list;
        this.exception = baseException;
    }

    public MyServicesUiState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MyServicesUiState copy$default(MyServicesUiState myServicesUiState, boolean z, Boolean bool, List list, BaseException baseException, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            z = myServicesUiState.loading;
            int i5 = i3 + 19;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            bool = myServicesUiState.refreshSuccess;
        }
        if ((i & 4) != 0) {
            int i7 = copydefault + 57;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                list = myServicesUiState.data;
                int i8 = 99 / 0;
            } else {
                list = myServicesUiState.data;
            }
        }
        if ((i & 8) != 0) {
            baseException = myServicesUiState.exception;
        }
        return myServicesUiState.copy(z, bool, list, baseException);
    }

    public final boolean component1() {
        boolean z;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.loading;
            int i4 = 34 / 0;
        } else {
            z = this.loading;
        }
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.refreshSuccess;
        int i5 = i3 + 51;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final List<FunctionResp> component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<FunctionResp> list = this.data;
        int i4 = i2 + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final BaseException component4() {
        BaseException baseException;
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            baseException = this.exception;
            int i4 = 93 / 0;
        } else {
            baseException = this.exception;
        }
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return baseException;
    }

    public final MyServicesUiState copy(boolean loading, Boolean refreshSuccess, List<? extends FunctionResp> data, BaseException exception) {
        int i = 2 % 2;
        MyServicesUiState myServicesUiState = new MyServicesUiState(loading, refreshSuccess, data, exception);
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return myServicesUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyServicesUiState)) {
            return false;
        }
        MyServicesUiState myServicesUiState = (MyServicesUiState) other;
        if (this.loading != myServicesUiState.loading) {
            return false;
        }
        if (!Intrinsics.areEqual(this.refreshSuccess, myServicesUiState.refreshSuccess)) {
            int i3 = component2 + 15;
            copydefault = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.data, myServicesUiState.data)) {
            return Intrinsics.areEqual(this.exception, myServicesUiState.exception);
        }
        int i4 = component2 + 1;
        copydefault = i4 % 128;
        return i4 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3 r4
  0x0028: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v3 java.lang.Boolean) = (r3v0 java.lang.Boolean), (r3v5 java.lang.Boolean) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r1 r4
  0x0026: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.component2
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1b
            boolean r1 = r7.loading
            int r1 = java.lang.Boolean.hashCode(r1)
            java.lang.Boolean r3 = r7.refreshSuccess
            r4 = 1
            if (r3 != 0) goto L28
            goto L26
        L1b:
            boolean r1 = r7.loading
            int r1 = java.lang.Boolean.hashCode(r1)
            java.lang.Boolean r3 = r7.refreshSuccess
            r4 = r2
            if (r3 != 0) goto L28
        L26:
            r3 = r2
            goto L35
        L28:
            int r3 = r3.hashCode()
            int r5 = com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.copydefault
            int r5 = r5 + 65
            int r6 = r5 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.component2 = r6
            int r5 = r5 % r0
        L35:
            java.util.List<com.huawei.digitalpayment.common.theme.data.FunctionResp> r5 = r7.data
            if (r5 != 0) goto L3a
            goto L3e
        L3a:
            int r2 = r5.hashCode()
        L3e:
            com.huawei.common.exception.BaseException r5 = r7.exception
            if (r5 != 0) goto L4c
            int r5 = com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.copydefault
            int r5 = r5 + 45
            int r6 = r5 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.component2 = r6
            int r5 = r5 % r0
            goto L50
        L4c:
            int r4 = r5.hashCode()
        L50:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.MyServicesUiState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyServicesUiState(loading=" + this.loading + ", refreshSuccess=" + this.refreshSuccess + ", data=" + this.data + ", exception=" + this.exception + ")";
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
