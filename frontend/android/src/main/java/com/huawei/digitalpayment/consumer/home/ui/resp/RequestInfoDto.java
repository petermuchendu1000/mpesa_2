package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfoDto;", "", "payload", "", "httpMethod", "queryString", "headers", "", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getPayload", "()Ljava/lang/String;", "getHttpMethod", "getQueryString", "getHeaders", "()Ljava/util/Map;", "getPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestInfoDto {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 45 % 128;
    private static int copydefault;

    @SerializedName("headers")
    private final Map<String, String> headers;

    @SerializedName("httpMethod")
    private final String httpMethod;

    @SerializedName("path")
    private final String path;

    @SerializedName("payload")
    private final String payload;

    @SerializedName("queryString")
    private final String queryString;

    public RequestInfoDto(String str, String str2, String str3, Map<String, String> map, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payload = str;
        this.httpMethod = str2;
        this.queryString = str3;
        this.headers = map;
        this.path = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RequestInfoDto(String str, String str2, String str3, Map map, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        Map map2;
        String str6;
        Object obj = null;
        String str7 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = component1 + 27;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            int i3 = component1;
            int i4 = i3 + 117;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 63;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 3;
            } else {
                int i8 = 2 % 2;
            }
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i & 16) != 0) {
            int i9 = component2 + 93;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str4;
        }
        this(str, str7, str5, map2, str6);
    }

    public final String getPayload() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.payload;
        int i4 = i3 + 49;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return str;
    }

    public final String getHttpMethod() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.httpMethod;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String getQueryString() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.queryString;
        int i4 = i2 + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> getHeaders() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, String> map = this.headers;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return map;
    }

    public final String getPath() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.path;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (45 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RequestInfoDto copy$default(RequestInfoDto requestInfoDto, String str, String str2, String str3, Map map, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 101;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = requestInfoDto.payload;
            int i5 = i4 + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = requestInfoDto.httpMethod;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = requestInfoDto.queryString;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            int i7 = component1 + 45;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            map = requestInfoDto.headers;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            str4 = requestInfoDto.path;
        }
        return requestInfoDto.copy(str5, str6, str7, map2, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.payload;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.httpMethod;
        int i5 = i3 + 33;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.queryString;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Map<String, String> component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.headers;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return map;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.path;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RequestInfoDto copy(String payload, String httpMethod, String queryString, Map<String, String> headers, String path) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(payload, "");
        RequestInfoDto requestInfoDto = new RequestInfoDto(payload, httpMethod, queryString, headers, path);
        int i2 = component1 + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return requestInfoDto;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestInfoDto)) {
            return false;
        }
        RequestInfoDto requestInfoDto = (RequestInfoDto) other;
        if (!Intrinsics.areEqual(this.payload, requestInfoDto.payload)) {
            int i4 = component1 + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.httpMethod, requestInfoDto.httpMethod)) {
            int i6 = component2 + 85;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.queryString, requestInfoDto.queryString)) {
            int i8 = component1 + 113;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.headers, requestInfoDto.headers)) {
            int i10 = component2 + 51;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.path, requestInfoDto.path)) {
            return true;
        }
        int i12 = component1 + 29;
        component2 = i12 % 128;
        return i12 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
  0x002f: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.component1
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.String r1 = r7.payload
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.httpMethod
            if (r3 != 0) goto L2f
            goto L24
        L1a:
            java.lang.String r1 = r7.payload
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.httpMethod
            if (r3 != 0) goto L2f
        L24:
            int r3 = com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.component1
            int r3 = r3 + 37
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.component2 = r4
            int r3 = r3 % r0
            r3 = r2
            goto L33
        L2f:
            int r3 = r3.hashCode()
        L33:
            java.lang.String r4 = r7.queryString
            if (r4 != 0) goto L39
            r4 = r2
            goto L3d
        L39:
            int r4 = r4.hashCode()
        L3d:
            java.util.Map<java.lang.String, java.lang.String> r5 = r7.headers
            if (r5 != 0) goto L51
            int r5 = com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.component2
            int r5 = r5 + 51
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.component1 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L4f
            r0 = 5
            int r0 = r0 % 4
        L4f:
            r0 = r2
            goto L55
        L51:
            int r0 = r5.hashCode()
        L55:
            java.lang.String r5 = r7.path
            if (r5 != 0) goto L5a
            goto L5e
        L5a:
            int r2 = r5.hashCode()
        L5e:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.resp.RequestInfoDto.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RequestInfoDto(payload=" + this.payload + ", httpMethod=" + this.httpMethod + ", queryString=" + this.queryString + ", headers=" + this.headers + ", path=" + this.path + ")";
        int i2 = component2 + 85;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return str;
    }
}
