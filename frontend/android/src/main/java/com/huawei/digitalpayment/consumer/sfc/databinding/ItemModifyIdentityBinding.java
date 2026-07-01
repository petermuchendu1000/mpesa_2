package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemModifyIdentityBinding extends ViewDataBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    public final CommonInputView answer;
    public final ImageView check;
    public final RoundConstraintLayout rlQuestions;
    public final TextView tvName;
    public final TextView tvNumber;

    protected ItemModifyIdentityBinding(Object obj, View view, int i, CommonInputView commonInputView, ImageView imageView, RoundConstraintLayout roundConstraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.answer = commonInputView;
        this.check = imageView;
        this.rlQuestions = roundConstraintLayout;
        this.tvName = textView;
        this.tvNumber = textView2;
    }

    public static ItemModifyIdentityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemModifyIdentityBinding itemModifyIdentityBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 7;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return itemModifyIdentityBindingInflate;
    }

    @Deprecated
    public static ItemModifyIdentityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ItemModifyIdentityBinding itemModifyIdentityBinding = (ItemModifyIdentityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_modify_identity, viewGroup, z, obj);
        int i3 = component2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return itemModifyIdentityBinding;
    }

    public static ItemModifyIdentityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemModifyIdentityBinding itemModifyIdentityBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component2 + 29;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemModifyIdentityBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemModifyIdentityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 109;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.item_modify_identity;
            z = true;
        } else {
            i = R.layout.item_modify_identity;
            z = false;
        }
        ItemModifyIdentityBinding itemModifyIdentityBinding = (ItemModifyIdentityBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component3 + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemModifyIdentityBinding;
    }

    public static ItemModifyIdentityBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ItemModifyIdentityBinding itemModifyIdentityBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 79;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return itemModifyIdentityBindingBind;
    }

    @Deprecated
    public static ItemModifyIdentityBinding bind(View view, Object obj) {
        ItemModifyIdentityBinding itemModifyIdentityBinding;
        int i = 2 % 2;
        int i2 = component3 + 85;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            itemModifyIdentityBinding = (ItemModifyIdentityBinding) bind(obj, view, R.layout.item_modify_identity);
            int i3 = 33 / 0;
        } else {
            itemModifyIdentityBinding = (ItemModifyIdentityBinding) bind(obj, view, R.layout.item_modify_identity);
        }
        int i4 = component2 + 37;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemModifyIdentityBinding;
    }
}
