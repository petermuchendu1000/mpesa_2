package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemDiyBundleBindingImpl extends ItemDiyBundleBinding {
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int copy = 1;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private long ShareDataUIState;
    private final FrameLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.cv_root, 1);
        sparseIntArray.put(R.id.iv_bundle, 2);
        sparseIntArray.put(R.id.ll_container, 3);
        sparseIntArray.put(R.id.tv_bundle_title, 4);
        sparseIntArray.put(R.id.tv_bundle_amount, 5);
        sparseIntArray.put(R.id.tv_buy, 6);
        int i = copydefault + 71;
        copy = i % 128;
        int i2 = i % 2;
    }

    public ItemDiyBundleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component1, component3));
    }

    private ItemDiyBundleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1], (ImageView) objArr[2], (LinearLayout) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (RoundTextView) objArr[6]);
        this.ShareDataUIState = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.component2 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ShareDataUIState != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.ShareDataUIState = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 47;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 51;
        getAsAtTimestamp = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 49;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 89;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
