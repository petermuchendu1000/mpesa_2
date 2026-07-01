package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;

public final class LifeSearchBinding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final RoundConstraintLayout ShareDataUIState;
    public final RoundConstraintLayout clSearch;
    public final FixEditText etSearch;
    public final ImageView ivStartSearch;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = copydefault + 99;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return root;
    }

    private LifeSearchBinding(RoundConstraintLayout roundConstraintLayout, RoundConstraintLayout roundConstraintLayout2, FixEditText fixEditText, ImageView imageView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.clSearch = roundConstraintLayout2;
        this.etSearch = fixEditText;
        this.ivStartSearch = imageView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return roundConstraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LifeSearchBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LifeSearchBinding lifeSearchBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return lifeSearchBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.copydefault
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.life_search
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.life_search
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.component3
            int r4 = r4 + 55
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.copydefault = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r4 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r6 = new com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding(r1, r1, r3, r4);
        r1 = com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.component3 + 59;
        com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding bind(android.view.View r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = r6
            com.huawei.common.widget.round.RoundConstraintLayout r1 = (com.huawei.common.widget.round.RoundConstraintLayout) r1
            int r2 = com.huawei.digitalpayment.consumer.homeui.R.id.etSearch
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r2)
            com.huawei.common.widget.text.FixEditText r3 = (com.huawei.common.widget.text.FixEditText) r3
            if (r3 == 0) goto L47
            int r2 = com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.copydefault
            int r2 = r2 + 31
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.component3 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L2a
            int r2 = com.huawei.digitalpayment.consumer.homeui.R.id.iv_start_search
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 49
            int r5 = r5 / 0
            if (r4 == 0) goto L47
            goto L34
        L2a:
            int r2 = com.huawei.digitalpayment.consumer.homeui.R.id.iv_start_search
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L47
        L34:
            com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding r6 = new com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding
            r6.<init>(r1, r1, r3, r4)
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.component3
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L45
            return r6
        L45:
            r6 = 0
            throw r6
        L47:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r2)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.homeui.databinding.LifeSearchBinding");
    }
}
