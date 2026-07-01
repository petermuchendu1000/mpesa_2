package com.huawei.digitalpayment.consumer.sfcui.utils;

import com.safaricom.designsystem.components.radio.IRadioButton;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "Lcom/safaricom/designsystem/components/radio/IRadioButton;", "", "buttonName", "", "displayName", "enabled", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getButtonName", "()Ljava/lang/String;", "getDisplayName", "getEnabled", "()Z", "MPESA_PIN", "SERVICE_PIN", "UNDEFINED", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PinValidationType implements IRadioButton {
    private static final EnumEntries $ENTRIES;
    private static final PinValidationType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String buttonName;
    private final String displayName;
    private final boolean enabled;
    public static final PinValidationType MPESA_PIN = new PinValidationType("MPESA_PIN", 0, "MPESA_PIN", "M-PESA PIN", true);
    public static final PinValidationType SERVICE_PIN = new PinValidationType("SERVICE_PIN", 1, "SERVICE_PIN", "Service PIN", true);
    public static final PinValidationType UNDEFINED = new PinValidationType("UNDEFINED", 2, "UNDEFINED", "Undefined", false);

    private PinValidationType(String str, int i, String str2, String str3, boolean z) {
        this.buttonName = str2;
        this.displayName = str3;
        this.enabled = z;
    }

    @Override
    public String getCopydefault() {
        String strName;
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            strName = name();
            int i3 = 81 / 0;
        } else {
            strName = name();
        }
        int i4 = component1 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return strName;
    }

    public final String getButtonName() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.buttonName;
            int i4 = 60 / 0;
        } else {
            str = this.buttonName;
        }
        int i5 = i3 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getComponent2() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.displayName;
            int i4 = 3 / 0;
        } else {
            str = this.displayName;
        }
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public boolean getComponent3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.enabled;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return z;
    }

    static {
        PinValidationType[] pinValidationTypeArr$values = $values();
        $VALUES = pinValidationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pinValidationTypeArr$values);
        int i = component2 + 33;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static PinValidationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        PinValidationType pinValidationType = (PinValidationType) Enum.valueOf(PinValidationType.class, str);
        int i3 = ShareDataUIState + 7;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return pinValidationType;
    }

    public static PinValidationType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PinValidationType[] pinValidationTypeArr = (PinValidationType[]) $VALUES.clone();
        int i4 = ShareDataUIState + 105;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return pinValidationTypeArr;
        }
        throw null;
    }

    private static final PinValidationType[] $values() {
        PinValidationType[] pinValidationTypeArr;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            PinValidationType pinValidationType = MPESA_PIN;
            PinValidationType pinValidationType2 = SERVICE_PIN;
            PinValidationType pinValidationType3 = UNDEFINED;
            pinValidationTypeArr = new PinValidationType[3];
            pinValidationTypeArr[0] = pinValidationType;
            pinValidationTypeArr[0] = pinValidationType2;
            pinValidationTypeArr[2] = pinValidationType3;
        } else {
            pinValidationTypeArr = new PinValidationType[]{MPESA_PIN, SERVICE_PIN, UNDEFINED};
        }
        int i4 = i2 + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return pinValidationTypeArr;
    }

    public static EnumEntries<PinValidationType> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<PinValidationType> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return enumEntries;
    }
}
