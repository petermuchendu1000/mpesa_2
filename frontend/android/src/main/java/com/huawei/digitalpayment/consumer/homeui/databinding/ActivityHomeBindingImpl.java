package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ActivityHomeBindingImpl extends ActivityHomeBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final LinearLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.viewPager2, 1);
        sparseIntArray.put(R.id.llNavigationParent, 2);
        sparseIntArray.put(R.id.llNavigationBg, 3);
        sparseIntArray.put(R.id.llNavigation, 4);
        int i = equals + 41;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ActivityHomeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ShareDataUIState, component2));
    }

    private ActivityHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[4], (ImageView) objArr[3], (CardView) objArr[2], (ViewPager2) objArr[1]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = copy + 3;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 11;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 53;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 97;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
