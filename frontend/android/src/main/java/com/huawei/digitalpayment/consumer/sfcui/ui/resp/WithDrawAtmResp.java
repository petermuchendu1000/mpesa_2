package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/WithDrawAtmResp;", "Lcom/huawei/http/BaseResp;", "personalisedConfig", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PersonalisedConfig;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PersonalisedConfig;)V", "getPersonalisedConfig", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PersonalisedConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithDrawAtmResp extends BaseResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 79 % 128;
    private static int component3 = 1;
    private static int copydefault;
    private final PersonalisedConfig personalisedConfig;

    public final PersonalisedConfig getPersonalisedConfig() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        PersonalisedConfig personalisedConfig = this.personalisedConfig;
        int i5 = i2 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return personalisedConfig;
    }

    public WithDrawAtmResp(PersonalisedConfig personalisedConfig) {
        Intrinsics.checkNotNullParameter(personalisedConfig, "");
        this.personalisedConfig = personalisedConfig;
    }

    static {
        if (79 % 2 == 0) {
            throw null;
        }
    }

    public static WithDrawAtmResp copy$default(WithDrawAtmResp withDrawAtmResp, PersonalisedConfig personalisedConfig, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 7;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 19;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            personalisedConfig = withDrawAtmResp.personalisedConfig;
            if (i7 != 0) {
                int i8 = 99 / 0;
            }
        }
        return withDrawAtmResp.copy(personalisedConfig);
    }

    public final PersonalisedConfig component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        PersonalisedConfig personalisedConfig = this.personalisedConfig;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return personalisedConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WithDrawAtmResp copy(PersonalisedConfig personalisedConfig) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(personalisedConfig, "");
        WithDrawAtmResp withDrawAtmResp = new WithDrawAtmResp(personalisedConfig);
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return withDrawAtmResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 55;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof WithDrawAtmResp)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.personalisedConfig, ((WithDrawAtmResp) other).personalisedConfig))) {
            return true;
        }
        int i7 = ShareDataUIState + 101;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.personalisedConfig.hashCode();
            throw null;
        }
        int iHashCode = this.personalisedConfig.hashCode();
        int i3 = ShareDataUIState + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithDrawAtmResp(personalisedConfig=" + this.personalisedConfig + ")";
        int i2 = component3 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
