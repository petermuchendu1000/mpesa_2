package com.huawei.digitalpayment.pwaui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.pwaui.R;

public abstract class LayoutTransparentBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final FrameLayout transparentContent;

    protected LayoutTransparentBinding(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.transparentContent = frameLayout;
    }

    public static LayoutTransparentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutTransparentBinding layoutTransparentBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutTransparentBindingInflate;
    }

    @Deprecated
    public static LayoutTransparentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutTransparentBinding layoutTransparentBinding = (LayoutTransparentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.layout_transparent, viewGroup, z, obj);
        int i4 = ShareDataUIState + 79;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutTransparentBinding;
    }

    public static LayoutTransparentBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        LayoutTransparentBinding layoutTransparentBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 17;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return layoutTransparentBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static LayoutTransparentBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 75;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.layout_transparent;
            z = true;
        } else {
            i = R.layout.layout_transparent;
            z = false;
        }
        return (LayoutTransparentBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static LayoutTransparentBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LayoutTransparentBinding layoutTransparentBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return layoutTransparentBindingBind;
    }

    @Deprecated
    public static LayoutTransparentBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LayoutTransparentBinding layoutTransparentBinding = (LayoutTransparentBinding) bind(obj, view, R.layout.layout_transparent);
        int i4 = ShareDataUIState + 83;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return layoutTransparentBinding;
    }
}
