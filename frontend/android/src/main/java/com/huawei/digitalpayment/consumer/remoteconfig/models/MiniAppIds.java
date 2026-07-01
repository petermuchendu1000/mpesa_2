package com.huawei.digitalpayment.consumer.remoteconfig.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/models/MiniAppIds;", "Landroid/os/Parcelable;", "pochiMiniAppId", "", "paypalMiniAppId", "mpesaGlobalMiniAppId", "ziidiPochiMiniAppId", "taasiPochiMiniAppId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPochiMiniAppId", "()Ljava/lang/String;", "getPaypalMiniAppId", "getMpesaGlobalMiniAppId", "getZiidiPochiMiniAppId", "getTaasiPochiMiniAppId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppIds implements Parcelable {
    public static final Parcelable.Creator<MiniAppIds> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("mpesaGlobalMiniAppId")
    private final String mpesaGlobalMiniAppId;

    @SerializedName("paypalMiniAppId")
    private final String paypalMiniAppId;

    @SerializedName("pochiMiniAppId")
    private final String pochiMiniAppId;

    @SerializedName("taasiPochiMiniAppId")
    private final String taasiPochiMiniAppId;

    @SerializedName("ziidiPochiMiniAppId")
    private final String ziidiPochiMiniAppId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniAppIds> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniAppIds createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MiniAppIds miniAppIds = new MiniAppIds(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return miniAppIds;
        }

        @Override
        public MiniAppIds createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 51;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            MiniAppIds miniAppIdsCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 81;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return miniAppIdsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniAppIds[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 59;
            component2 = i3 % 128;
            MiniAppIds[] miniAppIdsArr = new MiniAppIds[i];
            if (i3 % 2 != 0) {
                return miniAppIdsArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public MiniAppIds[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 43;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            MiniAppIds[] miniAppIdsArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 109;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return miniAppIdsArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public MiniAppIds(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.pochiMiniAppId = str;
        this.paypalMiniAppId = str2;
        this.mpesaGlobalMiniAppId = str3;
        this.ziidiPochiMiniAppId = str4;
        this.taasiPochiMiniAppId = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppIds(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        if ((i & 1) != 0) {
            int i2 = component2 + 35;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            str = "3459010249392000";
        }
        if ((i & 2) != 0) {
            int i4 = component2;
            int i5 = i4 + 117;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str6 = MpesaGlobalActivity.PAYPAL_MINI_APP_ID;
            int i6 = i4 + 113;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i9 = component2 + 97;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str3 = "3459010058086194";
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            int i11 = component2 + 119;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str4 = "3459010229706316";
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            int i14 = component3 + 95;
            component2 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            str5 = "3459010184261147";
        }
        this(str, str6, str7, str8, str5);
    }

    public final String getPochiMiniAppId() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.pochiMiniAppId;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPaypalMiniAppId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paypalMiniAppId;
        int i5 = i2 + 37;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMpesaGlobalMiniAppId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.mpesaGlobalMiniAppId;
        int i4 = i2 + 95;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return str;
    }

    public final String getZiidiPochiMiniAppId() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.ziidiPochiMiniAppId;
        int i5 = i3 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTaasiPochiMiniAppId() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.taasiPochiMiniAppId;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 23;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    public MiniAppIds() {
        this(null, null, null, null, null, 31, null);
    }

    public static MiniAppIds copy$default(MiniAppIds miniAppIds, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 119;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 7;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str6 = miniAppIds.pochiMiniAppId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = miniAppIds.pochiMiniAppId;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = miniAppIds.paypalMiniAppId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = miniAppIds.mpesaGlobalMiniAppId;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = miniAppIds.ziidiPochiMiniAppId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = miniAppIds.taasiPochiMiniAppId;
        }
        return miniAppIds.copy(str7, str8, str9, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pochiMiniAppId;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.paypalMiniAppId;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mpesaGlobalMiniAppId;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.ziidiPochiMiniAppId;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.taasiPochiMiniAppId;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MiniAppIds copy(String pochiMiniAppId, String paypalMiniAppId, String mpesaGlobalMiniAppId, String ziidiPochiMiniAppId, String taasiPochiMiniAppId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pochiMiniAppId, "");
        Intrinsics.checkNotNullParameter(paypalMiniAppId, "");
        Intrinsics.checkNotNullParameter(mpesaGlobalMiniAppId, "");
        Intrinsics.checkNotNullParameter(ziidiPochiMiniAppId, "");
        Intrinsics.checkNotNullParameter(taasiPochiMiniAppId, "");
        MiniAppIds miniAppIds = new MiniAppIds(pochiMiniAppId, paypalMiniAppId, mpesaGlobalMiniAppId, ziidiPochiMiniAppId, taasiPochiMiniAppId);
        int i2 = component2 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return miniAppIds;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof MiniAppIds)) {
            return false;
        }
        MiniAppIds miniAppIds = (MiniAppIds) other;
        if (!Intrinsics.areEqual(this.pochiMiniAppId, miniAppIds.pochiMiniAppId)) {
            int i4 = component3 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paypalMiniAppId, miniAppIds.paypalMiniAppId) || !Intrinsics.areEqual(this.mpesaGlobalMiniAppId, miniAppIds.mpesaGlobalMiniAppId)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.ziidiPochiMiniAppId, miniAppIds.ziidiPochiMiniAppId))) {
            return Intrinsics.areEqual(this.taasiPochiMiniAppId, miniAppIds.taasiPochiMiniAppId);
        }
        int i6 = component3 + 23;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.pochiMiniAppId.hashCode() * 31) + this.paypalMiniAppId.hashCode()) * 31) + this.mpesaGlobalMiniAppId.hashCode()) * 31) + this.ziidiPochiMiniAppId.hashCode()) * 31) + this.taasiPochiMiniAppId.hashCode();
        int i4 = component3 + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppIds(pochiMiniAppId=" + this.pochiMiniAppId + ", paypalMiniAppId=" + this.paypalMiniAppId + ", mpesaGlobalMiniAppId=" + this.mpesaGlobalMiniAppId + ", ziidiPochiMiniAppId=" + this.ziidiPochiMiniAppId + ", taasiPochiMiniAppId=" + this.taasiPochiMiniAppId + ")";
        int i2 = component2 + 81;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.pochiMiniAppId);
        dest.writeString(this.paypalMiniAppId);
        dest.writeString(this.mpesaGlobalMiniAppId);
        dest.writeString(this.ziidiPochiMiniAppId);
        dest.writeString(this.taasiPochiMiniAppId);
        int i4 = component3 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
