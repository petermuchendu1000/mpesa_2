package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.checkoutUi.R;

public final class FragmentCheckOutConfirmBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final RoundConstraintLayout ShareDataUIState;
    public final AmountDisplayView amountDisplayView;
    public final ConstraintLayout clContentDiscount;
    public final ConstraintLayout clContentMerchant;
    public final RoundConstraintLayout clDiscountMerchant;
    public final RoundConstraintLayout clDiscountType;
    public final RoundConstraintLayout clPaymentMethod;
    public final RoundConstraintLayout clPaymentNote;
    public final RoundConstraintLayout clPaymentTopDiscount;
    public final RoundConstraintLayout clPaymentTopOriginal;
    public final LoadingButton confirm;
    public final ImageView imArrMerchant;
    public final ImageView ivBalanceIcon;
    public final RoundImageView ivClose;
    public final LinearLayout llBnpl;
    public final LinearLayout llCouponDiscount;
    public final LinearLayout llCouponMerchant;
    public final LinearLayout llDiscount;
    public final LinearLayout llNote;
    public final LinearLayout llOd;
    public final LinearLayout llOriginall;
    public final LinearLayout llPaymethod;
    public final RoundLinearLayout llTopDiscount;
    public final RecyclerView rvBnpl;
    public final RoundRecyclerView rvDisplayItems;
    public final RoundTextView tvDiscountKey;
    public final RoundTextView tvDiscountMerchant;
    public final RoundTextView tvDiscountMerchantValue;
    public final RoundTextView tvDiscountTag;
    public final RoundTextView tvDiscountType;
    public final RoundTextView tvDiscountTypeValue;
    public final RoundTextView tvDiscountValue;
    public final RoundTextView tvDisplaycontent;
    public final RoundTextView tvMerchantTag;
    public final RoundTextView tvOdFee;
    public final RoundTextView tvOdLimit;
    public final RoundTextView tvOdUsage;
    public final RoundTextView tvOriginallKey;
    public final RoundTextView tvOriginallValue;
    public final RoundTextView tvPaymentMethod;
    public final RoundTextView tvPaymentMethodValue;
    public final RoundTextView tvPaymentNoteKey;
    public final RoundTextView tvPaymentNoteValue;
    public final RoundTextView tvTitle;
    public final RoundTextView viewDivider;
    public final RoundTextView viewDividerMerchant;
    public final RoundTextView viewDividerSecond;
    public final RoundTextView viewDividerThird;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component2 + 35;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private FragmentCheckOutConfirmBinding(RoundConstraintLayout roundConstraintLayout, AmountDisplayView amountDisplayView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RoundConstraintLayout roundConstraintLayout2, RoundConstraintLayout roundConstraintLayout3, RoundConstraintLayout roundConstraintLayout4, RoundConstraintLayout roundConstraintLayout5, RoundConstraintLayout roundConstraintLayout6, RoundConstraintLayout roundConstraintLayout7, LoadingButton loadingButton, ImageView imageView, ImageView imageView2, RoundImageView roundImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, RoundLinearLayout roundLinearLayout, RecyclerView recyclerView, RoundRecyclerView roundRecyclerView, RoundTextView roundTextView, RoundTextView roundTextView2, RoundTextView roundTextView3, RoundTextView roundTextView4, RoundTextView roundTextView5, RoundTextView roundTextView6, RoundTextView roundTextView7, RoundTextView roundTextView8, RoundTextView roundTextView9, RoundTextView roundTextView10, RoundTextView roundTextView11, RoundTextView roundTextView12, RoundTextView roundTextView13, RoundTextView roundTextView14, RoundTextView roundTextView15, RoundTextView roundTextView16, RoundTextView roundTextView17, RoundTextView roundTextView18, RoundTextView roundTextView19, RoundTextView roundTextView20, RoundTextView roundTextView21, RoundTextView roundTextView22, RoundTextView roundTextView23) {
        this.ShareDataUIState = roundConstraintLayout;
        this.amountDisplayView = amountDisplayView;
        this.clContentDiscount = constraintLayout;
        this.clContentMerchant = constraintLayout2;
        this.clDiscountMerchant = roundConstraintLayout2;
        this.clDiscountType = roundConstraintLayout3;
        this.clPaymentMethod = roundConstraintLayout4;
        this.clPaymentNote = roundConstraintLayout5;
        this.clPaymentTopDiscount = roundConstraintLayout6;
        this.clPaymentTopOriginal = roundConstraintLayout7;
        this.confirm = loadingButton;
        this.imArrMerchant = imageView;
        this.ivBalanceIcon = imageView2;
        this.ivClose = roundImageView;
        this.llBnpl = linearLayout;
        this.llCouponDiscount = linearLayout2;
        this.llCouponMerchant = linearLayout3;
        this.llDiscount = linearLayout4;
        this.llNote = linearLayout5;
        this.llOd = linearLayout6;
        this.llOriginall = linearLayout7;
        this.llPaymethod = linearLayout8;
        this.llTopDiscount = roundLinearLayout;
        this.rvBnpl = recyclerView;
        this.rvDisplayItems = roundRecyclerView;
        this.tvDiscountKey = roundTextView;
        this.tvDiscountMerchant = roundTextView2;
        this.tvDiscountMerchantValue = roundTextView3;
        this.tvDiscountTag = roundTextView4;
        this.tvDiscountType = roundTextView5;
        this.tvDiscountTypeValue = roundTextView6;
        this.tvDiscountValue = roundTextView7;
        this.tvDisplaycontent = roundTextView8;
        this.tvMerchantTag = roundTextView9;
        this.tvOdFee = roundTextView10;
        this.tvOdLimit = roundTextView11;
        this.tvOdUsage = roundTextView12;
        this.tvOriginallKey = roundTextView13;
        this.tvOriginallValue = roundTextView14;
        this.tvPaymentMethod = roundTextView15;
        this.tvPaymentMethodValue = roundTextView16;
        this.tvPaymentNoteKey = roundTextView17;
        this.tvPaymentNoteValue = roundTextView18;
        this.tvTitle = roundTextView19;
        this.viewDivider = roundTextView20;
        this.viewDividerMerchant = roundTextView21;
        this.viewDividerSecond = roundTextView22;
        this.viewDividerThird = roundTextView23;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return roundConstraintLayout;
    }

    public static FragmentCheckOutConfirmBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FragmentCheckOutConfirmBinding fragmentCheckOutConfirmBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fragmentCheckOutConfirmBindingInflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r3
  0x0020: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x001e, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding.component1
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_check_out_confirm
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
            goto L20
        L18:
            int r1 = com.huawei.digitalpayment.checkoutUi.R.layout.fragment_check_out_confirm
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2c
        L20:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding.component2
            int r4 = r4 + 17
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding.component1 = r5
            int r4 = r4 % r0
        L2c:
            com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.checkoutUi.databinding.FragmentCheckOutConfirmBinding");
    }

    public static FragmentCheckOutConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.amountDisplayView;
        AmountDisplayView amountDisplayView = (AmountDisplayView) ViewBindings.findChildViewById(view, i2);
        if (amountDisplayView != null) {
            i2 = R.id.cl_content_discount;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
            if (constraintLayout != null) {
                int i3 = component2 + 15;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                i2 = R.id.cl_content_merchant;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
                if (constraintLayout2 != null) {
                    i2 = R.id.cl_discount_merchant;
                    RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                    if (roundConstraintLayout != null) {
                        i2 = R.id.cl_discount_type;
                        RoundConstraintLayout roundConstraintLayout2 = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                        if (roundConstraintLayout2 != null) {
                            i2 = R.id.cl_payment_method;
                            RoundConstraintLayout roundConstraintLayout3 = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                            if (roundConstraintLayout3 != null) {
                                i2 = R.id.cl_payment_note;
                                RoundConstraintLayout roundConstraintLayout4 = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                                if (roundConstraintLayout4 != null) {
                                    i2 = R.id.cl_payment_top_discount;
                                    RoundConstraintLayout roundConstraintLayout5 = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                                    if (roundConstraintLayout5 != null) {
                                        i2 = R.id.cl_payment_top_original;
                                        RoundConstraintLayout roundConstraintLayout6 = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i2);
                                        if (roundConstraintLayout6 != null) {
                                            i2 = R.id.confirm;
                                            LoadingButton loadingButton = (LoadingButton) ViewBindings.findChildViewById(view, i2);
                                            if (loadingButton != null) {
                                                i2 = R.id.im_arr_merchant;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
                                                if (imageView != null) {
                                                    i2 = R.id.iv_balance_icon;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
                                                    if (imageView2 != null) {
                                                        i2 = R.id.iv_close;
                                                        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
                                                        if (roundImageView != null) {
                                                            i2 = R.id.ll_bnpl;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                            if (linearLayout != null) {
                                                                i2 = R.id.ll_coupon_discount;
                                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                if (linearLayout2 != null) {
                                                                    i2 = R.id.ll_coupon_merchant;
                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                    if (linearLayout3 != null) {
                                                                        i2 = R.id.ll_discount;
                                                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                        if (linearLayout4 != null) {
                                                                            i2 = R.id.ll_note;
                                                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                            if (linearLayout5 != null) {
                                                                                int i5 = component1 + 57;
                                                                                component2 = i5 % 128;
                                                                                int i6 = i5 % 2;
                                                                                i2 = R.id.ll_od;
                                                                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                                if (linearLayout6 != null) {
                                                                                    i2 = R.id.ll_originall;
                                                                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                                    if (linearLayout7 != null) {
                                                                                        i2 = R.id.ll_paymethod;
                                                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                                        if (linearLayout8 != null) {
                                                                                            i2 = R.id.ll_top_discount;
                                                                                            RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i2);
                                                                                            if (roundLinearLayout != null) {
                                                                                                i2 = R.id.rv_bnpl;
                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
                                                                                                if (recyclerView != null) {
                                                                                                    i2 = R.id.rv_display_items;
                                                                                                    RoundRecyclerView roundRecyclerView = (RoundRecyclerView) ViewBindings.findChildViewById(view, i2);
                                                                                                    if (roundRecyclerView != null) {
                                                                                                        int i7 = component2 + 55;
                                                                                                        component1 = i7 % 128;
                                                                                                        int i8 = i7 % 2;
                                                                                                        i2 = R.id.tv_discount_key;
                                                                                                        RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                        if (roundTextView != null) {
                                                                                                            i2 = R.id.tv_discount_merchant;
                                                                                                            RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                            if (roundTextView2 != null) {
                                                                                                                int i9 = component1 + 25;
                                                                                                                component2 = i9 % 128;
                                                                                                                int i10 = i9 % 2;
                                                                                                                i2 = R.id.tv_discount_merchant_value;
                                                                                                                RoundTextView roundTextView3 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                if (roundTextView3 != null) {
                                                                                                                    i2 = R.id.tv_discount_tag;
                                                                                                                    RoundTextView roundTextView4 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                    if (roundTextView4 != null) {
                                                                                                                        i2 = R.id.tv_discount_type;
                                                                                                                        RoundTextView roundTextView5 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                        if (roundTextView5 != null) {
                                                                                                                            int i11 = component2 + 71;
                                                                                                                            component1 = i11 % 128;
                                                                                                                            int i12 = i11 % 2;
                                                                                                                            i2 = R.id.tv_discount_type_value;
                                                                                                                            RoundTextView roundTextView6 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                            if (roundTextView6 != null) {
                                                                                                                                i2 = R.id.tv_discount_value;
                                                                                                                                RoundTextView roundTextView7 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                if (roundTextView7 != null) {
                                                                                                                                    i2 = R.id.tv_displaycontent;
                                                                                                                                    RoundTextView roundTextView8 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                    if (roundTextView8 != null) {
                                                                                                                                        i2 = R.id.tv_merchant_tag;
                                                                                                                                        RoundTextView roundTextView9 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                        if (roundTextView9 != null) {
                                                                                                                                            i2 = R.id.tv_od_fee;
                                                                                                                                            RoundTextView roundTextView10 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                            if (roundTextView10 != null) {
                                                                                                                                                int i13 = component2 + 7;
                                                                                                                                                component1 = i13 % 128;
                                                                                                                                                int i14 = i13 % 2;
                                                                                                                                                i2 = R.id.tv_od_limit;
                                                                                                                                                RoundTextView roundTextView11 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                if (roundTextView11 != null) {
                                                                                                                                                    i2 = R.id.tv_od_usage;
                                                                                                                                                    RoundTextView roundTextView12 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                    if (roundTextView12 != null) {
                                                                                                                                                        i2 = R.id.tv_originall_key;
                                                                                                                                                        RoundTextView roundTextView13 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                        if (roundTextView13 != null) {
                                                                                                                                                            i2 = R.id.tv_originall_value;
                                                                                                                                                            RoundTextView roundTextView14 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                            if (roundTextView14 != null) {
                                                                                                                                                                int i15 = component2 + 45;
                                                                                                                                                                component1 = i15 % 128;
                                                                                                                                                                int i16 = i15 % 2;
                                                                                                                                                                i2 = R.id.tv_payment_method;
                                                                                                                                                                RoundTextView roundTextView15 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                if (roundTextView15 != null) {
                                                                                                                                                                    i2 = R.id.tv_payment_method_value;
                                                                                                                                                                    RoundTextView roundTextView16 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                    if (roundTextView16 != null) {
                                                                                                                                                                        int i17 = component2 + 101;
                                                                                                                                                                        component1 = i17 % 128;
                                                                                                                                                                        Object obj = null;
                                                                                                                                                                        if (i17 % 2 != 0) {
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        i2 = R.id.tv_payment_note_key;
                                                                                                                                                                        RoundTextView roundTextView17 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                        if (roundTextView17 != null) {
                                                                                                                                                                            i2 = R.id.tv_payment_note_value;
                                                                                                                                                                            RoundTextView roundTextView18 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                            if (roundTextView18 != null) {
                                                                                                                                                                                i2 = R.id.tv_title;
                                                                                                                                                                                RoundTextView roundTextView19 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                                if (roundTextView19 != null) {
                                                                                                                                                                                    int i18 = component2 + 27;
                                                                                                                                                                                    component1 = i18 % 128;
                                                                                                                                                                                    if (i18 % 2 != 0) {
                                                                                                                                                                                        obj.hashCode();
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    i2 = R.id.view_divider;
                                                                                                                                                                                    RoundTextView roundTextView20 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                                    if (roundTextView20 != null) {
                                                                                                                                                                                        i2 = R.id.view_divider_merchant;
                                                                                                                                                                                        RoundTextView roundTextView21 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                                        if (roundTextView21 != null) {
                                                                                                                                                                                            int i19 = component2 + 47;
                                                                                                                                                                                            component1 = i19 % 128;
                                                                                                                                                                                            int i20 = i19 % 2;
                                                                                                                                                                                            i2 = R.id.view_divider_second;
                                                                                                                                                                                            RoundTextView roundTextView22 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                                            if (roundTextView22 != null) {
                                                                                                                                                                                                i2 = R.id.view_divider_third;
                                                                                                                                                                                                RoundTextView roundTextView23 = (RoundTextView) ViewBindings.findChildViewById(view, i2);
                                                                                                                                                                                                if (roundTextView23 != null) {
                                                                                                                                                                                                    return new FragmentCheckOutConfirmBinding((RoundConstraintLayout) view, amountDisplayView, constraintLayout, constraintLayout2, roundConstraintLayout, roundConstraintLayout2, roundConstraintLayout3, roundConstraintLayout4, roundConstraintLayout5, roundConstraintLayout6, loadingButton, imageView, imageView2, roundImageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, roundLinearLayout, recyclerView, roundRecyclerView, roundTextView, roundTextView2, roundTextView3, roundTextView4, roundTextView5, roundTextView6, roundTextView7, roundTextView8, roundTextView9, roundTextView10, roundTextView11, roundTextView12, roundTextView13, roundTextView14, roundTextView15, roundTextView16, roundTextView17, roundTextView18, roundTextView19, roundTextView20, roundTextView21, roundTextView22, roundTextView23);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
