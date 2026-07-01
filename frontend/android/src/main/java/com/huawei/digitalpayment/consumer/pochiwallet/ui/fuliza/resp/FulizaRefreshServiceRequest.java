package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J5\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0004H×\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/FulizaRefreshServiceRequest;", "", "header", "", "", "body", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getHeader", "()Ljava/util/Map;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaRefreshServiceRequest {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 0;
    private static int equals = 1;

    @SerializedName("body")
    private final Map<String, String> ShareDataUIState;

    @SerializedName("header")
    private final Map<String, String> component3;

    public FulizaRefreshServiceRequest(Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.component3 = map;
        this.ShareDataUIState = map2;
    }

    public final Map<String, String> getHeader() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.component3;
        int i5 = i2 + 53;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> getBody() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.ShareDataUIState;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    static {
        int i = 1 + 35;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FulizaRefreshServiceRequest copy$default(FulizaRefreshServiceRequest fulizaRefreshServiceRequest, Map map, Map map2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 115;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 105;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                Map<String, String> map3 = fulizaRefreshServiceRequest.component3;
                throw null;
            }
            map = fulizaRefreshServiceRequest.component3;
        }
        if ((i & 2) != 0) {
            map2 = fulizaRefreshServiceRequest.ShareDataUIState;
        }
        return fulizaRefreshServiceRequest.copy(map, map2);
    }

    public final Map<String, String> component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.component3;
        int i5 = i2 + 53;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<String, String> component2() {
        int i = 2 % 2;
        int i2 = equals + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final FulizaRefreshServiceRequest copy(Map<String, String> header, Map<String, String> body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        FulizaRefreshServiceRequest fulizaRefreshServiceRequest = new FulizaRefreshServiceRequest(header, body);
        int i2 = equals + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return fulizaRefreshServiceRequest;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 39;
            equals = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof FulizaRefreshServiceRequest)) {
            int i3 = component1 + 11;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        FulizaRefreshServiceRequest fulizaRefreshServiceRequest = (FulizaRefreshServiceRequest) other;
        if (!Intrinsics.areEqual(this.component3, fulizaRefreshServiceRequest.component3)) {
            int i5 = component1 + 23;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, fulizaRefreshServiceRequest.ShareDataUIState)) {
            return true;
        }
        int i6 = component1 + 11;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component3.hashCode() * 31) + this.ShareDataUIState.hashCode();
        int i4 = equals + 3;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FulizaRefreshServiceRequest(header=" + this.component3 + ", body=" + this.ShareDataUIState + ")";
        int i2 = component1 + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
