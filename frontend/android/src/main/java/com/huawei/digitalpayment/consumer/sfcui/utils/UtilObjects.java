package com.huawei.digitalpayment.consumer.sfcui.utils;

import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.constant.CacheConstants;
import com.huawei.digitalpayment.consumer.sfcui.constants.Constants;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import com.safaricom.mpesa.logging.L;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\n\u0010\t\u001a\u00020\u0005*\u00020\nJ\f\u0010\u000b\u001a\u00020\u0005*\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\r¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/UtilObjects;", "", "<init>", "()V", "formatDate", "", "timestamp", "getFixedDueDate", "getCurrentFormattedDateTime", "formatAmount", "", "formatDueDate", "getParsedDate", "Ljava/util/Date;", "s", "getRemainingTime", "endDate", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UtilObjects {
    public static final int $stable = 0;
    public static final UtilObjects INSTANCE = new UtilObjects();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    private UtilObjects() {
    }

    public final String formatDate(String timestamp) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = timestamp;
        if (str == null) {
            return "";
        }
        if (str.length() == 0) {
            int i4 = copydefault + 63;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault()).parse(timestamp);
            if (date != null) {
                return new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(date);
            }
            int i6 = component2 + 85;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 38 / 0;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final String getFixedDueDate() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 16);
        String str = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getCurrentFormattedDateTime() {
        int i = 2 % 2;
        String str = new SimpleDateFormat("dd-MMM-yyyy hh:mm a", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i2 = copydefault + 117;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return str;
    }

    public final String formatAmount(float f) {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArr = new Object[0];
            objArr[1] = Float.valueOf(f);
            str = String.format("%,.2f", Arrays.copyOf(objArr, 1));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("%,.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = copydefault + 1;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String formatDueDate(String str) {
        int i = 2 % 2;
        String str2 = str;
        if (str2 != null) {
            int i2 = component2 + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (str2.length() != 0) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Constants.ISO_DATE_FORMAT, Locale.getDefault());
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
                    Date date = simpleDateFormat.parse(str);
                    if (date != null) {
                        int i4 = copydefault + 83;
                        component2 = i4 % 128;
                        if (i4 % 2 != 0) {
                            String str3 = simpleDateFormat2.format(date);
                            int i5 = 27 / 0;
                            if (str3 != null) {
                                return str3;
                            }
                        } else {
                            String str4 = simpleDateFormat2.format(date);
                            if (str4 != null) {
                                return str4;
                            }
                        }
                    }
                    return getFixedDueDate();
                } catch (Exception unused) {
                    return getFixedDueDate();
                }
            }
        }
        return getFixedDueDate();
    }

    public final Date getParsedDate(String s) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(s, "");
        try {
            Date date = new Date();
            Date date2 = new SimpleDateFormat("h:mmaa", Locale.getDefault()).parse(s);
            if (date2 != null) {
                int i2 = component2 + 105;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                date.setHours(date2.getHours());
                date.setMinutes(date2.getMinutes());
                date.setSeconds(0);
                int i4 = copydefault + 71;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return date;
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
            }
        }
        return null;
    }

    public final String getRemainingTime(Date endDate) {
        String strValueOf;
        String strValueOf2;
        int i;
        String strValueOf3;
        int i2 = 2 % 2;
        int i3 = copydefault + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (endDate == null) {
            return "";
        }
        long time = (endDate.getTime() - new Date().getTime()) / ((long) 1000);
        long j = CacheConstants.HOUR;
        long j2 = time % j;
        int i5 = (int) (j2 % ((long) 60));
        long j3 = time / j;
        int i6 = (int) ((j2 / 3600.0d) * ((double) 60));
        if (j3 < 10) {
            strValueOf = "0" + j3;
        } else {
            strValueOf = String.valueOf(j3);
        }
        if (i6 < 10) {
            strValueOf2 = "0" + i6;
            i = component2 + 11;
            copydefault = i % 128;
        } else {
            strValueOf2 = String.valueOf(i6);
            i = copydefault + 39;
            component2 = i % 128;
        }
        int i7 = i % 2;
        if (i5 < 10) {
            strValueOf3 = "0" + i5;
        } else {
            strValueOf3 = String.valueOf(i5);
        }
        if (j3 > 0) {
            return strValueOf + "H " + strValueOf2 + "M " + strValueOf3 + ExifInterface.LATITUDE_SOUTH;
        }
        if (i6 > 0) {
            return strValueOf2 + "M " + strValueOf3 + ExifInterface.LATITUDE_SOUTH;
        }
        if (i5 <= 0) {
            return TransactionHistoryDetailResponse.EXPIRED;
        }
        return strValueOf3 + ExifInterface.LATITUDE_SOUTH;
    }

    static {
        int i = component3 + 51;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
