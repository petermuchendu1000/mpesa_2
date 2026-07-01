package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class ViewLoadMoreBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final FrameLayout component2;
    public final ImageView ivLoading;
    public final FrameLayout loadMoreLoadCompleteView;
    public final FrameLayout loadMoreLoadEndView;
    public final FrameLayout loadMoreLoadFailView;
    public final LinearLayout loadMoreLoadingView;
    public final TextView tvEndTips;
    public final TextView tvPrompt;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = component3 + 107;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ViewLoadMoreBinding(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.component2 = frameLayout;
        this.ivLoading = imageView;
        this.loadMoreLoadCompleteView = frameLayout2;
        this.loadMoreLoadEndView = frameLayout3;
        this.loadMoreLoadFailView = frameLayout4;
        this.loadMoreLoadingView = linearLayout;
        this.tvEndTips = textView;
        this.tvPrompt = textView2;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        FrameLayout frameLayout = this.component2;
        int i4 = i3 + 67;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return frameLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static ViewLoadMoreBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewLoadMoreBinding viewLoadMoreBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return viewLoadMoreBindingInflate;
    }

    public static ViewLoadMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.view_load_more, viewGroup, false);
        if (z) {
            int i2 = component3 + 91;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = copydefault + 55;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 3;
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[PHI: r2
  0x0070: PHI (r2v10 android.widget.TextView) = (r2v9 android.widget.TextView), (r2v14 android.widget.TextView) binds: [B:18:0x006e, B:15:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding bind(android.view.View r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.iv_loading
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.component3
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.copydefault = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.load_more_load_complete_view
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.load_more_load_end_view
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r7 = r2
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            if (r7 == 0) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.load_more_load_fail_view
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r8 = r2
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.copydefault
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.component3 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.load_more_loading_view
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r9 = r2
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            if (r9 == 0) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.copydefault
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L66
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tv_end_tips
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 72
            int r3 = r3 / 0
            if (r2 == 0) goto L8f
            goto L70
        L66:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tv_end_tips
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L8f
        L70:
            r10 = r2
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.id.tv_prompt
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L8f
            com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding r1 = new com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding
            r4 = r12
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            int r12 = com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.component3
            int r12 = r12 + 89
            int r2 = r12 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.copydefault = r2
            int r12 = r12 % r0
            return r1
        L8f:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.baselib.databinding.ViewLoadMoreBinding");
    }
}
