package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ExpandableBalanceCardPostpayBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int copydefault = 1;
    public final RoundTextView btnAction1;
    public final LoadingButton btnAction2;
    public final CardView cardAccountInfo;
    public final CardView cardBalanceIcon;
    public final View cardDivider2;
    public final ConstraintLayout constraintBillInfo;
    public final ConstraintLayout constraintLineBar;
    public final ConstraintLayout constraintPrepaymentBalance;
    public final ConstraintLayout constraintTotalBill;
    public final ConstraintLayout constraintUsageLimit;
    public final ConstraintLayout csBody;
    public final ConstraintLayout csButtons;
    public final ConstraintLayout csHeader;
    public final RoundImageView ivBalanceIcon;
    public final RoundImageView ivDropDown;
    public final ProgressBar prgCreditLimit;
    public final View prgCreditLimitDivider;
    public final TextView tvAvailableBalance;
    public final TextView tvAvailableBalanceLabel;
    public final TextView tvCurrentLimit;
    public final TextView tvCurrentUsage;
    public final TextView tvDueDateLabel;
    public final TextView tvDueDateValue;
    public final TextView tvPrepayment;
    public final TextView tvPrepaymentLabel;
    public final TextView tvTotalBill;
    public final TextView tvTotalBillLabel;
    public final TextView txBalanceName;
    public final TextView txBalanceVal;
    public final TextView txDateVal;

    protected ExpandableBalanceCardPostpayBinding(Object obj, View view, int i, RoundTextView roundTextView, LoadingButton loadingButton, CardView cardView, CardView cardView2, View view2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, ConstraintLayout constraintLayout8, RoundImageView roundImageView, RoundImageView roundImageView2, ProgressBar progressBar, View view3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        super(obj, view, i);
        this.btnAction1 = roundTextView;
        this.btnAction2 = loadingButton;
        this.cardAccountInfo = cardView;
        this.cardBalanceIcon = cardView2;
        this.cardDivider2 = view2;
        this.constraintBillInfo = constraintLayout;
        this.constraintLineBar = constraintLayout2;
        this.constraintPrepaymentBalance = constraintLayout3;
        this.constraintTotalBill = constraintLayout4;
        this.constraintUsageLimit = constraintLayout5;
        this.csBody = constraintLayout6;
        this.csButtons = constraintLayout7;
        this.csHeader = constraintLayout8;
        this.ivBalanceIcon = roundImageView;
        this.ivDropDown = roundImageView2;
        this.prgCreditLimit = progressBar;
        this.prgCreditLimitDivider = view3;
        this.tvAvailableBalance = textView;
        this.tvAvailableBalanceLabel = textView2;
        this.tvCurrentLimit = textView3;
        this.tvCurrentUsage = textView4;
        this.tvDueDateLabel = textView5;
        this.tvDueDateValue = textView6;
        this.tvPrepayment = textView7;
        this.tvPrepaymentLabel = textView8;
        this.tvTotalBill = textView9;
        this.tvTotalBillLabel = textView10;
        this.txBalanceName = textView11;
        this.txBalanceVal = textView12;
        this.txDateVal = textView13;
    }

    public static ExpandableBalanceCardPostpayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ExpandableBalanceCardPostpayBinding expandableBalanceCardPostpayBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return expandableBalanceCardPostpayBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ExpandableBalanceCardPostpayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ExpandableBalanceCardPostpayBinding expandableBalanceCardPostpayBinding = (ExpandableBalanceCardPostpayBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.expandable_balance_card_postpay, viewGroup, z, obj);
        if (i3 != 0) {
            return expandableBalanceCardPostpayBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ExpandableBalanceCardPostpayBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExpandableBalanceCardPostpayBinding expandableBalanceCardPostpayBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return expandableBalanceCardPostpayBindingInflate;
    }

    @Deprecated
    public static ExpandableBalanceCardPostpayBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component1 = i2 % 128;
        ExpandableBalanceCardPostpayBinding expandableBalanceCardPostpayBinding = (ExpandableBalanceCardPostpayBinding) (i2 % 2 != 0 ? ViewDataBinding.inflateInternal(layoutInflater, R.layout.expandable_balance_card_postpay, null, true, obj) : ViewDataBinding.inflateInternal(layoutInflater, R.layout.expandable_balance_card_postpay, null, false, obj));
        int i3 = component1 + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return expandableBalanceCardPostpayBinding;
    }

    public static ExpandableBalanceCardPostpayBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ExpandableBalanceCardPostpayBinding expandableBalanceCardPostpayBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = component1 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return expandableBalanceCardPostpayBindingBind;
    }

    @Deprecated
    public static ExpandableBalanceCardPostpayBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ViewDataBinding viewDataBindingBind = bind(obj, view, R.layout.expandable_balance_card_postpay);
        if (i3 == 0) {
            return (ExpandableBalanceCardPostpayBinding) viewDataBindingBind;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
