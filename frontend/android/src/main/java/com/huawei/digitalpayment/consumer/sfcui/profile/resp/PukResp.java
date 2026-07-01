package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/PukResp;", "Landroid/os/Parcelable;", "puk", "", "<init>", "(Ljava/lang/String;)V", "getPuk", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PukResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PukResp> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("puk")
    private final String puk;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PukResp> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PukResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PukResp pukResp = new PukResp(parcel.readString());
            int i2 = component3 + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return pukResp;
        }

        @Override
        public PukResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 59;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            PukResp pukRespCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 49;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return pukRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PukResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 37;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            PukResp[] pukRespArr = new PukResp[i];
            int i6 = i3 + 45;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return pukRespArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public PukResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 15;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            PukResp[] pukRespArrNewArray = newArray(i);
            int i5 = component3 + 9;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return pukRespArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public PukResp(String str) {
        this.puk = str;
    }

    public final String getPuk() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.puk;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 99;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static PukResp copy$default(PukResp pukResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 13;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = pukResp.puk;
            int i5 = i3 + 103;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return pukResp.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.puk;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PukResp copy(String puk) {
        int i = 2 % 2;
        PukResp pukResp = new PukResp(puk);
        int i2 = component1 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return pukResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 69;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof PukResp)) {
            int i7 = i2 + 83;
            component1 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.puk, ((PukResp) other).puk)) {
            return true;
        }
        int i8 = component3 + 107;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.puk;
        if (str == null) {
            int i2 = component3 + 125;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = component1 + 59;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PukResp(puk=" + this.puk + ")";
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.puk;
        if (i3 == 0) {
            dest.writeString(str);
            return;
        }
        dest.writeString(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
