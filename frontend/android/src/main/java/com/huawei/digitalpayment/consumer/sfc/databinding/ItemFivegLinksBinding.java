package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ItemFivegLinksBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final CardView cardRoot;
    public final ImageView imgLink;
    public final TextView tvSubTitle;
    public final TextView tvTitle;

    protected ItemFivegLinksBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.cardRoot = cardView;
        this.imgLink = imageView;
        this.tvSubTitle = textView;
        this.tvTitle = textView2;
    }

    public static ItemFivegLinksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFivegLinksBinding itemFivegLinksBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemFivegLinksBindingInflate;
    }

    @Deprecated
    public static ItemFivegLinksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFivegLinksBinding itemFivegLinksBinding = (ItemFivegLinksBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_fiveg_links, viewGroup, z, obj);
        int i4 = ShareDataUIState + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemFivegLinksBinding;
    }

    public static ItemFivegLinksBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFivegLinksBinding itemFivegLinksBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return itemFivegLinksBindingInflate;
    }

    @Deprecated
    public static ItemFivegLinksBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFivegLinksBinding itemFivegLinksBinding = (ItemFivegLinksBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_fiveg_links, null, false, obj);
        int i4 = component3 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return itemFivegLinksBinding;
        }
        throw null;
    }

    public static ItemFivegLinksBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static ItemFivegLinksBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemFivegLinksBinding itemFivegLinksBinding = (ItemFivegLinksBinding) bind(obj, view, R.layout.item_fiveg_links);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return itemFivegLinksBinding;
    }
}
