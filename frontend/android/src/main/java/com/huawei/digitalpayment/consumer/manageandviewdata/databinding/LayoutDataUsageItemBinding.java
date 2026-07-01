package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public abstract class LayoutDataUsageItemBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final LinearLayout llEndContent;

    @Bindable
    protected String mDescription;

    @Bindable
    protected Boolean mHasSwitch;

    @Bindable
    protected Drawable mIcon;

    @Bindable
    protected String mTitle;
    public final SwitchCompat swToggle;
    public final ImageView tvBuy;
    public final TextView tvDescription;
    public final TextView tvTitle;

    public abstract void setDescription(String str);

    public abstract void setHasSwitch(Boolean bool);

    public abstract void setIcon(Drawable drawable);

    public abstract void setTitle(String str);

    protected LayoutDataUsageItemBinding(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, SwitchCompat switchCompat, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.llEndContent = linearLayout2;
        this.swToggle = switchCompat;
        this.tvBuy = imageView2;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public Drawable getIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Drawable drawable = this.mIcon;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return drawable;
    }

    public String getTitle() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mTitle;
        int i5 = i2 + 77;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getDescription() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mDescription;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Boolean getHasSwitch() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.mHasSwitch;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public static LayoutDataUsageItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        LayoutDataUsageItemBinding layoutDataUsageItemBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 71;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return layoutDataUsageItemBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static LayoutDataUsageItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutDataUsageItemBinding layoutDataUsageItemBinding = (LayoutDataUsageItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_data_usage_item, viewGroup, z, obj);
        int i4 = copydefault + 7;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return layoutDataUsageItemBinding;
    }

    public static LayoutDataUsageItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static LayoutDataUsageItemBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutDataUsageItemBinding layoutDataUsageItemBinding = (LayoutDataUsageItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_data_usage_item, null, false, obj);
        int i4 = ShareDataUIState + 27;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return layoutDataUsageItemBinding;
    }

    public static LayoutDataUsageItemBinding bind(View view) {
        LayoutDataUsageItemBinding layoutDataUsageItemBindingBind;
        int i = 2 % 2;
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            layoutDataUsageItemBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 11 / 0;
        } else {
            layoutDataUsageItemBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutDataUsageItemBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static LayoutDataUsageItemBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        LayoutDataUsageItemBinding layoutDataUsageItemBinding = (LayoutDataUsageItemBinding) bind(obj, view, R.layout.layout_data_usage_item);
        int i3 = copydefault + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return layoutDataUsageItemBinding;
    }
}
