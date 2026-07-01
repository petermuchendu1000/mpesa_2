package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class BubbleArrowTopBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final ConstraintLayout component2;
    public final ImageView ivArrow;
    public final RoundTextView tvBubble;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return root;
    }

    private BubbleArrowTopBinding(ConstraintLayout constraintLayout, ImageView imageView, RoundTextView roundTextView) {
        this.component2 = constraintLayout;
        this.ivArrow = imageView;
        this.tvBubble = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public static BubbleArrowTopBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        BubbleArrowTopBinding bubbleArrowTopBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return bubbleArrowTopBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding.copydefault
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.bubble_arrow_top
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.bubble_arrow_top
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding.ShareDataUIState
            int r4 = r4 + 23
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding.copydefault = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L35
            r4 = 71
            int r4 = r4 / r2
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.BubbleArrowTopBinding");
    }

    public static BubbleArrowTopBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = copydefault + 83;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                i4 = R.id.tv_bubble;
                RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i4);
                if (roundTextView != null) {
                    return new BubbleArrowTopBinding((ConstraintLayout) view, imageView, roundTextView);
                }
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
