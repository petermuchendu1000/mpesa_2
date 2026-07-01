package com.huawei.digitalpayment.consumer.home.ui.adapter;

import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.ArrayList;
import java.util.List;

public class LifeGroupFunctionEditAdapter extends BaseLifeGroupFunctionAdapter {
    private static int ShareDataUIState = 1;
    private static int component1;
    private List<LocalHomeFunction> copydefault;

    public LifeGroupFunctionEditAdapter(boolean z) {
        super(z);
        this.copydefault = new ArrayList();
    }

    public LifeGroupFunctionEditAdapter(List<LocalFunctionGroup> list) {
        super(list);
        this.copydefault = new ArrayList();
    }

    @Override
    protected BaseLifeFunctionAdapter getBaseLifeFunctionAdapter() {
        int i = 2 % 2;
        LifeFunctionEditAdapter lifeFunctionEditAdapter = new LifeFunctionEditAdapter(R.layout.item_life_service, this.copydefault);
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return lifeFunctionEditAdapter;
        }
        throw null;
    }

    public void setCurrentSelected(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = list;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
