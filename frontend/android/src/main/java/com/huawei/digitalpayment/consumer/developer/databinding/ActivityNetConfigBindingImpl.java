package com.huawei.digitalpayment.consumer.developer.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.developer.R;

public class ActivityNetConfigBindingImpl extends ActivityNetConfigBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final LinearLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.baseUrl, 1);
        sparseIntArray.put(R.id.signTransformation, 2);
        sparseIntArray.put(R.id.pinTransformation, 3);
        sparseIntArray.put(R.id.confirm, 4);
        int i = component3 + 117;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public ActivityNetConfigBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component1, component2));
    }

    private ActivityNetConfigBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[1], (LoadingButton) objArr[4], (CommonInputView) objArr[3], (CommonInputView) objArr[2]);
        this.ShareDataUIState = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.copydefault = linearLayout;
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
        int i4 = copy + 69;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 67;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 75;
        getRequestBeneficiariesState = i3 % 128;
        return true ^ (i3 % 2 == 0);
    }
}
