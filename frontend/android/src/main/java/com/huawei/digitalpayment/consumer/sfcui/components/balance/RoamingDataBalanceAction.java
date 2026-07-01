package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/RoamingDataBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToBuyData", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/RoamingDataBalanceAction$GoToBuyData;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RoamingDataBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int component1 = 21 % 128;
    private static int copydefault;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/RoamingDataBalanceAction$GoToBuyData;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/RoamingDataBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToBuyData extends RoamingDataBalanceAction {
        public static final int $stable = 0;
        public static final GoToBuyData INSTANCE = new GoToBuyData();
        private static int component1 = 0;
        private static int component3 = 1;

        private GoToBuyData() {
            super(null);
        }

        static {
            int i = component1 + 23;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    private RoamingDataBalanceAction() {
    }

    static {
        int i = 21 % 2;
    }

    public RoamingDataBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
