package com.huawei.digitalpayment.consumer.sfcqrcode.ui.constant;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/constant/TransactionType;", "", "<init>", "()V", "SEND_MONEY", "", "POCHI_SEND_MONEY", "TRANSFER_POCHI", "BUY_GOODS", "POCHI_BUY_GOODS", "PAY_BILL", "POCHI_PAY_BILL", "POCHI_DEPOSIT", "POCHI_WITHDRAW", "CASH_OUT", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionType {
    public static final int $stable = 0;
    public static final String BUY_GOODS = "BuyGoods";
    public static final String CASH_OUT = "CashOut";
    public static final TransactionType INSTANCE = new TransactionType();
    public static final String PAY_BILL = "PayBill";
    public static final String POCHI_BUY_GOODS = "PochiBuyGoods";
    public static final String POCHI_DEPOSIT = "PochiDeposit";
    public static final String POCHI_PAY_BILL = "PochiPayBill";
    public static final String POCHI_SEND_MONEY = "PochiTransfer";
    public static final String POCHI_WITHDRAW = "PochiWithdraw";
    public static final String SEND_MONEY = "P2PTransfer";
    private static int ShareDataUIState = 1;
    public static final String TRANSFER_POCHI = "TransferPochi";
    private static int component3;

    private TransactionType() {
    }

    static {
        int i = ShareDataUIState + 43;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
