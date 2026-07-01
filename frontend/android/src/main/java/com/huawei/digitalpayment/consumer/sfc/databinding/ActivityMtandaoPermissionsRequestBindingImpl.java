package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityMtandaoPermissionsRequestBindingImpl extends ActivityMtandaoPermissionsRequestBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component4 = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout ShareDataUIState;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.imgNetwork, 1);
        sparseIntArray.put(R.id.cardMain, 2);
        sparseIntArray.put(R.id.tvHeader, 3);
        sparseIntArray.put(R.id.tvDescription, 4);
        sparseIntArray.put(R.id.cardNetwork, 5);
        sparseIntArray.put(R.id.cardLocation, 6);
        sparseIntArray.put(R.id.tvOptOut, 7);
        sparseIntArray.put(R.id.tvPolicy, 8);
        sparseIntArray.put(R.id.btnLayout, 9);
        sparseIntArray.put(R.id.btnDeny, 10);
        sparseIntArray.put(R.id.btnAllow, 11);
        int i = component1 + 103;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    public ActivityMtandaoPermissionsRequestBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, component2, copydefault));
    }

    private ActivityMtandaoPermissionsRequestBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundTextView) objArr[11], (RoundTextView) objArr[10], (LinearLayout) objArr[9], (MaterialCardView) objArr[6], (MaterialCardView) objArr[2], (MaterialCardView) objArr[5], (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[8]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = equals + 69;
        int i5 = i4 % 128;
        component4 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 3;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 9;
        int i4 = i3 % 128;
        component4 = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 11;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }
}
