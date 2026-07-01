package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityExportStatementBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final LoadingButton btnConfirm;
    public final CardView cardAbbr;
    public final RoundImageView ivAvatar;
    public final RoundImageView ivBack;
    public final LinearLayout llPhoneNumber;
    public final RadioButton rbSendViaEmail;
    public final RadioButton rbViewInApp;
    public final RadioGroup rgExportMethod;
    public final CommonInputView selectEndDate;
    public final CommonInputView selectStartDate;
    public final TextView tvAbbr;
    public final TextView tvEmailNotice;
    public final TextView tvName;
    public final TextView tvPhoneNumberValue;
    public final TextView tvToolbarTitle;

    protected ActivityExportStatementBinding(Object obj, View view, int i, LoadingButton loadingButton, CardView cardView, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, CommonInputView commonInputView, CommonInputView commonInputView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.cardAbbr = cardView;
        this.ivAvatar = roundImageView;
        this.ivBack = roundImageView2;
        this.llPhoneNumber = linearLayout;
        this.rbSendViaEmail = radioButton;
        this.rbViewInApp = radioButton2;
        this.rgExportMethod = radioGroup;
        this.selectEndDate = commonInputView;
        this.selectStartDate = commonInputView2;
        this.tvAbbr = textView;
        this.tvEmailNotice = textView2;
        this.tvName = textView3;
        this.tvPhoneNumberValue = textView4;
        this.tvToolbarTitle = textView5;
    }

    public static ActivityExportStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityExportStatementBinding activityExportStatementBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return activityExportStatementBindingInflate;
    }

    @Deprecated
    public static ActivityExportStatementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityExportStatementBinding activityExportStatementBinding = (ActivityExportStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_export_statement, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return activityExportStatementBinding;
    }

    public static ActivityExportStatementBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityExportStatementBinding activityExportStatementBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityExportStatementBindingInflate;
    }

    @Deprecated
    public static ActivityExportStatementBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 35;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_export_statement;
            z = true;
        } else {
            i = R.layout.activity_export_statement;
            z = false;
        }
        return (ActivityExportStatementBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityExportStatementBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityExportStatementBinding activityExportStatementBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityExportStatementBindingBind;
    }

    @Deprecated
    public static ActivityExportStatementBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityExportStatementBinding activityExportStatementBinding = (ActivityExportStatementBinding) bind(obj, view, R.layout.activity_export_statement);
        int i4 = component1 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityExportStatementBinding;
    }
}
