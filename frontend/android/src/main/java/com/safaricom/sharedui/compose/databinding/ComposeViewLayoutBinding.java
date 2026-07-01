package com.safaricom.sharedui.compose.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.safaricom.sharedui.compose.R;

public final class ComposeViewLayoutBinding implements ViewBinding {
    private final ComposeView ShareDataUIState;

    private ComposeViewLayoutBinding(ComposeView composeView) {
        this.ShareDataUIState = composeView;
    }

    @Override
    public ComposeView getRoot() {
        return this.ShareDataUIState;
    }

    public static ComposeViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ComposeViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.compose_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ComposeViewLayoutBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ComposeViewLayoutBinding((ComposeView) view);
    }
}
