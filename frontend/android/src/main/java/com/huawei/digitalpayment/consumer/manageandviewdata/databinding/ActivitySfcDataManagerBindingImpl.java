package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.manageandviewdata.BR;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public class ActivitySfcDataManagerBindingImpl extends ActivitySfcDataManagerBinding {
    private static final SparseIntArray ShareDataUIState;
    private static int component3 = 0;
    private static int component4 = 0;
    private static final ViewDataBinding.IncludedLayouts copydefault;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component1;
    private long component2;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        copydefault = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_data_usage_item", "layout_data_usage_item", "layout_data_usage_item"}, new int[]{2, 3, 4}, new int[]{R.layout.layout_data_usage_item, R.layout.layout_data_usage_item, R.layout.layout_data_usage_item});
        SparseIntArray sparseIntArray = new SparseIntArray();
        ShareDataUIState = sparseIntArray;
        sparseIntArray.put(R.id.csTitleBack, 5);
        sparseIntArray.put(R.id.iv_back, 6);
        sparseIntArray.put(R.id.tv_top_title, 7);
        int i = getRequestBeneficiariesState + 3;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public ActivitySfcDataManagerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, copydefault, ShareDataUIState));
    }

    private ActivitySfcDataManagerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[5], (RoundImageView) objArr[6], (LayoutDataUsageItemBinding) objArr[4], (LayoutDataUsageItemBinding) objArr[3], (LayoutDataUsageItemBinding) objArr[2], (TextView) objArr[7]);
        this.component2 = -1L;
        this.csContent.setTag(null);
        setContainedBinding(this.lwDataManager);
        setContainedBinding(this.lwUsageLimit);
        setContainedBinding(this.lwViewUsage);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component1 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component2 = 8L;
        }
        this.lwViewUsage.invalidateAll();
        this.lwUsageLimit.invalidateAll();
        this.lwDataManager.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.component2 != 0) {
                return true;
            }
            return this.lwViewUsage.hasPendingBindings() || this.lwUsageLimit.hasPendingBindings() || this.lwDataManager.hasPendingBindings();
        }
    }

    @Override
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        int i = 2 % 2;
        int i2 = equals + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.setLifecycleOwner(lifecycleOwner);
        this.lwViewUsage.setLifecycleOwner(lifecycleOwner);
        this.lwUsageLimit.setLifecycleOwner(lifecycleOwner);
        this.lwDataManager.setLifecycleOwner(lifecycleOwner);
        int i4 = component4 + 1;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 41;
        equals = i5 % 128;
        int i6 = i5 % 2;
        if (i == 0) {
            boolean zComponent2 = component2((LayoutDataUsageItemBinding) obj, i2);
            int i7 = component4 + 35;
            equals = i7 % 128;
            if (i7 % 2 != 0) {
                return zComponent2;
            }
            throw null;
        }
        if (i == 1) {
            boolean zShareDataUIState = ShareDataUIState((LayoutDataUsageItemBinding) obj, i2);
            int i8 = equals + 33;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            return zShareDataUIState;
        }
        int i10 = i4 + 77;
        int i11 = i10 % 128;
        equals = i11;
        int i12 = i10 % 2;
        if (i == 2) {
            return component3((LayoutDataUsageItemBinding) obj, i2);
        }
        int i13 = i11 + 63;
        component4 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    private boolean component2(LayoutDataUsageItemBinding layoutDataUsageItemBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.component2 |= 1;
        }
        return true;
    }

    private boolean ShareDataUIState(LayoutDataUsageItemBinding layoutDataUsageItemBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.component2 |= 2;
        }
        return true;
    }

    private boolean component3(LayoutDataUsageItemBinding layoutDataUsageItemBinding, int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.component2 |= 4;
        }
        return true;
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.component2;
            this.component2 = 0L;
        }
        if ((j & 8) != 0) {
            this.lwDataManager.setDescription(getRoot().getResources().getString(R.string.data_manager_desc));
            this.lwDataManager.setHasSwitch(true);
            this.lwDataManager.setIcon(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_data_manager));
            this.lwDataManager.setTitle(getRoot().getResources().getString(R.string.data_manager_title));
            this.lwUsageLimit.setDescription(getRoot().getResources().getString(R.string.manage_usage_desc));
            this.lwUsageLimit.setHasSwitch(false);
            this.lwUsageLimit.setIcon(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_usage_limit));
            this.lwUsageLimit.setTitle(getRoot().getResources().getString(R.string.manage_usage));
            this.lwViewUsage.setDescription(getRoot().getResources().getString(R.string.view_usage_desc));
            this.lwViewUsage.setHasSwitch(false);
            this.lwViewUsage.setIcon(AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.ic_view_usage));
            this.lwViewUsage.setTitle(getRoot().getResources().getString(R.string.view_usage));
        }
        executeBindingsOn(this.lwViewUsage);
        executeBindingsOn(this.lwUsageLimit);
        executeBindingsOn(this.lwDataManager);
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = equals + 9;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
