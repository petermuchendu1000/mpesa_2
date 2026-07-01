package com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/WifiProfileResponse;", "Landroid/os/Parcelable;", "serialNumber", "", "parameters", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/WifiParameter;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSerialNumber", "()Ljava/lang/String;", "getParameters", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WifiProfileResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WifiProfileResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("Parameters")
    private final List<WifiParameter> parameters;

    @SerializedName("serialNumber")
    private final String serialNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WifiProfileResponse> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final WifiProfileResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = ShareDataUIState + 45;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 != i2; i5++) {
                    arrayList2.add(WifiParameter.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            WifiProfileResponse wifiProfileResponse = new WifiProfileResponse(string, arrayList);
            int i6 = component1 + 35;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return wifiProfileResponse;
        }

        @Override
        public WifiProfileResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            WifiProfileResponse wifiProfileResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 89;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return wifiProfileResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final WifiProfileResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 87;
            component1 = i3 % 128;
            WifiProfileResponse[] wifiProfileResponseArr = new WifiProfileResponse[i];
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
            }
            return wifiProfileResponseArr;
        }

        @Override
        public WifiProfileResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 23;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public WifiProfileResponse(String str, List<WifiParameter> list) {
        this.serialNumber = str;
        this.parameters = list;
    }

    public final String getSerialNumber() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.serialNumber;
        int i5 = i3 + 1;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public final List<WifiParameter> getParameters() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<WifiParameter> list = this.parameters;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return list;
    }

    static {
        int i = component1 + 41;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WifiProfileResponse copy$default(WifiProfileResponse wifiProfileResponse, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = wifiProfileResponse.serialNumber;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 119;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            list = wifiProfileResponse.parameters;
        }
        return wifiProfileResponse.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serialNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<WifiParameter> component2() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<WifiParameter> list = this.parameters;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final WifiProfileResponse copy(String serialNumber, List<WifiParameter> parameters) {
        int i = 2 % 2;
        WifiProfileResponse wifiProfileResponse = new WifiProfileResponse(serialNumber, parameters);
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return wifiProfileResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 7;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
            return true;
        }
        if (!(other instanceof WifiProfileResponse)) {
            return false;
        }
        WifiProfileResponse wifiProfileResponse = (WifiProfileResponse) other;
        if (!Intrinsics.areEqual(this.serialNumber, wifiProfileResponse.serialNumber) || !Intrinsics.areEqual(this.parameters, wifiProfileResponse.parameters)) {
            return false;
        }
        int i7 = copydefault + 77;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.serialNumber;
        if (str == null) {
            int i2 = copydefault + 71;
            component3 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<WifiParameter> list = this.parameters;
        int iHashCode2 = (iHashCode * 31) + (list != null ? list.hashCode() : 0);
        int i3 = component3 + 101;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WifiProfileResponse(serialNumber=" + this.serialNumber + ", parameters=" + this.parameters + ")";
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.serialNumber);
        List<WifiParameter> list = this.parameters;
        if (list == null) {
            int i2 = component3 + 43;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
            int i3 = component3 + 51;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<WifiParameter> it = list.iterator();
        while (it.hasNext()) {
            int i5 = component3 + 45;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                it.next().writeToParcel(dest, flags);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
    }
}
