package com.huawei.common.contract;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContactsBean implements Serializable {
    private static final long serialVersionUID = 3620372812407940234L;
    private String id;
    private List<String> mobiles = new ArrayList();
    private String name;

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public List<String> getMobiles() {
        return this.mobiles;
    }

    public void setMobiles(List<String> list) {
        this.mobiles = list;
    }

    public void addMobile(String str) {
        if (this.mobiles.contains(str)) {
            return;
        }
        this.mobiles.add(str);
    }
}
