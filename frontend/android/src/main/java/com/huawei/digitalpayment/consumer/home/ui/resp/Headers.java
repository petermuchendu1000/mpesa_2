package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/Headers;", "", "contentType", "", "<init>", "(Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Headers {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 9 % 128;
    private static int component3;
    private static int copydefault;

    @SerializedName("Content-Type")
    private String contentType;

    public Headers(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contentType = str;
    }

    public final String getContentType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contentType;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setContentType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.contentType = str;
        int i4 = component3 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (9 % 2 == 0) {
            throw null;
        }
    }

    public static Headers copy$default(Headers headers, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 115;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = headers.contentType;
            int i5 = i4 + 41;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return headers.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contentType;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Headers copy(String contentType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(contentType, "");
        Headers headers = new Headers(contentType);
        int i2 = component1 + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return headers;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof Headers))) {
            if (Intrinsics.areEqual(this.contentType, ((Headers) other).contentType)) {
                int i2 = component1 + 27;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = component1 + 43;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component3 + 43;
        int i7 = i6 % 128;
        component1 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 59;
        component3 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 22 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.contentType.hashCode();
        int i4 = component3 + 69;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Headers(contentType=" + this.contentType + ")";
        int i2 = component3 + 65;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
        return str;
    }
}
