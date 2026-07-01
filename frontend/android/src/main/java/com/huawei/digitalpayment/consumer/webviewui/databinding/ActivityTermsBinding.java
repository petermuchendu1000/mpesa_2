package com.huawei.digitalpayment.consumer.webviewui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.webviewui.R;

public abstract class ActivityTermsBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final LoadingButton btnUnderstand;
    public final FrameLayout flContainer;
    public final CommonCheckBox ivAgreement;
    public final LinearLayout llAgreement;
    public final TextView tvAgreement;

    protected ActivityTermsBinding(Object obj, View view, int i, LoadingButton loadingButton, FrameLayout frameLayout, CommonCheckBox commonCheckBox, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.btnUnderstand = loadingButton;
        this.flContainer = frameLayout;
        this.ivAgreement = commonCheckBox;
        this.llAgreement = linearLayout;
        this.tvAgreement = textView;
    }

    public static ActivityTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityTermsBinding activityTermsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return activityTermsBindingInflate;
    }

    @Deprecated
    public static ActivityTermsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        ActivityTermsBinding activityTermsBinding;
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityTermsBinding = (ActivityTermsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_terms, viewGroup, z, obj);
            int i3 = 23 / 0;
        } else {
            activityTermsBinding = (ActivityTermsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_terms, viewGroup, z, obj);
        }
        int i4 = copydefault + 29;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return activityTermsBinding;
    }

    public static ActivityTermsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityTermsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityTermsBinding activityTermsBinding = (ActivityTermsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_terms, null, false, obj);
        int i4 = component1 + 93;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityTermsBinding;
    }

    public static ActivityTermsBinding bind(View view) {
        ActivityTermsBinding activityTermsBindingBind;
        int i = 2 % 2;
        int i2 = component1 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityTermsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 99 / 0;
        } else {
            activityTermsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 93;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return activityTermsBindingBind;
    }

    @Deprecated
    public static ActivityTermsBinding bind(View view, Object obj) {
        ActivityTermsBinding activityTermsBinding;
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            activityTermsBinding = (ActivityTermsBinding) bind(obj, view, R.layout.activity_terms);
            int i3 = 39 / 0;
        } else {
            activityTermsBinding = (ActivityTermsBinding) bind(obj, view, R.layout.activity_terms);
        }
        int i4 = copydefault + 9;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return activityTermsBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
