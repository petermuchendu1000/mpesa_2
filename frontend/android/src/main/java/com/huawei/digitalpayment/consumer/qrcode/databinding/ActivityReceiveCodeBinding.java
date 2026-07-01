package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.qrcode.R;

public abstract class ActivityReceiveCodeBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final AmountDisplayView amountDisplayView;
    public final RoundImageView ivHead;
    public final RoundImageView ivQr;
    public final LinearLayout llRecord;

    @Bindable
    protected Boolean mIsLoading;
    public final RoundLinearLayout recivelinear;
    public final TextView tvName;
    public final TextView tvNotes;
    public final TextView tvSaveImage;
    public final TextView tvSetAmount;
    public final TextView tvTitleLabel;

    public abstract void setIsLoading(Boolean bool);

    protected ActivityReceiveCodeBinding(Object obj, View view, int i, AmountDisplayView amountDisplayView, RoundImageView roundImageView, RoundImageView roundImageView2, LinearLayout linearLayout, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.amountDisplayView = amountDisplayView;
        this.ivHead = roundImageView;
        this.ivQr = roundImageView2;
        this.llRecord = linearLayout;
        this.recivelinear = roundLinearLayout;
        this.tvName = textView;
        this.tvNotes = textView2;
        this.tvSaveImage = textView3;
        this.tvSetAmount = textView4;
        this.tvTitleLabel = textView5;
    }

    public Boolean getIsLoading() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.mIsLoading;
        int i4 = i3 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return bool;
    }

    public static ActivityReceiveCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityReceiveCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityReceiveCodeBinding activityReceiveCodeBinding = (ActivityReceiveCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_receive_code, viewGroup, z, obj);
        int i4 = ShareDataUIState + 91;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return activityReceiveCodeBinding;
    }

    public static ActivityReceiveCodeBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityReceiveCodeBinding activityReceiveCodeBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityReceiveCodeBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityReceiveCodeBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityReceiveCodeBinding activityReceiveCodeBinding = (ActivityReceiveCodeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_receive_code, null, false, obj);
        int i4 = component2 + 105;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityReceiveCodeBinding;
    }

    public static ActivityReceiveCodeBinding bind(View view) {
        ActivityReceiveCodeBinding activityReceiveCodeBindingBind;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            activityReceiveCodeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 53 / 0;
        } else {
            activityReceiveCodeBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 5;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityReceiveCodeBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ActivityReceiveCodeBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityReceiveCodeBinding activityReceiveCodeBinding = (ActivityReceiveCodeBinding) bind(obj, view, R.layout.activity_receive_code);
        int i4 = component2 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return activityReceiveCodeBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
