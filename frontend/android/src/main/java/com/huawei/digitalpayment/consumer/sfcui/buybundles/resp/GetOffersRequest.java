package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/GetOffersRequest;", "Landroid/os/Parcelable;", "amount", "", "msisdn", "validity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getMsisdn", "getValidity", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetOffersRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GetOffersRequest> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private final String amount;
    private final String msisdn;
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetOffersRequest> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GetOffersRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            GetOffersRequest getOffersRequest = new GetOffersRequest(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 25;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 66 / 0;
            }
            return getOffersRequest;
        }

        @Override
        public GetOffersRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GetOffersRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 51;
            int i4 = i3 % 128;
            copydefault = i4;
            GetOffersRequest[] getOffersRequestArr = new GetOffersRequest[i];
            if (i3 % 2 != 0) {
                int i5 = 64 / 0;
            }
            int i6 = i4 + 115;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return getOffersRequestArr;
        }

        @Override
        public GetOffersRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 7;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            GetOffersRequest[] getOffersRequestArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 71 / 0;
            }
            int i6 = ShareDataUIState + 95;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return getOffersRequestArrNewArray;
        }
    }

    public GetOffersRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.amount = str;
        this.msisdn = str2;
        this.validity = str3;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 59;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.validity;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 15;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static GetOffersRequest copy$default(GetOffersRequest getOffersRequest, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = getOffersRequest.amount;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 29;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                str2 = getOffersRequest.msisdn;
                int i4 = 59 / 0;
            } else {
                str2 = getOffersRequest.msisdn;
            }
        }
        if ((i & 4) != 0) {
            str3 = getOffersRequest.validity;
            int i5 = ShareDataUIState + 93;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return getOffersRequest.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i2 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GetOffersRequest copy(String amount, String msisdn, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(validity, "");
        GetOffersRequest getOffersRequest = new GetOffersRequest(amount, msisdn, validity);
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return getOffersRequest;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 115;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
            return true;
        }
        if (other instanceof GetOffersRequest) {
            GetOffersRequest getOffersRequest = (GetOffersRequest) other;
            return Intrinsics.areEqual(this.amount, getOffersRequest.amount) && Intrinsics.areEqual(this.msisdn, getOffersRequest.msisdn) && Intrinsics.areEqual(this.validity, getOffersRequest.validity);
        }
        int i7 = i3 + 53;
        copydefault = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.amount.hashCode();
        return i3 != 0 ? (((iHashCode >> 11) / this.msisdn.hashCode()) >>> 118) / this.validity.hashCode() : (((iHashCode * 31) + this.msisdn.hashCode()) * 31) + this.validity.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetOffersRequest(amount=" + this.amount + ", msisdn=" + this.msisdn + ", validity=" + this.validity + ")";
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.amount);
            dest.writeString(this.msisdn);
            dest.writeString(this.validity);
            int i4 = 5 / 0;
        } else {
            dest.writeString(this.amount);
            dest.writeString(this.msisdn);
            dest.writeString(this.validity);
        }
        int i5 = ShareDataUIState + 103;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
    }
}
