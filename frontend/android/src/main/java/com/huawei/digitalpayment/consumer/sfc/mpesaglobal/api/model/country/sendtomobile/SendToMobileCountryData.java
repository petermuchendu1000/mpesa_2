package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.sendtomobile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.CountryDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/sendtomobile/SendToMobileCountryData;", "Landroid/os/Parcelable;", "key", "", "value", "additionalInfo", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "getAdditionalInfo", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileCountryData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SendToMobileCountryData> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("additionalInfo")
    private final List<CountryDetails> additionalInfo;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendToMobileCountryData> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = component3 + 121;
                ShareDataUIState = i4 % 128;
                arrayList.add(i4 % 2 == 0 ? CountryDetails.CREATOR.createFromParcel(parcel) : CountryDetails.CREATOR.createFromParcel(parcel));
            }
            SendToMobileCountryData sendToMobileCountryData = new SendToMobileCountryData(string, string2, arrayList);
            int i5 = component3 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return sendToMobileCountryData;
        }

        @Override
        public SendToMobileCountryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SendToMobileCountryData sendToMobileCountryDataCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            return sendToMobileCountryDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendToMobileCountryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 81;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            SendToMobileCountryData[] sendToMobileCountryDataArr = new SendToMobileCountryData[i];
            int i6 = i4 + 83;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return sendToMobileCountryDataArr;
        }

        @Override
        public SendToMobileCountryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 53;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            SendToMobileCountryData[] sendToMobileCountryDataArrNewArray = newArray(i);
            int i5 = component3 + 87;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return sendToMobileCountryDataArrNewArray;
            }
            throw null;
        }
    }

    public SendToMobileCountryData(String str, String str2, List<CountryDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.value = str2;
        this.additionalInfo = list;
    }

    public final String getKey() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.key;
            int i4 = 40 / 0;
        } else {
            str = this.key;
        }
        int i5 = i2 + 1;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<CountryDetails> getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.additionalInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 65;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SendToMobileCountryData copy$default(SendToMobileCountryData sendToMobileCountryData, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 55;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = sendToMobileCountryData.key;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = copydefault + 25;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = sendToMobileCountryData.value;
                obj2.hashCode();
                throw null;
            }
            str2 = sendToMobileCountryData.value;
        }
        if ((i & 4) != 0) {
            int i6 = component1 + 91;
            int i7 = i6 % 128;
            copydefault = i7;
            if (i6 % 2 == 0) {
                List<CountryDetails> list2 = sendToMobileCountryData.additionalInfo;
                obj2.hashCode();
                throw null;
            }
            list = sendToMobileCountryData.additionalInfo;
            int i8 = i7 + 5;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        return sendToMobileCountryData.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    public final List<CountryDetails> component3() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<CountryDetails> list = this.additionalInfo;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return list;
    }

    public final SendToMobileCountryData copy(String key, String value, List<CountryDetails> additionalInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(additionalInfo, "");
        SendToMobileCountryData sendToMobileCountryData = new SendToMobileCountryData(key, value, additionalInfo);
        int i2 = copydefault + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return sendToMobileCountryData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendToMobileCountryData)) {
            int i2 = copydefault + 57;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SendToMobileCountryData sendToMobileCountryData = (SendToMobileCountryData) other;
        if (!Intrinsics.areEqual(this.key, sendToMobileCountryData.key)) {
            int i4 = copydefault + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.value, sendToMobileCountryData.value)) {
            return Intrinsics.areEqual(this.additionalInfo, sendToMobileCountryData.additionalInfo);
        }
        int i6 = component1 + 125;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.key.hashCode() << 107) + this.value.hashCode()) - 96) << this.additionalInfo.hashCode() : (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.additionalInfo.hashCode();
        int i3 = copydefault + 111;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendToMobileCountryData(key=" + this.key + ", value=" + this.value + ", additionalInfo=" + this.additionalInfo + ')';
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        List<CountryDetails> list = this.additionalInfo;
        dest.writeInt(list.size());
        Iterator<CountryDetails> it = list.iterator();
        while (!(!it.hasNext())) {
            it.next().writeToParcel(dest, flags);
        }
        int i4 = copydefault + 17;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
