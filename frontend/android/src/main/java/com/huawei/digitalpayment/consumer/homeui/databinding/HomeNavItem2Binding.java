package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class HomeNavItem2Binding implements ViewBinding {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final ConstraintLayout ShareDataUIState;
    public final RoundImageView navIvIcon;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private HomeNavItem2Binding(ConstraintLayout constraintLayout, RoundImageView roundImageView) {
        this.ShareDataUIState = constraintLayout;
        this.navIvIcon = roundImageView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static HomeNavItem2Binding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        HomeNavItem2Binding homeNavItem2BindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return homeNavItem2BindingInflate;
    }

    public static HomeNavItem2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.home_nav_item2, viewGroup, false);
        if (z) {
            int i2 = component3 + 51;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        HomeNavItem2Binding homeNavItem2BindingBind = bind(viewInflate);
        int i3 = component3 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return homeNavItem2BindingBind;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r4.getResources().getResourceName(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.copydefault + 45;
        com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.component3 = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.component3
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_iv_icon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            com.huawei.common.widget.round.RoundImageView r2 = (com.huawei.common.widget.round.RoundImageView) r2
            r3 = 16
            int r3 = r3 / 0
            if (r2 == 0) goto L3c
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_iv_icon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            com.huawei.common.widget.round.RoundImageView r2 = (com.huawei.common.widget.round.RoundImageView) r2
            if (r2 == 0) goto L3c
        L27:
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding r1 = new com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.copydefault
            int r4 = r4 + 45
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.component3 = r2
            int r4 = r4 % r0
            if (r4 != 0) goto L3a
            return r1
        L3a:
            r4 = 0
            throw r4
        L3c:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding.bind(android.view.View):com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItem2Binding");
    }
}
