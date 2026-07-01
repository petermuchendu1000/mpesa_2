package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceDataEventName;", "", "<init>", "()V", ReferenceDataEventName.RequestMoney, "", ReferenceDataEventName.SendMoney, "SendToMany", "BuyGoods", "PayBill", ReferenceDataEventName.WithdrawAtAgent, ReferenceDataEventName.MiniAppTransaction, ReferenceDataEventName.BuyAirtime, ReferenceDataEventName.ReverseTransaction, ReferenceDataEventName.PayToPochi, "PochiBuyGoods", "PochiPayBill", ReferenceDataEventName.PochiPayMobile, ReferenceDataEventName.PochiMiniApps, "PochiWithdraw", "PochiDeposit", ReferenceDataEventName.PochiWithdrawAtAgent, "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceDataEventName {
    public static final String BuyAirtime = "BuyAirtime";
    public static final String BuyGoods = "BuyGoods";
    public static final ReferenceDataEventName INSTANCE = new ReferenceDataEventName();
    public static final String MiniAppTransaction = "MiniAppTransaction";
    public static final String PayBill = "PayBill";
    public static final String PayToPochi = "PayToPochi";
    public static final String PochiBuyGoods = "PochiBuyGoods";
    public static final String PochiDeposit = "PochiDeposit";
    public static final String PochiMiniApps = "PochiMiniApps";
    public static final String PochiPayBill = "PochiPayBill";
    public static final String PochiPayMobile = "PochiPayMobile";
    public static final String PochiWithdraw = "PochiWithdraw";
    public static final String PochiWithdrawAtAgent = "PochiWithdrawAtAgent";
    public static final String RequestMoney = "RequestMoney";
    public static final String ReverseTransaction = "ReverseTransaction";
    public static final String SendMoney = "SendMoney";
    public static final String SendToMany = "SendToMany";
    private static int ShareDataUIState = 1;
    public static final String WithdrawAtAgent = "WithdrawAtAgent";
    private static int component2;

    private ReferenceDataEventName() {
    }

    static {
        int i = ShareDataUIState + 121;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
