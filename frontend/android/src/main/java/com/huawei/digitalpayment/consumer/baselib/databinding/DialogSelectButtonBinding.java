package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class DialogSelectButtonBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component2;
    private final RoundConstraintLayout ShareDataUIState;
    public final LoadingButton btnSelect;
    public final ImageView ivClose;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DialogSelectButtonBinding(RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.btnSelect = loadingButton;
        this.ivClose = imageView;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        int i4 = i2 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return roundConstraintLayout;
    }

    public static DialogSelectButtonBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding.component1
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.dialog_select_button
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.dialog_select_button
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding.component1
            int r4 = r4 + 79
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding.component2 = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectButtonBinding");
    }

    public static DialogSelectButtonBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btnSelect;
        LoadingButton loadingButton = (LoadingButton) ViewBindings.findChildViewById(view, i2);
        if (loadingButton != null) {
            int i3 = component1 + 25;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = R.id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView != null) {
                    i2 = R.id.rv_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
                    if (recyclerView != null) {
                        i2 = R.id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            DialogSelectButtonBinding dialogSelectButtonBinding = new DialogSelectButtonBinding((RoundConstraintLayout) view, loadingButton, imageView, recyclerView, textView);
                            int i4 = component1 + 3;
                            component2 = i4 % 128;
                            int i5 = i4 % 2;
                            return dialogSelectButtonBinding;
                        }
                    }
                }
            } else {
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
