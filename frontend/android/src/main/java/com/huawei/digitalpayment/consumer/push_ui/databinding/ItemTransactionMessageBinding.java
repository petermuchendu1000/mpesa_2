package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.BubblesView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.push_ui.R;

public final class ItemTransactionMessageBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    public final AmountDisplayView amountDisplayView;
    public final RoundConstraintLayout clContent;
    private final LinearLayout component3;
    public final BubblesView ivRedDot;
    public final ImageView ivStatus;
    public final RoundTextView line;
    public final LinearLayout llDetails;
    public final LinearLayout llFileds;
    public final LinearLayout llTransactionItem;
    public final TextView tvStatus;
    public final TextView tvTime;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private ItemTransactionMessageBinding(LinearLayout linearLayout, AmountDisplayView amountDisplayView, RoundConstraintLayout roundConstraintLayout, BubblesView bubblesView, ImageView imageView, RoundTextView roundTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3) {
        this.component3 = linearLayout;
        this.amountDisplayView = amountDisplayView;
        this.clContent = roundConstraintLayout;
        this.ivRedDot = bubblesView;
        this.ivStatus = imageView;
        this.line = roundTextView;
        this.llDetails = linearLayout2;
        this.llFileds = linearLayout3;
        this.llTransactionItem = linearLayout4;
        this.tvStatus = textView;
        this.tvTime = textView2;
        this.tvTitle = textView3;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.component3;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static ItemTransactionMessageBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        ItemTransactionMessageBinding itemTransactionMessageBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return itemTransactionMessageBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static ItemTransactionMessageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_transaction_message, viewGroup, false);
        if (z) {
            int i4 = copydefault + 61;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
            int i6 = ShareDataUIState + 17;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        ItemTransactionMessageBinding itemTransactionMessageBindingBind = bind(viewInflate);
        int i8 = copydefault + 117;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            return itemTransactionMessageBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[PHI: r3
  0x0053: PHI (r3v7 android.widget.ImageView) = (r3v6 android.widget.ImageView), (r3v13 android.widget.ImageView) binds: [B:14:0x0051, B:11:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.push_ui.databinding.ItemTransactionMessageBinding bind(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.push_ui.databinding.ItemTransactionMessageBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.push_ui.databinding.ItemTransactionMessageBinding");
    }
}
