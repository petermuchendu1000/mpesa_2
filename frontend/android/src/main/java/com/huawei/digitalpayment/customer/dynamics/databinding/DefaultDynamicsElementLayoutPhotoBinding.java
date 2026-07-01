package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.customer.dynamics.R;

public abstract class DefaultDynamicsElementLayoutPhotoBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final CommonInputView commonInputView;
    public final RoundImageView imageView;
    public final ImageView ivCamera;
    public final ImageView ivDelete;
    public final TextView tvTitle;

    protected DefaultDynamicsElementLayoutPhotoBinding(Object obj, View view, int i, CommonInputView commonInputView, RoundImageView roundImageView, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.commonInputView = commonInputView;
        this.imageView = roundImageView;
        this.ivCamera = imageView;
        this.ivDelete = imageView2;
        this.tvTitle = textView;
    }

    public static DefaultDynamicsElementLayoutPhotoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutPhotoBinding defaultDynamicsElementLayoutPhotoBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutPhotoBindingInflate;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutPhotoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutPhotoBinding defaultDynamicsElementLayoutPhotoBinding = (DefaultDynamicsElementLayoutPhotoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout_photo, viewGroup, z, obj);
        int i4 = ShareDataUIState + 79;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return defaultDynamicsElementLayoutPhotoBinding;
    }

    public static DefaultDynamicsElementLayoutPhotoBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DefaultDynamicsElementLayoutPhotoBinding defaultDynamicsElementLayoutPhotoBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return defaultDynamicsElementLayoutPhotoBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutPhotoBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutPhotoBinding defaultDynamicsElementLayoutPhotoBinding = (DefaultDynamicsElementLayoutPhotoBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.default_dynamics_element_layout_photo, null, false, obj);
        int i4 = ShareDataUIState + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return defaultDynamicsElementLayoutPhotoBinding;
    }

    public static DefaultDynamicsElementLayoutPhotoBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        DefaultDynamicsElementLayoutPhotoBinding defaultDynamicsElementLayoutPhotoBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 109;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
        }
        return defaultDynamicsElementLayoutPhotoBindingBind;
    }

    @Deprecated
    public static DefaultDynamicsElementLayoutPhotoBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DefaultDynamicsElementLayoutPhotoBinding defaultDynamicsElementLayoutPhotoBinding = (DefaultDynamicsElementLayoutPhotoBinding) bind(obj, view, R.layout.default_dynamics_element_layout_photo);
        int i4 = ShareDataUIState + 19;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultDynamicsElementLayoutPhotoBinding;
        }
        throw null;
    }
}
