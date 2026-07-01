package com.huawei.digitalpayment.checkout.util;

import com.safaricom.mpesa.logging.L;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\t"}, d2 = {"formatDate", "", "Ljava/util/Date;", "format", "inputFormat", "outputFormat", "convertDate", "formatDateTime", "", "ConsumerCheckOutUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DateExtensionsKt {
    private static int component1 = 0;
    private static int component2 = 1;

    public static final String formatDate(Date date, String str) {
        int i;
        String str2 = "";
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            str2 = new SimpleDateFormat(str, Locale.getDefault()).format(date);
            i = component2 + 119;
            component1 = i % 128;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
            }
            i = component1 + 29;
            component2 = i % 128;
        }
        int i3 = i % 2;
        return str2;
    }

    public static final String formatDate(String str, String str2, String str3) {
        String str4 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            str4 = new SimpleDateFormat(str3, Locale.getDefault()).format(new SimpleDateFormat(str2, Locale.getDefault()).parse(str));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
                int i2 = component2 + 33;
                component1 = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = component1 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str4;
    }

    public static final Date convertDate(String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
                int i2 = component2 + 35;
                component1 = i2 % 128;
                int i3 = i2 % 2;
            }
            return null;
        }
    }

    public static final String formatDateTime(long j, String str) {
        String str2 = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            str2 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
                int i2 = component1 + 111;
                component2 = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = component1 + 5;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = component2 + 117;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return str2;
    }
}
