package com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/ReferenceData;", "Landroid/os/Parcelable;", "primaryParty", "", KeysConstants.KEY_BILL_REFERENCE_NUMBER, "primaryIdentity", "receiverParty", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryParty", "()Ljava/lang/String;", "getBillReferenceNumber", "getPrimaryIdentity", "getReceiverParty", "getAmount", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReferenceData> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("amount")
    private final String amount;

    @SerializedName(KeysConstants.KEY_BILL_REFERENCE_NUMBER)
    private final String billReferenceNumber;

    @SerializedName("primaryIdentity")
    private final String primaryIdentity;

    @SerializedName("primaryParty")
    private final String primaryParty;

    @SerializedName("receiverParty")
    private final String receiverParty;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReferenceData> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ReferenceData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ReferenceData referenceData = new ReferenceData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 65;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return referenceData;
        }

        @Override
        public ReferenceData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 57;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ReferenceData referenceDataCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 11 / 0;
            }
            return referenceDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ReferenceData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 25;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            ReferenceData[] referenceDataArr = new ReferenceData[i];
            int i6 = i4 + 51;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return referenceDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ReferenceData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 47;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ReferenceData(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.primaryParty = str;
        this.billReferenceNumber = str2;
        this.primaryIdentity = str3;
        this.receiverParty = str4;
        this.amount = str5;
    }

    public final String getPrimaryParty() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.primaryParty;
            int i4 = 88 / 0;
        } else {
            str = this.primaryParty;
        }
        int i5 = i2 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBillReferenceNumber() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.billReferenceNumber;
        int i4 = i3 + 107;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPrimaryIdentity() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.primaryIdentity;
        }
        throw null;
    }

    public final String getReceiverParty() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.receiverParty;
        int i5 = i3 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 47;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ReferenceData copy$default(ReferenceData referenceData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = referenceData.primaryParty;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str2 = referenceData.billReferenceNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i3 = component2 + 95;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str3 = referenceData.primaryIdentity;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = referenceData.receiverParty;
            int i5 = component2 + 75;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            }
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = referenceData.amount;
        }
        return referenceData.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.primaryParty;
        int i5 = i3 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.billReferenceNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.primaryIdentity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.receiverParty;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ReferenceData copy(String primaryParty, String billReferenceNumber, String primaryIdentity, String receiverParty, String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(primaryParty, "");
        Intrinsics.checkNotNullParameter(billReferenceNumber, "");
        Intrinsics.checkNotNullParameter(primaryIdentity, "");
        Intrinsics.checkNotNullParameter(receiverParty, "");
        Intrinsics.checkNotNullParameter(amount, "");
        ReferenceData referenceData = new ReferenceData(primaryParty, billReferenceNumber, primaryIdentity, receiverParty, amount);
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return referenceData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ReferenceData)) {
            return false;
        }
        ReferenceData referenceData = (ReferenceData) other;
        if (!Intrinsics.areEqual(this.primaryParty, referenceData.primaryParty)) {
            int i4 = copydefault + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.billReferenceNumber, referenceData.billReferenceNumber)) {
            int i6 = copydefault + 55;
            component2 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.primaryIdentity, referenceData.primaryIdentity)) {
            return false;
        }
        if (Intrinsics.areEqual(this.receiverParty, referenceData.receiverParty)) {
            return !(Intrinsics.areEqual(this.amount, referenceData.amount) ^ true);
        }
        int i7 = copydefault + 49;
        component2 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.primaryParty.hashCode() * 31) + this.billReferenceNumber.hashCode()) * 31) + this.primaryIdentity.hashCode()) * 31) + this.receiverParty.hashCode()) * 31) + this.amount.hashCode();
        int i4 = component2 + 115;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReferenceData(primaryParty=" + this.primaryParty + ", billReferenceNumber=" + this.billReferenceNumber + ", primaryIdentity=" + this.primaryIdentity + ", receiverParty=" + this.receiverParty + ", amount=" + this.amount + ")";
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.primaryParty);
        dest.writeString(this.billReferenceNumber);
        dest.writeString(this.primaryIdentity);
        dest.writeString(this.receiverParty);
        dest.writeString(this.amount);
        int i4 = component2 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
