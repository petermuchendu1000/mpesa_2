package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.BR;
import com.huawei.digitalpayment.consumer.homeui.R;

public class FragmentHomeMultipleBalanceBindingImpl extends FragmentHomeMultipleBalanceBinding {
    private static int component1 = 1;
    private static final SparseIntArray component2;
    private static final ViewDataBinding.IncludedLayouts component3 = null;
    private static int copy = 1;
    private static int copydefault;
    private static int equals;
    private long ShareDataUIState;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component2 = sparseIntArray;
        sparseIntArray.put(R.id.ivBackground, 8);
        sparseIntArray.put(R.id.tvWelcome, 9);
        sparseIntArray.put(R.id.ivLogo, 10);
        sparseIntArray.put(R.id.ivBalanceIcon, 11);
        sparseIntArray.put(R.id.ivBalanceIcon2, 12);
        sparseIntArray.put(R.id.tvBalance, 13);
        sparseIntArray.put(R.id.tvUnit, 14);
        sparseIntArray.put(R.id.ivBalance, 15);
        sparseIntArray.put(R.id.tvBalanceValue, 16);
        sparseIntArray.put(R.id.ivBalanceValueIcon, 17);
        int i = copydefault + 109;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public FragmentHomeMultipleBalanceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 18, component3, component2));
    }

    private FragmentHomeMultipleBalanceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (View) objArr[1], (ImageView) objArr[8], (ImageView) objArr[15], (ImageView) objArr[5], (RoundImageView) objArr[2], (RoundImageView) objArr[3], (ImageView) objArr[7], (RoundImageView) objArr[11], (RoundImageView) objArr[12], (ImageView) objArr[17], (ImageView) objArr[10], (RoundConstraintLayout) objArr[0], (TextView) objArr[13], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[16], (TextView) objArr[14], (TextView) objArr[9]);
        this.ShareDataUIState = -1L;
        this.divider.setTag(null);
        this.ivBalance2.setTag(null);
        this.ivBalance2Icon.setTag(null);
        this.ivBalance2Icon2.setTag(null);
        this.ivBalance2ValueIcon.setTag(null);
        this.root.setTag(null);
        this.tvBalance2Title.setTag(null);
        this.tvBalance2Value.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.ShareDataUIState = 2L;
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
    public boolean setVariable(int i, Object obj) {
        boolean z;
        int i2 = 2 % 2;
        if (BR.balance2IsVisible == i) {
            setBalance2IsVisible((Boolean) obj);
            z = true;
        } else {
            int i3 = copy + 99;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 5;
            }
            z = false;
        }
        int i5 = equals + 63;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override
    public void setBalance2IsVisible(Boolean bool) {
        this.mBalance2IsVisible = bool;
        synchronized (this) {
            this.ShareDataUIState |= 1;
        }
        notifyPropertyChanged(BR.balance2IsVisible);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.ShareDataUIState;
            this.ShareDataUIState = 0L;
        }
        Boolean bool = this.mBalance2IsVisible;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j2 != 0) {
                j |= zSafeUnbox ? 8L : 4L;
            }
            if (!zSafeUnbox) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.divider.setVisibility(i);
            this.ivBalance2.setVisibility(i);
            this.ivBalance2Icon.setVisibility(i);
            this.ivBalance2Icon2.setVisibility(i);
            this.ivBalance2ValueIcon.setVisibility(i);
            this.tvBalance2Title.setVisibility(i);
            this.tvBalance2Value.setVisibility(i);
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 51;
        copy = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 3;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }
}
