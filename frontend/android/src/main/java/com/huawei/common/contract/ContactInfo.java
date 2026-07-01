package com.huawei.common.contract;

import java.io.Serializable;

public class ContactInfo implements Serializable {
    private static final long serialVersionUID = 3620372836407940233L;
    private String name;
    private String phoneNumber;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }
}
