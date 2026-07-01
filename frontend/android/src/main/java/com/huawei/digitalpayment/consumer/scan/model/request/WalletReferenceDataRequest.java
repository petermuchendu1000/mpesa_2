package com.huawei.digitalpayment.consumer.scan.model.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scan/model/request/WalletReferenceDataRequest;", "Lcom/huawei/http/BaseRequestParams;", "receiverTillNo", "", "<init>", "(Ljava/lang/String;)V", "getReceiverTillNo", "()Ljava/lang/String;", "setReceiverTillNo", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletReferenceDataRequest extends BaseRequestParams {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private String receiverTillNo;

    public WalletReferenceDataRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiverTillNo = str;
    }

    public final String getReceiverTillNo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.receiverTillNo;
        int i5 = i2 + 73;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setReceiverTillNo(String str) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.receiverTillNo = str;
        int i4 = ShareDataUIState + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 89;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
