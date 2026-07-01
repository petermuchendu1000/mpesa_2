package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivitySfcEasyTalkBundlesBindingImpl extends ActivitySfcEasyTalkBundlesBinding {
    private static int component2 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final ConstraintLayout ShareDataUIState;
    private long component1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.rl_bundle_container, 4);
        sparseIntArray.put(R.id.iv_bundle, 5);
        sparseIntArray.put(R.id.csEasyTalk, 6);
        sparseIntArray.put(R.id.tv_bundle_title, 7);
        sparseIntArray.put(R.id.tv_bundle_desc, 8);
        sparseIntArray.put(R.id.rvCategory, 9);
        sparseIntArray.put(R.id.rv_bundles, 10);
        int i = equals + 71;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    public ActivitySfcEasyTalkBundlesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, component3, copydefault));
    }

    private ActivitySfcEasyTalkBundlesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[6], (RoundImageView) objArr[2], (ImageView) objArr[5], (RoundConstraintLayout) objArr[4], (RecyclerView) objArr[10], (RecyclerView) objArr[9], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[3], (View) objArr[1]);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 57;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 45;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 77 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 91;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
