package com.huawei.digitalpayment.datepicker.library;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ListView;
import com.huawei.digitalpayment.datepicker.library.MonthView;
import com.huawei.digitalpayment.datepicker.library.SingleMonthSelector;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class CalendarSelector extends SingleMonthSelector {
    public static final Parcelable.Creator<CalendarSelector> CREATOR = new Parcelable.Creator<CalendarSelector>() {
        private static int component2 = 0;
        private static int component3 = 1;

        @Override
        public CalendarSelector createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CalendarSelector calendarSelectorCopydefault = copydefault(parcel);
            int i4 = component2 + 63;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return calendarSelectorCopydefault;
        }

        @Override
        public CalendarSelector[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            CalendarSelector[] calendarSelectorArrComponent3 = component3(i);
            if (i4 != 0) {
                int i5 = 47 / 0;
            }
            int i6 = component3 + 39;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return calendarSelectorArrComponent3;
        }

        public CalendarSelector[] component3(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 63;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            CalendarSelector[] calendarSelectorArr = new CalendarSelector[i];
            int i6 = i3 + 29;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return calendarSelectorArr;
            }
            throw null;
        }

        public CalendarSelector copydefault(Parcel parcel) {
            int i = 2 % 2;
            CalendarSelector calendarSelector = new CalendarSelector(parcel);
            int i2 = component3 + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return calendarSelector;
        }
    };
    private static final int LISTENER_HOLDER_TAG_KEY = -781485731;
    private static int ShareDataUIState = 1;
    private static final String TAG = "CalendarSelector";
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;
    protected List<SCMonth> dataList;

    public CalendarSelector(List<SCMonth> list, int i) {
        super(null, i);
        setDataList(list);
    }

    @Override
    public void addSelectedSegment(FullDay fullDay, FullDay fullDay2) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (this.selectMode == 0) {
                throw new IllegalArgumentException("Just used with SEGMENT mode!");
            }
            if (fullDay == null || fullDay2 == null) {
                throw new IllegalArgumentException("startDay or endDay can't be null.");
            }
            int i3 = component3 + 81;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.set(1, fullDay.getYear());
            calendar.set(2, fullDay.getMonth() - 1);
            calendar.set(5, fullDay.getDay());
            calendar2.set(1, fullDay2.getYear());
            calendar2.set(2, fullDay2.getMonth() - 1);
            calendar2.set(5, fullDay2.getDay());
            if (calendar.getTime().getTime() > calendar2.getTime().getTime()) {
                throw new IllegalArgumentException("startDay > endDay not support.");
            }
            int iIndexOf = this.dataList.indexOf(new SCMonth(fullDay.getYear(), fullDay.getMonth()));
            int iIndexOf2 = this.dataList.indexOf(new SCMonth(fullDay2.getYear(), fullDay2.getMonth()));
            this.startRecord = new SingleMonthSelector.SelectedRecord();
            this.startRecord.position = iIndexOf;
            this.startRecord.day = fullDay;
            this.endRecord = new SingleMonthSelector.SelectedRecord();
            this.endRecord.position = iIndexOf2;
            this.endRecord.day = fullDay2;
            segmentMonthSelected(null, false);
            return;
        }
        int i5 = this.selectMode;
        obj.hashCode();
        throw null;
    }

    public void addSelectedSegment(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (fullDay == null) {
            throw new IllegalArgumentException("startDay can't be null.");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, fullDay.getYear());
        calendar.set(2, fullDay.getMonth() - 1);
        calendar.set(5, fullDay.getDay());
        int iIndexOf = this.dataList.indexOf(new SCMonth(fullDay.getYear(), fullDay.getMonth()));
        this.startRecord = new SingleMonthSelector.SelectedRecord();
        this.startRecord.position = iIndexOf;
        this.startRecord.day = fullDay;
        this.endRecord = new SingleMonthSelector.SelectedRecord();
        this.endRecord.position = iIndexOf;
        segmentMonthSelected(null, false);
        int i3 = component3 + 109;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void addSelectedInterval(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0 ? this.selectMode == 1 : this.selectMode == 1) {
            throw new IllegalArgumentException("Just used with INTERVAL mode!!!");
        }
        int i3 = ShareDataUIState + 55;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if (fullDay == null) {
            throw new IllegalArgumentException("day can't be null!!!");
        }
        int i6 = i4 + 21;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        addSelectedDayToMonth(fullDay);
        int i8 = component3 + 43;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    protected void addSelectedDayToMonth(FullDay fullDay) {
        int i = 2 % 2;
        SCMonth sCMonth = new SCMonth(fullDay.getYear(), fullDay.getMonth());
        if (!this.dataList.contains(sCMonth)) {
            throw new IllegalArgumentException("The day not belong to any month!");
        }
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<SCMonth> list = this.dataList;
        SCMonth sCMonth2 = list.get(list.indexOf(sCMonth));
        this.sDays.add(fullDay);
        sCMonth2.addSelectedDay(fullDay);
        int i4 = component3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void addSelectedInterval(List<FullDay> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.selectMode == 1) {
            throw new IllegalArgumentException("Just used with INTERVAL mode!");
        }
        int i4 = component3 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (list == null) {
            throw new IllegalArgumentException("selectedDays can't be null!");
        }
        Iterator<FullDay> it = list.iterator();
        int i5 = ShareDataUIState + 95;
        component3 = i5 % 128;
        while (true) {
            int i6 = i5 % 2;
            if (!it.hasNext()) {
                return;
            }
            int i7 = ShareDataUIState + 123;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            addSelectedDayToMonth(it.next());
            i5 = component3 + 121;
            ShareDataUIState = i5 % 128;
        }
    }

    public void bind(ViewGroup viewGroup, MonthView monthView, int i) {
        int i2 = 2 % 2;
        if (viewGroup != null) {
            int i3 = component3;
            int i4 = i3 + 97;
            ShareDataUIState = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (monthView != null) {
                int i5 = i3 + 107;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                if (i >= 0) {
                    if (this.selectMode == 0 && this.mIntervalSelectListener == null) {
                        throw new IllegalArgumentException("Please set IntervalSelectListener for Mode.INTERVAL mode");
                    }
                    if (this.selectMode == 1) {
                        if (this.mSegmentSelectListener == null) {
                            throw new IllegalArgumentException("Please set SegmentSelectListener for Mode.SEGMENT mode");
                        }
                        int i7 = ShareDataUIState + 99;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    if (viewGroup instanceof ListView) {
                        throw new IllegalArgumentException("Not support ListView yet");
                    }
                    int i9 = ShareDataUIState + 81;
                    component3 = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    int i10 = LISTENER_HOLDER_TAG_KEY;
                    copydefault copydefaultVar = (copydefault) monthView.getTag(i10);
                    if (copydefaultVar == null) {
                        copydefaultVar = new copydefault();
                        monthView.setTag(i10, copydefaultVar);
                    }
                    copydefaultVar.component1 = i;
                    copydefaultVar.component2 = viewGroup;
                    copydefaultVar.ShareDataUIState = monthView;
                    monthView.setMonthDayClickListener(copydefaultVar);
                    monthView.setMonthSelector(this);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Invalid params of bind(final ViewGroup container, final SSMonthView monthView, final int position) method");
    }

    class copydefault implements MonthView.OnMonthDayClickListener {
        private static int copy = 1;
        private static int copydefault;
        MonthView ShareDataUIState;
        int component1;
        ViewGroup component2;

        copydefault() {
        }

        @Override
        public void onMonthDayClick(FullDay fullDay) {
            int i = 2 % 2;
            if (SCDateUtils.isMonthDay(this.ShareDataUIState.getYear(), this.ShareDataUIState.getMonth(), fullDay.getYear(), fullDay.getMonth()) && SCDateUtils.isInDateRange(fullDay, this.ShareDataUIState.getSCMonth().getRangeStartDay(), this.ShareDataUIState.getSCMonth().getRangeEndDay())) {
                int i2 = CalendarSelector.this.selectMode;
                if (i2 != 0) {
                    int i3 = copy;
                    int i4 = i3 + 65;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        int i6 = i3 + 89;
                        copydefault = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 2 % 3;
                            return;
                        }
                        return;
                    }
                    if (fullDay.getDayFlag() == -3) {
                        this.ShareDataUIState.clearSelectedDays();
                        CalendarSelector.this.startRecord.reset();
                        CalendarSelector.this.endRecord.reset();
                        return;
                    }
                    CalendarSelector.m12218$$Nest$msegmentSelect(CalendarSelector.this, this.component2, this.ShareDataUIState, fullDay, this.component1);
                    return;
                }
                CalendarSelector.this.intervalSelect(this.ShareDataUIState, fullDay);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r3.endRecord.isRecord() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r3.endRecord.isRecord() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r3.startRecord.position = r7;
        r3.startRecord.day = r6;
        r5.addSelectedDay(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r3.endRecord.isRecord() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r3.endRecord.isRecord() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        startRecord(r4, r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void segmentSelect(android.view.ViewGroup r4, com.huawei.digitalpayment.datepicker.library.MonthView r5, com.huawei.digitalpayment.datepicker.library.FullDay r6, int r7) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.datepicker.library.SegmentSelectListener r1 = r3.mSegmentSelectListener
            boolean r1 = r1.onInterceptSelect(r6)
            if (r1 == 0) goto L15
            int r4 = com.huawei.digitalpayment.datepicker.library.CalendarSelector.component3
            int r4 = r4 + 29
            int r5 = r4 % 128
            com.huawei.digitalpayment.datepicker.library.CalendarSelector.ShareDataUIState = r5
            int r4 = r4 % r0
            return
        L15:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r3.startRecord
            boolean r1 = r1.isRecord()
            if (r1 != 0) goto L49
            int r1 = com.huawei.digitalpayment.datepicker.library.CalendarSelector.component3
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.CalendarSelector.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L35
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r3.endRecord
            boolean r1 = r1.isRecord()
            r2 = 88
            int r2 = r2 / 0
            if (r1 != 0) goto L49
            goto L3d
        L35:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r3.endRecord
            boolean r1 = r1.isRecord()
            if (r1 != 0) goto L49
        L3d:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r4 = r3.startRecord
            r4.position = r7
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r4 = r3.startRecord
            r4.day = r6
            r5.addSelectedDay(r6)
            return
        L49:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r3.startRecord
            boolean r1 = r1.isRecord()
            if (r1 == 0) goto L75
            int r1 = com.huawei.digitalpayment.datepicker.library.CalendarSelector.ShareDataUIState
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.CalendarSelector.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L69
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r3.endRecord
            boolean r1 = r1.isRecord()
            r2 = 59
            int r2 = r2 / 0
            if (r1 == 0) goto L71
            goto L75
        L69:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r3.endRecord
            boolean r1 = r1.isRecord()
            if (r1 != 0) goto L75
        L71:
            r3.startRecord(r4, r5, r6, r7)
            return
        L75:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r5 = r3.startRecord
            boolean r5 = r5.isRecord()
            if (r5 == 0) goto L88
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r5 = r3.endRecord
            boolean r5 = r5.isRecord()
            if (r5 == 0) goto L88
            r3.allRecord(r4, r6, r7)
        L88:
            int r4 = com.huawei.digitalpayment.datepicker.library.CalendarSelector.component3
            int r4 = r4 + 109
            int r5 = r4 % 128
            com.huawei.digitalpayment.datepicker.library.CalendarSelector.ShareDataUIState = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L97
            r4 = 54
            int r4 = r4 / 0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.CalendarSelector.segmentSelect(android.view.ViewGroup, com.huawei.digitalpayment.datepicker.library.MonthView, com.huawei.digitalpayment.datepicker.library.FullDay, int):void");
    }

    private void allRecord(ViewGroup viewGroup, FullDay fullDay, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 47;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.dataList.get(this.startRecord.position).getSelectedDays().clear();
        invalidate(viewGroup, this.startRecord.position);
        this.dataList.get(this.endRecord.position).getSelectedDays().clear();
        invalidate(viewGroup, this.endRecord.position);
        int i5 = this.startRecord.position;
        int i6 = this.endRecord.position;
        if (i6 - i5 > 1) {
            do {
                i5++;
                this.dataList.get(i5).getSelectedDays().clear();
                invalidate(viewGroup, i5);
            } while (i5 < i6);
        }
        this.startRecord.position = i;
        this.startRecord.day = fullDay;
        this.dataList.get(this.startRecord.position).addSelectedDay(this.startRecord.day);
        invalidate(viewGroup, i);
        this.endRecord.reset();
        int i7 = ShareDataUIState + 89;
        component3 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 54 / 0;
        }
    }

    private void startRecord(ViewGroup viewGroup, MonthView monthView, FullDay fullDay, int i) {
        int i2 = 2 % 2;
        if (this.startRecord.position < i) {
            int i3 = component3 + 71;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (this.mSegmentSelectListener.onInterceptSelect(this.startRecord.day, fullDay)) {
                return;
            }
            this.endRecord.position = i;
            this.endRecord.day = fullDay;
            segmentMonthSelected(viewGroup, true);
            return;
        }
        if (this.startRecord.position <= i) {
            clickSameMonth(monthView, fullDay, i);
            return;
        }
        int i5 = component3 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        if (this.mSegmentSelectListener.onInterceptSelect(this.startRecord.day, fullDay)) {
            return;
        }
        this.endRecord.position = this.startRecord.position;
        this.endRecord.day = this.startRecord.day;
        this.startRecord.position = i;
        this.startRecord.day = fullDay;
        segmentMonthSelected(viewGroup, true);
    }

    private void clickSameMonth(MonthView monthView, FullDay fullDay, int i) {
        int i2 = 2 % 2;
        if (this.startRecord.day.getDay() != fullDay.getDay()) {
            if (this.startRecord.day.getDay() < fullDay.getDay()) {
                if (this.mSegmentSelectListener.onInterceptSelect(this.startRecord.day, fullDay)) {
                    return;
                }
                this.endRecord.position = i;
                this.endRecord.day = fullDay;
                for (int day = this.startRecord.day.getDay(); day <= fullDay.getDay(); day++) {
                    monthView.addSelectedDay(new FullDay(monthView.getYear(), monthView.getMonth(), day));
                }
            } else if (this.startRecord.day.getDay() > fullDay.getDay()) {
                int i3 = component3 + 11;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    if (this.mSegmentSelectListener.onInterceptSelect(this.startRecord.day, fullDay)) {
                        return;
                    }
                    int day2 = this.startRecord.day.getDay();
                    this.endRecord.day = this.startRecord.day;
                    this.startRecord.day = fullDay;
                    for (int day3 = fullDay.getDay(); day3 <= day2; day3++) {
                        monthView.addSelectedDay(new FullDay(monthView.getYear(), monthView.getMonth(), day3));
                    }
                    this.endRecord.position = i;
                } else {
                    this.mSegmentSelectListener.onInterceptSelect(this.startRecord.day, fullDay);
                    throw null;
                }
            }
            monthView.invalidate();
            this.mSegmentSelectListener.onSegmentSelect(this.startRecord.day, this.endRecord.day);
            return;
        }
        int i4 = component3 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            this.mSegmentSelectListener.selectedSameDay(fullDay);
            monthView.clearSelectedDays();
            this.startRecord.reset();
            this.endRecord.reset();
            return;
        }
        this.mSegmentSelectListener.selectedSameDay(fullDay);
        monthView.clearSelectedDays();
        this.startRecord.reset();
        this.endRecord.reset();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void invalidate(android.view.ViewGroup r8, int r9) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.CalendarSelector.invalidate(android.view.ViewGroup, int):void");
    }

    private void segmentMonthSelected(ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (viewGroup == null && (!z) && this.startRecord.position == this.endRecord.position) {
            int i4 = ShareDataUIState + 67;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                this.dataList.get(this.startRecord.position);
                this.startRecord.day.getDay();
                this.endRecord.day.getDay();
                throw null;
            }
            SCMonth sCMonth = this.dataList.get(this.startRecord.position);
            if (this.startRecord.day.getDay() == this.endRecord.day.getDay()) {
                sCMonth.addSelectedDay(this.startRecord.day);
                return;
            }
            if (this.startRecord.day.getDay() >= this.endRecord.day.getDay()) {
                if (this.startRecord.day.getDay() > this.endRecord.day.getDay()) {
                    for (int day = this.endRecord.day.getDay(); day <= this.startRecord.day.getDay(); day++) {
                        sCMonth.addSelectedDay(new FullDay(sCMonth.getYear(), sCMonth.getMonth(), day));
                    }
                    return;
                }
                return;
            }
            int i5 = ShareDataUIState + 89;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int day2 = this.startRecord.day.getDay();
            while (day2 <= this.endRecord.day.getDay()) {
                sCMonth.addSelectedDay(new FullDay(sCMonth.getYear(), sCMonth.getMonth(), day2));
                day2++;
                int i7 = component3 + 85;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
            return;
        }
        SCMonth sCMonth2 = this.dataList.get(this.startRecord.position);
        int dayCountOfMonth = SCDateUtils.getDayCountOfMonth(sCMonth2.getYear(), sCMonth2.getMonth());
        for (int day3 = this.startRecord.day.getDay(); day3 <= dayCountOfMonth; day3++) {
            sCMonth2.addSelectedDay(new FullDay(sCMonth2.getYear(), sCMonth2.getMonth(), day3));
        }
        if (z) {
            invalidate(viewGroup, this.startRecord.position);
        }
        int i9 = this.startRecord.position;
        int i10 = this.endRecord.position;
        while (i10 - i9 > 1) {
            i9++;
            SCMonth sCMonth3 = this.dataList.get(i9);
            int dayCountOfMonth2 = SCDateUtils.getDayCountOfMonth(sCMonth3.getYear(), sCMonth3.getMonth());
            for (int i11 = 1; i11 <= dayCountOfMonth2; i11++) {
                sCMonth3.addSelectedDay(new FullDay(sCMonth3.getYear(), sCMonth3.getMonth(), i11));
            }
            if (z) {
                invalidate(viewGroup, i9);
            }
        }
        SCMonth sCMonth4 = this.dataList.get(this.endRecord.position);
        for (int i12 = 1; i12 <= this.endRecord.day.getDay(); i12++) {
            sCMonth4.addSelectedDay(new FullDay(sCMonth4.getYear(), sCMonth4.getMonth(), i12));
        }
        if (z) {
            invalidate(viewGroup, this.endRecord.position);
        }
        if (!(!z)) {
            this.mSegmentSelectListener.onSegmentSelect(this.startRecord.day, this.endRecord.day);
        }
    }

    protected void setDataList(List<SCMonth> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.dataList = list;
        int i5 = i3 + 39;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<SCMonth> getDataList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<SCMonth> list = this.dataList;
        int i5 = i3 + 5;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public FullDay getStartDay() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FullDay fullDay = this.startRecord.day;
        int i4 = ShareDataUIState + 49;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return fullDay;
        }
        throw null;
    }

    public FullDay getEndDay() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        FullDay fullDay = this.endRecord.day;
        int i4 = component3 + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return fullDay;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            super.writeToParcel(parcel, i);
            parcel.writeTypedList(this.dataList);
            int i4 = component3 + 59;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.dataList);
        throw null;
    }

    protected CalendarSelector(Parcel parcel) {
        super(parcel);
        this.dataList = parcel.createTypedArrayList(SCMonth.CREATOR);
    }

    static {
        int i = component1 + 123;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    static void m12218$$Nest$msegmentSelect(CalendarSelector calendarSelector, ViewGroup viewGroup, MonthView monthView, FullDay fullDay, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        calendarSelector.segmentSelect(viewGroup, monthView, fullDay, i);
        int i5 = ShareDataUIState + 113;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
