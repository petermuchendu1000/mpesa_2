package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleGetOffersPayload;", "Landroid/os/Parcelable;", "amount", "", "msisdn", "", "validity", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getMsisdn", "()Ljava/lang/String;", "getValidity", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleGetOffersPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MakeUrBundleGetOffersPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("amount")
    private final int amount;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("validity")
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MakeUrBundleGetOffersPayload> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MakeUrBundleGetOffersPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MakeUrBundleGetOffersPayload makeUrBundleGetOffersPayload = new MakeUrBundleGetOffersPayload(parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return makeUrBundleGetOffersPayload;
        }

        @Override
        public MakeUrBundleGetOffersPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            MakeUrBundleGetOffersPayload makeUrBundleGetOffersPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return makeUrBundleGetOffersPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MakeUrBundleGetOffersPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 109;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            MakeUrBundleGetOffersPayload[] makeUrBundleGetOffersPayloadArr = new MakeUrBundleGetOffersPayload[i];
            if (i3 % 2 == 0) {
                int i5 = 30 / 0;
            }
            int i6 = i4 + 61;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 62 / 0;
            }
            return makeUrBundleGetOffersPayloadArr;
        }

        @Override
        public MakeUrBundleGetOffersPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 31;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            MakeUrBundleGetOffersPayload[] makeUrBundleGetOffersPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return makeUrBundleGetOffersPayloadArrNewArray;
        }
    }

    public MakeUrBundleGetOffersPayload(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = i;
        this.msisdn = str;
        this.validity = str2;
    }

    public final int getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.amount;
        int i6 = i3 + 47;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 10 / 0;
        }
        return i5;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 73;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static MakeUrBundleGetOffersPayload copy$default(MakeUrBundleGetOffersPayload makeUrBundleGetOffersPayload, int i, String str, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i4 = copydefault + 9;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = makeUrBundleGetOffersPayload.amount;
                throw null;
            }
            i = makeUrBundleGetOffersPayload.amount;
        }
        if ((i2 & 2) != 0) {
            int i6 = component2 + 51;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                String str3 = makeUrBundleGetOffersPayload.msisdn;
                obj2.hashCode();
                throw null;
            }
            str = makeUrBundleGetOffersPayload.msisdn;
        }
        if ((i2 & 4) != 0) {
            str2 = makeUrBundleGetOffersPayload.validity;
        }
        return makeUrBundleGetOffersPayload.copy(i, str, str2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.amount;
        int i5 = i2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.validity;
        int i4 = i2 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final MakeUrBundleGetOffersPayload copy(int amount, String msisdn, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(validity, "");
        MakeUrBundleGetOffersPayload makeUrBundleGetOffersPayload = new MakeUrBundleGetOffersPayload(amount, msisdn, validity);
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return makeUrBundleGetOffersPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MakeUrBundleGetOffersPayload)) {
            int i2 = copydefault + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MakeUrBundleGetOffersPayload makeUrBundleGetOffersPayload = (MakeUrBundleGetOffersPayload) other;
        if (this.amount != makeUrBundleGetOffersPayload.amount || !Intrinsics.areEqual(this.msisdn, makeUrBundleGetOffersPayload.msisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.validity, makeUrBundleGetOffersPayload.validity)) {
            return true;
        }
        int i4 = component2 + 89;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.amount);
        return i3 == 0 ? (((iHashCode >> 31) - this.msisdn.hashCode()) >>> 27) * this.validity.hashCode() : (((iHashCode * 31) + this.msisdn.hashCode()) * 31) + this.validity.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MakeUrBundleGetOffersPayload(amount=" + this.amount + ", msisdn=" + this.msisdn + ", validity=" + this.validity + ")";
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.amount);
        dest.writeString(this.msisdn);
        dest.writeString(this.validity);
        int i4 = copydefault + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
