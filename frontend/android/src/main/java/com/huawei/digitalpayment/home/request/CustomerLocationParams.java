package com.huawei.digitalpayment.home.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/home/request/CustomerLocationParams;", "Lcom/huawei/http/BaseRequestParams;", "longitude", "", "latitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLongitude", "()Ljava/lang/String;", "getLatitude", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomerLocationParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String latitude;
    private final String longitude;

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.longitude;
        int i5 = i2 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latitude;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public CustomerLocationParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.longitude = str;
        this.latitude = str2;
    }

    public static CustomerLocationParams copy$default(CustomerLocationParams customerLocationParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 51;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = customerLocationParams.longitude;
        }
        if ((i & 2) != 0) {
            str2 = customerLocationParams.latitude;
        }
        CustomerLocationParams customerLocationParamsCopy = customerLocationParams.copy(str, str2);
        int i4 = ShareDataUIState + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return customerLocationParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.longitude;
        int i4 = i3 + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latitude;
        int i5 = i2 + 105;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CustomerLocationParams copy(String longitude, String latitude) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(longitude, "");
        Intrinsics.checkNotNullParameter(latitude, "");
        CustomerLocationParams customerLocationParams = new CustomerLocationParams(longitude, latitude);
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return customerLocationParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerLocationParams)) {
            return false;
        }
        CustomerLocationParams customerLocationParams = (CustomerLocationParams) other;
        if (!Intrinsics.areEqual(this.longitude, customerLocationParams.longitude)) {
            int i4 = ShareDataUIState + 13;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.latitude, customerLocationParams.latitude)) {
            return false;
        }
        int i6 = component3 + 13;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.longitude.hashCode();
        return i3 != 0 ? (iHashCode % 21) * this.latitude.hashCode() : (iHashCode * 31) + this.latitude.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomerLocationParams(longitude=" + this.longitude + ", latitude=" + this.latitude + ")";
        int i2 = ShareDataUIState + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
