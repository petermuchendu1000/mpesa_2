package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemReverseCategoryBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    public final LoadingButton btnConfirm;
    public final ConstraintLayout clReasonContainer;
    private final CardView component1;
    public final CommonInputView inputReason;
    public final ImageView ivStatus;
    public final TextView tvCategory;
    public final TextView tvTips;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemReverseCategoryBinding(CardView cardView, LoadingButton loadingButton, ConstraintLayout constraintLayout, CommonInputView commonInputView, ImageView imageView, TextView textView, TextView textView2) {
        this.component1 = cardView;
        this.btnConfirm = loadingButton;
        this.clReasonContainer = constraintLayout;
        this.inputReason = commonInputView;
        this.ivStatus = imageView;
        this.tvCategory = textView;
        this.tvTips = textView2;
    }

    @Override
    public CardView getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemReverseCategoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        ShareDataUIState = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    public static ItemReverseCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_reverse_category, viewGroup, false);
        if (!(!z)) {
            int i2 = ShareDataUIState + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = ShareDataUIState + 63;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static ItemReverseCategoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = R.id.btn_confirm;
        LoadingButton loadingButton = (LoadingButton) ViewBindings.findChildViewById(view, i3);
        if (loadingButton != null) {
            i3 = R.id.cl_reason_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i3);
            if (constraintLayout != null) {
                i3 = R.id.input_reason;
                CommonInputView commonInputView = (CommonInputView) ViewBindings.findChildViewById(view, i3);
                if (commonInputView != null) {
                    i3 = R.id.iv_status;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i3);
                    if (imageView != null) {
                        int i4 = component3 + 19;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i3 = R.id.tv_category;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                        if (textView != null) {
                            int i5 = component3 + 117;
                            ShareDataUIState = i5 % 128;
                            int i6 = i5 % 2;
                            i3 = R.id.tv_tips;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                            if (textView2 != null) {
                                return new ItemReverseCategoryBinding((CardView) view, loadingButton, constraintLayout, commonInputView, imageView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
    }
}
