package com.huawei.digitalpayment.consumer.developer.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.developer.R;

public class ActivityDevBindingImpl extends ActivityDevBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static final SparseIntArray component2;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final LinearLayout component3;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.netConfig, 1);
        sparseIntArray.put(R.id.tvTime, 2);
        sparseIntArray.put(R.id.btnLogs, 3);
        sparseIntArray.put(R.id.mockCrash, 4);
        sparseIntArray.put(R.id.copyToken, 5);
        int i = getAsAtTimestamp + 3;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ActivityDevBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, component2));
    }

    private ActivityDevBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[3], (Button) objArr[5], (Button) objArr[4], (Button) objArr[1], (TextView) objArr[2]);
        this.copydefault = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component3 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 109;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 47;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 79;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 109;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
