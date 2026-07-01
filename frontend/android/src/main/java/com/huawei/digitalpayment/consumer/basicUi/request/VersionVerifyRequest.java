package com.huawei.digitalpayment.consumer.basicUi.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/request/VersionVerifyRequest;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VersionVerifyRequest extends BaseRequestParams {
    private static int component3 = 1;
    private static int copydefault;
    private final String initiatorMsisdn;

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public VersionVerifyRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorMsisdn = str;
    }

    public static VersionVerifyRequest copy$default(VersionVerifyRequest versionVerifyRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = versionVerifyRequest.initiatorMsisdn;
            int i6 = i3 + 39;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return versionVerifyRequest.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VersionVerifyRequest copy(String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        VersionVerifyRequest versionVerifyRequest = new VersionVerifyRequest(initiatorMsisdn);
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return versionVerifyRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 29;
        com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.copydefault = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.initiatorMsisdn, ((com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest) r6).initiatorMsisdn) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.component3 + 59;
        com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.copydefault
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.component3 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 89
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest
            if (r1 != 0) goto L25
            int r2 = r2 + 29
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.copydefault = r6
            int r2 = r2 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest r6 = (com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest) r6
            java.lang.String r1 = r5.initiatorMsisdn
            java.lang.String r6 = r6.initiatorMsisdn
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L3b
            int r6 = com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.component3
            int r6 = r6 + 59
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.copydefault = r1
            int r6 = r6 % r0
            return r4
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.request.VersionVerifyRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorMsisdn.hashCode();
        int i4 = copydefault + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VersionVerifyRequest(initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component3 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
