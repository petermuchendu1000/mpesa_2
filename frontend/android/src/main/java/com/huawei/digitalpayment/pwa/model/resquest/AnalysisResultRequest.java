package com.huawei.digitalpayment.pwa.model.resquest;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/pwa/model/resquest/AnalysisResultRequest;", "Lcom/huawei/http/BaseRequestParams;", "qrCode", "", "scanPurpose", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQrCode", "()Ljava/lang/String;", "getScanPurpose", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerPwaModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalysisResultRequest extends BaseRequestParams {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String qrCode;
    private final String scanPurpose;

    public final String getQrCode() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.qrCode;
        int i4 = i3 + 15;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getScanPurpose() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scanPurpose;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AnalysisResultRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.qrCode = str;
        this.scanPurpose = str2;
    }

    public static AnalysisResultRequest copy$default(AnalysisResultRequest analysisResultRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = analysisResultRequest.qrCode;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 39;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str2 = analysisResultRequest.scanPurpose;
        }
        AnalysisResultRequest analysisResultRequestCopy = analysisResultRequest.copy(str, str2);
        int i5 = component1 + 97;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return analysisResultRequestCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.qrCode;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.scanPurpose;
        int i4 = i2 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final AnalysisResultRequest copy(String qrCode, String scanPurpose) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(qrCode, "");
        Intrinsics.checkNotNullParameter(scanPurpose, "");
        AnalysisResultRequest analysisResultRequest = new AnalysisResultRequest(qrCode, scanPurpose);
        int i2 = component3 + 3;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return analysisResultRequest;
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
        if (!(other instanceof AnalysisResultRequest)) {
            int i2 = component3 + 1;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        AnalysisResultRequest analysisResultRequest = (AnalysisResultRequest) other;
        if (!Intrinsics.areEqual(this.qrCode, analysisResultRequest.qrCode)) {
            int i3 = component3 + 33;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.scanPurpose, analysisResultRequest.scanPurpose)) {
            return false;
        }
        int i5 = component1 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.qrCode.hashCode() * 31) + this.scanPurpose.hashCode();
        int i4 = component3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AnalysisResultRequest(qrCode=" + this.qrCode + ", scanPurpose=" + this.scanPurpose + ")";
        int i2 = component3 + 49;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
