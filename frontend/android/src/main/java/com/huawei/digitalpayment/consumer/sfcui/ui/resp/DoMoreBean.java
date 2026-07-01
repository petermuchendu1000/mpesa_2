package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/DoMoreBean;", "", "iconUri", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getIconUri", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DoMoreBean {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 103 % 128;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private final String component2;
    private final int copydefault;

    public DoMoreBean(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = i;
        this.component2 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DoMoreBean(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = ShareDataUIState + 45;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i6 = getAsAtTimestamp + 125;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
            str = "";
        }
        this(i, str);
    }

    public final int getIconUri() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.copydefault;
        int i6 = i2 + 71;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 25;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        if (103 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DoMoreBean() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static DoMoreBean copy$default(DoMoreBean doMoreBean, int i, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = getAsAtTimestamp + 7;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                i = doMoreBean.copydefault;
                int i5 = 72 / 0;
            } else {
                i = doMoreBean.copydefault;
            }
        }
        if ((i2 & 2) != 0) {
            str = doMoreBean.component2;
        }
        DoMoreBean doMoreBeanCopy = doMoreBean.copy(i, str);
        int i6 = getAsAtTimestamp + 37;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return doMoreBeanCopy;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.copydefault;
        int i5 = i3 + 57;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DoMoreBean copy(int iconUri, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        DoMoreBean doMoreBean = new DoMoreBean(iconUri, name);
        int i2 = ShareDataUIState + 17;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return doMoreBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoMoreBean)) {
            int i4 = i2 + 117;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DoMoreBean doMoreBean = (DoMoreBean) other;
        if (this.copydefault != doMoreBean.copydefault) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, doMoreBean.component2)) {
            return true;
        }
        int i6 = ShareDataUIState + 43;
        getAsAtTimestamp = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.copydefault) * 31) + this.component2.hashCode();
        int i4 = ShareDataUIState + 49;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DoMoreBean(iconUri=" + this.copydefault + ", name=" + this.component2 + ")";
        int i2 = getAsAtTimestamp + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
