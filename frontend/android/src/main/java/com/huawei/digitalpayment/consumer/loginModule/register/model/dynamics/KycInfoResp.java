package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/KycInfoResp;", "", "groups", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiGroup;", "<init>", "(Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KycInfoResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final List<GuiGroup> component3;

    public KycInfoResp(List<GuiGroup> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component3 = list;
    }

    public final List<GuiGroup> getGroups() {
        List<GuiGroup> list;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.component3;
            int i4 = 27 / 0;
        } else {
            list = this.component3;
        }
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static KycInfoResp copy$default(KycInfoResp kycInfoResp, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            list = kycInfoResp.component3;
            int i5 = i3 + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        KycInfoResp kycInfoRespCopy = kycInfoResp.copy(list);
        int i7 = ShareDataUIState + 81;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return kycInfoRespCopy;
    }

    public final List<GuiGroup> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<GuiGroup> list = this.component3;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final KycInfoResp copy(List<GuiGroup> groups) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groups, "");
        KycInfoResp kycInfoResp = new KycInfoResp(groups);
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return kycInfoResp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4.component3, ((com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp) r5).component3) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.ShareDataUIState + 117;
        com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.component1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.ShareDataUIState
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.component1 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 78
            int r1 = r1 / r3
            if (r4 != r5) goto L19
            goto L18
        L16:
            if (r4 != r5) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp
            if (r1 == 0) goto L34
            com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp r5 = (com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp) r5
            java.util.List<com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiGroup> r1 = r4.component3
            java.util.List<com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiGroup> r5 = r5.component3
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L33
            int r5 = com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.ShareDataUIState
            int r5 = r5 + 117
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.component1 = r1
            int r5 = r5 % r0
            return r3
        L33:
            return r2
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.KycInfoResp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component3.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.component3.hashCode();
        int i3 = component1 + 23;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KycInfoResp(groups=" + this.component3 + ")";
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
