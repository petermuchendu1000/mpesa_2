package com.huawei.payment.lib.image.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.payment.lib.image.R;

public final class UcropControlsBinding implements ViewBinding {
    private final RelativeLayout component3;
    public final ImageView controlsShadow;
    public final ImageView imageViewStateAspectRatio;
    public final ImageView imageViewStateRotate;
    public final ImageView imageViewStateScale;
    public final LinearLayout layoutAspectRatio;
    public final UcropLayoutRotateWheelBinding layoutRotateWheel;
    public final UcropLayoutScaleWheelBinding layoutScaleWheel;
    public final LinearLayout stateAspectRatio;
    public final LinearLayout stateRotate;
    public final LinearLayout stateScale;
    public final TextView textViewCrop;
    public final TextView textViewRotate;
    public final TextView textViewScale;
    public final FrameLayout wrapperControls;
    public final LinearLayout wrapperStates;

    private UcropControlsBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, UcropLayoutRotateWheelBinding ucropLayoutRotateWheelBinding, UcropLayoutScaleWheelBinding ucropLayoutScaleWheelBinding, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, LinearLayout linearLayout5) {
        this.component3 = relativeLayout;
        this.controlsShadow = imageView;
        this.imageViewStateAspectRatio = imageView2;
        this.imageViewStateRotate = imageView3;
        this.imageViewStateScale = imageView4;
        this.layoutAspectRatio = linearLayout;
        this.layoutRotateWheel = ucropLayoutRotateWheelBinding;
        this.layoutScaleWheel = ucropLayoutScaleWheelBinding;
        this.stateAspectRatio = linearLayout2;
        this.stateRotate = linearLayout3;
        this.stateScale = linearLayout4;
        this.textViewCrop = textView;
        this.textViewRotate = textView2;
        this.textViewScale = textView3;
        this.wrapperControls = frameLayout;
        this.wrapperStates = linearLayout5;
    }

    @Override
    public RelativeLayout getRoot() {
        return this.component3;
    }

    public static UcropControlsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UcropControlsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_controls, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UcropControlsBinding bind(View view) {
        View viewFindChildViewById;
        int i = R.id.controls_shadow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.image_view_state_aspect_ratio;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.image_view_state_rotate;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.image_view_state_scale;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView4 != null) {
                        i = R.id.layout_aspect_ratio;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layout_rotate_wheel))) != null) {
                            UcropLayoutRotateWheelBinding ucropLayoutRotateWheelBindingBind = UcropLayoutRotateWheelBinding.bind(viewFindChildViewById);
                            i = R.id.layout_scale_wheel;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
                            if (viewFindChildViewById2 != null) {
                                UcropLayoutScaleWheelBinding ucropLayoutScaleWheelBindingBind = UcropLayoutScaleWheelBinding.bind(viewFindChildViewById2);
                                i = R.id.state_aspect_ratio;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.state_rotate;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = R.id.state_scale;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout4 != null) {
                                            i = R.id.text_view_crop;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.text_view_rotate;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.text_view_scale;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = R.id.wrapper_controls;
                                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout != null) {
                                                            i = R.id.wrapper_states;
                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout5 != null) {
                                                                return new UcropControlsBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, linearLayout, ucropLayoutRotateWheelBindingBind, ucropLayoutScaleWheelBindingBind, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, frameLayout, linearLayout5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
