package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class DialogAddFavoritesBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final CardView cardAbbr;
    public final CommonInputView inputName;
    public final RoundImageView ivBack;
    public final ImageView ivImage;
    public final RoundImageView ivTopBg;
    public final TextView tvAbbr;
    public final TextView tvName;
    public final TextView tvTipsContent;
    public final TextView tvTitle;

    protected DialogAddFavoritesBinding(Object obj, View view, int i, LoadingButton loadingButton, CardView cardView, CommonInputView commonInputView, RoundImageView roundImageView, ImageView imageView, RoundImageView roundImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.cardAbbr = cardView;
        this.inputName = commonInputView;
        this.ivBack = roundImageView;
        this.ivImage = imageView;
        this.ivTopBg = roundImageView2;
        this.tvAbbr = textView;
        this.tvName = textView2;
        this.tvTipsContent = textView3;
        this.tvTitle = textView4;
    }

    public static DialogAddFavoritesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddFavoritesBinding dialogAddFavoritesBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return dialogAddFavoritesBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static DialogAddFavoritesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddFavoritesBinding dialogAddFavoritesBinding = (DialogAddFavoritesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_add_favorites, viewGroup, z, obj);
        int i4 = component1 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return dialogAddFavoritesBinding;
    }

    public static DialogAddFavoritesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        DialogAddFavoritesBinding dialogAddFavoritesBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 71;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return dialogAddFavoritesBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DialogAddFavoritesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddFavoritesBinding dialogAddFavoritesBinding = (DialogAddFavoritesBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_add_favorites, null, false, obj);
        int i4 = component3 + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogAddFavoritesBinding;
    }

    public static DialogAddFavoritesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddFavoritesBinding dialogAddFavoritesBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return dialogAddFavoritesBindingBind;
    }

    @Deprecated
    public static DialogAddFavoritesBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DialogAddFavoritesBinding dialogAddFavoritesBinding = (DialogAddFavoritesBinding) bind(obj, view, R.layout.dialog_add_favorites);
        int i4 = component1 + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return dialogAddFavoritesBinding;
    }
}
