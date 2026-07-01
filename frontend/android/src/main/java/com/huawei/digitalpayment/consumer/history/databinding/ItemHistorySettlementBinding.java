package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.consumer.history.R;

public final class ItemHistorySettlementBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final LinearLayout component3;
    public final LinearLayout llEscowTime;
    public final LinearLayout llSettlementAmount;
    public final LinearLayout llSettlementTime;
    public final LinearLayout llStatus;
    public final TextView tvEscowTime;
    public final TextView tvName;
    public final TextView tvSettlementAmount;
    public final TextView tvSettlementStatus;
    public final TextView tvSettlmentTime;
    public final View viewEmpty;

    @Override
    public View getRoot() {
        LinearLayout root;
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 95 / 0;
        } else {
            root = getRoot();
        }
        int i4 = component2 + 15;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private ItemHistorySettlementBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.component3 = linearLayout;
        this.llEscowTime = linearLayout2;
        this.llSettlementAmount = linearLayout3;
        this.llSettlementTime = linearLayout4;
        this.llStatus = linearLayout5;
        this.tvEscowTime = textView;
        this.tvName = textView2;
        this.tvSettlementAmount = textView3;
        this.tvSettlementStatus = textView4;
        this.tvSettlmentTime = textView5;
        this.viewEmpty = view;
    }

    @Override
    public LinearLayout getRoot() {
        LinearLayout linearLayout;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            linearLayout = this.component3;
            int i4 = 15 / 0;
        } else {
            linearLayout = this.component3;
        }
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return linearLayout;
    }

    public static ItemHistorySettlementBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ItemHistorySettlementBinding itemHistorySettlementBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 85;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return itemHistorySettlementBindingInflate;
        }
        throw null;
    }

    public static ItemHistorySettlementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_history_settlement, viewGroup, false);
        if (z) {
            int i4 = component2 + 61;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
                int i5 = 51 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        ItemHistorySettlementBinding itemHistorySettlementBindingBind = bind(viewInflate);
        int i6 = component2 + 125;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return itemHistorySettlementBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemHistorySettlementBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.ll_escow_time;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i4);
        if (linearLayout != null) {
            int i5 = component1 + 103;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.ll_settlement_amount;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i4);
            if (linearLayout2 != null) {
                i4 = R.id.ll_settlement_time;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i4);
                if (linearLayout3 != null) {
                    i4 = R.id.ll_status;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i4);
                    if (linearLayout4 != null) {
                        i4 = R.id.tv_escow_time;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
                        if (textView != null) {
                            i4 = R.id.tv_name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
                            if (textView2 != null) {
                                int i7 = component2 + 45;
                                component1 = i7 % 128;
                                Object obj = null;
                                if (i7 % 2 != 0) {
                                    throw null;
                                }
                                i4 = R.id.tv_settlement_amount;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i4);
                                if (textView3 != null) {
                                    int i8 = component1 + 53;
                                    component2 = i8 % 128;
                                    if (i8 % 2 == 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i4 = R.id.tv_settlement_status;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i4);
                                    if (textView4 != null) {
                                        i4 = R.id.tv_settlment_time;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i4);
                                        if (textView5 != null) {
                                            int i9 = component1 + 97;
                                            component2 = i9 % 128;
                                            int i10 = i9 % 2;
                                            i4 = R.id.view_empty;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, i4);
                                            if (viewFindChildViewById != null) {
                                                return new ItemHistorySettlementBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, viewFindChildViewById);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
