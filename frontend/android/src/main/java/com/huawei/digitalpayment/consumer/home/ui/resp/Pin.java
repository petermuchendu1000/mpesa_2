package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/Pin;", "", "algorithm", "", "pinData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAlgorithm", "()Ljava/lang/String;", "getPinData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pin {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 69 % 128;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("algorithm")
    private final String algorithm;

    @SerializedName("data")
    private final String pinData;

    public Pin(String str, String str2) {
        this.algorithm = str;
        this.pinData = str2;
    }

    public final String getAlgorithm() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.algorithm;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String getPinData() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinData;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 69 % 2;
    }

    public static Pin copy$default(Pin pin, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 77;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = pin.algorithm;
        }
        if ((i & 2) != 0) {
            str2 = pin.pinData;
            int i5 = ShareDataUIState + 23;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        return pin.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.algorithm;
        int i4 = i2 + 97;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinData;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final Pin copy(String algorithm, String pinData) {
        int i = 2 % 2;
        Pin pin = new Pin(algorithm, pinData);
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return pin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pin)) {
            return false;
        }
        Pin pin = (Pin) other;
        if (!Intrinsics.areEqual(this.algorithm, pin.algorithm)) {
            return false;
        }
        if (Intrinsics.areEqual(this.pinData, pin.pinData)) {
            return true;
        }
        int i4 = copydefault + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.algorithm;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = ShareDataUIState + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.pinData;
        if (str2 == null) {
            int i4 = ShareDataUIState + 99;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode2 = str2.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Pin(algorithm=" + this.algorithm + ", pinData=" + this.pinData + ")";
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
