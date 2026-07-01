package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/ExtPropertiesLangResp;", "Ljava/io/Serializable;", "Validity", "", "<init>", "(Ljava/lang/String;)V", "getValidity", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExtPropertiesLangResp implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String Validity;

    public ExtPropertiesLangResp(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.Validity = str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.Validity;
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 123;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    public static ExtPropertiesLangResp copy$default(ExtPropertiesLangResp extPropertiesLangResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 19;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            str = extPropertiesLangResp.Validity;
            int i6 = i4 + 43;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        ExtPropertiesLangResp extPropertiesLangRespCopy = extPropertiesLangResp.copy(str);
        int i8 = component2 + 53;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            return extPropertiesLangRespCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.Validity;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ExtPropertiesLangResp copy(String Validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Validity, "");
        ExtPropertiesLangResp extPropertiesLangResp = new ExtPropertiesLangResp(Validity);
        int i2 = copydefault + 7;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return extPropertiesLangResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ExtPropertiesLangResp)) {
            int i4 = component2 + 125;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.Validity, ((ExtPropertiesLangResp) other).Validity)) {
            return false;
        }
        int i6 = copydefault + 101;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.Validity.hashCode();
        int i4 = copydefault + 61;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExtPropertiesLangResp(Validity=" + this.Validity + ")";
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
