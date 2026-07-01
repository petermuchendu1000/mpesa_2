package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent;", "", "OnNavigateToPaymentConfirmationScreen", "ShowToast", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent$OnNavigateToPaymentConfirmationScreen;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent$ShowToast;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SelectPaymentMethodEvent {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent$OnNavigateToPaymentConfirmationScreen;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent;", "product", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "paymentOption", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "recipientNumber", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;Ljava/lang/String;)V", "getProduct", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "getPaymentOption", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "getRecipientNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnNavigateToPaymentConfirmationScreen implements SelectPaymentMethodEvent {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int equals = 0;
        private static int getRequestBeneficiariesState = 1;
        private final DaimaProductPaymentOption ShareDataUIState;
        private final DaimaProduct component3;
        private final String copydefault;

        public OnNavigateToPaymentConfirmationScreen(DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str) {
            Intrinsics.checkNotNullParameter(daimaProduct, "");
            Intrinsics.checkNotNullParameter(daimaProductPaymentOption, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = daimaProduct;
            this.ShareDataUIState = daimaProductPaymentOption;
            this.copydefault = str;
        }

        public final DaimaProduct getProduct() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 125;
            int i3 = i2 % 128;
            equals = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DaimaProduct daimaProduct = this.component3;
            int i4 = i3 + 73;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return daimaProduct;
        }

        public final DaimaProductPaymentOption getPaymentOption() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 43;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            DaimaProductPaymentOption daimaProductPaymentOption = this.ShareDataUIState;
            int i5 = i2 + 57;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return daimaProductPaymentOption;
        }

        public final String getRecipientNumber() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 57;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 95;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 101;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public static OnNavigateToPaymentConfirmationScreen copy$default(OnNavigateToPaymentConfirmationScreen onNavigateToPaymentConfirmationScreen, DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                daimaProduct = onNavigateToPaymentConfirmationScreen.component3;
            }
            if ((i & 2) != 0) {
                int i3 = getRequestBeneficiariesState + 89;
                equals = i3 % 128;
                if (i3 % 2 != 0) {
                    daimaProductPaymentOption = onNavigateToPaymentConfirmationScreen.ShareDataUIState;
                    int i4 = 6 / 0;
                } else {
                    daimaProductPaymentOption = onNavigateToPaymentConfirmationScreen.ShareDataUIState;
                }
            }
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i5 = getRequestBeneficiariesState + 67;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                    String str2 = onNavigateToPaymentConfirmationScreen.copydefault;
                    obj2.hashCode();
                    throw null;
                }
                str = onNavigateToPaymentConfirmationScreen.copydefault;
            }
            OnNavigateToPaymentConfirmationScreen onNavigateToPaymentConfirmationScreenCopy = onNavigateToPaymentConfirmationScreen.copy(daimaProduct, daimaProductPaymentOption, str);
            int i6 = equals + 27;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                return onNavigateToPaymentConfirmationScreenCopy;
            }
            obj2.hashCode();
            throw null;
        }

        public final DaimaProduct component1() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 5;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DaimaProduct daimaProduct = this.component3;
            int i4 = i2 + 45;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            return daimaProduct;
        }

        public final DaimaProductPaymentOption component2() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 23;
            int i3 = i2 % 128;
            equals = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            DaimaProductPaymentOption daimaProductPaymentOption = this.ShareDataUIState;
            int i4 = i3 + 101;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return daimaProductPaymentOption;
            }
            obj.hashCode();
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 33;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.copydefault;
            int i4 = i2 + 105;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final OnNavigateToPaymentConfirmationScreen copy(DaimaProduct product, DaimaProductPaymentOption paymentOption, String recipientNumber) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(product, "");
            Intrinsics.checkNotNullParameter(paymentOption, "");
            Intrinsics.checkNotNullParameter(recipientNumber, "");
            OnNavigateToPaymentConfirmationScreen onNavigateToPaymentConfirmationScreen = new OnNavigateToPaymentConfirmationScreen(product, paymentOption, recipientNumber);
            int i2 = getRequestBeneficiariesState + 43;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return onNavigateToPaymentConfirmationScreen;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = equals + 67;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof OnNavigateToPaymentConfirmationScreen)) {
                int i4 = equals + 77;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            OnNavigateToPaymentConfirmationScreen onNavigateToPaymentConfirmationScreen = (OnNavigateToPaymentConfirmationScreen) other;
            if ((!Intrinsics.areEqual(this.component3, onNavigateToPaymentConfirmationScreen.component3)) || !Intrinsics.areEqual(this.ShareDataUIState, onNavigateToPaymentConfirmationScreen.ShareDataUIState)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, onNavigateToPaymentConfirmationScreen.copydefault)) {
                return true;
            }
            int i6 = getRequestBeneficiariesState + 1;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = equals + 79;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component3.hashCode();
            return i3 == 0 ? (((iHashCode - 72) << this.ShareDataUIState.hashCode()) % 116) - this.copydefault.hashCode() : (((iHashCode * 31) + this.ShareDataUIState.hashCode()) * 31) + this.copydefault.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnNavigateToPaymentConfirmationScreen(product=" + this.component3 + ", paymentOption=" + this.ShareDataUIState + ", recipientNumber=" + this.copydefault + ")";
            int i2 = equals + 119;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent$ShowToast;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowToast implements SelectPaymentMethodEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final String component1;

        public ShowToast(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component2 + 65;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 19;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 109;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static ShowToast copy$default(ShowToast showToast, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 105;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                str = showToast.component1;
            }
            ShowToast showToastCopy = showToast.copy(str);
            int i5 = component2 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return showToastCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 87;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.component1;
            int i4 = i2 + 75;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final ShowToast copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            ShowToast showToast = new ShowToast(message);
            int i2 = ShareDataUIState + 67;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return showToast;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 35;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this != other) {
                return (other instanceof ShowToast) && Intrinsics.areEqual(this.component1, ((ShowToast) other).component1);
            }
            int i5 = i2 + 119;
            component2 = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            if (i3 == 0) {
                int i4 = 86 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowToast(message=" + this.component1 + ")";
            int i2 = ShareDataUIState + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
