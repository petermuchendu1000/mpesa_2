package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcDiyBundlesFinalConfirmBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final View ivGuideline;
    public final CardView rlContainer;
    public final RecyclerView rvConfirm;
    public final TextView tvPayTitle;
    public final TextView tvTitle;
    public final View viewBg;
    public final View viewDivider;

    protected ActivitySfcDiyBundlesFinalConfirmBinding(Object obj, View view, int i, LoadingButton loadingButton, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2, View view3, View view4) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.ivGuideline = view2;
        this.rlContainer = cardView;
        this.rvConfirm = recyclerView;
        this.tvPayTitle = textView;
        this.tvTitle = textView2;
        this.viewBg = view3;
        this.viewDivider = view4;
    }

    public static ActivitySfcDiyBundlesFinalConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivitySfcDiyBundlesFinalConfirmBinding activitySfcDiyBundlesFinalConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcDiyBundlesFinalConfirmBindingInflate;
    }

    @Deprecated
    public static ActivitySfcDiyBundlesFinalConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDiyBundlesFinalConfirmBinding activitySfcDiyBundlesFinalConfirmBinding = (ActivitySfcDiyBundlesFinalConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_diy_bundles_final_confirm, viewGroup, z, obj);
        int i4 = component3 + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcDiyBundlesFinalConfirmBinding;
        }
        throw null;
    }

    public static ActivitySfcDiyBundlesFinalConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcDiyBundlesFinalConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDiyBundlesFinalConfirmBinding activitySfcDiyBundlesFinalConfirmBinding = (ActivitySfcDiyBundlesFinalConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_diy_bundles_final_confirm, null, false, obj);
        int i4 = component2 + 47;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcDiyBundlesFinalConfirmBinding;
        }
        throw null;
    }

    public static ActivitySfcDiyBundlesFinalConfirmBinding bind(View view) {
        ActivitySfcDiyBundlesFinalConfirmBinding activitySfcDiyBundlesFinalConfirmBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activitySfcDiyBundlesFinalConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 59 / 0;
        } else {
            activitySfcDiyBundlesFinalConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 35;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcDiyBundlesFinalConfirmBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcDiyBundlesFinalConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcDiyBundlesFinalConfirmBinding activitySfcDiyBundlesFinalConfirmBinding = (ActivitySfcDiyBundlesFinalConfirmBinding) bind(obj, view, R.layout.activity_sfc_diy_bundles_final_confirm);
        int i4 = component3 + 91;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcDiyBundlesFinalConfirmBinding;
        }
        throw null;
    }
}
