package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudTicket;", "", "ticketNumber", "", "status", "reportedOn", "reportedNumber", "amountLost", "obNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTicketNumber", "()Ljava/lang/String;", "getStatus", "getReportedOn", "getReportedNumber", "getAmountLost", "getObNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudTicket {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 123 % 128;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String copydefault;
    private final String equals;

    public FraudTicket(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.equals = str;
        this.component3 = str2;
        this.copydefault = str3;
        this.component1 = str4;
        this.ShareDataUIState = str5;
        this.component2 = str6;
    }

    public final String getTicketNumber() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component4 + 79;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return str;
    }

    public final String getReportedOn() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 99;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReportedNumber() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public final String getAmountLost() {
        int i = 2 % 2;
        int i2 = component4 + 47;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 95;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getObNumber() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 43;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (123 % 2 == 0) {
            int i = 54 / 0;
        }
    }

    public static FraudTicket copy$default(FraudTicket fraudTicket, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 119;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        String str9 = (i & 1) != 0 ? fraudTicket.equals : str;
        String str10 = (i & 2) != 0 ? fraudTicket.component3 : str2;
        if ((i & 4) != 0) {
            int i6 = i4 + 123;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                String str11 = fraudTicket.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str7 = fraudTicket.copydefault;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 7;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            str8 = fraudTicket.component1;
        } else {
            str8 = str4;
        }
        return fraudTicket.copy(str9, str10, str7, str8, (i & 16) != 0 ? fraudTicket.ShareDataUIState : str5, (i & 32) != 0 ? fraudTicket.component2 : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4 + 53;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 45;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 9;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 79;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 29;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component4 + 55;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 109;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 89;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 125;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FraudTicket copy(String ticketNumber, String status, String reportedOn, String reportedNumber, String amountLost, String obNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ticketNumber, "");
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(reportedOn, "");
        Intrinsics.checkNotNullParameter(reportedNumber, "");
        Intrinsics.checkNotNullParameter(amountLost, "");
        Intrinsics.checkNotNullParameter(obNumber, "");
        FraudTicket fraudTicket = new FraudTicket(ticketNumber, status, reportedOn, reportedNumber, amountLost, obNumber);
        int i2 = getAsAtTimestamp + 113;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return fraudTicket;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 107;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FraudTicket)) {
            return false;
        }
        FraudTicket fraudTicket = (FraudTicket) other;
        if (!Intrinsics.areEqual(this.equals, fraudTicket.equals)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, fraudTicket.component3)) {
            int i4 = component4 + 25;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.copydefault, fraudTicket.copydefault) || !Intrinsics.areEqual(this.component1, fraudTicket.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, fraudTicket.ShareDataUIState)) {
            int i5 = getAsAtTimestamp + 11;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, fraudTicket.component2)) {
            return true;
        }
        int i7 = component4 + 99;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.equals.hashCode() * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component2.hashCode();
        int i4 = component4 + 25;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FraudTicket(ticketNumber=" + this.equals + ", status=" + this.component3 + ", reportedOn=" + this.copydefault + ", reportedNumber=" + this.component1 + ", amountLost=" + this.ShareDataUIState + ", obNumber=" + this.component2 + ")";
        int i2 = getAsAtTimestamp + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
