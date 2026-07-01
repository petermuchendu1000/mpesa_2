package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function2;
import kotlin.updateBackInvokedCallbackState;
import kotlin.updateEnabledCallbacks;

public final class SfcIndividualUsageActivity$$ExternalSyntheticLambda2 implements DatePickerDialog.OnDateSetListener {
    private static int component2 = 0;
    private static int copydefault = 1;
    public final SfcIndividualUsageActivity f$0;
    public final SimpleDateFormat f$1;
    public final String f$2;
    public final Function2 f$3;

    public SfcIndividualUsageActivity$$ExternalSyntheticLambda2(SfcIndividualUsageActivity sfcIndividualUsageActivity, SimpleDateFormat simpleDateFormat, String str, Function2 function2) {
        this.f$0 = sfcIndividualUsageActivity;
        this.f$1 = simpleDateFormat;
        this.f$2 = str;
        this.f$3 = function2;
    }

    public static void ShareDataUIState() {
        updateBackInvokedCallbackState.component2[0] = updateEnabledCallbacks.ShareDataUIState[0];
    }

    @Override
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = copydefault + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        SfcIndividualUsageActivity.m10712$r8$lambda$pNuJKAUXBJMwCdQn1XrCCqiYzA(this.f$0, this.f$1, this.f$2, this.f$3, datePicker, i, i2, i3);
        int i7 = copydefault + 93;
        component2 = i7 % 128;
        int i8 = i7 % 2;
    }
}
