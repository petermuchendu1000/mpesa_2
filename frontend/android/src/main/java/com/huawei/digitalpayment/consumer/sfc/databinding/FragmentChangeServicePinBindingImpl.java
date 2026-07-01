package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentChangeServicePinBindingImpl extends FragmentChangeServicePinBinding {
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp;
    private final ConstraintLayout ShareDataUIState;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.top_container, 1);
        sparseIntArray.put(R.id.rl_bundle_container, 2);
        sparseIntArray.put(R.id.iv_bundle, 3);
        sparseIntArray.put(R.id.csEasyTalk, 4);
        sparseIntArray.put(R.id.tv_bundle_title, 5);
        sparseIntArray.put(R.id.tv_bundle_desc, 6);
        sparseIntArray.put(R.id.input_id_passport, 7);
        sparseIntArray.put(R.id.tv_id_passport_error, 8);
        sparseIntArray.put(R.id.input_new_pin, 9);
        sparseIntArray.put(R.id.tv_new_pin_error, 10);
        sparseIntArray.put(R.id.input_confirm_new_pin, 11);
        sparseIntArray.put(R.id.tv_confirm_new_pin_error, 12);
        sparseIntArray.put(R.id.btn_set_pin, 13);
        int i = component1 + 121;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    public FragmentChangeServicePinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 14, component3, copydefault));
    }

    private FragmentChangeServicePinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[13], (ConstraintLayout) objArr[4], (PinInputView) objArr[11], (CommonInputView) objArr[7], (PinInputView) objArr[9], (ImageView) objArr[3], (RoundConstraintLayout) objArr[2], (ConstraintLayout) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[12], (TextView) objArr[8], (TextView) objArr[10]);
        this.component2 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ShareDataUIState = constraintLayout;
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
        int i4 = getAsAtTimestamp + 113;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 57;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 == 0;
    }
}
