package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySfcRoamingInternationalCategoryBindingImpl extends ActivitySfcRoamingInternationalCategoryBinding {
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final ConstraintLayout component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.rl_bundle_container, 4);
        sparseIntArray.put(R.id.iv_bundle, 5);
        sparseIntArray.put(R.id.ll_container, 6);
        sparseIntArray.put(R.id.tv_bundle_title, 7);
        sparseIntArray.put(R.id.tv_bundle_des, 8);
        sparseIntArray.put(R.id.rvCategory, 9);
        sparseIntArray.put(R.id.rv_bundles, 10);
        int i = component3 + 63;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivitySfcRoamingInternationalCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, copydefault, component2));
    }

    private ActivitySfcRoamingInternationalCategoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[2], (ImageView) objArr[5], (LinearLayout) objArr[6], (RoundConstraintLayout) objArr[4], (RecyclerView) objArr[10], (RecyclerView) objArr[9], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[3], (View) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 113;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 39;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 19;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 75;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
