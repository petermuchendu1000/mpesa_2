package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityRequestComfirmBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final LoadingButton btnConfirm;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final View ivGuideline;
    public final ConstraintLayout rlAvatar;
    public final CardView rlContainer;
    public final ConstraintLayout rlRoot;
    public final RecyclerView rvConfirm;
    public final TextView tvAbbr;
    public final TextView tvTitle;
    public final TextView tvTopTitle;
    public final View viewBg;
    public final View viewDivider;

    protected ActivityRequestComfirmBinding(Object obj, View view, int i, LoadingButton loadingButton, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, ConstraintLayout constraintLayout, CardView cardView2, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, View view3, View view4) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.ivGuideline = view2;
        this.rlAvatar = constraintLayout;
        this.rlContainer = cardView2;
        this.rlRoot = constraintLayout2;
        this.rvConfirm = recyclerView;
        this.tvAbbr = textView;
        this.tvTitle = textView2;
        this.tvTopTitle = textView3;
        this.viewBg = view3;
        this.viewDivider = view4;
    }

    public static ActivityRequestComfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestComfirmBinding activityRequestComfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 101;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return activityRequestComfirmBindingInflate;
    }

    @Deprecated
    public static ActivityRequestComfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityRequestComfirmBinding activityRequestComfirmBinding = (ActivityRequestComfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_request_comfirm, viewGroup, z, obj);
        int i4 = component1 + 91;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return activityRequestComfirmBinding;
    }

    public static ActivityRequestComfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivityRequestComfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActivityRequestComfirmBinding activityRequestComfirmBinding = (ActivityRequestComfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_request_comfirm, null, false, obj);
        int i4 = component1 + 39;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return activityRequestComfirmBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActivityRequestComfirmBinding bind(View view) {
        ActivityRequestComfirmBinding activityRequestComfirmBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activityRequestComfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 25 / 0;
        } else {
            activityRequestComfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 55;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return activityRequestComfirmBindingBind;
    }

    @Deprecated
    public static ActivityRequestComfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityRequestComfirmBinding activityRequestComfirmBinding = (ActivityRequestComfirmBinding) bind(obj, view, R.layout.activity_request_comfirm);
        int i3 = copydefault + 17;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityRequestComfirmBinding;
        }
        throw null;
    }
}
