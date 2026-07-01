package com.huawei.digitalpayment.consumer.sfc.global.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.sfc.global.R;

public final class ComposeViewLayoutBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final ComposeView component2;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ComposeView root = getRoot();
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return root;
    }

    private ComposeViewLayoutBinding(ComposeView composeView) {
        this.component2 = composeView;
    }

    @Override
    public ComposeView getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ComposeView composeView = this.component2;
        int i4 = i2 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return composeView;
    }

    public static ComposeViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ComposeViewLayoutBinding composeViewLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 59;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return composeViewLayoutBindingInflate;
    }

    public static ComposeViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.compose_view_layout, viewGroup, false);
        Object obj = null;
        if (z) {
            int i4 = ShareDataUIState + 119;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                obj.hashCode();
                throw null;
            }
        }
        ComposeViewLayoutBinding composeViewLayoutBindingBind = bind(viewInflate);
        int i5 = component1 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return composeViewLayoutBindingBind;
        }
        throw null;
    }

    public static ComposeViewLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ComposeViewLayoutBinding composeViewLayoutBinding = new ComposeViewLayoutBinding((ComposeView) view);
        int i3 = ShareDataUIState + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return composeViewLayoutBinding;
    }
}
