package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.text.TextUtils;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemSearchHistoryBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.DataBindingAdapter;

public class SearchHistoryAdapter extends DataBindingAdapter<LocalHomeFunction, ItemSearchHistoryBinding> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public void onBindViewHolder(ViewDataBinding viewDataBinding, int i, LocalHomeFunction localHomeFunction) {
        int i2 = 2 % 2;
        int i3 = component3 + 33;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((ItemSearchHistoryBinding) viewDataBinding, i, localHomeFunction);
        if (i4 != 0) {
            throw null;
        }
        int i5 = ShareDataUIState + 55;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void onBindViewHolder(ItemSearchHistoryBinding itemSearchHistoryBinding, int i, LocalHomeFunction localHomeFunction) {
        int i2 = 2 % 2;
        if (!TextUtils.isEmpty(localHomeFunction.getFuncName())) {
            itemSearchHistoryBinding.tvFunctionName.setVisibility(0);
            itemSearchHistoryBinding.ivFunctionIcon.setVisibility(0);
            GlideUtils.setFunctionIcon(itemSearchHistoryBinding.ivFunctionIcon, localHomeFunction.getFunIcon(), R.mipmap.icon_default_function);
            itemSearchHistoryBinding.ivMore.setVisibility(8);
        } else {
            int i3 = ShareDataUIState + 87;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            itemSearchHistoryBinding.tvFunctionName.setVisibility(4);
            itemSearchHistoryBinding.ivFunctionIcon.setVisibility(4);
            itemSearchHistoryBinding.ivMore.setVisibility(0);
        }
        itemSearchHistoryBinding.tvFunctionName.setText(localHomeFunction.getFuncName());
        int i5 = ShareDataUIState + 97;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.item_search_history;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }
}
