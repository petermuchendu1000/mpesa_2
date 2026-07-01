package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource;", "", "<init>", "()V", "MY_BILLS", "FREQUENTS", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource$FREQUENTS;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource$MY_BILLS;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BillSource {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 1;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource$MY_BILLS;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MY_BILLS extends BillSource {
        public static final int $stable = 0;
        public static final MY_BILLS INSTANCE = new MY_BILLS();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;

        private MY_BILLS() {
            super(null);
        }

        static {
            int i = copydefault + 27;
            component1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 33 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 35;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof MY_BILLS) {
                return true;
            }
            int i4 = i3 + 101;
            int i5 = i4 % 128;
            component3 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 81;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 113;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return -425379315;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 101;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 23;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return "MY_BILLS";
            }
            obj.hashCode();
            throw null;
        }
    }

    private BillSource() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource$FREQUENTS;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FREQUENTS extends BillSource {
        public static final int $stable = 0;
        public static final FREQUENTS INSTANCE = new FREQUENTS();
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private FREQUENTS() {
            super(null);
        }

        static {
            int i = component2 + 85;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 77;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i2 + 37;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (other instanceof FREQUENTS) {
                return true;
            }
            int i8 = i4 + 115;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 95;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 83;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return -1009294191;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 97;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 77;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "FREQUENTS";
        }
    }

    static {
        int i = 1 + 87;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BillSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
