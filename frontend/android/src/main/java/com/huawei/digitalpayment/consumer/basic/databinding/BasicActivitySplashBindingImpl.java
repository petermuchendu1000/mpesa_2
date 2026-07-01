package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.basic.R;
import pl.droidsonroids.gif.GifImageView;

public class BasicActivitySplashBindingImpl extends BasicActivitySplashBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.iv_logo, 1);
        sparseIntArray.put(R.id.iv_splash, 2);
        sparseIntArray.put(R.id.btnSkip, 3);
        int i = component3 + 79;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public BasicActivitySplashBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component1, ShareDataUIState));
    }

    private BasicActivitySplashBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[3], (GifImageView) objArr[1], (ImageView) objArr[2], (ConstraintLayout) objArr[0]);
        this.copydefault = -1L;
        this.splashRl.setTag(null);
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
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 125;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 125;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 65;
        component4 = i4 % 128;
        boolean z = i4 % 2 == 0;
        int i5 = i3 + 81;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
