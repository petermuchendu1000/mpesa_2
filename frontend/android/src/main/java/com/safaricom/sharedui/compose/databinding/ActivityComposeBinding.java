package com.safaricom.sharedui.compose.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.safaricom.sharedui.compose.R;

public final class ActivityComposeBinding implements ViewBinding {
    public final ComposeView composeView;
    private final FrameLayout copydefault;

    private ActivityComposeBinding(FrameLayout frameLayout, ComposeView composeView) {
        this.copydefault = frameLayout;
        this.composeView = composeView;
    }

    @Override
    public FrameLayout getRoot() {
        return this.copydefault;
    }

    public static ActivityComposeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_compose, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityComposeBinding bind(View view) {
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new ActivityComposeBinding((FrameLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
