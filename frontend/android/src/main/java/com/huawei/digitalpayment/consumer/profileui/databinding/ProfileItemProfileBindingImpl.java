package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.profileui.R;

public class ProfileItemProfileBindingImpl extends ProfileItemProfileBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component1 = 1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copydefault;
    private static int equals;
    private long component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.ll_layout, 1);
        sparseIntArray.put(R.id.profiles_name, 2);
        sparseIntArray.put(R.id.cl_profiles_value, 3);
        sparseIntArray.put(R.id.profiles_value, 4);
        sparseIntArray.put(R.id.profiles_img, 5);
        sparseIntArray.put(R.id.iv_edit_more, 6);
        int i = copydefault + 59;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ProfileItemProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component3, ShareDataUIState));
    }

    private ProfileItemProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[0], (ImageView) objArr[6], (ConstraintLayout) objArr[1], (RoundImageView) objArr[5], (TextView) objArr[2], (TextView) objArr[4]);
        this.component2 = -1L;
        this.itemView.setTag(null);
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
        int i5 = i4 + 65;
        equals = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 83;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 11;
        int i4 = i3 % 128;
        component4 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
