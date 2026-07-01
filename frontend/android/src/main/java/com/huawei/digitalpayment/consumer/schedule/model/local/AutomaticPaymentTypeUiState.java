package com.huawei.digitalpayment.consumer.schedule.model.local;

import com.alibaba.griver.base.common.utils.ToastUtils;
import com.huawei.common.exception.BaseException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/local/AutomaticPaymentTypeUiState;", "", "loading", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "schedulePaymentTypes", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "<init>", "(ZLcom/huawei/common/exception/BaseException;Ljava/util/List;)V", "getLoading", "()Z", "getException", "()Lcom/huawei/common/exception/BaseException;", "getSchedulePaymentTypes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutomaticPaymentTypeUiState {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final boolean ShareDataUIState;
    private final BaseException component2;
    private final List<SchedulePaymentType> component3;

    public AutomaticPaymentTypeUiState(boolean z, BaseException baseException, List<SchedulePaymentType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = z;
        this.component2 = baseException;
        this.component3 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AutomaticPaymentTypeUiState(boolean z, BaseException baseException, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z = false;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i3 = component1 + 35;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            baseException = null;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 7;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i6 = component1 + 119;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
        }
        this(z, baseException, list);
    }

    public final boolean getLoading() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BaseException getException() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        BaseException baseException = this.component2;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final List<SchedulePaymentType> getSchedulePaymentTypes() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<SchedulePaymentType> list = this.component3;
        int i5 = i2 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public AutomaticPaymentTypeUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AutomaticPaymentTypeUiState copy$default(AutomaticPaymentTypeUiState automaticPaymentTypeUiState, boolean z, BaseException baseException, List list, int i, Object obj) {
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1;
            int i4 = i3 + 97;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                z2 = automaticPaymentTypeUiState.ShareDataUIState;
                int i5 = 20 / 0;
            } else {
                z2 = automaticPaymentTypeUiState.ShareDataUIState;
            }
            int i6 = i3 + 97;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            z = z2;
        }
        if ((i & 2) != 0) {
            baseException = automaticPaymentTypeUiState.component2;
        }
        if ((i & 4) != 0) {
            list = automaticPaymentTypeUiState.component3;
        }
        AutomaticPaymentTypeUiState automaticPaymentTypeUiStateCopy = automaticPaymentTypeUiState.copy(z, baseException, list);
        int i8 = copydefault + 67;
        component1 = i8 % 128;
        if (i8 % 2 == 0) {
            return automaticPaymentTypeUiStateCopy;
        }
        throw null;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 113;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final BaseException component2() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        BaseException baseException = this.component2;
        int i5 = i3 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return baseException;
    }

    public final List<SchedulePaymentType> component3() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<SchedulePaymentType> list = this.component3;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final AutomaticPaymentTypeUiState copy(boolean loading, BaseException exception, List<SchedulePaymentType> schedulePaymentTypes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(schedulePaymentTypes, "");
        AutomaticPaymentTypeUiState automaticPaymentTypeUiState = new AutomaticPaymentTypeUiState(loading, exception, schedulePaymentTypes);
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return automaticPaymentTypeUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 27;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof AutomaticPaymentTypeUiState)) {
            return false;
        }
        AutomaticPaymentTypeUiState automaticPaymentTypeUiState = (AutomaticPaymentTypeUiState) other;
        if (this.ShareDataUIState != automaticPaymentTypeUiState.ShareDataUIState || !Intrinsics.areEqual(this.component2, automaticPaymentTypeUiState.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, automaticPaymentTypeUiState.component3)) {
            int i3 = copydefault + 103;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = component1 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        BaseException baseException = this.component2;
        if (baseException == null) {
            int i2 = component1;
            int i3 = i2 + 123;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = baseException.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + this.component3.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutomaticPaymentTypeUiState(loading=" + this.ShareDataUIState + ", exception=" + this.component2 + ", schedulePaymentTypes=" + this.component3 + ")";
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
