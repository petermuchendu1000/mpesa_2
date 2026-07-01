package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoFetchOffersPayload;", "Landroid/os/Parcelable;", "channelId", "", "partyAMsisdn", "partyBMsisdn", "tunukiwaSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getPartyAMsisdn", "getPartyBMsisdn", "getTunukiwaSessionId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfaMotoFetchOffersPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OfaMotoFetchOffersPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("channelId")
    private final String channelId;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("tunukiwaSessionId")
    private final String tunukiwaSessionId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfaMotoFetchOffersPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfaMotoFetchOffersPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OfaMotoFetchOffersPayload ofaMotoFetchOffersPayload = new OfaMotoFetchOffersPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 21;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return ofaMotoFetchOffersPayload;
            }
            throw null;
        }

        @Override
        public OfaMotoFetchOffersPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            OfaMotoFetchOffersPayload ofaMotoFetchOffersPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            int i5 = ShareDataUIState + 13;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 40 / 0;
            }
            return ofaMotoFetchOffersPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfaMotoFetchOffersPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            OfaMotoFetchOffersPayload[] ofaMotoFetchOffersPayloadArr = new OfaMotoFetchOffersPayload[i];
            int i6 = i3 + 41;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 89 / 0;
            }
            return ofaMotoFetchOffersPayloadArr;
        }

        @Override
        public OfaMotoFetchOffersPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            OfaMotoFetchOffersPayload[] ofaMotoFetchOffersPayloadArrNewArray = newArray(i);
            int i5 = component1 + 41;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return ofaMotoFetchOffersPayloadArrNewArray;
        }
    }

    public OfaMotoFetchOffersPayload(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.channelId = str;
        this.partyAMsisdn = str2;
        this.partyBMsisdn = str3;
        this.tunukiwaSessionId = str4;
    }

    public final String getChannelId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.channelId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.partyAMsisdn;
        int i4 = i2 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyBMsisdn;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTunukiwaSessionId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.tunukiwaSessionId;
        int i4 = i2 + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 65;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static OfaMotoFetchOffersPayload copy$default(OfaMotoFetchOffersPayload ofaMotoFetchOffersPayload, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 31;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str5 = ofaMotoFetchOffersPayload.channelId;
                throw null;
            }
            str = ofaMotoFetchOffersPayload.channelId;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 65;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                String str6 = ofaMotoFetchOffersPayload.partyAMsisdn;
                throw null;
            }
            str2 = ofaMotoFetchOffersPayload.partyAMsisdn;
        }
        if ((i & 4) != 0) {
            int i5 = component3 + 53;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str3 = ofaMotoFetchOffersPayload.partyBMsisdn;
        }
        if ((i & 8) != 0) {
            str4 = ofaMotoFetchOffersPayload.tunukiwaSessionId;
            int i7 = ShareDataUIState + 65;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        return ofaMotoFetchOffersPayload.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.channelId;
        int i4 = i3 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyAMsisdn;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.partyBMsisdn;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.tunukiwaSessionId;
        int i4 = i2 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final OfaMotoFetchOffersPayload copy(String channelId, String partyAMsisdn, String partyBMsisdn, String tunukiwaSessionId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channelId, "");
        Intrinsics.checkNotNullParameter(partyAMsisdn, "");
        Intrinsics.checkNotNullParameter(partyBMsisdn, "");
        Intrinsics.checkNotNullParameter(tunukiwaSessionId, "");
        OfaMotoFetchOffersPayload ofaMotoFetchOffersPayload = new OfaMotoFetchOffersPayload(channelId, partyAMsisdn, partyBMsisdn, tunukiwaSessionId);
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return ofaMotoFetchOffersPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfaMotoFetchOffersPayload)) {
            int i4 = i2 + 89;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        OfaMotoFetchOffersPayload ofaMotoFetchOffersPayload = (OfaMotoFetchOffersPayload) other;
        if (!Intrinsics.areEqual(this.channelId, ofaMotoFetchOffersPayload.channelId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.partyAMsisdn, ofaMotoFetchOffersPayload.partyAMsisdn)) {
            int i5 = ShareDataUIState + 31;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.partyBMsisdn, ofaMotoFetchOffersPayload.partyBMsisdn)) {
            return Intrinsics.areEqual(this.tunukiwaSessionId, ofaMotoFetchOffersPayload.tunukiwaSessionId);
        }
        int i7 = ShareDataUIState + 25;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.channelId.hashCode();
        return i3 == 0 ? (((((iHashCode / 124) - this.partyAMsisdn.hashCode()) * 88) - this.partyBMsisdn.hashCode()) * 114) / this.tunukiwaSessionId.hashCode() : (((((iHashCode * 31) + this.partyAMsisdn.hashCode()) * 31) + this.partyBMsisdn.hashCode()) * 31) + this.tunukiwaSessionId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfaMotoFetchOffersPayload(channelId=" + this.channelId + ", partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", tunukiwaSessionId=" + this.tunukiwaSessionId + ")";
        int i2 = ShareDataUIState + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.channelId);
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeString(this.tunukiwaSessionId);
        int i4 = component3 + 41;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
