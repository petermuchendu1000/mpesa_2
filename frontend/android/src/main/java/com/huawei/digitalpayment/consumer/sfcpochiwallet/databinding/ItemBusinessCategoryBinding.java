package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public final class ItemBusinessCategoryBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final RoundConstraintLayout component3;
    public final ImageView ivImage;
    public final ImageView ivTurnRight;
    public final LinearLayout llContainer;
    public final TextView tvContent;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component1 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return root;
    }

    private ItemBusinessCategoryBinding(RoundConstraintLayout roundConstraintLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.component3 = roundConstraintLayout;
        this.ivImage = imageView;
        this.ivTurnRight = imageView2;
        this.llContainer = linearLayout;
        this.tvContent = textView;
        this.tvTitle = textView2;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        RoundConstraintLayout roundConstraintLayout = this.component3;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return roundConstraintLayout;
    }

    public static ItemBusinessCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        ItemBusinessCategoryBinding itemBusinessCategoryBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = component1 + 17;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return itemBusinessCategoryBindingInflate;
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
    public static com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding.ShareDataUIState
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_business_category
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfcpochiwallet.R.layout.item_business_category
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L23
        L20:
            r4.addView(r3)
        L23:
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding r3 = bind(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding.ShareDataUIState
            int r4 = r4 + 121
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding.component1 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L35
            r4 = 73
            int r4 = r4 / r2
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding.ItemBusinessCategoryBinding");
    }

    public static ItemBusinessCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.id.iv_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
            if (imageView != null) {
                i3 = R.id.iv_turn_right;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i3);
                if (imageView2 != null) {
                    i3 = R.id.ll_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i3);
                    if (linearLayout != null) {
                        i3 = R.id.tv_content;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView != null) {
                            i3 = R.id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                            if (textView2 != null) {
                                ItemBusinessCategoryBinding itemBusinessCategoryBinding = new ItemBusinessCategoryBinding((RoundConstraintLayout) view, imageView, imageView2, linearLayout, textView, textView2);
                                int i4 = component1 + 77;
                                ShareDataUIState = i4 % 128;
                                int i5 = i4 % 2;
                                return itemBusinessCategoryBinding;
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
