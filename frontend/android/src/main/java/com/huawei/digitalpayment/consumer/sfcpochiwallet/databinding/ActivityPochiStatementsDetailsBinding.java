package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public abstract class ActivityPochiStatementsDetailsBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final CardView cardAbbr;
    public final FrameLayout flAvatarContainer;
    public final RoundImageView ivAvatar;
    public final RoundConstraintLayout ivAvatarContainer;
    public final RoundImageView ivDelete;
    public final View ivGuideline;
    public final RoundImageView ivSendAvatar;
    public final LinearLayout llSendContainer;
    public final CardView paidCardAbbr;
    public final CardView rlContainer;
    public final RoundConstraintLayout rlReceiveInfo;
    public final RoundConstraintLayout rlSuccessContainer;
    public final RecyclerView rvFunction;
    public final TextView tvAbbr;
    public final TextView tvAmount;
    public final TextView tvCopy;
    public final TextView tvDate;
    public final TextView tvId;
    public final RoundLinearLayout tvIdContainer;
    public final TextView tvIdValue;
    public final TextView tvPaidAbbr;
    public final TextView tvPhoneNumber;
    public final TextView tvSendName;
    public final TextView tvSendTo;
    public final RoundTextView tvTitle;
    public final TextView tvTransactionCost;

    protected ActivityPochiStatementsDetailsBinding(Object obj, View view, int i, CardView cardView, FrameLayout frameLayout, RoundImageView roundImageView, RoundConstraintLayout roundConstraintLayout, RoundImageView roundImageView2, View view2, RoundImageView roundImageView3, LinearLayout linearLayout, CardView cardView2, CardView cardView3, RoundConstraintLayout roundConstraintLayout2, RoundConstraintLayout roundConstraintLayout3, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, RoundLinearLayout roundLinearLayout, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, RoundTextView roundTextView, TextView textView11) {
        super(obj, view, i);
        this.cardAbbr = cardView;
        this.flAvatarContainer = frameLayout;
        this.ivAvatar = roundImageView;
        this.ivAvatarContainer = roundConstraintLayout;
        this.ivDelete = roundImageView2;
        this.ivGuideline = view2;
        this.ivSendAvatar = roundImageView3;
        this.llSendContainer = linearLayout;
        this.paidCardAbbr = cardView2;
        this.rlContainer = cardView3;
        this.rlReceiveInfo = roundConstraintLayout2;
        this.rlSuccessContainer = roundConstraintLayout3;
        this.rvFunction = recyclerView;
        this.tvAbbr = textView;
        this.tvAmount = textView2;
        this.tvCopy = textView3;
        this.tvDate = textView4;
        this.tvId = textView5;
        this.tvIdContainer = roundLinearLayout;
        this.tvIdValue = textView6;
        this.tvPaidAbbr = textView7;
        this.tvPhoneNumber = textView8;
        this.tvSendName = textView9;
        this.tvSendTo = textView10;
        this.tvTitle = roundTextView;
        this.tvTransactionCost = textView11;
    }

    public static ActivityPochiStatementsDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        ActivityPochiStatementsDetailsBinding activityPochiStatementsDetailsBindingInflate;
        int i = 2 % 2;
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            activityPochiStatementsDetailsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            int i3 = 68 / 0;
        } else {
            activityPochiStatementsDetailsBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return activityPochiStatementsDetailsBindingInflate;
    }

    @Deprecated
    public static ActivityPochiStatementsDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiStatementsDetailsBinding activityPochiStatementsDetailsBinding = (ActivityPochiStatementsDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_statements_details, viewGroup, z, obj);
        int i4 = copydefault + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiStatementsDetailsBinding;
    }

    public static ActivityPochiStatementsDetailsBinding inflate(LayoutInflater layoutInflater) {
        ActivityPochiStatementsDetailsBinding activityPochiStatementsDetailsBindingInflate;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityPochiStatementsDetailsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 74 / 0;
        } else {
            activityPochiStatementsDetailsBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = ShareDataUIState + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiStatementsDetailsBindingInflate;
    }

    @Deprecated
    public static ActivityPochiStatementsDetailsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiStatementsDetailsBinding activityPochiStatementsDetailsBinding = (ActivityPochiStatementsDetailsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pochi_statements_details, null, false, obj);
        int i4 = ShareDataUIState + 13;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityPochiStatementsDetailsBinding;
        }
        throw null;
    }

    public static ActivityPochiStatementsDetailsBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        ActivityPochiStatementsDetailsBinding activityPochiStatementsDetailsBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return activityPochiStatementsDetailsBindingBind;
    }

    @Deprecated
    public static ActivityPochiStatementsDetailsBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityPochiStatementsDetailsBinding activityPochiStatementsDetailsBinding = (ActivityPochiStatementsDetailsBinding) bind(obj, view, R.layout.activity_pochi_statements_details);
        int i4 = copydefault + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityPochiStatementsDetailsBinding;
    }
}
