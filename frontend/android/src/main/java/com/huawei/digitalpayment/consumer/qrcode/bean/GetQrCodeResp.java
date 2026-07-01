package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.http.BaseResp;
import java.util.List;

public class GetQrCodeResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private String amountDisplay;
    private String qrCode;
    private List<QrCode> qrCodes;
    private String qrGroupId;

    public String getQrCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.qrCode;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public void setQrCode(String str) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.qrCode = str;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<QrCode> getQrCodes() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.qrCodes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setQrCodes(List<QrCode> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.qrCodes = list;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.amountDisplay;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.amountDisplay = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getQrGroupId() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.qrGroupId;
        }
        throw null;
    }

    public void setQrGroupId(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.qrGroupId = str;
        int i5 = i2 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public class QrCode extends BaseResp {
        private static int component1 = 0;
        private static int component3 = 1;
        private String effectiveTime;
        private String expiredTime;
        private String qrCode;
        private String refreshTime;

        public QrCode() {
        }

        public String getQrCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 81;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.qrCode;
            int i5 = i2 + 57;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public void setQrCode(String str) {
            int i = 2 % 2;
            int i2 = component3 + 81;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            this.qrCode = str;
            int i5 = i3 + 11;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public String getEffectiveTime() {
            int i = 2 % 2;
            int i2 = component3 + 123;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.effectiveTime;
            }
            throw null;
        }

        public void setEffectiveTime(String str) {
            int i = 2 % 2;
            int i2 = component1 + 103;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.effectiveTime = str;
            if (i3 == 0) {
                throw null;
            }
        }

        public String getRefreshTime() {
            int i = 2 % 2;
            int i2 = component1 + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.refreshTime;
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            return str;
        }

        public void setRefreshTime(String str) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            this.refreshTime = str;
            int i5 = i3 + 63;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }

        public String getExpiredTime() {
            int i = 2 % 2;
            int i2 = component3 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.expiredTime;
            if (i3 != 0) {
                int i4 = 62 / 0;
            }
            return str;
        }

        public void setExpiredTime(String str) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            this.expiredTime = str;
            int i5 = i3 + 21;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }
}
