package com.huawei.digitalpayment.consumer.profileui.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalKycGroup;
import com.huawei.digitalpayment.consumer.profileui.R;
import java.util.List;

public class ProfilesAdapter extends BaseQuickAdapter<LocalKycGroup, BaseViewHolder> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public void convert(BaseViewHolder baseViewHolder, LocalKycGroup localKycGroup) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, localKycGroup);
        int i4 = component3 + 47;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public ProfilesAdapter(int i, List<LocalKycGroup> list) {
        super(i, list);
    }

    protected void convert2(BaseViewHolder baseViewHolder, LocalKycGroup localKycGroup) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            baseViewHolder.setText(R.id.profiles_name, localKycGroup.getGroupName());
            baseViewHolder.setText(R.id.profiles_value, "");
            baseViewHolder.setGone(R.id.profiles_img, false);
            baseViewHolder.setVisible(R.id.iv_edit_more, false);
        } else {
            baseViewHolder.setText(R.id.profiles_name, localKycGroup.getGroupName());
            baseViewHolder.setText(R.id.profiles_value, "");
            baseViewHolder.setGone(R.id.profiles_img, true);
            baseViewHolder.setVisible(R.id.iv_edit_more, true);
        }
        int i3 = component3 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
    }
}
