package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/RedeemBongaPayload;", "Landroid/os/Parcelable;", "msisdn", "", "amount", "resourceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAmount", "getResourceType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RedeemBongaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RedeemBongaPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("resourceType")
    private final String resourceType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RedeemBongaPayload> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RedeemBongaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RedeemBongaPayload redeemBongaPayload = new RedeemBongaPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 87;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return redeemBongaPayload;
            }
            throw null;
        }

        @Override
        public RedeemBongaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            RedeemBongaPayload redeemBongaPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 81;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return redeemBongaPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RedeemBongaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 59;
            component3 = i3 % 128;
            RedeemBongaPayload[] redeemBongaPayloadArr = new RedeemBongaPayload[i];
            if (i3 % 2 != 0) {
                return redeemBongaPayloadArr;
            }
            throw null;
        }

        @Override
        public RedeemBongaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 5;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            RedeemBongaPayload[] redeemBongaPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 121;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return redeemBongaPayloadArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RedeemBongaPayload(String str, String str2, String str3) {
        this.msisdn = str;
        this.amount = str2;
        this.resourceType = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resourceType;
        int i5 = i2 + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 61;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RedeemBongaPayload copy$default(RedeemBongaPayload redeemBongaPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 9;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            int i5 = i4 + 91;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str = redeemBongaPayload.msisdn;
            if (i6 == 0) {
                int i7 = 48 / 0;
            }
        }
        if ((i & 2) != 0) {
            str2 = redeemBongaPayload.amount;
        }
        if ((i & 4) != 0) {
            str3 = redeemBongaPayload.resourceType;
        }
        return redeemBongaPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 75;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.resourceType;
            int i4 = 86 / 0;
        } else {
            str = this.resourceType;
        }
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final RedeemBongaPayload copy(String msisdn, String amount, String resourceType) {
        int i = 2 % 2;
        RedeemBongaPayload redeemBongaPayload = new RedeemBongaPayload(msisdn, amount, resourceType);
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return redeemBongaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof RedeemBongaPayload)) {
            return false;
        }
        RedeemBongaPayload redeemBongaPayload = (RedeemBongaPayload) other;
        return Intrinsics.areEqual(this.msisdn, redeemBongaPayload.msisdn) && Intrinsics.areEqual(this.amount, redeemBongaPayload.amount) && Intrinsics.areEqual(this.resourceType, redeemBongaPayload.resourceType);
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = component1 + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.amount;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = component2 + 87;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.resourceType;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i6 = component1 + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RedeemBongaPayload(msisdn=" + this.msisdn + ", amount=" + this.amount + ", resourceType=" + this.resourceType + ")";
        int i2 = component1 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.amount);
        dest.writeString(this.resourceType);
        int i4 = component2 + 9;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
