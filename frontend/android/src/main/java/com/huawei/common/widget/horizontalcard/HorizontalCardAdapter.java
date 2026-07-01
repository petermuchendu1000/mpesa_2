package com.huawei.common.widget.horizontalcard;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.util.FastClickUtils;

public class HorizontalCardAdapter extends BaseQuickAdapter<CardViewInfo, BaseViewHolder> {
    private HorizontalCardInfo ShareDataUIState;
    private int component2;

    public void setSelectPosition(int i) {
        this.component2 = i;
        notifyDataSetChanged();
    }

    public void setHorizontalCardInfo(HorizontalCardInfo horizontalCardInfo) {
        this.ShareDataUIState = horizontalCardInfo;
        notifyDataSetChanged();
    }

    public HorizontalCardAdapter() {
        super(R.layout.common_item_cardview);
        this.component2 = -1;
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, final CardViewInfo cardViewInfo) {
        CommonCardView commonCardView = (CommonCardView) baseViewHolder.findView(R.id.cardView);
        if (commonCardView == null) {
            return;
        }
        commonCardView.setData(this.component2 == getItemPosition(cardViewInfo) ? 1 : 0, cardViewInfo.getText(), cardViewInfo.getView(), this.ShareDataUIState);
        FastClickUtils.setOnClickListener(commonCardView, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                HorizontalCardAdapter.component2(this.f$0, cardViewInfo, view);
            }
        });
    }

    private void copydefault(CardViewInfo cardViewInfo, View view) {
        this.component2 = getItemPosition(cardViewInfo);
        if (getMOnItemClickListener() != null) {
            getMOnItemClickListener().onItemClick(this, view, getItemPosition(cardViewInfo));
        }
    }

    public CardViewInfo getSelectItem() {
        if (this.component2 >= 0) {
            return getData().get(this.component2);
        }
        return null;
    }

    public static void component2(HorizontalCardAdapter horizontalCardAdapter, CardViewInfo cardViewInfo, View view) {
        Callback.onClick_enter(view);
        try {
            horizontalCardAdapter.copydefault(cardViewInfo, view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
