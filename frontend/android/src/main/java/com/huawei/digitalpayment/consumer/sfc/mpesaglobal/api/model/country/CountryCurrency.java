package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryCurrency;", "Landroid/os/Parcelable;", "iso", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIso", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryCurrency implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CountryCurrency> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName(ImtConstants.KEY_CURRENCY_ISO)
    private final String iso;

    @SerializedName("currencyname")
    private final String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryCurrency> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryCurrency createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CountryCurrency countryCurrency = new CountryCurrency(parcel.readString(), parcel.readString());
            int i2 = component3 + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return countryCurrency;
        }

        @Override
        public CountryCurrency createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryCurrency[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 99;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            CountryCurrency[] countryCurrencyArr = new CountryCurrency[i];
            int i6 = i3 + 87;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return countryCurrencyArr;
        }

        @Override
        public CountryCurrency[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 99;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            CountryCurrency[] countryCurrencyArrNewArray = newArray(i);
            int i5 = component3 + 83;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return countryCurrencyArrNewArray;
        }
    }

    public CountryCurrency(String str, String str2) {
        this.iso = str;
        this.name = str2;
    }

    public final String getIso() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iso;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 43;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static CountryCurrency copy$default(CountryCurrency countryCurrency, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 89;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 93;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                String str3 = countryCurrency.iso;
                throw null;
            }
            str = countryCurrency.iso;
        }
        if ((i & 2) != 0) {
            str2 = countryCurrency.name;
            int i7 = component1 + 75;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return countryCurrency.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.iso;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 71;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final CountryCurrency copy(String iso, String name) {
        int i = 2 % 2;
        CountryCurrency countryCurrency = new CountryCurrency(iso, name);
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return countryCurrency;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof CountryCurrency) {
            CountryCurrency countryCurrency = (CountryCurrency) other;
            return !(Intrinsics.areEqual(this.iso, countryCurrency.iso) ^ true) && Intrinsics.areEqual(this.name, countryCurrency.name);
        }
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iso;
        if (str == null) {
            int i5 = i2 + 75;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.name;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryCurrency(iso=" + this.iso + ", name=" + this.name + ')';
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.iso);
            dest.writeString(this.name);
            throw null;
        }
        dest.writeString(this.iso);
        dest.writeString(this.name);
        int i4 = component1 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
