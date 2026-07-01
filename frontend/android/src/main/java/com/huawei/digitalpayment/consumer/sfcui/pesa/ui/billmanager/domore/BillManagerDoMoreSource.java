package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore;

import com.huawei.digitalpayment.consumer.base.resp.ReferenceInitiationTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource;", "", "<init>", "()V", "MyBills", ReferenceInitiationTypes.frequents, "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource$Frequents;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource$MyBills;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BillManagerDoMoreSource {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource$MyBills;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MyBills extends BillManagerDoMoreSource {
        public static final int $stable = 0;
        public static final MyBills INSTANCE = new MyBills();
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;

        private MyBills() {
            super(null);
        }

        static {
            int i = component2 + 105;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        
            r2 = r2 + 17;
            r6 = r2 % 128;
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.component1 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            if ((r2 % 2) == 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        
            r3 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            r6 = r6 + 3;
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.component3 = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        
            return r3;
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.component1
                int r1 = r1 + 35
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.component3 = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L16
                r1 = 63
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills
                if (r1 == 0) goto L20
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource$MyBills r6 = (com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills) r6
                return r4
            L20:
                int r2 = r2 + 17
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.component1 = r6
                int r2 = r2 % r0
                if (r2 == 0) goto L2a
                r3 = r4
            L2a:
                int r6 = r6 + 3
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.component3 = r1
                int r6 = r6 % r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore.BillManagerDoMoreSource.MyBills.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 5;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 7;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return 6154424;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 11;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "MyBills";
        }
    }

    private BillManagerDoMoreSource() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource$Frequents;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreSource;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Frequents extends BillManagerDoMoreSource {
        public static final int $stable = 0;
        public static final Frequents INSTANCE = new Frequents();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        private Frequents() {
            super(null);
        }

        static {
            int i = component1 + 41;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 85;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof Frequents) {
                return true;
            }
            int i4 = i3 + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return -988031203;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 121;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return ReferenceInitiationTypes.frequents;
        }
    }

    static {
        int i = 1 + 109;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public BillManagerDoMoreSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
