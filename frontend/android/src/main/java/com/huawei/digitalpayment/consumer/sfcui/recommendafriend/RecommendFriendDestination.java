package com.huawei.digitalpayment.consumer.sfcui.recommendafriend;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination;", "", "<init>", "()V", "Main", "Success", "AlreadyRecommended", "MaxReached", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$AlreadyRecommended;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$Main;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$MaxReached;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$Success;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RecommendFriendDestination {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$Main;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Main extends RecommendFriendDestination {
        public static final int $stable = 0;
        public static final Main INSTANCE = new Main();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private Main() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 45;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }

    private RecommendFriendDestination() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$Success;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends RecommendFriendDestination {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();
        private static int ShareDataUIState = 1;
        private static int component3;

        private Success() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 7;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    static {
        int i = 1 + 97;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$AlreadyRecommended;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlreadyRecommended extends RecommendFriendDestination {
        public static final int $stable = 0;
        public static final AlreadyRecommended INSTANCE = new AlreadyRecommended();
        private static int component1 = 1;
        private static int copydefault;

        private AlreadyRecommended() {
            super(null);
        }

        static {
            int i = copydefault + 7;
            component1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 70 / 0;
            }
        }
    }

    public RecommendFriendDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination$MaxReached;", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/RecommendFriendDestination;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MaxReached extends RecommendFriendDestination {
        public static final int $stable = 0;
        public static final MaxReached INSTANCE = new MaxReached();
        private static int component2 = 0;
        private static int copydefault = 1;

        private MaxReached() {
            super(null);
        }

        static {
            int i = component2 + 23;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
