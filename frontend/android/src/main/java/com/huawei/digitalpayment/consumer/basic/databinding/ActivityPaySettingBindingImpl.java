package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityPaySettingBindingImpl extends ActivityPaySettingBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final LinearLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.cl_none, 1);
        sparseIntArray.put(R.id.tv_none, 2);
        sparseIntArray.put(R.id.cb_none, 3);
        sparseIntArray.put(R.id.line_face_payment, 4);
        sparseIntArray.put(R.id.cl_face_payment, 5);
        sparseIntArray.put(R.id.tv_face_payment, 6);
        sparseIntArray.put(R.id.cb_face_payment, 7);
        sparseIntArray.put(R.id.line_fingerprint_payment, 8);
        sparseIntArray.put(R.id.cl_fingerprint_payment, 9);
        sparseIntArray.put(R.id.tv_fingerprint_payment, 10);
        sparseIntArray.put(R.id.cb_fingerprint_payment, 11);
        int i = copy + 47;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ActivityPaySettingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, ShareDataUIState, component1));
    }

    private ActivityPaySettingBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (SingleRadioButton) objArr[7], (SingleRadioButton) objArr[11], (SingleRadioButton) objArr[3], (RoundConstraintLayout) objArr[5], (RoundConstraintLayout) objArr[9], (RoundConstraintLayout) objArr[1], (View) objArr[4], (View) objArr[8], (TextView) objArr[6], (TextView) objArr[10], (TextView) objArr[2]);
        this.copydefault = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
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
        int i4 = getAsAtTimestamp;
        int i5 = i4 + 119;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 65;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 41 / 0;
        }
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 3;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 31;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
