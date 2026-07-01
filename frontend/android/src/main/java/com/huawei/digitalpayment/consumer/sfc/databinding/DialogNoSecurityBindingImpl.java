package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class DialogNoSecurityBindingImpl extends DialogNoSecurityBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component2;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final RoundConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.iv_top_bg, 1);
        sparseIntArray.put(R.id.iv_delete, 2);
        sparseIntArray.put(R.id.iv_pin_locked, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_tips_content, 5);
        sparseIntArray.put(R.id.tv_positive_button, 6);
        int i = component4 + 109;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public DialogNoSecurityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component2));
    }

    private DialogNoSecurityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[2], (ImageView) objArr[3], (RoundImageView) objArr[1], (RoundTextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4]);
        this.component1 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component3 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 7;
        equals = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 65;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 123;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 97;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
