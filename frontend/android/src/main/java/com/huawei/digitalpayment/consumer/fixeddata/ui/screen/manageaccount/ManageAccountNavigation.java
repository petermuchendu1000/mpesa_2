package com.huawei.digitalpayment.consumer.fixeddata.ui.screen.manageaccount;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation;", "", "<init>", "()V", "GoToRestartRouter", "GoToChangeWifiName", "GoToChangeWifiPassword", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation$GoToChangeWifiName;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation$GoToChangeWifiPassword;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation$GoToRestartRouter;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ManageAccountNavigation {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation$GoToRestartRouter;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation;", "<init>", "()V", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToRestartRouter extends ManageAccountNavigation {
        public static final int $stable = 0;
        public static final GoToRestartRouter INSTANCE = new GoToRestartRouter();
        private static int component3 = 0;
        private static int copydefault = 1;

        private GoToRestartRouter() {
            super(null);
        }

        static {
            int i = copydefault + 17;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }

    private ManageAccountNavigation() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation$GoToChangeWifiName;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation;", "<init>", "()V", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToChangeWifiName extends ManageAccountNavigation {
        public static final int $stable = 0;
        public static final GoToChangeWifiName INSTANCE = new GoToChangeWifiName();
        private static int component2 = 0;
        private static int copydefault = 1;

        private GoToChangeWifiName() {
            super(null);
        }

        static {
            int i = copydefault + 121;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i = 1 + 71;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation$GoToChangeWifiPassword;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation;", "<init>", "()V", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GoToChangeWifiPassword extends ManageAccountNavigation {
        public static final int $stable = 0;
        public static final GoToChangeWifiPassword INSTANCE = new GoToChangeWifiPassword();
        private static int component3 = 0;
        private static int copydefault = 1;

        private GoToChangeWifiPassword() {
            super(null);
        }

        static {
            int i = component3 + 89;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 29 / 0;
            }
        }
    }

    public ManageAccountNavigation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
