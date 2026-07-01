package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ActivityAddFavouriteFriendBindingImpl extends ActivityAddFavouriteFriendBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component4 = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component2;
    private final ConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.view_bg, 1);
        sparseIntArray.put(R.id.iv_back, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.tv_tips, 4);
        sparseIntArray.put(R.id.input_phone_number, 5);
        sparseIntArray.put(R.id.input_account_number, 6);
        sparseIntArray.put(R.id.barrier, 7);
        sparseIntArray.put(R.id.input_name, 8);
        sparseIntArray.put(R.id.tv_input_name_tips, 9);
        sparseIntArray.put(R.id.btn_confirm, 10);
        int i = component4 + 17;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public ActivityAddFavouriteFriendBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, component1, copydefault));
    }

    private ActivityAddFavouriteFriendBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[7], (LoadingButton) objArr[10], (CommonInputView) objArr[6], (CommonInputView) objArr[8], (CommonInputView) objArr[5], (RoundImageView) objArr[2], (TextView) objArr[9], (TextView) objArr[4], (TextView) objArr[3], (View) objArr[1]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component3 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 71;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 25;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 3;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 81;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
