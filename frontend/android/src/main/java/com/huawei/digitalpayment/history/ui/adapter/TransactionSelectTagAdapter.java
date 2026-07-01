package com.huawei.digitalpayment.history.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.history.R;
import com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean;

public class TransactionSelectTagAdapter extends BaseQuickAdapter<TradeTypeConfigBean, BaseViewHolder> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, TradeTypeConfigBean tradeTypeConfigBean) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, tradeTypeConfigBean);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TransactionSelectTagAdapter() {
        super(R.layout.item_history_selected_type);
    }

    protected void convert2(BaseViewHolder baseViewHolder, TradeTypeConfigBean tradeTypeConfigBean) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            baseViewHolder.setText(R.id.tvName, tradeTypeConfigBean.getServiceName());
            throw null;
        }
        baseViewHolder.setText(R.id.tvName, tradeTypeConfigBean.getServiceName());
        int i3 = component2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }
}
