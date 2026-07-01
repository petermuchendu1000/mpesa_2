package com.huawei.digitalpayment.consumer.sfcqrcode.ui.resp;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/resp/GetQrCodeRequest;", "Lcom/huawei/http/BaseRequestParams;", "amount", "", "entrance", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getEntrance", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetQrCodeRequest extends BaseRequestParams {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 35 % 128;
    private static int copydefault = 1;
    private final String amount;
    private final String entrance;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetQrCodeRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 73;
            int i3 = i2 % 128;
            copydefault = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 113;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        this(str, str2);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEntrance() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.entrance;
        }
        throw null;
    }

    public GetQrCodeRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.entrance = str2;
    }

    static {
        int i = 35 % 2;
    }

    public static GetQrCodeRequest copy$default(GetQrCodeRequest getQrCodeRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 3;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 3;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = getQrCodeRequest.amount;
        }
        if ((i & 2) != 0) {
            int i8 = i4 + 37;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str2 = getQrCodeRequest.entrance;
            if (i9 != 0) {
                int i10 = 63 / 0;
            }
        }
        return getQrCodeRequest.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.amount;
            int i4 = 2 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i2 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.entrance;
        int i5 = i2 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GetQrCodeRequest copy(String amount, String entrance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entrance, "");
        GetQrCodeRequest getQrCodeRequest = new GetQrCodeRequest(amount, entrance);
        int i2 = copydefault + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return getQrCodeRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetQrCodeRequest)) {
            int i5 = i2 + 97;
            copydefault = i5 % 128;
            return i5 % 2 == 0;
        }
        GetQrCodeRequest getQrCodeRequest = (GetQrCodeRequest) other;
        if (Intrinsics.areEqual(this.amount, getQrCodeRequest.amount)) {
            if (!Intrinsics.areEqual(this.entrance, getQrCodeRequest.entrance)) {
                return false;
            }
            int i6 = copydefault + 49;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = component1 + 51;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        if (str == null) {
            int i4 = i2 + 125;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode * 31) + this.entrance.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetQrCodeRequest(amount=" + this.amount + ", entrance=" + this.entrance + ")";
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
