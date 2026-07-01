package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySfcEasyTalkBundlesBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final ConstraintLayout csEasyTalk;
    public final RoundImageView ivBack;
    public final ImageView ivBundle;
    public final RoundConstraintLayout rlBundleContainer;
    public final RecyclerView rvBundles;
    public final RecyclerView rvCategory;
    public final TextView tvBundleDesc;
    public final TextView tvBundleTitle;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivitySfcEasyTalkBundlesBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, RoundImageView roundImageView, ImageView imageView, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.csEasyTalk = constraintLayout;
        this.ivBack = roundImageView;
        this.ivBundle = imageView;
        this.rlBundleContainer = roundConstraintLayout;
        this.rvBundles = recyclerView;
        this.rvCategory = recyclerView2;
        this.tvBundleDesc = textView;
        this.tvBundleTitle = textView2;
        this.tvTitle = textView3;
        this.viewBg = view2;
    }

    public static ActivitySfcEasyTalkBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEasyTalkBundlesBinding activitySfcEasyTalkBundlesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcEasyTalkBundlesBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcEasyTalkBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEasyTalkBundlesBinding activitySfcEasyTalkBundlesBinding = (ActivitySfcEasyTalkBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_easy_talk_bundles, viewGroup, z, obj);
        int i4 = ShareDataUIState + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcEasyTalkBundlesBinding;
    }

    public static ActivitySfcEasyTalkBundlesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySfcEasyTalkBundlesBinding activitySfcEasyTalkBundlesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 53;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
        }
        return activitySfcEasyTalkBundlesBindingInflate;
    }

    @Deprecated
    public static ActivitySfcEasyTalkBundlesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEasyTalkBundlesBinding activitySfcEasyTalkBundlesBinding = (ActivitySfcEasyTalkBundlesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_easy_talk_bundles, null, false, obj);
        int i4 = copydefault + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcEasyTalkBundlesBinding;
    }

    public static ActivitySfcEasyTalkBundlesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcEasyTalkBundlesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcEasyTalkBundlesBinding activitySfcEasyTalkBundlesBinding = (ActivitySfcEasyTalkBundlesBinding) bind(obj, view, R.layout.activity_sfc_easy_talk_bundles);
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return activitySfcEasyTalkBundlesBinding;
    }
}
