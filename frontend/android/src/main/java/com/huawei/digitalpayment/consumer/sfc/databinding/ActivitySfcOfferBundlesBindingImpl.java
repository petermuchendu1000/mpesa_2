package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySfcOfferBundlesBindingImpl extends ActivitySfcOfferBundlesBinding {
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int getAsAtTimestamp;
    private long ShareDataUIState;
    private final ConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.rv_offer_categories, 3);
        sparseIntArray.put(R.id.tv_rv_title, 4);
        sparseIntArray.put(R.id.rv_bundles, 5);
        sparseIntArray.put(R.id.tv_rv_fresh_friday, 6);
        sparseIntArray.put(R.id.cv_fresh_friday, 7);
        int i = copy + 65;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivitySfcOfferBundlesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, copydefault, component3));
    }

    private ActivitySfcOfferBundlesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[7], (RoundImageView) objArr[1], (RecyclerView) objArr[5], (RecyclerView) objArr[3], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[2]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
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
        int i4 = getAsAtTimestamp + 77;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 47;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 65;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
