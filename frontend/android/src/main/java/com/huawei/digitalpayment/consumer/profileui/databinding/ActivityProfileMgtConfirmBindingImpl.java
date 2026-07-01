package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.profileui.R;

public class ActivityProfileMgtConfirmBindingImpl extends ActivityProfileMgtConfirmBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final ConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.im_head, 1);
        sparseIntArray.put(R.id.tv_no, 2);
        sparseIntArray.put(R.id.tv_nickname, 3);
        sparseIntArray.put(R.id.recycleview, 4);
        sparseIntArray.put(R.id.tv_agreement, 5);
        sparseIntArray.put(R.id.lb_confirm, 6);
        int i = copydefault + 71;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivityProfileMgtConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component3, ShareDataUIState));
    }

    private ActivityProfileMgtConfirmBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (LoadingButton) objArr[6], (RecyclerView) objArr[4], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[2]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
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
        int i4 = component4;
        int i5 = i4 + 85;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 11;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 123;
        component4 = i3 % 128;
        return i3 % 2 != 0;
    }
}
