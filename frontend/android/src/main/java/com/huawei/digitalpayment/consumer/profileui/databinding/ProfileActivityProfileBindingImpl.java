package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.profileui.BR;
import com.huawei.digitalpayment.consumer.profileui.R;

public class ProfileActivityProfileBindingImpl extends ProfileActivityProfileBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState;
    private static int component4 = 1;
    private static int copy = 0;
    private static final SparseIntArray copydefault;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final NestedScrollView component1;
    private final RoundLinearLayout component2;
    private long component3;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        ShareDataUIState = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"profile_item_profile"}, new int[]{2}, new int[]{R.layout.profile_item_profile});
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.profilesRecycler, 3);
        sparseIntArray.put(R.id.profilesList, 4);
        int i = component4 + 123;
        copy = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    public ProfileActivityProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 5, ShareDataUIState, copydefault));
    }

    private ProfileActivityProfileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ProfileItemProfileBinding) objArr[2], (RoundRecyclerView) objArr[4], (RoundRecyclerView) objArr[3]);
        this.component3 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.component1 = nestedScrollView;
        nestedScrollView.setTag(null);
        RoundLinearLayout roundLinearLayout = (RoundLinearLayout) objArr[1];
        this.component2 = roundLinearLayout;
        roundLinearLayout.setTag(null);
        setContainedBinding(this.profilemgt);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component3 = 2L;
        }
        this.profilemgt.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.component3 != 0) {
                return true;
            }
            return this.profilemgt.hasPendingBindings();
        }
    }

    @Override
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            super.setLifecycleOwner(lifecycleOwner);
            this.profilemgt.setLifecycleOwner(lifecycleOwner);
            int i3 = getAsAtTimestamp + 121;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.setLifecycleOwner(lifecycleOwner);
        this.profilemgt.setLifecycleOwner(lifecycleOwner);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        if (i != 0) {
            int i4 = getAsAtTimestamp + 49;
            getRequestBeneficiariesState = i4 % 128;
            return i4 % 2 == 0;
        }
        boolean zComponent1 = component1((ProfileItemProfileBinding) obj, i2);
        int i5 = getAsAtTimestamp + 57;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return zComponent1;
    }

    private boolean component1(ProfileItemProfileBinding profileItemProfileBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.component3 |= 1;
        }
        return true;
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component3 = 0L;
        }
        executeBindingsOn(this.profilemgt);
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 31;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 91;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
