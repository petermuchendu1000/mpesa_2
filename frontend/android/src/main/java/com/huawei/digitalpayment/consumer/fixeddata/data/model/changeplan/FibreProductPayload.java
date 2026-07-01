package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0012H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProductPayload;", "Landroid/os/Parcelable;", "estateId", "", "hierarchy", "isPtmp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getEstateId", "()Ljava/lang/String;", "getHierarchy", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreProductPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibreProductPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("estateId")
    private final String estateId;

    @SerializedName("hierarchy")
    private final String hierarchy;

    @SerializedName("isPtmp")
    private final boolean isPtmp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreProductPayload> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreProductPayload createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component3 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = copydefault + 3;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                int i6 = component3 + 47;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            return new FibreProductPayload(string, string2, z);
        }

        @Override
        public FibreProductPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 115;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FibreProductPayload fibreProductPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
            return fibreProductPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreProductPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 83;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            FibreProductPayload[] fibreProductPayloadArr = new FibreProductPayload[i];
            int i6 = i4 + 11;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return fibreProductPayloadArr;
        }

        @Override
        public FibreProductPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 101;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            FibreProductPayload[] fibreProductPayloadArrNewArray = newArray(i);
            int i4 = component3 + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return fibreProductPayloadArrNewArray;
        }
    }

    public FibreProductPayload(String str, String str2, boolean z) {
        this.estateId = str;
        this.hierarchy = str2;
        this.isPtmp = z;
    }

    public final String getEstateId() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.estateId;
        int i4 = i3 + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getHierarchy() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.hierarchy;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final boolean isPtmp() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isPtmp;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = component1 + 115;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static FibreProductPayload copy$default(FibreProductPayload fibreProductPayload, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 91;
        copydefault = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = fibreProductPayload.estateId;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 71;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = fibreProductPayload.hierarchy;
        }
        if ((i & 4) != 0) {
            z = fibreProductPayload.isPtmp;
        }
        return fibreProductPayload.copy(str, str2, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.estateId;
        int i4 = i2 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hierarchy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isPtmp;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final FibreProductPayload copy(String estateId, String hierarchy, boolean isPtmp) {
        int i = 2 % 2;
        FibreProductPayload fibreProductPayload = new FibreProductPayload(estateId, hierarchy, isPtmp);
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return fibreProductPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibreProductPayload)) {
            int i4 = i3 + 57;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        FibreProductPayload fibreProductPayload = (FibreProductPayload) other;
        if (!Intrinsics.areEqual(this.estateId, fibreProductPayload.estateId) || !Intrinsics.areEqual(this.hierarchy, fibreProductPayload.hierarchy)) {
            return false;
        }
        if (this.isPtmp == fibreProductPayload.isPtmp) {
            return true;
        }
        int i6 = component3 + 57;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.estateId;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.hierarchy;
        if (str2 == null) {
            int i4 = copydefault + 87;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = str2.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.isPtmp);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreProductPayload(estateId=" + this.estateId + ", hierarchy=" + this.hierarchy + ", isPtmp=" + this.isPtmp + ")";
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.estateId);
            dest.writeString(this.hierarchy);
            dest.writeInt(this.isPtmp ? 1 : 0);
            int i4 = 73 / 0;
        } else {
            dest.writeString(this.estateId);
            dest.writeString(this.hierarchy);
            dest.writeInt(this.isPtmp ? 1 : 0);
        }
        int i5 = copydefault + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
