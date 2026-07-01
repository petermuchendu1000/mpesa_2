package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class LayoutSusbcriptionBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;

    @Bindable
    protected Drawable mIcon;

    @Bindable
    protected String mTitle;
    public final ImageView tvBuy;
    public final TextView tvTitle;

    public abstract void setIcon(Drawable drawable);

    public abstract void setTitle(String str);

    protected LayoutSusbcriptionBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView) {
        super(obj, view, i);
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvBuy = imageView2;
        this.tvTitle = textView;
    }

    public Drawable getIcon() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawable = this.mIcon;
        int i5 = i2 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mTitle;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    public static LayoutSusbcriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LayoutSusbcriptionBinding layoutSusbcriptionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 117;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return layoutSusbcriptionBindingInflate;
    }

    @Deprecated
    public static LayoutSusbcriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSusbcriptionBinding layoutSusbcriptionBinding = (LayoutSusbcriptionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_susbcription, viewGroup, z, obj);
        int i4 = component2 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return layoutSusbcriptionBinding;
    }

    public static LayoutSusbcriptionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        LayoutSusbcriptionBinding layoutSusbcriptionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return layoutSusbcriptionBindingInflate;
    }

    @Deprecated
    public static LayoutSusbcriptionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        LayoutSusbcriptionBinding layoutSusbcriptionBinding = (LayoutSusbcriptionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_susbcription, null, false, obj);
        int i4 = component1 + 33;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutSusbcriptionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static LayoutSusbcriptionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSusbcriptionBinding layoutSusbcriptionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return layoutSusbcriptionBindingBind;
    }

    @Deprecated
    public static LayoutSusbcriptionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LayoutSusbcriptionBinding layoutSusbcriptionBinding = (LayoutSusbcriptionBinding) bind(obj, view, R.layout.layout_susbcription);
        if (i3 != 0) {
            return layoutSusbcriptionBinding;
        }
        throw null;
    }
}
