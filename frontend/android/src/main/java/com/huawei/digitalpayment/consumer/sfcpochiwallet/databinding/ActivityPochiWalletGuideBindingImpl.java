package com.huawei.digitalpayment.consumer.sfcpochiwallet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.sfcpochiwallet.R;

public class ActivityPochiWalletGuideBindingImpl extends ActivityPochiWalletGuideBinding {
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long ShareDataUIState;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.iv_image, 2);
        sparseIntArray.put(R.id.tv_content_tips, 3);
        sparseIntArray.put(R.id.tv_terms_tips, 4);
        sparseIntArray.put(R.id.btn_confirm, 5);
        int i = component4 + 113;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    public ActivityPochiWalletGuideBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, component1));
    }

    private ActivityPochiWalletGuideBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[5], (ImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1]);
        this.ShareDataUIState = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
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
        int i4 = getAsAtTimestamp + 51;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 13;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 119;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 43;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
