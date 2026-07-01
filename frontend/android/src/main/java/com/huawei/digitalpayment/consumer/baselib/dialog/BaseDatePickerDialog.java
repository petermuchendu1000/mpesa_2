package com.huawei.digitalpayment.consumer.baselib.dialog;

import android.os.Bundle;
import android.view.View;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.widget.dialog.date.DatePickerDialog;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.R;
import java.util.Calendar;

public class BaseDatePickerDialog extends DatePickerDialog {
    private static int component2 = 0;
    private static int copydefault = 1;

    public BaseDatePickerDialog() {
    }

    public BaseDatePickerDialog(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        super(calendar, calendar2, calendar3);
    }

    public BaseDatePickerDialog(String str, Calendar calendar, Calendar calendar2, Calendar calendar3) {
        super(str, calendar, calendar2, calendar3);
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        super.onViewCreated(view, bundle);
        ((RoundTextView) view.findViewById(R.id.btn_confirm)).setText(Utils.getApp().getString(R.string.base_ok));
        RoundTextView roundTextView = (RoundTextView) view.findViewById(R.id.btn_cancel);
        roundTextView.setText(Utils.getApp().getString(R.string.base_cancel));
        roundTextView.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onFilterClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseDatePickerDialog.this.dismiss();
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.base_dialog_date_picker;
        int i5 = copydefault + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
