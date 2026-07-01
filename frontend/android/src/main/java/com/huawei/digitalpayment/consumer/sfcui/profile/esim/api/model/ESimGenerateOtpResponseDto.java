package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimGenerateOtpResponseDto;", "", "body", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "<init>", "(Ljava/lang/Object;Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;)V", "getBody", "()Ljava/lang/Object;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimGenerateOtpResponseDto {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int getRequestBeneficiariesState = 1;

    @SerializedName("body")
    private final Object component1;

    @SerializedName("header")
    private final Header copydefault;

    public ESimGenerateOtpResponseDto(Object obj, Header header) {
        this.component1 = obj;
        this.copydefault = header;
    }

    public final Object getBody() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.component1;
        int i4 = i2 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return obj2;
        }
        throw null;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.copydefault;
        int i5 = i2 + 71;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    static {
        int i = 1 + 9;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    public static ESimGenerateOtpResponseDto copy$default(ESimGenerateOtpResponseDto eSimGenerateOtpResponseDto, Object obj, Header header, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            obj = eSimGenerateOtpResponseDto.component1;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 73;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            header = eSimGenerateOtpResponseDto.copydefault;
        }
        ESimGenerateOtpResponseDto eSimGenerateOtpResponseDtoCopy = eSimGenerateOtpResponseDto.copy(obj, header);
        int i5 = getRequestBeneficiariesState + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return eSimGenerateOtpResponseDtoCopy;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public final Object component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.component1;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Header header = this.copydefault;
        int i5 = i3 + 35;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return header;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ESimGenerateOtpResponseDto copy(Object body, Header header) {
        int i = 2 % 2;
        ESimGenerateOtpResponseDto eSimGenerateOtpResponseDto = new ESimGenerateOtpResponseDto(body, header);
        int i2 = ShareDataUIState + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return eSimGenerateOtpResponseDto;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getRequestBeneficiariesState + 81;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof ESimGenerateOtpResponseDto)) {
            return false;
        }
        ESimGenerateOtpResponseDto eSimGenerateOtpResponseDto = (ESimGenerateOtpResponseDto) other;
        if (!Intrinsics.areEqual(this.component1, eSimGenerateOtpResponseDto.component1)) {
            int i3 = getRequestBeneficiariesState + 33;
            ShareDataUIState = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.copydefault, eSimGenerateOtpResponseDto.copydefault)) {
            return true;
        }
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 19;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Object obj = this.component1;
        if (obj == null) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 95;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 43;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            int i7 = getRequestBeneficiariesState + 13;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        Header header = this.copydefault;
        return (iHashCode * 31) + (header != null ? header.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ESimGenerateOtpResponseDto(body=" + this.component1 + ", header=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 95;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 49 / 0;
        }
        return str;
    }
}
