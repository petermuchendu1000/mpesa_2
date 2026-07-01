package com.huawei.digitalpayment.consumer.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public final class AnswerOtherQuestionTransactionLayoutBinding implements ViewBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final Barrier barrier;
    private final ConstraintLayout copydefault;
    public final RoundLinearLayout llTransactions;
    public final TextView tvAddTransactions;
    public final TextView tvAddTransactionsTips1;
    public final TextView tvAddTransactionsTips2;
    public final TextView tvAddTransactionsTips3;
    public final TextView tvLastFiveTransaction;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout root = getRoot();
        int i3 = ShareDataUIState + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return root;
    }

    private AnswerOtherQuestionTransactionLayoutBinding(ConstraintLayout constraintLayout, Barrier barrier, RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.copydefault = constraintLayout;
        this.barrier = barrier;
        this.llTransactions = roundLinearLayout;
        this.tvAddTransactions = textView;
        this.tvAddTransactionsTips1 = textView2;
        this.tvAddTransactionsTips2 = textView3;
        this.tvAddTransactionsTips3 = textView4;
        this.tvLastFiveTransaction = textView5;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = this.copydefault;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return constraintLayout;
    }

    public static AnswerOtherQuestionTransactionLayoutBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        AnswerOtherQuestionTransactionLayoutBinding answerOtherQuestionTransactionLayoutBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component3 + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return answerOtherQuestionTransactionLayoutBindingInflate;
        }
        obj.hashCode();
        throw null;
    }

    public static AnswerOtherQuestionTransactionLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.answer_other_question_transaction_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
            int i4 = component3 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return bind(viewInflate);
    }

    public static AnswerOtherQuestionTransactionLayoutBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.id.barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i3);
            if (barrier != null) {
                i3 = R.id.ll_transactions;
                RoundLinearLayout roundLinearLayout = (RoundLinearLayout) ViewBindings.findChildViewById(view, i3);
                if (roundLinearLayout != null) {
                    i3 = R.id.tv_add_transactions;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i3);
                    if (textView != null) {
                        int i4 = ShareDataUIState + 109;
                        component3 = i4 % 128;
                        if (i4 % 2 != 0) {
                            i3 = R.id.tv_add_transactions_tips1;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i3);
                            if (textView2 != null) {
                                i3 = R.id.tv_add_transactions_tips2;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i3);
                                if (textView3 != null) {
                                    i3 = R.id.tv_add_transactions_tips3;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i3);
                                    if (textView4 != null) {
                                        i3 = R.id.tv_last_five_transaction;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i3);
                                        if (textView5 != null) {
                                            AnswerOtherQuestionTransactionLayoutBinding answerOtherQuestionTransactionLayoutBinding = new AnswerOtherQuestionTransactionLayoutBinding((ConstraintLayout) view, barrier, roundLinearLayout, textView, textView2, textView3, textView4, textView5);
                                            int i5 = component3 + 29;
                                            ShareDataUIState = i5 % 128;
                                            if (i5 % 2 == 0) {
                                                return answerOtherQuestionTransactionLayoutBinding;
                                            }
                                            obj.hashCode();
                                            throw null;
                                        }
                                    }
                                }
                            }
                        } else {
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i3)));
        }
        obj.hashCode();
        throw null;
    }
}
