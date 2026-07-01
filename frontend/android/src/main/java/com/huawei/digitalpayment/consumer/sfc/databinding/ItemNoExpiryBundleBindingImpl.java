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

public class ItemNoExpiryBundleBindingImpl extends ItemNoExpiryBundleBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 0;
    private static final SparseIntArray component3;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;
    private long component2;
    private final FrameLayout copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.cv_root, 1);
        sparseIntArray.put(R.id.iv_bundle, 2);
        sparseIntArray.put(R.id.ll_container, 3);
        sparseIntArray.put(R.id.tv_bundle_title, 4);
        sparseIntArray.put(R.id.tv_bundle_amount, 5);
        sparseIntArray.put(R.id.tv_buy, 6);
        int i = copy + 97;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ItemNoExpiryBundleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, ShareDataUIState, component3));
    }

    private ItemNoExpiryBundleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1], (ImageView) objArr[2], (LinearLayout) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (RoundTextView) objArr[6]);
        this.component2 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.copydefault = frameLayout;
        frameLayout.setTag(null);
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
        int i4 = component4;
        int i5 = i4 + 71;
        getAsAtTimestamp = i5 % 128;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 55;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 93;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 111;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
