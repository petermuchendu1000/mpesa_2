package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/ScopesDataBean;", "", "keyItem", "", "valueItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKeyItem", "()Ljava/lang/String;", "getValueItem", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopesDataBean {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    public static int component1 = 1405853948;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("key")
    private final String keyItem;

    @SerializedName("value")
    private final String valueItem;

    public ScopesDataBean(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.keyItem = str;
        this.valueItem = str2;
    }

    public final String getKeyItem() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.keyItem;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValueItem() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.valueItem;
        int i4 = i2 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = 1 + 37;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static ScopesDataBean copy$default(ScopesDataBean scopesDataBean, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 119;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                str = scopesDataBean.keyItem;
                int i4 = 59 / 0;
            } else {
                str = scopesDataBean.keyItem;
            }
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 7;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = scopesDataBean.valueItem;
        }
        return scopesDataBean.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.keyItem;
        int i5 = i2 + 85;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.valueItem;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ScopesDataBean copy(String keyItem, String valueItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(keyItem, "");
        Intrinsics.checkNotNullParameter(valueItem, "");
        ScopesDataBean scopesDataBean = new ScopesDataBean(keyItem, valueItem);
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return scopesDataBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScopesDataBean)) {
            int i4 = i3 + 57;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        ScopesDataBean scopesDataBean = (ScopesDataBean) other;
        if ((!Intrinsics.areEqual(this.keyItem, scopesDataBean.keyItem)) || !Intrinsics.areEqual(this.valueItem, scopesDataBean.valueItem)) {
            return false;
        }
        int i5 = copydefault + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.keyItem.hashCode() / 61) / this.valueItem.hashCode() : (this.keyItem.hashCode() * 31) + this.valueItem.hashCode();
        int i3 = copydefault + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScopesDataBean(keyItem=" + this.keyItem + ", valueItem=" + this.valueItem + ")";
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return str;
    }
}
