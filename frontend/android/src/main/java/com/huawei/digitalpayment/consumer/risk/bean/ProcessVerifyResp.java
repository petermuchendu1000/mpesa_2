package com.huawei.digitalpayment.consumer.risk.bean;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/bean/ProcessVerifyResp;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_FORWARD, "", "token", "extResponse", "", "", KeysConstants.KEY_KYC_FIELDS, "", "Lcom/huawei/digitalpayment/consumer/risk/bean/KycField;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getForward", "()Ljava/lang/String;", "getToken", "getExtResponse", "()Ljava/util/Map;", "getKycFields", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProcessVerifyResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final Map<String, Object> extResponse;
    private final String forward;
    private final List<KycField> kycFields;
    private final String token;

    public final String getForward() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.forward;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.token;
        }
        throw null;
    }

    public final Map<String, Object> getExtResponse() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.extResponse;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<KycField> getKycFields() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.kycFields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ProcessVerifyResp(String str, String str2, Map<String, ? extends Object> map, List<KycField> list) {
        this.forward = str;
        this.token = str2;
        this.extResponse = map;
        this.kycFields = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ProcessVerifyResp copy$default(ProcessVerifyResp processVerifyResp, String str, String str2, Map map, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 55;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = processVerifyResp.forward;
        }
        if ((i & 2) != 0) {
            str2 = processVerifyResp.token;
        }
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            map = processVerifyResp.extResponse;
        }
        if ((i & 8) != 0) {
            list = processVerifyResp.kycFields;
        }
        return processVerifyResp.copy(str, str2, map, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.forward;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.token;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> map = this.extResponse;
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return map;
    }

    public final List<KycField> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<KycField> list = this.kycFields;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return list;
    }

    public final ProcessVerifyResp copy(String forward, String token, Map<String, ? extends Object> extResponse, List<KycField> kycFields) {
        int i = 2 % 2;
        ProcessVerifyResp processVerifyResp = new ProcessVerifyResp(forward, token, extResponse, kycFields);
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return processVerifyResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessVerifyResp)) {
            return false;
        }
        ProcessVerifyResp processVerifyResp = (ProcessVerifyResp) other;
        if (!Intrinsics.areEqual(this.forward, processVerifyResp.forward)) {
            int i2 = ShareDataUIState + 51;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.token, processVerifyResp.token)) {
            int i4 = ShareDataUIState + 33;
            component1 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.extResponse, processVerifyResp.extResponse)) {
            return Intrinsics.areEqual(this.kycFields, processVerifyResp.kycFields);
        }
        int i5 = component1 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        int iHashCode2 = (i2 % 2 != 0 ? (str = this.forward) != null : (str = this.forward) != null) ? str.hashCode() : 0;
        String str2 = this.token;
        if (str2 == null) {
            int i3 = ShareDataUIState + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Map<String, Object> map = this.extResponse;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        List<KycField> list = this.kycFields;
        return (((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProcessVerifyResp(forward=" + this.forward + ", token=" + this.token + ", extResponse=" + this.extResponse + ", kycFields=" + this.kycFields + ")";
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
