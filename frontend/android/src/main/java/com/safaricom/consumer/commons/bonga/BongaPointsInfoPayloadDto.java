package com.safaricom.consumer.commons.bonga;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import com.safaricom.consumer.commons.remote.BaseResponseDTO;
import com.safaricom.consumer.commons.remote.GlobalResponseDTO;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto;", "Lcom/safaricom/consumer/commons/remote/GlobalResponseDTO;", "bongaPointsInfoResponse", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoResponse;", "<init>", "(Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoResponse;)V", "getBongaPointsInfoResponse", "()Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BongaPointsInfoResponse", "BongaPointsInfoDto", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaPointsInfoPayloadDto extends GlobalResponseDTO {

    @SerializedName("lipaNaBongaInfoResponse")
    private final BongaPointsInfoResponse ShareDataUIState;

    public final BongaPointsInfoResponse getBongaPointsInfoResponse() {
        return this.ShareDataUIState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BongaPointsInfoPayloadDto(BongaPointsInfoResponse bongaPointsInfoResponse) {
        super(null, null, null, null, null, null, null, 127, null);
        Intrinsics.checkNotNullParameter(bongaPointsInfoResponse, "");
        this.ShareDataUIState = bongaPointsInfoResponse;
    }

    public static BongaPointsInfoPayloadDto copy$default(BongaPointsInfoPayloadDto bongaPointsInfoPayloadDto, BongaPointsInfoResponse bongaPointsInfoResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            bongaPointsInfoResponse = bongaPointsInfoPayloadDto.ShareDataUIState;
        }
        return bongaPointsInfoPayloadDto.copy(bongaPointsInfoResponse);
    }

    public final BongaPointsInfoResponse getShareDataUIState() {
        return this.ShareDataUIState;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoResponse;", "Lcom/safaricom/consumer/commons/remote/BaseResponseDTO;", "data", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoDto;", "<init>", "(Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoDto;)V", "getData", "()Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaPointsInfoResponse extends BaseResponseDTO {

        @SerializedName("data")
        private final BongaPointsInfoDto copydefault;

        public final BongaPointsInfoDto getData() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BongaPointsInfoResponse(BongaPointsInfoDto bongaPointsInfoDto) {
            super(null, null, null, null, 15, null);
            Intrinsics.checkNotNullParameter(bongaPointsInfoDto, "");
            this.copydefault = bongaPointsInfoDto;
        }

        public static BongaPointsInfoResponse copy$default(BongaPointsInfoResponse bongaPointsInfoResponse, BongaPointsInfoDto bongaPointsInfoDto, int i, Object obj) {
            if ((i & 1) != 0) {
                bongaPointsInfoDto = bongaPointsInfoResponse.copydefault;
            }
            return bongaPointsInfoResponse.copy(bongaPointsInfoDto);
        }

        public final BongaPointsInfoDto getCopydefault() {
            return this.copydefault;
        }

        public final BongaPointsInfoResponse copy(BongaPointsInfoDto data) {
            Intrinsics.checkNotNullParameter(data, "");
            return new BongaPointsInfoResponse(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BongaPointsInfoResponse) && Intrinsics.areEqual(this.copydefault, ((BongaPointsInfoResponse) other).copydefault);
        }

        public int hashCode() {
            return this.copydefault.hashCode();
        }

        @Override
        public String toString() {
            return "BongaPointsInfoResponse(data=" + this.copydefault + ')';
        }
    }

    public final BongaPointsInfoPayloadDto copy(BongaPointsInfoResponse bongaPointsInfoResponse) {
        Intrinsics.checkNotNullParameter(bongaPointsInfoResponse, "");
        return new BongaPointsInfoPayloadDto(bongaPointsInfoResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BongaPointsInfoPayloadDto) && Intrinsics.areEqual(this.ShareDataUIState, ((BongaPointsInfoPayloadDto) other).ShareDataUIState);
    }

    public int hashCode() {
        return this.ShareDataUIState.hashCode();
    }

    @Override
    public String toString() {
        return "BongaPointsInfoPayloadDto(bongaPointsInfoResponse=" + this.ShareDataUIState + ')';
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoDto;", "", "status", "", "equivalentAmount", "Ljava/math/BigDecimal;", PESActivity.EXTRA_BONGA_POINTS, "", "conversionRate", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;JD)V", "getStatus", "()Ljava/lang/String;", "getEquivalentAmount", "()Ljava/math/BigDecimal;", "getBongaPoints", "()J", "getConversionRate", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaPointsInfoDto {

        @SerializedName("conversionRate")
        private final double component1;

        @SerializedName(PESActivity.EXTRA_BONGA_POINTS)
        private final long component2;

        @SerializedName("status")
        private final String component3;

        @SerializedName("equivalentAmount")
        private final BigDecimal copydefault;

        public BongaPointsInfoDto(String str, BigDecimal bigDecimal, long j, double d2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.component3 = str;
            this.copydefault = bigDecimal;
            this.component2 = j;
            this.component1 = d2;
        }

        public BongaPointsInfoDto(String str, BigDecimal bigDecimal, long j, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0.0d : d2);
        }

        public final String getStatus() {
            return this.component3;
        }

        public final BigDecimal getEquivalentAmount() {
            return this.copydefault;
        }

        public final long getBongaPoints() {
            return this.component2;
        }

        public final double getConversionRate() {
            return this.component1;
        }

        public BongaPointsInfoDto() {
            this(null, null, 0L, 0.0d, 15, null);
        }

        public static BongaPointsInfoDto copy$default(BongaPointsInfoDto bongaPointsInfoDto, String str, BigDecimal bigDecimal, long j, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bongaPointsInfoDto.component3;
            }
            if ((i & 2) != 0) {
                bigDecimal = bongaPointsInfoDto.copydefault;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            if ((i & 4) != 0) {
                j = bongaPointsInfoDto.component2;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                d2 = bongaPointsInfoDto.component1;
            }
            return bongaPointsInfoDto.copy(str, bigDecimal2, j2, d2);
        }

        public final String getComponent3() {
            return this.component3;
        }

        public final BigDecimal getCopydefault() {
            return this.copydefault;
        }

        public final long getComponent2() {
            return this.component2;
        }

        public final double getComponent1() {
            return this.component1;
        }

        public final BongaPointsInfoDto copy(String status, BigDecimal equivalentAmount, long bongaPoints, double conversionRate) {
            Intrinsics.checkNotNullParameter(status, "");
            Intrinsics.checkNotNullParameter(equivalentAmount, "");
            return new BongaPointsInfoDto(status, equivalentAmount, bongaPoints, conversionRate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BongaPointsInfoDto)) {
                return false;
            }
            BongaPointsInfoDto bongaPointsInfoDto = (BongaPointsInfoDto) other;
            return Intrinsics.areEqual(this.component3, bongaPointsInfoDto.component3) && Intrinsics.areEqual(this.copydefault, bongaPointsInfoDto.copydefault) && this.component2 == bongaPointsInfoDto.component2 && Double.compare(this.component1, bongaPointsInfoDto.component1) == 0;
        }

        public int hashCode() {
            return (((((this.component3.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Long.hashCode(this.component2)) * 31) + Double.hashCode(this.component1);
        }

        public String toString() {
            return "BongaPointsInfoDto(status=" + this.component3 + ", equivalentAmount=" + this.copydefault + ", bongaPoints=" + this.component2 + ", conversionRate=" + this.component1 + ')';
        }
    }
}
