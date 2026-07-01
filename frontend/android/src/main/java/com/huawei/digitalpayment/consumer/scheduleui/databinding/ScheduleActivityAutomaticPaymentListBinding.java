package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.recyclerview.HFRecyclerView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class ScheduleActivityAutomaticPaymentListBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final RoundLinearLayout llCreateSchedulePayment;
    public final LinearLayout noResult;
    public final HFRecyclerView recyclerview;
    public final RoundTextView tvTitle;

    protected ScheduleActivityAutomaticPaymentListBinding(Object obj, View view, int i, RoundLinearLayout roundLinearLayout, LinearLayout linearLayout, HFRecyclerView hFRecyclerView, RoundTextView roundTextView) {
        super(obj, view, i);
        this.llCreateSchedulePayment = roundLinearLayout;
        this.noResult = linearLayout;
        this.recyclerview = hFRecyclerView;
        this.tvTitle = roundTextView;
    }

    public static ScheduleActivityAutomaticPaymentListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityAutomaticPaymentListBinding scheduleActivityAutomaticPaymentListBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 89;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return scheduleActivityAutomaticPaymentListBindingInflate;
    }

    @Deprecated
    public static ScheduleActivityAutomaticPaymentListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_activity_automatic_payment_list, viewGroup, z, obj);
        if (i3 != 0) {
            return (ScheduleActivityAutomaticPaymentListBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ScheduleActivityAutomaticPaymentListBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityAutomaticPaymentListBinding scheduleActivityAutomaticPaymentListBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return scheduleActivityAutomaticPaymentListBindingInflate;
    }

    @Deprecated
    public static ScheduleActivityAutomaticPaymentListBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ScheduleActivityAutomaticPaymentListBinding scheduleActivityAutomaticPaymentListBinding = (ScheduleActivityAutomaticPaymentListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_activity_automatic_payment_list, null, false, obj);
        int i4 = ShareDataUIState + 119;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return scheduleActivityAutomaticPaymentListBinding;
        }
        throw null;
    }

    public static ScheduleActivityAutomaticPaymentListBinding bind(View view) {
        ScheduleActivityAutomaticPaymentListBinding scheduleActivityAutomaticPaymentListBindingBind;
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            scheduleActivityAutomaticPaymentListBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 71 / 0;
        } else {
            scheduleActivityAutomaticPaymentListBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 17;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return scheduleActivityAutomaticPaymentListBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ScheduleActivityAutomaticPaymentListBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ScheduleActivityAutomaticPaymentListBinding scheduleActivityAutomaticPaymentListBinding = (ScheduleActivityAutomaticPaymentListBinding) bind(obj, view, R.layout.schedule_activity_automatic_payment_list);
        int i3 = ShareDataUIState + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return scheduleActivityAutomaticPaymentListBinding;
    }
}
