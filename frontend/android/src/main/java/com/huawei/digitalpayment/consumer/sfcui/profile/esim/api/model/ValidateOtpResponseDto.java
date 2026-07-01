package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0007H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ValidateOtpResponseDto;", "", "validateOtpBody", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ValidateOtpBody;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ValidateOtpBody;Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;Ljava/lang/String;)V", "getValidateOtpBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ValidateOtpBody;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateOtpResponseDto {
    public static final int $stable = 0;
    private static int component1 = 33 % 128;
    private static int component4 = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String ShareDataUIState;

    @SerializedName("body")
    private final ValidateOtpBody component2;

    @SerializedName("header")
    private final Header component3;

    public ValidateOtpResponseDto(ValidateOtpBody validateOtpBody, Header header, String str) {
        this.component2 = validateOtpBody;
        this.component3 = header;
        this.ShareDataUIState = str;
    }

    public final ValidateOtpBody getValidateOtpBody() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ValidateOtpBody validateOtpBody = this.component2;
        int i4 = i3 + 51;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return validateOtpBody;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 43;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.component3;
        int i5 = i2 + 75;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return header;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 5;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 21;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (33 % 2 == 0) {
            throw null;
        }
    }

    public static ValidateOtpResponseDto copy$default(ValidateOtpResponseDto validateOtpResponseDto, ValidateOtpBody validateOtpBody, Header header, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            validateOtpBody = validateOtpResponseDto.component2;
        }
        if ((i & 2) != 0) {
            int i3 = component4 + 25;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                header = validateOtpResponseDto.component3;
                int i4 = 84 / 0;
            } else {
                header = validateOtpResponseDto.component3;
            }
        }
        if ((i & 4) != 0) {
            str = validateOtpResponseDto.ShareDataUIState;
            int i5 = getRequestBeneficiariesState + 13;
            component4 = i5 % 128;
            int i6 = i5 % 2;
        }
        return validateOtpResponseDto.copy(validateOtpBody, header, str);
    }

    public final ValidateOtpBody component1() {
        int i = 2 % 2;
        int i2 = component4 + 29;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        ValidateOtpBody validateOtpBody = this.component2;
        int i5 = i3 + 101;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return validateOtpBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Header header = this.component3;
        int i5 = i3 + 31;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 57;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.ShareDataUIState;
            int i4 = 28 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 43;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return str;
    }

    public final ValidateOtpResponseDto copy(ValidateOtpBody validateOtpBody, Header header, String messageId) {
        int i = 2 % 2;
        ValidateOtpResponseDto validateOtpResponseDto = new ValidateOtpResponseDto(validateOtpBody, header, messageId);
        int i2 = component4 + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return validateOtpResponseDto;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 1;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateOtpResponseDto)) {
            int i5 = i2 + 77;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ValidateOtpResponseDto validateOtpResponseDto = (ValidateOtpResponseDto) other;
        if (Intrinsics.areEqual(this.component2, validateOtpResponseDto.component2)) {
            return Intrinsics.areEqual(this.component3, validateOtpResponseDto.component3) && Intrinsics.areEqual(this.ShareDataUIState, validateOtpResponseDto.ShareDataUIState);
        }
        int i7 = component4 + 27;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        ValidateOtpBody validateOtpBody = this.component2;
        int iHashCode2 = 0;
        int iHashCode3 = validateOtpBody == null ? 0 : validateOtpBody.hashCode();
        Header header = this.component3;
        if (header == null) {
            int i2 = getRequestBeneficiariesState + 79;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = header.hashCode();
        }
        String str = this.ShareDataUIState;
        if (str != null) {
            iHashCode2 = str.hashCode();
            int i4 = getRequestBeneficiariesState + 113;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ValidateOtpResponseDto(validateOtpBody=" + this.component2 + ", header=" + this.component3 + ", messageId=" + this.ShareDataUIState + ")";
        int i2 = component4 + 125;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
