package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ActivityChangeSkinBindingImpl extends ActivityChangeSkinBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component2 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int copy = 1;
    private static int equals;
    private long component1;
    private final ConstraintLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.llTop, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.constraintLayout, 4);
        sparseIntArray.put(R.id.cycleViewPager, 5);
        sparseIntArray.put(R.id.cycleIndicator, 6);
        sparseIntArray.put(R.id.btn_confirm, 7);
        int i = component2 + 103;
        copy = i % 128;
        int i2 = i % 2;
    }

    public ActivityChangeSkinBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, ShareDataUIState, component3));
    }

    private ActivityChangeSkinBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LoadingButton) objArr[7], (ConstraintLayout) objArr[4], (LinearLayout) objArr[6], (ViewPager) objArr[5], (ImageView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[3]);
        this.component1 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.copydefault = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = component4 + 109;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 61;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 19;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
