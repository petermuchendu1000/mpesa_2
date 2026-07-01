package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcHomeFunctionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final ImageView ivViewall;
    public final ImageView ivViewallChild;
    public final LinearLayout llViewall;
    public final CardView quickActions;
    public final RecyclerView recyclerView;
    public final TextView tvTitle;
    public final TextView tvViewall;

    protected FragmentSfcHomeFunctionBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivViewall = imageView;
        this.ivViewallChild = imageView2;
        this.llViewall = linearLayout;
        this.quickActions = cardView;
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
        this.tvViewall = textView2;
    }

    public static FragmentSfcHomeFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcHomeFunctionBinding fragmentSfcHomeFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 30 / 0;
        }
        return fragmentSfcHomeFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentSfcHomeFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcHomeFunctionBinding fragmentSfcHomeFunctionBinding = (FragmentSfcHomeFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_home_function, viewGroup, z, obj);
        int i4 = ShareDataUIState + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcHomeFunctionBinding;
    }

    public static FragmentSfcHomeFunctionBinding inflate(LayoutInflater layoutInflater) {
        FragmentSfcHomeFunctionBinding fragmentSfcHomeFunctionBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            fragmentSfcHomeFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 1 / 0;
        } else {
            fragmentSfcHomeFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return fragmentSfcHomeFunctionBindingInflate;
    }

    @Deprecated
    public static FragmentSfcHomeFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        FragmentSfcHomeFunctionBinding fragmentSfcHomeFunctionBinding = (FragmentSfcHomeFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_home_function, null, false, obj);
        int i4 = copydefault + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcHomeFunctionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcHomeFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcHomeFunctionBinding fragmentSfcHomeFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return fragmentSfcHomeFunctionBindingBind;
    }

    @Deprecated
    public static FragmentSfcHomeFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcHomeFunctionBinding fragmentSfcHomeFunctionBinding = (FragmentSfcHomeFunctionBinding) bind(obj, view, R.layout.fragment_sfc_home_function);
        if (i3 != 0) {
            return fragmentSfcHomeFunctionBinding;
        }
        throw null;
    }
}
