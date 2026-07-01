package com.huawei.digitalpayment.consumer.scheduleui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.scheduleui.R;

public abstract class ScheduleItemAutomaticPaymentBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final RoundRecyclerView displayRecycler;
    public final ImageView ivDelete;
    public final TextView tvAutomaticPaymentName;
    public final RoundTextView tvFrequency;

    protected ScheduleItemAutomaticPaymentBinding(Object obj, View view, int i, RoundRecyclerView roundRecyclerView, ImageView imageView, TextView textView, RoundTextView roundTextView) {
        super(obj, view, i);
        this.displayRecycler = roundRecyclerView;
        this.ivDelete = imageView;
        this.tvAutomaticPaymentName = textView;
        this.tvFrequency = roundTextView;
    }

    public static ScheduleItemAutomaticPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ScheduleItemAutomaticPaymentBinding scheduleItemAutomaticPaymentBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 63;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return scheduleItemAutomaticPaymentBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ScheduleItemAutomaticPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_item_automatic_payment, viewGroup, z, obj);
        if (i3 == 0) {
            return (ScheduleItemAutomaticPaymentBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static ScheduleItemAutomaticPaymentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ScheduleItemAutomaticPaymentBinding scheduleItemAutomaticPaymentBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return scheduleItemAutomaticPaymentBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ScheduleItemAutomaticPaymentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ScheduleItemAutomaticPaymentBinding scheduleItemAutomaticPaymentBinding = (ScheduleItemAutomaticPaymentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.schedule_item_automatic_payment, null, false, obj);
        int i4 = ShareDataUIState + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return scheduleItemAutomaticPaymentBinding;
    }

    public static ScheduleItemAutomaticPaymentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ScheduleItemAutomaticPaymentBinding bind(View view, Object obj) {
        ScheduleItemAutomaticPaymentBinding scheduleItemAutomaticPaymentBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            scheduleItemAutomaticPaymentBinding = (ScheduleItemAutomaticPaymentBinding) bind(obj, view, R.layout.schedule_item_automatic_payment);
            int i3 = 37 / 0;
        } else {
            scheduleItemAutomaticPaymentBinding = (ScheduleItemAutomaticPaymentBinding) bind(obj, view, R.layout.schedule_item_automatic_payment);
        }
        int i4 = copydefault + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return scheduleItemAutomaticPaymentBinding;
        }
        throw null;
    }
}
