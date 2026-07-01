package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.history.R;

public abstract class TransactionHistoryDetailCustomerActivityBinding extends ViewDataBinding {
    private static int component1 = 0;
    private static int component3 = 1;
    public final AmountDisplayView amountDisplayView;
    public final LoadingButton btnBillShare;
    public final LoadingButton btnSaveReceipt;
    public final ImageView imSettlement;
    public final ImageView ivResultIcon;
    public final LinearLayout llFieldList;
    public final RoundLinearLayout llSaveReceipt;
    public final LinearLayout llSettlement;
    public final NestedScrollView refundContainer;
    public final RelativeLayout rlSettlementOpen;
    public final RecyclerView rvSettlement;
    public final TextView tvCancel;
    public final TextView tvHelpCenter;
    public final TextView tvStatus;
    public final View viewDivider;

    protected TransactionHistoryDetailCustomerActivityBinding(Object obj, View view, int i, AmountDisplayView amountDisplayView, LoadingButton loadingButton, LoadingButton loadingButton2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, RoundLinearLayout roundLinearLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.amountDisplayView = amountDisplayView;
        this.btnBillShare = loadingButton;
        this.btnSaveReceipt = loadingButton2;
        this.imSettlement = imageView;
        this.ivResultIcon = imageView2;
        this.llFieldList = linearLayout;
        this.llSaveReceipt = roundLinearLayout;
        this.llSettlement = linearLayout2;
        this.refundContainer = nestedScrollView;
        this.rlSettlementOpen = relativeLayout;
        this.rvSettlement = recyclerView;
        this.tvCancel = textView;
        this.tvHelpCenter = textView2;
        this.tvStatus = textView3;
        this.viewDivider = view2;
    }

    public static TransactionHistoryDetailCustomerActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            throw null;
        }
        TransactionHistoryDetailCustomerActivityBinding transactionHistoryDetailCustomerActivityBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = component3 + 37;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return transactionHistoryDetailCustomerActivityBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static TransactionHistoryDetailCustomerActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryDetailCustomerActivityBinding transactionHistoryDetailCustomerActivityBinding = (TransactionHistoryDetailCustomerActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.transaction_history_detail_customer_activity, viewGroup, z, obj);
        int i4 = component1 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return transactionHistoryDetailCustomerActivityBinding;
    }

    public static TransactionHistoryDetailCustomerActivityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryDetailCustomerActivityBinding transactionHistoryDetailCustomerActivityBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 3;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return transactionHistoryDetailCustomerActivityBindingInflate;
    }

    @Deprecated
    public static TransactionHistoryDetailCustomerActivityBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        TransactionHistoryDetailCustomerActivityBinding transactionHistoryDetailCustomerActivityBinding = (TransactionHistoryDetailCustomerActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, i2 % 2 == 0 ? R.layout.transaction_history_detail_customer_activity : R.layout.transaction_history_detail_customer_activity, null, false, obj);
        int i3 = component1 + 35;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return transactionHistoryDetailCustomerActivityBinding;
        }
        throw null;
    }

    public static TransactionHistoryDetailCustomerActivityBinding bind(View view) {
        TransactionHistoryDetailCustomerActivityBinding transactionHistoryDetailCustomerActivityBindingBind;
        int i = 2 % 2;
        int i2 = component3 + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            transactionHistoryDetailCustomerActivityBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
            int i3 = 67 / 0;
        } else {
            transactionHistoryDetailCustomerActivityBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component3 + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionHistoryDetailCustomerActivityBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static TransactionHistoryDetailCustomerActivityBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        TransactionHistoryDetailCustomerActivityBinding transactionHistoryDetailCustomerActivityBinding = (TransactionHistoryDetailCustomerActivityBinding) bind(obj, view, R.layout.transaction_history_detail_customer_activity);
        int i4 = component3 + 103;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return transactionHistoryDetailCustomerActivityBinding;
    }
}
