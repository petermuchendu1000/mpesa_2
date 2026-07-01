package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentUserinfoTemplate2BindingImpl extends FragmentUserinfoTemplate2Binding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component1 = 1;
    private static final SparseIntArray component2;
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private long component3;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.background, 1);
        sparseIntArray.put(R.id.iv_avatar, 2);
        sparseIntArray.put(R.id.tv_name, 3);
        sparseIntArray.put(R.id.tv_phone, 4);
        sparseIntArray.put(R.id.tv_profile, 5);
        sparseIntArray.put(R.id.line, 6);
        sparseIntArray.put(R.id.tv_level, 7);
        sparseIntArray.put(R.id.tv_my_loyalty, 8);
        sparseIntArray.put(R.id.tv_my_coupons, 9);
        sparseIntArray.put(R.id.tv_level_num, 10);
        sparseIntArray.put(R.id.tv_my_loyalty_num, 11);
        sparseIntArray.put(R.id.tv_my_coupons_num, 12);
        int i = component1 + 61;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public FragmentUserinfoTemplate2BindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, ShareDataUIState, component2));
    }

    private FragmentUserinfoTemplate2BindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RoundImageView) objArr[1], (RoundImageView) objArr[2], (View) objArr[6], (RoundConstraintLayout) objArr[0], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[12], (TextView) objArr[8], (TextView) objArr[11], (TextView) objArr[3], (TextView) objArr[4], (RoundTextView) objArr[5]);
        this.component3 = -1L;
        this.root.setTag(null);
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
        int i4 = getRequestBeneficiariesState + 23;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 != 0;
        int i6 = i5 + 69;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 27;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 39;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }
}
