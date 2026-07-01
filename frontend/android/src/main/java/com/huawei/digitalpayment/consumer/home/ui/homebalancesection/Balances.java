package com.huawei.digitalpayment.consumer.home.ui.homebalancesection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances;", "", "<init>", "()V", "Mpesa", "Gsm", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances$Gsm;", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances$Mpesa;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Balances {
    public static final int $stable = 0;
    private static int component1 = 101 % 128;
    private static int component2;

    private Balances() {
    }

    static {
        int i = 101 % 2;
    }

    public Balances(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances$Mpesa;", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances;", "mpesaBalanceUiState", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/MpesaBalanceUiState;", "<init>", "(Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/MpesaBalanceUiState;)V", "getMpesaBalanceUiState", "()Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/MpesaBalanceUiState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mpesa extends Balances {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 0;
        private static int copydefault = 39 % 128;
        private final MpesaBalanceUiState component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Mpesa(MpesaBalanceUiState mpesaBalanceUiState) {
            super(null);
            Intrinsics.checkNotNullParameter(mpesaBalanceUiState, "");
            this.component2 = mpesaBalanceUiState;
        }

        public Mpesa(MpesaBalanceUiState mpesaBalanceUiState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                mpesaBalanceUiState = new MpesaBalanceUiState(null, null, false, false, false, false, null, false, 255, null);
                int i2 = ShareDataUIState + 105;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 3;
                } else {
                    int i4 = 2 % 2;
                }
            }
            this(mpesaBalanceUiState);
        }

        public final MpesaBalanceUiState getMpesaBalanceUiState() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 37;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            MpesaBalanceUiState mpesaBalanceUiState = this.component2;
            int i5 = i2 + 75;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return mpesaBalanceUiState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (39 % 2 == 0) {
                int i = 79 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Mpesa() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static Mpesa copy$default(Mpesa mpesa, MpesaBalanceUiState mpesaBalanceUiState, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 17;
            component3 = i3 % 128;
            int i4 = i & 1;
            if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
                mpesaBalanceUiState = mpesa.component2;
            }
            Mpesa mpesaCopy = mpesa.copy(mpesaBalanceUiState);
            int i5 = component3 + 91;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return mpesaCopy;
        }

        public final MpesaBalanceUiState component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 123;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            MpesaBalanceUiState mpesaBalanceUiState = this.component2;
            int i4 = i2 + 65;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return mpesaBalanceUiState;
            }
            obj.hashCode();
            throw null;
        }

        public final Mpesa copy(MpesaBalanceUiState mpesaBalanceUiState) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(mpesaBalanceUiState, "");
            Mpesa mpesa = new Mpesa(mpesaBalanceUiState);
            int i2 = ShareDataUIState + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return mpesa;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 119;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if ((!(other instanceof Mpesa)) || !Intrinsics.areEqual(this.component2, ((Mpesa) other).component2)) {
                return false;
            }
            int i3 = component3 + 85;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = component3 + 73;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Mpesa(mpesaBalanceUiState=" + this.component2 + ")";
            int i2 = component3 + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances$Gsm;", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/Balances;", "gsmBalances", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/GsmBalancesUiState;", "<init>", "(Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/GsmBalancesUiState;)V", "getGsmBalances", "()Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/GsmBalancesUiState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gsm extends Balances {
        public static final int $stable = 8;
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;
        private final GsmBalancesUiState component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gsm(GsmBalancesUiState gsmBalancesUiState) {
            super(null);
            Intrinsics.checkNotNullParameter(gsmBalancesUiState, "");
            this.component1 = gsmBalancesUiState;
        }

        public Gsm(GsmBalancesUiState gsmBalancesUiState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                gsmBalancesUiState = new GsmBalancesUiState(null, false, 3, null);
                int i2 = component3 + 77;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            this(gsmBalancesUiState);
        }

        public final GsmBalancesUiState getGsmBalances() {
            int i = 2 % 2;
            int i2 = component3 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            GsmBalancesUiState gsmBalancesUiState = this.component1;
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
            return gsmBalancesUiState;
        }

        static {
            int i = 1 + 25;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Gsm() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static Gsm copy$default(Gsm gsm, GsmBalancesUiState gsmBalancesUiState, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                gsmBalancesUiState = gsm.component1;
            }
            Gsm gsmCopy = gsm.copy(gsmBalancesUiState);
            int i5 = ShareDataUIState + 37;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return gsmCopy;
            }
            throw null;
        }

        public final GsmBalancesUiState component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            GsmBalancesUiState gsmBalancesUiState = this.component1;
            int i5 = i3 + 61;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return gsmBalancesUiState;
        }

        public final Gsm copy(GsmBalancesUiState gsmBalances) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(gsmBalances, "");
            Gsm gsm = new Gsm(gsmBalances);
            int i2 = component3 + 77;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 65 / 0;
            }
            return gsm;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 123;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Gsm) {
                return Intrinsics.areEqual(this.component1, ((Gsm) other).component1);
            }
            int i4 = component3 + 107;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 13;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = ShareDataUIState + 11;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Gsm(gsmBalances=" + this.component1 + ")";
            int i2 = component3 + 15;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
            }
            return str;
        }
    }
}
