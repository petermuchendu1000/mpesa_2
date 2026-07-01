package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/SpotifyPayload;", "Landroid/os/Parcelable;", "cspId", "", "description", "", "encryption", "relatedSubscription", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/RelatedSubscription;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/RelatedSubscription;)V", "getCspId", "()I", "getDescription", "()Ljava/lang/String;", "getEncryption", "getRelatedSubscription", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/RelatedSubscription;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpotifyPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotifyPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("cspId")
    private final int cspId;

    @SerializedName("description")
    private final String description;

    @SerializedName("encryption")
    private final String encryption;

    @SerializedName("relatedSubscription")
    private final RelatedSubscription relatedSubscription;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpotifyPayload> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SpotifyPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SpotifyPayload spotifyPayload = new SpotifyPayload(parcel.readInt(), parcel.readString(), parcel.readString(), RelatedSubscription.CREATOR.createFromParcel(parcel));
            int i2 = component3 + 9;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return spotifyPayload;
            }
            throw null;
        }

        @Override
        public SpotifyPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SpotifyPayload spotifyPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            return spotifyPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SpotifyPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 7;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            SpotifyPayload[] spotifyPayloadArr = new SpotifyPayload[i];
            int i6 = i3 + 33;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return spotifyPayloadArr;
        }

        @Override
        public SpotifyPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 95;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            SpotifyPayload[] spotifyPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 13 / 0;
            }
            return spotifyPayloadArrNewArray;
        }
    }

    public SpotifyPayload(int i, String str, String str2, RelatedSubscription relatedSubscription) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relatedSubscription, "");
        this.cspId = i;
        this.description = str;
        this.encryption = str2;
        this.relatedSubscription = relatedSubscription;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpotifyPayload(int i, String str, String str2, RelatedSubscription relatedSubscription, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = component2 + 43;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 63 / 0;
            }
            int i5 = 2 % 2;
            str2 = null;
        }
        this(i, str, str2, relatedSubscription);
    }

    public final int getCspId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.cspId;
        int i6 = i2 + 5;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.description;
        }
        throw null;
    }

    public final String getEncryption() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.encryption;
            int i4 = 85 / 0;
        } else {
            str = this.encryption;
        }
        int i5 = i2 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final RelatedSubscription getRelatedSubscription() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        RelatedSubscription relatedSubscription = this.relatedSubscription;
        int i5 = i3 + 17;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return relatedSubscription;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 121;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static SpotifyPayload copy$default(SpotifyPayload spotifyPayload, int i, String str, String str2, RelatedSubscription relatedSubscription, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component3;
            int i5 = i4 + 61;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = spotifyPayload.cspId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = spotifyPayload.cspId;
            int i8 = i4 + 35;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            i = i7;
        }
        if ((i2 & 2) != 0) {
            str = spotifyPayload.description;
        }
        if ((i2 & 4) != 0) {
            str2 = spotifyPayload.encryption;
        }
        if ((i2 & 8) != 0) {
            int i10 = component2 + 95;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            relatedSubscription = spotifyPayload.relatedSubscription;
        }
        return spotifyPayload.copy(i, str, str2, relatedSubscription);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 63;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0) {
            i = this.cspId;
            int i5 = 11 / 0;
        } else {
            i = this.cspId;
        }
        int i6 = i4 + 125;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.description;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.encryption;
        int i4 = i2 + 29;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final RelatedSubscription component4() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RelatedSubscription relatedSubscription = this.relatedSubscription;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return relatedSubscription;
    }

    public final SpotifyPayload copy(int cspId, String description, String encryption, RelatedSubscription relatedSubscription) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(relatedSubscription, "");
        SpotifyPayload spotifyPayload = new SpotifyPayload(cspId, description, encryption, relatedSubscription);
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return spotifyPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyPayload)) {
            int i2 = component3 + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SpotifyPayload spotifyPayload = (SpotifyPayload) other;
        if (this.cspId != spotifyPayload.cspId) {
            int i4 = component3 + 25;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, spotifyPayload.description)) {
            int i6 = component3 + 1;
            component2 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.encryption, spotifyPayload.encryption)) {
            return Intrinsics.areEqual(this.relatedSubscription, spotifyPayload.relatedSubscription);
        }
        int i7 = component3 + 1;
        component2 = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.cspId);
        int iHashCode3 = this.description.hashCode();
        String str = this.encryption;
        if (str == null) {
            int i4 = component3 + 3;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 109;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + this.relatedSubscription.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SpotifyPayload(cspId=" + this.cspId + ", description=" + this.description + ", encryption=" + this.encryption + ", relatedSubscription=" + this.relatedSubscription + ")";
        int i2 = component2 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeInt(this.cspId);
            dest.writeString(this.description);
            dest.writeString(this.encryption);
            this.relatedSubscription.writeToParcel(dest, flags);
            int i4 = 32 / 0;
        } else {
            dest.writeInt(this.cspId);
            dest.writeString(this.description);
            dest.writeString(this.encryption);
            this.relatedSubscription.writeToParcel(dest, flags);
        }
        int i5 = component2 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
    }
}
