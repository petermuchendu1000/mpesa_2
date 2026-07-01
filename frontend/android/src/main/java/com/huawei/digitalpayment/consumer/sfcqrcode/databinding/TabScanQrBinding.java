package com.huawei.digitalpayment.consumer.sfcqrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfcqrcode.R;

public final class TabScanQrBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final ConstraintLayout copydefault;
    public final RoundTextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private TabScanQrBinding(ConstraintLayout constraintLayout, RoundTextView roundTextView) {
        this.copydefault = constraintLayout;
        this.tvTitle = roundTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ConstraintLayout constraintLayout = this.copydefault;
        int i4 = i2 + 93;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return constraintLayout;
    }

    public static TabScanQrBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TabScanQrBinding tabScanQrBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return tabScanQrBindingInflate;
    }

    public static TabScanQrBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.tab_scan_qr, viewGroup, false);
        if (!(!z)) {
            int i4 = component1 + 53;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static TabScanQrBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.id.tv_title;
            RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i3);
            if (roundTextView != null) {
                TabScanQrBinding tabScanQrBinding = new TabScanQrBinding((ConstraintLayout) view, roundTextView);
                int i4 = component1 + 103;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return tabScanQrBinding;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        throw null;
    }
}
