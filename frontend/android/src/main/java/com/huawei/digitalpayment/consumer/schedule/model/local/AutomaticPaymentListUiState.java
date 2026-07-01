package com.huawei.digitalpayment.consumer.schedule.model.local;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/local/AutomaticPaymentListUiState;", "", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "schedulePayments", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;", "<init>", "(ZLcom/huawei/common/exception/BaseException;Ljava/util/List;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getSchedulePayments", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutomaticPaymentListUiState {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final List<LocalScheduleModel> component1;
    private final BaseException component2;
    private final boolean copydefault;

    public AutomaticPaymentListUiState(boolean z, BaseException baseException, List<LocalScheduleModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.component2 = baseException;
        this.component1 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AutomaticPaymentListUiState(boolean z, BaseException baseException, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 71;
            int i5 = i4 % 128;
            component3 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 81;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            baseException = null;
        }
        if ((i & 4) != 0) {
            int i9 = component3 + 63;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            list = CollectionsKt.emptyList();
        }
        this(z, baseException, list);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.component2;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return baseException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<LocalScheduleModel> getSchedulePayments() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalScheduleModel> list = this.component1;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public AutomaticPaymentListUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AutomaticPaymentListUiState copy$default(AutomaticPaymentListUiState automaticPaymentListUiState, boolean z, BaseException baseException, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 53;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            z = automaticPaymentListUiState.copydefault;
        }
        if ((i & 2) != 0) {
            baseException = automaticPaymentListUiState.component2;
        }
        if ((i & 4) != 0) {
            int i5 = component3 + 39;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                List<LocalScheduleModel> list2 = automaticPaymentListUiState.component1;
                throw null;
            }
            list = automaticPaymentListUiState.component1;
        }
        AutomaticPaymentListUiState automaticPaymentListUiStateCopy = automaticPaymentListUiState.copy(z, baseException, list);
        int i6 = ShareDataUIState + 75;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return automaticPaymentListUiStateCopy;
        }
        throw null;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        BaseException baseException = this.component2;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return baseException;
    }

    public final List<LocalScheduleModel> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<LocalScheduleModel> list = this.component1;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final AutomaticPaymentListUiState copy(boolean loading, BaseException exception, List<LocalScheduleModel> schedulePayments) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(schedulePayments, "");
        AutomaticPaymentListUiState automaticPaymentListUiState = new AutomaticPaymentListUiState(loading, exception, schedulePayments);
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return automaticPaymentListUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AutomaticPaymentListUiState)) {
            return false;
        }
        AutomaticPaymentListUiState automaticPaymentListUiState = (AutomaticPaymentListUiState) other;
        if (this.copydefault != automaticPaymentListUiState.copydefault) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, automaticPaymentListUiState.component2)) {
            int i4 = ShareDataUIState + 91;
            component3 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component1, automaticPaymentListUiState.component1)) {
            return false;
        }
        int i5 = ShareDataUIState + 67;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 91 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Boolean.hashCode(this.copydefault);
        BaseException baseException = this.component2;
        if (baseException == null) {
            int i3 = ShareDataUIState + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = baseException.hashCode();
            int i5 = ShareDataUIState + 109;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (((iHashCode * 31) + i) * 31) + this.component1.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutomaticPaymentListUiState(loading=" + this.copydefault + ", exception=" + this.component2 + ", schedulePayments=" + this.component1 + ")";
        int i2 = component3 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
