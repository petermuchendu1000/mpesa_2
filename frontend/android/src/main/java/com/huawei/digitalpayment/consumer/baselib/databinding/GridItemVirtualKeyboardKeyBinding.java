package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.R;

public final class GridItemVirtualKeyboardKeyBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final FrameLayout component1;
    public final RelativeLayout rlDelete;
    public final TextView tvBlank;
    public final TextView tvKey;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FrameLayout root = getRoot();
        int i4 = ShareDataUIState + 19;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private GridItemVirtualKeyboardKeyBinding(FrameLayout frameLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        this.component1 = frameLayout;
        this.rlDelete = relativeLayout;
        this.tvBlank = textView;
        this.tvKey = textView2;
    }

    @Override
    public FrameLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = this.component1;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return frameLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GridItemVirtualKeyboardKeyBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding.component3
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.grid_item_virtual_keyboard_key
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.consumer.baselib.R.layout.grid_item_virtual_keyboard_key
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding.component3
            int r4 = r4 + 63
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding.ShareDataUIState = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.baselib.databinding.GridItemVirtualKeyboardKeyBinding");
    }

    public static GridItemVirtualKeyboardKeyBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = R.id.rl_delete;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i3);
        if (relativeLayout != null) {
            i3 = R.id.tv_blank;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
            if (textView != null) {
                int i4 = component3 + 3;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                i3 = R.id.tv_key;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                if (textView2 != null) {
                    GridItemVirtualKeyboardKeyBinding gridItemVirtualKeyboardKeyBinding = new GridItemVirtualKeyboardKeyBinding((FrameLayout) view, relativeLayout, textView, textView2);
                    int i6 = ShareDataUIState + 63;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    return gridItemVirtualKeyboardKeyBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
