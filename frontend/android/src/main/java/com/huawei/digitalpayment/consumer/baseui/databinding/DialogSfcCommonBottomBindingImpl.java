package com.huawei.digitalpayment.consumer.baseui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baseui.R;

public class DialogSfcCommonBottomBindingImpl extends DialogSfcCommonBottomBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int component3 = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static int equals;
    private final RoundConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_top_bg, 1);
        sparseIntArray.put(R.id.bottom_sheet_header, 2);
        sparseIntArray.put(R.id.ivBack, 3);
        sparseIntArray.put(R.id.tv_title, 4);
        sparseIntArray.put(R.id.tv_tips_content, 5);
        sparseIntArray.put(R.id.tv_left_button, 6);
        sparseIntArray.put(R.id.tv_right_button, 7);
        int i = copy + 119;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public DialogSfcCommonBottomBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, ShareDataUIState, component1));
    }

    private DialogSfcCommonBottomBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (ImageView) objArr[3], (ImageView) objArr[1], (TextView) objArr[6], (RoundTextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
        this.copydefault = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component2 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = component4 + 119;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 23;
        equals = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 53;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
