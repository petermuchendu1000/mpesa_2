package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityGuideItemBindingImpl extends ActivityGuideItemBinding {
    private static int ShareDataUIState = 1;
    private static final SparseIntArray component1;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int component3 = 0;
    private static int copy = 0;
    private static int equals = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.iv_guide_image, 1);
        sparseIntArray.put(R.id.iv_guide_text, 2);
        sparseIntArray.put(R.id.guideline_left, 3);
        sparseIntArray.put(R.id.guideline_right, 4);
        sparseIntArray.put(R.id.guideline_top, 5);
        int i = ShareDataUIState + 109;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityGuideItemBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, component2, component1));
    }

    private ActivityGuideItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (Guideline) objArr[3], (Guideline) objArr[4], (Guideline) objArr[5], (ImageView) objArr[1], (ImageView) objArr[2]);
        this.copydefault = -1L;
        this.content.setTag(null);
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
        int i4 = equals;
        int i5 = i4 + 99;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 63;
        copy = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 117;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 55;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
