package com.huawei.digitalpayment.history.model.entity;

import com.huawei.digitalpayment.consumer.baselib.config.Extension;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class TransactionHistoryQueryCondition extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private String category;
    private List<String> channels;
    private String direction;
    private Calendar endDate;

    @Extension
    private Map<String, Object> extension;
    private int maxAmount;
    private int minAmount;
    private int pageSize;
    private Calendar startDate;
    private int startNumber;
    private List<String> transactionTypes = new ArrayList();

    public Calendar getStartDate() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = this.startDate;
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return calendar;
    }

    public void setStartDate(Calendar calendar) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.startDate = calendar;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public Calendar getEndDate() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.endDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEndDate(Calendar calendar) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.endDate = calendar;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getCategory() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        throw null;
    }

    public void setCategory(String str) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.category = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<String> getTransactionTypes() {
        List<String> list;
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            list = this.transactionTypes;
            int i4 = 5 / 0;
        } else {
            list = this.transactionTypes;
        }
        int i5 = i3 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public void setTransactionTypes(List<String> list) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.transactionTypes = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public List<String> getChannels() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.channels;
        }
        throw null;
    }

    public void setChannels(List<String> list) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.channels = list;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public int getMinAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.minAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMinAmount(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 15;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        this.minAmount = i;
        int i6 = i4 + 7;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getMaxAmount() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setMaxAmount(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.maxAmount = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public String getDirection() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.direction;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public void setDirection(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.direction = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public int getStartNumber() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 103;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.startNumber;
            int i5 = 17 / 0;
        } else {
            i = this.startNumber;
        }
        int i6 = i3 + 67;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStartNumber(int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        this.startNumber = i;
        int i6 = i3 + 19;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public int getPageSize() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.pageSize;
        int i6 = i2 + 37;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setPageSize(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.pageSize = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Map<String, Object> getExtension() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.extension;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return map;
    }

    @Override
    public void setExtension(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.extension = map;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
