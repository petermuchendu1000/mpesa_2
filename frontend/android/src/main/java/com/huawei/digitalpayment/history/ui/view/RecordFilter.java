package com.huawei.digitalpayment.history.ui.view;

import com.huawei.digitalpayment.datepicker.library.FullDay;
import com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean;
import java.util.List;

public class RecordFilter {
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private List<TradeTypeConfigBean> ShareDataUIState;
    private FullDay component1;
    private FullDay component2;
    private List<TradeTypeConfigBean> copydefault;

    public FullDay getStartDay() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        FullDay fullDay = this.component2;
        int i5 = i2 + 39;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return fullDay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setStartDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.component2 = fullDay;
        int i5 = i3 + 115;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
    }

    public FullDay getEndDay() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        FullDay fullDay = this.component1;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return fullDay;
    }

    public void setEndDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.component1 = fullDay;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 27;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public List<TradeTypeConfigBean> getFilterTypes() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setFilterTypes(List<TradeTypeConfigBean> list) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.ShareDataUIState = list;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 11;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public List<TradeTypeConfigBean> getFilterChannels() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        List<TradeTypeConfigBean> list = this.copydefault;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setFilterChannels(List<TradeTypeConfigBean> list) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.copydefault = list;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 55;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
    }

    public void clear() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.component2 = null;
            this.component1 = null;
            this.ShareDataUIState = null;
            this.copydefault = null;
            return;
        }
        this.component2 = null;
        this.component1 = null;
        this.ShareDataUIState = null;
        this.copydefault = null;
        obj.hashCode();
        throw null;
    }
}
