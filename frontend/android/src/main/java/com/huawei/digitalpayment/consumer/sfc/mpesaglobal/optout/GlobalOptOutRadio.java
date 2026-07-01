package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optout;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.OptOutReason;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.safaricom.designsystem.components.radio.IRadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/optout/GlobalOptOutRadio;", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", "name", "", "displayName", "enabled", "", ImtConstants.KEY_REASON, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getEnabled", "()Z", "getReason", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalOptOutRadio implements IRadioButton {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final OptOutReason ShareDataUIState;
    private final String component1;
    private final boolean component3;
    private final String copydefault;

    public GlobalOptOutRadio(String str, String str2, boolean z, OptOutReason optOutReason) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(optOutReason, "");
        this.component1 = str;
        this.copydefault = str2;
        this.component3 = z;
        this.ShareDataUIState = optOutReason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GlobalOptOutRadio(String str, String str2, boolean z, OptOutReason optOutReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 1;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 123;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            z = true;
        }
        this(str, str2, z, optOutReason);
    }

    @Override
    public String getCopydefault() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 21;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 99;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public String getComponent2() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 21;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.copydefault;
            int i4 = 22 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 27;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public boolean getComponent3() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 99;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 103;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final OptOutReason getReason() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        OptOutReason optOutReason = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return optOutReason;
    }

    static {
        int i = 1 + 37;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static GlobalOptOutRadio copy$default(GlobalOptOutRadio globalOptOutRadio, String str, String str2, boolean z, OptOutReason optOutReason, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 107;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 31;
            copy = i5 % 128;
            int i6 = i5 % 2;
            str = globalOptOutRadio.component1;
            if (i6 != 0) {
                int i7 = 60 / 0;
            }
        }
        if ((i & 2) != 0) {
            int i8 = copy + 27;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            str2 = globalOptOutRadio.copydefault;
        }
        if ((i & 4) != 0) {
            z = globalOptOutRadio.component3;
        }
        if ((i & 8) != 0) {
            int i10 = copy + 103;
            getRequestBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            optOutReason = globalOptOutRadio.ShareDataUIState;
        }
        return globalOptOutRadio.copy(str, str2, z, optOutReason);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 73;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 85;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component3;
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        return z;
    }

    public final OptOutReason component4() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 67;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        OptOutReason optOutReason = this.ShareDataUIState;
        int i5 = i2 + 73;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return optOutReason;
    }

    public final GlobalOptOutRadio copy(String name, String displayName, boolean enabled, OptOutReason reason) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(displayName, "");
        Intrinsics.checkNotNullParameter(reason, "");
        GlobalOptOutRadio globalOptOutRadio = new GlobalOptOutRadio(name, displayName, enabled, reason);
        int i2 = copy + 67;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return globalOptOutRadio;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalOptOutRadio)) {
            return false;
        }
        GlobalOptOutRadio globalOptOutRadio = (GlobalOptOutRadio) other;
        if (!Intrinsics.areEqual(this.component1, globalOptOutRadio.component1) || !Intrinsics.areEqual(this.copydefault, globalOptOutRadio.copydefault) || this.component3 != globalOptOutRadio.component3) {
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, globalOptOutRadio.ShareDataUIState)) {
            return true;
        }
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 97;
        copy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 79;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        return i3 == 0 ? (((((iHashCode << 99) << this.copydefault.hashCode()) * 30) - Boolean.hashCode(this.component3)) >> 49) >> this.ShareDataUIState.hashCode() : (((((iHashCode * 31) + this.copydefault.hashCode()) * 31) + Boolean.hashCode(this.component3)) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GlobalOptOutRadio(name=" + this.component1 + ", displayName=" + this.copydefault + ", enabled=" + this.component3 + ", reason=" + this.ShareDataUIState + ')';
        int i2 = getRequestBeneficiariesState + 19;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
