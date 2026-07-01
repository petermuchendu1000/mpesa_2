package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.push_ui.R;

public abstract class PushItemTransactionMessageFiledBinding extends ViewDataBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    public final TextView tvSymbol;
    public final TextView tvTitle;
    public final TextView tvValue;

    protected PushItemTransactionMessageFiledBinding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.tvSymbol = textView;
        this.tvTitle = textView2;
        this.tvValue = textView3;
    }

    public static PushItemTransactionMessageFiledBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        PushItemTransactionMessageFiledBinding pushItemTransactionMessageFiledBindingInflate;
        int i = 2 % 2;
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            pushItemTransactionMessageFiledBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 92 / 0;
        } else {
            pushItemTransactionMessageFiledBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 17;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return pushItemTransactionMessageFiledBindingInflate;
    }

    @Deprecated
    public static PushItemTransactionMessageFiledBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PushItemTransactionMessageFiledBinding pushItemTransactionMessageFiledBinding = (PushItemTransactionMessageFiledBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.push_item_transaction_message_filed, viewGroup, z, obj);
        int i4 = component3 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return pushItemTransactionMessageFiledBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static PushItemTransactionMessageFiledBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        PushItemTransactionMessageFiledBinding pushItemTransactionMessageFiledBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return pushItemTransactionMessageFiledBindingInflate;
    }

    @Deprecated
    public static PushItemTransactionMessageFiledBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        PushItemTransactionMessageFiledBinding pushItemTransactionMessageFiledBinding = (PushItemTransactionMessageFiledBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.push_item_transaction_message_filed, null, false, obj);
        int i4 = copydefault + 3;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return pushItemTransactionMessageFiledBinding;
        }
        throw null;
    }

    public static PushItemTransactionMessageFiledBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static PushItemTransactionMessageFiledBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        PushItemTransactionMessageFiledBinding pushItemTransactionMessageFiledBinding = (PushItemTransactionMessageFiledBinding) bind(obj, view, R.layout.push_item_transaction_message_filed);
        int i4 = component3 + 121;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return pushItemTransactionMessageFiledBinding;
    }
}
