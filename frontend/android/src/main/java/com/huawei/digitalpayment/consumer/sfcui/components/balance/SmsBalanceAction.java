package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/SmsBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToBuySms", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/SmsBalanceAction$GoToBuySms;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SmsBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int component2 = 1;
    private static int copydefault;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/SmsBalanceAction$GoToBuySms;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/SmsBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToBuySms extends SmsBalanceAction {
        public static final int $stable = 0;
        public static final GoToBuySms INSTANCE = new GoToBuySms();
        private static int component1 = 1;
        private static int component3;

        private GoToBuySms() {
            super(null);
        }

        static {
            int i = component1 + 61;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    private SmsBalanceAction() {
    }

    static {
        int i = 1 + 123;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public SmsBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
