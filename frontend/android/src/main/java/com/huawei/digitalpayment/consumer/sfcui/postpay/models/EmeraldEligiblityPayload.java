package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EmeraldEligiblityPayload;", "Landroid/os/Parcelable;", "msisdn", "", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getProduct", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmeraldEligiblityPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EmeraldEligiblityPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("product")
    private final String product;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmeraldEligiblityPayload> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EmeraldEligiblityPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EmeraldEligiblityPayload emeraldEligiblityPayload = new EmeraldEligiblityPayload(parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 121;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
            }
            return emeraldEligiblityPayload;
        }

        @Override
        public EmeraldEligiblityPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EmeraldEligiblityPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 13;
            ShareDataUIState = i3 % 128;
            EmeraldEligiblityPayload[] emeraldEligiblityPayloadArr = new EmeraldEligiblityPayload[i];
            if (i3 % 2 == 0) {
                int i4 = 24 / 0;
            }
            return emeraldEligiblityPayloadArr;
        }

        @Override
        public EmeraldEligiblityPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 25;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            EmeraldEligiblityPayload[] emeraldEligiblityPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 22 / 0;
            }
            int i6 = ShareDataUIState + 103;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return emeraldEligiblityPayloadArrNewArray;
            }
            throw null;
        }
    }

    public EmeraldEligiblityPayload(String str, String str2) {
        this.msisdn = str;
        this.product = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EmeraldEligiblityPayload(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = ShareDataUIState + 101;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProduct() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.product;
        int i5 = i2 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 39;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static EmeraldEligiblityPayload copy$default(EmeraldEligiblityPayload emeraldEligiblityPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 59;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 25;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = emeraldEligiblityPayload.msisdn;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = emeraldEligiblityPayload.msisdn;
        }
        if ((i & 2) != 0) {
            str2 = emeraldEligiblityPayload.product;
            int i7 = copydefault + 101;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        return emeraldEligiblityPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.product;
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EmeraldEligiblityPayload copy(String msisdn, String product) {
        int i = 2 % 2;
        EmeraldEligiblityPayload emeraldEligiblityPayload = new EmeraldEligiblityPayload(msisdn, product);
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return emeraldEligiblityPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (other instanceof EmeraldEligiblityPayload) {
            EmeraldEligiblityPayload emeraldEligiblityPayload = (EmeraldEligiblityPayload) other;
            if (!Intrinsics.areEqual(this.msisdn, emeraldEligiblityPayload.msisdn)) {
                int i3 = copydefault + 3;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.product, emeraldEligiblityPayload.product)) {
                return true;
            }
            int i5 = copydefault + 3;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = ShareDataUIState + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.product;
        if (str2 == null) {
            int i4 = copydefault + 41;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EmeraldEligiblityPayload(msisdn=" + this.msisdn + ", product=" + this.product + ")";
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.product);
        int i4 = ShareDataUIState + 115;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
