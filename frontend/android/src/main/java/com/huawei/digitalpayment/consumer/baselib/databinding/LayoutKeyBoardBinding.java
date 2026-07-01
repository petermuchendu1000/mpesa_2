package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class LayoutKeyBoardBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3;
    private final LinearLayout component1;
    public final GridView gvKeybord;
    public final TextView tvFinish;
    public final TextView tvSafeInput;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component2 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private LayoutKeyBoardBinding(LinearLayout linearLayout, GridView gridView, TextView textView, TextView textView2) {
        this.component1 = linearLayout;
        this.gvKeybord = gridView;
        this.tvFinish = textView;
        this.tvSafeInput = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.component1;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static LayoutKeyBoardBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        LayoutKeyBoardBinding layoutKeyBoardBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = component2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return layoutKeyBoardBindingInflate;
    }

    public static LayoutKeyBoardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_key_board, viewGroup, false);
        if (!(!z)) {
            viewGroup.addView(viewInflate);
        }
        LayoutKeyBoardBinding layoutKeyBoardBindingBind = bind(viewInflate);
        int i4 = component3 + 11;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutKeyBoardBindingBind;
        }
        throw null;
    }

    public static LayoutKeyBoardBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.id.gv_keybord;
            GridView gridView = (GridView) ViewBindings.findChildViewById(view, i3);
            if (gridView != null) {
                i3 = R.id.tv_finish;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    int i4 = component3 + 91;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        i3 = R.id.tv_safe_input;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView2 != null) {
                            return new LayoutKeyBoardBinding((LinearLayout) view, gridView, textView, textView2);
                        }
                    } else {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
