package com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/lipanabonga/BongaBalanceResponse;", "", "amount", "", "points", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getPoints", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaBalanceResponse {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 57 % 128;
    private static int getRequestBeneficiariesState = 1;

    @SerializedName("points")
    private final String ShareDataUIState;

    @SerializedName("amount")
    private final String component2;

    public BongaBalanceResponse(String str, String str2) {
        this.component2 = str;
        this.ShareDataUIState = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaBalanceResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState + 57;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 95;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i7 = component1 + 23;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 93 / 0;
            }
            int i9 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPoints() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 61;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 57 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BongaBalanceResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static BongaBalanceResponse copy$default(BongaBalanceResponse bongaBalanceResponse, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 29;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = bongaBalanceResponse.component2;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = bongaBalanceResponse.component2;
        }
        if ((i & 2) != 0) {
            str2 = bongaBalanceResponse.ShareDataUIState;
        }
        BongaBalanceResponse bongaBalanceResponseCopy = bongaBalanceResponse.copy(str, str2);
        int i4 = getRequestBeneficiariesState + 13;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return bongaBalanceResponseCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 11;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BongaBalanceResponse copy(String amount, String points) {
        int i = 2 % 2;
        BongaBalanceResponse bongaBalanceResponse = new BongaBalanceResponse(amount, points);
        int i2 = getRequestBeneficiariesState + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return bongaBalanceResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getRequestBeneficiariesState + 85;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BongaBalanceResponse)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, ((BongaBalanceResponse) other).component2) || (!Intrinsics.areEqual(this.ShareDataUIState, r6.ShareDataUIState))) {
            return false;
        }
        int i4 = getRequestBeneficiariesState + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        if (i3 % 2 == 0 ? (str = this.component2) != null : (str = this.component2) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 41;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        String str2 = this.ShareDataUIState;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaBalanceResponse(amount=" + this.component2 + ", points=" + this.ShareDataUIState + ")";
        int i2 = component1 + 109;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return str;
    }
}
