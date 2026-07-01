package com.huawei.digitalpayment.datepicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.datepicker.R;
import com.huawei.digitalpayment.datepicker.library.MonthView;

public final class DatepickerItemCalendarBinding implements ViewBinding {
    private static int component2 = 1;
    private static int copydefault;
    private final LinearLayout ShareDataUIState;
    public final MonthView ssMv;
    public final TextView tvMonthTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout root = getRoot();
        int i4 = copydefault + 35;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return root;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DatepickerItemCalendarBinding(LinearLayout linearLayout, MonthView monthView, TextView textView) {
        this.ShareDataUIState = linearLayout;
        this.ssMv = monthView;
        this.tvMonthTitle = textView;
    }

    @Override
    public LinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LinearLayout linearLayout = this.ShareDataUIState;
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return linearLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DatepickerItemCalendarBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DatepickerItemCalendarBinding datepickerItemCalendarBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component2 + 27;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return datepickerItemCalendarBindingInflate;
    }

    public static DatepickerItemCalendarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.datepicker_item_calendar, viewGroup, false);
        if (z) {
            int i2 = copydefault + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            viewGroup.addView(viewInflate);
        }
        DatepickerItemCalendarBinding datepickerItemCalendarBindingBind = bind(viewInflate);
        int i4 = copydefault + 117;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return datepickerItemCalendarBindingBind;
    }

    public static DatepickerItemCalendarBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.ssMv;
        MonthView monthView = (MonthView) ViewBindings.findChildViewById(view, i2);
        if (monthView != null) {
            int i3 = copydefault + 15;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                i2 = R.id.tvMonthTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                if (textView != null) {
                    DatepickerItemCalendarBinding datepickerItemCalendarBinding = new DatepickerItemCalendarBinding((LinearLayout) view, monthView, textView);
                    int i4 = copydefault + 119;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return datepickerItemCalendarBinding;
                }
            } else {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
