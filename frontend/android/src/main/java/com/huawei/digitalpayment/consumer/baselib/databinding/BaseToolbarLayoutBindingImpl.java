package com.huawei.digitalpayment.consumer.baselib.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.baselib.R;

public class BaseToolbarLayoutBindingImpl extends BaseToolbarLayoutBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component1;
    private static int copy = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private long component2;
    private final LinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.toolbarRoot, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.tvEndButton, 4);
        sparseIntArray.put(R.id.ivEndButton, 5);
        int i = ShareDataUIState + 27;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public BaseToolbarLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, copydefault, component1));
    }

    private BaseToolbarLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[5], (ConstraintLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[3]);
        this.component2 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component3 = linearLayout;
        linearLayout.setTag("llToolbar");
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
        int i4 = copy + 67;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 123;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 27;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 121;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
