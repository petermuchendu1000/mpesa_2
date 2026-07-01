package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.confirm;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent;", "", "OnNavigateToPaymentStatusScreen", "ShowMessage", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent$OnNavigateToPaymentStatusScreen;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent$ShowMessage;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DaimaBundlesConfirmEvent {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent$OnNavigateToPaymentStatusScreen;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent;", "product", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "selectedPaymentOption", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "phoneNumber", "", Keys.KEY_CUSTOMER_MESSAGE, "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;Ljava/lang/String;Ljava/lang/String;)V", "getProduct", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "getSelectedPaymentOption", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", Constants.JS_API_GET_PHONE_NUMBER, "()Ljava/lang/String;", "getCustomerMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnNavigateToPaymentStatusScreen implements DaimaBundlesConfirmEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int copy = 0;
        private static int equals = 1;
        private static int getRequestBeneficiariesState = 23 % 128;
        private final DaimaProductPaymentOption component1;
        private final String component2;
        private final DaimaProduct component3;
        private final String copydefault;

        public OnNavigateToPaymentStatusScreen(DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2) {
            Intrinsics.checkNotNullParameter(daimaProduct, "");
            Intrinsics.checkNotNullParameter(daimaProductPaymentOption, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.component3 = daimaProduct;
            this.component1 = daimaProductPaymentOption;
            this.component2 = str;
            this.copydefault = str2;
        }

        public final DaimaProduct getProduct() {
            int i = 2 % 2;
            int i2 = copy + 87;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            DaimaProduct daimaProduct = this.component3;
            int i5 = i3 + 53;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return daimaProduct;
        }

        public final DaimaProductPaymentOption getSelectedPaymentOption() {
            int i = 2 % 2;
            int i2 = copy + 55;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            DaimaProductPaymentOption daimaProductPaymentOption = this.component1;
            int i5 = i3 + 75;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return daimaProductPaymentOption;
        }

        public final String getPhoneNumber() {
            int i = 2 % 2;
            int i2 = equals + 43;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 43;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getCustomerMessage() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 19;
            equals = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.copydefault;
            int i4 = i2 + 53;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static {
            if (23 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static OnNavigateToPaymentStatusScreen copy$default(OnNavigateToPaymentStatusScreen onNavigateToPaymentStatusScreen, DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = equals + 81;
            int i4 = i3 % 128;
            copy = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                int i5 = i4 + 47;
                equals = i5 % 128;
                int i6 = i5 % 2;
                daimaProduct = onNavigateToPaymentStatusScreen.component3;
            }
            if ((i & 2) != 0) {
                int i7 = i4 + 1;
                equals = i7 % 128;
                if (i7 % 2 == 0) {
                    DaimaProductPaymentOption daimaProductPaymentOption2 = onNavigateToPaymentStatusScreen.component1;
                    throw null;
                }
                daimaProductPaymentOption = onNavigateToPaymentStatusScreen.component1;
            }
            if ((i & 4) != 0) {
                str = onNavigateToPaymentStatusScreen.component2;
            }
            if ((i & 8) != 0) {
                str2 = onNavigateToPaymentStatusScreen.copydefault;
            }
            OnNavigateToPaymentStatusScreen onNavigateToPaymentStatusScreenCopy = onNavigateToPaymentStatusScreen.copy(daimaProduct, daimaProductPaymentOption, str, str2);
            int i8 = copy + 107;
            equals = i8 % 128;
            int i9 = i8 % 2;
            return onNavigateToPaymentStatusScreenCopy;
        }

        public final DaimaProduct component1() {
            int i = 2 % 2;
            int i2 = equals + 105;
            int i3 = i2 % 128;
            copy = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            DaimaProduct daimaProduct = this.component3;
            int i4 = i3 + 7;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return daimaProduct;
        }

        public final DaimaProductPaymentOption component2() {
            int i = 2 % 2;
            int i2 = copy + 123;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            int i3 = 2 / 0;
            return this.component1;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = equals + 87;
            copy = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            if (i3 != 0) {
                int i4 = 22 / 0;
            }
            return str;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = copy + 23;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return this.copydefault;
            }
            throw null;
        }

        public final OnNavigateToPaymentStatusScreen copy(DaimaProduct product, DaimaProductPaymentOption selectedPaymentOption, String phoneNumber, String customerMessage) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(product, "");
            Intrinsics.checkNotNullParameter(selectedPaymentOption, "");
            Intrinsics.checkNotNullParameter(phoneNumber, "");
            Intrinsics.checkNotNullParameter(customerMessage, "");
            OnNavigateToPaymentStatusScreen onNavigateToPaymentStatusScreen = new OnNavigateToPaymentStatusScreen(product, selectedPaymentOption, phoneNumber, customerMessage);
            int i2 = equals + 51;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return onNavigateToPaymentStatusScreen;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnNavigateToPaymentStatusScreen)) {
                int i2 = equals + 111;
                copy = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            OnNavigateToPaymentStatusScreen onNavigateToPaymentStatusScreen = (OnNavigateToPaymentStatusScreen) other;
            if (!Intrinsics.areEqual(this.component3, onNavigateToPaymentStatusScreen.component3)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.component1, onNavigateToPaymentStatusScreen.component1)) {
                int i4 = equals;
                int i5 = i4 + 17;
                copy = i5 % 128;
                boolean z = i5 % 2 != 0;
                int i6 = i4 + 27;
                copy = i6 % 128;
                int i7 = i6 % 2;
                return z;
            }
            if (Intrinsics.areEqual(this.component2, onNavigateToPaymentStatusScreen.component2)) {
                return Intrinsics.areEqual(this.copydefault, onNavigateToPaymentStatusScreen.copydefault);
            }
            int i8 = copy + 13;
            int i9 = i8 % 128;
            equals = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 99;
            copy = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 61 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copy + 19;
            equals = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.component3.hashCode() * 31) + this.component1.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.copydefault.hashCode();
            int i4 = copy + 91;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnNavigateToPaymentStatusScreen(product=" + this.component3 + ", selectedPaymentOption=" + this.component1 + ", phoneNumber=" + this.component2 + ", customerMessage=" + this.copydefault + ")";
            int i2 = equals + 79;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent$ShowMessage;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowMessage implements DaimaBundlesConfirmEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final String component2;

        public ShowMessage(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getMessage() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 47;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 23;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static {
            int i = 1 + 55;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static ShowMessage copy$default(ShowMessage showMessage, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 105;
            component1 = i4 % 128;
            if (i4 % 2 != 0 && (i & 1) != 0) {
                int i5 = i3 + 113;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                str = showMessage.component2;
            }
            return showMessage.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 105;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 63;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final ShowMessage copy(String message) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(message, "");
            ShowMessage showMessage = new ShowMessage(message);
            int i2 = component1 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return showMessage;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 79;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof ShowMessage) {
                return Intrinsics.areEqual(this.component2, ((ShowMessage) other).component2);
            }
            int i4 = i2 + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = component1 + 37;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.component2.hashCode();
                int i3 = 28 / 0;
            } else {
                iHashCode = this.component2.hashCode();
            }
            int i4 = component1 + 21;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 81 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowMessage(message=" + this.component2 + ")";
            int i2 = copydefault + 1;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
            return str;
        }
    }
}
