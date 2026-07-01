package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemCheckoutCouponMerchantBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component1;
    public final RoundConstraintLayout clContent;
    private final ConstraintLayout component3;
    public final ImageView dashLine;
    public final ImageView imBottom;
    public final ImageView imLogo;
    public final ImageView imSelect;
    public final ImageView imTop;
    public final RelativeLayout llLeft;
    public final RelativeLayout rlDash;
    public final TextView tvAmount;
    public final TextView tvCouponHint;
    public final TextView tvCouponName;
    public final TextView tvCouponTime;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getRoot();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = ShareDataUIState + 93;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemCheckoutCouponMerchantBinding(ConstraintLayout constraintLayout, RoundConstraintLayout roundConstraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.component3 = constraintLayout;
        this.clContent = roundConstraintLayout;
        this.dashLine = imageView;
        this.imBottom = imageView2;
        this.imLogo = imageView3;
        this.imSelect = imageView4;
        this.imTop = imageView5;
        this.llLeft = relativeLayout;
        this.rlDash = relativeLayout2;
        this.tvAmount = textView;
        this.tvCouponHint = textView2;
        this.tvCouponName = textView3;
        this.tvCouponTime = textView4;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.component3;
        int i5 = i3 + 11;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return constraintLayout;
    }

    public static ItemCheckoutCouponMerchantBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    public static ItemCheckoutCouponMerchantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_checkout_coupon_merchant, viewGroup, false);
        if (z) {
            int i4 = component1 + 41;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemCheckoutCouponMerchantBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.cl_content;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
        if (roundConstraintLayout != null) {
            i2 = R.id.dash_line;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                i2 = R.id.im_bottom;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView2 != null) {
                    i2 = R.id.im_logo;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i2);
                    if (imageView3 != null) {
                        i2 = R.id.im_select;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i2);
                        if (imageView4 != null) {
                            int i3 = ShareDataUIState + 93;
                            component1 = i3 % 128;
                            Object obj = null;
                            if (i3 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            i2 = R.id.im_top;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i2);
                            if (imageView5 != null) {
                                i2 = R.id.ll_left;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                                if (relativeLayout != null) {
                                    int i4 = component1 + 81;
                                    ShareDataUIState = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i2 = R.id.rl_dash;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                                    if (relativeLayout2 != null) {
                                        int i5 = component1 + 23;
                                        ShareDataUIState = i5 % 128;
                                        if (i5 % 2 == 0) {
                                            throw null;
                                        }
                                        i2 = R.id.tv_amount;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                                        if (textView != null) {
                                            i2 = R.id.tv_coupon_hint;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                                            if (textView2 != null) {
                                                int i6 = ShareDataUIState + 101;
                                                component1 = i6 % 128;
                                                int i7 = i6 % 2;
                                                i2 = R.id.tv_coupon_name;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                if (textView3 != null) {
                                                    i2 = R.id.tv_coupon_time;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                    if (textView4 != null) {
                                                        return new ItemCheckoutCouponMerchantBinding((ConstraintLayout) view, roundConstraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
