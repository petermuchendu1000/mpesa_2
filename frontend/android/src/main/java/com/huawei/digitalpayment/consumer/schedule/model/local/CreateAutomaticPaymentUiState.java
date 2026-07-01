package com.huawei.digitalpayment.consumer.schedule.model.local;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/local/CreateAutomaticPaymentUiState;", "", "loading", "", "createScheduleSuccess", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "elements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "billerTypeInfos", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/BillerTypeInfo;", "<init>", "(ZZLcom/huawei/common/exception/BaseException;Ljava/util/List;Ljava/util/List;)V", "getLoading", "()Z", "getCreateScheduleSuccess", "getException", "()Lcom/huawei/common/exception/BaseException;", "getElements", "()Ljava/util/List;", "getBillerTypeInfos", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateAutomaticPaymentUiState {
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final BaseException ShareDataUIState;
    private final boolean component1;
    private final boolean component2;
    private final List<DynamicsElement> component3;
    private final List<BillerTypeInfo> copydefault;

    public CreateAutomaticPaymentUiState(boolean z, boolean z2, BaseException baseException, List<DynamicsElement> list, List<BillerTypeInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.component2 = z;
        this.component1 = z2;
        this.ShareDataUIState = baseException;
        this.component3 = list;
        this.copydefault = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateAutomaticPaymentUiState(boolean z, boolean z2, BaseException baseException, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BaseException baseException2;
        List listEmptyList;
        boolean z3 = (i & 1) != 0 ? false : z;
        boolean z4 = (i & 2) != 0 ? false : z2;
        Object obj = null;
        if ((i & 4) != 0) {
            int i2 = getAsAtTimestamp + 87;
            equals = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            baseException2 = null;
        } else {
            baseException2 = baseException;
        }
        if ((i & 8) != 0) {
            int i5 = getAsAtTimestamp + 75;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            list = CollectionsKt.emptyList();
            int i6 = 2 % 2;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            int i7 = equals + 15;
            getAsAtTimestamp = i7 % 128;
            if (i7 % 2 != 0) {
                listEmptyList = CollectionsKt.emptyList();
                int i8 = 58 / 0;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            list2 = listEmptyList;
            int i9 = 2 % 2;
        }
        this(z3, z4, baseException2, list3, list2);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 25;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getCreateScheduleSuccess() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 49;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return z;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        BaseException baseException = this.ShareDataUIState;
        int i5 = i3 + 113;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return baseException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<DynamicsElement> getElements() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 119;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<DynamicsElement> list = this.component3;
        int i5 = i2 + 65;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BillerTypeInfo> getBillerTypeInfos() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public CreateAutomaticPaymentUiState() {
        this(false, false, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CreateAutomaticPaymentUiState copy$default(CreateAutomaticPaymentUiState createAutomaticPaymentUiState, boolean z, boolean z2, BaseException baseException, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 41;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z3 = createAutomaticPaymentUiState.component2;
                throw null;
            }
            z = createAutomaticPaymentUiState.component2;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = createAutomaticPaymentUiState.component1;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            baseException = createAutomaticPaymentUiState.ShareDataUIState;
        }
        BaseException baseException2 = baseException;
        if ((i & 8) != 0) {
            list = createAutomaticPaymentUiState.component3;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            int i4 = equals + 83;
            int i5 = i4 % 128;
            getAsAtTimestamp = i5;
            int i6 = i4 % 2;
            list2 = createAutomaticPaymentUiState.copydefault;
            int i7 = i5 + 75;
            equals = i7 % 128;
            int i8 = i7 % 2;
        }
        return createAutomaticPaymentUiState.copy(z4, z5, baseException2, list3, list2);
    }

    public final boolean component1() {
        boolean z;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            z = this.component2;
            int i4 = 6 / 0;
        } else {
            z = this.component2;
        }
        int i5 = i3 + 69;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 63;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component1;
        int i4 = i2 + 13;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return z;
    }

    public final BaseException component3() {
        int i = 2 % 2;
        int i2 = equals + 11;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseException baseException = this.ShareDataUIState;
        int i4 = i3 + 1;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return baseException;
    }

    public final List<DynamicsElement> component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 97;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<DynamicsElement> list = this.component3;
        int i5 = i2 + 37;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<BillerTypeInfo> component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<BillerTypeInfo> list = this.copydefault;
        int i5 = i3 + 37;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CreateAutomaticPaymentUiState copy(boolean loading, boolean createScheduleSuccess, BaseException exception, List<DynamicsElement> elements, List<BillerTypeInfo> billerTypeInfos) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(elements, "");
        Intrinsics.checkNotNullParameter(billerTypeInfos, "");
        CreateAutomaticPaymentUiState createAutomaticPaymentUiState = new CreateAutomaticPaymentUiState(loading, createScheduleSuccess, exception, elements, billerTypeInfos);
        int i2 = getAsAtTimestamp + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return createAutomaticPaymentUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAutomaticPaymentUiState)) {
            int i4 = i3 + 83;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        CreateAutomaticPaymentUiState createAutomaticPaymentUiState = (CreateAutomaticPaymentUiState) other;
        if (this.component2 != createAutomaticPaymentUiState.component2) {
            return false;
        }
        if (this.component1 != createAutomaticPaymentUiState.component1) {
            int i6 = i3 + 63;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, createAutomaticPaymentUiState.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, createAutomaticPaymentUiState.component3)) {
            int i8 = equals + 95;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, createAutomaticPaymentUiState.copydefault)) {
            int i10 = equals + 117;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = getAsAtTimestamp + 65;
        equals = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 77 / 0;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Boolean.hashCode(this.component2);
        int iHashCode3 = Boolean.hashCode(this.component1);
        BaseException baseException = this.ShareDataUIState;
        if (baseException == null) {
            int i4 = getAsAtTimestamp + 123;
            equals = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreateAutomaticPaymentUiState(loading=" + this.component2 + ", createScheduleSuccess=" + this.component1 + ", exception=" + this.ShareDataUIState + ", elements=" + this.component3 + ", billerTypeInfos=" + this.copydefault + ")";
        int i2 = getAsAtTimestamp + 101;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
