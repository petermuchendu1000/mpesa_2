package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ActivitySfcIndividualSubscriptionsBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final ConstraintLayout csEmpty;
    public final ConstraintLayout csList;
    public final ImageView ivPromotionalMessages;
    public final RecyclerView rcList;
    public final SwipeRefreshLayout swpRefresh;
    public final TextView txEmptyTitle;
    public final TextView txTitle;

    protected ActivitySfcIndividualSubscriptionsBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.csEmpty = constraintLayout;
        this.csList = constraintLayout2;
        this.ivPromotionalMessages = imageView;
        this.rcList = recyclerView;
        this.swpRefresh = swipeRefreshLayout;
        this.txEmptyTitle = textView;
        this.txTitle = textView2;
    }

    public static ActivitySfcIndividualSubscriptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualSubscriptionsBinding activitySfcIndividualSubscriptionsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcIndividualSubscriptionsBindingInflate;
    }

    @Deprecated
    public static ActivitySfcIndividualSubscriptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualSubscriptionsBinding activitySfcIndividualSubscriptionsBinding = (ActivitySfcIndividualSubscriptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_individual_subscriptions, viewGroup, z, obj);
        int i4 = component1 + 125;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcIndividualSubscriptionsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySfcIndividualSubscriptionsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualSubscriptionsBinding activitySfcIndividualSubscriptionsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcIndividualSubscriptionsBindingInflate;
    }

    @Deprecated
    public static ActivitySfcIndividualSubscriptionsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualSubscriptionsBinding activitySfcIndividualSubscriptionsBinding = (ActivitySfcIndividualSubscriptionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_individual_subscriptions, null, false, obj);
        int i4 = component3 + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcIndividualSubscriptionsBinding;
    }

    public static ActivitySfcIndividualSubscriptionsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualSubscriptionsBinding activitySfcIndividualSubscriptionsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySfcIndividualSubscriptionsBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivitySfcIndividualSubscriptionsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualSubscriptionsBinding activitySfcIndividualSubscriptionsBinding = (ActivitySfcIndividualSubscriptionsBinding) bind(obj, view, R.layout.activity_sfc_individual_subscriptions);
        int i4 = component1 + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcIndividualSubscriptionsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
