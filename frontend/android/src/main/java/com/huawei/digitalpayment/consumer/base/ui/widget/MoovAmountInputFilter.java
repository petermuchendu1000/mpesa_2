package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.huawei.digitalpayment.consumer.baselib.util.CommonUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoovAmountInputFilter implements InputFilter {
    public static final double MAX_VALUE = Double.MAX_VALUE;
    private static int ShareDataUIState = 0;
    private static final String component1 = "0";
    private static final String component3 = ".";
    private static int component4 = 0;
    private static int copy = 1;
    private static final Pattern copydefault = Pattern.compile("([0-9]|\\.)*");
    private static int equals = 1;
    private double component2;
    public int pointerLength;

    static {
        int i = copy + 69;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MoovAmountInputFilter() {
        this.component2 = Double.MAX_VALUE;
        this.pointerLength = 2;
    }

    public MoovAmountInputFilter(int i, int i2) {
        this.pointerLength = 2;
        double d2 = 1.0d;
        this.component2 = 1.0d;
        int i3 = 2 % 2;
        int i4 = 1;
        while (i4 <= i) {
            int i5 = component4 + 45;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                this.component2 %= 10.0d;
                i4 += 39;
            } else {
                this.component2 *= 10.0d;
                i4++;
            }
        }
        this.component2 -= 1.0d;
        int i6 = component4 + 13;
        equals = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 1; i8 <= i2; i8++) {
            d2 /= 10.0d;
            this.component2 += 9.0d * d2;
        }
        this.pointerLength = i2;
    }

    public void setPointerLength(int i) {
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 99;
        equals = i4 % 128;
        int i5 = i4 % 2;
        this.pointerLength = i;
        int i6 = i3 + 97;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = 2 % 2;
        String string = charSequence.toString();
        String string2 = spanned.toString();
        String str = "";
        if (TextUtils.isEmpty(string)) {
            if (i3 == 0 && string2.indexOf(component3) == 1) {
                int i6 = equals + 59;
                component4 = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                if (this.pointerLength > 0) {
                    str = "0";
                }
            }
            int i7 = equals + 33;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return str;
        }
        if (this.pointerLength == 0 && component3.contentEquals(charSequence)) {
            return "";
        }
        String strCopydefault = copydefault(charSequence, i3, string2, copydefault.matcher(charSequence));
        if (strCopydefault != null) {
            return strCopydefault;
        }
        if (Double.parseDouble(CommonUtils.clearBlank(string2.substring(0, i3) + string + string2.substring(i3, string2.length()))) <= this.component2) {
            return ((Object) spanned.subSequence(i3, i4)) + string;
        }
        int i9 = equals + 79;
        component4 = i9 % 128;
        if (i9 % 2 == 0) {
            return spanned.subSequence(i3, i4);
        }
        spanned.subSequence(i3, i4);
        throw null;
    }

    private String copydefault(CharSequence charSequence, int i, String str, Matcher matcher) {
        int i2 = 2 % 2;
        Object obj = null;
        if (str.contains(component3)) {
            if (!matcher.matches()) {
                int i3 = equals + 113;
                component4 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "";
                }
                throw null;
            }
            if (component3.contentEquals(charSequence)) {
                return "";
            }
            int iIndexOf = str.indexOf(component3);
            if (str.trim().length() - iIndexOf > this.pointerLength && i > iIndexOf) {
                return "";
            }
        } else {
            if (!matcher.matches()) {
                return "";
            }
            if (component3.contentEquals(charSequence) && i == 0) {
                if (this.pointerLength <= 0) {
                    return "";
                }
                int i4 = equals + 85;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    return "0.";
                }
                obj.hashCode();
                throw null;
            }
            if ("0".contentEquals(charSequence)) {
                int i5 = equals + 73;
                component4 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (i == 0) {
                    return this.pointerLength > 0 ? "0" : "";
                }
            }
            if ("0".contentEquals(charSequence) && "0".equals(str)) {
                return "";
            }
        }
        return null;
    }
}
