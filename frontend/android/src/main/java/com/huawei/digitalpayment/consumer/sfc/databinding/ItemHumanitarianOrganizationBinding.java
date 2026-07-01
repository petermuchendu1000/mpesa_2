package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemHumanitarianOrganizationBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final MaterialCardView cvOrganizationLogoContainer;
    public final ImageView ivOrganizationLogo;
    public final ImageView ivSelectedCheck;
    public final ConstraintLayout rootHumanitarianItem;
    public final TextView tvLearnMore;
    public final TextView tvOrganizationName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemHumanitarianOrganizationBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.ShareDataUIState = constraintLayout;
        this.cvOrganizationLogoContainer = materialCardView;
        this.ivOrganizationLogo = imageView;
        this.ivSelectedCheck = imageView2;
        this.rootHumanitarianItem = constraintLayout2;
        this.tvLearnMore = textView;
        this.tvOrganizationName = textView2;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public static ItemHumanitarianOrganizationBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ItemHumanitarianOrganizationBinding itemHumanitarianOrganizationBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return itemHumanitarianOrganizationBindingInflate;
    }

    public static ItemHumanitarianOrganizationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_humanitarian_organization, viewGroup, false);
        if (!(!z)) {
            int i2 = component2 + 9;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ItemHumanitarianOrganizationBinding itemHumanitarianOrganizationBindingBind = bind(viewInflate);
        int i3 = copydefault + 43;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemHumanitarianOrganizationBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[PHI: r3
  0x0049: PHI (r3v5 android.widget.ImageView) = (r3v4 android.widget.ImageView), (r3v9 android.widget.ImageView) binds: [B:14:0x0047, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding bind(android.view.View r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.copydefault
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L96
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.cv_organization_logo_container
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r6 = r3
            com.google.android.material.card.MaterialCardView r6 = (com.google.android.material.card.MaterialCardView) r6
            if (r6 == 0) goto L82
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_organization_logo
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r7 = r3
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L82
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.component2
            int r1 = r1 + 39
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.copydefault = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L3f
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_selected_check
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 88
            int r4 = r4 / 0
            if (r3 == 0) goto L82
            goto L49
        L3f:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.iv_selected_check
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r3 == 0) goto L82
        L49:
            r8 = r3
            r9 = r12
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_learn_more
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L82
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.copydefault
            int r1 = r1 + 67
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.component2 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L76
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_organization_name
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L82
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding r12 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding
            r4 = r12
            r5 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r12
        L76:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.tv_organization_name
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2.hashCode()
            throw r2
        L82:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        L96:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.cv_organization_logo_container
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            com.google.android.material.card.MaterialCardView r12 = (com.google.android.material.card.MaterialCardView) r12
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemHumanitarianOrganizationBinding");
    }
}
