package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActionButtonItemBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final CardView cardIconContainer;
    public final RoundImageView ivFunctionIcon;
    public final TextView tvActionLabel;

    protected ActionButtonItemBinding(Object obj, View view, int i, CardView cardView, RoundImageView roundImageView, TextView textView) {
        super(obj, view, i);
        this.cardIconContainer = cardView;
        this.ivFunctionIcon = roundImageView;
        this.tvActionLabel = textView;
    }

    public static ActionButtonItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ActionButtonItemBinding actionButtonItemBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 87;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return actionButtonItemBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActionButtonItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActionButtonItemBinding actionButtonItemBinding = (ActionButtonItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.action_button_item, viewGroup, z, obj);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return actionButtonItemBinding;
    }

    public static ActionButtonItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActionButtonItemBinding actionButtonItemBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return actionButtonItemBindingInflate;
    }

    @Deprecated
    public static ActionButtonItemBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        ActionButtonItemBinding actionButtonItemBinding = (ActionButtonItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.action_button_item, null, false, obj);
        int i4 = component3 + 89;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return actionButtonItemBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ActionButtonItemBinding bind(View view) {
        ActionButtonItemBinding actionButtonItemBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            actionButtonItemBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 42 / 0;
        } else {
            actionButtonItemBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return actionButtonItemBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActionButtonItemBinding bind(View view, Object obj) {
        ActionButtonItemBinding actionButtonItemBinding;
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            actionButtonItemBinding = (ActionButtonItemBinding) bind(obj, view, R.layout.action_button_item);
            int i3 = 36 / 0;
        } else {
            actionButtonItemBinding = (ActionButtonItemBinding) bind(obj, view, R.layout.action_button_item);
        }
        int i4 = component3 + 35;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return actionButtonItemBinding;
    }
}
