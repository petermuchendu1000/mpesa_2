package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/PostpayChangePlan;", "", "effectiveDate", "", "msisdn", "newProduct", "oldProduct", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEffectiveDate", "()Ljava/lang/String;", "getMsisdn", "getNewProduct", "getOldProduct", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayChangePlan {
    public static final int $stable = 0;
    private static int component3 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;

    @SerializedName("oldProduct")
    private final String ShareDataUIState;

    @SerializedName("newProduct")
    private final String component1;

    @SerializedName("effectiveDate")
    private final String component2;

    @SerializedName("msisdn")
    private final String copydefault;

    public PostpayChangePlan(String str, String str2, String str3, String str4) {
        this.component2 = str;
        this.copydefault = str2;
        this.component1 = str3;
        this.ShareDataUIState = str4;
    }

    public final String getEffectiveDate() {
        int i = 2 % 2;
        int i2 = equals + 89;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 87;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getNewProduct() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 39;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public final String getOldProduct() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    static {
        int i = 1 + 65;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    public static PostpayChangePlan copy$default(PostpayChangePlan postpayChangePlan, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 67;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = postpayChangePlan.component2;
        }
        if ((i & 2) != 0) {
            str2 = postpayChangePlan.copydefault;
        }
        if ((i & 4) != 0) {
            int i5 = i3 + 49;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            str3 = postpayChangePlan.component1;
        }
        if ((i & 8) != 0) {
            str4 = postpayChangePlan.ShareDataUIState;
        }
        PostpayChangePlan postpayChangePlanCopy = postpayChangePlan.copy(str, str2, str3, str4);
        int i7 = getRequestBeneficiariesState + 91;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return postpayChangePlanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 9;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 33;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 3;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 43;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 65;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 69;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PostpayChangePlan copy(String effectiveDate, String msisdn, String newProduct, String oldProduct) {
        int i = 2 % 2;
        PostpayChangePlan postpayChangePlan = new PostpayChangePlan(effectiveDate, msisdn, newProduct, oldProduct);
        int i2 = getRequestBeneficiariesState + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return postpayChangePlan;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostpayChangePlan)) {
            int i2 = getRequestBeneficiariesState + 109;
            equals = i2 % 128;
            return i2 % 2 == 0;
        }
        PostpayChangePlan postpayChangePlan = (PostpayChangePlan) other;
        if (!Intrinsics.areEqual(this.component2, postpayChangePlan.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, postpayChangePlan.copydefault)) {
            int i3 = equals + 89;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.component1, postpayChangePlan.component1))) {
            return Intrinsics.areEqual(this.ShareDataUIState, postpayChangePlan.ShareDataUIState);
        }
        int i5 = equals + 65;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.component2;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        if (str2 == null) {
            int i2 = equals + 15;
            getRequestBeneficiariesState = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.component1;
        if (str3 == null) {
            int i3 = equals + 41;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.ShareDataUIState;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostpayChangePlan(effectiveDate=" + this.component2 + ", msisdn=" + this.copydefault + ", newProduct=" + this.component1 + ", oldProduct=" + this.ShareDataUIState + ")";
        int i2 = getRequestBeneficiariesState + 91;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
