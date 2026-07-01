package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.text.AmountInputView2;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class ActivitySetAmountBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final LoadingButton btnConfirm;
    public final AmountInputView2 inputAmount;
    public final View line;

    @Bindable
    protected Boolean mIsAmend;
    public final TextView tvAddNotes;
    public final TextView tvAmend;

    public abstract void setIsAmend(Boolean bool);

    protected ActivitySetAmountBinding(Object obj, View view, int i, LoadingButton loadingButton, AmountInputView2 amountInputView2, View view2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.inputAmount = amountInputView2;
        this.line = view2;
        this.tvAddNotes = textView;
        this.tvAmend = textView2;
    }

    public Boolean getIsAmend() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.mIsAmend;
            int i4 = 20 / 0;
        } else {
            bool = this.mIsAmend;
        }
        int i5 = i2 + 89;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ActivitySetAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetAmountBinding activitySetAmountBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return activitySetAmountBindingInflate;
    }

    @Deprecated
    public static ActivitySetAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetAmountBinding activitySetAmountBinding = (ActivitySetAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_set_amount, viewGroup, z, obj);
        int i4 = component3 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return activitySetAmountBinding;
    }

    public static ActivitySetAmountBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetAmountBinding activitySetAmountBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return activitySetAmountBindingInflate;
    }

    @Deprecated
    public static ActivitySetAmountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        return (ActivitySetAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.activity_set_amount : R.layout.activity_set_amount, null, false, obj);
    }

    public static ActivitySetAmountBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySetAmountBinding activitySetAmountBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 89;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return activitySetAmountBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySetAmountBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetAmountBinding activitySetAmountBinding = (ActivitySetAmountBinding) bind(obj, view, R.layout.activity_set_amount);
        int i4 = copydefault + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySetAmountBinding;
    }
}
