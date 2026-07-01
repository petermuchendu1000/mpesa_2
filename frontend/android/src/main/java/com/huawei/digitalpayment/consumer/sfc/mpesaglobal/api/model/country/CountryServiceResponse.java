package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryServiceResponse;", "Landroid/os/Parcelable;", "responseHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryServiceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CountryServiceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("Body")
    private final CountryBody body;

    @SerializedName("ResponseHeader")
    private final ImtServiceResponseHeader responseHeader;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryServiceResponse> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CountryServiceResponse countryServiceResponse = new CountryServiceResponse(ImtServiceResponseHeader.CREATOR.createFromParcel(parcel), CountryBody.CREATOR.createFromParcel(parcel));
            int i2 = component2 + 25;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return countryServiceResponse;
        }

        @Override
        public CountryServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            CountryServiceResponse countryServiceResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 123;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return countryServiceResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 67;
            component1 = i3 % 128;
            CountryServiceResponse[] countryServiceResponseArr = new CountryServiceResponse[i];
            if (i3 % 2 == 0) {
                return countryServiceResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public CountryServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            CountryServiceResponse[] countryServiceResponseArrNewArray = newArray(i);
            int i5 = component1 + 37;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return countryServiceResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public CountryServiceResponse(ImtServiceResponseHeader imtServiceResponseHeader, CountryBody countryBody) {
        Intrinsics.checkNotNullParameter(imtServiceResponseHeader, "");
        Intrinsics.checkNotNullParameter(countryBody, "");
        this.responseHeader = imtServiceResponseHeader;
        this.body = countryBody;
    }

    public final ImtServiceResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 73 / 0;
        }
        return imtServiceResponseHeader;
    }

    public final CountryBody getBody() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        CountryBody countryBody = this.body;
        int i5 = i3 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return countryBody;
    }

    static {
        int i = copydefault + 31;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static CountryServiceResponse copy$default(CountryServiceResponse countryServiceResponse, ImtServiceResponseHeader imtServiceResponseHeader, CountryBody countryBody, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            imtServiceResponseHeader = countryServiceResponse.responseHeader;
            int i5 = i3 + 81;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            countryBody = countryServiceResponse.body;
            int i7 = i3 + 107;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        return countryServiceResponse.copy(imtServiceResponseHeader, countryBody);
    }

    public final ImtServiceResponseHeader component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return imtServiceResponseHeader;
    }

    public final CountryBody component2() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        CountryBody countryBody = this.body;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return countryBody;
    }

    public final CountryServiceResponse copy(ImtServiceResponseHeader responseHeader, CountryBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseHeader, "");
        Intrinsics.checkNotNullParameter(body, "");
        CountryServiceResponse countryServiceResponse = new CountryServiceResponse(responseHeader, body);
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return countryServiceResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryServiceResponse)) {
            int i2 = ShareDataUIState + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.responseHeader, ((CountryServiceResponse) other).responseHeader)) {
            int i4 = ShareDataUIState + 75;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.body, r6.body))) {
            return true;
        }
        int i6 = ShareDataUIState + 59;
        component1 = i6 % 128;
        return !(i6 % 2 == 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.responseHeader.hashCode() >>> 109) * this.body.hashCode() : (this.responseHeader.hashCode() * 31) + this.body.hashCode();
        int i3 = component1 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryServiceResponse(responseHeader=" + this.responseHeader + ", body=" + this.body + ')';
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        if (i3 == 0) {
            imtServiceResponseHeader.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
        } else {
            imtServiceResponseHeader.writeToParcel(dest, flags);
            this.body.writeToParcel(dest, flags);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
