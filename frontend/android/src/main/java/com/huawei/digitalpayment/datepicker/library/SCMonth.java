package com.huawei.digitalpayment.datepicker.library;

import android.os.Parcel;
import android.os.Parcelable;
import com.blankj.utilcode.util.Utils;
import com.huawei.digitalpayment.datepicker.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SCMonth implements Parcelable {
    public static final int COL_COUNT = 7;
    public static final Parcelable.Creator<SCMonth> CREATOR = new Parcelable.Creator<SCMonth>() {
        private static int component2 = 1;
        private static int copydefault;

        @Override
        public SCMonth createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SCMonth sCMonthShareDataUIState = ShareDataUIState(parcel);
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            return sCMonthShareDataUIState;
        }

        @Override
        public SCMonth[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                component3(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SCMonth[] sCMonthArrComponent3 = component3(i);
            int i4 = component2 + 47;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return sCMonthArrComponent3;
        }

        public SCMonth[] component3(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 39;
            copydefault = i3 % 128;
            SCMonth[] sCMonthArr = new SCMonth[i];
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
            }
            return sCMonthArr;
        }

        public SCMonth ShareDataUIState(Parcel parcel) {
            int i = 2 % 2;
            SCMonth sCMonth = new SCMonth(parcel);
            int i2 = copydefault + 39;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return sCMonth;
            }
            throw null;
        }
    };
    public static final int MONDAY_OF_WEEK = 2;
    public static final int ROW_COUNT = 6;
    public static final int SATURDAY_OF_WEEK = 7;
    public static final int SUNDAY_OF_WEEK = 1;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private int dayCountOfPrevMonth;
    private int firstDayOfWeek;
    private int firstdayOfWeekPosInMonth;
    protected int month;
    private FullDay[][] monthDays;
    private SCMonth nextMonth;
    private SCMonth prevMonth;
    private FullDay rangeEndDay;
    private FullDay rangeStartDay;
    private int realRowCount;
    protected List<FullDay> selectedDays;
    protected int year;

    @Retention(RetentionPolicy.SOURCE)
    public @interface WeekType {
    }

    public SCMonth(int i, int i2) {
        this.selectedDays = new ArrayList(5);
        this.monthDays = (FullDay[][]) Array.newInstance((Class<?>) FullDay.class, 6, 7);
        this.year = i;
        this.month = i2;
    }

    public SCMonth(int i, int i2, int i3) {
        this.selectedDays = new ArrayList(5);
        this.monthDays = (FullDay[][]) Array.newInstance((Class<?>) FullDay.class, 6, 7);
        this.year = i;
        this.month = i2;
        this.firstDayOfWeek = i3;
        calculateDays();
    }

    public SCMonth(int i, int i2, int i3, FullDay fullDay, FullDay fullDay2) {
        this.selectedDays = new ArrayList(5);
        this.monthDays = (FullDay[][]) Array.newInstance((Class<?>) FullDay.class, 6, 7);
        this.year = i;
        this.month = i2;
        this.firstDayOfWeek = i3;
        this.rangeStartDay = fullDay;
        this.rangeEndDay = fullDay2;
        calculateDays();
    }

    public FullDay getRangeStartDay() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        FullDay fullDay = this.rangeStartDay;
        int i5 = i3 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return fullDay;
    }

    public void setRangeStartDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.rangeStartDay = fullDay;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public FullDay getRangeEndDay() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        FullDay fullDay = this.rangeEndDay;
        int i5 = i3 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return fullDay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRangeEndDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.rangeEndDay = fullDay;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void calculateDays() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.SCMonth.calculateDays():void");
    }

    private void currentMonth(FullDay fullDay, FullDay fullDay2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component2 + 115;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (fullDay == null) {
            this.monthDays[i][i2 - 1] = new FullDay(fullDay2.getYear(), fullDay2.getMonth(), fullDay2.getDay());
        } else {
            fullDay.setYear(fullDay2.getYear());
            fullDay.setMonth(fullDay2.getMonth());
            fullDay.setDay(fullDay2.getDay());
        }
        int i5 = copydefault + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public SCMonth getPrevMonth() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        SCMonth sCMonth = this.prevMonth;
        int i5 = i2 + 87;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sCMonth;
    }

    public SCMonth getNextMonth() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        SCMonth sCMonth = this.nextMonth;
        int i5 = i3 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sCMonth;
    }

    public FullDay[][] getMonthDays() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.monthDays;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getRealRowCount() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.realRowCount;
        }
        throw null;
    }

    public void setRealRowCount(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 87;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        this.realRowCount = i;
        int i6 = i3 + 39;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getMonth() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.month;
        }
        throw null;
    }

    public void setMonth(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 97;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        this.month = i;
        int i6 = i4 + 41;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 63 / 0;
        }
    }

    public String getMonthDisplay() {
        int i = 2 % 2;
        switch (this.month) {
            case 1:
                return Utils.getApp().getString(R.string.month_january);
            case 2:
                return Utils.getApp().getString(R.string.month_february);
            case 3:
                String string = Utils.getApp().getString(R.string.month_march);
                int i2 = component2 + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return string;
            case 4:
                return Utils.getApp().getString(R.string.month_april);
            case 5:
                return Utils.getApp().getString(R.string.month_may);
            case 6:
                return Utils.getApp().getString(R.string.month_june);
            case 7:
                return Utils.getApp().getString(R.string.month_july);
            case 8:
                return Utils.getApp().getString(R.string.month_august);
            case 9:
                String string2 = Utils.getApp().getString(R.string.month_september);
                int i4 = copydefault + 39;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return string2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 10:
                return Utils.getApp().getString(R.string.month_october);
            case 11:
                return Utils.getApp().getString(R.string.month_november);
            case 12:
                return Utils.getApp().getString(R.string.month_december);
            default:
                return "";
        }
    }

    public int getYear() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.year;
        int i6 = i3 + 123;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setYear(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 125;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        this.year = i;
        if (i5 == 0) {
            int i6 = 53 / 0;
        }
        int i7 = i4 + 73;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 36 / 0;
        }
    }

    protected List<FullDay> getSelectedDays() {
        List<FullDay> list;
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            list = this.selectedDays;
            int i4 = 25 / 0;
        } else {
            list = this.selectedDays;
        }
        int i5 = i3 + 53;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSelectedDays(List<FullDay> list) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.selectedDays = list;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void addSelectedDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        getSelectedDays().add(fullDay);
        int i4 = copydefault + 33;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = component2 + 85;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SCMonth sCMonth = (SCMonth) obj;
        if (this.year != sCMonth.year) {
            int i3 = copydefault + 47;
            component2 = i3 % 128;
            return i3 % 2 != 0;
        }
        boolean z = this.month == sCMonth.month;
        int i4 = copydefault + 77;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.year + "-" + this.month;
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = (this.year * 31) + this.month;
        int i6 = i2 + 111;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 3;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            parcel.writeInt(this.month);
            parcel.writeInt(this.year);
            parcel.writeTypedList(this.selectedDays);
        } else {
            parcel.writeInt(this.month);
            parcel.writeInt(this.year);
            parcel.writeTypedList(this.selectedDays);
            throw null;
        }
    }

    protected SCMonth(Parcel parcel) {
        this.selectedDays = new ArrayList(5);
        this.monthDays = (FullDay[][]) Array.newInstance((Class<?>) FullDay.class, 6, 7);
        this.month = parcel.readInt();
        this.year = parcel.readInt();
        this.selectedDays = parcel.createTypedArrayList(FullDay.CREATOR);
        calculateDays();
    }

    static {
        int i = component1 + 49;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @Override
    public int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }
}
