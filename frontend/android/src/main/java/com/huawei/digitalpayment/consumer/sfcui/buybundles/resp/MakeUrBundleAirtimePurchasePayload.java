package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0006H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0006H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleAirtimePurchasePayload;", "Landroid/os/Parcelable;", GriverParams.ShareParams.DESC, "", "msisdn", "totalPrice", "", "validity", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getMsisdn", "getTotalPrice", "()I", "getValidity", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleAirtimePurchasePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MakeUrBundleAirtimePurchasePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(GriverParams.ShareParams.DESC)
    private final String desc;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("totalPrice")
    private final int totalPrice;

    @SerializedName("validity")
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MakeUrBundleAirtimePurchasePayload> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MakeUrBundleAirtimePurchasePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MakeUrBundleAirtimePurchasePayload makeUrBundleAirtimePurchasePayload = new MakeUrBundleAirtimePurchasePayload(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return makeUrBundleAirtimePurchasePayload;
        }

        @Override
        public MakeUrBundleAirtimePurchasePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            MakeUrBundleAirtimePurchasePayload makeUrBundleAirtimePurchasePayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 121;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return makeUrBundleAirtimePurchasePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MakeUrBundleAirtimePurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 63;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            MakeUrBundleAirtimePurchasePayload[] makeUrBundleAirtimePurchasePayloadArr = new MakeUrBundleAirtimePurchasePayload[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 111;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return makeUrBundleAirtimePurchasePayloadArr;
        }

        @Override
        public MakeUrBundleAirtimePurchasePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            MakeUrBundleAirtimePurchasePayload[] makeUrBundleAirtimePurchasePayloadArrNewArray = newArray(i);
            int i5 = component2 + 125;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return makeUrBundleAirtimePurchasePayloadArrNewArray;
        }
    }

    public MakeUrBundleAirtimePurchasePayload(String str, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.desc = str;
        this.msisdn = str2;
        this.totalPrice = i;
        this.validity = str3;
    }

    public final String getDesc() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.desc;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 81;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getTotalPrice() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.totalPrice;
        if (i3 == 0) {
            int i5 = 36 / 0;
        }
        return i4;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 53;
        component3 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MakeUrBundleAirtimePurchasePayload copy$default(MakeUrBundleAirtimePurchasePayload makeUrBundleAirtimePurchasePayload, String str, String str2, int i, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component1;
        int i5 = i4 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0 && (i2 & 1) != 0) {
            str = makeUrBundleAirtimePurchasePayload.desc;
        }
        if ((i2 & 2) != 0) {
            int i6 = i4 + 1;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                str2 = makeUrBundleAirtimePurchasePayload.msisdn;
                int i7 = 31 / 0;
            } else {
                str2 = makeUrBundleAirtimePurchasePayload.msisdn;
            }
        }
        if ((i2 & 4) != 0) {
            i = makeUrBundleAirtimePurchasePayload.totalPrice;
        }
        if ((i2 & 8) != 0) {
            int i8 = i4 + 49;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            str3 = makeUrBundleAirtimePurchasePayload.validity;
        }
        return makeUrBundleAirtimePurchasePayload.copy(str, str2, i, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.desc;
        int i5 = i3 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.totalPrice;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final MakeUrBundleAirtimePurchasePayload copy(String desc, String msisdn, int totalPrice, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(desc, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(validity, "");
        MakeUrBundleAirtimePurchasePayload makeUrBundleAirtimePurchasePayload = new MakeUrBundleAirtimePurchasePayload(desc, msisdn, totalPrice, validity);
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return makeUrBundleAirtimePurchasePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 33;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof MakeUrBundleAirtimePurchasePayload)) {
            return false;
        }
        MakeUrBundleAirtimePurchasePayload makeUrBundleAirtimePurchasePayload = (MakeUrBundleAirtimePurchasePayload) other;
        if (Intrinsics.areEqual(this.desc, makeUrBundleAirtimePurchasePayload.desc)) {
            return Intrinsics.areEqual(this.msisdn, makeUrBundleAirtimePurchasePayload.msisdn) && this.totalPrice == makeUrBundleAirtimePurchasePayload.totalPrice && Intrinsics.areEqual(this.validity, makeUrBundleAirtimePurchasePayload.validity);
        }
        int i6 = ShareDataUIState + 49;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = (((this.desc.hashCode() % 102) >> this.msisdn.hashCode()) - 60) * Integer.hashCode(this.totalPrice) * 56;
            str = this.validity;
        } else {
            iHashCode = ((((this.desc.hashCode() * 31) + this.msisdn.hashCode()) * 31) + Integer.hashCode(this.totalPrice)) * 31;
            str = this.validity;
        }
        int iHashCode2 = iHashCode + str.hashCode();
        int i3 = ShareDataUIState + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MakeUrBundleAirtimePurchasePayload(desc=" + this.desc + ", msisdn=" + this.msisdn + ", totalPrice=" + this.totalPrice + ", validity=" + this.validity + ")";
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.desc);
            dest.writeString(this.msisdn);
            dest.writeInt(this.totalPrice);
            dest.writeString(this.validity);
            int i4 = 17 / 0;
        } else {
            dest.writeString(this.desc);
            dest.writeString(this.msisdn);
            dest.writeInt(this.totalPrice);
            dest.writeString(this.validity);
        }
        int i5 = component1 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
