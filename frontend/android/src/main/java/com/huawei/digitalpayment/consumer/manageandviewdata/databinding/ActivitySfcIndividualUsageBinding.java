package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

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
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class ActivitySfcIndividualUsageBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final CardView cardData;
    public final CardView cardPeriod;
    public final ConstraintLayout csTitles;
    public final ConstraintLayout csTotals;
    public final CommonInputView etDateInput;
    public final RecyclerView rcCharges;
    public final TextView tvAirtimeUsagePeriod;
    public final TextView tvCharge;
    public final TextView tvDescription;
    public final TextView tvPeriod;
    public final TextView tvTotal;
    public final TextView tvTotalVal;
    public final TextView tvUsageName;

    protected ActivitySfcIndividualUsageBinding(Object obj, View view, int i, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CommonInputView commonInputView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.cardData = cardView;
        this.cardPeriod = cardView2;
        this.csTitles = constraintLayout;
        this.csTotals = constraintLayout2;
        this.etDateInput = commonInputView;
        this.rcCharges = recyclerView;
        this.tvAirtimeUsagePeriod = textView;
        this.tvCharge = textView2;
        this.tvDescription = textView3;
        this.tvPeriod = textView4;
        this.tvTotal = textView5;
        this.tvTotalVal = textView6;
        this.tvUsageName = textView7;
    }

    public static ActivitySfcIndividualUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualUsageBinding activitySfcIndividualUsageBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcIndividualUsageBindingInflate;
    }

    @Deprecated
    public static ActivitySfcIndividualUsageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualUsageBinding activitySfcIndividualUsageBinding = (ActivitySfcIndividualUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_individual_usage, viewGroup, z, obj);
        int i4 = ShareDataUIState + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcIndividualUsageBinding;
    }

    public static ActivitySfcIndividualUsageBinding inflate(LayoutInflater layoutInflater) {
        ActivitySfcIndividualUsageBinding activitySfcIndividualUsageBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            activitySfcIndividualUsageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 55 / 0;
        } else {
            activitySfcIndividualUsageBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 19;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activitySfcIndividualUsageBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySfcIndividualUsageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySfcIndividualUsageBinding activitySfcIndividualUsageBinding = (ActivitySfcIndividualUsageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_sfc_individual_usage, null, false, obj);
        int i4 = ShareDataUIState + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySfcIndividualUsageBinding;
    }

    public static ActivitySfcIndividualUsageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ActivitySfcIndividualUsageBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivitySfcIndividualUsageBinding activitySfcIndividualUsageBinding = (ActivitySfcIndividualUsageBinding) bind(obj, view, R.layout.activity_sfc_individual_usage);
        int i3 = ShareDataUIState + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return activitySfcIndividualUsageBinding;
    }
}
