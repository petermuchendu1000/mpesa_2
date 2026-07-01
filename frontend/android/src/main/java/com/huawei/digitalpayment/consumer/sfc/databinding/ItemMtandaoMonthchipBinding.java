package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMtandaoMonthchipBinding implements ViewBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final TextView component3;
    public final TextView monthChip;

    @Override
    public View getRoot() {
        TextView root;
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 54 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component1 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private ItemMtandaoMonthchipBinding(TextView textView, TextView textView2) {
        this.component3 = textView;
        this.monthChip = textView2;
    }

    @Override
    public TextView getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        TextView textView = this.component3;
        int i5 = i2 + 77;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    public static ItemMtandaoMonthchipBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        ItemMtandaoMonthchipBinding itemMtandaoMonthchipBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = copydefault + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return itemMtandaoMonthchipBindingInflate;
    }

    public static ItemMtandaoMonthchipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_mtandao_monthchip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        ItemMtandaoMonthchipBinding itemMtandaoMonthchipBindingBind = bind(viewInflate);
        int i4 = copydefault + 59;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemMtandaoMonthchipBindingBind;
    }

    public static ItemMtandaoMonthchipBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        ItemMtandaoMonthchipBinding itemMtandaoMonthchipBinding = new ItemMtandaoMonthchipBinding(textView, textView);
        int i3 = copydefault + 21;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return itemMtandaoMonthchipBinding;
        }
        obj.hashCode();
        throw null;
    }
}
