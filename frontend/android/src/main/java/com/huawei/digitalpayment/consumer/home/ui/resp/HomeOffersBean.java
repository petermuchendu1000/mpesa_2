package com.huawei.digitalpayment.consumer.home.ui.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/HomeOffersBean;", "Ljava/io/Serializable;", "imgRes", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getImgRes", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeOffersBean implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 95 % 128;
    private static int component3 = 1;
    private static int copydefault;
    private final int imgRes;
    private final String value;

    public HomeOffersBean(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imgRes = i;
        this.value = str;
    }

    public final int getImgRes() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.imgRes;
        int i6 = i2 + 13;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 94 / 0;
        }
        return i5;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    static {
        if (95 % 2 == 0) {
            int i = 19 / 0;
        }
    }

    public static HomeOffersBean copy$default(HomeOffersBean homeOffersBean, int i, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copydefault + 75;
        int i5 = i4 % 128;
        component3 = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            i = homeOffersBean.imgRes;
        }
        if ((i2 & 2) != 0) {
            str = homeOffersBean.value;
            int i7 = i5 + 123;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        return homeOffersBean.copy(i, str);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.imgRes;
        int i6 = i3 + 51;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        throw null;
    }

    public final HomeOffersBean copy(int imgRes, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        HomeOffersBean homeOffersBean = new HomeOffersBean(imgRes, value);
        int i2 = component3 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return homeOffersBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof HomeOffersBean)) {
            return false;
        }
        HomeOffersBean homeOffersBean = (HomeOffersBean) other;
        if (this.imgRes == homeOffersBean.imgRes) {
            return Intrinsics.areEqual(this.value, homeOffersBean.value);
        }
        int i4 = component3 + 3;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.imgRes) * 31) + this.value.hashCode();
        int i4 = component3 + 37;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeOffersBean(imgRes=" + this.imgRes + ", value=" + this.value + ")";
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
