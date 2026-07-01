package com.huawei.digitalpayment.checkout.utils;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

public class ParameterUtils {
    private static int component4 = 1;
    private static int copy = 1;
    private static int equals;
    private static int getAsAtTimestamp;
    private static Pattern ShareDataUIState = Pattern.compile("[^0-9]");
    private static Pattern copydefault = Pattern.compile("^[^/\\\\:*|?]{2,16}$");
    private static Pattern component1 = Pattern.compile("^([0-9A-Za-z]{2,128})$");
    private static Pattern component2 = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$");
    public static Pattern PHONE_PATTERN = Pattern.compile("^([0-9]{13})$");
    private static Pattern getRequestBeneficiariesState = Pattern.compile("^([0-9]{4,12})$");
    private static Pattern component3 = Pattern.compile("^([0-9A-Za-z]{6,32})$");
    public static final InputFilter NUMBER = new InputFilter() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int i5 = 2 % 2;
            if (charSequence.equals("")) {
                int i6 = ShareDataUIState + 39;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return charSequence;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!charSequence.toString().matches("[0-9]+")) {
                int i7 = component3 + 1;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return "";
            }
            int i9 = ShareDataUIState + 19;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return charSequence;
        }
    };

    static {
        int i = component4 + 85;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    private ParameterUtils() {
    }

    public static boolean match(String str, String str2) {
        boolean zMatches;
        int i = 2 % 2;
        int i2 = equals + 81;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            zMatches = Pattern.compile(str).matcher(str2).matches();
            int i3 = 66 / 0;
        } else {
            zMatches = Pattern.compile(str).matcher(str2).matches();
        }
        int i4 = copy + 5;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return zMatches;
    }

    public static boolean isValidAmount(String str) {
        int i = 2 % 2;
        int i2 = copy + 41;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zMatches = component2.matcher(str).matches();
            int i3 = equals + 89;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return zMatches;
        }
        component2.matcher(str).matches();
        throw null;
    }

    public static String clearPhoneBlank(String str) {
        int i = 2 % 2;
        int i2 = equals + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplaceAll = ShareDataUIState.matcher(str).replaceAll("");
        int i4 = copy + 21;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return strReplaceAll;
    }

    public static boolean isValidIdNumber(String str) {
        int i = 2 % 2;
        int i2 = copy + 45;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean zMatches = component3.matcher(str).matches();
        int i4 = copy + 19;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return zMatches;
        }
        throw null;
    }

    public static boolean isValidInputName(String str) {
        int i = 2 % 2;
        int i2 = copy + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean zMatches = copydefault.matcher(str).matches();
        int i4 = equals + 77;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return zMatches;
    }

    public static int getPinLimit() {
        int i = 2 % 2;
        int i2 = equals + 107;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2 == 0 ? 47 : 6;
        int i5 = i3 + 21;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }
}
