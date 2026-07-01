package com.huawei.common.widget.text;

import android.text.InputFilter;
import android.text.Spanned;
import com.huawei.common.config.AmountConfig;

public class LengthFilter implements InputFilter {
    private static final String ShareDataUIState = "LengthFilter";
    private int copydefault;
    public int pointerLength;

    public LengthFilter() {
        this.copydefault = AmountConfig.INSTANCE.getInputMaxLength();
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
    }

    public LengthFilter(int i, int i2) {
        this.copydefault = AmountConfig.INSTANCE.getInputMaxLength();
        AmountConfig.INSTANCE.getPointLength();
        this.copydefault = i;
        this.pointerLength = i2;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.copydefault - (spanned.length() - (i4 - i3));
        if (i3 == i4 && length == 0 && i3 == this.copydefault) {
            return "";
        }
        if (this.copydefault == 2 && spanned.length() == 1 && i3 == i4 && i3 == 0 && charSequence.toString().equals(String.valueOf(AmountConfig.INSTANCE.getPoint()))) {
            return "";
        }
        if (this.copydefault == 1 && spanned.length() == 0 && i3 == i4 && i3 == 0 && charSequence.toString().equals(String.valueOf(AmountConfig.INSTANCE.getPoint()))) {
            return "";
        }
        return component1(charSequence, i, i2, spanned, i3, i4, length).toString();
    }

    private StringBuilder component1(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4, int i5) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = new StringBuilder();
        int length = charSequenceSubSequence.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = charSequenceSubSequence.charAt(i6);
            if (cCharAt == AmountConfig.INSTANCE.getPoint() && !ShareDataUIState(spanned, i3, i4)) {
                if (!sb.toString().contains(AmountConfig.INSTANCE.getPoint() + "") && this.pointerLength > 0 && this.copydefault > 2) {
                    sb.append(cCharAt);
                }
            }
            if (sb.length() >= i5) {
                break;
            }
            sb.append(cCharAt);
        }
        return sb;
    }

    private boolean ShareDataUIState(Spanned spanned, int i, int i2) {
        CharSequence charSequenceSubSequence = spanned.subSequence(0, i);
        CharSequence charSequenceSubSequence2 = spanned.subSequence(i2, spanned.length());
        if (!charSequenceSubSequence.toString().contains(AmountConfig.INSTANCE.getPoint() + "")) {
            if (!charSequenceSubSequence2.toString().contains(AmountConfig.INSTANCE.getPoint() + "")) {
                return false;
            }
        }
        return true;
    }

    public int getMax() {
        return this.copydefault;
    }
}
