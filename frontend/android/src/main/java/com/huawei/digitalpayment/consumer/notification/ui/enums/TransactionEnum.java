package com.huawei.digitalpayment.consumer.notification.ui.enums;

import android.text.TextUtils;
import com.huawei.digitalpayment.checkout.resp.ReceiptTypes;
import com.huawei.digitalpayment.consumer.push_ui.R;
import com.huawei.digitalpayment.consumer.schedule.constants.ScheduleConstants;
import com.safaricom.consumer.commons.statements.TradeTypeConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class TransactionEnum {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private int mipmap;
    private String name;
    public static final TransactionEnum BuyGoods = new TransactionEnum("BuyGoods", 0, "BuyGoods", R.mipmap.icon_buy_goods);
    public static final TransactionEnum CashOut = new TransactionEnum("CashOut", 1, "CashOut", R.mipmap.icon_cash_out);
    public static final TransactionEnum P2PTransfer = new TransactionEnum("P2PTransfer", 2, "P2PTransfer", R.mipmap.icon_transferp2p);
    public static final TransactionEnum FloatTransfer = new TransactionEnum("FloatTransfer", 3, "FloatTransfer", R.mipmap.icon_float_transfer);
    public static final TransactionEnum VoucherCashOut = new TransactionEnum("VoucherCashOut", 4, "VoucherCashOut", R.mipmap.icon_voucher_cash_out);
    public static final TransactionEnum Remittance = new TransactionEnum("Remittance", 5, "Remittance", R.mipmap.icon_remittance);
    public static final TransactionEnum PaySalary = new TransactionEnum("PaySalary", 6, "PaySalary", R.mipmap.icon_pay_salary);
    public static final TransactionEnum CashIn = new TransactionEnum("CashIn", 7, "CashIn", R.mipmap.icon_cash_in);
    public static final TransactionEnum RequestCash = new TransactionEnum("RequestCash", 8, "CashIn", R.mipmap.icon_request_cash);
    public static final TransactionEnum TransferFromBank = new TransactionEnum("TransferFromBank", 9, "TransferFromBank", R.mipmap.icon_transfer_from_bank);
    public static final TransactionEnum TransferToOtherOrg = new TransactionEnum("TransferToOtherOrg", 10, "TransferToOtherOrg", R.mipmap.icon_transfer_to_other_org);
    public static final TransactionEnum CustomerPayBill = new TransactionEnum(ScheduleConstants.SCHEDULE_PAYMENT_PAY_BILL, 11, ScheduleConstants.SCHEDULE_PAYMENT_PAY_BILL, R.mipmap.icon_customer_paybill);
    public static final TransactionEnum PocketMoneyCampaign = new TransactionEnum("PocketMoneyCampaign", 12, "PocketMoneyCampaign", R.mipmap.icon_pocket_money_campaign);
    public static final TransactionEnum OrganizationPayBill = new TransactionEnum("OrganizationPayBill", 13, "OrganizationPayBill", R.mipmap.icon_organization_paybill);
    public static final TransactionEnum Deposit = new TransactionEnum("Deposit", 14, "Deposit", R.mipmap.icon_deposit);
    public static final TransactionEnum Withdrawal = new TransactionEnum(ReceiptTypes.WITHDRAWAL_ALT_NAME, 15, ReceiptTypes.WITHDRAWAL_ALT_NAME, R.mipmap.icon_withdrawal);
    public static final TransactionEnum PurchaseBundle = new TransactionEnum("PurchaseBundle", 16, TradeTypeConstant.BUY_BUNDLES, R.mipmap.icon_purchase_bundle);
    public static final TransactionEnum CampaignCashBack = new TransactionEnum("CampaignCashBack", 17, "CampaignCashBack", R.mipmap.icon_campaign_cash_back);
    public static final TransactionEnum WithdrawToBankAccount = new TransactionEnum("WithdrawToBankAccount", 18, "WithdrawToBankAccount", R.mipmap.icon_withdraw_to_bank_account);
    public static final TransactionEnum DepositFromBankAccount = new TransactionEnum("DepositFromBankAccount", 19, "DepositFromBankAccount", R.mipmap.icon_deposit_from_bank_account);
    public static final TransactionEnum AirtimeRecharge = new TransactionEnum(ScheduleConstants.SCHEDULE_PAYMENT_TYPE_AIR_TIME, 20, "Airtime Recharge", R.mipmap.icon_airtime_recharge);
    public static final TransactionEnum GuaranteeP2PTransfer = new TransactionEnum("GuaranteeP2PTransfer", 21, "GuaranteeP2PTransfer", R.mipmap.icon_guarantee_p2p_transfer);
    public static final TransactionEnum MallB2BTransfer = new TransactionEnum("MallB2BTransfer", 22, "MallB2BTransfer", R.mipmap.icon_mall_b2b_transfer);
    private static final TransactionEnum[] $VALUES = $values();

    private static TransactionEnum[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        TransactionEnum[] transactionEnumArr = {BuyGoods, CashOut, P2PTransfer, FloatTransfer, VoucherCashOut, Remittance, PaySalary, CashIn, RequestCash, TransferFromBank, TransferToOtherOrg, CustomerPayBill, PocketMoneyCampaign, OrganizationPayBill, Deposit, Withdrawal, PurchaseBundle, CampaignCashBack, WithdrawToBankAccount, DepositFromBankAccount, AirtimeRecharge, GuaranteeP2PTransfer, MallB2BTransfer};
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
        return transactionEnumArr;
    }

    public static TransactionEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TransactionEnum transactionEnum = (TransactionEnum) Enum.valueOf(TransactionEnum.class, str);
        int i4 = component3 + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return transactionEnum;
    }

    public static TransactionEnum[] values() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        TransactionEnum[] transactionEnumArr = (TransactionEnum[]) $VALUES.clone();
        int i4 = copydefault + 21;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return transactionEnumArr;
    }

    static {
        int i = component2 + 29;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private TransactionEnum(String str, int i, String str2, int i2) {
        this.name = str2;
        this.mipmap = i2;
    }

    public static int getMipmap(String str, int i) {
        int i2 = 2 % 2;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            int i3 = copydefault + 33;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return R.mipmap.base_icon_merchant;
            }
            int i4 = R.mipmap.base_icon_merchant;
            throw null;
        }
        TransactionEnum[] transactionEnumArrValues = values();
        int length = transactionEnumArrValues.length;
        int i5 = copydefault + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < length) {
            TransactionEnum transactionEnum = transactionEnumArrValues[i7];
            if (!(!str.startsWith(transactionEnum.getName()))) {
                int i8 = component3 + 67;
                copydefault = i8 % 128;
                if (i8 % 2 == 0) {
                    return transactionEnum.getMipmap();
                }
                transactionEnum.getMipmap();
                obj.hashCode();
                throw null;
            }
            i7++;
            int i9 = component3 + 99;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return i;
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getMipmap() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.mipmap;
        int i6 = i2 + 53;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
