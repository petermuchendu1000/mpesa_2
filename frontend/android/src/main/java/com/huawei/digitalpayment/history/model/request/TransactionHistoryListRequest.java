package com.huawei.digitalpayment.history.model.request;

import com.huawei.http.BaseRequestParams;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistoryListRequest extends BaseRequestParams {
    private static int component1 = 1;
    private static int component2;
    private int count;
    private String initiatorOperatorId;
    private String isHomePage;
    private int startNum;
    private String startTime = "";
    private String endTime = "";
    private String direction = "";
    private List<String> filterTypes = new ArrayList();

    public List<String> getFilterTypes() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.filterTypes;
        int i4 = i3 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public void setFilterTypes(List<String> list) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.filterTypes = list;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getStartTime() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.startTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStartTime(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.startTime = str;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getEndTime() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.endTime;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setEndTime(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.endTime = str;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public int getStartNum() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.startNum;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public void setStartNum(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.startNum = i;
        if (i4 == 0) {
            int i5 = 26 / 0;
        }
    }

    public int getCount() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.count;
        }
        throw null;
    }

    public String getDirection() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.direction;
        int i4 = i2 + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public void setDirection(String str) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.direction = str;
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = i3 + 113;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void setCount(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 101;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.count = i;
        int i6 = i4 + 115;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getIsHomePage() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.isHomePage;
        int i4 = i3 + 79;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public void setIsHomePage(String str) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.isHomePage = str;
        int i5 = i3 + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getInitiatorOperatorId() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.initiatorOperatorId;
            int i4 = 77 / 0;
        } else {
            str = this.initiatorOperatorId;
        }
        int i5 = i3 + 15;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setInitiatorOperatorId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.initiatorOperatorId = str;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
    }
}
