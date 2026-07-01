package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.qrcode.R;

public final class BaseDialogCommonTipsBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final ConstraintLayout ShareDataUIState;
    public final AppCompatTextView tvLeftButton;
    public final AppCompatTextView tvRightButton;
    public final AppCompatTextView tvTipsContent;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private BaseDialogCommonTipsBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.ShareDataUIState = constraintLayout;
        this.tvLeftButton = appCompatTextView;
        this.tvRightButton = appCompatTextView2;
        this.tvTipsContent = appCompatTextView3;
    }

    @Override
    public ConstraintLayout getRoot() {
        ConstraintLayout constraintLayout;
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            constraintLayout = this.ShareDataUIState;
            int i4 = 55 / 0;
        } else {
            constraintLayout = this.ShareDataUIState;
        }
        int i5 = i3 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static BaseDialogCommonTipsBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BaseDialogCommonTipsBinding baseDialogCommonTipsBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 105;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return baseDialogCommonTipsBindingInflate;
        }
        throw null;
    }

    public static BaseDialogCommonTipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.base_dialog_common_tips, viewGroup, false);
        if (z) {
            int i4 = component2 + 69;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 8 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    public static BaseDialogCommonTipsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.id.tv_left_button;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i3);
            if (appCompatTextView != null) {
                i3 = R.id.tv_right_button;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i3);
                if (appCompatTextView2 != null) {
                    i3 = R.id.tv_tips_content;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i3);
                    if (appCompatTextView3 != null) {
                        BaseDialogCommonTipsBinding baseDialogCommonTipsBinding = new BaseDialogCommonTipsBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3);
                        int i4 = copydefault + 33;
                        component2 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return baseDialogCommonTipsBinding;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        obj.hashCode();
        throw null;
    }
}
