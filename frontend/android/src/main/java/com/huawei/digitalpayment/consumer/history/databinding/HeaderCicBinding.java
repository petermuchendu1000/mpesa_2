package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class HeaderCicBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    private final ConstraintLayout component2;
    public final ImageView ivIcon;
    public final BaseTextView tvCardNum;
    public final BaseTextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = component1 + 79;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return root;
    }

    private HeaderCicBinding(ConstraintLayout constraintLayout, ImageView imageView, BaseTextView baseTextView, BaseTextView baseTextView2) {
        this.component2 = constraintLayout;
        this.ivIcon = imageView;
        this.tvCardNum = baseTextView;
        this.tvName = baseTextView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static HeaderCicBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        HeaderCicBinding headerCicBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 75;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return headerCicBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
  0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.component3
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.component1 = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.header_cic
            android.view.View r4 = r4.inflate(r1, r5, r2)
            r6 = r6 ^ r2
            if (r6 == r2) goto L38
            goto L22
        L19:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.header_cic
            r2 = 0
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L38
        L22:
            int r6 = com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.component1
            int r6 = r6 + 47
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.component3 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L31
            r5.addView(r4)
            goto L38
        L31:
            r5.addView(r4)
            r3.hashCode()
            throw r3
        L38:
            com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.component3
            int r5 = r5 + 25
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.component1 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L48
            return r4
        L48:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.HeaderCicBinding");
    }

    public static HeaderCicBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.tvCardNum;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i4);
            if (baseTextView != null) {
                i4 = R.id.tvName;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i4);
                if (baseTextView2 != null) {
                    HeaderCicBinding headerCicBinding = new HeaderCicBinding((ConstraintLayout) view, imageView, baseTextView, baseTextView2);
                    int i5 = component1 + 37;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 84 / 0;
                    }
                    return headerCicBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
