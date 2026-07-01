package com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/lipanabonga/PurchaseResponse;", "", "purchaseStatus", "", "<init>", "(Ljava/lang/String;)V", "getPurchaseStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseResponse {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("purchaseStatus")
    private final String component1;

    public PurchaseResponse(String str) {
        this.component1 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 35;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 86 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String getPurchaseStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 81;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 91;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static PurchaseResponse copy$default(PurchaseResponse purchaseResponse, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 75;
        component2 = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 != 0 ? i4 != 0 : i4 != 0) {
            str = purchaseResponse.component1;
        }
        PurchaseResponse purchaseResponseCopy = purchaseResponse.copy(str);
        int i5 = component3 + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return purchaseResponseCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    public final PurchaseResponse copy(String purchaseStatus) {
        int i = 2 % 2;
        PurchaseResponse purchaseResponse = new PurchaseResponse(purchaseStatus);
        int i2 = component2 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return purchaseResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseResponse)) {
            int i4 = i3 + 121;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component1, ((PurchaseResponse) other).component1)) {
            return true;
        }
        int i6 = component3 + 41;
        int i7 = i6 % 128;
        component2 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 29;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i2 + 113;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 75;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseResponse(purchaseStatus=" + this.component1 + ")";
        int i2 = component3 + 51;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
