package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityMtandaoPermissionsDeniedBindingImpl extends ActivityMtandaoPermissionsDeniedBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_delete, 1);
        sparseIntArray.put(R.id.rl_container, 2);
        sparseIntArray.put(R.id.rl_container_inside, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_tips, 5);
        sparseIntArray.put(R.id.btn_done, 6);
        sparseIntArray.put(R.id.tv_avatar, 7);
        sparseIntArray.put(R.id.imageView3, 8);
        int i = component3 + 31;
        component4 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivityMtandaoPermissionsDeniedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, ShareDataUIState, component2));
    }

    private ActivityMtandaoPermissionsDeniedBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[6], (ImageView) objArr[8], (RoundImageView) objArr[1], (CardView) objArr[2], (RoundConstraintLayout) objArr[3], (ConstraintLayout) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
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
        int i4 = getRequestBeneficiariesState + 125;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 61;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
