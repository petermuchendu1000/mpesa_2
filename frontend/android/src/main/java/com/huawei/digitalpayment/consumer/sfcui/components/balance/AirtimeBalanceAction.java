package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToSambaza", "GoToTopUp", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction$GoToSambaza;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction$GoToTopUp;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AirtimeBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int ShareDataUIState = 55 % 128;
    private static int component1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction$GoToSambaza;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToSambaza extends AirtimeBalanceAction {
        public static final int $stable = 0;
        public static final GoToSambaza INSTANCE = new GoToSambaza();
        private static int component1 = 1;
        private static int component3;

        private GoToSambaza() {
            super(null);
        }

        static {
            int i = component3 + 1;
            component1 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private AirtimeBalanceAction() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction$GoToTopUp;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/AirtimeBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToTopUp extends AirtimeBalanceAction {
        public static final int $stable = 0;
        public static final GoToTopUp INSTANCE = new GoToTopUp();
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        private GoToTopUp() {
            super(null);
        }

        static {
            int i = component2 + 59;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        if (55 % 2 == 0) {
            throw null;
        }
    }

    public AirtimeBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
