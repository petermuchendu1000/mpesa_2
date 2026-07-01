package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class ActivitySfcSimpleResultBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final ImageView bannerView;
    public final LoadingButton btnConfirm;
    public final CycleViewPager cycleView;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivDelete;
    public final View ivGuideline;
    public final LinearLayout llBannerContainer;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlContainerFail;
    public final RoundConstraintLayout rlSuccessContainer;
    public final RoundTextView tvAvatar;
    public final TextView tvBannerTitle;
    public final TextView tvDes;
    public final TextView tvExpiryDate;
    public final TextView tvFailTips;
    public final TextView tvFailTitle;
    public final TextView tvTitle;

    protected ActivitySfcSimpleResultBinding(Object obj, View view, int i, ImageView imageView, LoadingButton loadingButton, CycleViewPager cycleViewPager, RoundImageView roundImageView, RoundImageView roundImageView2, View view2, LinearLayout linearLayout, CardView cardView, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, RoundTextView roundTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.bannerView = imageView;
        this.btnConfirm = loadingButton;
        this.cycleView = cycleViewPager;
        this.ivAvatar = roundImageView;
        this.ivDelete = roundImageView2;
        this.ivGuideline = view2;
        this.llBannerContainer = linearLayout;
        this.rlContainer = cardView;
        this.rlContainerFail = roundConstraintLayout;
        this.rlSuccessContainer = roundConstraintLayout2;
        this.tvAvatar = roundTextView;
        this.tvBannerTitle = textView;
        this.tvDes = textView2;
        this.tvExpiryDate = textView3;
        this.tvFailTips = textView4;
        this.tvFailTitle = textView5;
        this.tvTitle = textView6;
    }

    public static ActivitySfcSimpleResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySfcSimpleResultBinding activitySfcSimpleResultBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 49;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySfcSimpleResultBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcSimpleResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySfcSimpleResultBinding activitySfcSimpleResultBinding = (ActivitySfcSimpleResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_simple_result, viewGroup, z, obj);
        int i3 = component3 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcSimpleResultBinding;
    }

    public static ActivitySfcSimpleResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcSimpleResultBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 29;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_sfc_simple_result;
            z = true;
        } else {
            i = R.layout.activity_sfc_simple_result;
            z = false;
        }
        ActivitySfcSimpleResultBinding activitySfcSimpleResultBinding = (ActivitySfcSimpleResultBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSimpleResultBinding;
    }

    public static ActivitySfcSimpleResultBinding bind(View view) {
        ActivitySfcSimpleResultBinding activitySfcSimpleResultBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            activitySfcSimpleResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 86 / 0;
        } else {
            activitySfcSimpleResultBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcSimpleResultBindingBind;
    }

    @Deprecated
    public static ActivitySfcSimpleResultBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcSimpleResultBinding activitySfcSimpleResultBinding = (ActivitySfcSimpleResultBinding) bind(obj, view, R.layout.activity_sfc_simple_result);
        int i4 = component3 + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcSimpleResultBinding;
        }
        throw null;
    }
}
