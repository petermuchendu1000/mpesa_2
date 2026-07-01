package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentSfcProfileBindingImpl extends FragmentSfcProfileBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static final SparseIntArray component1;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final LinearLayout component2;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.rl_root, 1);
        sparseIntArray.put(R.id.profileTutorialWrapper, 2);
        sparseIntArray.put(R.id.iv_avatar, 3);
        sparseIntArray.put(R.id.cardAbbr, 4);
        sparseIntArray.put(R.id.tvAbbr, 5);
        sparseIntArray.put(R.id.iv_turn_bottom, 6);
        sparseIntArray.put(R.id.tv_time, 7);
        sparseIntArray.put(R.id.tv_name, 8);
        sparseIntArray.put(R.id.card_search, 9);
        sparseIntArray.put(R.id.iv_search, 10);
        sparseIntArray.put(R.id.card_notification, 11);
        sparseIntArray.put(R.id.iv_notification, 12);
        sparseIntArray.put(R.id.iv_notification_badge, 13);
        int i = copydefault + 15;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
    }

    public FragmentSfcProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 14, ShareDataUIState, component1));
    }

    private FragmentSfcProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[4], (CardView) objArr[11], (CardView) objArr[9], (RoundImageView) objArr[3], (ImageView) objArr[12], (ImageView) objArr[13], (ImageView) objArr[10], (ImageView) objArr[6], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[1], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[7]);
        this.component3 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.component2 = linearLayout;
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
        int i4 = equals + 3;
        int i5 = i4 % 128;
        getAsAtTimestamp = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 63;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 125;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 57;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }
}
