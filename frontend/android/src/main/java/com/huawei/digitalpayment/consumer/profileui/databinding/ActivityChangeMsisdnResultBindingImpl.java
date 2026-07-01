package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.profileui.R;

public class ActivityChangeMsisdnResultBindingImpl extends ActivityChangeMsisdnResultBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.ivSuccess, 1);
        sparseIntArray.put(R.id.btn_next, 2);
        int i = getRequestBeneficiariesState + 21;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ActivityChangeMsisdnResultBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, ShareDataUIState, component3));
    }

    private ActivityChangeMsisdnResultBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[2], (ImageView) objArr[1]);
        this.copydefault = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
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
        int i4 = component4;
        int i5 = i4 + 109;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 15;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 9;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 77;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
