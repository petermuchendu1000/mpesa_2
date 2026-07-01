package com.safaricom.sharedui.compose.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.safaricom.sharedui.compose.R;

public final class BottomSheetComposeViewBinding implements ViewBinding {
    private final FrameLayout component2;
    public final ComposeView composeView;

    private BottomSheetComposeViewBinding(FrameLayout frameLayout, ComposeView composeView) {
        this.component2 = frameLayout;
        this.composeView = composeView;
    }

    @Override
    public FrameLayout getRoot() {
        return this.component2;
    }

    public static BottomSheetComposeViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetComposeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_compose_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static BottomSheetComposeViewBinding bind(View view) {
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new BottomSheetComposeViewBinding((FrameLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
