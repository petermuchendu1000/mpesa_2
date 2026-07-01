package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÇ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\f\u001a\u00020\rH×\u0001J\t\u0010\u000e\u001a\u00020\u000fH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/MiniAppResponse;", "", "datum", "<init>", "(Ljava/lang/Object;)V", "getDatum", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppResponse {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("responseInfo")
    private final Object datum;

    public MiniAppResponse(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.datum = obj;
    }

    public final Object getDatum() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.datum;
        }
        throw null;
    }

    static {
        int i = 1 + 113;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MiniAppResponse copy$default(MiniAppResponse miniAppResponse, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = component1 + 91;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            obj = miniAppResponse.datum;
            int i5 = i4 + 25;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
        }
        return miniAppResponse.copy(obj);
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.datum;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MiniAppResponse copy(Object datum) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datum, "");
        MiniAppResponse miniAppResponse = new MiniAppResponse(datum);
        int i2 = component2 + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return miniAppResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 95;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof MiniAppResponse) {
            if (Intrinsics.areEqual(this.datum, ((MiniAppResponse) other).datum)) {
                int i4 = component2 + 43;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = component1 + 99;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = component1 + 41;
        int i9 = i8 % 128;
        component2 = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 89;
        component1 = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.datum.hashCode();
        int i4 = component1 + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppResponse(datum=" + this.datum + ")";
        int i2 = component2 + 107;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
