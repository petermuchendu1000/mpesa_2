package com.huawei.digitalpayment.consumer.baselib.widget.holder;

import android.content.Context;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final T binding;

    public BaseViewHolder(T t) {
        super(t.getRoot());
        this.binding = t;
    }

    public Context getContext() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.binding.getRoot().getContext();
        int i4 = component3 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return context;
    }
}
