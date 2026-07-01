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

public abstract class ItemQuickSettingActionCardBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final ConstraintLayout csImgIcon;
    public final ImageView imgIcon;
    public final ImageView ivStatus;
    public final TextView tvTitle;

    protected ItemQuickSettingActionCardBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.csImgIcon = constraintLayout;
        this.imgIcon = imageView;
        this.ivStatus = imageView2;
        this.tvTitle = textView;
    }

    public static ItemQuickSettingActionCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemQuickSettingActionCardBinding itemQuickSettingActionCardBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 113;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return itemQuickSettingActionCardBindingInflate;
    }

    @Deprecated
    public static ItemQuickSettingActionCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickSettingActionCardBinding itemQuickSettingActionCardBinding = (ItemQuickSettingActionCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quick_setting_action_card, viewGroup, z, obj);
        int i4 = component3 + 59;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemQuickSettingActionCardBinding;
        }
        throw null;
    }

    public static ItemQuickSettingActionCardBinding inflate(LayoutInflater layoutInflater) {
        ItemQuickSettingActionCardBinding itemQuickSettingActionCardBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            itemQuickSettingActionCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 87 / 0;
        } else {
            itemQuickSettingActionCardBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component1 + 69;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemQuickSettingActionCardBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemQuickSettingActionCardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickSettingActionCardBinding itemQuickSettingActionCardBinding = (ItemQuickSettingActionCardBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quick_setting_action_card, null, false, obj);
        int i4 = component1 + 3;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return itemQuickSettingActionCardBinding;
    }

    public static ItemQuickSettingActionCardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickSettingActionCardBinding itemQuickSettingActionCardBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickSettingActionCardBindingBind;
    }

    @Deprecated
    public static ItemQuickSettingActionCardBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemQuickSettingActionCardBinding itemQuickSettingActionCardBinding = (ItemQuickSettingActionCardBinding) bind(obj, view, R.layout.item_quick_setting_action_card);
        int i4 = component3 + 121;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemQuickSettingActionCardBinding;
    }
}
