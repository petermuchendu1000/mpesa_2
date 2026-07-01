package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.R;

public class DialogCommonBindingImpl extends DialogCommonBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final RoundLinearLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.line, 1);
        sparseIntArray.put(R.id.ivIcon, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvDescription, 4);
        sparseIntArray.put(R.id.btnPositive, 5);
        sparseIntArray.put(R.id.btnNegative, 6);
        int i = component4 + 23;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public DialogCommonBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component1));
    }

    private DialogCommonBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[6], (LoadingButton) objArr[5], (ImageView) objArr[2], (RoundTextView) objArr[1], (TextView) objArr[4], (TextView) objArr[3]);
        this.copydefault = -1L;
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) objArr[0];
        this.component2 = roundLinearLayout;
        roundLinearLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 85;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 83;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 13;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 97;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
