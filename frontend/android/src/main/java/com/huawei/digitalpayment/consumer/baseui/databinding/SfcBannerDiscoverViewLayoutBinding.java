package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer;

public final class SfcBannerDiscoverViewLayoutBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final ConstraintLayout component2;
    public final LinearLayout cycleIndicator;
    public final ViewPager cycleViewPager;
    public final ViewPagerContainer viewpagerContainer;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SfcBannerDiscoverViewLayoutBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ViewPager viewPager, ViewPagerContainer viewPagerContainer) {
        this.component2 = constraintLayout;
        this.cycleIndicator = linearLayout;
        this.cycleViewPager = viewPager;
        this.viewpagerContainer = viewPagerContainer;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i2 + 65;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static SfcBannerDiscoverViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SfcBannerDiscoverViewLayoutBinding sfcBannerDiscoverViewLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return sfcBannerDiscoverViewLayoutBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r4
  0x0021: PHI (r4v5 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.component3
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.layout.sfc_banner_discover_view_layout
            r3 = 1
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == r3) goto L21
            goto L36
        L19:
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.layout.sfc_banner_discover_view_layout
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L36
        L21:
            int r6 = com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.ShareDataUIState
            int r6 = r6 + 21
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.component3 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L33
            r5.addView(r4)
            r5 = 17
            int r5 = r5 / r2
            goto L36
        L33:
            r5.addView(r4)
        L36:
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.ShareDataUIState
            int r5 = r5 + 57
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.component3 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L46
            return r4
        L46:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding((androidx.constraintlayout.widget.ConstraintLayout) r6, r2, r3, r4);
        r6 = com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.component3 + 59;
        com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.ShareDataUIState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r4 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding bind(android.view.View r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.cycleIndicator
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L4c
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.cycleViewPager
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            androidx.viewpager.widget.ViewPager r3 = (androidx.viewpager.widget.ViewPager) r3
            if (r3 == 0) goto L4c
            int r1 = com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.component3
            int r1 = r1 + 29
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.ShareDataUIState = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L31
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.viewpager_container
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer r4 = (com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer) r4
            r5 = 10
            int r5 = r5 / 0
            if (r4 == 0) goto L4c
            goto L3b
        L31:
            int r1 = com.huawei.digitalpayment.consumer.baseui.R.id.viewpager_container
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r6, r1)
            com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer r4 = (com.huawei.digitalpayment.consumer.base.ui.widget.ViewPagerContainer) r4
            if (r4 == 0) goto L4c
        L3b:
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding r1 = new com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r1.<init>(r6, r2, r3, r4)
            int r6 = com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.component3
            int r6 = r6 + 59
            int r2 = r6 % 128
            com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.ShareDataUIState = r2
            int r6 = r6 % r0
            return r1
        L4c:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baseui.databinding.SfcBannerDiscoverViewLayoutBinding");
    }
}
