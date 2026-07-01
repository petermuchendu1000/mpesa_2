package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.forgotpin;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/forgotpin/ResetPinResp;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_FORWARD, "", "<init>", "(Ljava/lang/String;)V", "getForward", "()Ljava/lang/String;", "setForward", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResetPinResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 53 % 128;
    private String forward;

    public ResetPinResp(String str) {
        this.forward = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ResetPinResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        this(str);
    }

    public final String getForward() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.forward;
        int i4 = i3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setForward(String str) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.forward = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 117;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = 53 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResetPinResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
