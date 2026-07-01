package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentHomeTopFunctionBindingImpl extends FragmentHomeTopFunctionBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final LinearLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.recyclerView, 1);
        sparseIntArray.put(R.id.topFunctionBottom, 2);
        int i = component1 + 47;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public FragmentHomeTopFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component3, copydefault));
    }

    private FragmentHomeTopFunctionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[1], (RoundTextView) objArr[2]);
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
        int i4 = getAsAtTimestamp + 71;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
