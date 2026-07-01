package com.huawei.digitalpayment.consumer.sfcui.statement.model;

import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/model/VerifyStatementPayload;", "", "channel", "", CheckIdentityActivity.ID_NUMBER, "totalPaidInAmount", "totalPaidOutAmount", "verificationCode", "verifyingMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getIdNumber", "getTotalPaidInAmount", "getTotalPaidOutAmount", "getVerificationCode", "getVerifyingMsisdn", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyStatementPayload {
    public static final int $stable = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final String copydefault;

    public VerifyStatementPayload(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.copydefault = str;
        this.ShareDataUIState = str2;
        this.component1 = str3;
        this.component2 = str4;
        this.component3 = str5;
        this.component4 = str6;
    }

    public final String getChannel() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 111;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 103;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 25;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 9;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTotalPaidInAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 65;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final String getTotalPaidOutAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 117;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getVerificationCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String getVerifyingMsisdn() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 43;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component4;
        int i4 = i2 + 91;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 119;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static VerifyStatementPayload copy$default(VerifyStatementPayload verifyStatementPayload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 65;
        int i4 = i3 % 128;
        equals = i4;
        String str9 = (i3 % 2 == 0 || (i & 1) == 0) ? str : verifyStatementPayload.copydefault;
        if ((i & 2) != 0) {
            int i5 = i4 + 5;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            str7 = verifyStatementPayload.ShareDataUIState;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = i4 + 61;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            str8 = verifyStatementPayload.component1;
        } else {
            str8 = str3;
        }
        return verifyStatementPayload.copy(str9, str7, str8, (i & 8) != 0 ? verifyStatementPayload.component2 : str4, (i & 16) != 0 ? verifyStatementPayload.component3 : str5, (i & 32) != 0 ? verifyStatementPayload.component4 : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 119;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 101;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 25;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 45;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 77;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component4;
        int i4 = i2 + 103;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final VerifyStatementPayload copy(String channel, String idNumber, String totalPaidInAmount, String totalPaidOutAmount, String verificationCode, String verifyingMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(idNumber, "");
        Intrinsics.checkNotNullParameter(totalPaidInAmount, "");
        Intrinsics.checkNotNullParameter(totalPaidOutAmount, "");
        Intrinsics.checkNotNullParameter(verificationCode, "");
        Intrinsics.checkNotNullParameter(verifyingMsisdn, "");
        VerifyStatementPayload verifyStatementPayload = new VerifyStatementPayload(channel, idNumber, totalPaidInAmount, totalPaidOutAmount, verificationCode, verifyingMsisdn);
        int i2 = getAsAtTimestamp + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return verifyStatementPayload;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyStatementPayload)) {
            int i2 = equals + 73;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VerifyStatementPayload verifyStatementPayload = (VerifyStatementPayload) other;
        if (!Intrinsics.areEqual(this.copydefault, verifyStatementPayload.copydefault)) {
            int i4 = equals + 85;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, verifyStatementPayload.ShareDataUIState)) {
            int i6 = equals + 97;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, verifyStatementPayload.component1)) {
            return false;
        }
        Object obj = null;
        if (!Intrinsics.areEqual(this.component2, verifyStatementPayload.component2)) {
            int i8 = getAsAtTimestamp + 65;
            equals = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.component3, verifyStatementPayload.component3)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component4, verifyStatementPayload.component4)) {
            return true;
        }
        int i9 = getAsAtTimestamp + 103;
        equals = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.copydefault.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.component4.hashCode();
        int i4 = equals + 31;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyStatementPayload(channel=" + this.copydefault + ", idNumber=" + this.ShareDataUIState + ", totalPaidInAmount=" + this.component1 + ", totalPaidOutAmount=" + this.component2 + ", verificationCode=" + this.component3 + ", verifyingMsisdn=" + this.component4 + ")";
        int i2 = getAsAtTimestamp + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
