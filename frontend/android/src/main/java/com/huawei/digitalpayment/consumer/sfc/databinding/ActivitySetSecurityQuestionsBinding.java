package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySetSecurityQuestionsBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final LoadingButton btnConfirm;
    public final ConstraintLayout clTop;
    public final RoundImageView ivBack;
    public final ImageView ivPinLocked;
    public final LinearLayout llContainer;
    public final TextView tvPinTitle;
    public final TextView tvTitle;

    protected ActivitySetSecurityQuestionsBinding(Object obj, View view, int i, LoadingButton loadingButton, ConstraintLayout constraintLayout, RoundImageView roundImageView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.clTop = constraintLayout;
        this.ivBack = roundImageView;
        this.ivPinLocked = imageView;
        this.llContainer = linearLayout;
        this.tvPinTitle = textView;
        this.tvTitle = textView2;
    }

    public static ActivitySetSecurityQuestionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
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
    public static ActivitySetSecurityQuestionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetSecurityQuestionsBinding activitySetSecurityQuestionsBinding = (ActivitySetSecurityQuestionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_set_security_questions, viewGroup, z, obj);
        int i4 = component1 + 97;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySetSecurityQuestionsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ActivitySetSecurityQuestionsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivitySetSecurityQuestionsBinding activitySetSecurityQuestionsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activitySetSecurityQuestionsBindingInflate;
    }

    @Deprecated
    public static ActivitySetSecurityQuestionsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 29;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_set_security_questions;
            z = true;
        } else {
            i = R.layout.activity_set_security_questions;
            z = false;
        }
        ActivitySetSecurityQuestionsBinding activitySetSecurityQuestionsBinding = (ActivitySetSecurityQuestionsBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component1 + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySetSecurityQuestionsBinding;
    }

    public static ActivitySetSecurityQuestionsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetSecurityQuestionsBinding activitySetSecurityQuestionsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activitySetSecurityQuestionsBindingBind;
    }

    @Deprecated
    public static ActivitySetSecurityQuestionsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivitySetSecurityQuestionsBinding activitySetSecurityQuestionsBinding = (ActivitySetSecurityQuestionsBinding) bind(obj, view, R.layout.activity_set_security_questions);
        if (i3 != 0) {
            return activitySetSecurityQuestionsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
