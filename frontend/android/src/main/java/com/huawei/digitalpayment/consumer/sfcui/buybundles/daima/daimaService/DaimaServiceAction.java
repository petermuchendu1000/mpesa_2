package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction;", "", "OnClickBack", "OnSelectBundle", "OnRefresh", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction$OnClickBack;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction$OnRefresh;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction$OnSelectBundle;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DaimaServiceAction {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction$OnClickBack;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickBack implements DaimaServiceAction {
        public static final int $stable = 0;
        public static final OnClickBack INSTANCE = new OnClickBack();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        private OnClickBack() {
        }

        static {
            int i = copydefault + 7;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 25;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof OnClickBack) {
                return true;
            }
            int i4 = i2 + 37;
            ShareDataUIState = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return -1684123535;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 33;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "OnClickBack";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction$OnSelectBundle;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction;", "product", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;)V", "getProduct", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSelectBundle implements DaimaServiceAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;
        private final DaimaProduct component3;

        public OnSelectBundle(DaimaProduct daimaProduct) {
            Intrinsics.checkNotNullParameter(daimaProduct, "");
            this.component3 = daimaProduct;
        }

        public final DaimaProduct getProduct() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            DaimaProduct daimaProduct = this.component3;
            int i5 = i3 + 85;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return daimaProduct;
        }

        static {
            int i = 1 + 3;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static OnSelectBundle copy$default(OnSelectBundle onSelectBundle, DaimaProduct daimaProduct, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 17;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                daimaProduct = onSelectBundle.component3;
                int i6 = i4 + 103;
                component2 = i6 % 128;
                int i7 = i6 % 2;
            }
            return onSelectBundle.copy(daimaProduct);
        }

        public final DaimaProduct component1() {
            int i = 2 % 2;
            int i2 = component2 + 27;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DaimaProduct daimaProduct = this.component3;
            int i4 = i3 + 43;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
            }
            return daimaProduct;
        }

        public final OnSelectBundle copy(DaimaProduct product) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(product, "");
            OnSelectBundle onSelectBundle = new OnSelectBundle(product);
            int i2 = component2 + 51;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return onSelectBundle;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 91;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 97;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i2 + 77;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
            if (!(other instanceof OnSelectBundle) || !Intrinsics.areEqual(this.component3, ((OnSelectBundle) other).component3)) {
                return false;
            }
            int i9 = ShareDataUIState + 15;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 11;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                this.component3.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.component3.hashCode();
            int i3 = ShareDataUIState + 103;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnSelectBundle(product=" + this.component3 + ")";
            int i2 = component2 + 23;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction$OnRefresh;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRefresh implements DaimaServiceAction {
        public static final int $stable = 0;
        public static final OnRefresh INSTANCE = new OnRefresh();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private OnRefresh() {
        }

        static {
            int i = ShareDataUIState + 117;
            copydefault = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof OnRefresh) {
                return true;
            }
            int i5 = i3 + 17;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 123;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return -223758019;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 43;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
            }
            return "OnRefresh";
        }
    }
}
