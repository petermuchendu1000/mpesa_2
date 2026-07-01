package com.huawei.digitalpayment.consumer.sfcui.postpay;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/PostPayChangeEmailPayload;", "", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostPayChangeEmailPayload {
    public static final int $stable = 0;
    private static int ShareDataUIState = 87 % 128;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("email")
    private final String component2;

    public PostPayChangeEmailPayload(String str) {
        this.component2 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostPayChangeEmailPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3;
            int i3 = i2 + 25;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 93;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            } else {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        if (87 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostPayChangeEmailPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static PostPayChangeEmailPayload copy$default(PostPayChangeEmailPayload postPayChangeEmailPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 1;
        copydefault = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            int i6 = i3 + 59;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = postPayChangeEmailPayload.component2;
            if (i7 != 0) {
                int i8 = 65 / 0;
            }
        }
        return postPayChangeEmailPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PostPayChangeEmailPayload copy(String email) {
        int i = 2 % 2;
        PostPayChangeEmailPayload postPayChangeEmailPayload = new PostPayChangeEmailPayload(email);
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return postPayChangeEmailPayload;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 81;
        r6 = r2 % 128;
        com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.copydefault = r6;
        r2 = r2 % 2;
        r6 = r6 + 5;
        com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, ((com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload) r6).component2) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.copydefault + 57;
        com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.copydefault
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.component3 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 51
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload
            if (r1 != 0) goto L2c
            int r2 = r2 + 81
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.copydefault = r6
            int r2 = r2 % r0
            int r6 = r6 + 5
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.component3 = r1
            int r6 = r6 % r0
            return r4
        L2c:
            com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload r6 = (com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload) r6
            java.lang.String r1 = r5.component2
            java.lang.String r6 = r6.component2
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L42
            int r6 = com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.copydefault
            int r6 = r6 + 57
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.component3 = r1
            int r6 = r6 % r0
            return r4
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.PostPayChangeEmailPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.component2;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = copydefault;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostPayChangeEmailPayload(email=" + this.component2 + ")";
        int i2 = copydefault + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
