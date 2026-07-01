package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class HeaderImtBinding implements ViewBinding {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component3;
    public final ImageView ivIcon;
    public final ConstraintLayout nameLayout;
    public final BaseTextView resultDesc;
    public final BaseTextView tvFullName;
    public final BaseTextView tvNick;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = component2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private HeaderImtBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, BaseTextView baseTextView, BaseTextView baseTextView2, BaseTextView baseTextView3) {
        this.component3 = constraintLayout;
        this.ivIcon = imageView;
        this.nameLayout = constraintLayout2;
        this.resultDesc = baseTextView;
        this.tvFullName = baseTextView2;
        this.tvNick = baseTextView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i2 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static HeaderImtBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HeaderImtBinding headerImtBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 15;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return headerImtBindingInflate;
    }

    public static HeaderImtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.header_imt, viewGroup, false);
        if (!(!z)) {
            viewGroup.addView(viewInflate);
        }
        HeaderImtBinding headerImtBindingBind = bind(viewInflate);
        int i4 = component2 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return headerImtBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[PHI: r2
  0x003d: PHI (r2v5 com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) = 
  (r2v4 com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView)
  (r2v10 com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView)
 binds: [B:12:0x003b, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding bind(android.view.View r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.ivIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L67
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.nameLayout
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L67
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding.component2
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L33
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.resultDesc
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r2 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r2
            r3 = 90
            int r3 = r3 / 0
            if (r2 == 0) goto L67
            goto L3d
        L33:
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.resultDesc
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r2 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r2
            if (r2 == 0) goto L67
        L3d:
            r7 = r2
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tvFullName
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r8 = r2
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r8 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r8
            if (r8 == 0) goto L67
            int r1 = com.huawei.digitalpayment.consumer.history.R.id.tvNick
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r10, r1)
            r9 = r2
            com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView r9 = (com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView) r9
            if (r9 == 0) goto L67
            com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding r1 = new com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding
            r4 = r10
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r10 = com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding.component2
            int r10 = r10 + 73
            int r2 = r10 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding.copydefault = r2
            int r10 = r10 % r0
            return r1
        L67:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.history.databinding.HeaderImtBinding");
    }
}
