package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PaySettingUiState;", "Lcom/huawei/http/BaseResp;", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "showFingerprint", "showFaceId", "isOpenFingerprint", "isOpenFaceId", Keys.KEY_IS_SUCCESS, "operator", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PayOperator;", "<init>", "(ZLcom/huawei/common/exception/BaseException;ZZZZZLcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PayOperator;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getShowFingerprint", "getShowFaceId", "getOperator", "()Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PayOperator;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaySettingUiState extends BaseResp {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final BaseException exception;
    private final boolean isOpenFaceId;
    private final boolean isOpenFingerprint;
    private final boolean isSuccess;
    private final boolean loading;
    private final PayOperator operator;
    private final boolean showFaceId;
    private final boolean showFingerprint;

    /* JADX WARN: Illegal instructions before constructor call */
    public PaySettingUiState(boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PayOperator payOperator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BaseException baseException2;
        boolean z7;
        boolean z8 = (i & 1) != 0 ? false : z;
        PayOperator payOperator2 = null;
        if ((i & 2) != 0) {
            int i2 = copydefault + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            baseException2 = null;
        } else {
            baseException2 = baseException;
        }
        boolean z9 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            int i5 = component1 + 45;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z7 = false;
        } else {
            z7 = z3;
        }
        boolean z10 = (i & 16) != 0 ? false : z4;
        boolean z11 = (i & 32) != 0 ? false : z5;
        boolean z12 = (i & 64) == 0 ? z6 : false;
        if ((i & 128) != 0) {
            int i8 = component1 + 1;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            payOperator2 = payOperator;
        }
        this(z8, baseException2, z9, z7, z10, z11, z12, payOperator2);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.loading;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return z;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.exception;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final boolean getShowFingerprint() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            z = this.showFingerprint;
            int i4 = 18 / 0;
        } else {
            z = this.showFingerprint;
        }
        int i5 = i3 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getShowFaceId() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.showFaceId;
            int i4 = 48 / 0;
        } else {
            z = this.showFaceId;
        }
        int i5 = i2 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isOpenFingerprint() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isOpenFingerprint;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return z;
    }

    public final boolean isOpenFaceId() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isOpenFaceId;
        int i5 = i3 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isSuccess() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isSuccess;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return z;
    }

    public final PayOperator getOperator() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.operator;
        }
        throw null;
    }

    public PaySettingUiState(boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PayOperator payOperator) {
        this.loading = z;
        this.exception = baseException;
        this.showFingerprint = z2;
        this.showFaceId = z3;
        this.isOpenFingerprint = z4;
        this.isOpenFaceId = z5;
        this.isSuccess = z6;
        this.operator = payOperator;
    }

    public PaySettingUiState() {
        this(false, null, false, false, false, false, false, null, 255, null);
    }

    public static PaySettingUiState copy$default(PaySettingUiState paySettingUiState, boolean z, BaseException baseException, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PayOperator payOperator, int i, Object obj) {
        boolean z7;
        BaseException baseException2;
        boolean z8;
        PayOperator payOperator2;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component1 + 7;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z9 = paySettingUiState.loading;
                throw null;
            }
            z7 = paySettingUiState.loading;
        } else {
            z7 = z;
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 51;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            baseException2 = paySettingUiState.exception;
        } else {
            baseException2 = baseException;
        }
        boolean z10 = (i & 4) != 0 ? paySettingUiState.showFingerprint : z2;
        boolean z11 = (i & 8) != 0 ? paySettingUiState.showFaceId : z3;
        boolean z12 = (i & 16) != 0 ? paySettingUiState.isOpenFingerprint : z4;
        if ((i & 32) != 0) {
            int i6 = component1 + 3;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z13 = paySettingUiState.isOpenFaceId;
                obj2.hashCode();
                throw null;
            }
            z8 = paySettingUiState.isOpenFaceId;
        } else {
            z8 = z5;
        }
        boolean z14 = (i & 64) != 0 ? paySettingUiState.isSuccess : z6;
        if ((i & 128) != 0) {
            int i7 = copydefault + 61;
            int i8 = i7 % 128;
            component1 = i8;
            int i9 = i7 % 2;
            payOperator2 = paySettingUiState.operator;
            int i10 = i8 + 49;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            payOperator2 = payOperator;
        }
        return paySettingUiState.copy(z7, baseException2, z10, z11, z12, z8, z14, payOperator2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.loading;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        BaseException baseException = this.exception;
        int i4 = i2 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return baseException;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.showFingerprint;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return z;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.showFaceId;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.isOpenFingerprint;
        int i4 = i3 + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isOpenFaceId;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return z;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isSuccess;
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PayOperator component8() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        PayOperator payOperator = this.operator;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return payOperator;
        }
        throw null;
    }

    public final PaySettingUiState copy(boolean loading, BaseException exception, boolean showFingerprint, boolean showFaceId, boolean isOpenFingerprint, boolean isOpenFaceId, boolean isSuccess, PayOperator operator) {
        int i = 2 % 2;
        PaySettingUiState paySettingUiState = new PaySettingUiState(loading, exception, showFingerprint, showFaceId, isOpenFingerprint, isOpenFaceId, isSuccess, operator);
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return paySettingUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 109;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof PaySettingUiState)) {
            int i3 = component1 + 29;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        PaySettingUiState paySettingUiState = (PaySettingUiState) other;
        if (this.loading != paySettingUiState.loading) {
            int i5 = copydefault + 107;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.exception, paySettingUiState.exception) || this.showFingerprint != paySettingUiState.showFingerprint) {
            return false;
        }
        if (this.showFaceId != paySettingUiState.showFaceId) {
            int i7 = component1 + 33;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.isOpenFingerprint != paySettingUiState.isOpenFingerprint) {
            int i9 = component1 + 31;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.isOpenFaceId != paySettingUiState.isOpenFaceId) {
            int i11 = copydefault + 99;
            component1 = i11 % 128;
            return i11 % 2 != 0;
        }
        if (this.isSuccess != paySettingUiState.isSuccess) {
            return false;
        }
        if (this.operator == paySettingUiState.operator) {
            return true;
        }
        int i12 = copydefault + 57;
        component1 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
  0x002f: PHI (r1v22 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r3v6 com.huawei.common.exception.BaseException) = (r3v0 com.huawei.common.exception.BaseException), (r3v8 com.huawei.common.exception.BaseException) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v24 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.copydefault
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            boolean r1 = r9.loading
            int r1 = java.lang.Boolean.hashCode(r1)
            com.huawei.common.exception.BaseException r3 = r9.exception
            if (r3 != 0) goto L2f
            goto L24
        L1a:
            boolean r1 = r9.loading
            int r1 = java.lang.Boolean.hashCode(r1)
            com.huawei.common.exception.BaseException r3 = r9.exception
            if (r3 != 0) goto L2f
        L24:
            int r3 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.component1
            int r3 = r3 + 33
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.copydefault = r4
            int r3 = r3 % r0
            r3 = r2
            goto L3c
        L2f:
            int r3 = r3.hashCode()
            int r4 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.copydefault
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.component1 = r5
            int r4 = r4 % r0
        L3c:
            boolean r0 = r9.showFingerprint
            int r0 = java.lang.Boolean.hashCode(r0)
            boolean r4 = r9.showFaceId
            int r4 = java.lang.Boolean.hashCode(r4)
            boolean r5 = r9.isOpenFingerprint
            int r5 = java.lang.Boolean.hashCode(r5)
            boolean r6 = r9.isOpenFaceId
            int r6 = java.lang.Boolean.hashCode(r6)
            boolean r7 = r9.isSuccess
            int r7 = java.lang.Boolean.hashCode(r7)
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.PayOperator r8 = r9.operator
            if (r8 != 0) goto L5f
            goto L63
        L5f:
            int r2 = r8.hashCode()
        L63:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r7
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PaySettingUiState(loading=" + this.loading + ", exception=" + this.exception + ", showFingerprint=" + this.showFingerprint + ", showFaceId=" + this.showFaceId + ", isOpenFingerprint=" + this.isOpenFingerprint + ", isOpenFaceId=" + this.isOpenFaceId + ", isSuccess=" + this.isSuccess + ", operator=" + this.operator + ")";
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
