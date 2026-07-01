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

public class ActivityMtandaoReportSuccessBindingImpl extends ActivityMtandaoReportSuccessBinding {
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final ConstraintLayout component1;

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
        int i = copydefault + 123;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public ActivityMtandaoReportSuccessBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, component3, component2));
    }

    private ActivityMtandaoReportSuccessBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[6], (ImageView) objArr[8], (RoundImageView) objArr[1], (CardView) objArr[2], (RoundConstraintLayout) objArr[3], (ConstraintLayout) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 89;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 23;
        getAsAtTimestamp = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 2 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 31;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 75;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
