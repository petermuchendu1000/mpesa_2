package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model.SpeedTestMode;
import java.math.BigDecimal;

public class SpeedTestReport {
    private static int component4 = 0;
    private static int getShareableDataState = 1;
    private final long ShareDataUIState;
    private final int component1;
    private final float component2;
    private final SpeedTestMode component3;
    private final BigDecimal copy;
    private final long copydefault;
    private final long equals;
    private final long getAsAtTimestamp;
    private final BigDecimal getRequestBeneficiariesState;

    public SpeedTestReport(SpeedTestMode speedTestMode, float f, long j, long j2, long j3, long j4, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        this.component3 = speedTestMode;
        this.component2 = f;
        this.ShareDataUIState = j;
        this.copydefault = j2;
        this.getAsAtTimestamp = j3;
        this.equals = j4;
        this.copy = bigDecimal;
        this.getRequestBeneficiariesState = bigDecimal2;
        this.component1 = i;
    }

    public long getTemporaryPacketSize() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 31;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.getAsAtTimestamp;
        int i4 = i3 + 1;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return j;
    }

    public long getTotalPacketSize() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 83;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        throw null;
    }

    public BigDecimal getTransferRateOctet() {
        int i = 2 % 2;
        int i2 = component4 + 91;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        BigDecimal bigDecimal = this.copy;
        int i5 = i3 + 87;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return bigDecimal;
    }

    public BigDecimal getTransferRateBit() {
        int i = 2 % 2;
        int i2 = component4 + 81;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getStartTime() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public long getReportTime() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        long j = this.copydefault;
        int i5 = i2 + 113;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public SpeedTestMode getSpeedTestMode() {
        SpeedTestMode speedTestMode;
        int i = 2 % 2;
        int i2 = getShareableDataState + 51;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            speedTestMode = this.component3;
            int i4 = 58 / 0;
        } else {
            speedTestMode = this.component3;
        }
        int i5 = i3 + 97;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return speedTestMode;
    }

    public float getProgressPercent() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 37;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        float f = this.component2;
        int i5 = i3 + 47;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public int getRequestNum() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 93;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 65;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
