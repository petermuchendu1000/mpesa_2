package com.huawei.common.contract;

import java.io.Serializable;
import java.util.List;

public class ContactsListBean implements Serializable {
    private static final long serialVersionUID = 3620372832407940234L;
    private List<ContactsBean> list;

    public List<ContactsBean> getList() {
        return this.list;
    }

    public void setList(List<ContactsBean> list) {
        this.list = list;
    }
}
