package com.huawei.digitalpayment.consumer.base.util;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safaricom.mpesa.logging.L;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\t*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u0001\u001a\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u001a-\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0017*\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00170\u001aj\b\u0012\u0004\u0012\u0002H\u0017`\u0019¢\u0006\u0002\u0010\u001b\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0001¨\u0006\u001e"}, d2 = {"floatFormat", "", "", "numDecimalPoints", "", "isSuffixPrefix", "", "suffixPrefix", "formatDate", "Ljava/util/Date;", "format", "inputFormat", "outputFormat", "stringToDate", "stringToDateFormat", "stringToDateTimeFormat", "stringToDateTimeFormat12HourSystem", "populateSimpleSpinner", "", "Landroid/widget/Spinner;", "types", "", "loadItems", "T", FirebaseAnalytics.Param.ITEMS, "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Landroid/widget/Spinner;Ljava/util/ArrayList;)V", "capitalizeNames", "thousandthFormatter", "ConsumerBaseUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionMethodsKt {
    private static int ShareDataUIState = 1;
    private static int component2;

    public static final String floatFormat(float f, int i) {
        String str = "";
        int i2 = 2 % 2;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, "%,." + i + "f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            str = str2;
        } catch (Exception e) {
            L.INSTANCE.d("Formatting error 2", new Object[0]);
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
            }
            int i3 = component2 + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = ShareDataUIState + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final String floatFormat(String str, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, "%,." + i + "f", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            int i3 = component2 + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return str2;
        } catch (Exception e) {
            L.INSTANCE.d("Formatting error 2", new Object[0]);
            String message = e.getMessage();
            if (message == null) {
                return "";
            }
            L.INSTANCE.d(message, new Object[0]);
            int i5 = ShareDataUIState + 23;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return "";
        }
    }

    public static final String floatFormat(float f, int i, boolean z, String str) {
        int i2;
        int i3;
        String str2;
        int i4 = 2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str2 = String.format(Locale.ENGLISH, "%,." + i + "f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
        } catch (Exception e) {
            L.INSTANCE.d("Formatting error 3", new Object[0]);
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
            }
            i2 = ShareDataUIState + 5;
            i3 = i2 % 128;
        }
        if (z) {
            return str2 + " " + str;
        }
        str3 = str + " " + str2;
        i2 = ShareDataUIState + 81;
        i3 = i2 % 128;
        component2 = i3;
        int i5 = i2 % 2;
        return str3;
    }

    public static final String formatDate(Date date, String str) {
        String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            str2 = new SimpleDateFormat(str, Locale.getDefault()).format(date);
            int i2 = component2 + 31;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 2;
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
            }
        }
        return str2;
    }

    public static final String formatDate(String str, String str2, String str3) {
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            str4 = new SimpleDateFormat(str3, Locale.getDefault()).format(new SimpleDateFormat(str2, Locale.getDefault()).parse(str));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
            }
        }
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str4;
        }
        throw null;
    }

    public static final Date stringToDate(String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Date date = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return date;
        } catch (Exception e) {
            System.out.println((Object) e.getMessage());
            return null;
        }
    }

    public static final String stringToDateFormat(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            int i2 = ShareDataUIState + 13;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                int i4 = 43 / 0;
            }
            int i5 = i3 + 91;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "--";
        }
        String strSubstring = str.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String strSubstring2 = str.substring(4, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        String strSubstring3 = str.substring(6, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s-%s-%s", Arrays.copyOf(new Object[]{strSubstring, strSubstring2, strSubstring3}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static final String stringToDateTimeFormat(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (str.length() == 0) {
                return "--";
            }
            String strSubstring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String[] shortMonths = new DateFormatSymbols().getShortMonths();
            Intrinsics.checkNotNullExpressionValue(str.substring(4, 6), "");
            String str2 = shortMonths[Integer.parseInt(r3) - 1];
            String strSubstring2 = str.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            String strSubstring3 = str.substring(8, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            String strSubstring4 = str.substring(10, 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str3 = String.format("%s %s %s %s:%s", Arrays.copyOf(new Object[]{strSubstring2, str2, strSubstring, strSubstring3, strSubstring4}, 5));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return str3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            e.printStackTrace();
            return "--";
        }
    }

    public static final String stringToDateTimeFormat12HourSystem(String str) {
        Exception e;
        int i = 2 % 2;
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        String str2 = "--";
        String str3 = "";
        try {
        } catch (Exception e2) {
            e = e2;
        }
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str.length();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 79;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 115;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = ShareDataUIState + 109;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return str2;
        }
        String strSubstring = str.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        Intrinsics.checkNotNullExpressionValue(str.substring(4, 6), "");
        String str4 = shortMonths[Integer.parseInt(r5) - 1];
        String strSubstring2 = str.substring(6, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        String strSubstring3 = str.substring(8, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        String strSubstring4 = str.substring(10, 12);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str5 = String.format("%s %s %s %s:%s", Arrays.copyOf(new Object[]{strSubstring2, str4, strSubstring, strSubstring3, strSubstring4}, 5));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        try {
            Date date = new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).parse(str5);
            str3 = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format((Date) Objects.requireNonNull(date)) + " " + new SimpleDateFormat("hh:mm a", Locale.getDefault()).format(date);
        } catch (Exception e3) {
            try {
                e3.printStackTrace();
            } catch (Exception e4) {
                e = e4;
                str2 = str5;
                e.printStackTrace();
                int i82 = ShareDataUIState + 109;
                component2 = i82 % 128;
                int i92 = i82 % 2;
                return str2;
            }
        }
        int i10 = component2 + 93;
        ShareDataUIState = i10 % 128;
        if (i10 % 2 != 0) {
            return str3;
        }
        throw null;
    }

    public static final void populateSimpleSpinner(Spinner spinner, List<String> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(spinner, "");
        Intrinsics.checkNotNullParameter(list, "");
        ArrayAdapter arrayAdapter = new ArrayAdapter(spinner.getContext(), R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static final <T> void loadItems(Spinner spinner, ArrayList<T> arrayList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(spinner, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter<T>(arrayList, spinner.getContext()) {
            private static int component2 = 1;
            private static int component3;

            {
                super(context, R.layout.simple_spinner_dropdown_item, arrayList);
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(parent, "");
                View dropDownView = super.getDropDownView(position, convertView, parent);
                Intrinsics.checkNotNull(dropDownView, "");
                TextView textView = (TextView) dropDownView;
                if (position == 0) {
                    int i3 = component3 + 17;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    textView.setTextColor(ContextCompat.getColor(getContext(), com.huawei.digitalpayment.consumer.baseui.R.color.color_cbcdcc));
                } else {
                    textView.setTextColor(ContextCompat.getColor(getContext(), com.huawei.digitalpayment.consumer.baseui.R.color.color_99000000));
                }
                TextView textView2 = textView;
                int i5 = component3 + 67;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return textView2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(parent, "");
                    View view = super.getView(position, convertView, parent);
                    Intrinsics.checkNotNull(view, "");
                    return (TextView) view;
                }
                Intrinsics.checkNotNullParameter(parent, "");
                View view2 = super.getView(position, convertView, parent);
                Intrinsics.checkNotNull(view2, "");
                throw null;
            }

            @Override
            public boolean isEnabled(int position) {
                boolean z;
                int i2 = 2 % 2;
                if (position != 0) {
                    int i3 = component2 + 95;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                } else {
                    z = false;
                }
                int i5 = component2 + 109;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return z;
            }
        });
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    private static final CharSequence component3(String str) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            str = upperCase + strSubstring;
            int i4 = component2 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return str;
    }

    public static final String capitalizeNames(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return CollectionsKt.joinToString$default(new Regex("\\W+").split(lowerCase, 0), " ", null, null, 0, null, new Function1() {
                private static int component1 = 1;
                private static int component2;

                @Override
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 119;
                    component1 = i3 % 128;
                    String str2 = (String) obj;
                    if (i3 % 2 != 0) {
                        return ExtensionMethodsKt.$r8$lambda$hnUoD0u1dOIeSqqEyzRBVq0pEws(str2);
                    }
                    ExtensionMethodsKt.$r8$lambda$hnUoD0u1dOIeSqqEyzRBVq0pEws(str2);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, 30, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
                int i2 = ShareDataUIState + 1;
                component2 = i2 % 128;
                int i3 = i2 % 2;
            }
            return str;
        }
    }

    public static final String thousandthFormatter(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            float f = Float.parseFloat(str);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str2 = String.format(Locale.getDefault(), "%,.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
        } catch (Exception e) {
            e.printStackTrace();
            str2 = "--";
        }
        int i4 = ShareDataUIState + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static CharSequence $r8$lambda$hnUoD0u1dOIeSqqEyzRBVq0pEws(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceComponent3 = component3(str);
        int i4 = ShareDataUIState + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return charSequenceComponent3;
        }
        throw null;
    }
}
