package com.huawei.digitalpayment.datepicker.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.datepicker.R;

public class FragmentRangeDatepickerBindingImpl extends FragmentRangeDatepickerBinding {
    private static final ViewDataBinding.IncludedLayouts ShareDataUIState = null;
    private static int component3 = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static final SparseIntArray copydefault;
    private static int equals = 1;
    private long component1;
    private final LinearLayout component2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(R.id.sunday_start, 2);
        sparseIntArray.put(R.id.tv_title, 3);
        sparseIntArray.put(R.id.rvCalendar, 4);
        sparseIntArray.put(R.id.apply, 5);
        int i = copy + 9;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public FragmentRangeDatepickerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, ShareDataUIState, copydefault));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private FragmentRangeDatepickerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        DatepickerLayoutSundayStartBinding datepickerLayoutSundayStartBinding;
        DatepickerLayoutSundayStartBinding datepickerLayoutSundayStartBindingBind;
        LoadingButton loadingButton = (LoadingButton) objArr[5];
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        RecyclerView recyclerView = (RecyclerView) objArr[4];
        Object obj = objArr[2];
        if (obj != null) {
            int i = equals + 109;
            component4 = i % 128;
            if (i % 2 != 0) {
                datepickerLayoutSundayStartBindingBind = DatepickerLayoutSundayStartBinding.bind((View) obj);
                int i2 = 57 / 0;
            } else {
                datepickerLayoutSundayStartBindingBind = DatepickerLayoutSundayStartBinding.bind((View) obj);
            }
            datepickerLayoutSundayStartBinding = datepickerLayoutSundayStartBindingBind;
        } else {
            int i3 = equals + 33;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            datepickerLayoutSundayStartBinding = null;
        }
        super(dataBindingComponent, view, 0, loadingButton, linearLayout, recyclerView, datepickerLayoutSundayStartBinding, (TextView) objArr[3]);
        this.component1 = -1L;
        this.llTop.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[0];
        this.component2 = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized (this) {
            this.component1 = 1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.component1 != 0;
        }
    }

    @Override
    public void executeBindings() {
        synchronized (this) {
            this.component1 = 0L;
        }
    }

    @Override
    public boolean onFieldChange(int i, Object obj, int i2) {
        int i3 = 2 % 2;
        int i4 = component4 + 57;
        int i5 = i4 % 128;
        equals = i5;
        boolean z = i4 % 2 == 0;
        int i6 = i5 + 73;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    @Override
    public boolean setVariable(int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 47;
        equals = i3 % 128;
        return i3 % 2 != 0;
    }
}
