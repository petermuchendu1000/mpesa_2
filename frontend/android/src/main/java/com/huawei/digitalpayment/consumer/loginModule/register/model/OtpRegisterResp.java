package com.huawei.digitalpayment.consumer.loginModule.register.model;

import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;

public class OtpRegisterResp extends BaseResp {
    private static int component2 = 0;
    private static int copydefault = 1;
    private String dob;
    private List<ExtParam> extParams;
    private Map<String, String> extResponse;
    private String firstName;
    private String forward;
    private String idNumber;
    private String idType;
    private List<KycField> kycFields;
    private String language;
    private String lastName;
    private String middleName;
    private String msisdn;
    private String name;
    private String registerType;
    private String resultCode;
    private String resultDesc;
    private String token;

    public String getToken() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setToken(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.token = str;
        if (i4 == 0) {
            int i5 = 61 / 0;
        }
        int i6 = i2 + 65;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
    }

    public String getForward() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.forward;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setForward(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.forward = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 7;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public Map<String, String> getExtResponse() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.extResponse;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return map;
    }

    public void setExtResponse(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.extResponse = map;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.name = str;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getResultCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.resultCode;
        int i4 = i2 + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setResultCode(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.resultCode = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getResultDesc() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resultDesc;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setResultDesc(String str) {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.resultDesc = str;
        int i5 = i3 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getRegisterType() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.registerType;
            int i4 = 39 / 0;
        } else {
            str = this.registerType;
        }
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRegisterType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.registerType = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public void setMsisdn(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.msisdn = str;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getLanguage() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.language;
        int i4 = i2 + 105;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return str;
    }

    public void setLanguage(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.language = str;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getIdType() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.idType;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setIdType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.idType = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public String getIdNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.idNumber;
        int i4 = i3 + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setIdNumber(String str) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.idNumber = str;
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    public String getFirstName() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.firstName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFirstName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.firstName = str;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
    }

    public String getMiddleName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.middleName;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setMiddleName(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.middleName = str;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
    }

    public String getLastName() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.lastName;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setLastName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.lastName = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public String getDob() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dob;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public void setDob(String str) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.dob = str;
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
    }

    public List<KycField> getKycFields() {
        List<KycField> list;
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            list = this.kycFields;
            int i4 = 35 / 0;
        } else {
            list = this.kycFields;
        }
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setKycFields(List<KycField> list) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.kycFields = list;
        int i5 = i3 + 75;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<ExtParam> getExtParams() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setExtParams(List<ExtParam> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.extParams = list;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
