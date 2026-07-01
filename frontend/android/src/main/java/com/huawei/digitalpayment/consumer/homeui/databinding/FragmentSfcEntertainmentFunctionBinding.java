package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcEntertainmentFunctionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final CardView miniAppCard;
    public final RecyclerView recyclerView;
    public final TextView tvTitle;

    protected FragmentSfcEntertainmentFunctionBinding(Object obj, View view, int i, CardView cardView, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.miniAppCard = cardView;
        this.recyclerView = recyclerView;
        this.tvTitle = textView;
    }

    public static FragmentSfcEntertainmentFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        FragmentSfcEntertainmentFunctionBinding fragmentSfcEntertainmentFunctionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 113;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return fragmentSfcEntertainmentFunctionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static FragmentSfcEntertainmentFunctionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FragmentSfcEntertainmentFunctionBinding fragmentSfcEntertainmentFunctionBinding = (FragmentSfcEntertainmentFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_entertainment_function, viewGroup, z, obj);
        int i3 = ShareDataUIState + 41;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return fragmentSfcEntertainmentFunctionBinding;
    }

    public static FragmentSfcEntertainmentFunctionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcEntertainmentFunctionBinding fragmentSfcEntertainmentFunctionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 105;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return fragmentSfcEntertainmentFunctionBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentSfcEntertainmentFunctionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 77;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.fragment_sfc_entertainment_function;
            z = true;
        } else {
            i = R.layout.fragment_sfc_entertainment_function;
            z = false;
        }
        FragmentSfcEntertainmentFunctionBinding fragmentSfcEntertainmentFunctionBinding = (FragmentSfcEntertainmentFunctionBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentSfcEntertainmentFunctionBinding;
        }
        throw null;
    }

    public static FragmentSfcEntertainmentFunctionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcEntertainmentFunctionBinding fragmentSfcEntertainmentFunctionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcEntertainmentFunctionBindingBind;
    }

    @Deprecated
    public static FragmentSfcEntertainmentFunctionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcEntertainmentFunctionBinding fragmentSfcEntertainmentFunctionBinding = (FragmentSfcEntertainmentFunctionBinding) bind(obj, view, R.layout.fragment_sfc_entertainment_function);
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcEntertainmentFunctionBinding;
    }
}
