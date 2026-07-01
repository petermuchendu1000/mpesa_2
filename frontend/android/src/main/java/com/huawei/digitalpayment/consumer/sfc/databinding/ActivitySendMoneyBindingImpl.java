package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySendMoneyBindingImpl extends ActivitySendMoneyBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout component3;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.composeTabs, 1);
        sparseIntArray.put(R.id.viewPager, 2);
        int i = component2 + 31;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivitySendMoneyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component1, ShareDataUIState));
    }

    private ActivitySendMoneyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[1], (ViewPager2) objArr[2]);
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
        int i4 = equals + 119;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 49;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 9;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
