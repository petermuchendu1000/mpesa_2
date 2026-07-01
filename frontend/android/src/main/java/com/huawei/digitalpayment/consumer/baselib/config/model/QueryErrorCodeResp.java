package com.huawei.digitalpayment.consumer.baselib.config.model;

import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0005HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/QueryErrorCodeResp;", "Lcom/huawei/http/BaseResp;", "cacheTimestamp", "", WebViewConstants.COMMON, "", "Lcom/huawei/digitalpayment/consumer/baselib/config/model/ErrorCodeItem;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getCacheTimestamp", "()Ljava/lang/String;", "getCommon", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryErrorCodeResp extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    private final String cacheTimestamp;
    private final Map<String, Map<String, ErrorCodeItem>> common;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryErrorCodeResp(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 59;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 75 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 51;
            int i6 = i5 % 128;
            component3 = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            map = null;
        }
        this(str, map);
    }

    public final String getCacheTimestamp() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.cacheTimestamp;
        int i4 = i3 + 87;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, Map<String, ErrorCodeItem>> getCommon() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, ErrorCodeItem>> map = this.common;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryErrorCodeResp(String str, Map<String, ? extends Map<String, ErrorCodeItem>> map) {
        this.cacheTimestamp = str;
        this.common = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryErrorCodeResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QueryErrorCodeResp copy$default(QueryErrorCodeResp queryErrorCodeResp, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 67;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = queryErrorCodeResp.cacheTimestamp;
        }
        if ((i & 2) != 0) {
            map = queryErrorCodeResp.common;
        }
        QueryErrorCodeResp queryErrorCodeRespCopy = queryErrorCodeResp.copy(str, map);
        int i5 = component1 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return queryErrorCodeRespCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.cacheTimestamp;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Map<String, ErrorCodeItem>> component2() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Map<String, ErrorCodeItem>> map = this.common;
        int i4 = i3 + 9;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final QueryErrorCodeResp copy(String cacheTimestamp, Map<String, ? extends Map<String, ErrorCodeItem>> common) {
        int i = 2 % 2;
        QueryErrorCodeResp queryErrorCodeResp = new QueryErrorCodeResp(cacheTimestamp, common);
        int i2 = component3 + 15;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return queryErrorCodeResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryErrorCodeResp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cacheTimestamp, ((QueryErrorCodeResp) other).cacheTimestamp)) {
            int i4 = component1 + 19;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.common, r6.common)) {
            return false;
        }
        int i6 = component1 + 59;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int iHashCode2 = 0;
        if (str == null) {
            int i5 = i2 + 37;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = component3 + 73;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        Map<String, Map<String, ErrorCodeItem>> map = this.common;
        if (map != null) {
            iHashCode2 = map.hashCode();
            int i9 = component1 + 99;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QueryErrorCodeResp(cacheTimestamp=" + this.cacheTimestamp + ", common=" + this.common + ")";
        int i2 = component3 + 91;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
