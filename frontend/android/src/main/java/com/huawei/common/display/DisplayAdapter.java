package com.huawei.common.display;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.common.R;
import com.huawei.common.widget.DisplayView;

public class DisplayAdapter extends BaseQuickAdapter<DisplayItem, BaseViewHolder> {
    public DisplayAdapter(int i) {
        super(i);
    }

    public DisplayAdapter() {
        super(R.layout.common_item_display);
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, DisplayItem displayItem) {
        DisplayView displayView = (DisplayView) baseViewHolder.getView(R.id.display_view);
        displayView.setTitle(displayItem.getTitle());
        displayView.setContent(displayItem.getContent());
    }
}
