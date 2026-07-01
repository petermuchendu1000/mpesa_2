package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemConfirmDisplayBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final LinearLayout component1;
    public final TextView tvContent;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = ShareDataUIState + 125;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemConfirmDisplayBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.component1 = linearLayout;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = this.component1;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static ItemConfirmDisplayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ItemConfirmDisplayBinding itemConfirmDisplayBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return itemConfirmDisplayBindingInflate;
    }

    public static ItemConfirmDisplayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_confirm_display, viewGroup, false);
        if (z) {
            int i4 = component3 + 47;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 9 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        ItemConfirmDisplayBinding itemConfirmDisplayBindingBind = bind(viewInflate);
        int i6 = ShareDataUIState + 109;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
        return itemConfirmDisplayBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r2
  0x0027: PHI (r2v3 android.widget.TextView) = (r2v2 android.widget.TextView), (r2v6 android.widget.TextView) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.component3
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_content
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 62
            int r3 = r3 / 0
            if (r2 == 0) goto L5a
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_content
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L5a
        L27:
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.component3
            int r1 = r1 + 93
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.ShareDataUIState = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L4d
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_title
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L5a
            com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding r1 = new com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r1.<init>(r4, r2, r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.ShareDataUIState
            int r4 = r4 + 87
            int r2 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.component3 = r2
            int r4 = r4 % r0
            return r1
        L4d:
            int r0 = com.huawei.digitalpayment.checkoutUi.R.id.tv_title
            android.view.View r4 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4 = 0
            r4.hashCode()
            throw r4
        L5a:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.ItemConfirmDisplayBinding");
    }
}
