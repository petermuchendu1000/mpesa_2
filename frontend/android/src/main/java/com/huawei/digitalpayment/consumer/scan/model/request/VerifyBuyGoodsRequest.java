package com.huawei.digitalpayment.consumer.scan.model.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scan/model/request/VerifyBuyGoodsRequest;", "Lcom/huawei/http/BaseRequestParams;", "receiverTillNo", "", "<init>", "(Ljava/lang/String;)V", "getReceiverTillNo", "()Ljava/lang/String;", "setReceiverTillNo", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyBuyGoodsRequest extends BaseRequestParams {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1 % 128;
    private String receiverTillNo;

    public VerifyBuyGoodsRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiverTillNo = str;
    }

    public final String getReceiverTillNo() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.receiverTillNo;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setReceiverTillNo(String str) {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.receiverTillNo = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.receiverTillNo = str;
        int i3 = component1 + 95;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        if (1 % 2 == 0) {
            throw null;
        }
    }
}
