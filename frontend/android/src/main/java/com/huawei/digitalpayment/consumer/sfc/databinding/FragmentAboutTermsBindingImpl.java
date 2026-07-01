package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class FragmentAboutTermsBindingImpl extends FragmentAboutTermsBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long component1;
    private final LinearLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.cdBack, 1);
        sparseIntArray.put(R.id.ivBack, 2);
        sparseIntArray.put(R.id.tv_top_title, 3);
        sparseIntArray.put(R.id.rlContainer, 4);
        int i = getAsAtTimestamp + 29;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentAboutTermsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, component3, ShareDataUIState));
    }

    private FragmentAboutTermsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (MaterialCardView) objArr[1], (ImageView) objArr[2], (FrameLayout) objArr[4], (TextView) objArr[3]);
        this.component1 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
        linearLayout.setTag(null);
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
        int i5 = i4 + 47;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 119;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 19;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 107;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 7 / 0;
        }
        return true;
    }
}
