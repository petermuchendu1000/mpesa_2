package com.huawei.digitalpayment.consumer.sfcui.postpay;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/PostPayCheckEmailEligibilityPayload;", "", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostPayCheckEmailEligibilityPayload {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String component2;

    public PostPayCheckEmailEligibilityPayload(String str) {
        this.component2 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostPayCheckEmailEligibilityPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 31;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 85;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostPayCheckEmailEligibilityPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static PostPayCheckEmailEligibilityPayload copy$default(PostPayCheckEmailEligibilityPayload postPayCheckEmailEligibilityPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 17;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = postPayCheckEmailEligibilityPayload.component2;
            int i6 = i3 + 89;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return postPayCheckEmailEligibilityPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PostPayCheckEmailEligibilityPayload copy(String msisdn) {
        int i = 2 % 2;
        PostPayCheckEmailEligibilityPayload postPayCheckEmailEligibilityPayload = new PostPayCheckEmailEligibilityPayload(msisdn);
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return postPayCheckEmailEligibilityPayload;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPayCheckEmailEligibilityPayload)) {
            int i5 = i2 + 45;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, ((PostPayCheckEmailEligibilityPayload) other).component2)) {
            return true;
        }
        int i7 = component3 + 115;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        if (str == null) {
            int i5 = i2 + 57;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i7 = component3 + 121;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 % 3;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostPayCheckEmailEligibilityPayload(msisdn=" + this.component2 + ")";
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
