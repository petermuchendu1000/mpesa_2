package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.RotateImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemSendManyResultBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final TextView amount;
    private final LinearLayout component1;
    public final RotateImageView imStatus;
    public final ImageView imStatusStop;
    public final TextView name;
    public final TextView tvId;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return root;
    }

    private ItemSendManyResultBinding(LinearLayout linearLayout, TextView textView, RotateImageView rotateImageView, ImageView imageView, TextView textView2, TextView textView3) {
        this.component1 = linearLayout;
        this.amount = textView;
        this.imStatus = rotateImageView;
        this.imStatusStop = imageView;
        this.name = textView2;
        this.tvId = textView3;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public static ItemSendManyResultBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemSendManyResultBinding itemSendManyResultBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemSendManyResultBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[PHI: r4
  0x0022: PHI (r4v2 android.view.View) = (r4v1 android.view.View), (r4v6 android.view.View) binds: [B:8:0x001f, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.ShareDataUIState
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_send_many_result
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == 0) goto L2e
            goto L22
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_send_many_result
            r3 = 0
            android.view.View r4 = r4.inflate(r1, r5, r3)
            if (r6 == r2) goto L22
            goto L2e
        L22:
            int r6 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.component3
            int r6 = r6 + 29
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.ShareDataUIState = r1
            int r6 = r6 % r0
            r5.addView(r4)
        L2e:
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding r4 = bind(r4)
            int r5 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.ShareDataUIState
            int r5 = r5 + 61
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.component3 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L3e
            return r4
        L3e:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.ItemSendManyResultBinding");
    }

    public static ItemSendManyResultBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.amount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
        if (textView != null) {
            int i3 = ShareDataUIState + 35;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            i2 = R.id.imStatus;
            RotateImageView rotateImageView = (RotateImageView) ViewBindings.findChildViewById(view, i2);
            if (rotateImageView != null) {
                i2 = R.id.imStatusStop;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView != null) {
                    int i4 = component3 + 105;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i2 = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView2 != null) {
                        int i5 = ShareDataUIState + 89;
                        component3 = i5 % 128;
                        if (i5 % 2 == 0) {
                            throw null;
                        }
                        i2 = R.id.tvId;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView3 != null) {
                            ItemSendManyResultBinding itemSendManyResultBinding = new ItemSendManyResultBinding((LinearLayout) view, textView, rotateImageView, imageView, textView2, textView3);
                            int i6 = ShareDataUIState + 15;
                            component3 = i6 % 128;
                            if (i6 % 2 != 0) {
                                return itemSendManyResultBinding;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
