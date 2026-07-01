package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/VerifyCashOutResp;", "Lcom/huawei/http/BaseResp;", "publicName", "", KeysConstants.SHORT_CODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPublicName", "()Ljava/lang/String;", "getShortCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyCashOutResp extends BaseResp {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 9 % 128;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String publicName;
    private final String shortCode;

    public final String getPublicName() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.publicName;
        int i5 = i3 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.shortCode;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public VerifyCashOutResp(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.publicName = str;
        this.shortCode = str2;
    }

    static {
        int i = 9 % 2;
    }

    public static VerifyCashOutResp copy$default(VerifyCashOutResp verifyCashOutResp, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault;
            int i4 = i3 + 67;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            String str3 = verifyCashOutResp.publicName;
            int i6 = i3 + 9;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = str3;
        }
        if ((i & 2) != 0) {
            str2 = verifyCashOutResp.shortCode;
        }
        return verifyCashOutResp.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.publicName;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shortCode;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyCashOutResp copy(String publicName, String shortCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(publicName, "");
        Intrinsics.checkNotNullParameter(shortCode, "");
        VerifyCashOutResp verifyCashOutResp = new VerifyCashOutResp(publicName, shortCode);
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return verifyCashOutResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 107;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof VerifyCashOutResp)) {
            int i8 = i4 + 107;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        VerifyCashOutResp verifyCashOutResp = (VerifyCashOutResp) other;
        if (Intrinsics.areEqual(this.publicName, verifyCashOutResp.publicName)) {
            return Intrinsics.areEqual(this.shortCode, verifyCashOutResp.shortCode);
        }
        int i10 = component2;
        int i11 = i10 + 7;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 115;
        copydefault = i13 % 128;
        if (i13 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.publicName.hashCode() * 31) + this.shortCode.hashCode();
        int i4 = component2 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyCashOutResp(publicName=" + this.publicName + ", shortCode=" + this.shortCode + ")";
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
