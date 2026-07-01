package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.subsui.R;

public class ItemMySubscriptionBindingImpl extends ItemMySubscriptionBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final FrameLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.cv_root, 1);
        sparseIntArray.put(R.id.iv_bundle, 2);
        sparseIntArray.put(R.id.ll_container, 3);
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.tvDesc, 5);
        sparseIntArray.put(R.id.tv_buy, 6);
        int i = getAsAtTimestamp + 95;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ItemMySubscriptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component3, ShareDataUIState));
    }

    private ItemMySubscriptionBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1], (ImageView) objArr[2], (LinearLayout) objArr[3], (ImageView) objArr[6], (TextView) objArr[5], (TextView) objArr[4]);
        this.copydefault = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.component2 = frameLayout;
        frameLayout.setTag(null);
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
        int i4 = component4 + 19;
        getRequestBeneficiariesState = i4 % 128;
        return i4 % 2 != 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 23;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
