package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", "", "OnClickBack", "OnSelectOwnNumber", "OnSelectOtherNumber", "OnEnterOtherNumber", "OnSelectPaymentOption", "OnClickContinue", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnClickBack;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnClickContinue;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnEnterOtherNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnSelectOtherNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnSelectOwnNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnSelectPaymentOption;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SelectPaymentMethodAction {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnClickBack;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickBack implements SelectPaymentMethodAction {
        public static final int $stable = 0;
        public static final OnClickBack INSTANCE = new OnClickBack();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault = 1;

        private OnClickBack() {
        }

        static {
            int i = component1 + 119;
            component2 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack)) == true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack) r6;
            r1 = r1 + 107;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack.ShareDataUIState = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack.copydefault
                int r2 = r1 + 97
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack.ShareDataUIState = r3
                int r2 = r2 % r0
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L16
                r2 = 69
                int r2 = r2 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack
                r2 = r2 ^ r4
                if (r2 == r4) goto L28
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction$OnClickBack r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack) r6
                int r1 = r1 + 107
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack.ShareDataUIState = r6
                int r1 = r1 % r0
                return r4
            L28:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnClickBack.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 75;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return 1330126987;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 3;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 95;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return "OnClickBack";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnSelectOwnNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSelectOwnNumber implements SelectPaymentMethodAction {
        public static final int $stable = 0;
        public static final OnSelectOwnNumber INSTANCE = new OnSelectOwnNumber();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        private OnSelectOwnNumber() {
        }

        static {
            int i = component3 + 85;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (!(other instanceof OnSelectOwnNumber)) {
                    return false;
                }
                return true;
            }
            int i2 = component2 + 13;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 5;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return 1873770959;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return "OnSelectOwnNumber";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnSelectOtherNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSelectOtherNumber implements SelectPaymentMethodAction {
        public static final int $stable = 0;
        public static final OnSelectOtherNumber INSTANCE = new OnSelectOtherNumber();
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private OnSelectOtherNumber() {
        }

        static {
            int i = copydefault + 125;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnSelectOtherNumber)) {
                return false;
            }
            int i5 = i3 + 91;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 23;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return 1844617689;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 9;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 72 / 0;
            }
            return "OnSelectOtherNumber";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnEnterOtherNumber;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", "number", "", "<init>", "(Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnEnterOtherNumber implements SelectPaymentMethodAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 115 % 128;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;
        private final String component2;

        public OnEnterOtherNumber(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getNumber() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 69;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 93;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (115 % 2 == 0) {
                throw null;
            }
        }

        public static OnEnterOtherNumber copy$default(OnEnterOtherNumber onEnterOtherNumber, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 23;
            copydefault = i4 % 128;
            if (i4 % 2 == 0 && (i & 1) != 0) {
                int i5 = i3 + 101;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                str = onEnterOtherNumber.component2;
                int i7 = i3 + 39;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
            return onEnterOtherNumber.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault + 115;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 13;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final OnEnterOtherNumber copy(String number) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            OnEnterOtherNumber onEnterOtherNumber = new OnEnterOtherNumber(number);
            int i2 = copydefault + 115;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return onEnterOtherNumber;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4.component2, ((com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber) r5).component2) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        
            r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.copydefault;
            r1 = r5 + 95;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.component1 = r1 % 128;
            r1 = r1 % 2;
            r5 = r5 + 105;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.component1 = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r4 == r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r4 == r5) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.component1
                int r1 = r1 + 45
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.copydefault = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L16
                r1 = 93
                int r1 = r1 / r3
                if (r4 != r5) goto L19
                goto L18
            L16:
                if (r4 != r5) goto L19
            L18:
                return r2
            L19:
                boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber
                if (r1 == 0) goto L3b
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction$OnEnterOtherNumber r5 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber) r5
                java.lang.String r1 = r4.component2
                java.lang.String r5 = r5.component2
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L3a
                int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.copydefault
                int r1 = r5 + 95
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.component1 = r2
                int r1 = r1 % r0
                int r5 = r5 + 105
                int r1 = r5 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.component1 = r1
                int r5 = r5 % r0
                return r3
            L3a:
                return r2
            L3b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.selectPaymentMethod.SelectPaymentMethodAction.OnEnterOtherNumber.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 109;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = component1 + 27;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnEnterOtherNumber(number=" + this.component2 + ")";
            int i2 = copydefault + 25;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnSelectPaymentOption;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", FirebaseAnalytics.Param.INDEX, "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSelectPaymentOption implements SelectPaymentMethodAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        private final int copydefault;

        public OnSelectPaymentOption(int i) {
            this.copydefault = i;
        }

        public final int getIndex() {
            int i = 2 % 2;
            int i2 = component2 + 79;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = this.copydefault;
            int i6 = i3 + 107;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            throw null;
        }

        static {
            int i = 1 + 3;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static OnSelectPaymentOption copy$default(OnSelectPaymentOption onSelectPaymentOption, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = component3;
            int i5 = i4 + 7;
            component2 = i5 % 128;
            int i6 = i2 & 1;
            if (i5 % 2 != 0 ? i6 != 0 : i6 != 0) {
                int i7 = i4 + 101;
                component2 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = onSelectPaymentOption.copydefault;
                    throw null;
                }
                i = onSelectPaymentOption.copydefault;
            }
            return onSelectPaymentOption.copy(i);
        }

        public final int component1() {
            int i = 2 % 2;
            int i2 = component3 + 101;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = this.copydefault;
            int i5 = i3 + 31;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return i4;
        }

        public final OnSelectPaymentOption copy(int index) {
            int i = 2 % 2;
            OnSelectPaymentOption onSelectPaymentOption = new OnSelectPaymentOption(index);
            int i2 = component3 + 75;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return onSelectPaymentOption;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3;
                int i3 = i2 + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 85;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(other instanceof OnSelectPaymentOption)) {
                int i6 = component3 + 61;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.copydefault == ((OnSelectPaymentOption) other).copydefault) {
                return true;
            }
            int i8 = component2 + 7;
            component3 = i8 % 128;
            return i8 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = component3 + 85;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = Integer.hashCode(this.copydefault);
                int i3 = 78 / 0;
            } else {
                iHashCode = Integer.hashCode(this.copydefault);
            }
            int i4 = component3 + 25;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnSelectPaymentOption(index=" + this.copydefault + ")";
            int i2 = component3 + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction$OnClickContinue;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/selectPaymentMethod/SelectPaymentMethodAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClickContinue implements SelectPaymentMethodAction {
        public static final int $stable = 0;
        public static final OnClickContinue INSTANCE = new OnClickContinue();
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private OnClickContinue() {
        }

        static {
            int i = component3 + 39;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnClickContinue)) {
                int i2 = component2 + 43;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = copydefault + 121;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 77;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return -1781737909;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 69;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return "OnClickContinue";
            }
            throw null;
        }
    }
}
