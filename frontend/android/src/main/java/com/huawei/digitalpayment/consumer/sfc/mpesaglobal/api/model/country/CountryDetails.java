package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryDetails;", "Landroid/os/Parcelable;", "key", "", "value", "currencies", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryCurrency;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getValue", "getCurrencies", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CountryDetails> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;

    @SerializedName("Currencies")
    private final List<CountryCurrency> currencies;

    @SerializedName("Key")
    private final String key;

    @SerializedName("Value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryDetails> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component3 + 51;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component3 + 41;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(CountryCurrency.CREATOR.createFromParcel(parcel));
                    i5 += 23;
                } else {
                    arrayList.add(CountryCurrency.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new CountryDetails(string, string2, arrayList);
        }

        @Override
        public CountryDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 29;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CountryDetails countryDetailsCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 13;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return countryDetailsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 71;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            CountryDetails[] countryDetailsArr = new CountryDetails[i];
            int i6 = i3 + 33;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return countryDetailsArr;
            }
            throw null;
        }

        @Override
        public CountryDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 45;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            CountryDetails[] countryDetailsArrNewArray = newArray(i);
            int i5 = component1 + 31;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return countryDetailsArrNewArray;
        }
    }

    public CountryDetails(String str, String str2, List<CountryCurrency> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.value = str2;
        this.currencies = list;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.key;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<CountryCurrency> getCurrencies() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<CountryCurrency> list = this.currencies;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 37;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 1 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CountryDetails copy$default(CountryDetails countryDetails, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 109;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = countryDetails.key;
        }
        if ((i & 2) != 0) {
            str2 = countryDetails.value;
            int i5 = i4 + 17;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            list = countryDetails.currencies;
        }
        return countryDetails.copy(str, str2, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<CountryCurrency> component3() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<CountryCurrency> list = this.currencies;
        int i4 = i3 + 85;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return list;
    }

    public final CountryDetails copy(String key, String value, List<CountryCurrency> currencies) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(currencies, "");
        CountryDetails countryDetails = new CountryDetails(key, value, currencies);
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return countryDetails;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryDetails)) {
            int i2 = component2 + 83;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CountryDetails countryDetails = (CountryDetails) other;
        if (!Intrinsics.areEqual(this.key, countryDetails.key)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, countryDetails.value)) {
            return Intrinsics.areEqual(this.currencies, countryDetails.currencies);
        }
        int i4 = component2 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.key.hashCode() / 86) % this.value.hashCode()) << 118) >> this.currencies.hashCode() : (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.currencies.hashCode();
        int i3 = ShareDataUIState + 13;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryDetails(key=" + this.key + ", value=" + this.value + ", currencies=" + this.currencies + ')';
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.key);
            dest.writeString(this.value);
            List<CountryCurrency> list = this.currencies;
            dest.writeInt(list.size());
            list.iterator();
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.key);
        dest.writeString(this.value);
        List<CountryCurrency> list2 = this.currencies;
        dest.writeInt(list2.size());
        Iterator<CountryCurrency> it = list2.iterator();
        while (it.hasNext()) {
            int i4 = component2 + 25;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
    }
}
