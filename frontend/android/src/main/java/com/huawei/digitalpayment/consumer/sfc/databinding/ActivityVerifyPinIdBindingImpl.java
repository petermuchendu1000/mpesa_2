package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityVerifyPinIdBindingImpl extends ActivityVerifyPinIdBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.iv_pin_locked, 4);
        sparseIntArray.put(R.id.tv_pin_title, 5);
        sparseIntArray.put(R.id.input_number, 6);
        sparseIntArray.put(R.id.btn_confirm, 7);
        int i = copy + 67;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ActivityVerifyPinIdBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component3, copydefault));
    }

    private ActivityVerifyPinIdBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (CommonInputView) objArr[6], (RoundImageView) objArr[2], (ImageView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (View) objArr[1]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 111;
        component4 = i5 % 128;
        boolean z = !(i5 % 2 == 0);
        int i6 = i4 + 79;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 79;
        int i4 = i3 % 128;
        component4 = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 79;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return z;
    }
}
