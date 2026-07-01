package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateData;", "Landroid/os/Parcelable;", "key", "", "value", "additionalInfo", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateAdditionalInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "getAdditionalInfo", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StateData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("additionalInfo")
    private final List<StateAdditionalInfo> additionalInfo;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StateData> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    int i4 = component3 + 121;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList2.add(StateAdditionalInfo.CREATOR.createFromParcel(parcel));
                    i3++;
                    int i6 = ShareDataUIState + 17;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                }
                arrayList = arrayList2;
            }
            return new StateData(string, string2, arrayList);
        }

        @Override
        public StateData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StateData stateDataCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 47;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return stateDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 83;
            ShareDataUIState = i3 % 128;
            StateData[] stateDataArr = new StateData[i];
            if (i3 % 2 == 0) {
                return stateDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public StateData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 51;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            StateData[] stateDataArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 83;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return stateDataArrNewArray;
            }
            throw null;
        }
    }

    public StateData(String str, String str2, List<StateAdditionalInfo> list) {
        this.key = str;
        this.value = str2;
        this.additionalInfo = list;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 113;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<StateAdditionalInfo> getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<StateAdditionalInfo> list = this.additionalInfo;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return list;
    }

    static {
        int i = copydefault + 29;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StateData copy$default(StateData stateData, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = stateData.key;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 83;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = stateData.value;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = stateData.value;
        }
        if ((i & 4) != 0) {
            list = stateData.additionalInfo;
            int i4 = component2 + 97;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return stateData.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.key;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.value;
            int i4 = 88 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<StateAdditionalInfo> component3() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<StateAdditionalInfo> list = this.additionalInfo;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateData copy(String key, String value, List<StateAdditionalInfo> additionalInfo) {
        int i = 2 % 2;
        StateData stateData = new StateData(key, value, additionalInfo);
        int i2 = component2 + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return stateData;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof StateData)) {
            int i4 = component2 + 89;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        StateData stateData = (StateData) other;
        if (!Intrinsics.areEqual(this.key, stateData.key) || !Intrinsics.areEqual(this.value, stateData.value)) {
            return false;
        }
        if (Intrinsics.areEqual(this.additionalInfo, stateData.additionalInfo)) {
            return true;
        }
        int i6 = component2 + 5;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.key;
        if (str == null) {
            int i5 = i3 + 67;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.value;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<StateAdditionalInfo> list = this.additionalInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StateData(key=" + this.key + ", value=" + this.value + ", additionalInfo=" + this.additionalInfo + ')';
        int i2 = component3 + 61;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        List<StateAdditionalInfo> list = this.additionalInfo;
        if (list == null) {
            int i2 = component3 + 87;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
            int i3 = component2 + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<StateAdditionalInfo> it = list.iterator();
        while (it.hasNext()) {
            int i5 = component3 + 123;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
