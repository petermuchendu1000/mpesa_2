package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.baseui.R;

public final class SfcCommonToastLayoutBinding implements ViewBinding {
    private static int component1 = 1;
    private static int copydefault;
    private final RoundConstraintLayout ShareDataUIState;
    public final ImageView ivEnd;
    public final ImageView ivStart;
    public final TextView tvText;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component1 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SfcCommonToastLayoutBinding(RoundConstraintLayout roundConstraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.ivEnd = imageView;
        this.ivStart = imageView2;
        this.tvText = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        int i5 = i2 + 57;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return roundConstraintLayout;
    }

    public static SfcCommonToastLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SfcCommonToastLayoutBinding sfcCommonToastLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = copydefault + 101;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return sfcCommonToastLayoutBindingInflate;
    }

    public static SfcCommonToastLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.sfc_common_toast_layout, viewGroup, false);
        if (z) {
            int i4 = component1 + 33;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 36 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    public static SfcCommonToastLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.iv_end;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            i4 = R.id.iv_start;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i4);
            if (imageView2 != null) {
                int i5 = copydefault + 3;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    i4 = R.id.tv_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                    if (textView != null) {
                        SfcCommonToastLayoutBinding sfcCommonToastLayoutBinding = new SfcCommonToastLayoutBinding((RoundConstraintLayout) view, imageView, imageView2, textView);
                        int i6 = copydefault + 113;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        return sfcCommonToastLayoutBinding;
                    }
                } else {
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
