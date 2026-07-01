package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.payment.lib.image.R;

public final class UcropAspectRatioBinding implements ViewBinding {
    private final FrameLayout copydefault;

    private UcropAspectRatioBinding(FrameLayout frameLayout) {
        this.copydefault = frameLayout;
    }

    @Override
    public FrameLayout getRoot() {
        return this.copydefault;
    }

    public static UcropAspectRatioBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UcropAspectRatioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_aspect_ratio, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UcropAspectRatioBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new UcropAspectRatioBinding((FrameLayout) view);
    }
}
