package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class SearchViewBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final ConstraintLayout clSearch;
    public final CommonInputView edittext;
    public final ImageView ivClear;
    public final LinearLayout llRight;
    public final ConstraintLayout rlSearch;
    public final ImageView searchfind;
    public final TextView tvSearch;

    protected SearchViewBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, CommonInputView commonInputView, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.clSearch = constraintLayout;
        this.edittext = commonInputView;
        this.ivClear = imageView;
        this.llRight = linearLayout;
        this.rlSearch = constraintLayout2;
        this.searchfind = imageView2;
        this.tvSearch = textView;
    }

    public static SearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SearchViewBinding searchViewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 125;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return searchViewBindingInflate;
    }

    @Deprecated
    public static SearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        SearchViewBinding searchViewBinding = (SearchViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.search_view, viewGroup, z, obj);
        int i3 = ShareDataUIState + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return searchViewBinding;
    }

    public static SearchViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SearchViewBinding searchViewBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return searchViewBindingInflate;
    }

    @Deprecated
    public static SearchViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SearchViewBinding searchViewBinding = (SearchViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.search_view, null, false, obj);
        int i4 = ShareDataUIState + 47;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return searchViewBinding;
        }
        throw null;
    }

    public static SearchViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SearchViewBinding searchViewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return searchViewBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static SearchViewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        SearchViewBinding searchViewBinding = (SearchViewBinding) bind(obj, view, R.layout.search_view);
        int i3 = component1 + 73;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return searchViewBinding;
    }
}
