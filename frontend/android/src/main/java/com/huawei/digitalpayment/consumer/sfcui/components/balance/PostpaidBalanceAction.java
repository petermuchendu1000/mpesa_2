package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToRequestBill", "GoToPayBill", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction$GoToPayBill;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction$GoToRequestBill;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PostpaidBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction$GoToRequestBill;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToRequestBill extends PostpaidBalanceAction {
        public static final int $stable = 0;
        public static final GoToRequestBill INSTANCE = new GoToRequestBill();
        private static int ShareDataUIState = 1;
        private static int component1;

        private GoToRequestBill() {
            super(null);
        }

        static {
            int i = component1 + 53;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }

    private PostpaidBalanceAction() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction$GoToPayBill;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/PostpaidBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToPayBill extends PostpaidBalanceAction {
        public static final int $stable = 0;
        public static final GoToPayBill INSTANCE = new GoToPayBill();
        private static int component1 = 0;
        private static int component3 = 1;

        private GoToPayBill() {
            super(null);
        }

        static {
            int i = component3 + 1;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 69;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PostpaidBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
