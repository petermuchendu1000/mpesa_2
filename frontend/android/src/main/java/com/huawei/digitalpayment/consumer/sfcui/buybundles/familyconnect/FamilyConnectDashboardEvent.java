package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent;", "", "<init>", "()V", "LoadBalance", "ClearError", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent$ClearError;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent$LoadBalance;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FamilyConnectDashboardEvent {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent$LoadBalance;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent;", "sponsorMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getSponsorMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadBalance extends FamilyConnectDashboardEvent {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadBalance(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
        }

        public final String getSponsorMsisdn() {
            int i = 2 % 2;
            int i2 = component3 + 117;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 113;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static {
            int i = 1 + 51;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 49 / 0;
            }
        }

        public static LoadBalance copy$default(LoadBalance loadBalance, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 11;
            component3 = i4 % 128;
            if (i4 % 2 == 0 && (i & 1) != 0) {
                str = loadBalance.ShareDataUIState;
                int i5 = i3 + 107;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 3;
                }
            }
            return loadBalance.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3 + 97;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ShareDataUIState;
            }
            throw null;
        }

        public final LoadBalance copy(String sponsorMsisdn) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
            LoadBalance loadBalance = new LoadBalance(sponsorMsisdn);
            int i2 = component3 + 59;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return loadBalance;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 103;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof LoadBalance)) {
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, ((LoadBalance) other).ShareDataUIState)) {
                return true;
            }
            int i4 = component3 + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 59;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.ShareDataUIState;
            if (i3 != 0) {
                return str.hashCode();
            }
            str.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoadBalance(sponsorMsisdn=" + this.ShareDataUIState + ")";
            int i2 = component1 + 25;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
            }
            return str;
        }
    }

    private FamilyConnectDashboardEvent() {
    }

    static {
        int i = 1 + 97;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent$ClearError;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDashboardEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearError extends FamilyConnectDashboardEvent {
        public static final int $stable = 0;
        public static final ClearError INSTANCE = new ClearError();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;

        private ClearError() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 5;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 99;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(other instanceof ClearError))) {
                return true;
            }
            int i4 = component3 + 49;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 107;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return 136329708;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 91;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "ClearError";
        }
    }

    public FamilyConnectDashboardEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
