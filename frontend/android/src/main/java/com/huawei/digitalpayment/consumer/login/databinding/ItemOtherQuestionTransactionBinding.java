package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.login.R;

public abstract class ItemOtherQuestionTransactionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final ImageView ivClear;
    public final ImageView ivIcon;
    public final TextView tvAmount;
    public final TextView tvDate;
    public final TextView tvNumber;

    protected ItemOtherQuestionTransactionBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.ivClear = imageView;
        this.ivIcon = imageView2;
        this.tvAmount = textView;
        this.tvDate = textView2;
        this.tvNumber = textView3;
    }

    public static ItemOtherQuestionTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemOtherQuestionTransactionBinding itemOtherQuestionTransactionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return itemOtherQuestionTransactionBindingInflate;
    }

    @Deprecated
    public static ItemOtherQuestionTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingInflateInternal = ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_other_question_transaction, viewGroup, z, obj);
        if (i3 == 0) {
            return (ItemOtherQuestionTransactionBinding) viewDataBindingInflateInternal;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ItemOtherQuestionTransactionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemOtherQuestionTransactionBinding itemOtherQuestionTransactionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemOtherQuestionTransactionBindingInflate;
    }

    @Deprecated
    public static ItemOtherQuestionTransactionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemOtherQuestionTransactionBinding itemOtherQuestionTransactionBinding = (ItemOtherQuestionTransactionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_other_question_transaction, null, false, obj);
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return itemOtherQuestionTransactionBinding;
    }

    public static ItemOtherQuestionTransactionBinding bind(View view) {
        ItemOtherQuestionTransactionBinding itemOtherQuestionTransactionBindingBind;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            itemOtherQuestionTransactionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 17 / 0;
        } else {
            itemOtherQuestionTransactionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = copydefault + 15;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemOtherQuestionTransactionBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ItemOtherQuestionTransactionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemOtherQuestionTransactionBinding itemOtherQuestionTransactionBinding = (ItemOtherQuestionTransactionBinding) bind(obj, view, R.layout.item_other_question_transaction);
        int i4 = copydefault + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return itemOtherQuestionTransactionBinding;
    }
}
