package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ReserveOtpResponseDto;", "", "body", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ReserveOtpBody;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ReserveOtpBody;Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;)V", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ReserveOtpBody;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReserveOtpResponseDto {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copy = 1;
    private static int copydefault = 55 % 128;

    @SerializedName("body")
    private final ReserveOtpBody ShareDataUIState;

    @SerializedName("header")
    private final Header component3;

    public ReserveOtpResponseDto(ReserveOtpBody reserveOtpBody, Header header) {
        this.ShareDataUIState = reserveOtpBody;
        this.component3 = header;
    }

    public final ReserveOtpBody getBody() {
        ReserveOtpBody reserveOtpBody;
        int i = 2 % 2;
        int i2 = copy + 111;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            reserveOtpBody = this.ShareDataUIState;
            int i4 = 17 / 0;
        } else {
            reserveOtpBody = this.ShareDataUIState;
        }
        int i5 = i3 + 15;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return reserveOtpBody;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.component3;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return header;
        }
        throw null;
    }

    static {
        if (55 % 2 == 0) {
            throw null;
        }
    }

    public static ReserveOtpResponseDto copy$default(ReserveOtpResponseDto reserveOtpResponseDto, ReserveOtpBody reserveOtpBody, Header header, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 39;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            reserveOtpBody = reserveOtpResponseDto.ShareDataUIState;
            int i5 = i4 + 113;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            header = reserveOtpResponseDto.component3;
        }
        return reserveOtpResponseDto.copy(reserveOtpBody, header);
    }

    public final ReserveOtpBody component1() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Header header = this.component3;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return header;
    }

    public final ReserveOtpResponseDto copy(ReserveOtpBody body, Header header) {
        int i = 2 % 2;
        ReserveOtpResponseDto reserveOtpResponseDto = new ReserveOtpResponseDto(body, header);
        int i2 = component1 + 49;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return reserveOtpResponseDto;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ReserveOtpResponseDto)) {
            int i4 = component1 + 21;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        ReserveOtpResponseDto reserveOtpResponseDto = (ReserveOtpResponseDto) other;
        if (!(!Intrinsics.areEqual(this.ShareDataUIState, reserveOtpResponseDto.ShareDataUIState))) {
            return Intrinsics.areEqual(this.component3, reserveOtpResponseDto.component3);
        }
        int i5 = copy + 51;
        component1 = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        ReserveOtpBody reserveOtpBody;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        copy = i3;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            reserveOtpBody = this.ShareDataUIState;
            iHashCode = 1;
            if (reserveOtpBody != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = reserveOtpBody.hashCode();
            }
            int i4 = i3 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            reserveOtpBody = this.ShareDataUIState;
            if (reserveOtpBody == null) {
                iHashCode = 0;
                int i42 = i3 + 45;
                component1 = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode = iHashCode2;
            iHashCode2 = reserveOtpBody.hashCode();
        }
        Header header = this.component3;
        if (header != null) {
            iHashCode = header.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReserveOtpResponseDto(body=" + this.ShareDataUIState + ", header=" + this.component3 + ")";
        int i2 = component1 + 51;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
