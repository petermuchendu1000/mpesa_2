package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class ItemHomeBannerBindingImpl extends ItemHomeBannerBinding {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static final ViewDataBinding.IncludedLayouts component2 = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int getRequestBeneficiariesState;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.background, 1);
        sparseIntArray.put(R.id.bannerView, 2);
        sparseIntArray.put(R.id.fcTop, 3);
        int i = ShareDataUIState + 13;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ItemHomeBannerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 4, component2, component3));
    }

    private ItemHomeBannerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (BannerView) objArr[2], (FragmentContainerView) objArr[3], (RoundConstraintLayout) objArr[0]);
        this.copydefault = -1L;
        this.root.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 55;
        component4 = i4 % 128;
        return i4 % 2 == 0;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 79;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
