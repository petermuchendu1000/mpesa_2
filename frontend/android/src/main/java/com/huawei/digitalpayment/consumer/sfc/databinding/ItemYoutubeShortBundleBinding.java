package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemYoutubeShortBundleBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final ConstraintLayout csLabels;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final RoundConstraintLayout rlBannerTab;
    public final RoundConstraintLayout rlBundleContainer;
    public final TextView tvBundleTitle;
    public final TextView tvBundleValidTime;
    public final RoundTextView tvBuy;

    protected ItemYoutubeShortBundleBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, TextView textView, TextView textView2, RoundTextView roundTextView) {
        super(obj, view, i);
        this.csLabels = constraintLayout;
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.rlBannerTab = roundConstraintLayout;
        this.rlBundleContainer = roundConstraintLayout2;
        this.tvBundleTitle = textView;
        this.tvBundleValidTime = textView2;
        this.tvBuy = roundTextView;
    }

    public static ItemYoutubeShortBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemYoutubeShortBundleBinding itemYoutubeShortBundleBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 89;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return itemYoutubeShortBundleBindingInflate;
    }

    @Deprecated
    public static ItemYoutubeShortBundleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemYoutubeShortBundleBinding itemYoutubeShortBundleBinding = (ItemYoutubeShortBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_youtube_short_bundle, viewGroup, z, obj);
        int i4 = ShareDataUIState + 121;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemYoutubeShortBundleBinding;
    }

    public static ItemYoutubeShortBundleBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemYoutubeShortBundleBinding itemYoutubeShortBundleBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 65;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemYoutubeShortBundleBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemYoutubeShortBundleBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemYoutubeShortBundleBinding itemYoutubeShortBundleBinding = (ItemYoutubeShortBundleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_youtube_short_bundle, null, false, obj);
        int i4 = ShareDataUIState + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemYoutubeShortBundleBinding;
    }

    public static ItemYoutubeShortBundleBinding bind(View view) {
        ItemYoutubeShortBundleBinding itemYoutubeShortBundleBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            itemYoutubeShortBundleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 73 / 0;
        } else {
            itemYoutubeShortBundleBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 49;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemYoutubeShortBundleBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemYoutubeShortBundleBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemYoutubeShortBundleBinding itemYoutubeShortBundleBinding = (ItemYoutubeShortBundleBinding) bind(obj, view, R.layout.item_youtube_short_bundle);
        int i4 = component3 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemYoutubeShortBundleBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
