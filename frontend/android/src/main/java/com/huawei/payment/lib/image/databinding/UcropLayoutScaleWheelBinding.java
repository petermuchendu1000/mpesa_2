package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.view.widget.HorizontalProgressView;

public final class UcropLayoutScaleWheelBinding implements ViewBinding {
    private final RelativeLayout component2;
    public final HorizontalProgressView scaleScrollWheel;
    public final TextView textViewScale;

    private UcropLayoutScaleWheelBinding(RelativeLayout relativeLayout, HorizontalProgressView horizontalProgressView, TextView textView) {
        this.component2 = relativeLayout;
        this.scaleScrollWheel = horizontalProgressView;
        this.textViewScale = textView;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.component2;
    }

    public static UcropLayoutScaleWheelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UcropLayoutScaleWheelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_layout_scale_wheel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UcropLayoutScaleWheelBinding bind(View view) {
        int i = R.id.scale_scroll_wheel;
        HorizontalProgressView horizontalProgressView = (HorizontalProgressView) ViewBindings.findChildViewById(view, i);
        if (horizontalProgressView != null) {
            i = R.id.text_view_scale;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new UcropLayoutScaleWheelBinding((RelativeLayout) view, horizontalProgressView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
