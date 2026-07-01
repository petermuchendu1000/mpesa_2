package com.huawei.digitalpayment.consumer.sfcui.bonga.transfer;

import com.safaricom.designsystem.components.radio.IRadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/transfer/ValidatePinType;", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", "name", "", "displayName", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getDisplayName", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidatePinType implements IRadioButton {
    public static final int $stable = 0;
    private static int component3 = 119 % 128;
    private static int component4 = 0;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private final boolean ShareDataUIState;
    private final String component1;
    private final String component2;

    public ValidatePinType(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.component2 = str2;
        this.ShareDataUIState = z;
    }

    @Override
    public String getName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 37;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 33;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getDisplayName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 39;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public boolean getEnabled() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 53;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 71;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = 119 % 2;
    }

    public static ValidatePinType copy$default(ValidatePinType validatePinType, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 55;
        int i4 = i3 % 128;
        component4 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = validatePinType.component1;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 53;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            str2 = validatePinType.component2;
            int i7 = i4 + 9;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 4) != 0) {
            z = validatePinType.ShareDataUIState;
            int i9 = i4 + 47;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
        }
        return validatePinType.copy(str, str2, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 105;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ValidatePinType copy(String name, String displayName, boolean enabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(displayName, "");
        ValidatePinType validatePinType = new ValidatePinType(name, displayName, enabled);
        int i2 = getAsAtTimestamp + 75;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
        return validatePinType;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4 + 103;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidatePinType)) {
            int i5 = i3 + 11;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 109;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ValidatePinType validatePinType = (ValidatePinType) other;
        if (!Intrinsics.areEqual(this.component1, validatePinType.component1) || !Intrinsics.areEqual(this.component2, validatePinType.component2)) {
            return false;
        }
        if (this.ShareDataUIState == validatePinType.ShareDataUIState) {
            return true;
        }
        int i9 = getAsAtTimestamp + 53;
        component4 = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component1.hashCode() * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i4 = component4 + 23;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ValidatePinType(name=" + this.component1 + ", displayName=" + this.component2 + ", enabled=" + this.ShareDataUIState + ")";
        int i2 = getAsAtTimestamp + 1;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
