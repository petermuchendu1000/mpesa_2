package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.confirm;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u001eH×\u0001J\t\u0010\u001f\u001a\u00020\u0007H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmState;", "", "product", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "selectedPaymentOption", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "phoneNumber", "", "sponsorPhoneNumber", GriverMonitorConstants.KEY_IS_LOADING, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;Ljava/lang/String;Ljava/lang/String;Z)V", "getProduct", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "getSelectedPaymentOption", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", Constants.JS_API_GET_PHONE_NUMBER, "()Ljava/lang/String;", "getSponsorPhoneNumber", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaBundlesConfirmState {
    public static final int $stable = 0;
    private static int copy = 0;
    private static int equals = 7 % 128;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final DaimaProductPaymentOption ShareDataUIState;
    private final String component1;
    private final String component2;
    private final DaimaProduct component3;
    private final boolean copydefault;

    public DaimaBundlesConfirmState(DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = daimaProduct;
        this.ShareDataUIState = daimaProductPaymentOption;
        this.component1 = str;
        this.component2 = str2;
        this.copydefault = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DaimaBundlesConfirmState(DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        DaimaProductPaymentOption daimaProductPaymentOption2 = null;
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState + 97;
            copy = i2 % 128;
            int i3 = i2 % 2;
            daimaProduct = null;
        }
        if ((i & 2) != 0) {
            int i4 = copy;
            int i5 = i4 + 57;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 113;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            daimaProductPaymentOption2 = daimaProductPaymentOption;
        }
        String str3 = "";
        String str4 = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            int i9 = getRequestBeneficiariesState + 3;
            copy = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 4 / 3;
            } else {
                int i11 = 2 % 2;
            }
        } else {
            str3 = str2;
        }
        if ((i & 16) != 0) {
            int i12 = 2 % 2;
            z = false;
        }
        this(daimaProduct, daimaProductPaymentOption2, str4, str3, z);
    }

    public final DaimaProduct getProduct() {
        int i = 2 % 2;
        int i2 = copy + 51;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        DaimaProduct daimaProduct = this.component3;
        int i5 = i3 + 59;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return daimaProduct;
    }

    public final DaimaProductPaymentOption getSelectedPaymentOption() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 103;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 57;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String getSponsorPhoneNumber() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 103;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 45 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 53;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 29;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.copydefault;
        int i4 = i2 + 121;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    static {
        int i = 7 % 2;
    }

    public DaimaBundlesConfirmState() {
        this(null, null, null, null, false, 31, null);
    }

    public static DaimaBundlesConfirmState copy$default(DaimaBundlesConfirmState daimaBundlesConfirmState, DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            daimaProduct = daimaBundlesConfirmState.component3;
        }
        DaimaProduct daimaProduct2 = daimaProduct;
        if ((i & 2) != 0) {
            int i3 = getRequestBeneficiariesState + 97;
            copy = i3 % 128;
            int i4 = i3 % 2;
            daimaProductPaymentOption = daimaBundlesConfirmState.ShareDataUIState;
        }
        DaimaProductPaymentOption daimaProductPaymentOption2 = daimaProductPaymentOption;
        if ((i & 4) != 0) {
            str = daimaBundlesConfirmState.component1;
            int i5 = copy + 87;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = daimaBundlesConfirmState.component2;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = daimaBundlesConfirmState.copydefault;
        }
        return daimaBundlesConfirmState.copy(daimaProduct2, daimaProductPaymentOption2, str3, str4, z);
    }

    public final DaimaProduct component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 27;
        copy = i3 % 128;
        int i4 = i3 % 2;
        DaimaProduct daimaProduct = this.component3;
        int i5 = i2 + 25;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return daimaProduct;
    }

    public final DaimaProductPaymentOption component2() {
        int i = 2 % 2;
        int i2 = copy + 73;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 51;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = copy + 99;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 41;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final DaimaBundlesConfirmState copy(DaimaProduct product, DaimaProductPaymentOption selectedPaymentOption, String phoneNumber, String sponsorPhoneNumber, boolean isLoading) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(sponsorPhoneNumber, "");
        DaimaBundlesConfirmState daimaBundlesConfirmState = new DaimaBundlesConfirmState(product, selectedPaymentOption, phoneNumber, sponsorPhoneNumber, isLoading);
        int i2 = copy + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return daimaBundlesConfirmState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (other instanceof DaimaBundlesConfirmState) {
                DaimaBundlesConfirmState daimaBundlesConfirmState = (DaimaBundlesConfirmState) other;
                return Intrinsics.areEqual(this.component3, daimaBundlesConfirmState.component3) && Intrinsics.areEqual(this.ShareDataUIState, daimaBundlesConfirmState.ShareDataUIState) && Intrinsics.areEqual(this.component1, daimaBundlesConfirmState.component1) && Intrinsics.areEqual(this.component2, daimaBundlesConfirmState.component2) && this.copydefault == daimaBundlesConfirmState.copydefault;
            }
            int i2 = getRequestBeneficiariesState + 7;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = getRequestBeneficiariesState + 89;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 79;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        DaimaProduct daimaProduct = this.component3;
        int iHashCode2 = 0;
        if (daimaProduct == null) {
            int i2 = copy + 109;
            getRequestBeneficiariesState = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = daimaProduct.hashCode();
        }
        DaimaProductPaymentOption daimaProductPaymentOption = this.ShareDataUIState;
        if (daimaProductPaymentOption != null) {
            iHashCode2 = daimaProductPaymentOption.hashCode();
            int i3 = getRequestBeneficiariesState + 49;
            copy = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + this.component1.hashCode()) * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaBundlesConfirmState(product=" + this.component3 + ", selectedPaymentOption=" + this.ShareDataUIState + ", phoneNumber=" + this.component1 + ", sponsorPhoneNumber=" + this.component2 + ", isLoading=" + this.copydefault + ")";
        int i2 = copy + 29;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
