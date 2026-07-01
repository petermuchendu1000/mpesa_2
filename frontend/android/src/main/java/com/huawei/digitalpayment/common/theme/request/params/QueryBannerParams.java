package com.huawei.digitalpayment.common.theme.request.params;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/QueryBannerParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "bannerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "getBannerType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryBannerParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String bannerType;
    private final String initiatorMsisdn;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryBannerParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = ShareDataUIState + 17;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2);
    }

    public final String getBannerType() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.bannerType;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return str;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public QueryBannerParams(String str, String str2) {
        this.initiatorMsisdn = str;
        this.bannerType = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryBannerParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static QueryBannerParams copy$default(QueryBannerParams queryBannerParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 97;
        component3 = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = queryBannerParams.initiatorMsisdn;
        }
        if ((i & 2) != 0) {
            str2 = queryBannerParams.bannerType;
        }
        QueryBannerParams queryBannerParamsCopy = queryBannerParams.copy(str, str2);
        int i4 = ShareDataUIState + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return queryBannerParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.initiatorMsisdn;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.bannerType;
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QueryBannerParams copy(String initiatorMsisdn, String bannerType) {
        int i = 2 % 2;
        QueryBannerParams queryBannerParams = new QueryBannerParams(initiatorMsisdn, bannerType);
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return queryBannerParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryBannerParams)) {
            int i2 = ShareDataUIState + 55;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        QueryBannerParams queryBannerParams = (QueryBannerParams) other;
        if (Intrinsics.areEqual(this.initiatorMsisdn, queryBannerParams.initiatorMsisdn)) {
            if (Intrinsics.areEqual(this.bannerType, queryBannerParams.bannerType)) {
                return true;
            }
            int i3 = component3 + 75;
            ShareDataUIState = i3 % 128;
            return i3 % 2 != 0;
        }
        int i4 = component3;
        int i5 = i4 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 15;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.initiatorMsisdn;
        if (str == null) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 53;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = component3 + 43;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        String str2 = this.bannerType;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryBannerParams(initiatorMsisdn=" + this.initiatorMsisdn + ", bannerType=" + this.bannerType + ")";
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
