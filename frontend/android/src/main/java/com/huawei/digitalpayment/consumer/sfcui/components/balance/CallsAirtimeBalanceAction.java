package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/CallsAirtimeBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToBuyAirtime", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/CallsAirtimeBalanceAction$GoToBuyAirtime;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CallsAirtimeBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int component1 = 33 % 128;
    private static int component3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/CallsAirtimeBalanceAction$GoToBuyAirtime;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/CallsAirtimeBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToBuyAirtime extends CallsAirtimeBalanceAction {
        public static final int $stable = 0;
        public static final GoToBuyAirtime INSTANCE = new GoToBuyAirtime();
        private static int component3 = 0;
        private static int copydefault = 1;

        private GoToBuyAirtime() {
            super(null);
        }

        static {
            int i = copydefault + 49;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 65 / 0;
            }
        }
    }

    private CallsAirtimeBalanceAction() {
    }

    static {
        if (33 % 2 == 0) {
            int i = 75 / 0;
        }
    }

    public CallsAirtimeBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
