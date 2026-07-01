package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.http.BaseResp;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/bean/ScanQrResultResp;", "Lcom/huawei/http/BaseResp;", "scanId", "", "resultMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getScanId", "()Ljava/lang/String;", "getResultMsg", "hashCode", "", "equals", "", "other", "", "component1", "component2", "copy", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanQrResultResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String resultMsg;
    private final String scanId;

    /* JADX WARN: Illegal instructions before constructor call */
    public ScanQrResultResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState;
            int i6 = i5 + 51;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 99;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getScanId() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.scanId;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResultMsg() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.resultMsg;
        int i4 = i2 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public ScanQrResultResp(String str, String str2) {
        this.scanId = str;
        this.resultMsg = str2;
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.scanId;
        if (str == null) {
            int i2 = ShareDataUIState + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = component3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 97;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ScanQrResultResp)) {
            int i4 = component3 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        boolean zEquals = Objects.equals(this.scanId, ((ScanQrResultResp) other).scanId);
        int i6 = ShareDataUIState + 59;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return zEquals;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScanQrResultResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static ScanQrResultResp copy$default(ScanQrResultResp scanQrResultResp, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 53;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = scanQrResultResp.scanId;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 67;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                String str3 = scanQrResultResp.resultMsg;
                throw null;
            }
            str2 = scanQrResultResp.resultMsg;
        }
        ScanQrResultResp scanQrResultRespCopy = scanQrResultResp.copy(str, str2);
        int i6 = component3 + 49;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return scanQrResultRespCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scanId;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resultMsg;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ScanQrResultResp copy(String scanId, String resultMsg) {
        int i = 2 % 2;
        ScanQrResultResp scanQrResultResp = new ScanQrResultResp(scanId, resultMsg);
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return scanQrResultResp;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScanQrResultResp(scanId=" + this.scanId + ", resultMsg=" + this.resultMsg + ")";
        int i2 = component3 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return str;
    }
}
