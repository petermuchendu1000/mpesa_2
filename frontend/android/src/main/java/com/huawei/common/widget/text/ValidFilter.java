package com.huawei.common.widget.text;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.huawei.common.config.AmountConfig;
import java.util.regex.Pattern;

public class ValidFilter implements InputFilter {
    private static final String copydefault = "ValidFilter";
    private String component1;
    private Pattern component3;

    public ValidFilter() {
        this.component3 = null;
        this.component1 = AmountConfig.INSTANCE.getLimit();
    }

    public ValidFilter(String str) {
        this.component3 = null;
        AmountConfig.INSTANCE.getLimit();
        this.component1 = str;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return filterInValidChar(charSequence.subSequence(i, i2).toString());
    }

    public CharSequence filterInValidChar(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            if (copydefault(charSequence.charAt(i))) {
                sb.append(charSequence.charAt(i));
            }
        }
        return sb.toString();
    }

    private boolean copydefault(char c2) {
        if (TextUtils.isEmpty(this.component1)) {
            return true;
        }
        component1();
        return this.component3.matcher(c2 + "").matches();
    }

    private void component1() {
        if (this.component3 == null) {
            this.component3 = Pattern.compile(this.component1);
        }
    }
}
