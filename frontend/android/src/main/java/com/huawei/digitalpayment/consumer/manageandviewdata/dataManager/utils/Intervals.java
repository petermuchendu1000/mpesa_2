package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils;

import android.util.Log;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.TimeInterval;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0%2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0%2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001eH\u0002R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/utils/Intervals;", "", "<init>", "()V", "today", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "getToday", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "yesterday", "getYesterday", "last24Hours", "getLast24Hours", "last7days", "getLast7days", "last30days", "getLast30days", "week", "getWeek", "month", "getMonth", "currentPeriod", "getCurrentPeriod", "currentMonth", "getCurrentMonth", "monthlyPlan", "startDay", "", "weeklyPlan", "twoDateInterval", "startDate", "Ljava/util/Date;", "endDate", "getIntervalFromStartEnd", "start", "", "end", "getListOfIntervals", "", "getDatesBetween", "getHoursBetween", "getCalendarWithoutTime", "Ljava/util/Calendar;", "date", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Intervals {
    public static final int $stable = 0;
    public static final Intervals INSTANCE = new Intervals();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private Intervals() {
    }

    public final TimeInterval getToday() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        TimeInterval timeInterval = new TimeInterval(time, calendar.getTime(), timeInMillis, calendar.getTimeInMillis());
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final TimeInterval getYesterday() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        TimeInterval timeInterval = new TimeInterval(time, calendar.getTime(), timeInMillis, calendar.getTimeInMillis());
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return timeInterval;
        }
        throw null;
    }

    public final TimeInterval getLast24Hours() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(11, -24);
        TimeInterval timeInterval = new TimeInterval(calendar.getTime(), time, calendar.getTimeInMillis(), timeInMillis);
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return timeInterval;
        }
        throw null;
    }

    public final TimeInterval getLast7days() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(5, -7);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        TimeInterval timeInterval = new TimeInterval(calendar.getTime(), time, calendar.getTimeInMillis(), timeInMillis);
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final TimeInterval getLast30days() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(5, -30);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        TimeInterval timeInterval = new TimeInterval(calendar.getTime(), time, calendar.getTimeInMillis(), timeInMillis);
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final TimeInterval getWeek() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, 2);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(5, 6);
        TimeInterval timeInterval = new TimeInterval(time, calendar.getTime(), timeInMillis, calendar.getTimeInMillis());
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final TimeInterval getMonth() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(2, 1);
        TimeInterval timeInterval = new TimeInterval(time, calendar.getTime(), timeInMillis, calendar.getTimeInMillis());
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return timeInterval;
        }
        throw null;
    }

    public final TimeInterval getCurrentPeriod() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        TimeInterval timeInterval = new TimeInterval(time, calendar2.getTime(), timeInMillis, calendar2.getTimeInMillis());
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return timeInterval;
    }

    public final TimeInterval getCurrentMonth() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        TimeInterval timeInterval = new TimeInterval(time, calendar2.getTime(), timeInMillis, calendar2.getTimeInMillis());
        int i2 = component1 + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final TimeInterval monthlyPlan(int startDay) {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, startDay);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(2, 1);
        TimeInterval timeInterval = new TimeInterval(time, calendar.getTime(), timeInMillis, calendar.getTimeInMillis());
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return timeInterval;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TimeInterval weeklyPlan(int startDay) {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, startDay);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        long timeInMillis = calendar.getTimeInMillis();
        Date time = calendar.getTime();
        calendar.add(5, 6);
        TimeInterval timeInterval = new TimeInterval(time, calendar.getTime(), timeInMillis, calendar.getTimeInMillis());
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final TimeInterval twoDateInterval(Date startDate, Date endDate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startDate, "");
        Intrinsics.checkNotNullParameter(endDate, "");
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
        calendar2.set(11, 0);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        TimeInterval timeInterval = new TimeInterval(startDate, endDate, calendar.getTimeInMillis(), calendar2.getTimeInMillis());
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return timeInterval;
    }

    public final TimeInterval getIntervalFromStartEnd(long start, long end) {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(start);
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(end);
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        TimeInterval timeInterval = new TimeInterval(calendar.getTime(), calendar2.getTime(), calendar.getTimeInMillis(), calendar2.getTimeInMillis());
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return timeInterval;
    }

    public final List<TimeInterval> getListOfIntervals(long start, long end) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(start);
        int i2 = 0;
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(end);
        calendar2.set(11, 23);
        calendar2.set(12, 59);
        calendar2.set(13, 59);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        Date time2 = calendar2.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "");
        List<Date> listComponent1 = component1(time, time2);
        if (listComponent1.size() < 4) {
            Date time3 = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time3, "");
            Date time4 = calendar2.getTime();
            Intrinsics.checkNotNullExpressionValue(time4, "");
            for (Date date : copydefault(time3, time4)) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(date);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.setTime(date);
                calendar4.set(13, 59);
                arrayList.add(new TimeInterval(calendar3.getTime(), calendar4.getTime(), calendar3.getTimeInMillis(), calendar4.getTimeInMillis()));
            }
        } else {
            int i3 = component1 + 15;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                for (Date date2 : listComponent1) {
                    Calendar calendar5 = Calendar.getInstance();
                    calendar5.setTime(date2);
                    calendar5.set(11, 0);
                    calendar5.clear(12);
                    calendar5.clear(13);
                    calendar5.clear(14);
                    Calendar calendar6 = Calendar.getInstance();
                    calendar6.setTime(date2);
                    calendar6.set(11, 23);
                    calendar6.set(12, 59);
                    calendar6.set(13, 59);
                    arrayList.add(new TimeInterval(calendar5.getTime(), calendar6.getTime(), calendar5.getTimeInMillis(), calendar6.getTimeInMillis()));
                }
            } else {
                listComponent1.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        for (Object obj2 : arrayList) {
            if (i2 < 0) {
                int i4 = ShareDataUIState + 19;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                CollectionsKt.throwIndexOverflow();
            }
            TimeInterval timeInterval = (TimeInterval) obj2;
            Log.d(INSTANCE.getClass().getSimpleName(), "Index: " + i2 + ", Start Date: " + timeInterval.getStartDate() + " End Date: " + timeInterval.getEndDate());
            i2++;
        }
        return arrayList;
    }

    private final List<Date> component1(Date date, Date date2) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Calendar calendarComponent3 = component3(date);
        Calendar calendarComponent32 = component3(date2);
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        while (calendarComponent3.before(calendarComponent32)) {
            int i4 = ShareDataUIState + 119;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            Date time = calendarComponent3.getTime();
            Intrinsics.checkNotNull(time);
            arrayList.add(time);
            calendarComponent3.add(5, 1);
        }
        Date time2 = calendarComponent32.getTime();
        Intrinsics.checkNotNullExpressionValue(time2, "");
        arrayList.add(time2);
        return arrayList;
    }

    private final List<Date> copydefault(Date date, Date date2) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        while (calendar.before(calendar2)) {
            int i2 = ShareDataUIState + 19;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Date time = calendar.getTime();
            Intrinsics.checkNotNull(time);
            arrayList.add(time);
            calendar.add(11, 1);
        }
        int i4 = component1 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    private final Calendar component3(Date date) {
        int i = 2 % 2;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(10, 0);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return gregorianCalendar;
    }

    static {
        int i = copydefault + 79;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
