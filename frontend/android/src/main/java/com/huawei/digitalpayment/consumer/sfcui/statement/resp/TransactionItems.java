package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.huawei.digitalpayment.checkout.resp.ReceiptTypes;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionItems;", "", "<init>", "()V", "createTransactionTypes", "", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionTypeBean;", "getDefaultTransactionType", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionItems {
    public static final int $stable = 0;
    public static final TransactionItems INSTANCE = new TransactionItems();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private TransactionItems() {
    }

    public final List<TransactionTypeBean> createTransactionTypes() {
        int i = 2 % 2;
        List<TransactionTypeBean> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new TransactionTypeBean[]{new TransactionTypeBean("All Transactions", R.mipmap.ic_statement_all_transactions, "ALL"), new TransactionTypeBean(ReceiptTypes.SENDMONEY_NAME, R.mipmap.ic_statement_send_money, "SEND_MONEY"), new TransactionTypeBean("Paybill", R.drawable.ic_statement_pay_bill, "PAY_BILL"), new TransactionTypeBean(ReceiptTypes.BUYGOODS_NAME, R.drawable.ic_statement_buy_goods, "BUY_GOODS"), new TransactionTypeBean("Withdraw", R.drawable.ic_statement_withdraw, "WITHDRAW_CASH"), new TransactionTypeBean(ReceiptTypes.BUYAIRTIME_NAME, R.drawable.ic_statement_buy_airtime, "BUY_AIRTIME"), new TransactionTypeBean("Money In", R.drawable.ic_statement_money_in, "MONEY_IN"), new TransactionTypeBean("Money Out", R.drawable.ic_statement_money_out, "MONEY_OUT"), new TransactionTypeBean("Others", R.drawable.ic_statement_other, "OTHER")}));
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return mutableList;
    }

    public final TransactionTypeBean getDefaultTransactionType() {
        int i = 2 % 2;
        TransactionTypeBean transactionTypeBean = new TransactionTypeBean("All Transactions", R.mipmap.ic_statement_all_transactions, "ALL");
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return transactionTypeBean;
    }

    static {
        int i = ShareDataUIState + 9;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
