package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "", "<init>", "()V", "CheckLipaCost", "ClearError", "DismissLipaResult", "SelectTab", "UpdateLipaAmount", "UpdateLipaShortCode", "UpdateSendWithdrawAmount", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$CheckLipaCost;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$ClearError;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$DismissLipaResult;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$SelectTab;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$UpdateLipaAmount;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$UpdateLipaShortCode;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$UpdateSendWithdrawAmount;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CostCalculatorEvent {
    public static final int $stable = 0;
    private static int component2 = 51 % 128;
    private static int component3;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$CheckLipaCost;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckLipaCost extends CostCalculatorEvent {
        public static final int $stable = 0;
        public static final CheckLipaCost INSTANCE = new CheckLipaCost();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;

        private CheckLipaCost() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 17;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckLipaCost)) {
                int i2 = component1 + 27;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i3 = component2 + 103;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 67;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
            return -1452759363;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 91;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return "CheckLipaCost";
            }
            throw null;
        }
    }

    private CostCalculatorEvent() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$ClearError;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearError extends CostCalculatorEvent {
        public static final int $stable = 0;
        public static final ClearError INSTANCE = new ClearError();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;

        private ClearError() {
            super(null);
        }

        static {
            int i = component2 + 91;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 5;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof ClearError)) {
                return false;
            }
            int i4 = component1 + 105;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 91;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return -1324638847;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 119;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 7 / 0;
            }
            int i5 = i2 + 5;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return "ClearError";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 51 % 2;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$DismissLipaResult;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissLipaResult extends CostCalculatorEvent {
        public static final int $stable = 0;
        public static final DismissLipaResult INSTANCE = new DismissLipaResult();
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private DismissLipaResult() {
            super(null);
        }

        static {
            int i = component1 + 23;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 13;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof DismissLipaResult) {
                return true;
            }
            int i4 = component2 + 77;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 67;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return 1590394767;
            }
            int i3 = 61 / 0;
            return 1590394767;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 125;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "DismissLipaResult";
        }
    }

    public CostCalculatorEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$SelectTab;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "tab", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;)V", "getTab", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectTab extends CostCalculatorEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 33 % 128;
        private static int component3;
        private final CostCalculatorTab copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectTab(CostCalculatorTab costCalculatorTab) {
            super(null);
            Intrinsics.checkNotNullParameter(costCalculatorTab, "");
            this.copydefault = costCalculatorTab;
        }

        public final CostCalculatorTab getTab() {
            int i = 2 % 2;
            int i2 = component1 + 115;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            CostCalculatorTab costCalculatorTab = this.copydefault;
            int i5 = i3 + 91;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return costCalculatorTab;
        }

        static {
            if (33 % 2 == 0) {
                int i = 81 / 0;
            }
        }

        public static SelectTab copy$default(SelectTab selectTab, CostCalculatorTab costCalculatorTab, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 43;
            component3 = i4 % 128;
            int i5 = i & 1;
            if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
                costCalculatorTab = selectTab.copydefault;
                int i6 = i3 + 13;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
            return selectTab.copy(costCalculatorTab);
        }

        public final CostCalculatorTab component1() {
            int i = 2 % 2;
            int i2 = component3 + 65;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final SelectTab copy(CostCalculatorTab tab) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(tab, "");
            SelectTab selectTab = new SelectTab(tab);
            int i2 = component1 + 95;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return selectTab;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 7;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectTab)) {
                return false;
            }
            if (this.copydefault != ((SelectTab) other).copydefault) {
                int i4 = i3 + 7;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = i3 + 125;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 43;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = component1 + 91;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SelectTab(tab=" + this.copydefault + ")";
            int i2 = component3 + 25;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$UpdateLipaAmount;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateLipaAmount extends CostCalculatorEvent {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1 % 128;
        private static int component3 = 1;
        private static int copydefault;
        private final String ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateLipaAmount(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 63;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 37;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            if (1 % 2 == 0) {
                int i = 16 / 0;
            }
        }

        public static UpdateLipaAmount copy$default(UpdateLipaAmount updateLipaAmount, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component1 + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                str = updateLipaAmount.ShareDataUIState;
            }
            UpdateLipaAmount updateLipaAmountCopy = updateLipaAmount.copy(str);
            int i5 = component3 + 121;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return updateLipaAmountCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 71;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return str;
        }

        public final UpdateLipaAmount copy(String value) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(value, "");
            UpdateLipaAmount updateLipaAmount = new UpdateLipaAmount(value);
            int i2 = component1 + 41;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 47 / 0;
            }
            return updateLipaAmount;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 35;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateLipaAmount)) {
                int i4 = i2 + 73;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.ShareDataUIState, ((UpdateLipaAmount) other).ShareDataUIState)) {
                int i6 = component1 + 121;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = component3 + 71;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 78 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 91;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.ShareDataUIState.hashCode();
                throw null;
            }
            int iHashCode = this.ShareDataUIState.hashCode();
            int i3 = component3 + 7;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UpdateLipaAmount(value=" + this.ShareDataUIState + ")";
            int i2 = component1 + 1;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$UpdateLipaShortCode;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateLipaShortCode extends CostCalculatorEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final String component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateLipaShortCode(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 57;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.component2;
            int i4 = i3 + 45;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static {
            int i = 1 + 101;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static UpdateLipaShortCode copy$default(UpdateLipaShortCode updateLipaShortCode, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 17;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                str = updateLipaShortCode.component2;
                int i6 = i4 + 53;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 3 % 3;
                }
            }
            return updateLipaShortCode.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 81;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 41;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return str;
        }

        public final UpdateLipaShortCode copy(String value) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(value, "");
            UpdateLipaShortCode updateLipaShortCode = new UpdateLipaShortCode(value);
            int i2 = component1 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return updateLipaShortCode;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, ((com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode) r6).component2) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.component1 + 109;
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.ShareDataUIState = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 37;
            com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.component1 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if ((r1 % 2) != 0) goto L11;
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.ShareDataUIState
                int r2 = r1 + 121
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.component1 = r3
                int r2 = r2 % r0
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L16
                r2 = 43
                int r2 = r2 / r4
                if (r5 != r6) goto L23
                goto L18
            L16:
                if (r5 != r6) goto L23
            L18:
                int r1 = r1 + 37
                int r6 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.component1 = r6
                int r1 = r1 % r0
                if (r1 != 0) goto L22
                return r4
            L22:
                return r3
            L23:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode
                if (r1 != 0) goto L28
                return r4
            L28:
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent$UpdateLipaShortCode r6 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode) r6
                java.lang.String r1 = r5.component2
                java.lang.String r6 = r6.component2
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                if (r6 != 0) goto L3e
                int r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.component1
                int r6 = r6 + 109
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.ShareDataUIState = r1
                int r6 = r6 % r0
                return r4
            L3e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent.UpdateLipaShortCode.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = component1 + 63;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.component2.hashCode();
                int i3 = 9 / 0;
            } else {
                iHashCode = this.component2.hashCode();
            }
            int i4 = component1 + 119;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UpdateLipaShortCode(value=" + this.component2 + ")";
            int i2 = component1 + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent$UpdateSendWithdrawAmount;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateSendWithdrawAmount extends CostCalculatorEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 125 % 128;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateSendWithdrawAmount(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = component1 + 19;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 125 % 2;
        }

        public static UpdateSendWithdrawAmount copy$default(UpdateSendWithdrawAmount updateSendWithdrawAmount, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 103;
            copydefault = i3 % 128;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                str = updateSendWithdrawAmount.component2;
            }
            UpdateSendWithdrawAmount updateSendWithdrawAmountCopy = updateSendWithdrawAmount.copy(str);
            int i4 = copydefault + 35;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return updateSendWithdrawAmountCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1 + 113;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 119;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final UpdateSendWithdrawAmount copy(String value) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(value, "");
            UpdateSendWithdrawAmount updateSendWithdrawAmount = new UpdateSendWithdrawAmount(value);
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return updateSendWithdrawAmount;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 47;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateSendWithdrawAmount) || !Intrinsics.areEqual(this.component2, ((UpdateSendWithdrawAmount) other).component2)) {
                return false;
            }
            int i3 = copydefault + 105;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 18 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            if (i3 != 0) {
                int i4 = 32 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UpdateSendWithdrawAmount(value=" + this.component2 + ")";
            int i2 = component1 + 43;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
