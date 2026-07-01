package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.basic.R;

public class DialogGuideOpenBiometricBindingImpl extends DialogGuideOpenBiometricBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component2;
    private final RoundLinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.line, 1);
        sparseIntArray.put(R.id.ivIcon, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvDescription, 4);
        sparseIntArray.put(R.id.btnPositive, 5);
        sparseIntArray.put(R.id.btnNegative, 6);
        int i = getRequestBeneficiariesState + 27;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public DialogGuideOpenBiometricBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, copydefault));
    }

    private DialogGuideOpenBiometricBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[6], (LoadingButton) objArr[5], (ImageView) objArr[2], (RoundTextView) objArr[1], (TextView) objArr[4], (TextView) objArr[3]);
        this.component2 = -1L;
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) objArr[0];
        this.component3 = roundLinearLayout;
        roundLinearLayout.setTag("layout/dialog_common_0");
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
        int i4 = equals + 1;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 89;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 83;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 105;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
