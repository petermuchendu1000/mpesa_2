package com.huawei.common.widget.text;

import android.text.InputFilter;
import android.text.Spanned;
import com.huawei.common.config.AmountConfig;
import com.huawei.common.util.NumberUtils;

public class MaxFilter implements InputFilter {
    private static final String component3 = "MaxFilter";
    private double component2;

    public MaxFilter() {
        this.component2 = AmountConfig.INSTANCE.getInputMaxValue();
    }

    public MaxFilter(double d2) {
        AmountConfig.INSTANCE.getInputMaxValue();
        this.component2 = d2;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence charSequenceSubSequence = spanned.subSequence(0, i3);
        CharSequence charSequenceSubSequence2 = spanned.subSequence(i4, spanned.length());
        StringBuffer stringBuffer = new StringBuffer(charSequence);
        while (stringBuffer.length() > 0) {
            int length = stringBuffer.length();
            if (NumberUtils.parseDouble(((Object) charSequenceSubSequence) + stringBuffer.toString() + ((Object) charSequenceSubSequence2)).doubleValue() <= this.component2) {
                break;
            }
            stringBuffer.deleteCharAt(length - 1);
        }
        return stringBuffer;
    }
}
