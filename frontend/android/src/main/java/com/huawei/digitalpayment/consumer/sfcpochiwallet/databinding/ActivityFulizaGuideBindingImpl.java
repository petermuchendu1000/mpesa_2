package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public class ActivityFulizaGuideBindingImpl extends ActivityFulizaGuideBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.iv_image_guide, 3);
        sparseIntArray.put(R.id.tv_guide_title, 4);
        sparseIntArray.put(R.id.tv_guide_tips, 5);
        sparseIntArray.put(R.id.tv_terms_tips, 6);
        sparseIntArray.put(R.id.btn_confirm, 7);
        int i = getRequestBeneficiariesState + 107;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivityFulizaGuideBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, ShareDataUIState, component2));
    }

    private ActivityFulizaGuideBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (RoundImageView) objArr[1], (ImageView) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[2]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
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
        int i4 = equals + 21;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 21;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 13;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
