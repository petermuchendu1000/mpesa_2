package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/QrCodeResp;", "Ljava/io/Serializable;", "number", "", "amount", "accountNumber", KeysConstants.KEY_STORE_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getAmount", "getAccountNumber", "getStoreNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QrCodeResp implements Serializable {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String accountNumber;
    private final String amount;
    private final String number;
    private final String storeNumber;

    public QrCodeResp(String str, String str2, String str3, String str4) {
        this.number = str;
        this.amount = str2;
        this.accountNumber = str3;
        this.storeNumber = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QrCodeResp(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 123;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 19;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str3 = "";
        }
        if ((i & 8) != 0) {
            int i7 = component3 + 95;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str4 = "";
        }
        this(str, str2, str3, str4);
    }

    public final String getNumber() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.number;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.accountNumber;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getStoreNumber() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.storeNumber;
        int i4 = i3 + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 1 + 111;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public QrCodeResp() {
        this(null, null, null, null, 15, null);
    }

    public static QrCodeResp copy$default(QrCodeResp qrCodeResp, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = qrCodeResp.number;
        }
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            String str5 = qrCodeResp.amount;
            int i6 = i3 + 45;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str2 = str5;
        }
        if ((i & 4) != 0) {
            str3 = qrCodeResp.accountNumber;
        }
        if ((i & 8) != 0) {
            str4 = qrCodeResp.storeNumber;
        }
        return qrCodeResp.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.number;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.accountNumber;
            int i4 = 92 / 0;
        } else {
            str = this.accountNumber;
        }
        int i5 = i3 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.storeNumber;
        int i5 = i2 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final QrCodeResp copy(String number, String amount, String accountNumber, String storeNumber) {
        int i = 2 % 2;
        QrCodeResp qrCodeResp = new QrCodeResp(number, amount, accountNumber, storeNumber);
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return qrCodeResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof QrCodeResp)) {
            int i4 = component3 + 21;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 46 / 0;
            }
            return false;
        }
        QrCodeResp qrCodeResp = (QrCodeResp) other;
        if (!Intrinsics.areEqual(this.number, qrCodeResp.number)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, qrCodeResp.amount)) {
            int i6 = component3 + 53;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountNumber, qrCodeResp.accountNumber)) {
            return Intrinsics.areEqual(this.storeNumber, qrCodeResp.storeNumber);
        }
        int i8 = component3 + 21;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.number;
        int iHashCode4 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = component3 + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.amount;
        if (str2 == null) {
            int i4 = component1 + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.accountNumber;
        if (str3 == null) {
            int i6 = component3 + 43;
            component1 = i6 % 128;
            iHashCode3 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.storeNumber;
        if (str4 == null) {
            int i7 = component1 + 79;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode4 = str4.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QrCodeResp(number=" + this.number + ", amount=" + this.amount + ", accountNumber=" + this.accountNumber + ", storeNumber=" + this.storeNumber + ")";
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
