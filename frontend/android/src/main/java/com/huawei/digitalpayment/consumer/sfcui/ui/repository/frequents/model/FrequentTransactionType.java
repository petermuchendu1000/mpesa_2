package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTransactionType;", "", "<init>", "()V", "SEND_MONEY", "", "PAY_BILL", "BUY_GOODS", "AGENT_WITHDRAWAL", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentTransactionType {
    public static final int $stable = 0;
    public static final String AGENT_WITHDRAWAL = "CashOut";
    public static final String BUY_GOODS = "BuyGoods";
    public static final FrequentTransactionType INSTANCE = new FrequentTransactionType();
    public static final String PAY_BILL = "PayBill";
    public static final String SEND_MONEY = "P2PTransfer";
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    private FrequentTransactionType() {
    }

    static {
        int i = ShareDataUIState + 39;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
    }
}
