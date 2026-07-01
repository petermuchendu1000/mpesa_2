package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/UnregisterSendResp;", "", "resultCode", "", "resultDesc", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResultCode", "()Ljava/lang/String;", "getResultDesc", "getErrorCode", "getErrorMessage", Keys.KEY_IS_SUCCESS, "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UnregisterSendResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final String component1;
    private final String component2;

    @SerializedName("ResultDesc")
    private final String component3;

    @SerializedName("ResultCode")
    private final String copydefault;

    public UnregisterSendResp(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = str;
        this.component3 = str2;
        this.component1 = str3;
        this.component2 = str4;
    }

    public final String getResultCode() {
        int i = 2 % 2;
        int i2 = copy + 51;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 43;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResultDesc() {
        int i = 2 % 2;
        int i2 = copy + 23;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getErrorCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isSuccess() {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = TextUtils.equals(this.copydefault, "0");
        int i4 = getAsAtTimestamp + 21;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 101;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 4 / 0;
        }
    }
}
