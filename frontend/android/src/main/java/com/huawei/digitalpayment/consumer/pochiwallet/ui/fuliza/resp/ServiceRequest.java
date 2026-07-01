package com.huawei.digitalpayment.consumer.pochiwallet.ui.fuliza.resp;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0005j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0003\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\b0\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0005j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ'\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\b0\u0007HÆ\u0003J\\\u0010\u0012\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0005j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00032&\b\u0002\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\b0\u0007HÇ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0004H×\u0001R4\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0005j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR4\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/ServiceRequest;", "", "header", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "body", "", "", "<init>", "(Ljava/util/HashMap;Ljava/util/Map;)V", "getHeader", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "getBody", "()Ljava/util/Map;", "component1", "component2", "copy", "(Ljava/util/HashMap;Ljava/util/Map;)Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/fuliza/resp/ServiceRequest;", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceRequest {
    public static final int $stable = 8;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copy = 1;
    private static int copydefault;

    @SerializedName("Body")
    private final Map<String, List<Map<String, String>>> ShareDataUIState;

    @SerializedName("Header")
    private final HashMap<String, String> component1;

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceRequest(HashMap<String, String> map, Map<String, ? extends List<? extends Map<String, String>>> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.component1 = map;
        this.ShareDataUIState = map2;
    }

    public final HashMap<String, String> getHeader() {
        int i = 2 % 2;
        int i2 = copy + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HashMap<String, String> map = this.component1;
        int i4 = i3 + 23;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    public final Map<String, List<Map<String, String>>> getBody() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, List<Map<String, String>>> map = this.ShareDataUIState;
        int i5 = i2 + 71;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    static {
        int i = 1 + 51;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ServiceRequest copy$default(ServiceRequest serviceRequest, HashMap map, Map map2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 9;
        int i4 = i3 % 128;
        copy = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            map = serviceRequest.component1;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 53;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            map2 = serviceRequest.ShareDataUIState;
            int i7 = i4 + 9;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return serviceRequest.copy(map, map2);
    }

    public final HashMap<String, String> component1() {
        int i = 2 % 2;
        int i2 = copy + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, String> map = this.component1;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return map;
    }

    public final Map<String, List<Map<String, String>>> component2() {
        int i = 2 % 2;
        int i2 = copy + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, List<Map<String, String>>> map = this.ShareDataUIState;
        int i5 = i3 + 73;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final ServiceRequest copy(HashMap<String, String> header, Map<String, ? extends List<? extends Map<String, String>>> body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        Intrinsics.checkNotNullParameter(body, "");
        ServiceRequest serviceRequest = new ServiceRequest(header, body);
        int i2 = copy + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return serviceRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (!(other instanceof ServiceRequest)) {
                return false;
            }
            ServiceRequest serviceRequest = (ServiceRequest) other;
            if (Intrinsics.areEqual(this.component1, serviceRequest.component1)) {
                return Intrinsics.areEqual(this.ShareDataUIState, serviceRequest.ShareDataUIState);
            }
            int i2 = copy + 3;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = copydefault + 85;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 105;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component1.hashCode() * 31) + this.ShareDataUIState.hashCode();
        int i4 = copydefault + 41;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServiceRequest(header=" + this.component1 + ", body=" + this.ShareDataUIState + ")";
        int i2 = copydefault + 77;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
