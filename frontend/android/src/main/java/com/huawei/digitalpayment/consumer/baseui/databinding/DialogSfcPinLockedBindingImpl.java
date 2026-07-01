package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baseui.R;

public class DialogSfcPinLockedBindingImpl extends DialogSfcPinLockedBinding {
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 1;
    private static final ViewDataBinding.IncludedLayouts copydefault = null;
    private static int equals;
    private long ShareDataUIState;
    private final RoundConstraintLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.iv_top_bg, 1);
        sparseIntArray.put(R.id.iv_delete, 2);
        sparseIntArray.put(R.id.iv_pin_locked, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_tips_content, 5);
        sparseIntArray.put(R.id.tv_positive_button, 6);
        sparseIntArray.put(R.id.tvForgotPin, 7);
        int i = component4 + 25;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public DialogSfcPinLockedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, copydefault, component3));
    }

    private DialogSfcPinLockedBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[2], (ImageView) objArr[3], (RoundImageView) objArr[1], (RoundTextView) objArr[7], (RoundTextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4]);
        this.ShareDataUIState = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component2 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = equals + 87;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 35;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
        return true;
    }
}
