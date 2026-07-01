package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0011H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchState;", "Landroid/os/Parcelable;", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "fetchType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchType;", "<init>", "(ZZLcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchType;)V", "()Z", "getFetchType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryFetchType;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryFetchState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CountryFetchState> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final CountryFetchType fetchType;
    private final boolean isError;
    private final boolean isLoading;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryFetchState> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryFetchState createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i2 = ShareDataUIState + 65;
                int i3 = i2 % 128;
                component3 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 107;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            return new CountryFetchState(z, parcel.readInt() != 0, CountryFetchType.CREATOR.createFromParcel(parcel));
        }

        @Override
        public CountryFetchState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CountryFetchState countryFetchStateCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return countryFetchStateCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryFetchState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 5;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            CountryFetchState[] countryFetchStateArr = new CountryFetchState[i];
            int i6 = i3 + 75;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return countryFetchStateArr;
            }
            throw null;
        }

        @Override
        public CountryFetchState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 97;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            CountryFetchState[] countryFetchStateArrNewArray = newArray(i);
            int i4 = component3 + 39;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return countryFetchStateArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public CountryFetchState(boolean z, boolean z2, CountryFetchType countryFetchType) {
        Intrinsics.checkNotNullParameter(countryFetchType, "");
        this.isLoading = z;
        this.isError = z2;
        this.fetchType = countryFetchType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CountryFetchState(boolean z, boolean z2, CountryFetchType countryFetchType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 97;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 95;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z2 = false;
        }
        if ((i & 4) != 0) {
            int i7 = component3 + 109;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            countryFetchType = CountryFetchType.COUNTRIES;
            int i9 = component3 + 109;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
        }
        this(z, z2, countryFetchType);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isLoading;
        int i4 = i3 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.isError;
        int i4 = i3 + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final CountryFetchType getFetchType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        CountryFetchType countryFetchType = this.fetchType;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return countryFetchType;
    }

    static {
        int i = component1 + 91;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }

    public CountryFetchState() {
        this(false, false, null, 7, null);
    }

    public static CountryFetchState copy$default(CountryFetchState countryFetchState, boolean z, boolean z2, CountryFetchType countryFetchType, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            z = countryFetchState.isLoading;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 21;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                z2 = countryFetchState.isError;
                int i4 = 69 / 0;
            } else {
                z2 = countryFetchState.isError;
            }
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 75;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                CountryFetchType countryFetchType2 = countryFetchState.fetchType;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            countryFetchType = countryFetchState.fetchType;
        }
        return countryFetchState.copy(z, z2, countryFetchType);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isLoading;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isError;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final CountryFetchType component3() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        CountryFetchType countryFetchType = this.fetchType;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return countryFetchType;
        }
        throw null;
    }

    public final CountryFetchState copy(boolean isLoading, boolean isError, CountryFetchType fetchType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fetchType, "");
        CountryFetchState countryFetchState = new CountryFetchState(isLoading, isError, fetchType);
        int i2 = component2 + 77;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return countryFetchState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof CountryFetchState)) {
            return false;
        }
        CountryFetchState countryFetchState = (CountryFetchState) other;
        if (this.isLoading != countryFetchState.isLoading || this.isError != countryFetchState.isError) {
            return false;
        }
        if (this.fetchType == countryFetchState.fetchType) {
            return true;
        }
        int i4 = component2 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        return (i2 % 2 != 0 ? ((r0 - 13) >> Boolean.hashCode(this.isError)) - 120 : ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isError)) * 31) + this.fetchType.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryFetchState(isLoading=" + this.isLoading + ", isError=" + this.isError + ", fetchType=" + this.fetchType + ')';
        int i2 = component3 + 85;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isError ? 1 : 0);
        this.fetchType.writeToParcel(dest, flags);
        int i4 = component2 + 85;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }
}
