package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "", "<init>", "()V", "TransactionItem", "MiniAppItem", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$MiniAppItem;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$TransactionItem;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FrequentItem {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$TransactionItem;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;)V", "getData", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransaction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransactionItem extends FrequentItem {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault = 49 % 128;
        private final FrequentTransaction component3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionItem(FrequentTransaction frequentTransaction) {
            super(null);
            Intrinsics.checkNotNullParameter(frequentTransaction, "");
            this.component3 = frequentTransaction;
        }

        public final FrequentTransaction getData() {
            int i = 2 % 2;
            int i2 = component1 + 55;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            FrequentTransaction frequentTransaction = this.component3;
            int i5 = i3 + 65;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 56 / 0;
            }
            return frequentTransaction;
        }

        static {
            if (49 % 2 == 0) {
                int i = 28 / 0;
            }
        }

        public static TransactionItem copy$default(TransactionItem transactionItem, FrequentTransaction frequentTransaction, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component2 + 25;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    frequentTransaction = transactionItem.component3;
                    int i4 = 25 / 0;
                } else {
                    frequentTransaction = transactionItem.component3;
                }
            }
            TransactionItem transactionItemCopy = transactionItem.copy(frequentTransaction);
            int i5 = component2 + 85;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return transactionItemCopy;
        }

        public final FrequentTransaction component1() {
            int i = 2 % 2;
            int i2 = component2 + 17;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final TransactionItem copy(FrequentTransaction data) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(data, "");
            TransactionItem transactionItem = new TransactionItem(data);
            int i2 = component2 + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return transactionItem;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 47;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof TransactionItem)) {
                int i4 = component1 + 95;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component3, ((TransactionItem) other).component3))) {
                return true;
            }
            int i6 = component1 + 95;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 35;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.component3.hashCode();
                throw null;
            }
            int iHashCode = this.component3.hashCode();
            int i3 = component2 + 55;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "TransactionItem(data=" + this.component3 + ")";
            int i2 = component2 + 121;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }

    private FrequentItem() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem$MiniAppItem;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentItem;", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentMiniApp;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentMiniApp;)V", "getData", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentMiniApp;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MiniAppItem extends FrequentItem {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;
        private final FrequentMiniApp copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniAppItem(FrequentMiniApp frequentMiniApp) {
            super(null);
            Intrinsics.checkNotNullParameter(frequentMiniApp, "");
            this.copydefault = frequentMiniApp;
        }

        public final FrequentMiniApp getData() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            FrequentMiniApp frequentMiniApp = this.copydefault;
            int i5 = i3 + 91;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return frequentMiniApp;
        }

        static {
            int i = 1 + 81;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 6 / 0;
            }
        }

        public static MiniAppItem copy$default(MiniAppItem miniAppItem, FrequentMiniApp frequentMiniApp, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 63;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 35;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    FrequentMiniApp frequentMiniApp2 = miniAppItem.copydefault;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                frequentMiniApp = miniAppItem.copydefault;
            }
            return miniAppItem.copy(frequentMiniApp);
        }

        public final FrequentMiniApp component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 103;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            FrequentMiniApp frequentMiniApp = this.copydefault;
            int i5 = i2 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return frequentMiniApp;
        }

        public final MiniAppItem copy(FrequentMiniApp data) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(data, "");
            MiniAppItem miniAppItem = new MiniAppItem(data);
            int i2 = ShareDataUIState + 121;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return miniAppItem;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            Object obj = null;
            if (other instanceof MiniAppItem) {
                if (!Intrinsics.areEqual(this.copydefault, ((MiniAppItem) other).copydefault)) {
                    return false;
                }
                int i2 = component2 + 115;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = component2;
            int i4 = i3 + 57;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 23;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = component2 + 83;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MiniAppItem(data=" + this.copydefault + ")";
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
            return str;
        }
    }

    static {
        int i = 1 + 39;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public FrequentItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
