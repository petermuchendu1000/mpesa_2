package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.baselib.widget.text.BaseTextView;
import com.huawei.digitalpayment.consumer.history.R;

public final class HeaderBpBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final ConstraintLayout component2;
    public final ImageView ivIcon;
    public final BaseTextView tvName;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout root = getRoot();
        int i4 = copydefault + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private HeaderBpBinding(ConstraintLayout constraintLayout, ImageView imageView, BaseTextView baseTextView) {
        this.component2 = constraintLayout;
        this.ivIcon = imageView;
        this.tvName = baseTextView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout = this.component2;
        int i4 = i2 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    public static HeaderBpBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static HeaderBpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.header_bp, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 27;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        HeaderBpBinding headerBpBindingBind = bind(viewInflate);
        int i3 = ShareDataUIState + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return headerBpBindingBind;
    }

    public static HeaderBpBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i4);
        if (imageView != null) {
            int i5 = copydefault + 55;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.tvName;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i4);
            if (baseTextView != null) {
                return new HeaderBpBinding((ConstraintLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
