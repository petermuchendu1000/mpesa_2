package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.item.CommonItemView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class ActivityHelpFeedbackBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final CommonItemView tvFaq;
    public final CommonItemView tvFeedback;
    public final CommonItemView tvHelp;

    protected ActivityHelpFeedbackBinding(Object obj, View view, int i, CommonItemView commonItemView, CommonItemView commonItemView2, CommonItemView commonItemView3) {
        super(obj, view, i);
        this.tvFaq = commonItemView;
        this.tvFeedback = commonItemView2;
        this.tvHelp = commonItemView3;
    }

    public static ActivityHelpFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityHelpFeedbackBinding activityHelpFeedbackBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 41;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityHelpFeedbackBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityHelpFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHelpFeedbackBinding activityHelpFeedbackBinding = (ActivityHelpFeedbackBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_help_feedback, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return activityHelpFeedbackBinding;
    }

    public static ActivityHelpFeedbackBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHelpFeedbackBinding activityHelpFeedbackBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return activityHelpFeedbackBindingInflate;
    }

    @Deprecated
    public static ActivityHelpFeedbackBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHelpFeedbackBinding activityHelpFeedbackBinding = (ActivityHelpFeedbackBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_help_feedback, null, false, obj);
        int i4 = component2 + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityHelpFeedbackBinding;
    }

    public static ActivityHelpFeedbackBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHelpFeedbackBinding activityHelpFeedbackBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return activityHelpFeedbackBindingBind;
    }

    @Deprecated
    public static ActivityHelpFeedbackBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityHelpFeedbackBinding activityHelpFeedbackBinding = (ActivityHelpFeedbackBinding) bind(obj, view, R.layout.activity_help_feedback);
        int i4 = component1 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return activityHelpFeedbackBinding;
    }
}
