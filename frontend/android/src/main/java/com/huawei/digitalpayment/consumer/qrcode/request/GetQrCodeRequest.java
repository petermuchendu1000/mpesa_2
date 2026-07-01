package com.huawei.digitalpayment.consumer.qrcode.request;

import com.huawei.digitalpayment.consumer.webview.interaction.function.StartAaPay;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/request/GetQrCodeRequest;", "Lcom/huawei/http/BaseRequestParams;", "amount", "", "entrance", StartAaPay.KEY_NOTES, "currency", "unit", "qrCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getEntrance", "getNotes", "getCurrency", "getUnit", "getQrCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetQrCodeRequest extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String amount;
    private final String currency;
    private final String entrance;
    private final String notes;
    private final String qrCode;
    private final String unit;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetQrCodeRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        if ((i & 8) != 0) {
            int i2 = component2 + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i4 = ShareDataUIState + 73;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 33;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            str8 = null;
        } else {
            str8 = str5;
        }
        this(str, str2, str3, str7, str8, (i & 32) != 0 ? null : str6);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String getEntrance() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.entrance;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNotes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.notes;
        int i4 = i3 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.unit;
        int i4 = i2 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getQrCode() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.qrCode;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    public GetQrCodeRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.amount = str;
        this.entrance = str2;
        this.notes = str3;
        this.currency = str4;
        this.unit = str5;
        this.qrCode = str6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetQrCodeRequest(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
    }

    public static GetQrCodeRequest copy$default(GetQrCodeRequest getQrCodeRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        String str9 = (i & 1) != 0 ? getQrCodeRequest.amount : str;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i3 + 23;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                String str10 = getQrCodeRequest.entrance;
                obj2.hashCode();
                throw null;
            }
            str7 = getQrCodeRequest.entrance;
        } else {
            str7 = str2;
        }
        String str11 = (i & 4) != 0 ? getQrCodeRequest.notes : str3;
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 109;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                String str12 = getQrCodeRequest.currency;
                obj2.hashCode();
                throw null;
            }
            str8 = getQrCodeRequest.currency;
        } else {
            str8 = str4;
        }
        return getQrCodeRequest.copy(str9, str7, str11, str8, (i & 16) != 0 ? getQrCodeRequest.unit : str5, (i & 32) != 0 ? getQrCodeRequest.qrCode : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.entrance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.notes;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.qrCode;
        int i4 = i2 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return str;
    }

    public final GetQrCodeRequest copy(String amount, String entrance, String notes, String currency, String unit, String qrCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(entrance, "");
        Intrinsics.checkNotNullParameter(notes, "");
        GetQrCodeRequest getQrCodeRequest = new GetQrCodeRequest(amount, entrance, notes, currency, unit, qrCode);
        int i2 = ShareDataUIState + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return getQrCodeRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 31;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof GetQrCodeRequest)) {
            return false;
        }
        GetQrCodeRequest getQrCodeRequest = (GetQrCodeRequest) other;
        if (!Intrinsics.areEqual(this.amount, getQrCodeRequest.amount) || !Intrinsics.areEqual(this.entrance, getQrCodeRequest.entrance)) {
            return false;
        }
        if (Intrinsics.areEqual(this.notes, getQrCodeRequest.notes)) {
            return Intrinsics.areEqual(this.currency, getQrCodeRequest.currency) && Intrinsics.areEqual(this.unit, getQrCodeRequest.unit) && Intrinsics.areEqual(this.qrCode, getQrCodeRequest.qrCode);
        }
        int i6 = component2 + 113;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = this.entrance.hashCode();
        int iHashCode4 = this.notes.hashCode();
        String str = this.currency;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = component2 + 13;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.unit;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.qrCode;
        if (str3 == null) {
            int i4 = ShareDataUIState + 117;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode5 = str3.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetQrCodeRequest(amount=" + this.amount + ", entrance=" + this.entrance + ", notes=" + this.notes + ", currency=" + this.currency + ", unit=" + this.unit + ", qrCode=" + this.qrCode + ")";
        int i2 = component2 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
