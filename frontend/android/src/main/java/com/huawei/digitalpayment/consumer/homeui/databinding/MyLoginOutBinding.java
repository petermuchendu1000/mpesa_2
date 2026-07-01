package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class MyLoginOutBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final RoundImageView imageBg;
    public final RoundTextView loginOut;
    public final RoundConstraintLayout rlRoot;

    protected MyLoginOutBinding(Object obj, View view, int i, RoundImageView roundImageView, RoundTextView roundTextView, RoundConstraintLayout roundConstraintLayout) {
        super(obj, view, i);
        this.imageBg = roundImageView;
        this.loginOut = roundTextView;
        this.rlRoot = roundConstraintLayout;
    }

    public static MyLoginOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        MyLoginOutBinding myLoginOutBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            myLoginOutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 27 / 0;
        } else {
            myLoginOutBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 59;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return myLoginOutBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static MyLoginOutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.my_login_out, viewGroup, z, obj);
        if (i3 != 0) {
            return (MyLoginOutBinding) viewDataBindingInflateInternal;
        }
        throw null;
    }

    public static MyLoginOutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyLoginOutBinding myLoginOutBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 87;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return myLoginOutBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static MyLoginOutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        MyLoginOutBinding myLoginOutBinding = (MyLoginOutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.my_login_out, null, false, obj);
        int i4 = component3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return myLoginOutBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static MyLoginOutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MyLoginOutBinding myLoginOutBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return myLoginOutBindingBind;
    }

    @Deprecated
    public static MyLoginOutBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MyLoginOutBinding myLoginOutBinding = (MyLoginOutBinding) bind(obj, view, R.layout.my_login_out);
        if (i3 == 0) {
            return myLoginOutBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
