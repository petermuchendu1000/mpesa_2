package com.huawei.digitalpayment.history.model;

import dagger.internal.Factory;

public final class TransactionHistoryModel_Factory implements Factory<TransactionHistoryModel> {
    private static int component1 = 0;
    private static int component2 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryModel transactionHistoryModel = get();
        int i4 = component1 + 89;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return transactionHistoryModel;
    }

    @Override
    public TransactionHistoryModel get() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryModel transactionHistoryModelNewInstance = newInstance();
        int i4 = component1 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return transactionHistoryModelNewInstance;
    }

    public static TransactionHistoryModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryModel_Factory transactionHistoryModel_Factory = component1.component1;
        if (i3 != 0) {
            return transactionHistoryModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransactionHistoryModel newInstance() {
        int i = 2 % 2;
        TransactionHistoryModel transactionHistoryModel = new TransactionHistoryModel();
        int i2 = component2 + 119;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionHistoryModel;
        }
        throw null;
    }

    static final class component1 {
        static final TransactionHistoryModel_Factory component1 = new TransactionHistoryModel_Factory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component3 + 1;
            copydefault = i % 128;
            int i2 = i % 2;
        }
    }
}
