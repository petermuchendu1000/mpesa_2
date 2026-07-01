package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ItemMtandaoSpeedtestBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final ConstraintLayout copydefault;
    public final ImageView downloadIcon;
    public final TextView downloadText;
    public final TextView pinglatencyJitterText;
    public final ImageView speedIcon;
    public final TextView timeText;
    public final ImageView uploadIcon;
    public final TextView uploadText;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = component3 + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return root;
    }

    private ItemMtandaoSpeedtestBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3, TextView textView4) {
        this.copydefault = constraintLayout;
        this.downloadIcon = imageView;
        this.downloadText = textView;
        this.pinglatencyJitterText = textView2;
        this.speedIcon = imageView2;
        this.timeText = textView3;
        this.uploadIcon = imageView3;
        this.uploadText = textView4;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i3 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return constraintLayout;
        }
        throw null;
    }

    public static ItemMtandaoSpeedtestBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemMtandaoSpeedtestBinding itemMtandaoSpeedtestBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return itemMtandaoSpeedtestBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemMtandaoSpeedtestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_mtandao_speedtest, viewGroup, false);
        if (z) {
            int i4 = ShareDataUIState + 15;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 28 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[PHI: r0
  0x007b: PHI (r0v5 android.widget.ImageView) = (r0v4 android.widget.ImageView), (r0v9 android.widget.ImageView) binds: [B:20:0x0079, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding bind(android.view.View r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.ShareDataUIState
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.component3 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.downloadIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L9e
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.ShareDataUIState
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L91
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.downloadText
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L9e
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.pinglatencyJitterText
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L9e
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.speedIcon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r8 = r2
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L9e
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.ShareDataUIState
            int r1 = r1 + 11
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.component3 = r2
            int r1 = r1 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.timeText
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L9e
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.component3
            int r1 = r1 + 19
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L71
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.uploadIcon
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2 = 33
            int r2 = r2 / 0
            if (r0 == 0) goto L9e
            goto L7b
        L71:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.uploadIcon
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L9e
        L7b:
            r10 = r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.uploadText
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r1)
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L9e
            com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding r0 = new com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding
            r4 = r12
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L91:
            int r0 = com.huawei.digitalpayment.consumer.sfc.R.id.downloadText
            android.view.View r12 = androidx.viewbinding.ViewBindings.findChildViewById(r12, r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r12 = 0
            r12.hashCode()
            throw r12
        L9e:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ItemMtandaoSpeedtestBinding");
    }
}
