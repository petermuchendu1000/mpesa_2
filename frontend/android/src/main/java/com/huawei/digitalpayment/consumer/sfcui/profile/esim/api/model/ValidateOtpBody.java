package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ValidateOtpBody;", "", "extraDetails", "", "validationCounter", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getExtraDetails", "()Ljava/lang/String;", "getValidationCounter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ValidateOtpBody;", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateOtpBody {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copy = 1;

    @SerializedName("validationCounter")
    private final Integer ShareDataUIState;

    @SerializedName("extraDetails")
    private final String copydefault;

    public ValidateOtpBody(String str, Integer num) {
        this.copydefault = str;
        this.ShareDataUIState = num;
    }

    public final String getExtraDetails() {
        int i = 2 % 2;
        int i2 = copy + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getValidationCounter() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.ShareDataUIState;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 35;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ValidateOtpBody copy$default(ValidateOtpBody validateOtpBody, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 19;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = validateOtpBody.copydefault;
        }
        if ((i & 2) != 0) {
            num = validateOtpBody.ShareDataUIState;
            int i6 = i4 + 85;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        return validateOtpBody.copy(str, num);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 73;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = copy + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ValidateOtpBody copy(String extraDetails, Integer validationCounter) {
        int i = 2 % 2;
        ValidateOtpBody validateOtpBody = new ValidateOtpBody(extraDetails, validationCounter);
        int i2 = component1 + 113;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return validateOtpBody;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 107;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i5 = i2 + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof ValidateOtpBody)) {
            int i7 = i4 + 61;
            copy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ValidateOtpBody validateOtpBody = (ValidateOtpBody) other;
        if (!Intrinsics.areEqual(this.copydefault, validateOtpBody.copydefault)) {
            int i9 = copy + 81;
            component1 = i9 % 128;
            return i9 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, validateOtpBody.ShareDataUIState)) {
            return true;
        }
        int i10 = component1 + 41;
        copy = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.ShareDataUIState;
        if (num == null) {
            int i4 = component1 + 55;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = num.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = component1 + 35;
        copy = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ValidateOtpBody(extraDetails=" + this.copydefault + ", validationCounter=" + this.ShareDataUIState + ")";
        int i2 = component1 + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
