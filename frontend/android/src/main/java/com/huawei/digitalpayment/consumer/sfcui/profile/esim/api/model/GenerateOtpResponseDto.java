package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/GenerateOtpResponseDto;", "", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", AppLogInterceptor.MESSAGE_ID, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;Ljava/lang/String;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "getMessageId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenerateOtpResponseDto {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 85 % 128;
    private static int copy = 1;
    private static int copydefault;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private final String ShareDataUIState;

    @SerializedName("header")
    private final Header component2;

    public GenerateOtpResponseDto(Header header, String str) {
        this.component2 = header;
        this.ShareDataUIState = str;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = copy + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Header header = this.component2;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return header;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = copy + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    static {
        if (85 % 2 == 0) {
            throw null;
        }
    }

    public static GenerateOtpResponseDto copy$default(GenerateOtpResponseDto generateOtpResponseDto, Header header, String str, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = copy + 25;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Header header2 = generateOtpResponseDto.component2;
                obj2.hashCode();
                throw null;
            }
            header = generateOtpResponseDto.component2;
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 69;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                String str2 = generateOtpResponseDto.ShareDataUIState;
                throw null;
            }
            str = generateOtpResponseDto.ShareDataUIState;
        }
        GenerateOtpResponseDto generateOtpResponseDtoCopy = generateOtpResponseDto.copy(header, str);
        int i5 = copy + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return generateOtpResponseDtoCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final Header component1() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Header header = this.component2;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return header;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 37;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GenerateOtpResponseDto copy(Header header, String messageId) {
        int i = 2 % 2;
        GenerateOtpResponseDto generateOtpResponseDto = new GenerateOtpResponseDto(header, messageId);
        int i2 = copydefault + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return generateOtpResponseDto;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateOtpResponseDto)) {
            int i2 = copy + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GenerateOtpResponseDto generateOtpResponseDto = (GenerateOtpResponseDto) other;
        if (!Intrinsics.areEqual(this.component2, generateOtpResponseDto.component2)) {
            int i4 = copydefault + 19;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, generateOtpResponseDto.ShareDataUIState)) {
            return true;
        }
        int i6 = copy + 91;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.component2;
        if (header == null) {
            int i5 = i2 + 97;
            copy = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = header.hashCode();
        }
        String str = this.ShareDataUIState;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GenerateOtpResponseDto(header=" + this.component2 + ", messageId=" + this.ShareDataUIState + ")";
        int i2 = copy + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
