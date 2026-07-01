package com.huawei.digitalpayment.consumer.webview.model.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/webview/model/resp/ScanQrResp;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_EXECUTE, "", "params", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getExecute", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerWebviewModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanQrResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String execute;
    private final Map<String, String> params;

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> getParams() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.params;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return map;
    }

    public ScanQrResp(String str, Map<String, String> map) {
        this.execute = str;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScanQrResp copy$default(ScanQrResp scanQrResp, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 19;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = scanQrResp.execute;
            int i6 = i4 + 113;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            map = scanQrResp.params;
        }
        ScanQrResp scanQrRespCopy = scanQrResp.copy(str, map);
        int i8 = component2 + 65;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            return scanQrRespCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.execute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.params;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final ScanQrResp copy(String execute, Map<String, String> params) {
        int i = 2 % 2;
        ScanQrResp scanQrResp = new ScanQrResp(execute, params);
        int i2 = component2 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return scanQrResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanQrResp)) {
            int i2 = component2 + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ScanQrResp scanQrResp = (ScanQrResp) other;
        if (!Intrinsics.areEqual(this.execute, scanQrResp.execute)) {
            int i4 = ShareDataUIState + 57;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.params, scanQrResp.params)) {
            int i6 = ShareDataUIState + 85;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = ShareDataUIState + 3;
        component2 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 97 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        int iHashCode = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.params;
        int iHashCode2 = (iHashCode * 31) + (map != null ? map.hashCode() : 0);
        int i4 = ShareDataUIState + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScanQrResp(execute=" + this.execute + ", params=" + this.params + ")";
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
