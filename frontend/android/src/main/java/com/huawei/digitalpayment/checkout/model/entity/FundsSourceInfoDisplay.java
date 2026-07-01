package com.huawei.digitalpayment.checkout.model.entity;

import com.huawei.http.BaseResp;
import java.util.List;

public class FundsSourceInfoDisplay extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private String accountNumber;
    private String accountType;
    private boolean available;
    private List<String> availableCoupons;
    private String availableLimit;
    private String bankCardId;
    private String cardIssuerName;
    private String displayContent;
    private List<DisplayItemsBean> displayItems;
    private List<BnplBean> displayProducts;
    private String fundsSource;
    private String fundsSourceDisplay;
    private String icon;
    private boolean isDefault;
    private String odAccessFee;
    private List<String> optimalCouponScheme;
    private String optimalDiscountAmount;
    private String order;
    private String remark;
    private BnplBean selectBnpl;
    private boolean signOD;
    private boolean subscribed = true;
    private String used;

    public String getOdAccessFee() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.odAccessFee;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOdAccessFee(String str) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.odAccessFee = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUsed() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.used;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setUsed(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.used = str;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getAvailableLimit() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.availableLimit;
        }
        throw null;
    }

    public void setAvailableLimit(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.availableLimit = str;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.checkout.model.entity.BnplBean getSelectBnpl() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.checkout.model.entity.BnplBean r1 = r4.selectBnpl
            if (r1 != 0) goto L33
            int r1 = com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay.ShareDataUIState
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1f
            java.util.List<com.huawei.digitalpayment.checkout.model.entity.BnplBean> r1 = r4.displayProducts
            boolean r1 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r1)
            r3 = 48
            int r3 = r3 / r2
            if (r1 != 0) goto L33
            goto L29
        L1f:
            java.util.List<com.huawei.digitalpayment.checkout.model.entity.BnplBean> r1 = r4.displayProducts
            boolean r1 = com.blankj.utilcode.util.CollectionUtils.isEmpty(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L33
        L29:
            java.util.List<com.huawei.digitalpayment.checkout.model.entity.BnplBean> r1 = r4.displayProducts
            java.lang.Object r1 = r1.get(r2)
            com.huawei.digitalpayment.checkout.model.entity.BnplBean r1 = (com.huawei.digitalpayment.checkout.model.entity.BnplBean) r1
            r4.selectBnpl = r1
        L33:
            com.huawei.digitalpayment.checkout.model.entity.BnplBean r1 = r4.selectBnpl
            int r2 = com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay.component2
            int r2 = r2 + 123
            int r3 = r2 % 128
            com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay.ShareDataUIState = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay.getSelectBnpl():com.huawei.digitalpayment.checkout.model.entity.BnplBean");
    }

    public void setSelectBnpl(BnplBean bnplBean) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.selectBnpl = bnplBean;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<BnplBean> getDisplayProducts() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<BnplBean> list = this.displayProducts;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return list;
    }

    public void setDisplayProducts(List<BnplBean> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.displayProducts = list;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public boolean isSubscribed() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subscribed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSubscribed(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.subscribed = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getRemark() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.remark;
        int i4 = i2 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setRemark(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.remark = str;
        int i5 = i2 + 11;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAccountNumber() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accountNumber;
        }
        throw null;
    }

    public void setAccountNumber(String str) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.accountNumber = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getCardIssuerName() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cardIssuerName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCardIssuerName(String str) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.cardIssuerName = str;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getBankCardId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bankCardId;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setBankCardId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.bankCardId = str;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }

    public boolean isIsDefault() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.isDefault;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setIsDefault(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.isDefault = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getFundsSource() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.fundsSource;
        int i4 = i3 + 41;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public void setFundsSource(String str) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.fundsSource = str;
        int i5 = i3 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getFundsSourceDisplay() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fundsSourceDisplay;
        }
        throw null;
    }

    public void setFundsSourceDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.fundsSourceDisplay = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDisplayContent() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.displayContent;
        int i4 = i2 + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setDisplayContent(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.displayContent = str;
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        int i6 = i2 + 87;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
    }

    public boolean isSignOD() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.signOD;
        }
        throw null;
    }

    public void setSignOD(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.signOD = z;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isAvailable() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.available;
        int i4 = i3 + 109;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public void setAvailable(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.available = z;
        int i5 = i3 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getOrder() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.order;
            int i4 = 75 / 0;
        } else {
            str = this.order;
        }
        int i5 = i3 + 117;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOrder(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.order = str;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.icon;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public void setIcon(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.icon = str;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<DisplayItemsBean> getDisplayItems() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<DisplayItemsBean> list = this.displayItems;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public void setDisplayItems(List<DisplayItemsBean> list) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.displayItems = list;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<String> getAvailableCoupons() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<String> list = this.availableCoupons;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public void setAvailableCoupons(List<String> list) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.availableCoupons = list;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<String> getOptimalCouponScheme() {
        List<String> list;
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            list = this.optimalCouponScheme;
            int i4 = 73 / 0;
        } else {
            list = this.optimalCouponScheme;
        }
        int i5 = i3 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setOptimalCouponScheme(List<String> list) {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.optimalCouponScheme = list;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getOptimalDiscountAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.optimalDiscountAmount;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setOptimalDiscountAmount(String str) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.optimalDiscountAmount = str;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
    }

    public String getAccountType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.accountType;
        int i4 = i3 + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return str;
    }

    public void setAccountType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.accountType = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public static class DisplayItemsBean extends BaseResp {
        private static int component1 = 1;
        private static int component2;
        private String key;
        private String label;
        private String order;
        private String value;

        public DisplayItemsBean(String str, String str2) {
            this.label = str;
            this.value = str2;
        }

        public String getLabel() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 31;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.label;
            int i5 = i2 + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setLabel(String str) {
            int i = 2 % 2;
            int i2 = component2 + 21;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            this.label = str;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i3 + 89;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public String getValue() {
            int i = 2 % 2;
            int i2 = component1 + 107;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.value;
            int i5 = i3 + 21;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setValue(String str) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            this.value = str;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 67;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getKey() {
            int i = 2 % 2;
            int i2 = component2 + 99;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.key;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setKey(String str) {
            int i = 2 % 2;
            int i2 = component1 + 41;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            this.key = str;
            int i5 = i3 + 87;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getOrder() {
            int i = 2 % 2;
            String str = this.order;
            if (str == null) {
                int i2 = component1 + 73;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                str = "0";
            }
            int i3 = component1 + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        public void setOrder(String str) {
            int i = 2 % 2;
            int i2 = component1 + 87;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            this.order = str;
            if (i4 != 0) {
                int i5 = 59 / 0;
            }
            int i6 = i3 + 19;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
    }
}
