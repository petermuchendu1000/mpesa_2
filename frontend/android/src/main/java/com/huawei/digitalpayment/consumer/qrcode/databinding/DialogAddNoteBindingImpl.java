package com.huawei.digitalpayment.consumer.qrcode.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class DialogAddNoteBindingImpl extends DialogAddNoteBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component4 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private long component2;
    private final RoundConstraintLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.tv_tips_title, 1);
        sparseIntArray.put(R.id.edt_tips_content, 2);
        sparseIntArray.put(R.id.view_divider, 3);
        sparseIntArray.put(R.id.tv_left_button, 4);
        sparseIntArray.put(R.id.tv_right_button, 5);
        int i = component4 + 51;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DialogAddNoteBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component1, copydefault));
    }

    private DialogAddNoteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CommonInputView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[1], (View) objArr[3]);
        this.component2 = -1L;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) objArr[0];
        this.component3 = roundConstraintLayout;
        roundConstraintLayout.setTag(null);
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
        int i4 = equals + 107;
        int i5 = i4 % 128;
        copy = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 29;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 99;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 105;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
