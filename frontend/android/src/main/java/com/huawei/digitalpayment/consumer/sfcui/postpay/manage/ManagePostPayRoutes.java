package com.huawei.digitalpayment.consumer.sfcui.postpay.manage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes;", "", "<init>", "()V", "ChangeEmailAddress", "OtherPostpayPlans", "TerminatePostpay", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes$ChangeEmailAddress;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes$OtherPostpayPlans;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes$TerminatePostpay;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ManagePostPayRoutes {
    public static final int $stable = 0;
    private static int component2 = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes$ChangeEmailAddress;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangeEmailAddress extends ManagePostPayRoutes {
        public static final int $stable = 0;
        public static final ChangeEmailAddress INSTANCE = new ChangeEmailAddress();
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private ChangeEmailAddress() {
            super(null);
        }

        static {
            int i = copydefault + 21;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    private ManagePostPayRoutes() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes$OtherPostpayPlans;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OtherPostpayPlans extends ManagePostPayRoutes {
        public static final int $stable = 0;
        public static final OtherPostpayPlans INSTANCE = new OtherPostpayPlans();
        private static int ShareDataUIState = 1;
        private static int component3;

        private OtherPostpayPlans() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 73;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i = 1 + 11;
        component3 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes$TerminatePostpay;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/ManagePostPayRoutes;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TerminatePostpay extends ManagePostPayRoutes {
        public static final int $stable = 0;
        public static final TerminatePostpay INSTANCE = new TerminatePostpay();
        private static int component2 = 1;
        private static int copydefault;

        private TerminatePostpay() {
            super(null);
        }

        static {
            int i = copydefault + 83;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }

    public ManagePostPayRoutes(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
