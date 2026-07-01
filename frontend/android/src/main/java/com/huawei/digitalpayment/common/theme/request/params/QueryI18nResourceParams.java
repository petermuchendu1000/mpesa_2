package com.huawei.digitalpayment.common.theme.request.params;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/request/params/QueryI18nResourceParams;", "Lcom/huawei/http/BaseRequestParams;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getScope", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryI18nResourceParams extends BaseRequestParams {
    private static int component2 = 1;
    private static int component3;
    private final String category;
    private final String scope;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryI18nResourceParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 83;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 107;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "Theme";
        }
        if ((i & 2) != 0) {
            int i7 = component2 + 125;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getScope() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scope;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public QueryI18nResourceParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.category = str;
        this.scope = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryI18nResourceParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static QueryI18nResourceParams copy$default(QueryI18nResourceParams queryI18nResourceParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = queryI18nResourceParams.category;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 63;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str2 = queryI18nResourceParams.scope;
        }
        QueryI18nResourceParams queryI18nResourceParamsCopy = queryI18nResourceParams.copy(str, str2);
        int i5 = component3 + 39;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return queryI18nResourceParamsCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scope;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final QueryI18nResourceParams copy(String category, String scope) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(scope, "");
        QueryI18nResourceParams queryI18nResourceParams = new QueryI18nResourceParams(category, scope);
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return queryI18nResourceParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 81;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof QueryI18nResourceParams)) {
            return false;
        }
        QueryI18nResourceParams queryI18nResourceParams = (QueryI18nResourceParams) other;
        if (Intrinsics.areEqual(this.category, queryI18nResourceParams.category)) {
            return Intrinsics.areEqual(this.scope, queryI18nResourceParams.scope);
        }
        int i3 = component2 + 67;
        component3 = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.category.hashCode() << 68) << this.scope.hashCode() : (this.category.hashCode() * 31) + this.scope.hashCode();
        int i3 = component3 + 99;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryI18nResourceParams(category=" + this.category + ", scope=" + this.scope + ")";
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
