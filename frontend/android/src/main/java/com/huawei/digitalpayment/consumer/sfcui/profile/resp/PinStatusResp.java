package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/PinStatusResp;", "Lcom/huawei/http/BaseResp;", "pinStatus", "", "<init>", "(Ljava/lang/String;)V", "getPinStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PinStatusResp extends BaseResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 25 % 128;
    private static int component3 = 1;
    private final String pinStatus;

    public final String getPinStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinStatus;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PinStatusResp(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pinStatus = str;
    }

    static {
        if (25 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PinStatusResp copy$default(PinStatusResp pinStatusResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 97;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = pinStatusResp.pinStatus;
        }
        return pinStatusResp.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pinStatus;
        int i4 = i2 + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final PinStatusResp copy(String pinStatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pinStatus, "");
        PinStatusResp pinStatusResp = new PinStatusResp(pinStatus);
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return pinStatusResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinStatusResp)) {
            return false;
        }
        if (Intrinsics.areEqual(this.pinStatus, ((PinStatusResp) other).pinStatus)) {
            return true;
        }
        int i3 = ShareDataUIState + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.pinStatus;
        if (i3 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PinStatusResp(pinStatus=" + this.pinStatus + ")";
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
