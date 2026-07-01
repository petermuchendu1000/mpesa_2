package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentHomeBalanceTemplate2BindingImpl extends FragmentHomeBalanceTemplate2Binding {
    private static int component1 = 1;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 1);
        sparseIntArray.put(R.id.ll_profile, 2);
        sparseIntArray.put(R.id.iv_profile, 3);
        sparseIntArray.put(R.id.tvName, 4);
        sparseIntArray.put(R.id.tvBalanceValue, 5);
        sparseIntArray.put(R.id.tvBalance, 6);
        sparseIntArray.put(R.id.tvUnit, 7);
        sparseIntArray.put(R.id.ivBalance, 8);
        sparseIntArray.put(R.id.ivArrow, 9);
        sparseIntArray.put(R.id.tvWarning, 10);
        int i = component1 + 61;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public FragmentHomeBalanceTemplate2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, copydefault, component2));
    }

    private FragmentHomeBalanceTemplate2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[9], (ImageView) objArr[1], (ImageView) objArr[8], (RoundImageView) objArr[3], (RoundLinearLayout) objArr[2], (RoundConstraintLayout) objArr[0], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[7], (RoundTextView) objArr[10]);
        this.ShareDataUIState = -1L;
        this.root.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ShareDataUIState != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.ShareDataUIState = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 9;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 39;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 47;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 101;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 61 / 0;
        }
        return true;
    }
}
