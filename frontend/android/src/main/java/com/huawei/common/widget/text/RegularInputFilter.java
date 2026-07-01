package com.huawei.common.widget.text;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.huawei.common.util.L;
import java.util.regex.Pattern;

public class RegularInputFilter implements InputFilter {
    private static final String ShareDataUIState = "RegularInputFilter";
    private Pattern component1;

    public RegularInputFilter(String str) {
        this.component1 = Pattern.compile(".*");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.component1 = Pattern.compile(str);
        } catch (Exception e) {
            L.e(ShareDataUIState, "RegularInputFilter: " + e.getMessage());
        }
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.component1.matcher(charSequence).find()) {
            return null;
        }
        return "";
    }
}
