package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentSupportBindingImpl extends FragmentSupportBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp;
    private final LinearLayout ShareDataUIState;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.cvBack, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tv_top_title, 3);
        sparseIntArray.put(R.id.rvSupport, 4);
        int i = component2 + 103;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 99 / 0;
        }
    }

    public FragmentSupportBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component1, copydefault));
    }

    private FragmentSupportBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (MaterialCardView) objArr[1], (ImageView) objArr[2], (RecyclerView) objArr[4], (TextView) objArr[3]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.ShareDataUIState = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component3 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4 + 17;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 117;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 55;
        getAsAtTimestamp = i3 % 128;
        return i3 % 2 == 0;
    }
}
