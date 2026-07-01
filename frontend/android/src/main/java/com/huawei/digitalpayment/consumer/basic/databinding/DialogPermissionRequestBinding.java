package com.huawei.digitalpayment.consumer.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.basic.R;

public abstract class DialogPermissionRequestBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int component3;
    public final MaterialButton btnNeg;
    public final MaterialButton btnPos;
    public final ImageView ivIcon;
    public final RoundTextView line;
    public final TextView tvDescription;
    public final TextView tvTitle;

    protected DialogPermissionRequestBinding(Object obj, View view, int i, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, RoundTextView roundTextView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.btnNeg = materialButton;
        this.btnPos = materialButton2;
        this.ivIcon = imageView;
        this.line = roundTextView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static DialogPermissionRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogPermissionRequestBinding dialogPermissionRequestBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return dialogPermissionRequestBindingInflate;
    }

    @Deprecated
    public static DialogPermissionRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_permission_request, viewGroup, z, obj);
        if (i3 != 0) {
            return (DialogPermissionRequestBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static DialogPermissionRequestBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DialogPermissionRequestBinding dialogPermissionRequestBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 71;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return dialogPermissionRequestBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogPermissionRequestBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogPermissionRequestBinding dialogPermissionRequestBinding = (DialogPermissionRequestBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_permission_request, null, false, obj);
        int i4 = component3 + 105;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogPermissionRequestBinding;
        }
        throw null;
    }

    public static DialogPermissionRequestBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static DialogPermissionRequestBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogPermissionRequestBinding dialogPermissionRequestBinding = (DialogPermissionRequestBinding) bind(obj, view, R.layout.dialog_permission_request);
        int i4 = component3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return dialogPermissionRequestBinding;
    }
}
