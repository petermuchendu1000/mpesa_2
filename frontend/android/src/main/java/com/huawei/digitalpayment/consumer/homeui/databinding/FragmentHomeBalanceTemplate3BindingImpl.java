package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.homeui.BR;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentHomeBalanceTemplate3BindingImpl extends FragmentHomeBalanceTemplate3Binding {
    private static final SparseIntArray ShareDataUIState;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getRequestBeneficiariesState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 3);
        sparseIntArray.put(R.id.tvBalance, 4);
        sparseIntArray.put(R.id.tvUnit, 5);
        sparseIntArray.put(R.id.tvBalanceValue, 6);
        sparseIntArray.put(R.id.ivArrow, 7);
        sparseIntArray.put(R.id.tvBalanceValuePoint, 8);
        sparseIntArray.put(R.id.ivBalance, 9);
        int i = component3 + 73;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FragmentHomeBalanceTemplate3BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, copydefault, ShareDataUIState));
    }

    private FragmentHomeBalanceTemplate3BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[7], (ImageView) objArr[3], (ImageView) objArr[9], (TextView) objArr[1], (TextView) objArr[2], (RoundConstraintLayout) objArr[0], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[5]);
        this.component1 = -1L;
        this.lastTransactionTitle.setTag(null);
        this.lastTransactionValue.setTag(null);
        this.root.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 5;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            if (BR.transactionIsVisible != i) {
                return false;
            }
            int i4 = getRequestBeneficiariesState + 105;
            copy = i4 % 128;
            int i5 = i4 % 2;
            setTransactionIsVisible((Boolean) obj);
            int i6 = copy + 7;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = BR.transactionIsVisible;
        throw null;
    }

    @Override
    public void setTransactionIsVisible(Boolean bool) {
        this.mTransactionIsVisible = bool;
        synchronized (this) {
            this.component1 |= 1;
        }
        notifyPropertyChanged(BR.transactionIsVisible);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.component1;
            this.component1 = 0L;
        }
        Boolean bool = this.mTransactionIsVisible;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= zSafeUnbox ? 8L : 4L;
            }
            if (!zSafeUnbox) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.lastTransactionTitle.setVisibility(i);
            this.lastTransactionValue.setVisibility(i);
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = copy + 3;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 75;
        copy = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
