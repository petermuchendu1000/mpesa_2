package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class FragmentMtandaoReportBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final MaterialButton actionSubmitNetworkReport;
    public final MaterialCardView cardView4;
    public final CommonInputView commentComp;
    public final ConstraintLayout fieldItems;
    public final ImageView ivItemsDropdown;
    public final Switch optOutSwitch;
    public final Spinner spinnerMtandaoItems;
    public final TextView textView;
    public final TextView textView13;
    public final TextView textView15;
    public final TextView textView2;

    protected FragmentMtandaoReportBinding(Object obj, View view, int i, MaterialButton materialButton, MaterialCardView materialCardView, CommonInputView commonInputView, ConstraintLayout constraintLayout, ImageView imageView, Switch r9, Spinner spinner, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.actionSubmitNetworkReport = materialButton;
        this.cardView4 = materialCardView;
        this.commentComp = commonInputView;
        this.fieldItems = constraintLayout;
        this.ivItemsDropdown = imageView;
        this.optOutSwitch = r9;
        this.spinnerMtandaoItems = spinner;
        this.textView = textView;
        this.textView13 = textView2;
        this.textView15 = textView3;
        this.textView2 = textView4;
    }

    public static FragmentMtandaoReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMtandaoReportBinding fragmentMtandaoReportBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 71;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentMtandaoReportBindingInflate;
    }

    @Deprecated
    public static FragmentMtandaoReportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding;
        int i = 2 % 2;
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            fragmentMtandaoReportBinding = (FragmentMtandaoReportBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_mtandao_report, viewGroup, z, obj);
            int i3 = 80 / 0;
        } else {
            fragmentMtandaoReportBinding = (FragmentMtandaoReportBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_mtandao_report, viewGroup, z, obj);
        }
        int i4 = ShareDataUIState + 49;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return fragmentMtandaoReportBinding;
    }

    public static FragmentMtandaoReportBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentMtandaoReportBinding fragmentMtandaoReportBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return fragmentMtandaoReportBindingInflate;
    }

    @Deprecated
    public static FragmentMtandaoReportBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return (FragmentMtandaoReportBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_mtandao_report, null, false, obj);
    }

    public static FragmentMtandaoReportBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static FragmentMtandaoReportBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.fragment_mtandao_report);
        if (i3 != 0) {
            return (FragmentMtandaoReportBinding) viewDataBindingBind;
        }
        int i4 = 6 / 0;
        return (FragmentMtandaoReportBinding) viewDataBindingBind;
    }
}
