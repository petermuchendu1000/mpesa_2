package com.huawei.digitalpayment.home.request;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/home/request/QueryI18nParams;", "Lcom/huawei/http/BaseRequestParams;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getScope", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryI18nParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String category;
    private final String scope;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryI18nParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1;
            int i3 = i2 + 95;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "Theme";
        }
        this(str, str2);
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getScope() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scope;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public QueryI18nParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.category = str;
        this.scope = str2;
    }

    public static QueryI18nParams copy$default(QueryI18nParams queryI18nParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 67;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = queryI18nParams.category;
        }
        if ((i & 2) != 0) {
            str2 = queryI18nParams.scope;
        }
        QueryI18nParams queryI18nParamsCopy = queryI18nParams.copy(str, str2);
        int i5 = component1 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return queryI18nParamsCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.category;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.scope;
        int i4 = i3 + 111;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return str;
    }

    public final QueryI18nParams copy(String category, String scope) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(scope, "");
        QueryI18nParams queryI18nParams = new QueryI18nParams(category, scope);
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return queryI18nParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 57;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof QueryI18nParams)) {
            return false;
        }
        QueryI18nParams queryI18nParams = (QueryI18nParams) other;
        if (Intrinsics.areEqual(this.category, queryI18nParams.category)) {
            return !(Intrinsics.areEqual(this.scope, queryI18nParams.scope) ^ true);
        }
        int i3 = component1 + 83;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 99;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.category.hashCode() % 104) / this.scope.hashCode() : (this.category.hashCode() * 31) + this.scope.hashCode();
        int i3 = ShareDataUIState + 3;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryI18nParams(category=" + this.category + ", scope=" + this.scope + ")";
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
