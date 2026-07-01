package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PersonalisedConfig;", "", "orderId", "", "<init>", "(Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersonalisedConfig {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 41 % 128;
    private final String component2;

    public PersonalisedConfig(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
    }

    public final String getOrderId() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return str;
    }

    static {
        if (41 % 2 == 0) {
            int i = 1 / 0;
        }
    }

    public static PersonalisedConfig copy$default(PersonalisedConfig personalisedConfig, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 33;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                str = personalisedConfig.component2;
                int i4 = 77 / 0;
            } else {
                str = personalisedConfig.component2;
            }
        }
        PersonalisedConfig personalisedConfigCopy = personalisedConfig.copy(str);
        int i5 = ShareDataUIState + 121;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return personalisedConfigCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 15;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public final PersonalisedConfig copy(String orderId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(orderId, "");
        PersonalisedConfig personalisedConfig = new PersonalisedConfig(orderId);
        int i2 = ShareDataUIState + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return personalisedConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof PersonalisedConfig) {
            if (Intrinsics.areEqual(this.component2, ((PersonalisedConfig) other).component2)) {
                return true;
            }
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = ShareDataUIState + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component2.hashCode();
        int i4 = component1 + 81;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PersonalisedConfig(orderId=" + this.component2 + ")";
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return str;
    }
}
