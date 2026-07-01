package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/TariffResp;", "Landroid/os/Parcelable;", "customerType", "", "<init>", "(Ljava/lang/String;)V", "getCustomerType", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TariffResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TariffResp> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("customerType")
    private final String customerType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TariffResp> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TariffResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TariffResp tariffResp = new TariffResp(parcel.readString());
            int i2 = component1 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return tariffResp;
        }

        @Override
        public TariffResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            TariffResp tariffRespCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return tariffRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TariffResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 85;
            copydefault = i3 % 128;
            TariffResp[] tariffRespArr = new TariffResp[i];
            if (i3 % 2 == 0) {
                return tariffRespArr;
            }
            throw null;
        }

        @Override
        public TariffResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 1;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            TariffResp[] tariffRespArrNewArray = newArray(i);
            int i5 = copydefault + 77;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
            return tariffRespArrNewArray;
        }
    }

    public TariffResp(String str) {
        this.customerType = str;
    }

    public final String getCustomerType() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.customerType;
            int i4 = 14 / 0;
        } else {
            str = this.customerType;
        }
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 65;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static TariffResp copy$default(TariffResp tariffResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 91;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 != 0) {
                str = tariffResp.customerType;
                int i5 = 74 / 0;
            } else {
                str = tariffResp.customerType;
            }
            int i6 = i4 + 89;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return tariffResp.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.customerType;
        int i4 = i2 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final TariffResp copy(String customerType) {
        int i = 2 % 2;
        TariffResp tariffResp = new TariffResp(customerType);
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return tariffResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof TariffResp)) {
            int i4 = ShareDataUIState + 117;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.customerType, ((TariffResp) other).customerType)) {
            return false;
        }
        int i5 = ShareDataUIState + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.customerType;
        if (str == null) {
            int i5 = i3 + 91;
            copydefault = i5 % 128;
            return i5 % 2 != 0 ? 1 : 0;
        }
        int iHashCode = str.hashCode();
        int i6 = ShareDataUIState + 57;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TariffResp(customerType=" + this.customerType + ")";
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.customerType);
        if (i3 != 0) {
            throw null;
        }
    }
}
