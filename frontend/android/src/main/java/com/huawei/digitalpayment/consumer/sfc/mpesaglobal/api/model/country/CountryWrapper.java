package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryWrapper;", "Landroid/os/Parcelable;", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryServiceResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CountryWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;

    @SerializedName("ServiceResponse")
    private final CountryServiceResponse serviceResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryWrapper> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CountryWrapper countryWrapper = new CountryWrapper(CountryServiceResponse.CREATOR.createFromParcel(parcel));
            int i2 = component3 + 33;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return countryWrapper;
            }
            throw null;
        }

        @Override
        public CountryWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 33;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            CountryWrapper countryWrapperCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return countryWrapperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 7;
            component3 = i3 % 128;
            CountryWrapper[] countryWrapperArr = new CountryWrapper[i];
            if (i3 % 2 == 0) {
                int i4 = 17 / 0;
            }
            return countryWrapperArr;
        }

        @Override
        public CountryWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 35;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            CountryWrapper[] countryWrapperArrNewArray = newArray(i);
            int i4 = component1 + 121;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
            return countryWrapperArrNewArray;
        }
    }

    public CountryWrapper(CountryServiceResponse countryServiceResponse) {
        Intrinsics.checkNotNullParameter(countryServiceResponse, "");
        this.serviceResponse = countryServiceResponse;
    }

    public final CountryServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        CountryServiceResponse countryServiceResponse = this.serviceResponse;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return countryServiceResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 17;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CountryWrapper copy$default(CountryWrapper countryWrapper, CountryServiceResponse countryServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 107;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                CountryServiceResponse countryServiceResponse2 = countryWrapper.serviceResponse;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            countryServiceResponse = countryWrapper.serviceResponse;
        }
        return countryWrapper.copy(countryServiceResponse);
    }

    public final CountryServiceResponse component1() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        CountryServiceResponse countryServiceResponse = this.serviceResponse;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return countryServiceResponse;
    }

    public final CountryWrapper copy(CountryServiceResponse serviceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceResponse, "");
        CountryWrapper countryWrapper = new CountryWrapper(serviceResponse);
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return countryWrapper;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        ShareDataUIState = i2 % 128;
        return 1 ^ (i2 % 2 != 0 ? 0 : 1);
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (other instanceof CountryWrapper) {
                return Intrinsics.areEqual(this.serviceResponse, ((CountryWrapper) other).serviceResponse);
            }
            int i2 = copydefault + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = copydefault + 75;
        int i5 = i4 % 128;
        ShareDataUIState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 113;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.serviceResponse.hashCode();
        int i4 = ShareDataUIState + 95;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryWrapper(serviceResponse=" + this.serviceResponse + ')';
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.serviceResponse.writeToParcel(dest, flags);
        int i4 = ShareDataUIState + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
