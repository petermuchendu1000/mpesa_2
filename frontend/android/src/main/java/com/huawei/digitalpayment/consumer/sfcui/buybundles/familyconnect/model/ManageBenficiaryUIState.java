package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/ManageBenficiaryUIState;", "", "initials", "", "name", "phoneNumber", "maximumShareable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInitials", "()Ljava/lang/String;", "getName", Constants.JS_API_GET_PHONE_NUMBER, "getMaximumShareable", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManageBenficiaryUIState {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int copy = 0;
    private static int equals = 25 % 128;
    private static int getAsAtTimestamp = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final String component3;
    private final String copydefault;

    public ManageBenficiaryUIState(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.component3 = str;
        this.copydefault = str2;
        this.ShareDataUIState = str3;
        this.component1 = str4;
    }

    public final String getInitials() {
        int i = 2 % 2;
        int i2 = copy + 77;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = copy + 35;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = copy + 87;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String getMaximumShareable() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            str = this.component1;
            int i4 = 57 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 75;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (25 % 2 == 0) {
            throw null;
        }
    }

    public static ManageBenficiaryUIState copy$default(ManageBenficiaryUIState manageBenficiaryUIState, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 69;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 67;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            str = manageBenficiaryUIState.component3;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 41;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 == 0) {
                String str5 = manageBenficiaryUIState.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = manageBenficiaryUIState.copydefault;
        }
        if ((i & 4) != 0) {
            int i9 = i3 + 39;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            str3 = manageBenficiaryUIState.ShareDataUIState;
            if (i10 == 0) {
                int i11 = 65 / 0;
            }
        }
        if ((i & 8) != 0) {
            str4 = manageBenficiaryUIState.component1;
        }
        return manageBenficiaryUIState.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        int i3 = i2 % 128;
        copy = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 121;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 71;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 43;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            str = this.component1;
            int i4 = 89 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 103;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ManageBenficiaryUIState copy(String initials, String name, String phoneNumber, String maximumShareable) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initials, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(maximumShareable, "");
        ManageBenficiaryUIState manageBenficiaryUIState = new ManageBenficiaryUIState(initials, name, phoneNumber, maximumShareable);
        int i2 = getAsAtTimestamp + 65;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return manageBenficiaryUIState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManageBenficiaryUIState)) {
            int i2 = copy + 81;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ManageBenficiaryUIState manageBenficiaryUIState = (ManageBenficiaryUIState) other;
        if (!Intrinsics.areEqual(this.component3, manageBenficiaryUIState.component3)) {
            int i4 = copy + 111;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, manageBenficiaryUIState.copydefault)) {
            return !(Intrinsics.areEqual(this.ShareDataUIState, manageBenficiaryUIState.ShareDataUIState) ^ true) && Intrinsics.areEqual(this.component1, manageBenficiaryUIState.component1);
        }
        int i6 = getAsAtTimestamp + 15;
        copy = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 43;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component3.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component1.hashCode();
        int i4 = copy + 55;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ManageBenficiaryUIState(initials=" + this.component3 + ", name=" + this.copydefault + ", phoneNumber=" + this.ShareDataUIState + ", maximumShareable=" + this.component1 + ")";
        int i2 = copy + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
