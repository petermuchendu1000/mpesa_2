package com.huawei.digitalpayment.checkoutUi.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.checkoutUi.R;

public class ActivityPaymentNewBindingImpl extends ActivityPaymentNewBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component2;
    private static int component4 = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final RoundConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_close, 1);
        sparseIntArray.put(R.id.tv_verify_method, 2);
        sparseIntArray.put(R.id.iv_icon, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_amount, 5);
        sparseIntArray.put(R.id.tv_amount_unit, 6);
        sparseIntArray.put(R.id.rv_recycler_view, 7);
        sparseIntArray.put(R.id.confirm, 8);
        int i = getAsAtTimestamp + 5;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityPaymentNewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, copydefault, component2));
    }

    private ActivityPaymentNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[8], (ImageView) objArr[1], (ImageView) objArr[3], (RecyclerView) objArr[7], (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[2]);
        this.component3 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component1 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = component4;
        int i5 = i4 + 87;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 25;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 24 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 5;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 79;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
