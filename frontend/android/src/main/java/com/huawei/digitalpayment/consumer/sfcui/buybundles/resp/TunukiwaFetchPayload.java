package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaFetchPayload;", "Landroid/os/Parcelable;", "offerJourney", "", "partyAMsisdn", "partyBMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOfferJourney", "()Ljava/lang/String;", "getPartyAMsisdn", "getPartyBMsisdn", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaFetchPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TunukiwaFetchPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("offerJourney")
    private final String offerJourney;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TunukiwaFetchPayload> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaFetchPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TunukiwaFetchPayload tunukiwaFetchPayload = new TunukiwaFetchPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return tunukiwaFetchPayload;
        }

        @Override
        public TunukiwaFetchPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            TunukiwaFetchPayload tunukiwaFetchPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 0 / 0;
            }
            return tunukiwaFetchPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaFetchPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 39;
            int i4 = i3 % 128;
            copydefault = i4;
            Object obj = null;
            TunukiwaFetchPayload[] tunukiwaFetchPayloadArr = new TunukiwaFetchPayload[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 33;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return tunukiwaFetchPayloadArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public TunukiwaFetchPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 1;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TunukiwaFetchPayload[] tunukiwaFetchPayloadArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 99;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return tunukiwaFetchPayloadArrNewArray;
        }
    }

    public TunukiwaFetchPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.offerJourney = str;
        this.partyAMsisdn = str2;
        this.partyBMsisdn = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TunukiwaFetchPayload(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 21;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "2";
        }
        this(str, str2, str3);
    }

    public final String getOfferJourney() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerJourney;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.partyAMsisdn;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return str;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.partyBMsisdn;
        int i4 = i3 + 105;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component2 + 15;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static TunukiwaFetchPayload copy$default(TunukiwaFetchPayload tunukiwaFetchPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 25;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                String str4 = tunukiwaFetchPayload.offerJourney;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = tunukiwaFetchPayload.offerJourney;
        }
        if ((i & 2) != 0) {
            str2 = tunukiwaFetchPayload.partyAMsisdn;
        }
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 117;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str3 = tunukiwaFetchPayload.partyBMsisdn;
        }
        return tunukiwaFetchPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.offerJourney;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyAMsisdn;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.partyBMsisdn;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TunukiwaFetchPayload copy(String offerJourney, String partyAMsisdn, String partyBMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(offerJourney, "");
        Intrinsics.checkNotNullParameter(partyAMsisdn, "");
        Intrinsics.checkNotNullParameter(partyBMsisdn, "");
        TunukiwaFetchPayload tunukiwaFetchPayload = new TunukiwaFetchPayload(offerJourney, partyAMsisdn, partyBMsisdn);
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return tunukiwaFetchPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 41;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof TunukiwaFetchPayload)) {
            int i3 = component3 + 19;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        TunukiwaFetchPayload tunukiwaFetchPayload = (TunukiwaFetchPayload) other;
        if (!Intrinsics.areEqual(this.offerJourney, tunukiwaFetchPayload.offerJourney)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.partyAMsisdn, tunukiwaFetchPayload.partyAMsisdn)) {
            int i5 = ShareDataUIState + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.partyBMsisdn, tunukiwaFetchPayload.partyBMsisdn)) {
            int i7 = component3 + 89;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = component3 + 55;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.offerJourney.hashCode() / 54) >>> this.partyAMsisdn.hashCode()) << 87) * this.partyBMsisdn.hashCode() : (((this.offerJourney.hashCode() * 31) + this.partyAMsisdn.hashCode()) * 31) + this.partyBMsisdn.hashCode();
        int i3 = component3 + 11;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TunukiwaFetchPayload(offerJourney=" + this.offerJourney + ", partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ")";
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.offerJourney);
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        int i4 = component3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
