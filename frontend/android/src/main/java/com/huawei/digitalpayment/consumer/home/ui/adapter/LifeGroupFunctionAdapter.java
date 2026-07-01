package com.huawei.digitalpayment.consumer.home.ui.adapter;

import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import java.util.List;

public class LifeGroupFunctionAdapter extends BaseLifeGroupFunctionAdapter {
    private static int component2 = 1;
    private static int component3;

    public LifeGroupFunctionAdapter(boolean z) {
        super(z);
    }

    public LifeGroupFunctionAdapter(List<LocalFunctionGroup> list) {
        super(list);
    }

    @Override
    protected BaseLifeFunctionAdapter getBaseLifeFunctionAdapter() {
        int i = 2 % 2;
        LifeFunctionAdapter lifeFunctionAdapter = new LifeFunctionAdapter(R.layout.item_life_service);
        int i2 = component2 + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return lifeFunctionAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
