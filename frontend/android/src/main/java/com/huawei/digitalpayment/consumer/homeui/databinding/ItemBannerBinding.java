package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class ItemBannerBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final RelativeLayout component2;
    public final LinearLayout cycleIndicator;
    public final TextView cycleTitle;
    public final ViewPager cycleViewPager;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RelativeLayout root = getRoot();
        int i3 = ShareDataUIState + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private ItemBannerBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, ViewPager viewPager) {
        this.component2 = relativeLayout;
        this.cycleIndicator = linearLayout;
        this.cycleTitle = textView;
        this.cycleViewPager = viewPager;
    }

    @Override
    public RelativeLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public static ItemBannerBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemBannerBinding itemBannerBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemBannerBindingInflate;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r4
  0x0022: PHI (r4v4 android.view.View) = (r4v1 android.view.View), (r4v5 android.view.View) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding inflate(android.view.LayoutInflater r4, android.view.ViewGroup r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding.component3
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_banner
            android.view.View r4 = r4.inflate(r1, r5, r2)
            if (r6 == r3) goto L22
            goto L2e
        L19:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.item_banner
            android.view.View r4 = r4.inflate(r1, r5, r2)
            r6 = r6 ^ r3
            if (r6 == r3) goto L2e
        L22:
            int r6 = com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding.component3
            int r6 = r6 + 101
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding.ShareDataUIState = r1
            int r6 = r6 % r0
            r5.addView(r4)
        L2e:
            com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding r4 = bind(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.ItemBannerBinding");
    }

    public static ItemBannerBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.cycle_indicator;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i4);
        if (linearLayout != null) {
            i4 = R.id.cycle_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView != null) {
                int i5 = ShareDataUIState + 119;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                i4 = R.id.cycle_view_pager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i4);
                if (viewPager != null) {
                    ItemBannerBinding itemBannerBinding = new ItemBannerBinding((RelativeLayout) view, linearLayout, textView, viewPager);
                    int i7 = ShareDataUIState + 51;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    return itemBannerBinding;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
