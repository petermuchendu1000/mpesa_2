package com.huawei.digitalpayment.consumer.schedule.model.local;

import java.io.Serializable;
import kotlin.ComponentDialogExternalSyntheticApiModelOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onBackPressedDispatcherlambda1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "Ljava/io/Serializable;", "transactionType", "", "transactionName", "transactionIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTransactionType", "()Ljava/lang/String;", "getTransactionName", "getTransactionIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SchedulePaymentType implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String transactionIcon;
    private final String transactionName;
    private final String transactionType;

    public SchedulePaymentType(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.transactionType = str;
        this.transactionName = str2;
        this.transactionIcon = str3;
    }

    public final String getTransactionType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionType;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransactionName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionName;
        int i5 = i2 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTransactionIcon() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.transactionIcon;
            int i4 = 86 / 0;
        } else {
            str = this.transactionIcon;
        }
        int i5 = i2 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static SchedulePaymentType copy$default(SchedulePaymentType schedulePaymentType, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 75;
        component2 = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = schedulePaymentType.transactionType;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = i3 + 23;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                String str4 = schedulePaymentType.transactionName;
                throw null;
            }
            str2 = schedulePaymentType.transactionName;
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 19;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str5 = schedulePaymentType.transactionIcon;
                obj2.hashCode();
                throw null;
            }
            str3 = schedulePaymentType.transactionIcon;
        }
        return schedulePaymentType.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.transactionType;
        int i4 = i3 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.transactionName;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.transactionIcon;
        int i4 = i3 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final SchedulePaymentType copy(String transactionType, String transactionName, String transactionIcon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(transactionName, "");
        Intrinsics.checkNotNullParameter(transactionIcon, "");
        SchedulePaymentType schedulePaymentType = new SchedulePaymentType(transactionType, transactionName, transactionIcon);
        int i2 = ShareDataUIState + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return schedulePaymentType;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 57;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SchedulePaymentType)) {
            return false;
        }
        SchedulePaymentType schedulePaymentType = (SchedulePaymentType) other;
        if ((!Intrinsics.areEqual(this.transactionType, schedulePaymentType.transactionType)) || !Intrinsics.areEqual(this.transactionName, schedulePaymentType.transactionName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.transactionIcon, schedulePaymentType.transactionIcon)) {
            return true;
        }
        int i7 = ShareDataUIState + 89;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.transactionType.hashCode() / 77) / this.transactionName.hashCode()) * 12) >> this.transactionIcon.hashCode() : (((this.transactionType.hashCode() * 31) + this.transactionName.hashCode()) * 31) + this.transactionIcon.hashCode();
        int i3 = ShareDataUIState + 55;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SchedulePaymentType(transactionType=" + this.transactionType + ", transactionName=" + this.transactionName + ", transactionIcon=" + this.transactionIcon + ")";
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static void copydefault() {
        onBackPressedDispatcherlambda1.component2[0] = ComponentDialogExternalSyntheticApiModelOutline0.copydefault[0];
    }
}
