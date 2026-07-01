package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class ScheduleItemAutomaticPaymentHeaderBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final RoundImageView ivIcon;
    public final TextView tvTitle;

    protected ScheduleItemAutomaticPaymentHeaderBinding(Object obj, View view, int i, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.ivIcon = roundImageView;
        this.tvTitle = textView;
    }

    public static ScheduleItemAutomaticPaymentHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleItemAutomaticPaymentHeaderBinding scheduleItemAutomaticPaymentHeaderBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return scheduleItemAutomaticPaymentHeaderBindingInflate;
    }

    @Deprecated
    public static ScheduleItemAutomaticPaymentHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        ScheduleItemAutomaticPaymentHeaderBinding scheduleItemAutomaticPaymentHeaderBinding = (ScheduleItemAutomaticPaymentHeaderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_item_automatic_payment_header, viewGroup, z, obj);
        int i3 = component3 + 77;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return scheduleItemAutomaticPaymentHeaderBinding;
        }
        throw null;
    }

    public static ScheduleItemAutomaticPaymentHeaderBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ScheduleItemAutomaticPaymentHeaderBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleItemAutomaticPaymentHeaderBinding scheduleItemAutomaticPaymentHeaderBinding = (ScheduleItemAutomaticPaymentHeaderBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_item_automatic_payment_header, null, false, obj);
        int i4 = component3 + 99;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return scheduleItemAutomaticPaymentHeaderBinding;
        }
        throw null;
    }

    public static ScheduleItemAutomaticPaymentHeaderBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleItemAutomaticPaymentHeaderBinding scheduleItemAutomaticPaymentHeaderBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return scheduleItemAutomaticPaymentHeaderBindingBind;
    }

    @Deprecated
    public static ScheduleItemAutomaticPaymentHeaderBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleItemAutomaticPaymentHeaderBinding scheduleItemAutomaticPaymentHeaderBinding = (ScheduleItemAutomaticPaymentHeaderBinding) bind(obj, view, R.layout.schedule_item_automatic_payment_header);
        int i4 = component3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return scheduleItemAutomaticPaymentHeaderBinding;
    }
}
