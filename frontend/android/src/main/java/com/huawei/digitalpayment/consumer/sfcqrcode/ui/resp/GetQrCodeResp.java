package com.huawei.digitalpayment.consumer.sfcqrcode.ui.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/resp/GetQrCodeResp;", "Lcom/huawei/http/BaseResp;", "qrCode", "", "amountDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getQrCode", "()Ljava/lang/String;", "getAmountDisplay", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetQrCodeResp extends BaseResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String amountDisplay;
    private final String qrCode;

    public final String getQrCode() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.qrCode;
            int i4 = 63 / 0;
        } else {
            str = this.qrCode;
        }
        int i5 = i2 + 51;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.amountDisplay;
        int i4 = i2 + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public GetQrCodeResp(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.qrCode = str;
        this.amountDisplay = str2;
    }

    static {
        int i = 1 + 85;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    public static GetQrCodeResp copy$default(GetQrCodeResp getQrCodeResp, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 15;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 55;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = getQrCodeResp.qrCode;
            int i8 = i4 + 109;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 2) != 0) {
            int i10 = i4 + 79;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            str2 = getQrCodeResp.amountDisplay;
        }
        return getQrCodeResp.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.qrCode;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amountDisplay;
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public final GetQrCodeResp copy(String qrCode, String amountDisplay) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(qrCode, "");
        Intrinsics.checkNotNullParameter(amountDisplay, "");
        GetQrCodeResp getQrCodeResp = new GetQrCodeResp(qrCode, amountDisplay);
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return getQrCodeResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 31;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof GetQrCodeResp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.qrCode, ((GetQrCodeResp) other).qrCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amountDisplay, r6.amountDisplay)) {
            int i3 = component1 + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = component2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.qrCode.hashCode() % 50) - this.amountDisplay.hashCode() : (this.qrCode.hashCode() * 31) + this.amountDisplay.hashCode();
        int i3 = component1 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetQrCodeResp(qrCode=" + this.qrCode + ", amountDisplay=" + this.amountDisplay + ")";
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
