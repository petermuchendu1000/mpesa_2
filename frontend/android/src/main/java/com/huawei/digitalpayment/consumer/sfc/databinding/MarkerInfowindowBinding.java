package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

public final class MarkerInfowindowBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final LinearLayout component3;
    public final LinearLayout linearLayout;
    public final TextView markerText;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component2 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private MarkerInfowindowBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView) {
        this.component3 = linearLayout;
        this.linearLayout = linearLayout2;
        this.markerText = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.component3;
        int i5 = i2 + 73;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return linearLayout;
    }

    public static MarkerInfowindowBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        MarkerInfowindowBinding markerInfowindowBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 51;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return markerInfowindowBindingInflate;
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
    public static com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component1
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.marker_infowindow
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.layout.marker_infowindow
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component2
            int r4 = r4 + 83
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component1 = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r5.getResources().getResourceName(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r5 = new com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding(r1, r1, r3);
        r1 = com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component2 + 53;
        com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component1 = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding bind(android.view.View r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component1
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L20
            r1 = r5
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r2 = com.huawei.digitalpayment.consumer.sfc.R.id.markerText
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 67
            int r4 = r4 / 0
            if (r3 == 0) goto L3c
            goto L2d
        L20:
            r1 = r5
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r2 = com.huawei.digitalpayment.consumer.sfc.R.id.markerText
            android.view.View r3 = androidx.viewbinding.ViewBindings.findChildViewById(r5, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L3c
        L2d:
            com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding r5 = new com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding
            r5.<init>(r1, r1, r3)
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component2
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.component1 = r2
            int r1 = r1 % r0
            return r5
        L3c:
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r5 = r5.getResourceName(r2)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.MarkerInfowindowBinding");
    }
}
