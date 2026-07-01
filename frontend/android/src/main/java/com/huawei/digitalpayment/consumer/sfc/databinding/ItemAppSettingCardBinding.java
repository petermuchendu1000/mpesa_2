package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemAppSettingCardBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int copydefault;
    public final ConstraintLayout csImgIcon;
    public final ImageView imgIcon;
    public final TextView tvTitle;

    protected ItemAppSettingCardBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.csImgIcon = constraintLayout;
        this.imgIcon = imageView;
        this.tvTitle = textView;
    }

    public static ItemAppSettingCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemAppSettingCardBinding itemAppSettingCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 53;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return itemAppSettingCardBindingInflate;
    }

    @Deprecated
    public static ItemAppSettingCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemAppSettingCardBinding itemAppSettingCardBinding = (ItemAppSettingCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_app_setting_card, viewGroup, z, obj);
        if (i3 != 0) {
            return itemAppSettingCardBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemAppSettingCardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemAppSettingCardBinding itemAppSettingCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 109;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemAppSettingCardBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemAppSettingCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 57;
        component1 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            i = R.layout.item_app_setting_card;
            z = true;
        } else {
            i = R.layout.item_app_setting_card;
            z = false;
        }
        ItemAppSettingCardBinding itemAppSettingCardBinding = (ItemAppSettingCardBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component1 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return itemAppSettingCardBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ItemAppSettingCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemAppSettingCardBinding itemAppSettingCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 77;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemAppSettingCardBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemAppSettingCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemAppSettingCardBinding itemAppSettingCardBinding = (ItemAppSettingCardBinding) bind(obj, view, R.layout.item_app_setting_card);
        int i4 = copydefault + 81;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemAppSettingCardBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
