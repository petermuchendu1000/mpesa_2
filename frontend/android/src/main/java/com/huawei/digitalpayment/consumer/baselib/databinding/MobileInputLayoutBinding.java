package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.R;

public abstract class MobileInputLayoutBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final EditText etInputMobile;
    public final ImageView ivIcon;
    public final TextView tvAreaCode;

    protected MobileInputLayoutBinding(Object obj, View view, int i, EditText editText, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.etInputMobile = editText;
        this.ivIcon = imageView;
        this.tvAreaCode = textView;
    }

    public static MobileInputLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MobileInputLayoutBinding mobileInputLayoutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 109;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return mobileInputLayoutBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static MobileInputLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MobileInputLayoutBinding mobileInputLayoutBinding = (MobileInputLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mobile_input_layout, viewGroup, z, obj);
        int i4 = component2 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return mobileInputLayoutBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static MobileInputLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MobileInputLayoutBinding mobileInputLayoutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return mobileInputLayoutBindingInflate;
    }

    @Deprecated
    public static MobileInputLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 37;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.mobile_input_layout;
            z = true;
        } else {
            i = R.layout.mobile_input_layout;
            z = false;
        }
        return (MobileInputLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static MobileInputLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MobileInputLayoutBinding mobileInputLayoutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return mobileInputLayoutBindingBind;
    }

    @Deprecated
    public static MobileInputLayoutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MobileInputLayoutBinding mobileInputLayoutBinding = (MobileInputLayoutBinding) bind(obj, view, R.layout.mobile_input_layout);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return mobileInputLayoutBinding;
    }
}
