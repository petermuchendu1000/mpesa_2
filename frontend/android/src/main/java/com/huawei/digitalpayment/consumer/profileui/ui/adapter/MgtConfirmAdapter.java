package com.huawei.digitalpayment.consumer.profileui.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.profile.model.local.MgtInfo;
import com.huawei.digitalpayment.consumer.profileui.R;

public class MgtConfirmAdapter extends BaseQuickAdapter<MgtInfo, BaseViewHolder> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, MgtInfo mgtInfo) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, mgtInfo);
        int i4 = component3 + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MgtConfirmAdapter() {
        super(R.layout.item_profile_confirm);
    }

    protected void convert2(BaseViewHolder baseViewHolder, MgtInfo mgtInfo) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            baseViewHolder.setText(R.id.name, mgtInfo.getName());
            obj.hashCode();
            throw null;
        }
        baseViewHolder.setText(R.id.name, mgtInfo.getName());
        int i3 = component3 + 31;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
