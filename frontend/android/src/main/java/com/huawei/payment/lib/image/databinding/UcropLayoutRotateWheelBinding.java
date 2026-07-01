package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.view.widget.HorizontalProgressView;

public final class UcropLayoutRotateWheelBinding implements ViewBinding {
    private final RelativeLayout ShareDataUIState;
    public final HorizontalProgressView rotateScrollWheel;
    public final TextView textViewRotate;
    public final FrameLayout wrapperResetRotate;
    public final FrameLayout wrapperRotateByAngle;

    private UcropLayoutRotateWheelBinding(RelativeLayout relativeLayout, HorizontalProgressView horizontalProgressView, TextView textView, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.ShareDataUIState = relativeLayout;
        this.rotateScrollWheel = horizontalProgressView;
        this.textViewRotate = textView;
        this.wrapperResetRotate = frameLayout;
        this.wrapperRotateByAngle = frameLayout2;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.ShareDataUIState;
    }

    public static UcropLayoutRotateWheelBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UcropLayoutRotateWheelBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_layout_rotate_wheel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UcropLayoutRotateWheelBinding bind(View view) {
        int i = R.id.rotate_scroll_wheel;
        HorizontalProgressView horizontalProgressView = (HorizontalProgressView) ViewBindings.findChildViewById(view, i);
        if (horizontalProgressView != null) {
            i = R.id.text_view_rotate;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.wrapper_reset_rotate;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.wrapper_rotate_by_angle;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        return new UcropLayoutRotateWheelBinding((RelativeLayout) view, horizontalProgressView, textView, frameLayout, frameLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
