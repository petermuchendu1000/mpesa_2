package com.huawei.digitalpayment.datepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.huawei.digitalpayment.datepicker.R;

public final class DatepickerLayoutSundayStartBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final LinearLayout component2;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = component3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private DatepickerLayoutSundayStartBinding(LinearLayout linearLayout) {
        this.component2 = linearLayout;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        LinearLayout linearLayout = this.component2;
        int i4 = i3 + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    public static DatepickerLayoutSundayStartBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DatepickerLayoutSundayStartBinding datepickerLayoutSundayStartBindingInflate = inflate(layoutInflater, null, false);
        int i4 = ShareDataUIState + 113;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return datepickerLayoutSundayStartBindingInflate;
        }
        throw null;
    }

    public static DatepickerLayoutSundayStartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.datepicker_layout_sunday_start, viewGroup, false);
        if (!(!z)) {
            int i2 = ShareDataUIState + 33;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
            int i4 = ShareDataUIState + 57;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
        return bind(viewInflate);
    }

    public static DatepickerLayoutSundayStartBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        DatepickerLayoutSundayStartBinding datepickerLayoutSundayStartBinding = new DatepickerLayoutSundayStartBinding((LinearLayout) view);
        int i3 = ShareDataUIState + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return datepickerLayoutSundayStartBinding;
    }
}
