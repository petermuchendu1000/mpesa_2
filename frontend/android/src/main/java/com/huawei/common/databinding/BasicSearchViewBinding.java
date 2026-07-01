package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.R;
import com.huawei.common.widget.input.CommonInputView;

public abstract class BasicSearchViewBinding extends ViewDataBinding {
    public final ConstraintLayout clSearchRoot;
    public final CommonInputView edittext;
    public final ImageView imClear;
    public final ImageView imSearch;
    public final ImageView imSearchEnd;
    public final LinearLayout llRightSearch;
    public final ConstraintLayout rlSearch;
    public final TextView tvSearch;
    public final View vUnEnableRoot;
    public final View viewDivider;

    protected BasicSearchViewBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, CommonInputView commonInputView, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextView textView, View view2, View view3) {
        super(obj, view, i);
        this.clSearchRoot = constraintLayout;
        this.edittext = commonInputView;
        this.imClear = imageView;
        this.imSearch = imageView2;
        this.imSearchEnd = imageView3;
        this.llRightSearch = linearLayout;
        this.rlSearch = constraintLayout2;
        this.tvSearch = textView;
        this.vUnEnableRoot = view2;
        this.viewDivider = view3;
    }

    public static BasicSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSearchViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (BasicSearchViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_search_view, viewGroup, z, obj);
    }

    public static BasicSearchViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSearchViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (BasicSearchViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.basic_search_view, null, false, obj);
    }

    public static BasicSearchViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static BasicSearchViewBinding bind(View view, Object obj) {
        return (BasicSearchViewBinding) bind(obj, view, R.layout.basic_search_view);
    }
}
