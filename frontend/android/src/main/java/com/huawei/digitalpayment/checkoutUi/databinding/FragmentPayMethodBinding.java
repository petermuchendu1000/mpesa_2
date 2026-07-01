package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.checkoutUi.R;

public final class FragmentPayMethodBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component3;
    private final RelativeLayout ShareDataUIState;
    public final RoundImageView ivBack;
    public final LoadingButton lbNext;
    public final RoundConstraintLayout rlContent;
    public final RecyclerView rvList;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        RelativeLayout root = getRoot();
        int i3 = component3 + 61;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private FragmentPayMethodBinding(RelativeLayout relativeLayout, RoundImageView roundImageView, LoadingButton loadingButton, RoundConstraintLayout roundConstraintLayout, RecyclerView recyclerView, RoundTextView roundTextView) {
        this.ShareDataUIState = relativeLayout;
        this.ivBack = roundImageView;
        this.lbNext = loadingButton;
        this.rlContent = roundConstraintLayout;
        this.rvList = recyclerView;
        this.tvTitle = roundTextView;
    }

    @Override
    public RelativeLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        RelativeLayout relativeLayout = this.ShareDataUIState;
        int i5 = i3 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return relativeLayout;
    }

    public static FragmentPayMethodBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FragmentPayMethodBinding fragmentPayMethodBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentPayMethodBindingInflate;
    }

    public static FragmentPayMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pay_method, viewGroup, false);
        if (!(!z)) {
            int i4 = component3 + 25;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
        }
        FragmentPayMethodBinding fragmentPayMethodBindingBind = bind(viewInflate);
        int i5 = component3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return fragmentPayMethodBindingBind;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[PHI: r3
  0x003e: PHI (r3v4 com.huawei.common.widget.LoadingButton) = (r3v3 com.huawei.common.widget.LoadingButton), (r3v8 com.huawei.common.widget.LoadingButton) binds: [B:12:0x003c, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding bind(android.view.View r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.component3
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L92
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.iv_back
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r6 = r3
            com.huawei.common.widget.round.RoundImageView r6 = (com.huawei.common.widget.round.RoundImageView) r6
            if (r6 == 0) goto L7e
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.component1
            int r1 = r1 + 11
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.component3 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L34
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.lb_next
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            com.huawei.common.widget.LoadingButton r3 = (com.huawei.common.widget.LoadingButton) r3
            r4 = 27
            int r4 = r4 / 0
            if (r3 == 0) goto L7e
            goto L3e
        L34:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.lb_next
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            com.huawei.common.widget.LoadingButton r3 = (com.huawei.common.widget.LoadingButton) r3
            if (r3 == 0) goto L7e
        L3e:
            r7 = r3
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.rl_content
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r8 = r3
            com.huawei.common.widget.round.RoundConstraintLayout r8 = (com.huawei.common.widget.round.RoundConstraintLayout) r8
            if (r8 == 0) goto L7e
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.component1
            int r1 = r1 + 15
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.component3 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L75
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.rv_list
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r9 = r0
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L7e
            int r1 = com.huawei.digitalpayment.checkoutUi.R.id.tv_title
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r1)
            r10 = r0
            com.huawei.common.widget.round.RoundTextView r10 = (com.huawei.common.widget.round.RoundTextView) r10
            if (r10 == 0) goto L7e
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding r0 = new com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding
            r5 = r11
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L75:
            int r0 = com.huawei.digitalpayment.checkoutUi.R.id.rv_list
            android.view.View r11 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r0)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            throw r2
        L7e:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        L92:
            int r0 = com.huawei.digitalpayment.checkoutUi.R.id.iv_back
            android.view.View r11 = androidx.viewbinding.ViewBindings.findChildViewById(r11, r0)
            com.huawei.common.widget.round.RoundImageView r11 = (com.huawei.common.widget.round.RoundImageView) r11
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding.bind(android.view.View):com.huawei.digitalpayment.checkoutUi.databinding.FragmentPayMethodBinding");
    }
}
