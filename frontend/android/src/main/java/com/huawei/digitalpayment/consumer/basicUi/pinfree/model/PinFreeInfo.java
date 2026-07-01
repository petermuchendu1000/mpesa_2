package com.huawei.digitalpayment.consumer.basicUi.pinfree.model;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/pinfree/model/PinFreeInfo;", "Lcom/huawei/http/BaseResp;", "enableFreePin", "", "freePinAmount", "", "maxFreePinAmount", "maxFreePinAmountDisplay", "freePinAmountDisplay", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnableFreePin", "()Z", "getFreePinAmount", "()Ljava/lang/String;", "getMaxFreePinAmount", "getMaxFreePinAmountDisplay", "getFreePinAmountDisplay", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PinFreeInfo extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private final boolean enableFreePin;
    private final String freePinAmount;
    private final String freePinAmountDisplay;
    private final String maxFreePinAmount;
    private final String maxFreePinAmountDisplay;

    /* JADX WARN: Illegal instructions before constructor call */
    public PinFreeInfo(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        if ((i & 1) != 0) {
            int i2 = component3 + 17;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        String str8 = "";
        if ((i & 2) != 0) {
            int i4 = copydefault + 31;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 4) != 0) {
            int i6 = component3 + 49;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            int i7 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 8) != 0) {
            int i8 = component3 + 115;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 89 / 0;
            }
            int i10 = 2 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 16) != 0) {
            int i11 = component3 + 57;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 30 / 0;
            }
        } else {
            str8 = str4;
        }
        this(z, str5, str6, str7, str8);
    }

    public final boolean getEnableFreePin() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.enableFreePin;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return z;
    }

    public final String getFreePinAmount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.freePinAmount;
        int i4 = i2 + 29;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getMaxFreePinAmount() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.maxFreePinAmount;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final String getMaxFreePinAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxFreePinAmountDisplay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFreePinAmountDisplay() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.freePinAmountDisplay;
            int i4 = 97 / 0;
        } else {
            str = this.freePinAmountDisplay;
        }
        int i5 = i2 + 99;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public PinFreeInfo(boolean z, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.enableFreePin = z;
        this.freePinAmount = str;
        this.maxFreePinAmount = str2;
        this.maxFreePinAmountDisplay = str3;
        this.freePinAmountDisplay = str4;
    }

    public PinFreeInfo() {
        this(false, null, null, null, null, 31, null);
    }

    public static PinFreeInfo copy$default(PinFreeInfo pinFreeInfo, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            z = pinFreeInfo.enableFreePin;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            int i6 = i3 + 27;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = pinFreeInfo.freePinAmount;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = pinFreeInfo.maxFreePinAmount;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            int i8 = copydefault + 99;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str3 = pinFreeInfo.maxFreePinAmountDisplay;
            if (i9 == 0) {
                int i10 = 92 / 0;
            }
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = pinFreeInfo.freePinAmountDisplay;
        }
        return pinFreeInfo.copy(z2, str5, str6, str7, str4);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.enableFreePin;
        int i4 = i2 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.freePinAmount;
        int i4 = i3 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.maxFreePinAmount;
        int i5 = i2 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.maxFreePinAmountDisplay;
            int i4 = 28 / 0;
        } else {
            str = this.maxFreePinAmountDisplay;
        }
        int i5 = i2 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.freePinAmountDisplay;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final PinFreeInfo copy(boolean enableFreePin, String freePinAmount, String maxFreePinAmount, String maxFreePinAmountDisplay, String freePinAmountDisplay) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(freePinAmount, "");
        Intrinsics.checkNotNullParameter(maxFreePinAmount, "");
        Intrinsics.checkNotNullParameter(maxFreePinAmountDisplay, "");
        Intrinsics.checkNotNullParameter(freePinAmountDisplay, "");
        PinFreeInfo pinFreeInfo = new PinFreeInfo(enableFreePin, freePinAmount, maxFreePinAmount, maxFreePinAmountDisplay, freePinAmountDisplay);
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return pinFreeInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinFreeInfo)) {
            int i2 = component3 + 97;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        PinFreeInfo pinFreeInfo = (PinFreeInfo) other;
        if (this.enableFreePin != pinFreeInfo.enableFreePin) {
            int i3 = component3 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.freePinAmount, pinFreeInfo.freePinAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.maxFreePinAmount, pinFreeInfo.maxFreePinAmount)) {
            int i5 = component3 + 115;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.maxFreePinAmountDisplay, pinFreeInfo.maxFreePinAmountDisplay)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.freePinAmountDisplay, pinFreeInfo.freePinAmountDisplay)) {
            int i7 = copydefault + 57;
            component3 = i7 % 128;
            return i7 % 2 == 0;
        }
        int i8 = component3 + 55;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.enableFreePin) * 31) + this.freePinAmount.hashCode()) * 31) + this.maxFreePinAmount.hashCode()) * 31) + this.maxFreePinAmountDisplay.hashCode()) * 31) + this.freePinAmountDisplay.hashCode();
        int i4 = copydefault + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PinFreeInfo(enableFreePin=" + this.enableFreePin + ", freePinAmount=" + this.freePinAmount + ", maxFreePinAmount=" + this.maxFreePinAmount + ", maxFreePinAmountDisplay=" + this.maxFreePinAmountDisplay + ", freePinAmountDisplay=" + this.freePinAmountDisplay + ")";
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return str;
    }
}
