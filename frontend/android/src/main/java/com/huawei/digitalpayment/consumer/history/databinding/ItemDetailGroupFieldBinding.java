package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemDetailGroupFieldBinding implements ViewBinding {
    private static int component2 = 0;
    private static int component3 = 1;
    private final LinearLayout copydefault;
    public final ImageView ivDown;
    public final LinearLayout llGroupInfo;
    public final LinearLayout llGroupTitle;
    public final TextView tvGroupName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component3 + 35;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ItemDetailGroupFieldBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView) {
        this.copydefault = linearLayout;
        this.ivDown = imageView;
        this.llGroupInfo = linearLayout2;
        this.llGroupTitle = linearLayout3;
        this.tvGroupName = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        LinearLayout linearLayout = this.copydefault;
        int i4 = i2 + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    public static ItemDetailGroupFieldBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component3 = i2 % 128;
        ItemDetailGroupFieldBinding itemDetailGroupFieldBindingInflate = i2 % 2 == 0 ? inflate(layoutInflater, null, true) : inflate(layoutInflater, null, false);
        int i3 = component3 + 51;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return itemDetailGroupFieldBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
  0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding.component3
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_detail_group_field
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L32
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.history.R.layout.item_detail_group_field
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            r6 = r6 ^ r2
            if (r6 == r2) goto L32
        L22:
            r5.addView(r4)
            int r5 = com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding.component2
            int r5 = r5 + 69
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding.component3 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L32
            int r0 = r0 / 3
        L32:
            com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding r4 = bind(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.history.databinding.ItemDetailGroupFieldBinding");
    }

    public static ItemDetailGroupFieldBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.iv_down;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = component2 + 83;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.ll_group_info;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
            if (linearLayout != null) {
                i2 = R.id.ll_group_title;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                if (linearLayout2 != null) {
                    i2 = R.id.tv_group_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView != null) {
                        ItemDetailGroupFieldBinding itemDetailGroupFieldBinding = new ItemDetailGroupFieldBinding((LinearLayout) view, imageView, linearLayout, linearLayout2, textView);
                        int i5 = component3 + 71;
                        component2 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 52 / 0;
                        }
                        return itemDetailGroupFieldBinding;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
