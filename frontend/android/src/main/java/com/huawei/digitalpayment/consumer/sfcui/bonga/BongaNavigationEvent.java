package com.huawei.digitalpayment.consumer.sfcui.bonga;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "", "<init>", "()V", "LipaNaBonga", "RedeemPoints", "TransferPoints", "DonateBonga", "BongaCalculator", "ViewAllStatements", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$BongaCalculator;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$DonateBonga;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$LipaNaBonga;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$RedeemPoints;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$TransferPoints;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$ViewAllStatements;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BongaNavigationEvent {
    public static final int $stable = 0;
    private static int component3 = 0;
    private static int copydefault = 29 % 128;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$LipaNaBonga;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LipaNaBonga extends BongaNavigationEvent {
        public static final int $stable = 0;
        public static final LipaNaBonga INSTANCE = new LipaNaBonga();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        private LipaNaBonga() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 53;
            component1 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private BongaNavigationEvent() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$RedeemPoints;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RedeemPoints extends BongaNavigationEvent {
        public static final int $stable = 0;
        public static final RedeemPoints INSTANCE = new RedeemPoints();
        private static int component2 = 1;
        private static int component3;

        private RedeemPoints() {
            super(null);
        }

        static {
            int i = component2 + 63;
            component3 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 29 % 2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$TransferPoints;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransferPoints extends BongaNavigationEvent {
        public static final int $stable = 0;
        public static final TransferPoints INSTANCE = new TransferPoints();
        private static int component3 = 0;
        private static int copydefault = 1;

        private TransferPoints() {
            super(null);
        }

        static {
            int i = copydefault + 31;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    public BongaNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$DonateBonga;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DonateBonga extends BongaNavigationEvent {
        public static final int $stable = 0;
        public static final DonateBonga INSTANCE = new DonateBonga();
        private static int component1 = 0;
        private static int component3 = 1;

        private DonateBonga() {
            super(null);
        }

        static {
            int i = component1 + 91;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$BongaCalculator;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BongaCalculator extends BongaNavigationEvent {
        public static final int $stable = 0;
        public static final BongaCalculator INSTANCE = new BongaCalculator();
        private static int component2 = 0;
        private static int component3 = 1;

        private BongaCalculator() {
            super(null);
        }

        static {
            int i = component2 + 75;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent$ViewAllStatements;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/BongaNavigationEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewAllStatements extends BongaNavigationEvent {
        public static final int $stable = 0;
        public static final ViewAllStatements INSTANCE = new ViewAllStatements();
        private static int component2 = 0;
        private static int copydefault = 1;

        private ViewAllStatements() {
            super(null);
        }

        static {
            int i = component2 + 83;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
