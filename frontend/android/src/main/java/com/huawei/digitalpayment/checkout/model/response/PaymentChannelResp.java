package com.huawei.digitalpayment.checkout.model.response;

import com.huawei.digitalpayment.checkout.model.entity.BankCardElement;
import com.huawei.http.BaseResp;
import java.util.List;

public class PaymentChannelResp extends BaseResp {
    private static int component1 = 1;
    private static int component2;
    private boolean bankCardBindFlag;
    private String bankCardId;
    private String bankCardNo;
    private boolean bindSendOtpByPayment;
    private String channelId;
    private List<BankCardElement> paymentFactors;
    private boolean sendOtpByPayment;
    private boolean sendSms;

    public boolean isSendOtpByPayment() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.sendOtpByPayment;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void setSendOtpByPayment(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.sendOtpByPayment = z;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public boolean isSendSms() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.sendSms;
        int i5 = i3 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setSendSms(boolean z) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.sendSms = z;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 103;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getBankCardId() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bankCardId;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public void setBankCardId(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.bankCardId = str;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    public String getBankCardNo() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.bankCardNo;
        int i4 = i2 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setBankCardNo(String str) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.bankCardNo = str;
        int i5 = i3 + 25;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isBindSendOtpByPayment() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.bindSendOtpByPayment;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setBindSendOtpByPayment(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.bindSendOtpByPayment = z;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getChannelId() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.channelId;
        }
        throw null;
    }

    public void setChannelId(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.channelId = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isBankCardBindFlag() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bankCardBindFlag;
        }
        throw null;
    }

    public void setBankCardBindFlag(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.bankCardBindFlag = z;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
    }

    public List<BankCardElement> getPaymentFactors() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<BankCardElement> list = this.paymentFactors;
        int i4 = i3 + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public void setPaymentFactors(List<BankCardElement> list) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.paymentFactors = list;
        int i5 = i2 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<BankCardElement> getPaymentFactorElements() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<BankCardElement> list = this.paymentFactors;
        int i4 = i2 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void setPaymentFactorElements(List<BankCardElement> list) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.paymentFactors = list;
        if (i3 == 0) {
            throw null;
        }
    }
}
