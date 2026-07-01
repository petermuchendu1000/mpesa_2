package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class DialogSelectBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    public final LoadingButton btnSelect;
    private final RoundConstraintLayout component3;
    public final ImageView ivClose;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DialogSelectBinding(RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.component3 = roundConstraintLayout;
        this.btnSelect = loadingButton;
        this.ivClose = imageView;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        RoundConstraintLayout roundConstraintLayout = this.component3;
        int i4 = i2 + 11;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return roundConstraintLayout;
        }
        throw null;
    }

    public static DialogSelectBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogSelectBinding dialogSelectBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSelectBindingInflate;
    }

    public static DialogSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i2 = component1 + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }
        DialogSelectBinding dialogSelectBindingBind = bind(viewInflate);
        int i4 = component2 + 57;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return dialogSelectBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r2
  0x0032: PHI (r2v4 android.widget.ImageView) = (r2v3 android.widget.ImageView), (r2v8 android.widget.ImageView) binds: [B:10:0x0030, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding bind(android.view.View r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.btnSelect
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            r5 = r2
            com.huawei.common.widget.LoadingButton r5 = (com.huawei.common.widget.LoadingButton) r5
            if (r5 == 0) goto L6b
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding.component1
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L28
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.ivClose
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r3 = 19
            int r3 = r3 / 0
            if (r2 == 0) goto L6b
            goto L32
        L28:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.ivClose
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L6b
        L32:
            r6 = r2
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.rv_list
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            r7 = r2
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L6b
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding.component2
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding.component1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5e
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tv_title
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L6b
            com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding r0 = new com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding
            r4 = r9
            com.huawei.common.widget.round.RoundConstraintLayout r4 = (com.huawei.common.widget.round.RoundConstraintLayout) r4
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L5e:
            int r0 = com.huawei.digitalpayment.consumer.baselib.R.id.tv_title
            android.view.View r9 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9 = 0
            r9.hashCode()
            throw r9
        L6b:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baselib.databinding.DialogSelectBinding");
    }
}
