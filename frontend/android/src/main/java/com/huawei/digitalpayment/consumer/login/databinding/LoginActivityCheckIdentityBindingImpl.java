package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.consumer.login.R;

public class LoginActivityCheckIdentityBindingImpl extends LoginActivityCheckIdentityBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component3 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private long ShareDataUIState;
    private final LinearLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.llTips, 2);
        sparseIntArray.put(R.id.tips, 3);
        sparseIntArray.put(R.id.idType, 4);
        sparseIntArray.put(R.id.idNumber, 5);
        sparseIntArray.put(R.id.btn_confirm, 6);
        int i = component3 + 113;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
    }

    public LoginActivityCheckIdentityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component1, copydefault));
    }

    private LoginActivityCheckIdentityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[6], (CommonInputView) objArr[5], (CommonInputView) objArr[4], (RoundLinearLayout) objArr[2], (TextView) objArr[3], (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = getAsAtTimestamp + 103;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 11;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 45;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 57;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
