package com.huawei.digitalpayment.consumer.basic.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/resp/QueryMsisdnResp;", "Lcom/huawei/http/BaseResp;", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryMsisdnResp extends BaseResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 121 % 128;
    private final String msisdn;

    public final String getMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.msisdn;
            int i4 = 94 / 0;
        } else {
            str = this.msisdn;
        }
        int i5 = i3 + 123;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QueryMsisdnResp(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msisdn = str;
    }

    static {
        int i = 121 % 2;
    }

    public static QueryMsisdnResp copy$default(QueryMsisdnResp queryMsisdnResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 73;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 15;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = queryMsisdnResp.msisdn;
        }
        QueryMsisdnResp queryMsisdnRespCopy = queryMsisdnResp.copy(str);
        int i8 = component1 + 125;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return queryMsisdnRespCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return str;
    }

    public final QueryMsisdnResp copy(String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        QueryMsisdnResp queryMsisdnResp = new QueryMsisdnResp(msisdn);
        int i2 = component2 + 89;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return queryMsisdnResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof QueryMsisdnResp)) {
            return false;
        }
        if (Intrinsics.areEqual(this.msisdn, ((QueryMsisdnResp) other).msisdn)) {
            return true;
        }
        int i4 = component2 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.msisdn.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.msisdn.hashCode();
        int i3 = component2 + 25;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryMsisdnResp(msisdn=" + this.msisdn + ")";
        int i2 = component1 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
