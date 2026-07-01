package com.huawei.digitalpayment.consumer.sfcui.postpay;

import com.google.gson.annotations.SerializedName;
import kotlin.IResultReceiverDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/PostPayStatementsPayload;", "", "msisdn", "", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getEmail", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostPayStatementsPayload {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;

    @SerializedName("email")
    private final String component2;

    @SerializedName("msisdn")
    private final String component3;

    public PostPayStatementsPayload(String str, String str2) {
        this.component3 = str;
        this.component2 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostPayStatementsPayload(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 59;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 15 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = getAsAtTimestamp + 33;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 3;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    static {
        int i = 1 + 63;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostPayStatementsPayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static PostPayStatementsPayload copy$default(PostPayStatementsPayload postPayStatementsPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 67;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = postPayStatementsPayload.component3;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 37;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = postPayStatementsPayload.component2;
                throw null;
            }
            str2 = postPayStatementsPayload.component2;
        }
        return postPayStatementsPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 1;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PostPayStatementsPayload copy(String msisdn, String email) {
        int i = 2 % 2;
        PostPayStatementsPayload postPayStatementsPayload = new PostPayStatementsPayload(msisdn, email);
        int i2 = ShareDataUIState + 31;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return postPayStatementsPayload;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof PostPayStatementsPayload)) {
            int i7 = i3 + 51;
            ShareDataUIState = i7 % 128;
            return i7 % 2 != 0;
        }
        PostPayStatementsPayload postPayStatementsPayload = (PostPayStatementsPayload) other;
        if (!Intrinsics.areEqual(this.component3, postPayStatementsPayload.component3) || !Intrinsics.areEqual(this.component2, postPayStatementsPayload.component2)) {
            return false;
        }
        int i8 = ShareDataUIState + 41;
        getAsAtTimestamp = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 == 0 ? (str = this.component3) != null : (str = this.component3) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i2 + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        String str2 = this.component2;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i6 = getAsAtTimestamp + 113;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostPayStatementsPayload(msisdn=" + this.component3 + ", email=" + this.component2 + ")";
        int i2 = ShareDataUIState + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static void copydefault() {
        IResultReceiverDefault.copydefault[0] = Class.forName("com.huawei.digitalpayment.consumer.webview.viewmodel.BaseWebViewViewModel$1").getDeclaredField("copydefault");
    }
}
