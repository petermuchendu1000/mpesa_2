package com.huawei.digitalpayment.consumer.login.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.login.R;

public class ActivityTermsAndConditionBindingImpl extends ActivityTermsAndConditionBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_back, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.iv_terms, 3);
        sparseIntArray.put(R.id.tv_terms_tips, 4);
        sparseIntArray.put(R.id.btn_confirm, 5);
        int i = component1 + 33;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public ActivityTermsAndConditionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component3, ShareDataUIState));
    }

    private ActivityTermsAndConditionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[5], (RoundImageView) objArr[1], (ImageView) objArr[3], (TextView) objArr[4], (TextView) objArr[2]);
        this.copydefault = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = component4 + 39;
        getAsAtTimestamp = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 25;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 83;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
