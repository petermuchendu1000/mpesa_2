package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.domore;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u0005H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/domore/DoMoreBean;", "", "categoryName", "", "iconRes", "", "palette", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getPalette", "setPalette", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DoMoreBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private String component1;
    private int component3;
    private String copydefault;

    public DoMoreBean(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.component3 = i;
        this.component1 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DoMoreBean(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 37;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 70 / 0;
            }
            int i5 = 2 % 2;
            str = "";
        }
        if ((i2 & 2) != 0) {
            int i6 = 2 % 2;
            i = 0;
        }
        if ((i2 & 4) != 0) {
            int i7 = getRequestBeneficiariesState + 35;
            equals = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 97 / 0;
            }
            str2 = "";
        }
        this(str, i, str2);
    }

    public final String getCategoryName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 27;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCategoryName(String str) {
        int i = 2 % 2;
        int i2 = equals + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        int i4 = getRequestBeneficiariesState + 33;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = equals + 21;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 113;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 13;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        this.component3 = i;
        if (i5 != 0) {
            int i6 = 25 / 0;
        }
        int i7 = i4 + 27;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
    }

    public final String getPalette() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 37;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setPalette(String str) {
        int i = 2 % 2;
        int i2 = equals + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        int i4 = equals + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 35;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public DoMoreBean() {
        this(null, 0, null, 7, null);
    }

    public static DoMoreBean copy$default(DoMoreBean doMoreBean, String str, int i, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 37;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            str = doMoreBean.copydefault;
            int i7 = i4 + 69;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 2) != 0) {
            i = doMoreBean.component3;
        }
        if ((i2 & 4) != 0) {
            int i9 = getRequestBeneficiariesState + 125;
            equals = i9 % 128;
            if (i9 % 2 != 0) {
                String str3 = doMoreBean.component1;
                throw null;
            }
            str2 = doMoreBean.component1;
        }
        return doMoreBean.copy(str, i, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 113;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 29;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 37;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final DoMoreBean copy(String categoryName, int iconRes, String palette) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categoryName, "");
        Intrinsics.checkNotNullParameter(palette, "");
        DoMoreBean doMoreBean = new DoMoreBean(categoryName, iconRes, palette);
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return doMoreBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof DoMoreBean)) {
            int i4 = i3 + 89;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DoMoreBean doMoreBean = (DoMoreBean) other;
        if (!Intrinsics.areEqual(this.copydefault, doMoreBean.copydefault)) {
            int i6 = getRequestBeneficiariesState + 45;
            equals = i6 % 128;
            return i6 % 2 != 0;
        }
        if (this.component3 != doMoreBean.component3) {
            return false;
        }
        if (Intrinsics.areEqual(this.component1, doMoreBean.component1)) {
            return true;
        }
        int i7 = getRequestBeneficiariesState + 99;
        equals = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.copydefault.hashCode() * 31) + Integer.hashCode(this.component3)) * 31) + this.component1.hashCode();
        int i4 = equals + 77;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DoMoreBean(categoryName=" + this.copydefault + ", iconRes=" + this.component3 + ", palette=" + this.component1 + ")";
        int i2 = getRequestBeneficiariesState + 113;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 80 / 0;
        }
        return str;
    }
}
