package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public abstract class LifeMenuViewBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final Guideline guideline;
    public final View guideline2;
    public final ImageView ivFunctionIcon;
    public final RoundImageView ivMarker;
    public final TextView tvFunctionName;
    public final BubblesView tvRedDot;

    protected LifeMenuViewBinding(Object obj, View view, int i, Guideline guideline, View view2, ImageView imageView, RoundImageView roundImageView, TextView textView, BubblesView bubblesView) {
        super(obj, view, i);
        this.guideline = guideline;
        this.guideline2 = view2;
        this.ivFunctionIcon = imageView;
        this.ivMarker = roundImageView;
        this.tvFunctionName = textView;
        this.tvRedDot = bubblesView;
    }

    public static LifeMenuViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        LifeMenuViewBinding lifeMenuViewBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        return lifeMenuViewBindingInflate;
    }

    @Deprecated
    public static LifeMenuViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LifeMenuViewBinding lifeMenuViewBinding = (LifeMenuViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.life_menu_view, viewGroup, z, obj);
        int i4 = ShareDataUIState + 49;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return lifeMenuViewBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static LifeMenuViewBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        throw null;
    }

    @Deprecated
    public static LifeMenuViewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LifeMenuViewBinding lifeMenuViewBinding = (LifeMenuViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.life_menu_view, null, false, obj);
        int i4 = component1 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return lifeMenuViewBinding;
    }

    public static LifeMenuViewBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LifeMenuViewBinding lifeMenuViewBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
        return lifeMenuViewBindingBind;
    }

    @Deprecated
    public static LifeMenuViewBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        LifeMenuViewBinding lifeMenuViewBinding = (LifeMenuViewBinding) bind(obj, view, R.layout.life_menu_view);
        int i3 = ShareDataUIState + 77;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return lifeMenuViewBinding;
        }
        obj2.hashCode();
        throw null;
    }
}
