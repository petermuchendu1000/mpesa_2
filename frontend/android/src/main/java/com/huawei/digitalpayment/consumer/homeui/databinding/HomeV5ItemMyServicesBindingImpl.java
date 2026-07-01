package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.homeui.R;

public class HomeV5ItemMyServicesBindingImpl extends HomeV5ItemMyServicesBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.ivFunctionIcon, 1);
        sparseIntArray.put(R.id.iv_add, 2);
        sparseIntArray.put(R.id.tvFunctionName, 3);
        sparseIntArray.put(R.id.top_line, 4);
        int i = equals + 107;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public HomeV5ItemMyServicesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component2, component3));
    }

    private HomeV5ItemMyServicesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[1], (View) objArr[4], (TextView) objArr[3]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = copy + 57;
        int i5 = i4 % 128;
        component4 = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 77;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 37;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 3;
        copy = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
