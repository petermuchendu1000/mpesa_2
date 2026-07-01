package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/LocationReportParams;", "Lcom/huawei/http/BaseRequestParams;", "longitude", "", "latitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLongitude", "()Ljava/lang/String;", "getLatitude", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocationReportParams extends BaseRequestParams {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String latitude;
    private final String longitude;

    public final String getLongitude() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final String getLatitude() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.latitude;
        int i5 = i3 + 125;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LocationReportParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.longitude = str;
        this.latitude = str2;
    }

    public static LocationReportParams copy$default(LocationReportParams locationReportParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = locationReportParams.longitude;
        }
        if ((i & 2) != 0) {
            int i3 = copydefault;
            int i4 = i3 + 73;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            String str3 = locationReportParams.latitude;
            int i6 = i3 + 61;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str2 = str3;
        }
        return locationReportParams.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.longitude;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.latitude;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final LocationReportParams copy(String longitude, String latitude) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(longitude, "");
        Intrinsics.checkNotNullParameter(latitude, "");
        LocationReportParams locationReportParams = new LocationReportParams(longitude, latitude);
        int i2 = component2 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return locationReportParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocationReportParams)) {
            return false;
        }
        LocationReportParams locationReportParams = (LocationReportParams) other;
        if (!Intrinsics.areEqual(this.longitude, locationReportParams.longitude) || !Intrinsics.areEqual(this.latitude, locationReportParams.latitude)) {
            return false;
        }
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.longitude.hashCode();
        return i3 == 0 ? (iHashCode / 35) * this.latitude.hashCode() : (iHashCode * 31) + this.latitude.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocationReportParams(longitude=" + this.longitude + ", latitude=" + this.latitude + ")";
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
