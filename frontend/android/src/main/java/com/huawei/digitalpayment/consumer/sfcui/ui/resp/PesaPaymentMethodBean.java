package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\t\u0010 \u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PesaPaymentMethodBean;", "", "iconUri", "", "title", "", "content", "isSelected", "", "selectedIconUri", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZI)V", "getIconUri", "()I", "getTitle", "()Ljava/lang/String;", "getContent", "setContent", "(Ljava/lang/String;)V", "()Z", "setSelected", "(Z)V", "getSelectedIconUri", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PesaPaymentMethodBean {
    public static final int $stable = 8;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final int ShareDataUIState;
    private final String component1;
    private String component2;
    private final int component3;
    private boolean copydefault;

    public PesaPaymentMethodBean(int i, String str, String str2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = i;
        this.component1 = str;
        this.component2 = str2;
        this.copydefault = z;
        this.component3 = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PesaPaymentMethodBean(int i, String str, String str2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        boolean z2;
        int i4;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        String str4 = "";
        if ((i3 & 2) != 0) {
            int i6 = component4 + 9;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i3 & 4) != 0) {
            int i8 = component4 + 19;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str4 = str2;
        }
        if ((i3 & 8) != 0) {
            int i10 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 16) != 0) {
            int i11 = getAsAtTimestamp + 41;
            component4 = i11 % 128;
            int i12 = i11 % 2;
            i4 = 0;
        } else {
            i4 = i2;
        }
        this(i5, str3, str4, z2, i4);
    }

    public final int getIconUri() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component4 + 55;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 125;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final String getContent() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 65;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return str;
    }

    public final void setContent(String str) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        int i4 = getAsAtTimestamp + 23;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 47;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.copydefault;
        int i4 = i2 + 93;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component4 + 85;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.copydefault = z;
        int i5 = i3 + 89;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getSelectedIconUri() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 51;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 27;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public PesaPaymentMethodBean() {
        this(0, null, null, false, 0, 31, null);
    }

    public static PesaPaymentMethodBean copy$default(PesaPaymentMethodBean pesaPaymentMethodBean, int i, String str, String str2, boolean z, int i2, int i3, Object obj) {
        String str3;
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            i = pesaPaymentMethodBean.ShareDataUIState;
        }
        int i5 = i;
        if ((i3 & 2) != 0) {
            str = pesaPaymentMethodBean.component1;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            int i6 = getAsAtTimestamp + 123;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                str3 = pesaPaymentMethodBean.component2;
                int i7 = 38 / 0;
            } else {
                str3 = pesaPaymentMethodBean.component2;
            }
            str2 = str3;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            z = pesaPaymentMethodBean.copydefault;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            int i8 = getAsAtTimestamp + 39;
            component4 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = pesaPaymentMethodBean.component3;
                throw null;
            }
            i2 = pesaPaymentMethodBean.component3;
        }
        return pesaPaymentMethodBean.copy(i5, str4, str5, z2, i2);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = component4 + 19;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0) {
            i = this.ShareDataUIState;
            int i5 = 21 / 0;
        } else {
            i = this.ShareDataUIState;
        }
        int i6 = i4 + 25;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 37;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 77;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 101;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 43;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component4 + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PesaPaymentMethodBean copy(int iconUri, String title, String content, boolean isSelected, int selectedIconUri) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(content, "");
        PesaPaymentMethodBean pesaPaymentMethodBean = new PesaPaymentMethodBean(iconUri, title, content, isSelected, selectedIconUri);
        int i2 = getAsAtTimestamp + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return pesaPaymentMethodBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 91;
        int i4 = i3 % 128;
        component4 = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof PesaPaymentMethodBean)) {
            int i5 = i2 + 69;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        PesaPaymentMethodBean pesaPaymentMethodBean = (PesaPaymentMethodBean) other;
        if (this.ShareDataUIState == pesaPaymentMethodBean.ShareDataUIState) {
            if (Intrinsics.areEqual(this.component1, pesaPaymentMethodBean.component1)) {
                return Intrinsics.areEqual(this.component2, pesaPaymentMethodBean.component2) && this.copydefault == pesaPaymentMethodBean.copydefault && this.component3 == pesaPaymentMethodBean.component3;
            }
            int i7 = component4 + 73;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i4 + 3;
        int i10 = i9 % 128;
        getAsAtTimestamp = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 63;
        component4 = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Integer.hashCode(this.ShareDataUIState) * 31) + this.component1.hashCode()) * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.component3);
        int i4 = getAsAtTimestamp + 17;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PesaPaymentMethodBean(iconUri=" + this.ShareDataUIState + ", title=" + this.component1 + ", content=" + this.component2 + ", isSelected=" + this.copydefault + ", selectedIconUri=" + this.component3 + ")";
        int i2 = getAsAtTimestamp + 117;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
