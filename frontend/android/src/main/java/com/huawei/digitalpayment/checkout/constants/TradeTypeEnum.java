package com.huawei.digitalpayment.checkout.constants;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class TradeTypeEnum implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private String checkoutParam;
    private String transferParam;
    public static final TradeTypeEnum CUSTOMER_BUY_GOODS = new TradeTypeEnum("CUSTOMER_BUY_GOODS", 0, "preCustomerBuyGoods", "customerBuyGoods");
    public static final TradeTypeEnum P2P_TRANSFER = new TradeTypeEnum("P2P_TRANSFER", 1, "preP2PTransfer", "p2pTransfer");
    public static final TradeTypeEnum P2P_TRANSFER_WITH_FEE = new TradeTypeEnum("P2P_TRANSFER_WITH_FEE", 2, "preP2PTransferWithFee", "p2pTransferWithFee");
    public static final TradeTypeEnum P2P_TRANSFER_VOUCHER_CODE = new TradeTypeEnum("P2P_TRANSFER_VOUCHER_CODE", 3, "preP2PUsingVoucherCode", "p2pUsingVoucherCode");
    public static final TradeTypeEnum CASH_OUT = new TradeTypeEnum("CASH_OUT", 4, "preCashOut", "cashOut");
    public static final TradeTypeEnum WITHDRAW_TO_BANK_CARD = new TradeTypeEnum("WITHDRAW_TO_BANK_CARD", 5, "preWithdrawToBankCard", "withdrawToBankCard");
    public static final TradeTypeEnum DEPOSIT_FROM_BANK_CARD = new TradeTypeEnum("DEPOSIT_FROM_BANK_CARD", 6, "preDepositFromBankCard", "depositFromBankCard");
    public static final TradeTypeEnum AIR_TIME_DATA_PACK = new TradeTypeEnum("AIR_TIME_DATA_PACK", 7, "preRechargeDataPack", "rechargeDataPack");
    public static final TradeTypeEnum AIR_TOP_UP = new TradeTypeEnum("AIR_TOP_UP", 8, "preRechargeAirtime", "rechargeAirtime");
    public static final TradeTypeEnum H5_CHECKOUT = new TradeTypeEnum("H5_CHECKOUT", 9, "h5Checkout", "h5PayOrder");
    public static final TradeTypeEnum CHECKOUT = new TradeTypeEnum("CHECKOUT", 10, "checkOut", "payOrder");
    public static final TradeTypeEnum BATCH_TRANSFER = new TradeTypeEnum("BATCH_TRANSFER", 11, "BatchTransferPreOrder", "BatchTransferPayOrder");
    public static final TradeTypeEnum VOUCHER_CHECKOUT = new TradeTypeEnum("VOUCHER_CHECKOUT", 12, "preVoucherCashOut", "voucherCashOut");
    private static final TradeTypeEnum[] $VALUES = $values();

    private static TradeTypeEnum[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        TradeTypeEnum[] tradeTypeEnumArr = {CUSTOMER_BUY_GOODS, P2P_TRANSFER, P2P_TRANSFER_WITH_FEE, P2P_TRANSFER_VOUCHER_CODE, CASH_OUT, WITHDRAW_TO_BANK_CARD, DEPOSIT_FROM_BANK_CARD, AIR_TIME_DATA_PACK, AIR_TOP_UP, H5_CHECKOUT, CHECKOUT, BATCH_TRANSFER, VOUCHER_CHECKOUT};
        int i5 = i3 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return tradeTypeEnumArr;
    }

    public static TradeTypeEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TradeTypeEnum tradeTypeEnum = (TradeTypeEnum) Enum.valueOf(TradeTypeEnum.class, str);
        if (i3 != 0) {
            return tradeTypeEnum;
        }
        throw null;
    }

    public static TradeTypeEnum[] values() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TradeTypeEnum[] tradeTypeEnumArr = (TradeTypeEnum[]) $VALUES.clone();
        int i3 = component3 + 91;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return tradeTypeEnumArr;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 3;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    private TradeTypeEnum(String str, int i, String str2, String str3) {
        this.checkoutParam = str2;
        this.transferParam = str3;
    }

    public String getCheckoutParam() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.checkoutParam;
            int i4 = 77 / 0;
        } else {
            str = this.checkoutParam;
        }
        int i5 = i2 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String getTransferParam() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transferParam;
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return str;
    }
}
