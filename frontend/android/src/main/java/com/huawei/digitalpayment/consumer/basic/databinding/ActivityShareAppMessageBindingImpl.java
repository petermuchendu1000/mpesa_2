package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.input.MultiLineInputView;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityShareAppMessageBindingImpl extends ActivityShareAppMessageBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2;
    private static int copy = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private long component3;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.input_phone, 1);
        sparseIntArray.put(R.id.input_content, 2);
        sparseIntArray.put(R.id.tv_share_limit, 3);
        sparseIntArray.put(R.id.lb_confirm, 4);
        int i = ShareDataUIState + 99;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public ActivityShareAppMessageBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component1, component2));
    }

    private ActivityShareAppMessageBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (MultiLineInputView) objArr[2], (CommonInputView) objArr[1], (Button) objArr[4], (AppCompatTextView) objArr[3]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = equals + 27;
        int i5 = i4 % 128;
        copy = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 35;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 107;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 21;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
