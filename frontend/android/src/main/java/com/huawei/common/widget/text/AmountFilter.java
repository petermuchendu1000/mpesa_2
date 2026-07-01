package com.huawei.common.widget.text;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.EditText;
import com.huawei.common.config.AmountConfig;
import com.huawei.common.util.L;

public class AmountFilter implements InputFilter {
    private static final String component2 = "(([0-9]|\\.)*)";
    private EditText ShareDataUIState;
    private boolean component3;
    private double getRequestBeneficiariesState;
    public int pointerLength;
    private static final char component1 = AmountConfig.INSTANCE.getPoint();
    private static final char copydefault = AmountConfig.INSTANCE.getZero();

    public AmountFilter() {
        this.component3 = true;
        this.getRequestBeneficiariesState = AmountConfig.INSTANCE.getInputMaxValue();
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
    }

    public AmountFilter(double d2) {
        this.component3 = true;
        this.getRequestBeneficiariesState = AmountConfig.INSTANCE.getInputMaxValue();
        this.pointerLength = AmountConfig.INSTANCE.getPointLength();
        this.getRequestBeneficiariesState = d2;
    }

    public AmountFilter(double d2, int i) {
        this.component3 = true;
        this.getRequestBeneficiariesState = AmountConfig.INSTANCE.getInputMaxValue();
        AmountConfig.INSTANCE.getPointLength();
        this.getRequestBeneficiariesState = d2;
        this.pointerLength = i;
    }

    public void setFilter(boolean z) {
        this.component3 = z;
    }

    public void setPointerLength(int i) {
        this.pointerLength = i;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        L.d(component2, "source: " + ((Object) charSequence) + "\nstart: " + i + "\nend: " + i2 + "\ndest: " + ((Object) spanned) + "\ndstart: " + i3 + "\ndend: " + i4 + "\n");
        if (!this.component3) {
            this.component3 = true;
            return null;
        }
        this.component3 = false;
        CharSequence charSequenceSubSequence = spanned.subSequence(0, i3);
        CharSequence charSequenceSubSequence2 = spanned.subSequence(i4, spanned.length());
        String strComponent3 = component3(charSequence, charSequenceSubSequence, charSequenceSubSequence2);
        component1(charSequence, ((Object) charSequenceSubSequence) + strComponent3 + ((Object) charSequenceSubSequence2), i3 + strComponent3.length());
        return null;
    }

    private String component3(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        String string = charSequence.toString();
        String string2 = charSequence2.toString();
        StringBuilder sb = new StringBuilder();
        char c2 = component1;
        sb.append(c2);
        sb.append("");
        if (!string2.contains(sb.toString())) {
            if (!charSequence3.toString().contains(c2 + "") && this.pointerLength > 0) {
                return string;
            }
        }
        return string.replace(c2 + "", "");
    }

    private int copydefault(int i) {
        return Math.max(i - 1, 0);
    }

    private void component1(CharSequence charSequence, String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(component1);
        String str2 = "";
        sb.append("");
        if (str.startsWith(sb.toString())) {
            str = copydefault + str;
            i++;
        }
        while (true) {
            if (!str.startsWith(copydefault + "") || str.length() <= 1 || str.charAt(1) == component1) {
                break;
            }
            str = str.substring(1);
            i = copydefault(i);
        }
        int iIndexOf = str.indexOf(component1);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf);
            int length = strSubstring2.length();
            int i2 = this.pointerLength;
            if (length > i2) {
                strSubstring2 = strSubstring2.substring(0, i2 + 1);
            }
            str2 = strSubstring2;
            str = strSubstring;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str + str2;
        }
        copydefault(i, str);
    }

    private void copydefault(int i, String str) {
        this.ShareDataUIState.setText(str);
        try {
            this.ShareDataUIState.setSelection(i);
        } catch (Exception unused) {
            EditText editText = this.ShareDataUIState;
            editText.setSelection(editText.getText().length());
        }
    }

    public void attach(EditText editText) {
        this.ShareDataUIState = editText;
    }
}
