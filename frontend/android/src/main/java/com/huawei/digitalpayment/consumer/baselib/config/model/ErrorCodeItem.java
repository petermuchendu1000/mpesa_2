package com.huawei.digitalpayment.consumer.baselib.config.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/ErrorCodeItem;", "", "targetErrorCode", "", "targetErrorDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTargetErrorCode", "()Ljava/lang/String;", "getTargetErrorDesc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorCodeItem {
    private static int component1 = 1;
    private static int copydefault;
    private final String ShareDataUIState;
    private final String component2;

    public ErrorCodeItem(String str, String str2) {
        this.ShareDataUIState = str;
        this.component2 = str2;
    }

    public final String getTargetErrorCode() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTargetErrorDesc() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static ErrorCodeItem copy$default(ErrorCodeItem errorCodeItem, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 7;
        copydefault = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = errorCodeItem.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = errorCodeItem.component2;
        }
        ErrorCodeItem errorCodeItemCopy = errorCodeItem.copy(str, str2);
        int i4 = copydefault + 5;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return errorCodeItemCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 115;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return str;
    }

    public final ErrorCodeItem copy(String targetErrorCode, String targetErrorDesc) {
        int i = 2 % 2;
        ErrorCodeItem errorCodeItem = new ErrorCodeItem(targetErrorCode, targetErrorDesc);
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return errorCodeItem;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorCodeItem)) {
            int i2 = copydefault + 23;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return false;
        }
        ErrorCodeItem errorCodeItem = (ErrorCodeItem) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, errorCodeItem.ShareDataUIState)) {
            int i4 = component1 + 37;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.component2, errorCodeItem.component2)) {
            return true;
        }
        int i5 = component1 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.component2;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = copydefault + 63;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ErrorCodeItem(targetErrorCode=" + this.ShareDataUIState + ", targetErrorDesc=" + this.component2 + ")";
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
