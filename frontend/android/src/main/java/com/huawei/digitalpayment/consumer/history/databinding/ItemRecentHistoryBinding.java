package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemRecentHistoryBinding implements ViewBinding {
    private static int component2 = 1;
    private static int component3 = 0;
    public static int copydefault = 1107221361;
    public final RelativeLayout clContent;
    public final RoundConstraintLayout clItem;
    private final RoundConstraintLayout component1;
    public final RoundImageView ivIcon;
    public final ConstraintLayout ivLogo;
    public final TextView tvAmount;
    public final TextView tvTransTime;
    public final TextView tvTransType;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return getRoot();
        }
        getRoot();
        throw null;
    }

    private ItemRecentHistoryBinding(RoundConstraintLayout roundConstraintLayout, RelativeLayout relativeLayout, RoundConstraintLayout roundConstraintLayout2, RoundImageView roundImageView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.component1 = roundConstraintLayout;
        this.clContent = relativeLayout;
        this.clItem = roundConstraintLayout2;
        this.ivIcon = roundImageView;
        this.ivLogo = constraintLayout;
        this.tvAmount = textView;
        this.tvTransTime = textView2;
        this.tvTransType = textView3;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.component1;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return roundConstraintLayout;
    }

    public static ItemRecentHistoryBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component2 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    public static ItemRecentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_recent_history, viewGroup, false);
        if (z) {
            int i4 = component3 + 21;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            viewGroup.addView(viewInflate);
        }
        ItemRecentHistoryBinding itemRecentHistoryBindingBind = bind(viewInflate);
        int i6 = component3 + 107;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return itemRecentHistoryBindingBind;
    }

    public static ItemRecentHistoryBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.cl_content;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
        if (relativeLayout != null) {
            RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) view;
            i2 = R.id.ivIcon;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i2);
            if (roundImageView != null) {
                int i3 = component3 + 17;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    i2 = R.id.ivLogo;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i2);
                    if (constraintLayout != null) {
                        i2 = R.id.tvAmount;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                        if (textView != null) {
                            int i4 = component2 + 5;
                            component3 = i4 % 128;
                            if (i4 % 2 == 0) {
                                i2 = R.id.tvTransTime;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                                if (textView2 != null) {
                                    i2 = R.id.tvTransType;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                                    if (textView3 != null) {
                                        return new ItemRecentHistoryBinding(roundConstraintLayout, relativeLayout, roundConstraintLayout, roundImageView, constraintLayout, textView, textView2, textView3);
                                    }
                                }
                            } else {
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
