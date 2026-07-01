package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction;", "", "OnClickClose", "OnClickDone", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction$OnClickClose;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction$OnClickDone;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DaimaStatusAction {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction$OnClickClose;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickClose implements DaimaStatusAction {
        public static final int $stable = 0;
        public static final OnClickClose INSTANCE = new OnClickClose();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private OnClickClose() {
        }

        static {
            int i = ShareDataUIState + 113;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            boolean z;
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 57;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 125;
                int i7 = i6 % 128;
                copydefault = i7;
                z = i6 % 2 != 0;
                int i8 = i7 + 23;
                component3 = i8 % 128;
                if (i8 % 2 == 0) {
                    return z;
                }
                throw null;
            }
            if (!(!(other instanceof OnClickClose))) {
                return true;
            }
            int i9 = i2 + 31;
            int i10 = i9 % 128;
            component3 = i10;
            z = i9 % 2 != 0;
            int i11 = i10 + 25;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                return z;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 95;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return -42282372;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 119;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 3;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return "OnClickClose";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction$OnClickDone;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickDone implements DaimaStatusAction {
        public static final int $stable = 0;
        public static final OnClickDone INSTANCE = new OnClickDone();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;

        private OnClickDone() {
        }

        static {
            int i = ShareDataUIState + 3;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 78 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnClickDone)) {
                int i4 = i3 + 11;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i3 + 91;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 80 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 61;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 85;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return -278425986;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 49;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return "OnClickDone";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
