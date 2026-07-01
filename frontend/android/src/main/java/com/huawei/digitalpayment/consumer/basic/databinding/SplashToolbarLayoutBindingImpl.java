package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;

public class SplashToolbarLayoutBindingImpl extends SplashToolbarLayoutBinding {
    private static int ShareDataUIState = 0;
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout component1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.root, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.llLanguage, 4);
        sparseIntArray.put(R.id.tvLanguage, 5);
        sparseIntArray.put(R.id.llSkip, 6);
        sparseIntArray.put(R.id.tvSkip, 7);
        int i = ShareDataUIState + 43;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public SplashToolbarLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component3, component2));
    }

    private SplashToolbarLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (LinearLayout) objArr[4], (LinearLayout) objArr[6], (ConstraintLayout) objArr[1], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[3]);
        this.copydefault = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component1 = linearLayout;
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
        int i4 = copy;
        int i5 = i4 + 113;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 43;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 79;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 65;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
