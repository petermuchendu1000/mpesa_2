package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.CommonCheckBox;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.baselib.widget.input.MobileInputView;
import com.huawei.digitalpayment.consumer.login.R;

public class LoginActivityLoginBindingImpl extends LoginActivityLoginBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final ConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.tvLoginTitle, 1);
        sparseIntArray.put(R.id.tvDescription, 2);
        sparseIntArray.put(R.id.phone_number_input, 3);
        sparseIntArray.put(R.id.llAgreement, 4);
        sparseIntArray.put(R.id.ivAgreement, 5);
        sparseIntArray.put(R.id.tvAgreement, 6);
        sparseIntArray.put(R.id.btn_next, 7);
        int i = copydefault + 1;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    public LoginActivityLoginBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component1, component3));
    }

    private LoginActivityLoginBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (CommonCheckBox) objArr[5], (LinearLayout) objArr[4], (MobileInputView) objArr[3], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i5 = i4 + 97;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 117;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 85;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
