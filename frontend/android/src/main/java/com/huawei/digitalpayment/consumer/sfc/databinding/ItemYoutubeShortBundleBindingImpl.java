package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;

public class ItemYoutubeShortBundleBindingImpl extends ItemYoutubeShortBundleBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component2 = 0;
    private static int component4 = 1;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.rl_banner_tab, 1);
        sparseIntArray.put(R.id.cv_root, 2);
        sparseIntArray.put(R.id.rl_bundle_container, 3);
        sparseIntArray.put(R.id.iv_bundle, 4);
        sparseIntArray.put(R.id.csLabels, 5);
        sparseIntArray.put(R.id.tv_bundle_title, 6);
        sparseIntArray.put(R.id.tv_bundle_valid_time, 7);
        sparseIntArray.put(R.id.tv_buy, 8);
        int i = getRequestBeneficiariesState + 19;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ItemYoutubeShortBundleBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, ShareDataUIState, copydefault));
    }

    private ItemYoutubeShortBundleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[5], (CardView) objArr[2], (ImageView) objArr[4], (RoundConstraintLayout) objArr[1], (RoundConstraintLayout) objArr[3], (TextView) objArr[6], (TextView) objArr[7], (RoundTextView) objArr[8]);
        this.component3 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
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
        int i4 = component4 + 61;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 91;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 43;
        component4 = i3 % 128;
        return i3 % 2 != 0;
    }
}
