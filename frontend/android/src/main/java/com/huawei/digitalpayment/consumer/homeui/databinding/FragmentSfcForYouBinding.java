package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class FragmentSfcForYouBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final TextView airtimeOffersTitle;
    public final BannerView bannerView;
    public final TextView bongaDealsTitle;
    public final CardView cardBazeContainer;
    public final TextView comingUpTitle;
    public final TextView masakoOffersTitle;
    public final RecyclerView rvAirtimeCategory;
    public final RecyclerView rvAirtimeOffer;
    public final RecyclerView rvBongaDeals;
    public final RecyclerView rvComingUp;
    public final RecyclerView rvDiscoverHomeInternet;
    public final RecyclerView rvDiscoverHomeInternetCategory;
    public final RecyclerView rvMasakoOffers;
    public final RecyclerView rvWhatNews;
    public final NestedScrollView scrollView;
    public final TextView tvAirtimeSeeMore;
    public final TextView tvBazeTitle;
    public final TextView tvBongaSeeMore;
    public final TextView tvDiscoverHomeInternetTitle;
    public final TextView tvMasakoViewAll;

    protected FragmentSfcForYouBinding(Object obj, View view, int i, TextView textView, BannerView bannerView, TextView textView2, CardView cardView, TextView textView3, TextView textView4, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, RecyclerView recyclerView5, RecyclerView recyclerView6, RecyclerView recyclerView7, RecyclerView recyclerView8, NestedScrollView nestedScrollView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.airtimeOffersTitle = textView;
        this.bannerView = bannerView;
        this.bongaDealsTitle = textView2;
        this.cardBazeContainer = cardView;
        this.comingUpTitle = textView3;
        this.masakoOffersTitle = textView4;
        this.rvAirtimeCategory = recyclerView;
        this.rvAirtimeOffer = recyclerView2;
        this.rvBongaDeals = recyclerView3;
        this.rvComingUp = recyclerView4;
        this.rvDiscoverHomeInternet = recyclerView5;
        this.rvDiscoverHomeInternetCategory = recyclerView6;
        this.rvMasakoOffers = recyclerView7;
        this.rvWhatNews = recyclerView8;
        this.scrollView = nestedScrollView;
        this.tvAirtimeSeeMore = textView5;
        this.tvBazeTitle = textView6;
        this.tvBongaSeeMore = textView7;
        this.tvDiscoverHomeInternetTitle = textView8;
        this.tvMasakoViewAll = textView9;
    }

    public static FragmentSfcForYouBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForYouBinding fragmentSfcForYouBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 103;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return fragmentSfcForYouBindingInflate;
    }

    @Deprecated
    public static FragmentSfcForYouBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        FragmentSfcForYouBinding fragmentSfcForYouBinding = (FragmentSfcForYouBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_for_you, viewGroup, z, obj);
        int i3 = component3 + 59;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentSfcForYouBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static FragmentSfcForYouBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForYouBinding fragmentSfcForYouBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return fragmentSfcForYouBindingInflate;
    }

    @Deprecated
    public static FragmentSfcForYouBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentSfcForYouBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_sfc_for_you, null, false, obj);
    }

    public static FragmentSfcForYouBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcForYouBinding fragmentSfcForYouBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcForYouBindingBind;
    }

    @Deprecated
    public static FragmentSfcForYouBinding bind(View view, Object obj) {
        FragmentSfcForYouBinding fragmentSfcForYouBinding;
        int i = 2 % 2;
        int i2 = component3 + 21;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            fragmentSfcForYouBinding = (FragmentSfcForYouBinding) bind(obj, view, R.layout.fragment_sfc_for_you);
            int i3 = 77 / 0;
        } else {
            fragmentSfcForYouBinding = (FragmentSfcForYouBinding) bind(obj, view, R.layout.fragment_sfc_for_you);
        }
        int i4 = component3 + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcForYouBinding;
    }
}
