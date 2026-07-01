package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/VoiceBalanceAction;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceNavigationAction;", "<init>", "()V", "GoToBuyMinutes", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/VoiceBalanceAction$GoToBuyMinutes;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class VoiceBalanceAction implements BalanceNavigationAction {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/VoiceBalanceAction$GoToBuyMinutes;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/VoiceBalanceAction;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToBuyMinutes extends VoiceBalanceAction {
        public static final int $stable = 0;
        public static final GoToBuyMinutes INSTANCE = new GoToBuyMinutes();
        private static int component1 = 1;
        private static int component3;

        private GoToBuyMinutes() {
            super(null);
        }

        static {
            int i = component1 + 121;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    private VoiceBalanceAction() {
    }

    static {
        int i = 1 + 57;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public VoiceBalanceAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
