package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.IconImageView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.text.FixEditText;
import com.huawei.digitalpayment.consumer.baseui.R;

public class PhoneInputEditTextBindingArImpl extends PhoneInputEditTextBinding {
    private static int ShareDataUIState = 1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.startIconView, 3);
        sparseIntArray.put(R.id.startUnitView, 4);
        sparseIntArray.put(R.id.inputView, 5);
        sparseIntArray.put(R.id.endIconView, 6);
        sparseIntArray.put(R.id.endUnitView, 7);
        int i = component3 + 1;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public PhoneInputEditTextBindingArImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, mapBindings(dataBindingComponent, viewArr, 8, component2, copydefault));
    }

    private PhoneInputEditTextBindingArImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (RoundConstraintLayout) objArr[1], (IconImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (FixEditText) objArr[5], (IconImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[0]);
        this.component1 = -1L;
        this.clInput.setTag(null);
        this.errorView.setTag(null);
        this.titleView.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 123;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 117;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 55;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
