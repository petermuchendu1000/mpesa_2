package com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u0019H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/TransactionResult;", "Landroid/os/Parcelable;", "currency", "", "transactionID", "transactionStatus", "rechargeSerialNo", "referenceData", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/ReferenceData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/ReferenceData;)V", "getCurrency", "()Ljava/lang/String;", "getTransactionID", "getTransactionStatus", "getRechargeSerialNo", "getReferenceData", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/ReferenceData;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionResult implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TransactionResult> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("rechargeSerialNo")
    private final String rechargeSerialNo;

    @SerializedName("referenceData")
    private final ReferenceData referenceData;

    @SerializedName("transactionID")
    private final String transactionID;

    @SerializedName("transactionStatus")
    private final String transactionStatus;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionResult> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TransactionResult createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TransactionResult transactionResult = new TransactionResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ReferenceData.CREATOR.createFromParcel(parcel));
            int i2 = copydefault + 113;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return transactionResult;
            }
            throw null;
        }

        @Override
        public TransactionResult createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            TransactionResult transactionResultCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 89 / 0;
            }
            int i5 = component3 + 59;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return transactionResultCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TransactionResult[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 25;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            TransactionResult[] transactionResultArr = new TransactionResult[i];
            int i6 = i4 + 37;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 91 / 0;
            }
            return transactionResultArr;
        }

        @Override
        public TransactionResult[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 109;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            TransactionResult[] transactionResultArrNewArray = newArray(i);
            int i5 = component3 + 47;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return transactionResultArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public TransactionResult(String str, String str2, String str3, String str4, ReferenceData referenceData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(referenceData, "");
        this.currency = str;
        this.transactionID = str2;
        this.transactionStatus = str3;
        this.rechargeSerialNo = str4;
        this.referenceData = referenceData;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTransactionID() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.transactionID;
        int i4 = i3 + 65;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTransactionStatus() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionStatus;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final String getRechargeSerialNo() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.rechargeSerialNo;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return str;
    }

    public final ReferenceData getReferenceData() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ReferenceData referenceData = this.referenceData;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return referenceData;
    }

    static {
        int i = copydefault + 89;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static TransactionResult copy$default(TransactionResult transactionResult, String str, String str2, String str3, String str4, ReferenceData referenceData, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = transactionResult.currency;
            int i3 = component1 + 49;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i5 = component1 + 113;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str6 = transactionResult.transactionID;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = transactionResult.transactionID;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = transactionResult.transactionStatus;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = transactionResult.rechargeSerialNo;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            int i6 = component3 + 103;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            referenceData = transactionResult.referenceData;
            if (i7 == 0) {
                int i8 = 78 / 0;
            }
        }
        return transactionResult.copy(str5, str7, str8, str9, referenceData);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionID;
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.transactionStatus;
        int i4 = i2 + 27;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.rechargeSerialNo;
            int i4 = 4 / 0;
        } else {
            str = this.rechargeSerialNo;
        }
        int i5 = i2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final ReferenceData component5() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.referenceData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionResult copy(String currency, String transactionID, String transactionStatus, String rechargeSerialNo, ReferenceData referenceData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(transactionID, "");
        Intrinsics.checkNotNullParameter(transactionStatus, "");
        Intrinsics.checkNotNullParameter(rechargeSerialNo, "");
        Intrinsics.checkNotNullParameter(referenceData, "");
        TransactionResult transactionResult = new TransactionResult(currency, transactionID, transactionStatus, rechargeSerialNo, referenceData);
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 29;
            component3 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof TransactionResult)) {
            int i6 = i2 + 75;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        TransactionResult transactionResult = (TransactionResult) other;
        if (Intrinsics.areEqual(this.currency, transactionResult.currency)) {
            return Intrinsics.areEqual(this.transactionID, transactionResult.transactionID) && Intrinsics.areEqual(this.transactionStatus, transactionResult.transactionStatus) && Intrinsics.areEqual(this.rechargeSerialNo, transactionResult.rechargeSerialNo) && Intrinsics.areEqual(this.referenceData, transactionResult.referenceData);
        }
        int i8 = component1 + 105;
        component3 = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.currency.hashCode() * 31) + this.transactionID.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.rechargeSerialNo.hashCode()) * 31) + this.referenceData.hashCode();
        int i4 = component1 + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionResult(currency=" + this.currency + ", transactionID=" + this.transactionID + ", transactionStatus=" + this.transactionStatus + ", rechargeSerialNo=" + this.rechargeSerialNo + ", referenceData=" + this.referenceData + ")";
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.currency);
        dest.writeString(this.transactionID);
        dest.writeString(this.transactionStatus);
        dest.writeString(this.rechargeSerialNo);
        this.referenceData.writeToParcel(dest, flags);
        int i4 = component3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
