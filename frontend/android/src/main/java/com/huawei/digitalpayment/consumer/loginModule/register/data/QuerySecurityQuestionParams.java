package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/data/QuerySecurityQuestionParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuerySecurityQuestionParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String initiatorMsisdn;

    public QuerySecurityQuestionParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorMsisdn = str;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static QuerySecurityQuestionParams copy$default(QuerySecurityQuestionParams querySecurityQuestionParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 103;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = querySecurityQuestionParams.initiatorMsisdn;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = querySecurityQuestionParams.initiatorMsisdn;
        }
        QuerySecurityQuestionParams querySecurityQuestionParamsCopy = querySecurityQuestionParams.copy(str);
        int i4 = component2 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return querySecurityQuestionParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final QuerySecurityQuestionParams copy(String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        QuerySecurityQuestionParams querySecurityQuestionParams = new QuerySecurityQuestionParams(initiatorMsisdn);
        int i2 = component2 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return querySecurityQuestionParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof QuerySecurityQuestionParams)) {
            return false;
        }
        if (Intrinsics.areEqual(this.initiatorMsisdn, ((QuerySecurityQuestionParams) other).initiatorMsisdn)) {
            return true;
        }
        int i4 = ShareDataUIState + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorMsisdn.hashCode();
        int i4 = ShareDataUIState + 49;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuerySecurityQuestionParams(initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component2 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
