package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryBody;", "Landroid/os/Parcelable;", "data", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CountryBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName(ImtConstants.KEY_DATA)
    private final List<CountryData> data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryBody> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = ShareDataUIState + 19;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(CountryData.CREATOR.createFromParcel(parcel));
            }
            CountryBody countryBody = new CountryBody(arrayList);
            int i6 = ShareDataUIState + 17;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return countryBody;
            }
            throw null;
        }

        @Override
        public CountryBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            CountryBody countryBodyCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 81;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return countryBodyCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            CountryBody[] countryBodyArr = new CountryBody[i];
            int i6 = i3 + 115;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 91 / 0;
            }
            return countryBodyArr;
        }

        @Override
        public CountryBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 11;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CountryBody(List<CountryData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    public final List<CountryData> getData() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<CountryData> list = this.data;
        int i5 = i2 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = copydefault + 113;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CountryBody copy$default(CountryBody countryBody, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 35;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            list = countryBody.data;
            int i6 = i4 + 65;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return countryBody.copy(list);
    }

    public final List<CountryData> component1() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<CountryData> list = this.data;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final CountryBody copy(List<CountryData> data) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        CountryBody countryBody = new CountryBody(data);
        int i2 = component3 + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return countryBody;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 43;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof CountryBody)) {
            int i4 = component1 + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.data, ((CountryBody) other).data)) {
            return true;
        }
        int i6 = component3 + 83;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<CountryData> list = this.data;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryBody(data=" + this.data + ')';
        int i2 = component3 + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<CountryData> list = this.data;
        dest.writeInt(list.size());
        Iterator<CountryData> it = list.iterator();
        while (it.hasNext()) {
            int i2 = component1 + 111;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            it.next().writeToParcel(dest, flags);
        }
        int i4 = component1 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
