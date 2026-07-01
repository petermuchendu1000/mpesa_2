package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.history.R;

public final class PopupFilterListBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public final LinearLayout bottomControl;
    private final ConstraintLayout component1;
    public final Button filterConfirm;
    public final TextView filterLabel;
    public final RecyclerView filterList;
    public final Button filterReset;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = ShareDataUIState + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private PopupFilterListBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, Button button, TextView textView, RecyclerView recyclerView, Button button2) {
        this.component1 = constraintLayout;
        this.bottomControl = linearLayout;
        this.filterConfirm = button;
        this.filterLabel = textView;
        this.filterList = recyclerView;
        this.filterReset = button2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.component1;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return constraintLayout;
    }

    public static PopupFilterListBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        ShareDataUIState = i2 % 128;
        PopupFilterListBinding popupFilterListBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = component2 + 85;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return popupFilterListBindingInflate;
    }

    public static PopupFilterListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.popup_filter_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        PopupFilterListBinding popupFilterListBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return popupFilterListBindingBind;
    }

    public static PopupFilterListBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = R.id.bottom_control;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i3);
        if (linearLayout != null) {
            int i4 = component2 + 121;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            i3 = R.id.filter_confirm;
            Button button = (Button) ViewBindings.findChildViewById(view, i3);
            if (button != null) {
                i3 = R.id.filter_label;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView != null) {
                    i3 = R.id.filter_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i3);
                    if (recyclerView != null) {
                        i3 = R.id.filter_reset;
                        Button button2 = (Button) ViewBindings.findChildViewById(view, i3);
                        if (button2 != null) {
                            PopupFilterListBinding popupFilterListBinding = new PopupFilterListBinding((ConstraintLayout) view, linearLayout, button, textView, recyclerView, button2);
                            int i5 = ShareDataUIState + 7;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            return popupFilterListBinding;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
