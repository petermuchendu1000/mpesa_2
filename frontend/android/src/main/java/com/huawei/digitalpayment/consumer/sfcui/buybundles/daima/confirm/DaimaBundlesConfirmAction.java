package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.confirm;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction;", "", "OnClickBack", "OnClickConfirm", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction$OnClickBack;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction$OnClickConfirm;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DaimaBundlesConfirmAction {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction$OnClickBack;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickBack implements DaimaBundlesConfirmAction {
        public static final int $stable = 0;
        public static final OnClickBack INSTANCE = new OnClickBack();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private OnClickBack() {
        }

        static {
            int i = component1 + 53;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 57;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof OnClickBack) {
                return true;
            }
            int i5 = i2 + 11;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 25;
            int i3 = i2 % 128;
            copydefault = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 75;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return 386789572;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 117;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return "OnClickBack";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction$OnClickConfirm;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/confirm/DaimaBundlesConfirmAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickConfirm implements DaimaBundlesConfirmAction {
        public static final int $stable = 0;
        public static final OnClickConfirm INSTANCE = new OnClickConfirm();
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;

        private OnClickConfirm() {
        }

        static {
            int i = ShareDataUIState + 89;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 97;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(other instanceof OnClickConfirm))) {
                return true;
            }
            int i4 = component3 + 55;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 33;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 12 / 0;
            }
            return 749310403;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 47;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 81;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return "OnClickConfirm";
            }
            throw null;
        }
    }
}
