package com.huawei.digitalpayment.consumer.subsui.resp.skiza;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/UnsubscribeSelectedSkizasPayload;", "Landroid/os/Parcelable;", "msisdn", "", "tones", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMsisdn", "()Ljava/lang/String;", "getTones", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsubscribeSelectedSkizasPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnsubscribeSelectedSkizasPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("tones")
    private final List<String> tones;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnsubscribeSelectedSkizasPayload> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribeSelectedSkizasPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UnsubscribeSelectedSkizasPayload unsubscribeSelectedSkizasPayload = new UnsubscribeSelectedSkizasPayload(parcel.readString(), parcel.createStringArrayList());
            int i2 = component2 + 11;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return unsubscribeSelectedSkizasPayload;
            }
            throw null;
        }

        @Override
        public UnsubscribeSelectedSkizasPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 105;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribeSelectedSkizasPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 85;
            component2 = i3 % 128;
            UnsubscribeSelectedSkizasPayload[] unsubscribeSelectedSkizasPayloadArr = new UnsubscribeSelectedSkizasPayload[i];
            if (i3 % 2 != 0) {
                int i4 = 0 / 0;
            }
            return unsubscribeSelectedSkizasPayloadArr;
        }

        @Override
        public UnsubscribeSelectedSkizasPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 75;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            UnsubscribeSelectedSkizasPayload[] unsubscribeSelectedSkizasPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 4 / 0;
            }
            int i6 = component3 + 39;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 70 / 0;
            }
            return unsubscribeSelectedSkizasPayloadArrNewArray;
        }
    }

    public UnsubscribeSelectedSkizasPayload(String str, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.msisdn = str;
        this.tones = list;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<String> getTones() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.tones;
        int i5 = i2 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = copydefault + 113;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UnsubscribeSelectedSkizasPayload copy$default(UnsubscribeSelectedSkizasPayload unsubscribeSelectedSkizasPayload, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 115;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = unsubscribeSelectedSkizasPayload.msisdn;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 17;
            int i6 = i5 % 128;
            component3 = i6;
            int i7 = i5 % 2;
            list = unsubscribeSelectedSkizasPayload.tones;
            int i8 = i6 + 77;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        return unsubscribeSelectedSkizasPayload.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 95;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<String> component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.tones;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UnsubscribeSelectedSkizasPayload copy(String msisdn, List<String> tones) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(tones, "");
        UnsubscribeSelectedSkizasPayload unsubscribeSelectedSkizasPayload = new UnsubscribeSelectedSkizasPayload(msisdn, tones);
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return unsubscribeSelectedSkizasPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 109;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof UnsubscribeSelectedSkizasPayload)) {
            int i7 = i3 + 3;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        UnsubscribeSelectedSkizasPayload unsubscribeSelectedSkizasPayload = (UnsubscribeSelectedSkizasPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, unsubscribeSelectedSkizasPayload.msisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tones, unsubscribeSelectedSkizasPayload.tones)) {
            return true;
        }
        int i9 = component2 + 61;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.msisdn.hashCode() * 31) + this.tones.hashCode();
        int i4 = component2 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnsubscribeSelectedSkizasPayload(msisdn=" + this.msisdn + ", tones=" + this.tones + ")";
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeStringList(this.tones);
        int i4 = component2 + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
