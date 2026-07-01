package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ExpandableBalanceCardPostpayBindingImpl extends ExpandableBalanceCardPostpayBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.csHeader, 1);
        sparseIntArray.put(R.id.cardBalanceIcon, 2);
        sparseIntArray.put(R.id.ivBalanceIcon, 3);
        sparseIntArray.put(R.id.txBalanceName, 4);
        sparseIntArray.put(R.id.ivDropDown, 5);
        sparseIntArray.put(R.id.txBalanceVal, 6);
        sparseIntArray.put(R.id.txDateVal, 7);
        sparseIntArray.put(R.id.csBody, 8);
        sparseIntArray.put(R.id.constraintBillInfo, 9);
        sparseIntArray.put(R.id.constraintUsageLimit, 10);
        sparseIntArray.put(R.id.tvCurrentUsage, 11);
        sparseIntArray.put(R.id.tvCurrentLimit, 12);
        sparseIntArray.put(R.id.constraintLineBar, 13);
        sparseIntArray.put(R.id.prgCreditLimit, 14);
        sparseIntArray.put(R.id.prgCreditLimitDivider, 15);
        sparseIntArray.put(R.id.constraintPrepaymentBalance, 16);
        sparseIntArray.put(R.id.tvPrepaymentLabel, 17);
        sparseIntArray.put(R.id.tvAvailableBalanceLabel, 18);
        sparseIntArray.put(R.id.tvPrepayment, 19);
        sparseIntArray.put(R.id.tvAvailableBalance, 20);
        sparseIntArray.put(R.id.constraintTotalBill, 21);
        sparseIntArray.put(R.id.tvTotalBillLabel, 22);
        sparseIntArray.put(R.id.tvTotalBill, 23);
        sparseIntArray.put(R.id.tvDueDateLabel, 24);
        sparseIntArray.put(R.id.tvDueDateValue, 25);
        sparseIntArray.put(R.id.cardDivider2, 26);
        sparseIntArray.put(R.id.csButtons, 27);
        sparseIntArray.put(R.id.btnAction1, 28);
        sparseIntArray.put(R.id.btnAction2, 29);
        int i = ShareDataUIState + 103;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ExpandableBalanceCardPostpayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 30, component2, component3));
    }

    private ExpandableBalanceCardPostpayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundTextView) objArr[28], (LoadingButton) objArr[29], (CardView) objArr[0], (CardView) objArr[2], (View) objArr[26], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[16], (ConstraintLayout) objArr[21], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[27], (ConstraintLayout) objArr[1], (RoundImageView) objArr[3], (RoundImageView) objArr[5], (ProgressBar) objArr[14], (View) objArr[15], (TextView) objArr[20], (TextView) objArr[18], (TextView) objArr[12], (TextView) objArr[11], (TextView) objArr[24], (TextView) objArr[25], (TextView) objArr[19], (TextView) objArr[17], (TextView) objArr[23], (TextView) objArr[22], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7]);
        this.copydefault = -1L;
        this.cardAccountInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.copydefault != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 51;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 79;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 62 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 67;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 85;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
