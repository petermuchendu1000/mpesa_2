package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class LayoutProfileCardBindingImpl extends LayoutProfileCardBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static int copydefault = 1;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.csProfPic, 1);
        sparseIntArray.put(R.id.imgProfPic, 2);
        sparseIntArray.put(R.id.cardEditProfilePic, 3);
        sparseIntArray.put(R.id.iv_turn_bottom, 4);
        sparseIntArray.put(R.id.cardAbbr, 5);
        sparseIntArray.put(R.id.tvAbbr, 6);
        sparseIntArray.put(R.id.consNamesEmail, 7);
        sparseIntArray.put(R.id.txNames, 8);
        sparseIntArray.put(R.id.txEmail, 9);
        sparseIntArray.put(R.id.csDetails, 10);
        sparseIntArray.put(R.id.consPhone, 11);
        sparseIntArray.put(R.id.txLabelPhoneNo, 12);
        sparseIntArray.put(R.id.txPhoneNo, 13);
        sparseIntArray.put(R.id.consStatus, 14);
        sparseIntArray.put(R.id.txLabelStatus, 15);
        sparseIntArray.put(R.id.txStatus, 16);
        sparseIntArray.put(R.id.consTariff, 17);
        sparseIntArray.put(R.id.txLabelTariff, 18);
        sparseIntArray.put(R.id.txTariff, 19);
        int i = ShareDataUIState + 5;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public LayoutProfileCardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 20, component1, component3));
    }

    private LayoutProfileCardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[5], (MaterialCardView) objArr[0], (CardView) objArr[3], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[14], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[1], (RoundImageView) objArr[2], (RoundImageView) objArr[4], (TextView) objArr[6], (TextView) objArr[9], (TextView) objArr[12], (TextView) objArr[15], (TextView) objArr[18], (TextView) objArr[8], (TextView) objArr[13], (TextView) objArr[16], (TextView) objArr[19]);
        this.component2 = -1L;
        this.cardAccountInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component2 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component2 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 107;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 81;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 63 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy + 47;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 89;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
