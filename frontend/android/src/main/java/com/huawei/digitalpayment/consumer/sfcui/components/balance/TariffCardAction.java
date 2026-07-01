package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/TariffCardAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToSwitchLines", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/TariffCardAction$GoToSwitchLines;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TariffCardAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/TariffCardAction$GoToSwitchLines;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/TariffCardAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToSwitchLines extends TariffCardAction {
        public static final int $stable = 0;
        public static final GoToSwitchLines INSTANCE = new GoToSwitchLines();
        private static int component3 = 0;
        private static int copydefault = 1;

        private GoToSwitchLines() {
            super(null);
        }

        static {
            int i = component3 + 65;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }

    private TariffCardAction() {
    }

    static {
        int i = 1 + 19;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public TariffCardAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
