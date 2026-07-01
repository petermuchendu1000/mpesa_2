package com.huawei.digitalpayment.consumer.fixeddata.presentation.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0006H×\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FulizaPromptData;", "", "useODAmount", "", "accessFee", "channelSessionId", "", "isRenewal", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Z)V", "getUseODAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAccessFee", "getChannelSessionId", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Z)Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FulizaPromptData;", "equals", "other", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaPromptData {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static int getRequestBeneficiariesState;
    private final boolean ShareDataUIState;
    private final String component2;
    private final Double component3;
    private final Double copydefault;

    public FulizaPromptData(Double d2, Double d3, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = d2;
        this.copydefault = d3;
        this.component2 = str;
        this.ShareDataUIState = z;
    }

    public final Double getUseODAmount() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 109;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Double d2 = this.component3;
        int i4 = i2 + 37;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return d2;
        }
        obj.hashCode();
        throw null;
    }

    public final Double getAccessFee() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Double d2 = this.copydefault;
        int i5 = i3 + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = copy + 41;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 85;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean isRenewal() {
        int i = 2 % 2;
        int i2 = copy + 13;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 87;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = 1 + 43;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FulizaPromptData copy$default(FulizaPromptData fulizaPromptData, Double d2, Double d3, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 29;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                Double d4 = fulizaPromptData.component3;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            d2 = fulizaPromptData.component3;
        }
        if ((i & 2) != 0) {
            d3 = fulizaPromptData.copydefault;
        }
        if ((i & 4) != 0) {
            str = fulizaPromptData.component2;
            int i4 = copy + 111;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i & 8) != 0) {
            z = fulizaPromptData.ShareDataUIState;
        }
        return fulizaPromptData.copy(d2, d3, str, z);
    }

    public final Double component1() {
        Double d2;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            d2 = this.component3;
            int i4 = 98 / 0;
        } else {
            d2 = this.component3;
        }
        int i5 = i3 + 45;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return d2;
    }

    public final Double component2() {
        int i = 2 % 2;
        int i2 = copy + 27;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Double d2 = this.copydefault;
        int i5 = i3 + 23;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 95;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 117;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 107;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final FulizaPromptData copy(Double useODAmount, Double accessFee, String channelSessionId, boolean isRenewal) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        FulizaPromptData fulizaPromptData = new FulizaPromptData(useODAmount, accessFee, channelSessionId, isRenewal);
        int i2 = getRequestBeneficiariesState + 123;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return fulizaPromptData;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy + 35;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 103;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof FulizaPromptData)) {
            int i6 = i3 + 57;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        FulizaPromptData fulizaPromptData = (FulizaPromptData) other;
        if (!Intrinsics.areEqual((Object) this.component3, (Object) fulizaPromptData.component3)) {
            int i8 = copy + 23;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual((Object) this.copydefault, (Object) fulizaPromptData.copydefault)) {
            return Intrinsics.areEqual(this.component2, fulizaPromptData.component2) && this.ShareDataUIState == fulizaPromptData.ShareDataUIState;
        }
        int i10 = getRequestBeneficiariesState + 125;
        copy = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.component3;
        int iHashCode = 0;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.copydefault;
        if (d3 == null) {
            int i4 = copy + 9;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        } else {
            iHashCode = d3.hashCode();
        }
        int iHashCode3 = (((((iHashCode2 * 31) + iHashCode) * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i6 = copy + 35;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FulizaPromptData(useODAmount=" + this.component3 + ", accessFee=" + this.copydefault + ", channelSessionId=" + this.component2 + ", isRenewal=" + this.ShareDataUIState + ")";
        int i2 = copy + 7;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
