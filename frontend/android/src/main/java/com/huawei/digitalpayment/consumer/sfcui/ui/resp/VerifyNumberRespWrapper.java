package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/VerifyNumberRespWrapper;", "", "verifyNumberResp", "Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;", "businessType", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;Ljava/lang/String;)V", "getVerifyNumberResp", "()Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;", "getBusinessType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyNumberRespWrapper {
    public static final int $stable = 8;
    private static int ShareDataUIState = 87 % 128;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component4 = 1;
    private final VerifyNumberResp component3;
    private final String copydefault;

    public VerifyNumberRespWrapper(VerifyNumberResp verifyNumberResp, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = verifyNumberResp;
        this.copydefault = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerifyNumberRespWrapper(VerifyNumberResp verifyNumberResp, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 67;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 37;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            verifyNumberResp = null;
        }
        this(verifyNumberResp, str);
    }

    public final VerifyNumberResp getVerifyNumberResp() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VerifyNumberResp verifyNumberResp = this.component3;
        int i4 = i3 + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return verifyNumberResp;
    }

    public final String getBusinessType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 41;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 87 % 2;
    }

    public static VerifyNumberRespWrapper copy$default(VerifyNumberRespWrapper verifyNumberRespWrapper, VerifyNumberResp verifyNumberResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 25;
            int i4 = i3 % 128;
            component4 = i4;
            int i5 = i3 % 2;
            verifyNumberResp = verifyNumberRespWrapper.component3;
            int i6 = i4 + 103;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = component2 + 7;
            component4 = i8 % 128;
            if (i8 % 2 == 0) {
                str = verifyNumberRespWrapper.copydefault;
                int i9 = 34 / 0;
            } else {
                str = verifyNumberRespWrapper.copydefault;
            }
        }
        return verifyNumberRespWrapper.copy(verifyNumberResp, str);
    }

    public final VerifyNumberResp component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        VerifyNumberResp verifyNumberResp = this.component3;
        int i4 = i2 + 39;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return verifyNumberResp;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 79;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyNumberRespWrapper copy(VerifyNumberResp verifyNumberResp, String businessType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(businessType, "");
        VerifyNumberRespWrapper verifyNumberRespWrapper = new VerifyNumberRespWrapper(verifyNumberResp, businessType);
        int i2 = component4 + 51;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return verifyNumberRespWrapper;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 77;
            component2 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof VerifyNumberRespWrapper)) {
            int i3 = component4 + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        VerifyNumberRespWrapper verifyNumberRespWrapper = (VerifyNumberRespWrapper) other;
        if (!Intrinsics.areEqual(this.component3, verifyNumberRespWrapper.component3) || !Intrinsics.areEqual(this.copydefault, verifyNumberRespWrapper.copydefault)) {
            return false;
        }
        int i5 = component4 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
  0x001c: PHI (r1v10 com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp) = 
  (r1v4 com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp)
  (r1v11 com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp)
 binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyNumberRespWrapper.component2
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyNumberRespWrapper.component4 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp r1 = r4.component3
            r3 = 67
            int r3 = r3 / r2
            if (r1 != 0) goto L1c
            goto L20
        L17:
            com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp r1 = r4.component3
            if (r1 != 0) goto L1c
            goto L20
        L1c:
            int r2 = r1.hashCode()
        L20:
            int r2 = r2 * 31
            java.lang.String r1 = r4.copydefault
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyNumberRespWrapper.component2
            int r1 = r1 + 77
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyNumberRespWrapper.component4 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L35
            return r2
        L35:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.resp.VerifyNumberRespWrapper.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyNumberRespWrapper(verifyNumberResp=" + this.component3 + ", businessType=" + this.copydefault + ")";
        int i2 = component2 + 31;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
