package com.huawei.digitalpayment.history.viewmodel;

import com.huawei.digitalpayment.history.model.ITransactionHistoryModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class TransactionHistoryViewModel_Factory implements Factory<TransactionHistoryViewModel> {
    private static int component1 = 0;
    private static int component2 = 1;
    private final Provider<ITransactionHistoryModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryViewModel transactionHistoryViewModel = get();
        int i4 = component1 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return transactionHistoryViewModel;
    }

    public TransactionHistoryViewModel_Factory(Provider<ITransactionHistoryModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public TransactionHistoryViewModel get() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryViewModel transactionHistoryViewModelNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component1 + 15;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return transactionHistoryViewModelNewInstance;
        }
        throw null;
    }

    public static TransactionHistoryViewModel_Factory create(javax.inject.Provider<ITransactionHistoryModel> provider) {
        int i = 2 % 2;
        TransactionHistoryViewModel_Factory transactionHistoryViewModel_Factory = new TransactionHistoryViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 65;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return transactionHistoryViewModel_Factory;
    }

    public static TransactionHistoryViewModel_Factory create(Provider<ITransactionHistoryModel> provider) {
        int i = 2 % 2;
        TransactionHistoryViewModel_Factory transactionHistoryViewModel_Factory = new TransactionHistoryViewModel_Factory(provider);
        int i2 = component2 + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionHistoryViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TransactionHistoryViewModel newInstance(ITransactionHistoryModel iTransactionHistoryModel) {
        int i = 2 % 2;
        TransactionHistoryViewModel transactionHistoryViewModel = new TransactionHistoryViewModel(iTransactionHistoryModel);
        int i2 = component2 + 25;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return transactionHistoryViewModel;
        }
        throw null;
    }
}
