package com.huawei.common.widget.text;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.huawei.common.config.AmountConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public class AmountInputFilter implements InputFilter {
    private String ShareDataUIState;
    private Pattern component1;
    private double copydefault;
    public int pointerLength;
    public static final double MAX_VALUE = AmountConfig.INSTANCE.getInputMaxValue();
    private static final char component3 = AmountConfig.INSTANCE.getPoint();
    private static final char component2 = AmountConfig.INSTANCE.getZero();

    public AmountInputFilter() {
        this.copydefault = MAX_VALUE;
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
        this.ShareDataUIState = AmountConfig.INSTANCE.getLimit();
        this.component1 = null;
    }

    public AmountInputFilter(double d2) {
        this.copydefault = MAX_VALUE;
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
        this.ShareDataUIState = AmountConfig.INSTANCE.getLimit();
        this.component1 = null;
        this.copydefault = d2;
    }

    public AmountInputFilter(double d2, int i) {
        this.copydefault = MAX_VALUE;
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
        this.ShareDataUIState = AmountConfig.INSTANCE.getLimit();
        this.component1 = null;
        this.copydefault = d2;
        this.pointerLength = i;
    }

    public AmountInputFilter(double d2, int i, String str) {
        this.copydefault = MAX_VALUE;
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
        AmountConfig.INSTANCE.getLimit();
        this.component1 = null;
        this.copydefault = d2;
        this.pointerLength = i;
        this.ShareDataUIState = str;
    }

    public void setPointerLength(int i) {
        this.pointerLength = i;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        copydefault();
        String string = charSequence.toString();
        String string2 = spanned.toString();
        if (TextUtils.isEmpty(string)) {
            if (i3 != 0 || string2.indexOf(component3) != 1) {
                return "";
            }
            return component2 + "";
        }
        Matcher matcher = this.component1.matcher(charSequence);
        StringBuilder sb = new StringBuilder();
        char c2 = component3;
        sb.append(c2);
        sb.append("");
        if (string2.contains(sb.toString())) {
            if (!matcher.matches()) {
                return "";
            }
            if ((c2 + "").contentEquals(charSequence)) {
                return "";
            }
            int iIndexOf = string2.indexOf(c2);
            if (string2.trim().length() - iIndexOf > this.pointerLength && i3 > iIndexOf) {
                return "";
            }
        } else {
            if (!matcher.matches()) {
                return "";
            }
            if ((c2 + "").contentEquals(charSequence) && i3 == 0) {
                return "" + component2 + c2;
            }
            StringBuilder sb2 = new StringBuilder();
            char c3 = component2;
            sb2.append(c3);
            sb2.append("");
            if (sb2.toString().contentEquals(charSequence) && i3 == 0) {
                return c3 + "";
            }
            if ((c3 + "").contentEquals(charSequence)) {
                if ((c3 + "").equals(string2)) {
                    return "";
                }
            }
        }
        if (Double.parseDouble((string2.substring(0, i3) + string + string2.substring(i3, string2.length())).replace(c2 + "", ".")) > this.copydefault) {
            return spanned.subSequence(i3, i4);
        }
        return ((Object) spanned.subSequence(i3, i4)) + string;
    }

    private void copydefault() {
        if (this.component1 == null) {
            this.component1 = Pattern.compile(this.ShareDataUIState);
        }
    }
}
