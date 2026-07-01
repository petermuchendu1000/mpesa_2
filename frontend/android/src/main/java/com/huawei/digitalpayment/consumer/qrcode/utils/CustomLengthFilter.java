package com.huawei.digitalpayment.consumer.qrcode.utils;

import android.text.InputFilter;
import android.text.Spanned;

public class CustomLengthFilter implements InputFilter {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final int component2;

    public CustomLengthFilter(int i) {
        this.component2 = i;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = component1 + 55;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0 ? component3(spanned.toString()) + component3(charSequence.toString()) > this.component2 : component3(spanned.toString()) + component3(charSequence.toString()) > this.component2) {
            int i7 = ShareDataUIState + 85;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            charSequence = "";
        }
        int i9 = component1 + 53;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return charSequence;
    }

    private int component3(String str) {
        char[] charArray;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 89;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            charArray = str.toCharArray();
            length = charArray.length;
            i = 1;
        } else {
            charArray = str.toCharArray();
            length = charArray.length;
            i = 0;
        }
        for (int i4 = i; i4 < length; i4++) {
            if (component3(charArray[i4])) {
                i += 2;
            } else {
                i++;
                int i5 = component1 + 27;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return i;
    }

    private boolean component3(char c2) {
        int i = 2 % 2;
        if (c2 < 19968 || c2 > 40869) {
            return false;
        }
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
