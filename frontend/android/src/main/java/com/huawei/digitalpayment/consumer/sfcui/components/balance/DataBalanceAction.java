package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToShareData", "GoToBuyData", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction$GoToBuyData;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction$GoToShareData;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DataBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int component3 = 83 % 128;
    private static int copydefault;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction$GoToShareData;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToShareData extends DataBalanceAction {
        public static final int $stable = 0;
        public static final GoToShareData INSTANCE = new GoToShareData();
        private static int component1 = 1;
        private static int copydefault;

        private GoToShareData() {
            super(null);
        }

        static {
            int i = copydefault + 121;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    private DataBalanceAction() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction$GoToBuyData;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/DataBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToBuyData extends DataBalanceAction {
        public static final int $stable = 0;
        public static final GoToBuyData INSTANCE = new GoToBuyData();
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private GoToBuyData() {
            super(null);
        }

        static {
            int i = copydefault + 67;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }

    static {
        if (83 % 2 == 0) {
            int i = 31 / 0;
        }
    }

    public DataBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
