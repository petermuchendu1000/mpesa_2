package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home5gPromoOffer;", "Landroid/os/Parcelable;", "description", "", "offeringId", "validity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getOfferingId", "getValidity", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home5gPromoOffer implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home5gPromoOffer> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("description")
    private final String description;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("validity")
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home5gPromoOffer> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5gPromoOffer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home5gPromoOffer home5gPromoOffer = new Home5gPromoOffer(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 109;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return home5gPromoOffer;
        }

        @Override
        public Home5gPromoOffer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Home5gPromoOffer home5gPromoOfferCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 117;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return home5gPromoOfferCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5gPromoOffer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 123;
            int i4 = i3 % 128;
            copydefault = i4;
            Home5gPromoOffer[] home5gPromoOfferArr = new Home5gPromoOffer[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return home5gPromoOfferArr;
        }

        @Override
        public Home5gPromoOffer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Home5gPromoOffer[] home5gPromoOfferArrNewArray = newArray(i);
            int i5 = copydefault + 55;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return home5gPromoOfferArrNewArray;
        }
    }

    public Home5gPromoOffer(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.description = str;
        this.offeringId = str2;
        this.validity = str3;
    }

    public final String getDescription() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.description;
            int i4 = 14 / 0;
        } else {
            str = this.description;
        }
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferingId() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.offeringId;
            int i4 = 36 / 0;
        } else {
            str = this.offeringId;
        }
        int i5 = i3 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 45;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static Home5gPromoOffer copy$default(Home5gPromoOffer home5gPromoOffer, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 21;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = home5gPromoOffer.description;
        }
        if ((i & 2) != 0) {
            str2 = home5gPromoOffer.offeringId;
            int i5 = ShareDataUIState + 75;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            str3 = home5gPromoOffer.validity;
        }
        return home5gPromoOffer.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offeringId;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        throw null;
    }

    public final Home5gPromoOffer copy(String description, String offeringId, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(validity, "");
        Home5gPromoOffer home5gPromoOffer = new Home5gPromoOffer(description, offeringId, validity);
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return home5gPromoOffer;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Home5gPromoOffer)) {
            int i4 = i3 + 87;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        Home5gPromoOffer home5gPromoOffer = (Home5gPromoOffer) other;
        if (!Intrinsics.areEqual(this.description, home5gPromoOffer.description)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.offeringId, home5gPromoOffer.offeringId))) {
            return Intrinsics.areEqual(this.validity, home5gPromoOffer.validity);
        }
        int i5 = ShareDataUIState + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.description.hashCode() >> 94) + this.offeringId.hashCode()) * 113) % this.validity.hashCode() : (((this.description.hashCode() * 31) + this.offeringId.hashCode()) * 31) + this.validity.hashCode();
        int i3 = ShareDataUIState + 27;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home5gPromoOffer(description=" + this.description + ", offeringId=" + this.offeringId + ", validity=" + this.validity + ")";
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.description);
        dest.writeString(this.offeringId);
        dest.writeString(this.validity);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
