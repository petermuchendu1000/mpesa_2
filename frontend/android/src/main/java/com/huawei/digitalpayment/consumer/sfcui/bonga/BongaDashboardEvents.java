package com.huawei.digitalpayment.consumer.sfcui.bonga;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents;", "", "ToggleBalanceVisibility", "RetryBalanceFetch", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents$RetryBalanceFetch;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents$ToggleBalanceVisibility;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BongaDashboardEvents {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents$ToggleBalanceVisibility;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ToggleBalanceVisibility implements BongaDashboardEvents {
        public static final int $stable = 0;
        public static final ToggleBalanceVisibility INSTANCE = new ToggleBalanceVisibility();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;

        private ToggleBalanceVisibility() {
        }

        static {
            int i = component3 + 67;
            component1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 89 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 121;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 27;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (other instanceof ToggleBalanceVisibility) {
                return true;
            }
            int i7 = i2 + 91;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return -1142842707;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 83;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "ToggleBalanceVisibility";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents$RetryBalanceFetch;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaDashboardEvents;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryBalanceFetch implements BongaDashboardEvents {
        public static final int $stable = 0;
        public static final RetryBalanceFetch INSTANCE = new RetryBalanceFetch();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;

        private RetryBalanceFetch() {
        }

        static {
            int i = ShareDataUIState + 51;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 121;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof RetryBalanceFetch) {
                return true;
            }
            int i5 = i3 + 71;
            int i6 = i5 % 128;
            component2 = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 51;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 14 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 11;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return 1171369689;
            }
            int i3 = 89 / 0;
            return 1171369689;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 57;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return "RetryBalanceFetch";
        }
    }
}
