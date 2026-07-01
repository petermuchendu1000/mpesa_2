package com.huawei.digitalpayment.datepicker.library;

import android.os.Parcel;
import android.os.Parcelable;
import com.blankj.utilcode.util.TimeUtils;
import com.huawei.common.util.L;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public class FullDay implements Parcelable {
    public static final Parcelable.Creator<FullDay> CREATOR = new Parcelable.Creator<FullDay>() {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        @Override
        public FullDay createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 9;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                component3(parcel);
                throw null;
            }
            FullDay fullDayComponent3 = component3(parcel);
            int i3 = copydefault + 65;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return fullDayComponent3;
        }

        @Override
        public FullDay[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 25;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FullDay[] fullDayArrShareDataUIState = ShareDataUIState(i);
            int i5 = ShareDataUIState + 41;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return fullDayArrShareDataUIState;
            }
            throw null;
        }

        public FullDay[] ShareDataUIState(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 7;
            ShareDataUIState = i3 % 128;
            FullDay[] fullDayArr = new FullDay[i];
            if (i3 % 2 != 0) {
                return fullDayArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public FullDay component3(Parcel parcel) {
            int i = 2 % 2;
            FullDay fullDay = new FullDay(parcel);
            int i2 = ShareDataUIState + 63;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return fullDay;
            }
            throw null;
        }
    };
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private int day;
    private int dayFlag;
    private int month;
    private int weekOf;
    private int year;

    public FullDay(int i, int i2, int i3) {
        this.dayFlag = 2;
        this.year = i;
        this.month = i2;
        this.day = i3;
    }

    public FullDay(int i, int i2, int i3, int i4) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.dayFlag = i4;
    }

    public int getDay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.day;
        int i6 = i2 + 115;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void setDay(int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 89;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.day = i;
        int i6 = i3 + 105;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getMonth() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.month;
        }
        throw null;
    }

    public void setMonth(int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.month = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 43;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getYear() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.year;
            int i5 = 79 / 0;
        } else {
            i = this.year;
        }
        int i6 = i3 + 27;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setYear(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 87;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.year = i;
        if (i4 == 0) {
            throw null;
        }
    }

    public void setWeekOf(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 55;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        this.weekOf = i;
        int i6 = i4 + 73;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getDayFlag() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.dayFlag;
        int i5 = i3 + 97;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public void setDayFlag(int i) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.dayFlag = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 125;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public int getWeekOf() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 21;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0) {
            i = this.weekOf;
            int i5 = 59 / 0;
        } else {
            i = this.weekOf;
        }
        int i6 = i4 + 13;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public String dateFormat(String str) {
        long timeInMillis;
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(this.year, this.month - 1, this.day);
                timeInMillis = calendar.getTimeInMillis();
            } else {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(this.year, this.month - 1, this.day);
                timeInMillis = calendar2.getTimeInMillis();
            }
            return TimeUtils.millis2String(timeInMillis, str);
        } catch (Exception e) {
            L.e(e.getMessage());
            return "";
        }
    }

    public long getTimeInMillis() {
        Calendar calendar;
        int i = 2 % 2;
        int i2 = component3 + 19;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            calendar = Calendar.getInstance();
            calendar.set(this.year, this.month % 1, this.day, 1, 1, 0);
            calendar.set(39, 1);
        } else {
            calendar = Calendar.getInstance();
            calendar.set(this.year, this.month - 1, this.day, 0, 0, 0);
            calendar.set(14, 0);
        }
        long timeInMillis = calendar.getTimeInMillis();
        int i3 = component1 + 19;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return timeInMillis;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getDaysFromNow() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(this.year, this.month - 1, this.day);
        int timeInMillis2 = (int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000);
        int i4 = component3 + 107;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return timeInMillis2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = component1 + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            int i4 = component1 + 53;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        FullDay fullDay = (FullDay) obj;
        if (this.year == fullDay.year) {
            return this.month == fullDay.month && this.day == fullDay.day;
        }
        int i5 = component3 + 121;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FullDay{year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", weekOf=" + this.weekOf + AbstractJsonLexerKt.END_OBJ;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return (((this.year << 114) + this.month) % 36) << this.day;
        }
        return (((this.year * 31) + this.month) * 31) + this.day;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 101;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            parcel.writeInt(this.dayFlag);
            parcel.writeInt(this.year);
            parcel.writeInt(this.month);
            parcel.writeInt(this.day);
            parcel.writeInt(this.weekOf);
            return;
        }
        parcel.writeInt(this.dayFlag);
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
        parcel.writeInt(this.day);
        parcel.writeInt(this.weekOf);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected FullDay(Parcel parcel) {
        this.dayFlag = 2;
        this.day = parcel.readInt();
        this.month = parcel.readInt();
        this.year = parcel.readInt();
        this.weekOf = parcel.readInt();
        this.dayFlag = parcel.readInt();
    }

    static {
        int i = copydefault + 75;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    @Override
    public int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }
}
