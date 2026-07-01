package com.huawei.digitalpayment.consumer.history.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.text.AmountDisplayView;
import com.huawei.digitalpayment.consumer.history.R;

public class TransactionHistoryDetailCustomerActivityBindingImpl extends TransactionHistoryDetailCustomerActivityBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.refund_container, 1);
        sparseIntArray.put(R.id.ivResultIcon, 2);
        sparseIntArray.put(R.id.tv_status, 3);
        sparseIntArray.put(R.id.amountDisplayView, 4);
        sparseIntArray.put(R.id.ll_field_list, 5);
        sparseIntArray.put(R.id.ll_settlement, 6);
        sparseIntArray.put(R.id.rl_settlement_open, 7);
        sparseIntArray.put(R.id.im_settlement, 8);
        sparseIntArray.put(R.id.rv_settlement, 9);
        sparseIntArray.put(R.id.tvHelpCenter, 10);
        sparseIntArray.put(R.id.tvCancel, 11);
        sparseIntArray.put(R.id.ll_save_receipt, 12);
        sparseIntArray.put(R.id.btn_bill_share, 13);
        sparseIntArray.put(R.id.view_divider, 14);
        sparseIntArray.put(R.id.btn_save_receipt, 15);
        int i = ShareDataUIState + 3;
        copy = i % 128;
        int i2 = i % 2;
    }

    public TransactionHistoryDetailCustomerActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, component2, copydefault));
    }

    private TransactionHistoryDetailCustomerActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AmountDisplayView) objArr[4], (LoadingButton) objArr[13], (LoadingButton) objArr[15], (ImageView) objArr[8], (ImageView) objArr[2], (LinearLayout) objArr[5], (RoundLinearLayout) objArr[12], (LinearLayout) objArr[6], (NestedScrollView) objArr[1], (RelativeLayout) objArr[7], (RecyclerView) objArr[9], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[3], (View) objArr[14]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4 + 41;
        getRequestBeneficiariesState = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 25;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 105;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
