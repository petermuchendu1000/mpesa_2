package com.huawei.digitalpayment.checkout.model.response;

import android.text.TextUtils;
import com.huawei.digitalpayment.checkout.model.response.TransRecordDetailResponse;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;

public class TransferResp extends BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;
    private String actualAmount;
    private String actualAmountDisplay;
    private String currency;
    private String discountAmount;
    private String discountAmountDisplay;
    private List<DisplayItemBean> displayItems;
    private String errorMsg;
    private boolean exportImage;
    private String feeAmount;
    private String feeAmountDisplay;
    private String hint;
    private String orderId;
    private String orderStatus;
    private String originalAmount;
    private String originalAmountDisplay;
    private int payWay;
    private boolean pollFlag;
    private Map<String, String> referenceData;
    private boolean retryPayFlag;
    private String subTitle;
    private boolean switchPayMethodFlag;
    private String title;
    private List<TransRecordDetailResponse.Field> tradeDetails;
    private String transTime;
    private String unit;
    private String unitType;

    public String getBillShareButtonUrl() {
        int i = 2 % 2;
        Map<String, String> map = this.referenceData;
        Object obj = null;
        if (map != null) {
            String str = map.get(KeysConstants.BILL_SHARE_URL);
            if (!TextUtils.isEmpty(str)) {
                int i2 = component1 + 107;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }
            int i4 = component1 + 77;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = component2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return null;
    }

    public String getBillShareButtonText() {
        int i = 2 % 2;
        Map<String, String> map = this.referenceData;
        if (map != null) {
            String str = map.get(KeysConstants.BILL_SHARE_DISPLAY);
            String str2 = this.referenceData.get(KeysConstants.BILL_SHARE_URL);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return null;
            }
            int i2 = component1 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
        int i4 = component1 + 49;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 63;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 36 / 0;
        }
        return null;
    }

    public void setReferenceData(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.referenceData = map;
        if (i3 == 0) {
            throw null;
        }
    }

    public Map<String, String> getReferenceData() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.referenceData;
        }
        throw null;
    }

    public boolean isPollFlag() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.pollFlag;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setPollFlag(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.pollFlag = z;
        int i5 = i3 + 73;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isSwitchPayMethodFlag() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.switchPayMethodFlag;
        int i4 = i3 + 27;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return z;
    }

    public void setSwitchPayMethodFlag(boolean z) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.switchPayMethodFlag = z;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
    }

    public boolean isRetryPayFlag() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.retryPayFlag;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return z;
    }

    public void setRetryPayFlag(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.retryPayFlag = z;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getErrorMsg() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.errorMsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setErrorMsg(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.errorMsg = str;
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = i2 + 59;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getPayWay() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.payWay;
        }
        throw null;
    }

    public void setPayWay(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.payWay = i;
        if (i4 == 0) {
            int i5 = 4 / 0;
        }
    }

    public String getOrderStatus() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.orderStatus;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setOrderStatus(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.orderStatus = str;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
        int i6 = i2 + 37;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setSubTitle(String str) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.subTitle = str;
        int i5 = i3 + 71;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getSubTitle() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTitle(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.title = str;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getActualAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.actualAmountDisplay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setActualAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.actualAmountDisplay = str;
        int i5 = i3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getCurrency() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.currency = str;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
    }

    public String getHint() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.hint;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setHint(String str) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.hint = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getFeeAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.feeAmount;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public void setFeeAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.feeAmount = str;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDiscountAmount() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.discountAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setDiscountAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.discountAmount = str;
        int i5 = i3 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<DisplayItemBean> getDisplayItems() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<DisplayItemBean> list = this.displayItems;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public void setDisplayItems(List<DisplayItemBean> list) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.displayItems = list;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getOrderId() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.orderId;
        }
        throw null;
    }

    public void setOrderId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.orderId = str;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getTransTime() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.transTime;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public void setTransTime(String str) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.transTime = str;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getOriginalAmountDisplay() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.originalAmountDisplay;
        }
        throw null;
    }

    public void setOriginalAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.originalAmountDisplay = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 109;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getDiscountAmountDisplay() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.discountAmountDisplay;
        }
        throw null;
    }

    public void setDiscountAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.discountAmountDisplay = str;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getFeeAmountDisplay() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.feeAmountDisplay;
        int i5 = i3 + 107;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setFeeAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.feeAmountDisplay = str;
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = i3 + 93;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getActualAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.actualAmount;
            int i4 = 46 / 0;
        } else {
            str = this.actualAmount;
        }
        int i5 = i2 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public void setActualAmount(String str) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.actualAmount = str;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
    }

    public String getOriginalAmount() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.originalAmount;
        }
        throw null;
    }

    public void setOriginalAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.originalAmount = str;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.unit = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getUnitType() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.unitType;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    public void setUnitType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.unitType = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
    }

    public boolean isExportImage() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.exportImage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setExportImage(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.exportImage = z;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<TransRecordDetailResponse.Field> getTradeDetails() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<TransRecordDetailResponse.Field> list = this.tradeDetails;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setTradeDetails(List<TransRecordDetailResponse.Field> list) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.tradeDetails = list;
        int i5 = i2 + 67;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static class DisplayItemBean extends BaseResp {
        private static int component1 = 1;
        private static int component2 = 0;
        private static final long serialVersionUID = 4787899154408688953L;
        private String key;
        private String label;
        private String value;

        public DisplayItemBean() {
        }

        public DisplayItemBean(String str, String str2, String str3) {
            this.key = str;
            this.label = str2;
            this.value = str3;
        }

        public String getKey() {
            String str;
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 37;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.key;
                int i4 = 0 / 0;
            } else {
                str = this.key;
            }
            int i5 = i2 + 95;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public void setKey(String str) {
            int i = 2 % 2;
            int i2 = component2 + 7;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            this.key = str;
            int i5 = i3 + 7;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getValue() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 31;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.value;
            int i5 = i2 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setValue(String str) {
            int i = 2 % 2;
            int i2 = component1 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.value = str;
            if (i3 != 0) {
                int i4 = 99 / 0;
            }
        }

        public String getLabel() {
            int i = 2 % 2;
            int i2 = component2 + 19;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.label;
            int i5 = i3 + 119;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setLabel(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            this.label = str;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 23;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
