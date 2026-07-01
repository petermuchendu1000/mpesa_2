package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaNaMpesaUiState;", "", KeysConstants.SHORT_CODE, "", "amount", "amountErrorMessage", "isCheckTransactionCostEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getShortCode", "()Ljava/lang/String;", "getAmount", "getAmountErrorMessage", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LipaNaMpesaUiState {
    public static final int $stable = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;

    public LipaNaMpesaUiState(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component2 = str3;
        this.component1 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LipaNaMpesaUiState(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        Object obj = null;
        if ((i & 2) != 0) {
            int i3 = getAsAtTimestamp + 119;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = equals + 103;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            str3 = null;
        }
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final String getAmount() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 105;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component3;
            int i4 = 91 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 57;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmountErrorMessage() {
        int i = 2 % 2;
        int i2 = equals + 53;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final boolean isCheckTransactionCostEnabled() {
        int i = 2 % 2;
        int i2 = equals + 47;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    static {
        int i = 1 + 57;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public LipaNaMpesaUiState() {
        this(null, null, null, false, 15, null);
    }

    public static LipaNaMpesaUiState copy$default(LipaNaMpesaUiState lipaNaMpesaUiState, String str, String str2, String str3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 69;
            equals = i3 % 128;
            int i4 = i3 % 2;
            str = lipaNaMpesaUiState.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = lipaNaMpesaUiState.component3;
            int i5 = getAsAtTimestamp + 31;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            }
        }
        if ((i & 4) != 0) {
            str3 = lipaNaMpesaUiState.component2;
        }
        if ((i & 8) != 0) {
            int i7 = equals + 65;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            z = lipaNaMpesaUiState.component1;
        }
        return lipaNaMpesaUiState.copy(str, str2, str3, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 59;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 65;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 75;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 75;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 69;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = equals + 41;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 23;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return z;
    }

    public final LipaNaMpesaUiState copy(String shortCode, String amount, String amountErrorMessage, boolean isCheckTransactionCostEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shortCode, "");
        Intrinsics.checkNotNullParameter(amount, "");
        LipaNaMpesaUiState lipaNaMpesaUiState = new LipaNaMpesaUiState(shortCode, amount, amountErrorMessage, isCheckTransactionCostEnabled);
        int i2 = equals + 45;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return lipaNaMpesaUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp + 57;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LipaNaMpesaUiState)) {
            return false;
        }
        LipaNaMpesaUiState lipaNaMpesaUiState = (LipaNaMpesaUiState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, lipaNaMpesaUiState.ShareDataUIState) || !Intrinsics.areEqual(this.component3, lipaNaMpesaUiState.component3) || !Intrinsics.areEqual(this.component2, lipaNaMpesaUiState.component2)) {
            return false;
        }
        if (this.component1 != lipaNaMpesaUiState.component1) {
            int i4 = equals + 69;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = getAsAtTimestamp + 45;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.ShareDataUIState.hashCode();
        int iHashCode3 = this.component3.hashCode();
        String str = this.component2;
        if (str == null) {
            int i2 = getAsAtTimestamp + 73;
            equals = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + Boolean.hashCode(this.component1);
        int i4 = getAsAtTimestamp + 87;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LipaNaMpesaUiState(shortCode=" + this.ShareDataUIState + ", amount=" + this.component3 + ", amountErrorMessage=" + this.component2 + ", isCheckTransactionCostEnabled=" + this.component1 + ")";
        int i2 = getAsAtTimestamp + 75;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return str;
    }
}
