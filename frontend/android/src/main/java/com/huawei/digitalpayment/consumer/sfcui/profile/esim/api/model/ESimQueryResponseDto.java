package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimQueryResponseDto;", "", "eSimQueryBody", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimQueryBody;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;)V", "getESimQueryBody", "()Ljava/util/List;", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/Header;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimQueryResponseDto {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;

    @SerializedName("header")
    private final Header component1;

    @SerializedName("body")
    private final List<ESimQueryBody> component3;

    public ESimQueryResponseDto(List<ESimQueryBody> list, Header header) {
        this.component3 = list;
        this.component1 = header;
    }

    public final List<ESimQueryBody> getESimQueryBody() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<ESimQueryBody> list = this.component3;
        int i5 = i2 + 103;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Header getHeader() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    static {
        int i = 1 + 7;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 52 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ESimQueryResponseDto copy$default(ESimQueryResponseDto eSimQueryResponseDto, List list, Header header, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 7;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            list = eSimQueryResponseDto.component3;
            int i5 = i4 + 79;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
        }
        if ((i & 2) != 0) {
            header = eSimQueryResponseDto.component1;
        }
        return eSimQueryResponseDto.copy(list, header);
    }

    public final List<ESimQueryBody> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        List<ESimQueryBody> list = this.component3;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return list;
    }

    public final Header component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Header header = this.component1;
        int i5 = i2 + 99;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return header;
        }
        throw null;
    }

    public final ESimQueryResponseDto copy(List<ESimQueryBody> eSimQueryBody, Header header) {
        int i = 2 % 2;
        ESimQueryResponseDto eSimQueryResponseDto = new ESimQueryResponseDto(eSimQueryBody, header);
        int i2 = getAsAtTimestamp + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return eSimQueryResponseDto;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESimQueryResponseDto)) {
            int i5 = i2 + 21;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ESimQueryResponseDto eSimQueryResponseDto = (ESimQueryResponseDto) other;
        if (!Intrinsics.areEqual(this.component3, eSimQueryResponseDto.component3) || !Intrinsics.areEqual(this.component1, eSimQueryResponseDto.component1)) {
            return false;
        }
        int i7 = getAsAtTimestamp + 15;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 54 / 0;
        }
        return true;
    }

    public int hashCode() {
        List<ESimQueryBody> list;
        int i = 2 % 2;
        int i2 = copydefault + 63;
        getAsAtTimestamp = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 != 0 ? (list = this.component3) != null : (list = this.component3) != null) ? list.hashCode() : 0;
        Header header = this.component1;
        if (header == null) {
            int i3 = copydefault + 57;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = header.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ESimQueryResponseDto(eSimQueryBody=" + this.component3 + ", header=" + this.component1 + ")";
        int i2 = getAsAtTimestamp + 5;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
