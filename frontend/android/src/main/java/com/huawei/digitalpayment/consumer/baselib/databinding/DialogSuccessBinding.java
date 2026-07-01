package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class DialogSuccessBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    private final LinearLayout copydefault;
    public final ImageView ivStatus;
    public final LinearLayout llLayout;
    public final TextView tvMessage;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component1 + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private DialogSuccessBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.copydefault = linearLayout;
        this.ivStatus = imageView;
        this.llLayout = linearLayout2;
        this.tvMessage = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.copydefault;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return linearLayout;
    }

    public static DialogSuccessBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        DialogSuccessBinding dialogSuccessBindingInflate = i2 % 2 == 0 ? inflate(layoutInflater, null, true) : inflate(layoutInflater, null, false);
        int i3 = component3 + 123;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return dialogSuccessBindingInflate;
    }

    public static DialogSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_success, viewGroup, false);
        if (z) {
            int i4 = component3 + 69;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 86 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    public static DialogSuccessBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.iv_status;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            i2 = R.id.ll_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
            if (linearLayout != null) {
                int i3 = component3 + 61;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.tv_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    DialogSuccessBinding dialogSuccessBinding = new DialogSuccessBinding((LinearLayout) view, imageView, linearLayout, textView);
                    int i5 = component1 + 35;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return dialogSuccessBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
