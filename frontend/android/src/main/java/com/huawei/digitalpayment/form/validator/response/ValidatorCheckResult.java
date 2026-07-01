package com.huawei.digitalpayment.form.validator.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/form/validator/response/ValidatorCheckResult;", "", "isValid", "", "errorMessage", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "FormValidator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatorCheckResult {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final boolean ShareDataUIState;
    private final String component3;

    public ValidatorCheckResult(boolean z, String str) {
        this.ShareDataUIState = z;
        this.component3 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ValidatorCheckResult(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault;
            int i3 = i2 + 27;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = true;
        }
        if ((i & 2) != 0) {
            int i8 = component2 + 35;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str = "";
        }
        this(z, str);
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 115;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ValidatorCheckResult() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static ValidatorCheckResult copy$default(ValidatorCheckResult validatorCheckResult, boolean z, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 83;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                z = validatorCheckResult.ShareDataUIState;
                int i4 = 54 / 0;
            } else {
                z = validatorCheckResult.ShareDataUIState;
            }
        }
        if ((i & 2) != 0) {
            str = validatorCheckResult.component3;
        }
        ValidatorCheckResult validatorCheckResultCopy = validatorCheckResult.copy(z, str);
        int i5 = component2 + 73;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return validatorCheckResultCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ValidatorCheckResult copy(boolean isValid, String errorMessage) {
        int i = 2 % 2;
        ValidatorCheckResult validatorCheckResult = new ValidatorCheckResult(isValid, errorMessage);
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return validatorCheckResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ValidatorCheckResult)) {
            int i4 = copydefault + 77;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        ValidatorCheckResult validatorCheckResult = (ValidatorCheckResult) other;
        if (this.ShareDataUIState != validatorCheckResult.ShareDataUIState) {
            int i5 = copydefault + 73;
            component2 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.component3, validatorCheckResult.component3)) {
            return true;
        }
        int i6 = copydefault + 75;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        String str = this.component3;
        if (str == null) {
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = (iHashCode2 * 31) + iHashCode;
        int i5 = copydefault + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ValidatorCheckResult(isValid=" + this.ShareDataUIState + ", errorMessage=" + this.component3 + ")";
        int i2 = component2 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return str;
    }
}
