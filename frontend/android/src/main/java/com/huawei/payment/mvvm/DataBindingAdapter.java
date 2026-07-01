package com.huawei.payment.mvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public abstract class DataBindingAdapter<T, Binding extends ViewDataBinding> extends RecyclerView.Adapter<DataBindingViewHolder<Binding>> {
    private OnItemChildClickListener<T> ShareDataUIState;
    protected final String TAG = getClass().getSimpleName();
    private final LinkedHashSet<Integer> component2 = new LinkedHashSet<>();
    private OnItemClickListener<T> component3;
    private List<T> copydefault;

    public interface OnItemChildClickListener<T> {
        void onItemClick(DataBindingAdapter dataBindingAdapter, View view, int i, T t);
    }

    public interface OnItemClickListener<T> {
        void onItemClick(DataBindingAdapter dataBindingAdapter, View view, int i, T t);
    }

    protected abstract int getLayoutId();

    public abstract void onBindViewHolder(Binding binding, int i, T t);

    public void submitList(List<T> list) {
        this.copydefault = list;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        this.component3 = onItemClickListener;
    }

    public OnItemClickListener<T> getOnItemClickListener() {
        return this.component3;
    }

    public void addChildClickViewIds(Integer... numArr) {
        this.component2.addAll(Arrays.asList(numArr));
    }

    public OnItemChildClickListener<T> getOnItemChildClickListener() {
        return this.ShareDataUIState;
    }

    public void setOnItemChildClickListener(OnItemChildClickListener<T> onItemChildClickListener) {
        this.ShareDataUIState = onItemChildClickListener;
    }

    @Override
    public DataBindingViewHolder<Binding> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DataBindingViewHolder<>(DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), getLayoutId(), viewGroup, false));
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<Binding> dataBindingViewHolder, final int i) {
        dataBindingViewHolder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DataBindingAdapter.component2(this.f$0, i, view);
            }
        });
        Iterator<Integer> it = this.component2.iterator();
        while (it.hasNext()) {
            dataBindingViewHolder.binding.getRoot().findViewById(it.next().intValue()).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DataBindingAdapter.ShareDataUIState(this.f$0, i, view);
                }
            });
        }
        onBindViewHolder(dataBindingViewHolder.binding, i, getItem(i));
    }

    private void ShareDataUIState(int i, View view) {
        OnItemClickListener<T> onItemClickListener = this.component3;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(this, view, i, getItem(i));
        }
    }

    private void component3(int i, View view) {
        OnItemChildClickListener<T> onItemChildClickListener = this.ShareDataUIState;
        if (onItemChildClickListener != null) {
            onItemChildClickListener.onItemClick(this, view, i, getItem(i));
        }
    }

    public T getItem(int i) {
        List<T> list = this.copydefault;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    @Override
    public int getItemCount() {
        List<T> list = this.copydefault;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static void component2(DataBindingAdapter dataBindingAdapter, int i, View view) {
        Callback.onClick_enter(view);
        try {
            dataBindingAdapter.ShareDataUIState(i, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static void ShareDataUIState(DataBindingAdapter dataBindingAdapter, int i, View view) {
        Callback.onClick_enter(view);
        try {
            dataBindingAdapter.component3(i, view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
