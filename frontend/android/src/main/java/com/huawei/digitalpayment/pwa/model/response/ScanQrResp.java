package com.huawei.digitalpayment.pwa.model.response;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/pwa/model/response/ScanQrResp;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_EXECUTE, "", "params", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getExecute", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerPwaModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanQrResp extends BaseResp {
    private static int component2 = 1;
    private static int copydefault;
    private final String execute;
    private final Map<String, String> params;

    public ScanQrResp(String str, Map<String, String> map) {
        this.execute = str;
        this.params = map;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        throw null;
    }

    public final Map<String, String> getParams() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, String> map = this.params;
        int i4 = i3 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScanQrResp copy$default(ScanQrResp scanQrResp, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 121;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = scanQrResp.execute;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 91;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                map = scanQrResp.params;
                int i6 = 49 / 0;
            } else {
                map = scanQrResp.params;
            }
        }
        ScanQrResp scanQrRespCopy = scanQrResp.copy(str, map);
        int i7 = component2 + 111;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return scanQrRespCopy;
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.execute;
            int i4 = 43 / 0;
        } else {
            str = this.execute;
        }
        int i5 = i2 + 49;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> component2() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.params;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final ScanQrResp copy(String execute, Map<String, String> params) {
        int i = 2 % 2;
        ScanQrResp scanQrResp = new ScanQrResp(execute, params);
        int i2 = component2 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return scanQrResp;
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
        if (!(!(other instanceof ScanQrResp))) {
            ScanQrResp scanQrResp = (ScanQrResp) other;
            if (!(!Intrinsics.areEqual(this.execute, scanQrResp.execute))) {
                if (Intrinsics.areEqual(this.params, scanQrResp.params)) {
                    return true;
                }
                int i2 = copydefault + 101;
                int i3 = i2 % 128;
                component2 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 103;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 21 / 0;
                }
                return false;
            }
            int i7 = component2 + 9;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.execute;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = copydefault + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Map<String, String> map = this.params;
        if (map == null) {
            int i4 = copydefault + 71;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = map.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScanQrResp(execute=" + this.execute + ", params=" + this.params + ")";
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
