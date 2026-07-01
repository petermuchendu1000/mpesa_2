package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/request/QueryLoginTypeParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryLoginTypeParams extends BaseRequestParams {
    private static int component2 = 1;
    private static int component3;
    private final String initiatorMsisdn;

    public QueryLoginTypeParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorMsisdn = str;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static QueryLoginTypeParams copy$default(QueryLoginTypeParams queryLoginTypeParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = queryLoginTypeParams.initiatorMsisdn;
            int i5 = i3 + 99;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return queryLoginTypeParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final QueryLoginTypeParams copy(String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        QueryLoginTypeParams queryLoginTypeParams = new QueryLoginTypeParams(initiatorMsisdn);
        int i2 = component2 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return queryLoginTypeParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 17;
            component3 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof QueryLoginTypeParams)) {
            return false;
        }
        if (Intrinsics.areEqual(this.initiatorMsisdn, ((QueryLoginTypeParams) other).initiatorMsisdn)) {
            return true;
        }
        int i6 = component2 + 13;
        component3 = i6 % 128;
        return !(i6 % 2 == 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorMsisdn.hashCode();
        int i4 = component2 + 117;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryLoginTypeParams(initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component3 + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
