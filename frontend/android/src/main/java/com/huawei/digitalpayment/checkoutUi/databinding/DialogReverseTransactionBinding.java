package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkoutUi.R;

public abstract class DialogReverseTransactionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final RoundImageView ivBack;
    public final RoundImageView ivTopBg;
    public final RecyclerView rvCategory;
    public final TextView tvSubTitle;
    public final TextView tvTitle;

    protected DialogReverseTransactionBinding(Object obj, View view, int i, RoundImageView roundImageView, RoundImageView roundImageView2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivBack = roundImageView;
        this.ivTopBg = roundImageView2;
        this.rvCategory = recyclerView;
        this.tvSubTitle = textView;
        this.tvTitle = textView2;
    }

    public static DialogReverseTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DialogReverseTransactionBinding dialogReverseTransactionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return dialogReverseTransactionBindingInflate;
    }

    @Deprecated
    public static DialogReverseTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogReverseTransactionBinding dialogReverseTransactionBinding = (DialogReverseTransactionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_reverse_transaction, viewGroup, z, obj);
        int i4 = ShareDataUIState + 51;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return dialogReverseTransactionBinding;
    }

    public static DialogReverseTransactionBinding inflate(LayoutInflater layoutInflater) {
        DialogReverseTransactionBinding dialogReverseTransactionBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            dialogReverseTransactionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 20 / 0;
        } else {
            dialogReverseTransactionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogReverseTransactionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static DialogReverseTransactionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        DialogReverseTransactionBinding dialogReverseTransactionBinding = (DialogReverseTransactionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_reverse_transaction, null, false, obj);
        int i4 = ShareDataUIState + 123;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return dialogReverseTransactionBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static DialogReverseTransactionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DialogReverseTransactionBinding dialogReverseTransactionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 89;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return dialogReverseTransactionBindingBind;
    }

    @Deprecated
    public static DialogReverseTransactionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        DialogReverseTransactionBinding dialogReverseTransactionBinding = (DialogReverseTransactionBinding) bind(obj, view, R.layout.dialog_reverse_transaction);
        int i3 = ShareDataUIState + 73;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return dialogReverseTransactionBinding;
        }
        throw null;
    }
}
