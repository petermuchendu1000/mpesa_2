package com.huawei.digitalpayment.datepicker.library;

import com.huawei.common.util.L;
import java.util.Calendar;

public class SCDateUtils {
    private static int component1 = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static final String[] ShareDataUIState = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    private static final String[] copydefault = {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"};
    private static final String[] component3 = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    private static int component2 = 19 % 128;

    static {
        int i = 19 % 2;
    }

    public static int getCurrentYear() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = Calendar.getInstance().get(1);
        int i5 = getRequestBeneficiariesState + 57;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static int getCurrentMonth() {
        int i = 2 % 2;
        int i2 = equals + 53;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = Calendar.getInstance().get(2) + 1;
        int i5 = equals + 111;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public static int getCurrentDay() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = Calendar.getInstance().get(5);
        int i5 = getRequestBeneficiariesState + 87;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return i4;
    }

    public static FullDay getCurrentFullDay() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        FullDay fullDay = new FullDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        int i2 = equals + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return fullDay;
    }

    public static int mapDayOfWeekInMonth(int i, int i2) {
        int i3 = 2 % 2;
        if (i2 > 0 && i2 != 1) {
            String str = component3[i - 1];
            int i4 = 0;
            if (i2 == 2) {
                while (true) {
                    String[] strArr = ShareDataUIState;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    int i5 = getRequestBeneficiariesState + 15;
                    equals = i5 % 128;
                    int i6 = i5 % 2;
                    if (str.equals(strArr[i4])) {
                        int i7 = equals + 37;
                        getRequestBeneficiariesState = i7 % 128;
                        return i7 % 2 == 0 ? i4 << 1 : i4 + 1;
                    }
                    i4++;
                }
            } else if (i2 == 7) {
                int i8 = equals + 51;
                getRequestBeneficiariesState = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 / 0;
                }
                while (true) {
                    String[] strArr2 = copydefault;
                    if (i4 >= strArr2.length) {
                        break;
                    }
                    int i10 = getRequestBeneficiariesState + 85;
                    equals = i10 % 128;
                    if (i10 % 2 != 0) {
                        str.equals(strArr2[i4]);
                        throw null;
                    }
                    if (str.equals(strArr2[i4])) {
                        int i11 = equals + 1;
                        getRequestBeneficiariesState = i11 % 128;
                        int i12 = i11 % 2;
                        return i4 + 1;
                    }
                    i4++;
                    int i13 = getRequestBeneficiariesState + 11;
                    equals = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
        }
        return i;
    }

    public static int getDayOfWeekInMonth(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = equals + 89;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        int i6 = calendar.get(7);
        int i7 = getRequestBeneficiariesState + 123;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 10 / 0;
        }
        return i6;
    }

    public static SCMonth prevMonth(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = equals;
        int i6 = i5 + 67;
        int i7 = i6 % 128;
        getRequestBeneficiariesState = i7;
        int i8 = i6 % 2;
        if (i2 == 1) {
            int i9 = i5 + 57;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            i--;
            i3 = 12;
        } else {
            i3 = i2 - 1;
            int i11 = i7 + 29;
            equals = i11 % 128;
            int i12 = i11 % 2;
        }
        return new SCMonth(i, i3);
    }

