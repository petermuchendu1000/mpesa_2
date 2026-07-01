package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityAlipayMiniAppSearchBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final CommonInputView inputSearch;
    public final RoundImageView ivBack;
    public final RecyclerView rvBundles;
    public final RecyclerView rvCategory;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivityAlipayMiniAppSearchBinding(Object obj, View view, int i, CommonInputView commonInputView, RoundImageView roundImageView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, View view2) {
        super(obj, view, i);
        this.inputSearch = commonInputView;
        this.ivBack = roundImageView;
        this.rvBundles = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvTitle = textView;
        this.viewBg = view2;
    }

    public static ActivityAlipayMiniAppSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityAlipayMiniAppSearchBinding activityAlipayMiniAppSearchBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityAlipayMiniAppSearchBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityAlipayMiniAppSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_alipay_mini_app_search, viewGroup, z, obj);
        if (i3 == 0) {
            return (ActivityAlipayMiniAppSearchBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ActivityAlipayMiniAppSearchBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityAlipayMiniAppSearchBinding activityAlipayMiniAppSearchBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityAlipayMiniAppSearchBindingInflate;
    }

    @Deprecated
    public static ActivityAlipayMiniAppSearchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        ActivityAlipayMiniAppSearchBinding activityAlipayMiniAppSearchBinding = (ActivityAlipayMiniAppSearchBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_alipay_mini_app_search, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_alipay_mini_app_search, null, false, obj));
        int i3 = copydefault + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
        return activityAlipayMiniAppSearchBinding;
    }

    public static ActivityAlipayMiniAppSearchBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityAlipayMiniAppSearchBinding activityAlipayMiniAppSearchBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityAlipayMiniAppSearchBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityAlipayMiniAppSearchBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_alipay_mini_app_search);
        if (i3 == 0) {
            return (ActivityAlipayMiniAppSearchBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
