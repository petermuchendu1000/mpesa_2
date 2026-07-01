package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEventName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction;", "", "<init>", "()V", "BuyGoods", "PayBill", ReferenceDataEventName.SendMoney, ReferenceDataEventName.WithdrawAtAgent, "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$BuyGoods;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$PayBill;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$SendMoney;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$WithdrawAtAgent;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FrequentTransactionAction {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$BuyGoods;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction;", "name", "", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BuyGoods extends FrequentTransactionAction {
        public static final int $stable = 0;
        private static int component1 = 43 % 128;
        private static int component3 = 0;
        private static int copydefault = 0;
        private static int getAsAtTimestamp = 1;
        private final String ShareDataUIState;
        private final String component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyGoods(String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.component2 = str;
            this.ShareDataUIState = str2;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = component3 + 121;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 45;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getNumber() {
            int i = 2 % 2;
            int i2 = component3 + 11;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.ShareDataUIState;
            int i4 = i3 + 91;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static {
            int i = 43 % 2;
        }

        public static BuyGoods copy$default(BuyGoods buyGoods, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 37;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                str = buyGoods.component2;
                int i5 = i3 + 57;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
            }
            Object obj2 = null;
            if ((i & 2) != 0) {
                int i7 = i3 + 35;
                getAsAtTimestamp = i7 % 128;
                if (i7 % 2 == 0) {
                    String str3 = buyGoods.ShareDataUIState;
                    obj2.hashCode();
                    throw null;
                }
                str2 = buyGoods.ShareDataUIState;
            }
            BuyGoods buyGoodsCopy = buyGoods.copy(str, str2);
            int i8 = getAsAtTimestamp + 109;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                return buyGoodsCopy;
            }
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3 + 29;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 109;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 75;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.ShareDataUIState;
            int i4 = i2 + 113;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final BuyGoods copy(String name, String number) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            BuyGoods buyGoods = new BuyGoods(name, number);
            int i2 = component3 + 83;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return buyGoods;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 9;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                int i4 = i2 + 25;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(other instanceof BuyGoods)) {
                int i6 = i2 + 119;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.component2, ((BuyGoods) other).component2)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.ShareDataUIState, r6.ShareDataUIState))) {
                return true;
            }
            int i8 = component3 + 109;
            getAsAtTimestamp = i8 % 128;
            return i8 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.ShareDataUIState.hashCode();
            int i4 = component3 + 55;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BuyGoods(name=" + this.component2 + ", number=" + this.ShareDataUIState + ")";
            int i2 = component3 + 89;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    private FrequentTransactionAction() {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$PayBill;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction;", "name", "", "number", "secondaryNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNumber", "getSecondaryNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PayBill extends FrequentTransactionAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 99 % 128;
        private static int component4 = 0;
        private static int getAsAtTimestamp = 1;
        private final String component2;
        private final String component3;
        private final String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayBill(String str, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.component3 = str;
            this.copydefault = str2;
            this.component2 = str3;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 37;
            component4 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.component3;
            int i4 = i2 + 55;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final String getNumber() {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 67;
            getAsAtTimestamp = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.copydefault;
            int i4 = i2 + 97;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String getSecondaryNumber() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 111;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 9;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 28 / 0;
            }
            return str;
        }

        static {
            if (99 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static PayBill copy$default(PayBill payBill, String str, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component4;
            int i4 = i3 + 59;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0 && (i & 1) != 0) {
                int i5 = i3 + 75;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                str = payBill.component3;
            }
            if ((i & 2) != 0) {
                str2 = payBill.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = payBill.component2;
            }
            PayBill payBillCopy = payBill.copy(str, str2, str3);
            int i7 = getAsAtTimestamp + 63;
            component4 = i7 % 128;
            if (i7 % 2 == 0) {
                return payBillCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 101;
            int i3 = i2 % 128;
            component4 = i3;
            if (i2 % 2 != 0) {
                str = this.component3;
                int i4 = 22 / 0;
            } else {
                str = this.component3;
            }
            int i5 = i3 + 113;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 17;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component4 + 101;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 21;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final PayBill copy(String name, String number, String secondaryNumber) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            PayBill payBill = new PayBill(name, number, secondaryNumber);
            int i2 = component4 + 5;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 19 / 0;
            }
            return payBill;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 45;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 17;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof PayBill)) {
                int i7 = i2 + 53;
                getAsAtTimestamp = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            PayBill payBill = (PayBill) other;
            if (!Intrinsics.areEqual(this.component3, payBill.component3)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, payBill.copydefault)) {
                return Intrinsics.areEqual(this.component2, payBill.component2);
            }
            int i9 = component4 + 35;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            String str;
            int iHashCode;
            int i = 2 % 2;
            int i2 = component4 + 3;
            getAsAtTimestamp = i2 % 128;
            int iHashCode2 = 0;
            if (i2 % 2 == 0) {
                str = this.component3;
                iHashCode = 1;
                if (str != null) {
                    iHashCode2 = 1;
                    iHashCode = iHashCode2;
                    iHashCode2 = str.hashCode();
                }
            } else {
                str = this.component3;
                if (str == null) {
                    iHashCode = 0;
                } else {
                    iHashCode = iHashCode2;
                    iHashCode2 = str.hashCode();
                }
            }
            int iHashCode3 = this.copydefault.hashCode();
            String str2 = this.component2;
            if (str2 == null) {
                int i3 = component4 + 75;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iHashCode = str2.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PayBill(name=" + this.component3 + ", number=" + this.copydefault + ", secondaryNumber=" + this.component2 + ")";
            int i2 = component4 + 79;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static {
        int i = 1 + 117;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$SendMoney;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction;", "name", "", "number", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendMoney extends FrequentTransactionAction {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int copy = 1;
        private final String component3;
        private final String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMoney(String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.component3 = str2;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = copy + 31;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            throw null;
        }

        public final String getNumber() {
            int i = 2 % 2;
            int i2 = copy + 29;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 1 + 119;
            component1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static SendMoney copy$default(SendMoney sendMoney, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copy + 101;
            int i4 = i3 % 128;
            component2 = i4;
            if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                str = sendMoney.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = sendMoney.component3;
                int i5 = i4 + 27;
                copy = i5 % 128;
                int i6 = i5 % 2;
            }
            return sendMoney.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 43;
            int i3 = i2 % 128;
            copy = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.copydefault;
            int i4 = i3 + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2 + 11;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 105;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 41 / 0;
            }
            return str;
        }

        public final SendMoney copy(String name, String number) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            SendMoney sendMoney = new SendMoney(name, number);
            int i2 = component2 + 39;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return sendMoney;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendMoney)) {
                int i2 = copy;
                int i3 = i2 + 43;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 83;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SendMoney sendMoney = (SendMoney) other;
            if (!Intrinsics.areEqual(this.copydefault, sendMoney.copydefault)) {
                int i6 = component2 + 79;
                copy = i6 % 128;
                return i6 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.component3, sendMoney.component3)) {
                return true;
            }
            int i7 = component2 + 97;
            copy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 63;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            if (str == null) {
                int i5 = i2 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode * 31) + this.component3.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SendMoney(name=" + this.copydefault + ", number=" + this.component3 + ")";
            int i2 = copy + 49;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    public FrequentTransactionAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction$WithdrawAtAgent;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionAction;", "name", "", "number", "secondaryNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNumber", "getSecondaryNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithdrawAtAgent extends FrequentTransactionAction {
        public static final int $stable = 0;
        private static int component3 = 1;
        private static int component4 = 1;
        private static int copydefault;
        private static int equals;
        private final String ShareDataUIState;
        private final String component1;
        private final String component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawAtAgent(String str, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            this.ShareDataUIState = str;
            this.component2 = str2;
            this.component1 = str3;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 31;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 115;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getNumber() {
            int i = 2 % 2;
            int i2 = equals + 119;
            int i3 = i2 % 128;
            component4 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.component2;
            int i4 = i3 + 123;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 32 / 0;
            }
            return str;
        }

        public final String getSecondaryNumber() {
            String str;
            int i = 2 % 2;
            int i2 = equals + 21;
            int i3 = i2 % 128;
            component4 = i3;
            if (i2 % 2 == 0) {
                str = this.component1;
                int i4 = 65 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i3 + 41;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 67 / 0;
            }
            return str;
        }

        static {
            int i = 1 + 105;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static WithdrawAtAgent copy$default(WithdrawAtAgent withdrawAtAgent, String str, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component4 + 25;
            int i4 = i3 % 128;
            equals = i4;
            if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                str = withdrawAtAgent.ShareDataUIState;
            }
            if ((i & 2) != 0) {
                int i5 = i4 + 105;
                component4 = i5 % 128;
                int i6 = i5 % 2;
                str2 = withdrawAtAgent.component2;
            }
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i7 = i4 + 49;
                component4 = i7 % 128;
                if (i7 % 2 == 0) {
                    String str4 = withdrawAtAgent.component1;
                    throw null;
                }
                str3 = withdrawAtAgent.component1;
            }
            WithdrawAtAgent withdrawAtAgentCopy = withdrawAtAgent.copy(str, str2, str3);
            int i8 = equals + 55;
            component4 = i8 % 128;
            if (i8 % 2 != 0) {
                return withdrawAtAgentCopy;
            }
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component4 + 31;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 75;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component4 + 113;
            int i3 = i2 % 128;
            equals = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.component2;
            int i4 = i3 + 5;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = equals + 53;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final WithdrawAtAgent copy(String name, String number, String secondaryNumber) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(number, "");
            WithdrawAtAgent withdrawAtAgent = new WithdrawAtAgent(name, number, secondaryNumber);
            int i2 = equals + 47;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return withdrawAtAgent;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 57;
            int i4 = i3 % 128;
            component4 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 125;
                equals = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(other instanceof WithdrawAtAgent)) {
                int i8 = i2 + 31;
                component4 = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            WithdrawAtAgent withdrawAtAgent = (WithdrawAtAgent) other;
            if (Intrinsics.areEqual(this.ShareDataUIState, withdrawAtAgent.ShareDataUIState)) {
                return Intrinsics.areEqual(this.component2, withdrawAtAgent.component2) && Intrinsics.areEqual(this.component1, withdrawAtAgent.component1);
            }
            int i10 = component4 + 73;
            equals = i10 % 128;
            return i10 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = equals + 17;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.ShareDataUIState;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = equals + 41;
                component4 = i4 % 128;
                int i5 = i4 % 2;
            }
            int iHashCode2 = this.component2.hashCode();
            String str2 = this.component1;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "WithdrawAtAgent(name=" + this.ShareDataUIState + ", number=" + this.component2 + ", secondaryNumber=" + this.component1 + ")";
            int i2 = equals + 23;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
