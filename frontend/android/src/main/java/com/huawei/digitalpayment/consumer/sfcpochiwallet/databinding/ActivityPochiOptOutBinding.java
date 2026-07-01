package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityPochiOptOutBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final LoadingButton btnConfirm;
    public final CardView cvInputContainer;
    public final EditText inputReason;
    public final RoundImageView ivBack;
    public final LinearLayout llTipsContainer;
    public final RecyclerView rvReason;
    public final TextView tvReasonTitle;
    public final TextView tvTips;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivityPochiOptOutBinding(Object obj, View view, int i, LoadingButton loadingButton, CardView cardView, EditText editText, RoundImageView roundImageView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.cvInputContainer = cardView;
        this.inputReason = editText;
        this.ivBack = roundImageView;
        this.llTipsContainer = linearLayout;
        this.rvReason = recyclerView;
        this.tvReasonTitle = textView;
        this.tvTips = textView2;
        this.tvTitle = textView3;
        this.viewBg = view2;
    }

    public static ActivityPochiOptOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiOptOutBinding activityPochiOptOutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiOptOutBindingInflate;
    }

    @Deprecated
    public static ActivityPochiOptOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityPochiOptOutBinding activityPochiOptOutBinding;
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            activityPochiOptOutBinding = (ActivityPochiOptOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_opt_out, viewGroup, z, obj);
            int i3 = 12 / 0;
        } else {
            activityPochiOptOutBinding = (ActivityPochiOptOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_opt_out, viewGroup, z, obj);
        }
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return activityPochiOptOutBinding;
    }

    public static ActivityPochiOptOutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiOptOutBinding activityPochiOptOutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return activityPochiOptOutBindingInflate;
    }

    @Deprecated
    public static ActivityPochiOptOutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiOptOutBinding activityPochiOptOutBinding = (ActivityPochiOptOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_opt_out, null, false, obj);
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiOptOutBinding;
    }

    public static ActivityPochiOptOutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiOptOutBinding activityPochiOptOutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 59;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityPochiOptOutBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityPochiOptOutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivityPochiOptOutBinding activityPochiOptOutBinding = (ActivityPochiOptOutBinding) bind(obj, view, R.layout.activity_pochi_opt_out);
        int i3 = component1 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityPochiOptOutBinding;
    }
}
