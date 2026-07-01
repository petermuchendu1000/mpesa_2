package com.huawei.digitalpayment.consumer.home.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.common.widget.input.MenuView;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.image.util.GlideUtils;

public abstract class BaseLifeFunctionAdapter extends BaseQuickAdapter<LocalHomeFunction, BaseViewHolder> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, localHomeFunction);
        if (i3 != 0) {
            throw null;
        }
    }

    public BaseLifeFunctionAdapter(int i) {
        super(i);
    }

    protected void convert2(BaseViewHolder baseViewHolder, LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            convert(baseViewHolder, (MenuView) baseViewHolder.getView(R.id.menuView), localHomeFunction);
            int i3 = component3 + 39;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        convert(baseViewHolder, (MenuView) baseViewHolder.getView(R.id.menuView), localHomeFunction);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void convert(BaseViewHolder baseViewHolder, MenuView menuView, LocalHomeFunction localHomeFunction) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        menuView.getFunctionName().setText(localHomeFunction.getFuncName());
        GlideUtils.setFunctionIcon(menuView.getFunctionIcon(), localHomeFunction.getFunIcon(), R.mipmap.icon_default_function);
        int i4 = component3 + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
