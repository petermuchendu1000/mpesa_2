package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0012H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/WifiUiModel;", "Landroid/os/Parcelable;", "ssidName", "", "profilePath", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSsidName", "()Ljava/lang/String;", "getProfilePath", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WifiUiModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WifiUiModel> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final boolean isSelected;
    private final String profilePath;
    private final String ssidName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WifiUiModel> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final WifiUiModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component2 + 3;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = component1 + 85;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new WifiUiModel(string, string2, z);
        }

        @Override
        public WifiUiModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            WifiUiModel wifiUiModelCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 9;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return wifiUiModelCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final WifiUiModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 47;
            component1 = i4 % 128;
            WifiUiModel[] wifiUiModelArr = new WifiUiModel[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 1;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 95 / 0;
            }
            return wifiUiModelArr;
        }

        @Override
        public WifiUiModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 65;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            WifiUiModel[] wifiUiModelArrNewArray = newArray(i);
            int i5 = component2 + 63;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return wifiUiModelArrNewArray;
        }
    }

    public WifiUiModel(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ssidName = str;
        this.profilePath = str2;
        this.isSelected = z;
    }

    public final String getSsidName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ssidName;
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProfilePath() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.profilePath;
        int i4 = i2 + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isSelected;
        int i5 = i3 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = component3 + 117;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static WifiUiModel copy$default(WifiUiModel wifiUiModel, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = wifiUiModel.ssidName;
            int i3 = component2 + 101;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 51;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str2 = wifiUiModel.profilePath;
        }
        if ((i & 4) != 0) {
            int i7 = copydefault + 15;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            z = wifiUiModel.isSelected;
        }
        return wifiUiModel.copy(str, str2, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ssidName;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.profilePath;
        int i4 = i2 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isSelected;
        int i5 = i3 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final WifiUiModel copy(String ssidName, String profilePath, boolean isSelected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ssidName, "");
        Intrinsics.checkNotNullParameter(profilePath, "");
        WifiUiModel wifiUiModel = new WifiUiModel(ssidName, profilePath, isSelected);
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return wifiUiModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof WifiUiModel)) {
            int i4 = component2 + 51;
            copydefault = i4 % 128;
            return i4 % 2 == 0;
        }
        WifiUiModel wifiUiModel = (WifiUiModel) other;
        if ((!Intrinsics.areEqual(this.ssidName, wifiUiModel.ssidName)) || !Intrinsics.areEqual(this.profilePath, wifiUiModel.profilePath)) {
            return false;
        }
        if (this.isSelected == wifiUiModel.isSelected) {
            return true;
        }
        int i5 = copydefault + 59;
        int i6 = i5 % 128;
        component2 = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 61;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.ssidName.hashCode() * 31) + this.profilePath.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        int i4 = copydefault + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WifiUiModel(ssidName=" + this.ssidName + ", profilePath=" + this.profilePath + ", isSelected=" + this.isSelected + ")";
        int i2 = copydefault + 61;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.ssidName);
        dest.writeString(this.profilePath);
        dest.writeInt(this.isSelected ? 1 : 0);
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
