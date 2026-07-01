package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.push_ui.R;

public abstract class DeletePopLayoutBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final RoundConstraintLayout contentRl;
    public final TextView deleteTv;

    protected DeletePopLayoutBinding(Object obj, View view, int i, RoundConstraintLayout roundConstraintLayout, TextView textView) {
        super(obj, view, i);
        this.contentRl = roundConstraintLayout;
        this.deleteTv = textView;
    }

    public static DeletePopLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DeletePopLayoutBinding deletePopLayoutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return deletePopLayoutBindingInflate;
    }

    @Deprecated
    public static DeletePopLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DeletePopLayoutBinding deletePopLayoutBinding = (DeletePopLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.delete_pop_layout, viewGroup, z, obj);
        int i4 = copydefault + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return deletePopLayoutBinding;
    }

    public static DeletePopLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DeletePopLayoutBinding deletePopLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return deletePopLayoutBindingInflate;
    }

    @Deprecated
    public static DeletePopLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        DeletePopLayoutBinding deletePopLayoutBinding = (DeletePopLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.delete_pop_layout : R.layout.delete_pop_layout, null, false, obj);
        int i3 = component1 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return deletePopLayoutBinding;
        }
        throw null;
    }

    public static DeletePopLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DeletePopLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DeletePopLayoutBinding deletePopLayoutBinding = (DeletePopLayoutBinding) bind(obj, view, R.layout.delete_pop_layout);
        int i4 = copydefault + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return deletePopLayoutBinding;
    }
}
