package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import androidx.lifecycle.ViewModel;
import javax.inject.Inject;

public class SetAmountModel extends ViewModel {
    private static int ShareDataUIState = 1;
    private static int component2;
    protected String note;

    @Inject
    public SetAmountModel() {
    }

    public String getNote() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.note;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setNote(String str) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.note = str;
        int i5 = i3 + 43;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
