package com.huawei.digitalpayment.consumer.fixeddata.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation;", "", "Valid", "Empty", "NotWholeNumber", "NotPositive", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$Empty;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$NotPositive;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$NotWholeNumber;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$Valid;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AmountValidation {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$Valid;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Valid implements AmountValidation {
        public static final int $stable = 0;
        public static final Valid INSTANCE = new Valid();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;

        private Valid() {
        }

        static {
            int i = component3 + 79;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 71;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                int i5 = i3 + 123;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof Valid)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
            }
            return 346044649;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 107;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "Valid";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$Empty;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty implements AmountValidation {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;

        private Empty() {
        }

        static {
            int i = component2 + 101;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 16 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 123;
                ShareDataUIState = i2 % 128;
                return i2 % 2 != 0;
            }
            if (other instanceof Empty) {
                return true;
            }
            int i3 = copydefault + 73;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return 330706490;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 113;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 123;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$NotWholeNumber;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotWholeNumber implements AmountValidation {
        public static final int $stable = 0;
        public static final NotWholeNumber INSTANCE = new NotWholeNumber();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;

        private NotWholeNumber() {
        }

        static {
            int i = component2 + 9;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof NotWholeNumber))) {
                return true;
            }
            int i5 = i3 + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 23;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return -1592827712;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 19;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "NotWholeNumber";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation$NotPositive;", "Lcom/huawei/digitalpayment/consumer/fixeddata/util/AmountValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotPositive implements AmountValidation {
        public static final int $stable = 0;
        public static final NotPositive INSTANCE = new NotPositive();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;

        private NotPositive() {
        }

        static {
            int i = ShareDataUIState + 35;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 95 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof NotPositive) {
                int i2 = component2 + 109;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 21 / 0;
                }
                return true;
            }
            int i4 = component2 + 87;
            component1 = i4 % 128;
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
            int i3 = i2 + 99;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 33;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return -515462887;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 5;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "NotPositive";
        }
    }
}
