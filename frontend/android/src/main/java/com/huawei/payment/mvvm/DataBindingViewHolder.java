package com.huawei.payment.mvvm;

import android.content.Context;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class DataBindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    public final T binding;

    public DataBindingViewHolder(T t) {
        super(t.getRoot());
        this.binding = t;
    }

    public Context getContext() {
        return this.binding.getRoot().getContext();
    }
}
