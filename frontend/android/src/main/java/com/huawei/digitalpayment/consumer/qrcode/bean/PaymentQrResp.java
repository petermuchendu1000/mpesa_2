package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.http.BaseResp;
import java.util.List;

public class PaymentQrResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private String applyServerTime;
    private List<AuthCodesBean> authCodes;
    private String effectAt;
    private String invalidAt;
    private String pollFreq;
    private String refreshFreq;

    public String getApplyServerTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.applyServerTime;
        int i4 = i3 + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setApplyServerTime(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.applyServerTime = str;
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        int i6 = i2 + 109;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getRefreshFreq() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.refreshFreq;
        int i4 = i2 + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setRefreshFreq(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.refreshFreq = str;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPollFreq() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.pollFreq;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setPollFreq(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.pollFreq = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getEffectAt() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.effectAt;
        int i4 = i2 + 55;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setEffectAt(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.effectAt = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getInvalidAt() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.invalidAt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setInvalidAt(String str) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.invalidAt = str;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public List<AuthCodesBean> getAuthCodes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<AuthCodesBean> list = this.authCodes;
        int i4 = i2 + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void setAuthCodes(List<AuthCodesBean> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.authCodes = list;
        int i5 = i2 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static class AuthCodesBean extends BaseResp {
        private static int component1 = 1;
        private static int copydefault;
        private String barCode;
        private String codeId;
        private String qrCode;
        private String qrType;

        public String getQrType() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault + 91;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                str = this.qrType;
                int i4 = 99 / 0;
            } else {
                str = this.qrType;
            }
            int i5 = i3 + 21;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public void setQrType(String str) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 69;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.qrType = str;
            int i5 = i2 + 21;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 37 / 0;
            }
        }

        public String getCodeId() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.codeId;
            int i5 = i2 + 95;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void setCodeId(String str) {
            int i = 2 % 2;
            int i2 = component1 + 9;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            this.codeId = str;
            int i5 = i3 + 119;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getBarCode() {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.barCode;
            int i4 = i3 + 85;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public void setBarCode(String str) {
            int i = 2 % 2;
            int i2 = component1 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.barCode = str;
            if (i3 != 0) {
                int i4 = 79 / 0;
            }
        }

        public String getQrCode() {
            int i = 2 % 2;
            int i2 = copydefault + 35;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.qrCode;
            int i5 = i3 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public void setQrCode(String str) {
            int i = 2 % 2;
            int i2 = component1 + 79;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            this.qrCode = str;
            int i5 = i3 + 25;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
    }
}
