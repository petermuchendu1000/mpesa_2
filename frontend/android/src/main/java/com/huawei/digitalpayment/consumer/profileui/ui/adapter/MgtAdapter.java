package com.huawei.digitalpayment.consumer.profileui.ui.adapter;

import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.profile.model.local.MgtInfo;
import com.huawei.digitalpayment.consumer.profileui.R;

public class MgtAdapter extends BaseQuickAdapter<MgtInfo, BaseViewHolder> {
    private static int component2 = 1;
    private static int copydefault;
    private int component1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, MgtInfo mgtInfo) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, mgtInfo);
        int i4 = component2 + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 115;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((BaseViewHolder) viewHolder, i);
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
    }

    public MgtAdapter() {
        super(R.layout.item_mgt);
        this.component1 = -1;
    }

    protected void convert2(BaseViewHolder baseViewHolder, MgtInfo mgtInfo) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        baseViewHolder.setText(R.id.name, mgtInfo.getName());
        int i4 = component2 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        int i2;
        int i3 = 2 % 2;
        super.onBindViewHolder(baseViewHolder, i);
        if (this.component1 == i) {
            baseViewHolder.setImageResource(R.id.image, R.mipmap.profilemgt_icon_selected);
            i2 = component2 + 59;
        } else {
            baseViewHolder.setImageResource(R.id.image, R.mipmap.profilemgt_icon_unselected);
            i2 = component2 + 105;
        }
        copydefault = i2 % 128;
        int i4 = i2 % 2;
        int i5 = copydefault + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
    }

    public void setSelectPositon(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 105;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            this.component1 = i;
            notifyDataSetChanged();
            int i4 = component2 + 121;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.component1 = i;
        notifyDataSetChanged();
        throw null;
    }

    public int getSelectPositon() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 61;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }
}
