package com.huawei.digitalpayment.checkout.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay;
import com.huawei.digitalpayment.checkoutUi.R;
import java.util.List;

public class ConfirmDisplayItemAdapter extends BaseQuickAdapter<FundsSourceInfoDisplay.DisplayItemsBean, BaseViewHolder> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, FundsSourceInfoDisplay.DisplayItemsBean displayItemsBean) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, displayItemsBean);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ConfirmDisplayItemAdapter(List<FundsSourceInfoDisplay.DisplayItemsBean> list) {
        super(R.layout.item_confirm_display, list);
    }

    protected void convert2(BaseViewHolder baseViewHolder, FundsSourceInfoDisplay.DisplayItemsBean displayItemsBean) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        baseViewHolder.setText(R.id.tv_title, displayItemsBean.getLabel());
        baseViewHolder.setText(R.id.tv_content, displayItemsBean.getValue());
        int i4 = copydefault + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
