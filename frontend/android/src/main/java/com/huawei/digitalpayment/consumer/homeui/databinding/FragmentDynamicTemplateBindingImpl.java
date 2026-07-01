package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.base.ui.widget.BaseRefreshHeader;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class FragmentDynamicTemplateBindingImpl extends FragmentDynamicTemplateBinding {
    private static final SparseIntArray component1;
    private static int component2 = 1;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int component4 = 1;
    private static int copy;
    private static int copydefault;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component1 = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 1);
        sparseIntArray.put(R.id.refreshLayout, 2);
        sparseIntArray.put(R.id.refreshHeader, 3);
        sparseIntArray.put(R.id.scrollView, 4);
        sparseIntArray.put(R.id.container, 5);
        sparseIntArray.put(R.id.statusBar, 6);
        int i = component2 + 85;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public FragmentDynamicTemplateBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, component3, component1));
    }

    private FragmentDynamicTemplateBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[5], (ImageView) objArr[1], (BaseRefreshHeader) objArr[3], (SmartRefreshLayout) objArr[2], (RoundConstraintLayout) objArr[0], (NestedScrollView) objArr[4], (View) objArr[6]);
        this.ShareDataUIState = -1L;
        this.root.setTag(null);
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
        int i4 = component4 + 57;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 31;
        component4 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 49;
        copy = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 63;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return true;
    }
}
