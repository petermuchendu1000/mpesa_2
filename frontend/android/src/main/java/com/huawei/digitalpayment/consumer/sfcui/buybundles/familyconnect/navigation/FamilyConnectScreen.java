package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation;

import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataOperationTypes;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "", "<init>", "()V", "CheckStatus", "BundleList", "Dashboard", ReferenceDataOperationTypes.CONFIRMATION, "AddBeneficiary", "UpdateBeneficiary", "DeleteBeneficiary", "ContactSelection", "PinEntry", "Success", "Error", "Close", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$AddBeneficiary;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$BundleList;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$CheckStatus;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$ContactSelection;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$DeleteBeneficiary;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$PinEntry;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Success;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$UpdateBeneficiary;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FamilyConnectScreen {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int copydefault;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$CheckStatus;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckStatus extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final CheckStatus INSTANCE = new CheckStatus();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;

        private CheckStatus() {
            super(null);
        }

        static {
            int i = component1 + 53;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckStatus)) {
                return false;
            }
            int i5 = i2 + 9;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 3;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 1132101171;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 9;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 63;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return "CheckStatus";
            }
            throw null;
        }
    }

    private FamilyConnectScreen() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$BundleList;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BundleList extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final BundleList INSTANCE = new BundleList();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private BundleList() {
            super(null);
        }

        static {
            int i = component2 + 117;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof BundleList)) {
                int i2 = copydefault + 63;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = component3 + 77;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 91;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 67 / 0;
            }
            return 973093383;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 111;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return "BundleList";
            }
            int i3 = 37 / 0;
            return "BundleList";
        }
    }

    static {
        int i = 1 + 9;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dashboard extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final Dashboard INSTANCE = new Dashboard();
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;

        private Dashboard() {
            super(null);
        }

        static {
            int i = component1 + 33;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (!(!(other instanceof Dashboard))) {
                    return true;
                }
                int i2 = component2 + 113;
                copydefault = i2 % 128;
                return i2 % 2 != 0;
            }
            int i3 = component2 + 37;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 5;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 53;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 47489005;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 33;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 123;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return "Dashboard";
            }
            obj.hashCode();
            throw null;
        }
    }

    public FamilyConnectScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Confirmation extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final Confirmation INSTANCE = new Confirmation();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;

        private Confirmation() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 29;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirmation)) {
                return false;
            }
            int i5 = i3 + 103;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 87;
            int i3 = i2 % 128;
            component1 = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 17;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return 497364028;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 115;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return ReferenceDataOperationTypes.CONFIRMATION;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$AddBeneficiary;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddBeneficiary extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final AddBeneficiary INSTANCE = new AddBeneficiary();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        private AddBeneficiary() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 43;
            component3 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary)) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            r1 = r1 + 107;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary.component1 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            return true;
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary.copydefault
                int r2 = r1 + 31
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary.component1 = r3
                int r2 = r2 % r0
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L16
                r2 = 74
                int r2 = r2 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary
                r2 = r2 ^ r4
                if (r2 == 0) goto L26
                int r1 = r1 + 107
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary.component1 = r6
                int r1 = r1 % r0
                return r3
            L26:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen$AddBeneficiary r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary) r6
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.AddBeneficiary.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 55;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 38 / 0;
            }
            return -1665785397;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 103;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
            return "AddBeneficiary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$UpdateBeneficiary;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateBeneficiary extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final UpdateBeneficiary INSTANCE = new UpdateBeneficiary();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;

        private UpdateBeneficiary() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 117;
            component2 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        
            if ((!(r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary)) == true) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 15;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary.component1 = r1 % 128;
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary.component3
                int r2 = r1 + 93
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary.component1 = r3
                int r2 = r2 % r0
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L16
                r2 = 17
                int r2 = r2 / r3
                if (r5 != r6) goto L20
                goto L18
            L16:
                if (r5 != r6) goto L20
            L18:
                int r1 = r1 + 15
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary.component1 = r6
                int r1 = r1 % r0
                return r4
            L20:
                boolean r0 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary
                r0 = r0 ^ r4
                if (r0 == r4) goto L28
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen$UpdateBeneficiary r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary) r6
                return r4
            L28:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.navigation.FamilyConnectScreen.UpdateBeneficiary.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 47;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 1894894261;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 43;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return "UpdateBeneficiary";
            }
            int i3 = 19 / 0;
            return "UpdateBeneficiary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$DeleteBeneficiary;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteBeneficiary extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final DeleteBeneficiary INSTANCE = new DeleteBeneficiary();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private DeleteBeneficiary() {
            super(null);
        }

        static {
            int i = component3 + 69;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 59;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof DeleteBeneficiary) {
                return true;
            }
            int i4 = component1 + 45;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 65;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 81;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return -1162347373;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 43;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return "DeleteBeneficiary";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$ContactSelection;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContactSelection extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final ContactSelection INSTANCE = new ContactSelection();
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        private ContactSelection() {
            super(null);
        }

        static {
            int i = component3 + 111;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 105;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof ContactSelection)) {
                int i4 = component2 + 83;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = copydefault + 25;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 75;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                int i4 = 58 / 0;
            }
            int i5 = i3 + 119;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return 1342395859;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 23;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return "ContactSelection";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$PinEntry;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "pinValidationType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;)V", "getPinValidationType", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PinEntry extends FamilyConnectScreen {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 53 % 128;
        private static int copydefault;
        private final PinValidationType ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinEntry(PinValidationType pinValidationType) {
            super(null);
            Intrinsics.checkNotNullParameter(pinValidationType, "");
            this.ShareDataUIState = pinValidationType;
        }

        public final PinValidationType getPinValidationType() {
            int i = 2 % 2;
            int i2 = component2 + 97;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ShareDataUIState;
            }
            throw null;
        }

        static {
            int i = 53 % 2;
        }

        public static PinEntry copy$default(PinEntry pinEntry, PinValidationType pinValidationType, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 13;
            component2 = i3 % 128;
            int i4 = i & 1;
            if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
                pinValidationType = pinEntry.ShareDataUIState;
            }
            PinEntry pinEntryCopy = pinEntry.copy(pinValidationType);
            int i5 = component1 + 109;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
            return pinEntryCopy;
        }

        public final PinValidationType component1() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 15;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            PinValidationType pinValidationType = this.ShareDataUIState;
            int i5 = i2 + 19;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return pinValidationType;
        }

        public final PinEntry copy(PinValidationType pinValidationType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(pinValidationType, "");
            PinEntry pinEntry = new PinEntry(pinValidationType);
            int i2 = component1 + 109;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return pinEntry;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 67;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof PinEntry) {
                return this.ShareDataUIState == ((PinEntry) other).ShareDataUIState;
            }
            int i4 = i2 + 85;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.ShareDataUIState.hashCode();
            int i4 = component2 + 21;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PinEntry(pinValidationType=" + this.ShareDataUIState + ")";
            int i2 = component1 + 43;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Success;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;

        private Success() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 91;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                int i2 = copydefault + 11;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = component1 + 125;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 59;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return -1687259236;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 75;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 0;
            }
            return "Success";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;

        private Error() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 87;
            component2 = i % 128;
            if (i % 2 == 0) {
                int i2 = 94 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            if (this != other) {
                if (!(other instanceof Error)) {
                    return false;
                }
                return true;
            }
            int i5 = i3 + 95;
            copydefault = i5 % 128;
            boolean z = i5 % 2 == 0;
            int i6 = i3 + 101;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
            return z;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 113;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
            return 677977057;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 113;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/navigation/FamilyConnectScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends FamilyConnectScreen {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;

        private Close() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 123;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 24 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 79;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof Close) {
                return true;
            }
            int i4 = i2 + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 33;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 675948497;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 27;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 35;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return "Close";
            }
            throw null;
        }
    }
}
