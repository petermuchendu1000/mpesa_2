package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/request/PinLoginParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorPin", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorPin", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PinLoginParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String initiatorPin;

    public PinLoginParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorPin = str;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorPin;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public static PinLoginParams copy$default(PinLoginParams pinLoginParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 65;
        component3 = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = pinLoginParams.initiatorPin;
        }
        PinLoginParams pinLoginParamsCopy = pinLoginParams.copy(str);
        int i4 = ShareDataUIState + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return pinLoginParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PinLoginParams copy(String initiatorPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorPin, "");
        PinLoginParams pinLoginParams = new PinLoginParams(initiatorPin);
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return pinLoginParams;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams)) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.initiatorPin, ((com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams) r6).initiatorPin) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r6 = r2 + 43;
        com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.component3 = r6 % 128;
        r6 = r6 % 2;
        r2 = r2 + 15;
        com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.component3 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
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
            int r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.component3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.ShareDataUIState = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L16
            r1 = 8
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r4
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams
            r1 = r1 ^ r4
            if (r1 == r4) goto L2c
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams r6 = (com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams) r6
            java.lang.String r0 = r5.initiatorPin
            java.lang.String r6 = r6.initiatorPin
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L2b
            return r3
        L2b:
            return r4
        L2c:
            int r6 = r2 + 43
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.component3 = r1
            int r6 = r6 % r0
            int r2 = r2 + 15
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.component3 = r6
            int r2 = r2 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.PinLoginParams.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorPin.hashCode();
        int i4 = ShareDataUIState + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PinLoginParams(initiatorPin=" + this.initiatorPin + ")";
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
