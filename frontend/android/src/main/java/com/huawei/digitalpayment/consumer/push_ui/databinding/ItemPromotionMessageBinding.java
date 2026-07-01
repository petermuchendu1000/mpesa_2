package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.push_ui.R;

public final class ItemPromotionMessageBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final RoundLinearLayout clContent;
    private final LinearLayout copydefault;
    public final ImageView imageView14;
    public final RoundImageView imgNotify;
    public final BubblesView ivRedDot;
    public final ConstraintLayout llMore;
    public final TextView tvContent;
    public final TextView tvTime;
    public final TextView tvTitle;
    public final RoundTextView view4;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemPromotionMessageBinding(LinearLayout linearLayout, RoundLinearLayout roundLinearLayout, ImageView imageView, RoundImageView roundImageView, BubblesView bubblesView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, RoundTextView roundTextView) {
        this.copydefault = linearLayout;
        this.clContent = roundLinearLayout;
        this.imageView14 = imageView;
        this.imgNotify = roundImageView;
        this.ivRedDot = bubblesView;
        this.llMore = constraintLayout;
        this.tvContent = textView;
        this.tvTime = textView2;
        this.tvTitle = textView3;
        this.view4 = roundTextView;
    }

    @Override
    public LinearLayout getRoot() {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            linearLayout = this.copydefault;
            int i4 = 85 / 0;
        } else {
            linearLayout = this.copydefault;
        }
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static ItemPromotionMessageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return inflate(layoutInflater, null, false);
    }

    public static ItemPromotionMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_promotion_message, viewGroup, false);
        if (!(!z)) {
            int i4 = ShareDataUIState + 11;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return bind(viewInflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[PHI: r2
  0x006a: PHI (r2v7 android.widget.TextView) = (r2v6 android.widget.TextView), (r2v14 android.widget.TextView) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.push_ui.databinding.ItemPromotionMessageBinding bind(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push_ui.databinding.ItemPromotionMessageBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.push_ui.databinding.ItemPromotionMessageBinding");
    }
}
