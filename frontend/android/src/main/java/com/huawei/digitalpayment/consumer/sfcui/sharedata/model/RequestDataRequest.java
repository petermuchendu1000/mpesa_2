package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/RequestDataRequest;", "", "sponsorMsisdn", "", "beneficiaryMsisdn", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "getBeneficiaryMsisdn", "getAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestDataRequest {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;

    @SerializedName("amount")
    private final String component2;

    @SerializedName("sponsorMsisdn")
    private final String component3;

    @SerializedName("beneficiaryMsisdn")
    private final String copydefault;

    public RequestDataRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = str;
        this.copydefault = str2;
        this.component2 = str3;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 23;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBeneficiaryMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = equals + 5;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 76 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 65;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 75;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 25;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 63;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static RequestDataRequest copy$default(RequestDataRequest requestDataRequest, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 119;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = requestDataRequest.component3;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 7;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = requestDataRequest.copydefault;
                throw null;
            }
            str2 = requestDataRequest.copydefault;
        }
        if ((i & 4) != 0) {
            str3 = requestDataRequest.component2;
        }
        return requestDataRequest.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 73;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 69;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 95;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RequestDataRequest copy(String sponsorMsisdn, String beneficiaryMsisdn, String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(amount, "");
        RequestDataRequest requestDataRequest = new RequestDataRequest(sponsorMsisdn, beneficiaryMsisdn, amount);
        int i2 = equals + 119;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return requestDataRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestDataRequest)) {
            return false;
        }
        RequestDataRequest requestDataRequest = (RequestDataRequest) other;
        if (!Intrinsics.areEqual(this.component3, requestDataRequest.component3)) {
            int i2 = equals + 65;
            getRequestBeneficiariesState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.copydefault, requestDataRequest.copydefault)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, requestDataRequest.component2)) {
            return true;
        }
        int i3 = getRequestBeneficiariesState + 123;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component3.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.component2.hashCode();
        int i4 = equals + 53;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestDataRequest(sponsorMsisdn=" + this.component3 + ", beneficiaryMsisdn=" + this.copydefault + ", amount=" + this.component2 + ")";
        int i2 = equals + 103;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
