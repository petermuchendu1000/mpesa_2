package com.huawei.digitalpayment.consumer.manageandviewdata.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.huawei.digitalpayment.consumer.manageandviewdata.BR;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;

public class LayoutDataUsageItemBindingImpl extends LayoutDataUsageItemBinding {
    private static int ShareDataUIState = 0;
    private static final ViewDataBinding.IncludedLayouts component1 = null;
    private static final SparseIntArray component3;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ConstraintLayout component2;
    private long copydefault;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        component3 = sparseIntArray;
        sparseIntArray.put(R.id.ll_container, 6);
        sparseIntArray.put(R.id.llEndContent, 7);
        int i = getRequestBeneficiariesState + 59;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public LayoutDataUsageItemBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, component1, component3));
    }

    private LayoutDataUsageItemBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (LinearLayout) objArr[6], (LinearLayout) objArr[7], (SwitchCompat) objArr[5], (ImageView) objArr[4], (TextView) objArr[3], (TextView) objArr[2]);
        this.copydefault = -1L;
        this.ivBundle.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.component2 = constraintLayout;
        constraintLayout.setTag(null);
        this.swToggle.setTag(null);
        this.tvBuy.setTag(null);
        this.tvDescription.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 16L;
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
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        if (BR.icon == i) {
            setIcon((Drawable) obj);
        } else if (BR.title != i) {
            if (BR.description == i) {
                setDescription((String) obj);
            } else {
                if (BR.hasSwitch != i) {
                    return false;
                }
                int i3 = component4 + 11;
                equals = i3 % 128;
                int i4 = i3 % 2;
                setHasSwitch((Boolean) obj);
            }
        } else {
            int i5 = equals + 99;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                setTitle((String) obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            setTitle((String) obj);
        }
        return true;
    }

    @Override
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        synchronized (this) {
            this.copydefault |= 1;
        }
        notifyPropertyChanged(BR.icon);
        super.requestRebind();
    }

    @Override
    public void setTitle(String str) {
        this.mTitle = str;
        synchronized (this) {
            this.copydefault |= 2;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }

    @Override
    public void setDescription(String str) {
        this.mDescription = str;
        synchronized (this) {
            this.copydefault |= 4;
        }
        notifyPropertyChanged(BR.description);
        super.requestRebind();
    }

    @Override
    public void setHasSwitch(Boolean bool) {
        this.mHasSwitch = bool;
        synchronized (this) {
            this.copydefault |= 8;
        }
        notifyPropertyChanged(BR.hasSwitch);
        super.requestRebind();
    }

    @Override
    public void executeBindings() {
        long j;
        int i;
        synchronized (this) {
            j = this.copydefault;
            this.copydefault = 0L;
        }
        Drawable drawable = this.mIcon;
        String str = this.mTitle;
        String str2 = this.mDescription;
        Boolean bool = this.mHasSwitch;
        long j2 = j & 24;
        int i2 = 0;
        if (j2 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            boolean z = zSafeUnbox;
            if (j2 != 0) {
                j |= !zSafeUnbox ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= z ? 64L : 32L;
            }
            int i3 = !zSafeUnbox ? 0 : 8;
            i = z ? 0 : 8;
            i2 = i3;
        } else {
            i = 0;
        }
        if ((17 & j) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.ivBundle, drawable);
        }
        if ((18 & j) != 0) {
            if (getBuildSdkInt() >= 4) {
                this.ivBundle.setContentDescription(str);
            }
            TextViewBindingAdapter.setText(this.tvTitle, str);
        }
        if ((j & 24) != 0) {
            this.swToggle.setVisibility(i);
            this.tvBuy.setVisibility(i2);
        }
        if ((j & 20) != 0) {
            TextViewBindingAdapter.setText(this.tvDescription, str2);
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4 + 35;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }
}
