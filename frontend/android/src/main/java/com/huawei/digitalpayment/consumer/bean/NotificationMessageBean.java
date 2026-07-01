package com.huawei.digitalpayment.consumer.bean;

import com.huawei.http.BaseResp;

public class NotificationMessageBean extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private String businessType;
    private String cardContent;
    private String cardExecute;
    private String cardIcon;
    private String cardShowFields;
    private String cardTitle;
    private String category;
    private String content;
    private String currency;
    private String icon;
    private String identityId;
    private String imageUrl;
    private String imgUrl;
    private String msgId;
    private String orderStatus;
    private String readStatus;
    private String sound;
    private String systemExecute;
    private String timestamp;
    private String title;
    private String type;
    private String unit;
    private String unitType;

    public String getCurrency() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.currency = str;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    public String getUnit() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setUnit(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.unit = str;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
    }

    public String getUnitType() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.unitType;
            int i4 = 94 / 0;
        } else {
            str = this.unitType;
        }
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setUnitType(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.unitType = str;
        int i5 = i2 + 17;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setRead() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.readStatus = "1";
        if (i4 == 0) {
            int i5 = 53 / 0;
        }
        int i6 = i2 + 7;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isRead() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            "1".equals(this.readStatus);
            throw null;
        }
        boolean zEquals = "1".equals(this.readStatus);
        int i3 = ShareDataUIState + 93;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return zEquals;
    }

    public String getOrderStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.orderStatus;
        int i4 = i3 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    public void setOrderStatus(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.orderStatus = str;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getMsgId() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msgId;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        return str;
    }

    public void setMsgId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.msgId = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
    }

    public String getIdentityId() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.identityId;
            int i4 = 5 / 0;
        } else {
            str = this.identityId;
        }
        int i5 = i3 + 39;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIdentityId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.identityId = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.type = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    public String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCategory(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.category = str;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setTitle(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.title = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getContent() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.content;
        int i4 = i2 + 95;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return str;
    }

    public void setContent(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.content = str;
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getImgUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.imgUrl;
        if (str != null) {
            return str;
        }
        String imageUrl = getImageUrl();
        int i4 = ShareDataUIState + 35;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return imageUrl;
    }

    public void setImgUrl(String str) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.imgUrl = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getImageUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setImageUrl(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.imageUrl = str;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getSystemExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.systemExecute;
        int i4 = i2 + 61;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setSystemExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.systemExecute = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getBusinessType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.businessType;
        int i4 = i2 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setBusinessType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.businessType = str;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
    }

    public String getCardExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cardExecute;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public void setCardExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.cardExecute = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getSound() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sound;
        int i5 = i2 + 31;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public void setSound(String str) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.sound = str;
        int i5 = i3 + 97;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTimestamp() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.timestamp;
            int i4 = 68 / 0;
        } else {
            str = this.timestamp;
        }
        int i5 = i2 + 87;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public void setTimestamp(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.timestamp = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getCardShowFields() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.cardShowFields;
            int i4 = 67 / 0;
        } else {
            str = this.cardShowFields;
        }
        int i5 = i3 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setCardShowFields(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.cardShowFields = str;
        int i5 = i2 + 39;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCardIcon() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cardIcon;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public void setCardIcon(String str) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.cardIcon = str;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
    }

    public String getIcon() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.icon;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIcon(String str) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.icon = str;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
    }

    public String getCardTitle() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cardTitle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCardTitle(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.cardTitle = str;
        int i5 = i2 + 67;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getCardContent() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.cardContent;
        int i4 = i2 + 123;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setCardContent(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.cardContent = str;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getReadStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.readStatus;
        int i4 = i3 + 103;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return str;
    }

    public void setReadStatus(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.readStatus = str;
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
    }

    public static class FieldItem extends BaseResp {
        private static int component1 = 0;
        private static int component3 = 1;
        private String key;
        private String type;
        private String value;

        public String getKey() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 81;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.key;
            int i4 = i2 + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public void setKey(String str) {
            int i = 2 % 2;
            int i2 = component3 + 5;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            this.key = str;
            int i5 = i3 + 27;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getType() {
            int i = 2 % 2;
            int i2 = component1 + 91;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.type;
            int i5 = i3 + 87;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setType(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 117;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            this.type = str;
            int i5 = i2 + 69;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getValue() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 29;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.value;
            int i5 = i2 + 51;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setValue(String str) {
            int i = 2 % 2;
            int i2 = component1 + 5;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            this.value = str;
            int i5 = i3 + 11;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
