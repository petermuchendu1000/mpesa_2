package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class FragmentSfcMyFinancesBinding implements ViewBinding {
    private static int component3 = 1;
    private static int copydefault;
    private final ComposeView component2;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        ComposeView root = getRoot();
        int i3 = component3 + 33;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        obj.hashCode();
        throw null;
    }

    private FragmentSfcMyFinancesBinding(ComposeView composeView) {
        this.component2 = composeView;
    }

    @Override
    public ComposeView getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ComposeView composeView = this.component2;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return composeView;
    }

    public static FragmentSfcMyFinancesBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FragmentSfcMyFinancesBinding fragmentSfcMyFinancesBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentSfcMyFinancesBindingInflate;
    }

    public static FragmentSfcMyFinancesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sfc_my_finances, viewGroup, false);
        if (z) {
            int i2 = component3 + 37;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
                throw null;
            }
            viewGroup.addView(viewInflate);
            int i3 = copydefault + 113;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        return bind(viewInflate);
    }

    public static FragmentSfcMyFinancesBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentSfcMyFinancesBinding fragmentSfcMyFinancesBinding = new FragmentSfcMyFinancesBinding((ComposeView) view);
        int i3 = component3 + 21;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return fragmentSfcMyFinancesBinding;
    }
}
