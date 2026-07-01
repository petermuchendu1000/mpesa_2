package com.huawei.digitalpayment.checkout.model.response;

import com.huawei.http.BaseResp;
import java.util.List;

public class TransRecordDetailResponse extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private String amount;
    private String amountDisplay;
    private String businessType;
    private String currency;
    private boolean exportImage;
    private String linkedOrderId;
    private String linkedOrderType;
    private String paymentOrderId;
    private String refundStatus;
    private String reverseStatus;
    private String tradeDesc;
    private List<Field> tradeDetails;
    private String tradeStatus;
    private String tradeStatusDesc;
    private String unit;
    private String unitType;

    public String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.amount;
        int i4 = i2 + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setAmount(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.amount = str;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
    }

    public String getRefundStatus() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.refundStatus;
        int i5 = i3 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setRefundStatus(String str) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.refundStatus = str;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
    }

    public String getTradeStatus() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.tradeStatus;
        int i5 = i3 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTradeStatus(String str) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.tradeStatus = str;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getTradeStatusDesc() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tradeStatusDesc;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setTradeStatusDesc(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.tradeStatusDesc = str;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
    }

    public String getTradeDesc() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tradeDesc;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return str;
    }

    public void setTradeDesc(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.tradeDesc = str;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<Field> getTradeDetails() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tradeDetails;
        }
        throw null;
    }

    public void setTradeDetails(List<Field> list) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.tradeDetails = list;
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
    }

    public String getReverseStatus() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.reverseStatus;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public void setReverseStatus(String str) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.reverseStatus = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getLinkedOrderType() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.linkedOrderType;
        }
        throw null;
    }

    public void setLinkedOrderType(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.linkedOrderType = str;
        int i5 = i2 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLinkedOrderId() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.linkedOrderId;
            int i4 = 5 / 0;
        } else {
            str = this.linkedOrderId;
        }
        int i5 = i2 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setLinkedOrderId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.linkedOrderId = str;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCurrency() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.currency = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getUnitType() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.unitType;
        }
        throw null;
    }

    public void setUnitType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.unitType = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.unit;
        int i5 = i2 + 119;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.unit = str;
        if (i4 != 0) {
            int i5 = 65 / 0;
        }
        int i6 = i3 + 95;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getPaymentOrderId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.paymentOrderId;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public void setPaymentOrderId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.paymentOrderId = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getBusinessType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.businessType;
        int i5 = i2 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.businessType = str;
        int i5 = i2 + 53;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.amountDisplay;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.amountDisplay = str;
        int i5 = i3 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isExportImage() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.exportImage;
        int i4 = i2 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public void setExportImage(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.exportImage = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public static class Field extends BaseResp {
        private static int ShareDataUIState = 0;
        public static final String TYPE_TIMESTAMP = "timestamp";
        private static int component3 = 1;
        private String fieldName;
        private String fieldValue;
        private String group;
        private String order;
        private String type;

        public void setFieldName(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.fieldName = str;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setFieldValue(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            this.fieldValue = str;
            int i5 = i3 + 9;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 70 / 0;
            }
        }

        public void setGroup(String str) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            this.group = str;
            int i5 = i2 + 39;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public void setOrder(String str) {
            int i = 2 % 2;
            int i2 = component3 + 11;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            this.order = str;
            if (i3 != 0) {
                throw null;
            }
        }

        public void setType(String str) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 121;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            this.type = str;
            int i5 = i2 + 63;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getType() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.type;
            int i5 = i2 + 117;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String getOrder() {
            int i = 2 % 2;
            int i2 = component3 + 9;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.order;
            int i5 = i3 + 93;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String getGroup() {
            int i = 2 % 2;
            int i2 = component3 + 75;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.group;
            }
            throw null;
        }

        public String getFieldValue() {
            int i = 2 % 2;
            int i2 = component3 + 53;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.fieldValue;
            int i4 = i3 + 3;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public String getFieldName() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 67;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.fieldName;
            int i5 = i3 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
