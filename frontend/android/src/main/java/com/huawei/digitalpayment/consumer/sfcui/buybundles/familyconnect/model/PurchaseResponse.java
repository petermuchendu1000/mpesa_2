package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/PurchaseResponse;", "Landroid/os/Parcelable;", Keys.KEY_CUSTOMER_MESSAGE, "", "status", DisPlayItems.TRANSACTION_ID, "resultCode", "resultDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerMessage", "()Ljava/lang/String;", "getStatus", "getTransactionId", "getResultCode", "getResultDesc", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PurchaseResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
    private final String customerMessage;

    @SerializedName("resultCode")
    private final String resultCode;

    @SerializedName("resultDesc")
    private final String resultDesc;

    @SerializedName("status")
    private final String status;

    @SerializedName(DisPlayItems.TRANSACTION_ID)
    private final String transactionId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PurchaseResponse> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PurchaseResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PurchaseResponse purchaseResponse = new PurchaseResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return purchaseResponse;
        }

        @Override
        public PurchaseResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            PurchaseResponse purchaseResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 5;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return purchaseResponseCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PurchaseResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 17;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            PurchaseResponse[] purchaseResponseArr = new PurchaseResponse[i];
            int i6 = i3 + 57;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return purchaseResponseArr;
            }
            throw null;
        }

        @Override
        public PurchaseResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 91;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            PurchaseResponse[] purchaseResponseArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 30 / 0;
            }
            int i6 = ShareDataUIState + 87;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 72 / 0;
            }
            return purchaseResponseArrNewArray;
        }
    }

    public PurchaseResponse(String str, String str2, String str3, String str4, String str5) {
        this.customerMessage = str;
        this.status = str2;
        this.transactionId = str3;
        this.resultCode = str4;
        this.resultDesc = str5;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.customerMessage;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionId;
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final String getResultCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resultCode;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public final String getResultDesc() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.resultDesc;
            int i4 = 58 / 0;
        } else {
            str = this.resultDesc;
        }
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 115;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
    }

    public static PurchaseResponse copy$default(PurchaseResponse purchaseResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = purchaseResponse.customerMessage;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = purchaseResponse.status;
            int i3 = ShareDataUIState + 117;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = purchaseResponse.transactionId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 125;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str9 = purchaseResponse.resultCode;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = purchaseResponse.resultCode;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i6 = copydefault + 19;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str5 = purchaseResponse.resultDesc;
        }
        return purchaseResponse.copy(str6, str7, str8, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.customerMessage;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 81;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionId;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resultCode;
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resultDesc;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PurchaseResponse copy(String customerMessage, String status, String transactionId, String resultCode, String resultDesc) {
        int i = 2 % 2;
        PurchaseResponse purchaseResponse = new PurchaseResponse(customerMessage, status, transactionId, resultCode, resultDesc);
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return purchaseResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 123;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof PurchaseResponse)) {
            return false;
        }
        PurchaseResponse purchaseResponse = (PurchaseResponse) other;
        if (!Intrinsics.areEqual(this.customerMessage, purchaseResponse.customerMessage)) {
            int i3 = copydefault + 49;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.status, purchaseResponse.status) || !Intrinsics.areEqual(this.transactionId, purchaseResponse.transactionId) || !Intrinsics.areEqual(this.resultCode, purchaseResponse.resultCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.resultDesc, purchaseResponse.resultDesc)) {
            return true;
        }
        int i5 = copydefault + 49;
        ShareDataUIState = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.customerMessage;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i2 = copydefault + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        String str3 = this.transactionId;
        if (str3 == null) {
            int i4 = ShareDataUIState + 65;
            copydefault = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.resultCode;
        if (str4 == null) {
            int i5 = ShareDataUIState + 91;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.resultDesc;
        int iHashCode5 = (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str5 != null ? str5.hashCode() : 0);
        int i7 = copydefault + 9;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseResponse(customerMessage=" + this.customerMessage + ", status=" + this.status + ", transactionId=" + this.transactionId + ", resultCode=" + this.resultCode + ", resultDesc=" + this.resultDesc + ")";
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.customerMessage);
        dest.writeString(this.status);
        dest.writeString(this.transactionId);
        dest.writeString(this.resultCode);
        dest.writeString(this.resultDesc);
        int i4 = ShareDataUIState + 55;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }
}
