package com.huawei.digitalpayment.history.ui.di;

import com.huawei.digitalpayment.history.model.ITransactionHistoryModel;
import com.huawei.digitalpayment.history.model.TransactionHistoryModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class THModule {
    @Binds
    abstract ITransactionHistoryModel component3(TransactionHistoryModel transactionHistoryModel);
}
