package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import com.safaricom.designsystem.components.radio.IRadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionTypeRadioButton;", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", "name", "", "displayName", "enabled", "", "conversionTypeLabelRes", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getEnabled", "()Z", "getConversionTypeLabelRes", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaConversionTypeRadioButton implements IRadioButton {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int equals = 73 % 128;
    private static int getRequestBeneficiariesState;
    private final BongaConversionType ShareDataUIState;
    private final String component1;
    private final boolean component3;
    private final String copydefault;

    public BongaConversionTypeRadioButton(String str, String str2, boolean z, BongaConversionType bongaConversionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bongaConversionType, "");
        this.copydefault = str;
        this.component1 = str2;
        this.component3 = z;
        this.ShareDataUIState = bongaConversionType;
    }

    @Override
    public String getCopydefault() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 83;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 115;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getComponent2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean getComponent3() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 25;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final BongaConversionType getConversionTypeLabelRes() {
        int i = 2 % 2;
        int i2 = component4 + 41;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        BongaConversionType bongaConversionType = this.ShareDataUIState;
        int i5 = i3 + 1;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return bongaConversionType;
    }

    static {
        int i = 73 % 2;
    }

    public static BongaConversionTypeRadioButton copy$default(BongaConversionTypeRadioButton bongaConversionTypeRadioButton, String str, String str2, boolean z, BongaConversionType bongaConversionType, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 67;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = bongaConversionTypeRadioButton.copydefault;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 5;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            str2 = bongaConversionTypeRadioButton.component1;
            if (i7 == 0) {
                int i8 = 31 / 0;
            }
        }
        if ((i & 4) != 0) {
            z = bongaConversionTypeRadioButton.component3;
        }
        if ((i & 8) != 0) {
            bongaConversionType = bongaConversionTypeRadioButton.ShareDataUIState;
        }
        return bongaConversionTypeRadioButton.copy(str, str2, z, bongaConversionType);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component4 + 93;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 54 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 97;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 21;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 71;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 125;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 29;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BongaConversionType component4() {
        int i = 2 % 2;
        int i2 = component4 + 109;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final BongaConversionTypeRadioButton copy(String name, String displayName, boolean enabled, BongaConversionType conversionTypeLabelRes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(displayName, "");
        Intrinsics.checkNotNullParameter(conversionTypeLabelRes, "");
        BongaConversionTypeRadioButton bongaConversionTypeRadioButton = new BongaConversionTypeRadioButton(name, displayName, enabled, conversionTypeLabelRes);
        int i2 = component4 + 19;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return bongaConversionTypeRadioButton;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 21;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaConversionTypeRadioButton)) {
            int i5 = i2 + 83;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        BongaConversionTypeRadioButton bongaConversionTypeRadioButton = (BongaConversionTypeRadioButton) other;
        if (!Intrinsics.areEqual(this.copydefault, bongaConversionTypeRadioButton.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, bongaConversionTypeRadioButton.component1)) {
            int i7 = getRequestBeneficiariesState + 65;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.component3 != bongaConversionTypeRadioButton.component3) {
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, bongaConversionTypeRadioButton.ShareDataUIState)) {
            return true;
        }
        int i9 = getRequestBeneficiariesState + 1;
        component4 = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 79;
        getRequestBeneficiariesState = i2 % 128;
        int iHashCode = (i2 % 2 != 0 ? ((((this.copydefault.hashCode() << 67) << this.component1.hashCode()) + 117) * Boolean.hashCode(this.component3)) + 103 : ((((this.copydefault.hashCode() * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.component3)) * 31) + this.ShareDataUIState.hashCode();
        int i3 = component4 + 37;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaConversionTypeRadioButton(name=" + this.copydefault + ", displayName=" + this.component1 + ", enabled=" + this.component3 + ", conversionTypeLabelRes=" + this.ShareDataUIState + ")";
        int i2 = getRequestBeneficiariesState + 47;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return str;
    }
}
