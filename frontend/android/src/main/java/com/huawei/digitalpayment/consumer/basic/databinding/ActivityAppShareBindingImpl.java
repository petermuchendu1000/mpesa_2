package com.huawei.digitalpayment.consumer.basic.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.huawei.digitalpayment.consumer.basic.R;

public class ActivityAppShareBindingImpl extends ActivityAppShareBinding {
    private static final SparseIntArray ShareDataUIState;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private long component1;
    private final LinearLayout component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.shareByMessage, 1);
        sparseIntArray.put(R.id.icon_bg_1, 2);
        sparseIntArray.put(R.id.arrow_1, 3);
        sparseIntArray.put(R.id.shareToOtherApp, 4);
        sparseIntArray.put(R.id.icon_bg_2, 5);
        sparseIntArray.put(R.id.arrow_2, 6);
        int i = copydefault + 65;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public ActivityAppShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component2, ShareDataUIState));
    }

    private ActivityAppShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (ImageView) objArr[6], (View) objArr[2], (View) objArr[5], (MaterialCardView) objArr[1], (MaterialCardView) objArr[4]);
        this.component1 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component3 = linearLayout;
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
        int i4 = equals + 49;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 27;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 25;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 31;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return true;
    }
}
