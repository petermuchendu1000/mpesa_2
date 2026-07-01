package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class ActivityFavouriteBundlesBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final ComposeView composeView;

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            root = getRoot();
            int i3 = 89 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 3;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return root;
    }

    private ActivityFavouriteBundlesBinding(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.ShareDataUIState = constraintLayout;
        this.composeView = composeView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i4 = i2 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return constraintLayout;
        }
        obj.hashCode();
        throw null;
    }

    public static ActivityFavouriteBundlesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ActivityFavouriteBundlesBinding activityFavouriteBundlesBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 105;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFavouriteBundlesBindingInflate;
        }
        throw null;
    }

    public static ActivityFavouriteBundlesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.activity_favourite_bundles, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = copydefault + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(r4.getResources().getResourceName(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding((androidx.constraintlayout.widget.ConstraintLayout) r4, r2);
        r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.component1 + 55;
        com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.copydefault = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding bind(android.view.View r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.component1
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.composeView
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            androidx.compose.ui.platform.ComposeView r2 = (androidx.compose.ui.platform.ComposeView) r2
            r3 = 93
            int r3 = r3 / 0
            if (r2 == 0) goto L38
            goto L27
        L1d:
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.id.composeView
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r4, r1)
            androidx.compose.ui.platform.ComposeView r2 = (androidx.compose.ui.platform.ComposeView) r2
            if (r2 == 0) goto L38
        L27:
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding r1 = new com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1.<init>(r4, r2)
            int r4 = com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.component1
            int r4 = r4 + 55
            int r2 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.copydefault = r2
            int r4 = r4 % r0
            return r1
        L38:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.sfc.databinding.ActivityFavouriteBundlesBinding");
    }
}
