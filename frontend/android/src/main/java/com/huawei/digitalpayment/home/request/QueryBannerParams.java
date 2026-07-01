package com.huawei.digitalpayment.home.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/home/request/QueryBannerParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "bannerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "getBannerType", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryBannerParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String bannerType;
    private final String initiatorMsisdn;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryBannerParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = component2 + 37;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2);
    }

    public final String getBannerType() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bannerType;
        int i5 = i3 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public QueryBannerParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorMsisdn = str;
        this.bannerType = str2;
    }

    public static QueryBannerParams copy$default(QueryBannerParams queryBannerParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 45;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = queryBannerParams.initiatorMsisdn;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 103;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str2 = queryBannerParams.bannerType;
        }
        return queryBannerParams.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bannerType;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    public final QueryBannerParams copy(String initiatorMsisdn, String bannerType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        QueryBannerParams queryBannerParams = new QueryBannerParams(initiatorMsisdn, bannerType);
        int i2 = ShareDataUIState + 23;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return queryBannerParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 21;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof QueryBannerParams)) {
            int i3 = component2 + 125;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        QueryBannerParams queryBannerParams = (QueryBannerParams) other;
        if (Intrinsics.areEqual(this.initiatorMsisdn, queryBannerParams.initiatorMsisdn)) {
            return Intrinsics.areEqual(this.bannerType, queryBannerParams.bannerType);
        }
        int i5 = ShareDataUIState + 39;
        component2 = i5 % 128;
        return i5 % 2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r1 r3
  0x0038: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.request.QueryBannerParams.ShareDataUIState
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.request.QueryBannerParams.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1d
            java.lang.String r1 = r5.initiatorMsisdn
            int r1 = r1.hashCode()
            java.lang.String r3 = r5.bannerType
            r4 = 59
            int r4 = r4 / r2
            if (r3 != 0) goto L38
            goto L27
        L1d:
            java.lang.String r1 = r5.initiatorMsisdn
            int r1 = r1.hashCode()
            java.lang.String r3 = r5.bannerType
            if (r3 != 0) goto L38
        L27:
            int r3 = com.huawei.digitalpayment.home.request.QueryBannerParams.ShareDataUIState
            int r3 = r3 + 95
            int r4 = r3 % 128
            com.huawei.digitalpayment.home.request.QueryBannerParams.component2 = r4
            int r3 = r3 % r0
            int r4 = r4 + 121
            int r3 = r4 % 128
            com.huawei.digitalpayment.home.request.QueryBannerParams.ShareDataUIState = r3
            int r4 = r4 % r0
            goto L3c
        L38:
            int r2 = r3.hashCode()
        L3c:
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.request.QueryBannerParams.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryBannerParams(initiatorMsisdn=" + this.initiatorMsisdn + ", bannerType=" + this.bannerType + ")";
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
