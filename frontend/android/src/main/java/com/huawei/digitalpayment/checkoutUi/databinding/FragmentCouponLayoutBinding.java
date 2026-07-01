package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.checkoutUi.R;

public final class FragmentCouponLayoutBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout component3;
    public final RecyclerView rvRecyclerCoupon;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = copydefault + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private FragmentCouponLayoutBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.component3 = constraintLayout;
        this.rvRecyclerCoupon = recyclerView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FragmentCouponLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r4
  0x0023: PHI (r4v5 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding.component1
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_coupon_layout
            android.view.View r4 = r4.inflate(r1, r5, r2)
            r6 = r6 ^ r2
            if (r6 == 0) goto L23
            goto L26
        L19:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_coupon_layout
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == r2) goto L26
        L23:
            r5.addView(r4)
        L26:
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding.component1
            int r5 = r5 + 113
            int r6 = r5 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L36
            return r4
        L36:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.FragmentCouponLayoutBinding");
    }

    public static FragmentCouponLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.rv_recycler_coupon;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i4);
        if (recyclerView != null) {
            FragmentCouponLayoutBinding fragmentCouponLayoutBinding = new FragmentCouponLayoutBinding((ConstraintLayout) view, recyclerView);
            int i5 = component1 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return fragmentCouponLayoutBinding;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
