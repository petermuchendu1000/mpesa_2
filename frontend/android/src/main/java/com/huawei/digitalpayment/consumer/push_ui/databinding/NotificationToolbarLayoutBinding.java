package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.push_ui.R;

public final class NotificationToolbarLayoutBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final LinearLayout component2;
    public final ImageView ivBack;
    public final ImageView ivDeleteButton;
    public final ImageView ivReadButton;
    public final ConstraintLayout toolbarRoot;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private NotificationToolbarLayoutBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, TextView textView) {
        this.component2 = linearLayout;
        this.ivBack = imageView;
        this.ivDeleteButton = imageView2;
        this.ivReadButton = imageView3;
        this.toolbarRoot = constraintLayout;
        this.tvTitle = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = this.component2;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return linearLayout;
    }

    public static NotificationToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        copydefault = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 != 0);
    }

    public static NotificationToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.notification_toolbar_layout, viewGroup, false);
        if (z) {
            int i4 = ShareDataUIState + 67;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 19 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        return bind(viewInflate);
    }

    public static NotificationToolbarLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = copydefault + 113;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.ivDeleteButton;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView2 != null) {
                i2 = R.id.ivReadButton;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView3 != null) {
                    int i5 = ShareDataUIState + 125;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    i2 = R.id.toolbarRoot;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
                    if (constraintLayout != null) {
                        int i6 = ShareDataUIState + 121;
                        copydefault = i6 % 128;
                        if (i6 % 2 != 0) {
                            throw null;
                        }
                        i2 = R.id.tvTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            NotificationToolbarLayoutBinding notificationToolbarLayoutBinding = new NotificationToolbarLayoutBinding((LinearLayout) view, imageView, imageView2, imageView3, constraintLayout, textView);
                            int i7 = copydefault + 119;
                            ShareDataUIState = i7 % 128;
                            int i8 = i7 % 2;
                            return notificationToolbarLayoutBinding;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
