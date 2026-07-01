package com.huawei.digitalpayment.history.model.entity;

import com.huawei.http.BaseResp;
import java.util.List;

public class StaffInfoResponse extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    List<StaffInfoBean> staffProfiles;

    public List<StaffInfoBean> getStaffProfiles() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.staffProfiles;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStaffProfiles(List<StaffInfoBean> list) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.staffProfiles = list;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
