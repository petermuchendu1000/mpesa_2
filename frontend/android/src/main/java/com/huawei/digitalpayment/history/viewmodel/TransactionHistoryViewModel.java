package com.huawei.digitalpayment.history.viewmodel;

import com.huawei.digitalpayment.history.model.ITransactionHistoryModel;
import javax.inject.Inject;

public class TransactionHistoryViewModel extends BaseTransactionHistoryViewModel<ITransactionHistoryModel> {
    @Inject
    public TransactionHistoryViewModel(ITransactionHistoryModel iTransactionHistoryModel) {
        super(iTransactionHistoryModel);
    }
}
