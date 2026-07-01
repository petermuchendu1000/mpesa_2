package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToTransfer", "GoToRedeem", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction$GoToRedeem;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction$GoToTransfer;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BongaBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int ShareDataUIState = 21 % 128;
    private static int component1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction$GoToTransfer;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToTransfer extends BongaBalanceAction {
        public static final int $stable = 0;
        public static final GoToTransfer INSTANCE = new GoToTransfer();
        private static int component3 = 1;
        private static int copydefault;

        private GoToTransfer() {
            super(null);
        }

        static {
            int i = copydefault + 15;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    private BongaBalanceAction() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction$GoToRedeem;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BongaBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToRedeem extends BongaBalanceAction {
        public static final int $stable = 0;
        public static final GoToRedeem INSTANCE = new GoToRedeem();
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private GoToRedeem() {
            super(null);
        }

        static {
            int i = copydefault + 115;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                int i2 = 55 / 0;
            }
        }
    }

    static {
        if (21 % 2 == 0) {
            throw null;
        }
    }

    public BongaBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
