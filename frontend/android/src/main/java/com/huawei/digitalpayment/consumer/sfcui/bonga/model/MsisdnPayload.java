package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/MsisdnPayload;", "Landroid/os/Parcelable;", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MsisdnPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MsisdnPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MsisdnPayload> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MsisdnPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MsisdnPayload msisdnPayload = new MsisdnPayload(parcel.readString());
            int i2 = component1 + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return msisdnPayload;
        }

        @Override
        public MsisdnPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 3;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MsisdnPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 27;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            MsisdnPayload[] msisdnPayloadArr = new MsisdnPayload[i];
            int i6 = i3 + 89;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 14 / 0;
            }
            return msisdnPayloadArr;
        }

        @Override
        public MsisdnPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 35;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            MsisdnPayload[] msisdnPayloadArrNewArray = newArray(i);
            int i5 = component3 + 109;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return msisdnPayloadArrNewArray;
        }
    }

    public MsisdnPayload(String str) {
        this.msisdn = str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 61;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static MsisdnPayload copy$default(MsisdnPayload msisdnPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 77;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = msisdnPayload.msisdn;
                throw null;
            }
            str = msisdnPayload.msisdn;
        }
        return msisdnPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final MsisdnPayload copy(String msisdn) {
        int i = 2 % 2;
        MsisdnPayload msisdnPayload = new MsisdnPayload(msisdn);
        int i2 = component3 + 99;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return msisdnPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof MsisdnPayload)) {
            int i4 = component3 + 55;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.msisdn, ((MsisdnPayload) other).msisdn)) {
            return true;
        }
        int i5 = component2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.msisdn;
        if (str == null) {
            int i2 = component3 + 117;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = component3 + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MsisdnPayload(msisdn=" + this.msisdn + ")";
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.msisdn;
        if (i3 != 0) {
            dest.writeString(str);
        } else {
            dest.writeString(str);
            throw null;
        }
    }
}
