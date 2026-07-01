package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateAdditionalInfo;", "Landroid/os/Parcelable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateAdditionalInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<StateAdditionalInfo> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("Key")
    private final String key;

    @SerializedName("Value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StateAdditionalInfo> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateAdditionalInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            StateAdditionalInfo stateAdditionalInfo = new StateAdditionalInfo(parcel.readString(), parcel.readString());
            int i2 = component3 + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return stateAdditionalInfo;
        }

        @Override
        public StateAdditionalInfo createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            StateAdditionalInfo stateAdditionalInfoCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            int i5 = copydefault + 19;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return stateAdditionalInfoCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateAdditionalInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 63;
            copydefault = i3 % 128;
            StateAdditionalInfo[] stateAdditionalInfoArr = new StateAdditionalInfo[i];
            if (i3 % 2 == 0) {
                return stateAdditionalInfoArr;
            }
            throw null;
        }

        @Override
        public StateAdditionalInfo[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 21;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public StateAdditionalInfo(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.value;
        }
        throw null;
    }

    static {
        int i = component1 + 21;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static StateAdditionalInfo copy$default(StateAdditionalInfo stateAdditionalInfo, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = stateAdditionalInfo.key;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 117;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = stateAdditionalInfo.value;
                throw null;
            }
            str2 = stateAdditionalInfo.value;
        }
        StateAdditionalInfo stateAdditionalInfoCopy = stateAdditionalInfo.copy(str, str2);
        int i4 = component3 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return stateAdditionalInfoCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 51;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final StateAdditionalInfo copy(String key, String value) {
        int i = 2 % 2;
        StateAdditionalInfo stateAdditionalInfo = new StateAdditionalInfo(key, value);
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return stateAdditionalInfo;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof StateAdditionalInfo) {
            StateAdditionalInfo stateAdditionalInfo = (StateAdditionalInfo) other;
            return !(Intrinsics.areEqual(this.key, stateAdditionalInfo.key) ^ true) && Intrinsics.areEqual(this.value, stateAdditionalInfo.value);
        }
        int i4 = component3 + 63;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 101;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 47 / 0;
        }
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            str = this.key;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.key;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.value;
        if (str2 != null) {
            iHashCode = str2.hashCode();
            int i3 = component3 + 11;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 2;
            }
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StateAdditionalInfo(key=" + this.key + ", value=" + this.value + ')';
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        int i4 = ShareDataUIState + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