    public static int getDayCountOfMonth(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = equals;
        int i5 = i4 + 105;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int[] iArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            iArr[1] = 29;
        }
        try {
            int i7 = iArr[i2 - 1];
            int i8 = i4 + 5;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return i7;
        } catch (Exception e) {
            L.e(e.getMessage());
            return 0;
        }
    }

    public static SCMonth nextMonth(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 89;
        equals = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 1;
        if (i2 == 12) {
            i++;
        } else {
            i6 = 1 + i2;
        }
        SCMonth sCMonth = new SCMonth(i, i6);
        int i7 = getRequestBeneficiariesState + 123;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return sCMonth;
    }

    public static boolean isToday(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = equals + 101;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        if (i == getCurrentYear()) {
            int i7 = equals + 119;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            if (i2 == getCurrentMonth() && i3 == getCurrentDay()) {
                int i9 = getRequestBeneficiariesState + 7;
                equals = i9 % 128;
                return !(i9 % 2 != 0);
            }
        }
        int i10 = getRequestBeneficiariesState + 55;
        equals = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public static int countDays(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        int i7 = 2 % 2;
        int i8 = equals + 35;
        getRequestBeneficiariesState = i8 % 128;
        int i9 = i8 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, i3);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, i4);
        calendar2.set(2, i5 - 1);
        calendar2.set(5, i6);
        long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        if (timeInMillis > 0) {
            int i10 = getRequestBeneficiariesState + 21;
            equals = i10 % 128;
            int i11 = i10 % 2;
            j = (timeInMillis / 86400000) + 1;
        } else {
            j = (timeInMillis / 86400000) - 1;
        }
        return (int) j;
    }

    public static int getDaysFromNow(int i, int i2, int i3) {
        long timeInMillis;
        int i4 = 2 % 2;
        int i5 = equals + 17;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis2 = calendar.getTimeInMillis();
            calendar.set(i, i2 + 1, i3);
            timeInMillis = (calendar.getTimeInMillis() & timeInMillis2) | 86400000;
        } else {
            Calendar calendar2 = Calendar.getInstance();
            long timeInMillis3 = calendar2.getTimeInMillis();
            calendar2.set(i, i2 - 1, i3);
            timeInMillis = (calendar2.getTimeInMillis() - timeInMillis3) / 86400000;
        }
        return (int) timeInMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.huawei.digitalpayment.datepicker.library.SCMonth> generateMonths(com.huawei.digitalpayment.datepicker.library.FullDay r16, com.huawei.digitalpayment.datepicker.library.FullDay r17, int r18) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.SCDateUtils.generateMonths(com.huawei.digitalpayment.datepicker.library.FullDay, com.huawei.digitalpayment.datepicker.library.FullDay, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r5 r8
  0x0033: PHI (r5v1 long) = (r5v0 long), (r5v2 long) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r8v2 long) = (r8v1 long), (r8v4 long) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isInDateRange(com.huawei.digitalpayment.datepicker.library.FullDay r7, com.huawei.digitalpayment.datepicker.library.FullDay r8, com.huawei.digitalpayment.datepicker.library.FullDay r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.datepicker.library.SCDateUtils.getRequestBeneficiariesState
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.SCDateUtils.equals = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L23
            long r3 = r8.getTimeInMillis()
            long r8 = r9.getTimeInMillis()
            long r5 = r7.getTimeInMillis()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r1 = 28
            int r1 = r1 / r2
            if (r7 < 0) goto L38
            goto L33
        L23:
            long r3 = r8.getTimeInMillis()
            long r8 = r9.getTimeInMillis()
            long r5 = r7.getTimeInMillis()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 < 0) goto L38
        L33:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 > 0) goto L38
            r2 = 1
        L38:
            int r7 = com.huawei.digitalpayment.datepicker.library.SCDateUtils.equals
            int r7 = r7 + 39
            int r8 = r7 % 128
            com.huawei.digitalpayment.datepicker.library.SCDateUtils.getRequestBeneficiariesState = r8
            int r7 = r7 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.SCDateUtils.isInDateRange(com.huawei.digitalpayment.datepicker.library.FullDay, com.huawei.digitalpayment.datepicker.library.FullDay, com.huawei.digitalpayment.datepicker.library.FullDay):boolean");
    }

    public static boolean isMonthDay(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        if (i3 != i) {
            int i6 = getRequestBeneficiariesState + 31;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (i4 == i2) {
            return true;
        }
        int i8 = equals + 39;
        getRequestBeneficiariesState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public static boolean isNextMonthDay(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = equals;
        int i7 = i6 + 15;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0 ? i3 - i == 1 : (i3 << i) == 1) {
            if (i4 == 1) {
                return true;
            }
        }
        if (i3 != i) {
            int i8 = i6 + 75;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (i4 - 1 == i2) {
            return true;
        }
        int i10 = i6 + 59;
        getRequestBeneficiariesState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public static boolean isPrevMonthDay(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = equals + 35;
        int i7 = i6 % 128;
        getRequestBeneficiariesState = i7;
        int i8 = i6 % 2;
        if (i - i3 == 1) {
            int i9 = i7 + 93;
            equals = i9 % 128;
            if (i9 % 2 == 0 ? i4 == 12 : i4 == 94) {
                return true;
            }
        }
        if (i3 != i) {
            int i10 = i7 + 53;
            equals = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (i4 + 1 != i2) {
            return false;
        }
        int i12 = i7 + 23;
        equals = i12 % 128;
        if (i12 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
