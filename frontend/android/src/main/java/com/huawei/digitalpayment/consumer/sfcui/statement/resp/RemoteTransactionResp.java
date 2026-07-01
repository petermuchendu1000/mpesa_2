package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.huawei.digitalpayment.consumer.base.cube.resp.CubeBaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/RemoteTransactionResp;", "Lcom/huawei/digitalpayment/consumer/base/cube/resp/CubeBaseResp;", "result", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Result;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Result;)V", "getResult", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Result;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteTransactionResp extends CubeBaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 25 % 128;
    private static int component1 = 1;
    private static int component2;
    private static int component3;
    private final Result result;

    public final Result getResult() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Result result = this.result;
        int i5 = i2 + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return result;
        }
        throw null;
    }

    public RemoteTransactionResp(Result result) {
        Intrinsics.checkNotNullParameter(result, "");
        this.result = result;
    }

    static {
        if (25 % 2 == 0) {
            throw null;
        }
    }

    public static RemoteTransactionResp copy$default(RemoteTransactionResp remoteTransactionResp, Result result, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 5;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            result = remoteTransactionResp.result;
            if (i7 == 0) {
                int i8 = 76 / 0;
            }
        }
        return remoteTransactionResp.copy(result);
    }

    public final Result component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Result result = this.result;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return result;
        }
        throw null;
    }

    public final RemoteTransactionResp copy(Result result) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(result, "");
        RemoteTransactionResp remoteTransactionResp = new RemoteTransactionResp(result);
        int i2 = component1 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return remoteTransactionResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof RemoteTransactionResp) {
            return Intrinsics.areEqual(this.result, ((RemoteTransactionResp) other).result);
        }
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.result.hashCode();
        int i4 = component1 + 75;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteTransactionResp(result=" + this.result + ")";
        int i2 = component2 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
