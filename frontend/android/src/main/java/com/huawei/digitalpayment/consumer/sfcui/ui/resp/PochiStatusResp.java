package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PochiStatusResp;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/UnregisterSendResp;", "isBound", "", AppLogInterceptor.MESSAGE_ID, "resultCode", "resultDesc", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getMessageId", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiStatusResp extends UnregisterSendResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int copydefault = 0;
    private static int equals = 1;

    @SerializedName("isBound")
    private final String component1;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String component3;

    public final String isBound() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 9;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = equals + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PochiStatusResp(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str3, str4, str5, str6);
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.component1 = str;
        this.component3 = str2;
    }

    static {
        int i = 1 + 79;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
