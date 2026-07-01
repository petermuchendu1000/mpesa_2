package com.huawei.digitalpayment.consumer.base.util;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/ResponseInfo;", "Ljava/io/Serializable;", Keys.KEY_CUSTOMER_MESSAGE, "", "responseCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerMessage", "()Ljava/lang/String;", "getResponseCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResponseInfo implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String customerMessage;
    private final String responseCode;

    public ResponseInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.customerMessage = str;
        this.responseCode = str2;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResponseInfo copy$default(ResponseInfo responseInfo, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 83;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = responseInfo.customerMessage;
                int i4 = 13 / 0;
            } else {
                str = responseInfo.customerMessage;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 103;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = responseInfo.responseCode;
        }
        return responseInfo.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customerMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseCode;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final ResponseInfo copy(String customerMessage, String responseCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customerMessage, "");
        Intrinsics.checkNotNullParameter(responseCode, "");
        ResponseInfo responseInfo = new ResponseInfo(customerMessage, responseCode);
        int i2 = ShareDataUIState + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return responseInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        Object obj = null;
        if (this == other) {
            int i2 = ShareDataUIState + 77;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof ResponseInfo)) {
            return false;
        }
        ResponseInfo responseInfo = (ResponseInfo) other;
        if (!Intrinsics.areEqual(this.customerMessage, responseInfo.customerMessage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.responseCode, responseInfo.responseCode)) {
            int i6 = ShareDataUIState + 47;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = ShareDataUIState + 59;
        component2 = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.customerMessage.hashCode() * 31) + this.responseCode.hashCode();
        int i4 = ShareDataUIState + 7;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResponseInfo(customerMessage=" + this.customerMessage + ", responseCode=" + this.responseCode + ")";
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
