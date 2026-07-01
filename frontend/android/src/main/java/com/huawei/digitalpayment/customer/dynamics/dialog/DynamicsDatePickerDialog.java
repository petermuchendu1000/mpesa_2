package com.huawei.digitalpayment.customer.dynamics.dialog;

import com.huawei.digitalpayment.consumer.baselib.dialog.BaseDatePickerDialog;
import java.util.Calendar;

public class DynamicsDatePickerDialog extends BaseDatePickerDialog {
    public DynamicsDatePickerDialog() {
    }

    public DynamicsDatePickerDialog(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        super(calendar, calendar2, calendar3);
    }

    public DynamicsDatePickerDialog(String str, Calendar calendar, Calendar calendar2, Calendar calendar3) {
        super(str, calendar, calendar2, calendar3);
    }
}
