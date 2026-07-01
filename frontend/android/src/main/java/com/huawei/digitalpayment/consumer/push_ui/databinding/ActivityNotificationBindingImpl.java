package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.common.widget.tab.CommonTabView;
import com.huawei.digitalpayment.consumer.push_ui.R;

public class ActivityNotificationBindingImpl extends ActivityNotificationBinding {
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final LinearLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tabLayout, 1);
        sparseIntArray.put(R.id.viewPager, 2);
        int i = getRequestBeneficiariesState + 33;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ActivityNotificationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, component2, copydefault));
    }

    private ActivityNotificationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonTabView) objArr[1], (ViewPager2) objArr[2]);
        this.ShareDataUIState = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
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
        int i4 = getAsAtTimestamp + 67;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 91;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 97 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 65;
        int i4 = i3 % 128;
        equals = i4;
        boolean z = !(i3 % 2 == 0);
        int i5 = i4 + 17;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
