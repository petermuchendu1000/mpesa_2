package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType;", "", "BuyPlan", "RenewPlan", "ChangePlan", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType$BuyPlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType$ChangePlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType$RenewPlan;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
interface PromptType {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType$BuyPlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BuyPlan implements PromptType {
        public static final int $stable = 0;
        public static final BuyPlan INSTANCE = new BuyPlan();
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private BuyPlan() {
        }

        static {
            int i = component2 + 47;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 79;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (this == other) {
                int i5 = i3 + 45;
                component3 = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(other instanceof BuyPlan)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return -510179703;
            }
            int i3 = 14 / 0;
            return -510179703;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return "BuyPlan";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType$RenewPlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RenewPlan implements PromptType {
        public static final int $stable = 0;
        public static final RenewPlan INSTANCE = new RenewPlan();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private RenewPlan() {
        }

        static {
            int i = ShareDataUIState + 89;
            component1 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 23;
            com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan.component3 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan.copydefault
                int r2 = r1 + 69
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan.component3 = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L16
                r2 = 53
                int r2 = r2 / r4
                if (r5 != r6) goto L20
                goto L18
            L16:
                if (r5 != r6) goto L20
            L18:
                int r1 = r1 + 23
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan.component3 = r6
                int r1 = r1 % r0
                return r3
            L20:
                boolean r0 = r6 instanceof com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan
                if (r0 != 0) goto L25
                return r4
            L25:
                com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType$RenewPlan r6 = (com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan) r6
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.screen.PromptType.RenewPlan.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 59;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return 2107142288;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 43;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 93;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return "RenewPlan";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType$ChangePlan;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/PromptType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangePlan implements PromptType {
        public static final int $stable = 0;
        public static final ChangePlan INSTANCE = new ChangePlan();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;

        private ChangePlan() {
        }

        static {
            int i = copydefault + 11;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (other instanceof ChangePlan) {
                    return true;
                }
                int i2 = ShareDataUIState + 17;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = ShareDataUIState + 91;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 21;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 69;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 119;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return 493612287;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return "ChangePlan";
            }
            throw null;
        }
    }
}
