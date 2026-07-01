package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\"\u001a\u00020#H×\u0001J\t\u0010$\u001a\u00020\u0005H×\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfo;", "", "headers", "Lcom/google/gson/JsonObject;", "httpMethod", "", "path", "payload", "queryString", "<init>", "(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeaders", "()Lcom/google/gson/JsonObject;", "setHeaders", "(Lcom/google/gson/JsonObject;)V", "getHttpMethod", "()Ljava/lang/String;", "setHttpMethod", "(Ljava/lang/String;)V", "getPath", "setPath", "getPayload", "setPayload", "getQueryString", "setQueryString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestInfo {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 109 % 128;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("headers")
    private JsonObject headers;

    @SerializedName("httpMethod")
    private String httpMethod;

    @SerializedName("path")
    private String path;

    @SerializedName("payload")
    private String payload;

    @SerializedName("queryString")
    private String queryString;

    public RequestInfo(JsonObject jsonObject, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.headers = jsonObject;
        this.httpMethod = str;
        this.path = str2;
        this.payload = str3;
        this.queryString = str4;
    }

    public final JsonObject getHeaders() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        JsonObject jsonObject = this.headers;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return jsonObject;
    }

    public final void setHeaders(JsonObject jsonObject) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            this.headers = jsonObject;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.headers = jsonObject;
        int i3 = component2 + 65;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getHttpMethod() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.httpMethod;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setHttpMethod(String str) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.httpMethod = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.httpMethod = str;
            int i3 = 61 / 0;
        }
    }

    public final String getPath() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.path;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return str;
    }

    public final void setPath(String str) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.path = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.path = str;
            throw null;
        }
    }

    public final String getPayload() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.payload;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final void setPayload(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.payload = str;
        int i4 = copydefault + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
    }

    public final String getQueryString() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.queryString;
        }
        throw null;
    }

    public final void setQueryString(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.queryString = str;
        int i4 = component2 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = 109 % 2;
    }

    public static RequestInfo copy$default(RequestInfo requestInfo, JsonObject jsonObject, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 31;
        copydefault = i4 % 128;
        if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            jsonObject = requestInfo.headers;
        }
        JsonObject jsonObject2 = jsonObject;
        if ((i & 2) != 0) {
            str = requestInfo.httpMethod;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = requestInfo.path;
            int i5 = i3 + 71;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            int i7 = i3 + 103;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str3 = requestInfo.payload;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = requestInfo.queryString;
        }
        return requestInfo.copy(jsonObject2, str5, str6, str7, str4);
    }

    public final JsonObject component1() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.headers;
        }
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.httpMethod;
            int i4 = 77 / 0;
        } else {
            str = this.httpMethod;
        }
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.path;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.payload;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.queryString;
        }
        throw null;
    }

    public final RequestInfo copy(JsonObject headers, String httpMethod, String path, String payload, String queryString) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(headers, "");
        Intrinsics.checkNotNullParameter(httpMethod, "");
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(payload, "");
        Intrinsics.checkNotNullParameter(queryString, "");
        RequestInfo requestInfo = new RequestInfo(headers, httpMethod, path, payload, queryString);
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return requestInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestInfo)) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) other;
        if (!Intrinsics.areEqual(this.headers, requestInfo.headers)) {
            int i3 = component2 + 101;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.httpMethod, requestInfo.httpMethod) || !Intrinsics.areEqual(this.path, requestInfo.path)) {
            return false;
        }
        if (Intrinsics.areEqual(this.payload, requestInfo.payload)) {
            return Intrinsics.areEqual(this.queryString, requestInfo.queryString);
        }
        int i5 = copydefault + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.headers.hashCode() * 31) + this.httpMethod.hashCode()) * 31) + this.path.hashCode()) * 31) + this.payload.hashCode()) * 31) + this.queryString.hashCode();
        int i4 = component2 + 71;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestInfo(headers=" + this.headers + ", httpMethod=" + this.httpMethod + ", path=" + this.path + ", payload=" + this.payload + ", queryString=" + this.queryString + ")";
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
