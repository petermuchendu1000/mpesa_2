package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class HeaderP2pBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final ConstraintLayout component2;
    public final ImageView ivIcon;
    public final ConstraintLayout nameLayout;
    public final BaseTextView resultDesc;
    public final BaseTextView tvFullName;
    public final BaseTextView tvNick;
    public final BaseTextView tvPhoneNum;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 6 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HeaderP2pBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, BaseTextView baseTextView, BaseTextView baseTextView2, BaseTextView baseTextView3, BaseTextView baseTextView4) {
        this.component2 = constraintLayout;
        this.ivIcon = imageView;
        this.nameLayout = constraintLayout2;
        this.resultDesc = baseTextView;
        this.tvFullName = baseTextView2;
        this.tvNick = baseTextView3;
        this.tvPhoneNum = baseTextView4;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component2;
        int i5 = i3 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return constraintLayout;
    }

    public static HeaderP2pBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v6 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding.copydefault
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.header_p2p
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.header_p2p
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding.component3
            int r4 = r4 + 33
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding.copydefault = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L33
            return r3
        L33:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.HeaderP2pBinding");
    }

    public static HeaderP2pBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = copydefault + 115;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.nameLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
            if (constraintLayout != null) {
                int i5 = copydefault + 75;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                i2 = R.id.resultDesc;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i2);
                if (baseTextView != null) {
                    i2 = R.id.tvFullName;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i2);
                    if (baseTextView2 != null) {
                        i2 = R.id.tvNick;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i2);
                        if (baseTextView3 != null) {
                            int i7 = copydefault + 85;
                            component3 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = R.id.tvPhoneNum;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i2);
                            if (baseTextView4 != null) {
                                HeaderP2pBinding headerP2pBinding = new HeaderP2pBinding((ConstraintLayout) view, imageView, constraintLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                                int i9 = copydefault + 59;
                                component3 = i9 % 128;
                                int i10 = i9 % 2;
                                return headerP2pBinding;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
