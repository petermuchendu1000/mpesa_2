package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.push_ui.R;

public final class ItemSystemMessageBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final RoundConstraintLayout clContent;
    private final LinearLayout component1;
    public final ImageView imgNotify;
    public final BubblesView ivRedDot;
    public final TextView tvContent;
    public final TextView tvTime;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemSystemMessageBinding(LinearLayout linearLayout, RoundConstraintLayout roundConstraintLayout, ImageView imageView, BubblesView bubblesView, TextView textView, TextView textView2, TextView textView3) {
        this.component1 = linearLayout;
        this.clContent = roundConstraintLayout;
        this.imgNotify = imageView;
        this.ivRedDot = bubblesView;
        this.tvContent = textView;
        this.tvTime = textView2;
        this.tvTitle = textView3;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.component1;
        int i5 = i2 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    public static ItemSystemMessageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        ItemSystemMessageBinding itemSystemMessageBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = ShareDataUIState + 35;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return itemSystemMessageBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding.ShareDataUIState
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.push_ui.R.layout.item_system_message
            r2 = 1
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ r2
            if (r5 == 0) goto L22
            goto L2e
        L19:
            int r1 = com.huawei.digitalpayment.consumer.push_ui.R.layout.item_system_message
            r2 = 0
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding.copydefault
            int r4 = r4 + 119
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L2e:
            com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.push_ui.databinding.ItemSystemMessageBinding");
    }

    public static ItemSystemMessageBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = R.id.cl_content;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i3);
        if (roundConstraintLayout != null) {
            int i4 = copydefault + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            i3 = R.id.img_notify;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                int i6 = ShareDataUIState + 109;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                i3 = R.id.iv_red_dot;
                BubblesView bubblesView = (BubblesView) ViewBindings.findChildViewById(view, i3);
                if (bubblesView != null) {
                    int i8 = copydefault + 33;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                    i3 = R.id.tv_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView != null) {
                        i3 = R.id.tv_time;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView2 != null) {
                            i3 = R.id.tv_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i3);
                            if (textView3 != null) {
                                return new ItemSystemMessageBinding((LinearLayout) view, roundConstraintLayout, imageView, bubblesView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
