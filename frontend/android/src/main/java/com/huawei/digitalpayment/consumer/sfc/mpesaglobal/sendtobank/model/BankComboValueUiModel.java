package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/model/BankComboValueUiModel;", "Landroid/os/Parcelable;", "label", "", "additionalInfo", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getLabel", "()Ljava/lang/String;", "getAdditionalInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankComboValueUiModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankComboValueUiModel> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Map<String, String> additionalInfo;
    private final String label;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankComboValueUiModel> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValueUiModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = component2 + 19;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            BankComboValueUiModel bankComboValueUiModel = new BankComboValueUiModel(string, linkedHashMap);
            int i6 = component2 + 51;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return bankComboValueUiModel;
        }

        @Override
        public BankComboValueUiModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 97;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            BankComboValueUiModel bankComboValueUiModelCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 43;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return bankComboValueUiModelCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValueUiModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 89;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            BankComboValueUiModel[] bankComboValueUiModelArr = new BankComboValueUiModel[i];
            int i6 = i4 + 123;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return bankComboValueUiModelArr;
        }

        @Override
        public BankComboValueUiModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 11;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            BankComboValueUiModel[] bankComboValueUiModelArrNewArray = newArray(i);
            int i5 = component2 + 69;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return bankComboValueUiModelArrNewArray;
            }
            throw null;
        }
    }

    public BankComboValueUiModel(String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.label = str;
        this.additionalInfo = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BankComboValueUiModel(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = component3 + 89;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                map = MapsKt.emptyMap();
                int i3 = 65 / 0;
            } else {
                map = MapsKt.emptyMap();
            }
            int i4 = 2 % 2;
        }
        this(str, map);
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.label;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.additionalInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 5;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BankComboValueUiModel copy$default(BankComboValueUiModel bankComboValueUiModel, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            str = bankComboValueUiModel.label;
        }
        if ((i & 2) != 0) {
            map = bankComboValueUiModel.additionalInfo;
        }
        BankComboValueUiModel bankComboValueUiModelCopy = bankComboValueUiModel.copy(str, map);
        int i5 = component2 + 53;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return bankComboValueUiModelCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.label;
        }
        throw null;
    }

    public final Map<String, String> component2() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.additionalInfo;
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return map;
    }

    public final BankComboValueUiModel copy(String label, Map<String, String> additionalInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(label, "");
        Intrinsics.checkNotNullParameter(additionalInfo, "");
        BankComboValueUiModel bankComboValueUiModel = new BankComboValueUiModel(label, additionalInfo);
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return bankComboValueUiModel;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankComboValueUiModel)) {
            return false;
        }
        BankComboValueUiModel bankComboValueUiModel = (BankComboValueUiModel) other;
        if (Intrinsics.areEqual(this.label, bankComboValueUiModel.label)) {
            return Intrinsics.areEqual(this.additionalInfo, bankComboValueUiModel.additionalInfo);
        }
        int i3 = component2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.label.hashCode() * 31) + this.additionalInfo.hashCode();
        int i4 = component3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankComboValueUiModel(label=" + this.label + ", additionalInfo=" + this.additionalInfo + ')';
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.label);
        Map<String, String> map = this.additionalInfo;
        dest.writeInt(map.size());
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        int i4 = component3 + 71;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            int i6 = component3 + 21;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                Map.Entry<String, String> next = it.next();
                dest.writeString(next.getKey());
                dest.writeString(next.getValue());
                int i7 = 5 / 0;
            } else {
                Map.Entry<String, String> next2 = it.next();
                dest.writeString(next2.getKey());
                dest.writeString(next2.getValue());
            }
        }
    }
}
