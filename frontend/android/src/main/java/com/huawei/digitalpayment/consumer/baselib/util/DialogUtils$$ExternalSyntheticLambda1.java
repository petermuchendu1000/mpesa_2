package com.huawei.digitalpayment.consumer.baselib.util;

import com.huawei.digitalpayment.consumer.baselib.dialog.CommonDialog;

public final class DialogUtils$$ExternalSyntheticLambda1 implements CommonDialog.OnClickListener {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public final void onClick(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        commonDialog.dismiss();
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
