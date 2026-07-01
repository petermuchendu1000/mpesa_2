package com.huawei.digitalpayment.consumer.profile.model.request;

import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.http.BaseRequestParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0000J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/request/UpdateKycParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "extProperties", "", "", "initiatorPin", "pinVersion", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "getExtProperties", "()Ljava/util/Map;", "getInitiatorPin", "getPinVersion", "removeExtProperties", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpdateKycParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final Map<String, Object> extProperties;
    private final String initiatorMsisdn;
    private final String initiatorPin;
    private final String pinVersion;

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateKycParams(String str, Map map, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = component1 + 109;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                str3 = AppConfigManager.getAppConfig().getPinKeyVersion();
                int i3 = ShareDataUIState + 65;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 % 2;
                }
            } else {
                AppConfigManager.getAppConfig().getPinKeyVersion();
                throw null;
            }
        }
        this(str, map, str2, str3);
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.initiatorMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> getExtProperties() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.extProperties;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorPin;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPinVersion() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.pinVersion;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public UpdateKycParams(String str, Map<String, ? extends Object> map, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.initiatorMsisdn = str;
        this.extProperties = map;
        this.initiatorPin = str2;
        this.pinVersion = str3;
    }

    public final UpdateKycParams removeExtProperties() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        return i2 % 2 == 0 ? copy$default(this, null, null, null, null, 106, null) : copy$default(this, null, null, null, null, 13, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UpdateKycParams copy$default(UpdateKycParams updateKycParams, String str, Map map, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 75;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = updateKycParams.initiatorMsisdn;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 103;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                Map<String, Object> map2 = updateKycParams.extProperties;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            map = updateKycParams.extProperties;
        }
        if ((i & 4) != 0) {
            str2 = updateKycParams.initiatorPin;
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 43;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str3 = updateKycParams.pinVersion;
        }
        return updateKycParams.copy(str, map, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, Object> component2() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.extProperties;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinVersion;
        int i5 = i2 + 105;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final UpdateKycParams copy(String initiatorMsisdn, Map<String, ? extends Object> extProperties, String initiatorPin, String pinVersion) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pinVersion, "");
        UpdateKycParams updateKycParams = new UpdateKycParams(initiatorMsisdn, extProperties, initiatorPin, pinVersion);
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return updateKycParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateKycParams)) {
            int i4 = i2 + 95;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UpdateKycParams updateKycParams = (UpdateKycParams) other;
        if (!Intrinsics.areEqual(this.initiatorMsisdn, updateKycParams.initiatorMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.extProperties, updateKycParams.extProperties)) {
            int i6 = component1 + 95;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.initiatorPin, updateKycParams.initiatorPin)) {
            return Intrinsics.areEqual(this.pinVersion, updateKycParams.pinVersion);
        }
        int i8 = ShareDataUIState;
        int i9 = i8 + 111;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 77;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v13 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams.ShareDataUIState
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r1 = r6.initiatorMsisdn
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r6.initiatorMsisdn
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.extProperties
            if (r4 != 0) goto L2e
            int r4 = com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams.ShareDataUIState
            int r4 = r4 + 69
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams.component1 = r5
            int r4 = r4 % r0
            goto L32
        L2e:
            int r2 = r4.hashCode()
        L32:
            java.lang.String r0 = r6.initiatorPin
            if (r0 != 0) goto L37
            goto L3b
        L37:
            int r3 = r0.hashCode()
        L3b:
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            java.lang.String r0 = r6.pinVersion
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UpdateKycParams(initiatorMsisdn=" + this.initiatorMsisdn + ", extProperties=" + this.extProperties + ", initiatorPin=" + this.initiatorPin + ", pinVersion=" + this.pinVersion + ")";
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
