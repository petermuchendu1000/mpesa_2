package com.huawei.digitalpayment.consumer.loginModule.login.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class LoginInfoRemote extends BaseResp {
    private static int component1 = 1;
    private static int copydefault = 0;
    private static final long serialVersionUID = -6857312449811944476L;
    private String asyncRegisterDesc;
    private Object customer;
    private Object customerProfiles;
    private boolean expiry;
    private String expiryInformation;
    private String expiryTimeTips;
    private boolean forcedUpdate;
    private String forward;

    @SerializedName("functionConfig")
    private Object functionConfig;
    private String idNumber;
    private String loginNewDevice;
    private Object merchantAppIdConfig;

    @SerializedName(HomeConstants.HOME_CONFIG)
    private Object model3Config;
    private String msisdn;
    private String nickName;
    private String pinStatus;
    private String qrCode;
    private int queryDuration;
    private String supportPinLogin;
    private String token;

    @Inject
    public LoginInfoRemote() {
    }

    public String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i3 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAsyncRegisterDesc(String str) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.asyncRegisterDesc = str;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getExpiryTimeTips() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.expiryTimeTips;
        }
        throw null;
    }

    public void setExpiryTimeTips(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.expiryTimeTips = str;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getPinStatus() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pinStatus;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPinStatus(String str) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.pinStatus = str;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getIdNumber() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 85;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.idNumber;
            int i4 = 63 / 0;
        } else {
            str = this.idNumber;
        }
        int i5 = i3 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setIdNumber(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.idNumber = str;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getToken() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.token;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public void setToken(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.token = str;
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        int i6 = i3 + 97;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public int getQueryDuration() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.queryDuration;
        if (i4 <= 0) {
            int i5 = i3 + 123;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i4 = 10;
        }
        int i7 = i3 + 91;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public void setQueryDuration(int i) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 115;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        this.queryDuration = i;
        int i6 = i3 + 39;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
    }

    public String getForward() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.forward;
        int i4 = i2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setForward(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.forward = str;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getSupportPinLogin() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.supportPinLogin;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public void setSupportPinLogin(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.supportPinLogin = str;
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getQrCode() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.qrCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setQrCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.qrCode = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Object getModel3Config() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = this.model3Config;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public void setModel3Config(Object obj) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.model3Config = obj;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLoginNewDevice() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.loginNewDevice;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setLoginNewDevice(String str) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.loginNewDevice = str;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        int i6 = i3 + 5;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 93 / 0;
        }
    }

    public boolean isExpiry() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.expiry;
        int i5 = i3 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setExpiry(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.expiry = z;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    public boolean isForcedUpdate() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.forcedUpdate;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void setForcedUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.forcedUpdate = z;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getExpiryInformation() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expiryInformation;
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setExpiryInformation(String str) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.expiryInformation = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getNickName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.nickName;
        int i4 = i2 + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setNickName(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.nickName = str;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 95;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setMsisdn(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.msisdn = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Object getCustomer() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.customer;
        int i5 = i2 + 33;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public void setCustomer(Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.customer = obj;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
    }

    public Object getFunctionConfig() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.functionConfig;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return obj;
    }

    public void setFunctionConfig(Object obj) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.functionConfig = obj;
        int i5 = i2 + 117;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
    }

    public Object getMerchantAppIdConfig() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = this.merchantAppIdConfig;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public void setMerchantAppIdConfig(Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.merchantAppIdConfig = obj;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public Object getCustomerProfiles() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.customerProfiles;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public void setCustomerProfiles(Object obj) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.customerProfiles = obj;
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
