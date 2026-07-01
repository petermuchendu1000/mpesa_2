package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivitySfcRegisterKycBindingImpl extends ActivitySfcRegisterKycBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component2 = 0;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final LinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tvLoginTitle, 2);
        sparseIntArray.put(R.id.llContainer, 3);
        sparseIntArray.put(R.id.btnNext, 4);
        int i = getRequestBeneficiariesState + 27;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public ActivitySfcRegisterKycBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ShareDataUIState, copydefault));
    }

    private ActivitySfcRegisterKycBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[4], (ImageView) objArr[1], (LinearLayout) objArr[3], (TextView) objArr[2]);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 55;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 123;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 77;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 11;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
