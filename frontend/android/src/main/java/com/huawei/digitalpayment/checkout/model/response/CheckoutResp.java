package com.huawei.digitalpayment.checkout.model.response;

import android.text.TextUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.checkout.model.entity.CouponBean;
import com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CheckoutResp extends BaseResp {
    private static int component1 = 0;
    private static int copydefault = 1;
    private String actualAmount;
    private String actualAmountDisplay;
    private String balance;
    private String balanceDisplay;
    private String businessType;
    private boolean confirm;
    private List<FundsSourceInfoDisplay.DisplayItemsBean> confirmDisplayItems;
    private String currency;
    private String discountAmount;
    private String discountAmountDisplay;
    private List<String> displayItems;
    private PaymentChannelResp explorePaymentChannel;
    private String feeAmountDisplay;
    private String fillPayFactorNote;
    private boolean freePin;
    private List<FundsSourceInfoDisplay> fundsSourceInfoDisplay;
    private Map<String, List<CouponBean>> groupedCoupons;
    private String oppositeName;
    private String oppositeNameDisplay;
    private String optimalDiscountAmount;
    private String originalAmountDisplay;
    private String prepayId;
    private String receiverMsisdn;
    private String subTitle;
    private boolean supportBindCard;
    private String totalAmountWithFee;
    private String totalAmountWithFeeDisplay;
    private String unit;
    private String unitType;
    private List<CouponBean> userCoupons;
    private String voucherCode;

    public String getTotalAmountWithFee() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.totalAmountWithFee;
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTotalAmountWithFee(String str) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.totalAmountWithFee = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTotalAmountWithFeeDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.totalAmountWithFeeDisplay;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTotalAmountWithFeeDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.totalAmountWithFeeDisplay = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getBusinessType() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.businessType;
        }
        throw null;
    }

    public void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.businessType = str;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOptimalDiscountAmount() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.optimalDiscountAmount;
        int i5 = i3 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOptimalDiscountAmount(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.optimalDiscountAmount = str;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
    }

    public String getDiscountAmount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.discountAmount;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDiscountAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.discountAmount = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getDiscountAmountDisplay() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.discountAmountDisplay;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    public String getDiscountAmountDisplayWithUnit() {
        int i = 2 % 2;
        String str = this.discountAmountDisplay + " " + getUnit();
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public void setDiscountAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.discountAmountDisplay = str;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<CouponBean> getSpCoupons() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, List<CouponBean>> map = this.groupedCoupons;
        if (map == null || !map.containsKey(KeysConstants.SP_COUPON)) {
            int i4 = component1 + 111;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return null;
        }
        int i6 = copydefault + 25;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        List<CouponBean> list = this.groupedCoupons.get(KeysConstants.SP_COUPON);
        if (i7 == 0) {
            return list;
        }
        throw null;
    }

    public List<CouponBean> getMerchantCoupons() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Map<String, List<CouponBean>> map = this.groupedCoupons;
        if (map != null && map.containsKey(KeysConstants.MERCHANT_COUPON)) {
            return this.groupedCoupons.get(KeysConstants.MERCHANT_COUPON);
        }
        int i4 = copydefault + 103;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public Map<String, List<CouponBean>> getGroupedCoupons() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, List<CouponBean>> map = this.groupedCoupons;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void setGroupedCoupons(Map<String, List<CouponBean>> map) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.groupedCoupons = map;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
    }

    public String getFillPayFactorNote() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.fillPayFactorNote;
        int i5 = i3 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public void setFillPayFactorNote(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.fillPayFactorNote = str;
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = i2 + 91;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
    }

    public String getVoucherCode() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.voucherCode;
        }
        throw null;
    }

    public void setVoucherCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.voucherCode = str;
        int i5 = i3 + 121;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getReceiverMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.receiverMsisdn;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setReceiverMsisdn(String str) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.receiverMsisdn = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PaymentChannelResp getExplorePaymentChannel() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        PaymentChannelResp paymentChannelResp = this.explorePaymentChannel;
        int i4 = i3 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return paymentChannelResp;
    }

    public void setExplorePaymentChannel(PaymentChannelResp paymentChannelResp) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.explorePaymentChannel = paymentChannelResp;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean getSupportBindCard() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.supportBindCard;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setSupportBindCard(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.supportBindCard = z;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.unit = str;
        int i5 = i2 + 49;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
    }

    public String getActualAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.actualAmount;
        int i5 = i2 + 73;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setActualAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.actualAmount = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getActualAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.actualAmountDisplay;
        int i5 = i3 + 59;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setActualAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.actualAmountDisplay = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOriginalAmountDisplay() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.originalAmountDisplay;
            int i4 = 30 / 0;
        } else {
            str = this.originalAmountDisplay;
        }
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setOriginalAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.originalAmountDisplay = str;
        int i5 = i2 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<FundsSourceInfoDisplay.DisplayItemsBean> getConfirmDisplayItems() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (this.confirmDisplayItems == null) {
                this.confirmDisplayItems = new ArrayList();
            }
            List<FundsSourceInfoDisplay.DisplayItemsBean> list = this.confirmDisplayItems;
            int i3 = component1 + 79;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return list;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public FundsSourceInfoDisplay getPaymentMethod() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<FundsSourceInfoDisplay> list = this.fundsSourceInfoDisplay;
        if (list != null) {
            int i5 = i2 + 15;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                list.isEmpty();
                throw null;
            }
            if (!list.isEmpty()) {
                Iterator<FundsSourceInfoDisplay> it = this.fundsSourceInfoDisplay.iterator();
                while (it.hasNext()) {
                    int i6 = component1 + 121;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        it.next().isIsDefault();
                        throw null;
                    }
                    FundsSourceInfoDisplay next = it.next();
                    if (next.isIsDefault()) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public void setConfirmDisplayItems(List<FundsSourceInfoDisplay.DisplayItemsBean> list) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.confirmDisplayItems = list;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.balance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBalance(String str) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.balance = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getBalanceDisplay() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.balanceDisplay;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setBalanceDisplay(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.balanceDisplay = str;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
    }

    public String getOppositeName() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.oppositeName;
            int i4 = 17 / 0;
        } else {
            str = this.oppositeName;
        }
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setOppositeName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.oppositeName = str;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOppositeNameDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.oppositeNameDisplay;
        int i5 = i3 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public void setOppositeNameDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.oppositeNameDisplay = str;
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOriginalAmountDisplayWithUnit() {
        int i = 2 % 2;
        String str = getOriginalAmountDisplay() + " " + getUnit();
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
        return str;
    }

    public String getFormatServerTimestamp() {
        int i = 2 % 2;
        String serverTimestamp = getServerTimestamp();
        if (!TextUtils.isEmpty(serverTimestamp)) {
            try {
                String strDate2String = TimeUtils.date2String(new Date(Long.parseLong(serverTimestamp)), "yy/MM/dd HH:mm:ss");
                int i2 = copydefault + 3;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return strDate2String;
            } catch (NumberFormatException e) {
                L.d(KeysConstants.CHECKOUT_RESP, "getFormatServerTimestamp: " + e.getMessage());
                return "";
            }
        }
        int i4 = component1 + 29;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public String getFeeAmountDisplayWithUnit() {
        int i = 2 % 2;
        String str = getFeeAmountDisplay() + " " + getUnit();
        int i2 = component1 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getFeeAmountDisplay() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.feeAmountDisplay;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<String> getDisplayItems() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<String> list = this.displayItems;
        int i4 = i2 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void setDisplayItems(List<String> list) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.displayItems = list;
        int i5 = i3 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.prepayId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.prepayId = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getSubTitle() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 1;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getRTLSubTitle() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String strReplace = this.subTitle;
        if (strReplace != null) {
            String str = this.oppositeName;
            if (str == null) {
                int i5 = i2 + 21;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 29 / 0;
                }
            } else {
                strReplace = strReplace.replace(str, "\u202a" + this.oppositeName);
            }
        }
        int i7 = component1 + 51;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return strReplace;
    }

    public void setSubTitle(String str) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.subTitle = str;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCurrency() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.currency;
        int i4 = i2 + 87;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.currency = str;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
    }

    public List<FundsSourceInfoDisplay> getFundsSourceInfoDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fundsSourceInfoDisplay;
        }
        throw null;
    }

    public void setFundsSourceInfoDisplay(List<FundsSourceInfoDisplay> list) {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.fundsSourceInfoDisplay = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isConfirm() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.confirm;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setConfirm(boolean z) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.confirm = z;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getUnitType() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unitType;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setUnitType(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.unitType = str;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<CouponBean> getUserCoupons() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<CouponBean> list = this.userCoupons;
        int i4 = i3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public void setUserCoupons(List<CouponBean> list) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.userCoupons = list;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isFreePin() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            z = this.freePin;
            int i4 = 31 / 0;
        } else {
            z = this.freePin;
        }
        int i5 = i3 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setFreePin(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.freePin = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }
}
