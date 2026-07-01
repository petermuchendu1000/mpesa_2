package com.huawei.digitalpayment.consumer.baselib.util;

import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ConvertUtils;
import com.dynatrace.android.agent.Global;
import com.huawei.common.util.L;
import com.huawei.common.widget.LoadingButton;
import com.huawei.image.glide.ImageRequest;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class CommonUtils {
    private static int ShareDataUIState = 1;
    private static final Pattern component1 = Pattern.compile("[^0-9]");
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    static {
        int i = ShareDataUIState + 5;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static void loadImage(ImageView imageView, String str, Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ImageRequest imageRequestLoad = ImageRequest.get().load(str);
        if (i3 != 0) {
            imageRequestLoad.placeholder(num).into(imageView).request();
            return;
        }
        imageRequestLoad.placeholder(num).into(imageView).request();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void setButtonBeyondKeyboard(final View view, EditText editText, final LoadingButton loadingButton) {
        int i = 2 % 2;
        editText.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onGlobalLayout() {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                View view2 = view;
                if (i4 == 0) {
                    CommonUtils.component3(view2, loadingButton);
                    return;
                }
                CommonUtils.component3(view2, loadingButton);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = copydefault + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void component3(View view, LoadingButton loadingButton) {
        int i = 2 % 2;
        int height = view.getRootView().getHeight();
        Rect rect = new Rect();
        loadingButton.getWindowVisibleDisplayFrame(rect);
        int i2 = rect.bottom;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) loadingButton.getLayoutParams();
        layoutParams.bottomMargin = (height - i2) + 32;
        loadingButton.setLayoutParams(layoutParams);
        int i3 = component2 + 43;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static void setButtonBeyondKeyboardInConstraintLayout(final View view, EditText editText, final LoadingButton loadingButton) {
        int i = 2 % 2;
        editText.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onGlobalLayout() {
                int i2 = 2 % 2;
                int i3 = copydefault + 111;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                View view2 = view;
                if (i4 != 0) {
                    CommonUtils.component2(view2, loadingButton);
                } else {
                    CommonUtils.component2(view2, loadingButton);
                    int i5 = 89 / 0;
                }
            }
        });
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static void component2(View view, LoadingButton loadingButton) {
        int i = 2 % 2;
        int height = view.getRootView().getHeight();
        Rect rect = new Rect();
        loadingButton.getWindowVisibleDisplayFrame(rect);
        int i2 = rect.bottom;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) loadingButton.getLayoutParams();
        layoutParams.bottomMargin = (height - i2) + ConvertUtils.dp2px(12.0f);
        loadingButton.setLayoutParams(layoutParams);
        int i3 = copydefault + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void setInputAmountEditText(final EditText editText) {
        int i = 2 % 2;
        editText.addTextChangedListener(new TextWatcher() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = component3 + 65;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    String string = charSequence.toString();
                    if (!(!string.contains("."))) {
                        charSequence = component3(charSequence, string);
                    }
                    if (string.trim().equals(".")) {
                        ShareDataUIState("0" + ((Object) charSequence));
                        int i7 = component3 + 83;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    if (string.length() <= 1 || !string.startsWith("0") || string.charAt(1) == '.') {
                        return;
                    }
                    ShareDataUIState(string.substring(0, 1));
                    return;
                }
                charSequence.toString().contains(".");
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1
  0x002a: PHI (r1v5 int) = (r1v4 int), (r1v9 int) binds: [B:8:0x0028, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private java.lang.CharSequence component3(java.lang.CharSequence r5, java.lang.String r6) {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.copydefault
                    int r1 = r1 + 101
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.component3 = r2
                    int r1 = r1 % r0
                    r2 = 3
                    java.lang.String r3 = "."
                    if (r1 != 0) goto L1d
                    int r1 = r6.indexOf(r3)
                    int r3 = r6.length()
                    int r3 = r3 / r1
                    if (r3 <= r2) goto L3c
                    goto L2a
                L1d:
                    int r1 = r6.indexOf(r3)
                    int r3 = r6.length()
                    int r3 = r3 + (-1)
                    int r3 = r3 - r1
                    if (r3 <= r0) goto L3c
                L2a:
                    r5 = 0
                    int r1 = r1 + r2
                    java.lang.String r5 = r6.substring(r5, r1)
                    r4.ShareDataUIState(r5)
                    int r6 = com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.component3
                    int r6 = r6 + 87
                    int r1 = r6 % 128
                    com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.copydefault = r1
                    int r6 = r6 % r0
                L3c:
                    int r6 = com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.component3
                    int r6 = r6 + 61
                    int r1 = r6 % 128
                    com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.copydefault = r1
                    int r6 = r6 % r0
                    if (r6 != 0) goto L48
                    return r5
                L48:
                    r5 = 0
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.AnonymousClass2.component3(java.lang.CharSequence, java.lang.String):java.lang.CharSequence");
            }

            private void ShareDataUIState(CharSequence charSequence) {
                int i2 = 2 % 2;
                int i3 = component3 + 69;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                editText.setText(charSequence);
                editText.setSelection(charSequence.length());
                int i5 = copydefault + 65;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                int i3 = copydefault + 49;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = copydefault + 63;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public static String addComma(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            return addComma(Double.parseDouble(str.replaceAll(ConstantsKt.COMMA_SEPARATOR, "")));
        }
        int i4 = component2 + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public static String addCommaFloor(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(str)) {
            return addCommaFloor(Double.parseDouble(str.replaceAll(ConstantsKt.COMMA_SEPARATOR, "")));
        }
        int i4 = copydefault + 81;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 39;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return "";
        }
        throw null;
    }

    public static String addComma(double d2) {
        String str;
        int i = 2 % 2;
        try {
            str = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US)).format(d2);
            int i2 = copydefault + 79;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            str = "";
        }
        int i4 = component2 + 3;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static String addCommaFloor(double d2) {
        int i = 2 % 2;
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
            decimalFormat.setRoundingMode(RoundingMode.FLOOR);
            String str = decimalFormat.format(d2);
            int i2 = copydefault + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String addCommaInt(String str) {
        String strSubstring;
        int i;
        int i2 = 2 % 2;
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            int i3 = copydefault + 113;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf != -1) {
            int i5 = copydefault + 97;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                strSubstring = str.substring(iIndexOf);
                i = 1;
            } else {
                strSubstring = str.substring(iIndexOf);
                i = 0;
            }
            str = str.substring(i, iIndexOf);
        } else {
            strSubstring = "";
        }
        try {
            str2 = new DecimalFormat("#,##0", new DecimalFormatSymbols(Locale.US)).format(Double.parseDouble(str.replaceAll(ConstantsKt.COMMA_SEPARATOR, "")));
            String str3 = str2 + strSubstring;
            int i6 = copydefault + 25;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return str3;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return str2;
        }
    }

    public static String addCommaFrance(String str) {
        int i = 2 % 2;
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = NumberFormat.getInstance(Locale.FRENCH).format(Double.parseDouble(str));
                int i2 = component2 + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                L.d("=====", e.getMessage());
            }
            int i4 = component2 + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
        int i6 = copydefault + 19;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return "";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String hidePhoneNumber(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        int i2 = 0;
        if (length > 4) {
            int i3 = length - 4;
            String strSubstring = str.substring(i3);
            StringBuilder sb = new StringBuilder();
            while (i2 < i3) {
                int i4 = copydefault + 81;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    sb.append("*");
                    i2 += 67;
                } else {
                    sb.append("*");
                    i2++;
                }
            }
            sb.append(strSubstring);
            return sb.toString();
        }
        int i5 = component2 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        return r2 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (android.text.TextUtils.equals(androidx.compose.material3.internal.TextFieldImplKt.PrefixId, r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.equals(androidx.compose.material3.internal.TextFieldImplKt.PrefixId, r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r2 = r5 + r2;
        r3 = com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.copydefault + 85;
        com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.component2 = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getReadableAmount(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.component2
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.copydefault = r1
            int r0 = r0 % r4
            java.lang.String r1 = "Prefix"
            if (r0 != 0) goto L1a
            boolean r3 = android.text.TextUtils.equals(r1, r3)
            r0 = 1
            int r0 = r0 / 0
            if (r3 == 0) goto L3d
            goto L20
        L1a:
            boolean r3 = android.text.TextUtils.equals(r1, r3)
            if (r3 == 0) goto L3d
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            int r3 = com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.copydefault
            int r3 = r3 + 85
            int r5 = r3 % 128
            com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.component2 = r5
            int r3 = r3 % r4
            if (r3 != 0) goto L3b
            return r2
        L3b:
            r2 = 0
            throw r2
        L3d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.CommonUtils.getReadableAmount(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String getAppendUrl(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            int i3 = component2 + 99;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (map != null) {
            int i5 = component2 + 91;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            if (map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            sb.append(sb.toString().contains(Global.QUESTION) ? "&" : Global.QUESTION);
                            sb.append(entry.getKey());
                            sb.append("=");
                            sb.append(URLEncoder.encode(entry.getValue(), "utf-8"));
                        }
                    } catch (UnsupportedEncodingException e) {
                        L.d("=====", e.getMessage());
                    }
                }
                String string = sb.toString();
                int i7 = component2 + 65;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return string;
                }
                throw null;
            }
        }
        String string2 = sb.toString();
        int i8 = component2 + 85;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return string2;
    }

    public static boolean checkAdult(Date date) {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        int i2 = calendar.get(1) - calendar2.get(1);
        Integer numValueOf = Integer.valueOf(i2);
        numValueOf.getClass();
        if (i2 > 18) {
            int i3 = copydefault + 55;
            component2 = i3 % 128;
            return i3 % 2 == 0;
        }
        numValueOf.getClass();
        if (i2 < 18) {
            int i4 = copydefault + 25;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = calendar.get(2) - calendar2.get(2);
        Integer numValueOf2 = Integer.valueOf(i5);
        numValueOf2.getClass();
        if (i5 > 0) {
            return true;
        }
        numValueOf2.getClass();
        if (i5 >= 0) {
            int i6 = calendar.get(5) - calendar2.get(5);
            Integer.valueOf(i6).getClass();
            return i6 >= 0;
        }
        int i7 = copydefault + 111;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public static String stringToDecimal(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Locale locale = Locale.getDefault(Locale.Category.FORMAT);
        if (i3 == 0) {
            return stringToDecimal(str, locale);
        }
        stringToDecimal(str, locale);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String stringToDecimal(String str, Locale locale) {
        int i = 2 % 2;
        try {
            double d2 = Double.parseDouble(str);
            DecimalFormat decimalFormat = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(locale));
            decimalFormat.setMaximumFractionDigits(2);
            str = decimalFormat.format(Double.valueOf(d2));
        } catch (Exception e) {
            L.e(e.getMessage());
        }
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static String stringTodecimal(String str) {
        int i = 2 % 2;
        try {
            double d2 = Double.parseDouble(str);
            DecimalFormat decimalFormat = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
            decimalFormat.setMaximumFractionDigits(2);
            str = decimalFormat.format(Double.valueOf(d2));
            int i2 = component2 + 21;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            L.e(e.getMessage());
        }
        return str;
    }

    public static void setFilters(EditText editText, int i) {
        int i2 = 2 % 2;
        if (editText == null) {
            return;
        }
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(i);
        InputFilter[] filters = editText.getFilters();
        if (filters != null) {
            int i3 = copydefault + 57;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                if (filters.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (InputFilter inputFilter : filters) {
                        if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                            int i4 = component2 + 53;
                            copydefault = i4 % 128;
                            int i5 = i4 % 2;
                            arrayList.add(inputFilter);
                        }
                    }
                    InputFilter[] inputFilterArr = (InputFilter[]) arrayList.toArray(new InputFilter[0]);
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, inputFilterArr.length);
                    inputFilterArr2[inputFilterArr.length] = lengthFilter;
                    editText.setFilters(inputFilterArr2);
                    return;
                }
            } else {
                int length = filters.length;
                throw null;
            }
        }
        editText.setFilters(new InputFilter[]{lengthFilter});
    }

    public static void setSelectionActionModeDisabled(EditText editText) {
        int i = 2 % 2;
        editText.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 51;
                component2 = i3 % 128;
                return i3 % 2 == 0;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                int i2 = 2 % 2;
                int i3 = component2 + 105;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 37;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
                int i2 = 2 % 2;
                int i3 = component2 + 47;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 27;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 81;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        });
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public static String reducePointZero(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str) || !str.endsWith(".00")) {
            return str;
        }
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        String strSubstring = str.substring(0, i2 % 2 != 0 ? str.length() + 3 : str.length() - 3);
        int i3 = copydefault + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return strSubstring;
    }

    public static String clearBlank(String str) {
        int i = 2 % 2;
        if (!TextUtils.isEmpty(str)) {
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1.matcher(str).replaceAll("");
        }
        int i4 = copydefault + 3;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    public static <T> T convertMapToObject(Map<String, Object> map, Class<T> cls) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        try {
            T tNewInstance = cls.newInstance();
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i4 = 0;
            while (i4 < length) {
                Field field = declaredFields[i4];
                String name = field.getName();
                if (map.containsKey(name)) {
                    component1(field, tNewInstance, map.get(name));
                } else {
                    int i5 = component2 + 23;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
                i4++;
                int i7 = component2 + 121;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
            return tNewInstance;
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    private static void component1(final Field field, final Object obj, final Object obj2) {
        int i = 2 % 2;
        AccessController.doPrivileged(new PrivilegedAction() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object run() {
                int i2 = 2 % 2;
                int i3 = component1 + 15;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    CommonUtils.component3(field, obj, obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Void voidComponent3 = CommonUtils.component3(field, obj, obj2);
                int i4 = component3 + 31;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return voidComponent3;
            }
        });
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    static Void component3(Field field, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            field.setAccessible(false);
        } else {
            field.setAccessible(true);
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            L.e(e.getMessage());
        }
        int i3 = copydefault + 57;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
