package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.history.R;

public abstract class ViewSearchBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final EditText etSearch;

    protected ViewSearchBinding(Object obj, View view, int i, EditText editText) {
        super(obj, view, i);
        this.etSearch = editText;
    }

    public static ViewSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ViewSearchBinding viewSearchBindingInflate;
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            viewSearchBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 4 / 0;
        } else {
            viewSearchBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 65;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return viewSearchBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ViewSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewSearchBinding viewSearchBinding = (ViewSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.view_search, viewGroup, z, obj);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return viewSearchBinding;
    }

    public static ViewSearchBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewSearchBinding viewSearchBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 69;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return viewSearchBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ViewSearchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component2 + 47;
        ShareDataUIState = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            i = R.layout.view_search;
            z = true;
        } else {
            i = R.layout.view_search;
            z = false;
        }
        ViewSearchBinding viewSearchBinding = (ViewSearchBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component2 + 69;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return viewSearchBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static ViewSearchBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ViewSearchBinding viewSearchBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return viewSearchBindingBind;
    }

    @Deprecated
    public static ViewSearchBinding bind(View view, Object obj) {
        ViewSearchBinding viewSearchBinding;
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            viewSearchBinding = (ViewSearchBinding) bind(obj, view, R.layout.view_search);
            int i3 = 45 / 0;
        } else {
            viewSearchBinding = (ViewSearchBinding) bind(obj, view, R.layout.view_search);
        }
        int i4 = ShareDataUIState + 121;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return viewSearchBinding;
    }
}
