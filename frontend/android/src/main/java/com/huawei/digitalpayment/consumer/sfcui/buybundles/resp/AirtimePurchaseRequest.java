package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.ComponentActivityonBackPressedDispatcher2ExternalSyntheticLambda1;
import kotlin.Metadata;
import kotlin.invokelambda2lambda1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/AirtimePurchaseRequest;", "Landroid/os/Parcelable;", "amount", "", "msisdn", "validity", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getMsisdn", "getValidity", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirtimePurchaseRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AirtimePurchaseRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String amount;
    private final String msisdn;
    private final String name;
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AirtimePurchaseRequest> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AirtimePurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AirtimePurchaseRequest airtimePurchaseRequest = new AirtimePurchaseRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 39;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return airtimePurchaseRequest;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public AirtimePurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AirtimePurchaseRequest airtimePurchaseRequestCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 35;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return airtimePurchaseRequestCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AirtimePurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 115;
            int i4 = i3 % 128;
            component1 = i4;
            AirtimePurchaseRequest[] airtimePurchaseRequestArr = new AirtimePurchaseRequest[i];
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return airtimePurchaseRequestArr;
        }

        @Override
        public AirtimePurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 87;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            AirtimePurchaseRequest[] airtimePurchaseRequestArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 53 / 0;
            }
            int i6 = component3 + 35;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return airtimePurchaseRequestArrNewArray;
            }
            throw null;
        }

        public static void ShareDataUIState() {
            invokelambda2lambda1.component3[0] = ComponentActivityonBackPressedDispatcher2ExternalSyntheticLambda1.component3[0];
        }
    }

    public AirtimePurchaseRequest(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.amount = str;
        this.msisdn = str2;
        this.validity = str3;
        this.name = str4;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValidity() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.validity;
            int i4 = 79 / 0;
        } else {
            str = this.validity;
        }
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 111;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AirtimePurchaseRequest copy$default(AirtimePurchaseRequest airtimePurchaseRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 23;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = airtimePurchaseRequest.amount;
        }
        if ((i & 2) != 0) {
            str2 = airtimePurchaseRequest.msisdn;
            int i5 = component3 + 7;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 5;
            }
        }
        if ((i & 4) != 0) {
            str3 = airtimePurchaseRequest.validity;
        }
        if ((i & 8) != 0) {
            int i7 = component2 + 99;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str4 = airtimePurchaseRequest.name;
        }
        return airtimePurchaseRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amount;
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AirtimePurchaseRequest copy(String amount, String msisdn, String validity, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(validity, "");
        Intrinsics.checkNotNullParameter(name, "");
        AirtimePurchaseRequest airtimePurchaseRequest = new AirtimePurchaseRequest(amount, msisdn, validity, name);
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return airtimePurchaseRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AirtimePurchaseRequest)) {
            return false;
        }
        AirtimePurchaseRequest airtimePurchaseRequest = (AirtimePurchaseRequest) other;
        if (!Intrinsics.areEqual(this.amount, airtimePurchaseRequest.amount)) {
            int i4 = component3 + 115;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, airtimePurchaseRequest.msisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.validity, airtimePurchaseRequest.validity)) {
            return Intrinsics.areEqual(this.name, airtimePurchaseRequest.name);
        }
        int i6 = component2 + 107;
        component3 = i6 % 128;
        return !(i6 % 2 != 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.amount.hashCode();
        return i3 != 0 ? (((((iHashCode >>> 97) % this.msisdn.hashCode()) * 47) >> this.validity.hashCode()) >>> 23) << this.name.hashCode() : (((((iHashCode * 31) + this.msisdn.hashCode()) * 31) + this.validity.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AirtimePurchaseRequest(amount=" + this.amount + ", msisdn=" + this.msisdn + ", validity=" + this.validity + ", name=" + this.name + ")";
        int i2 = component3 + 49;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeString(this.msisdn);
        dest.writeString(this.validity);
        dest.writeString(this.name);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
