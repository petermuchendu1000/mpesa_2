package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingResponse;", "", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/Header;", "body", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/Header;Ljava/lang/Object;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/Header;", "getBody", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataSharingResponse {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 125 % 128;
    private static int component4 = 1;
    private static int copydefault;

    @SerializedName("header")
    private final Header component1;

    @SerializedName("body")
    private final Object component2;

    public DataSharingResponse(Header header, Object obj) {
        Intrinsics.checkNotNullParameter(header, "");
        this.component1 = header;
        this.component2 = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataSharingResponse(Header header, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = copydefault + 37;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            obj = null;
        }
        this(header, obj);
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final Object getBody() {
        Object obj;
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 == 0) {
            obj = this.component2;
            int i4 = 43 / 0;
        } else {
            obj = this.component2;
        }
        int i5 = i3 + 87;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    static {
        if (125 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DataSharingResponse copy$default(DataSharingResponse dataSharingResponse, Header header, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component4 + 111;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Header header2 = dataSharingResponse.component1;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            header = dataSharingResponse.component1;
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 75;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            obj = dataSharingResponse.component2;
        }
        return dataSharingResponse.copy(header, obj);
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.component1;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = component4 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = this.component2;
        int i5 = i3 + 39;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final DataSharingResponse copy(Header header, Object body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        DataSharingResponse dataSharingResponse = new DataSharingResponse(header, body);
        int i2 = component4 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return dataSharingResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 41;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DataSharingResponse)) {
            return false;
        }
        DataSharingResponse dataSharingResponse = (DataSharingResponse) other;
        if (!Intrinsics.areEqual(this.component1, dataSharingResponse.component1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, dataSharingResponse.component2)) {
            return true;
        }
        int i4 = copydefault + 93;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 117;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component1.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.component1.hashCode();
        Object obj2 = this.component2;
        int iHashCode2 = (iHashCode * 31) + (obj2 == null ? 0 : obj2.hashCode());
        int i3 = copydefault + 15;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode2;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataSharingResponse(header=" + this.component1 + ", body=" + this.component2 + ")";
        int i2 = component4 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
