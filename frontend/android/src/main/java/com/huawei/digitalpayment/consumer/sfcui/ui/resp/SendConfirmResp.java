package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SendConfirmResp;", "Ljava/io/Serializable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendConfirmResp implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;
    private final String key;
    private final String value;

    public SendConfirmResp(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 61;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static SendConfirmResp copy$default(SendConfirmResp sendConfirmResp, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = sendConfirmResp.key;
            int i6 = i3 + 115;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            str2 = sendConfirmResp.value;
        }
        return sendConfirmResp.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    public final SendConfirmResp copy(String key, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        SendConfirmResp sendConfirmResp = new SendConfirmResp(key, value);
        int i2 = ShareDataUIState + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return sendConfirmResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 11;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SendConfirmResp)) {
            return false;
        }
        SendConfirmResp sendConfirmResp = (SendConfirmResp) other;
        if (!Intrinsics.areEqual(this.key, sendConfirmResp.key)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, sendConfirmResp.value)) {
            return true;
        }
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.key.hashCode() * 31) + this.value.hashCode();
        int i4 = copydefault + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendConfirmResp(key=" + this.key + ", value=" + this.value + ")";
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
