package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ActivityAnswerOtherQuestionBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final LoadingButton btnContinue;
    public final LinearLayout llContent;

    protected ActivityAnswerOtherQuestionBinding(Object obj, View view, int i, LoadingButton loadingButton, LinearLayout linearLayout) {
        super(obj, view, i);
        this.btnContinue = loadingButton;
        this.llContent = linearLayout;
    }

    public static ActivityAnswerOtherQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityAnswerOtherQuestionBinding activityAnswerOtherQuestionBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 75;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activityAnswerOtherQuestionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 32 / 0;
        } else {
            activityAnswerOtherQuestionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 43;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityAnswerOtherQuestionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityAnswerOtherQuestionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAnswerOtherQuestionBinding activityAnswerOtherQuestionBinding = (ActivityAnswerOtherQuestionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_answer_other_question, viewGroup, z, obj);
        int i4 = component1 + 67;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activityAnswerOtherQuestionBinding;
    }

    public static ActivityAnswerOtherQuestionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivityAnswerOtherQuestionBinding activityAnswerOtherQuestionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 11;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return activityAnswerOtherQuestionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ActivityAnswerOtherQuestionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivityAnswerOtherQuestionBinding activityAnswerOtherQuestionBinding = (ActivityAnswerOtherQuestionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_answer_other_question, null, false, obj);
        int i4 = component3 + 101;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return activityAnswerOtherQuestionBinding;
        }
        throw null;
    }

    public static ActivityAnswerOtherQuestionBinding bind(View view) {
        ActivityAnswerOtherQuestionBinding activityAnswerOtherQuestionBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            activityAnswerOtherQuestionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 71 / 0;
        } else {
            activityAnswerOtherQuestionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityAnswerOtherQuestionBindingBind;
    }

    @Deprecated
    public static ActivityAnswerOtherQuestionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.activity_answer_other_question);
        if (i3 == 0) {
            return (ActivityAnswerOtherQuestionBinding) viewDataBindingBind;
        }
        throw null;
    }
}
