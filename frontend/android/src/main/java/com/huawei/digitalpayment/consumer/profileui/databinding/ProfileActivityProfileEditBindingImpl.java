package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.profileui.R;

public class ProfileActivityProfileEditBindingImpl extends ProfileActivityProfileEditBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component2;
    private static int component4 = 1;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals;
    private long component1;
    private final LinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.inputName, 1);
        sparseIntArray.put(R.id.lb_save, 2);
        int i = ShareDataUIState + 81;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ProfileActivityProfileEditBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, copydefault, component2));
    }

    private ProfileActivityProfileEditBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[1], (LoadingButton) objArr[2]);
        this.component1 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component3 = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
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
        int i4 = component4 + 9;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 23;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 65;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
