package com.huawei.digitalpayment.datepicker.library;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.datepicker.library.MonthView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public class SingleMonthSelector implements Parcelable {
    public static final Parcelable.Creator<SingleMonthSelector> CREATOR = new Parcelable.Creator<SingleMonthSelector>() {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        @Override
        public SingleMonthSelector createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                component3(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SingleMonthSelector singleMonthSelectorComponent3 = component3(parcel);
            int i3 = ShareDataUIState + 115;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return singleMonthSelectorComponent3;
        }

        @Override
        public SingleMonthSelector[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 41;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                copydefault(i);
                throw null;
            }
            SingleMonthSelector[] singleMonthSelectorArrCopydefault = copydefault(i);
            int i4 = ShareDataUIState + 93;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return singleMonthSelectorArrCopydefault;
        }

        public SingleMonthSelector[] copydefault(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 89;
            ShareDataUIState = i3 % 128;
            SingleMonthSelector[] singleMonthSelectorArr = new SingleMonthSelector[i];
            if (i3 % 2 == 0) {
                return singleMonthSelectorArr;
            }
            throw null;
        }

        public SingleMonthSelector component3(Parcel parcel) {
            int i = 2 % 2;
            SingleMonthSelector singleMonthSelector = new SingleMonthSelector(parcel);
            int i2 = copydefault + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return singleMonthSelector;
        }
    };
    public static final int INTERVAL = 0;
    public static final int SEGMENT = 1;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    protected SelectedRecord endRecord;
    protected IntervalSelectListener mIntervalSelectListener;
    private SCMonth mSCMonth;
    protected SegmentSelectListener mSegmentSelectListener;
    protected List<FullDay> sDays;
    protected int selectMode;
    protected SelectedRecord startRecord;

    public @interface Mode {
    }

    public SingleMonthSelector(SCMonth sCMonth, int i) {
        this.selectMode = -1;
        this.startRecord = new SelectedRecord();
        this.endRecord = new SelectedRecord();
        this.sDays = new LinkedList();
        this.mSCMonth = sCMonth;
        this.selectMode = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r5.getDay() < r6.getDay()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r4.mSCMonth.equals(new com.huawei.digitalpayment.datepicker.library.SCMonth(r5.getYear(), r5.getMonth())) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r4.mSCMonth.equals(new com.huawei.digitalpayment.datepicker.library.SCMonth(r6.getYear(), r6.getMonth())) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r1 = com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component3 + 57;
        com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component2 = r1 % 128;
        r1 = r1 % 2;
        r4.startRecord.day = r5;
        r4.endRecord.day = r6;
        r4.mSCMonth.addSelectedDay(r5);
        r4.mSCMonth.addSelectedDay(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r4.startRecord.day.getDay() >= r4.endRecord.day.getDay()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        r5 = com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component2 + 31;
        com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component3 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if ((r5 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        r5 = r4.startRecord.day.getDay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r5 > r4.endRecord.day.getDay()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        r4.mSCMonth.addSelectedDay(new com.huawei.digitalpayment.datepicker.library.FullDay(r4.mSCMonth.getYear(), r4.mSCMonth.getMonth(), r5));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        r4.startRecord.day.getDay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r4.startRecord.day.getDay() <= r4.endRecord.day.getDay()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        r5 = r4.endRecord.day.getDay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r5 > r4.startRecord.day.getDay()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        r4.mSCMonth.addSelectedDay(new com.huawei.digitalpayment.datepicker.library.FullDay(r4.mSCMonth.getYear(), r4.mSCMonth.getMonth(), r5));
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0102, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        throw new java.lang.IllegalArgumentException("endDay not belong to scMonth.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0112, code lost:
    
        throw new java.lang.IllegalArgumentException("startDay not belong to scMonth.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        throw new java.lang.IllegalArgumentException("startDay >= endDay not support.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r5.getDay() < r6.getDay()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addSelectedSegment(com.huawei.digitalpayment.datepicker.library.FullDay r5, com.huawei.digitalpayment.datepicker.library.FullDay r6) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.addSelectedSegment(com.huawei.digitalpayment.datepicker.library.FullDay, com.huawei.digitalpayment.datepicker.library.FullDay):void");
    }

    public SelectedRecord getStartSelectedRecord() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        SelectedRecord selectedRecord = this.startRecord;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return selectedRecord;
    }

    public SelectedRecord getEndSelectedRecord() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        SelectedRecord selectedRecord = this.endRecord;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return selectedRecord;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r2 = r2 + 53;
        com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component2 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        addSelectedDayToMonth(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        addSelectedDayToMonth(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        throw new java.lang.IllegalArgumentException("day can't be null!!!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addSelectedInterval(com.huawei.digitalpayment.datepicker.library.FullDay r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component2
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component3 = r2
            int r1 = r1 % r0
            int r1 = r4.selectMode
            r3 = 1
            if (r1 == r3) goto L3d
            int r1 = r2 + 101
            int r3 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component2 = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L21
            r1 = 30
            int r1 = r1 / 0
            if (r5 == 0) goto L35
            goto L23
        L21:
            if (r5 == 0) goto L35
        L23:
            int r2 = r2 + 53
            int r1 = r2 % 128
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.component2 = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L30
            r4.addSelectedDayToMonth(r5)
            return
        L30:
            r4.addSelectedDayToMonth(r5)
            r5 = 0
            throw r5
        L35:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "day can't be null!!!"
            r5.<init>(r0)
            throw r5
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Just used with INTERVAL mode!!!"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.SingleMonthSelector.addSelectedInterval(com.huawei.digitalpayment.datepicker.library.FullDay):void");
    }

    public void addSelectedInterval(List<FullDay> list) {
        int i = 2 % 2;
        if (this.selectMode == 1) {
            throw new IllegalArgumentException("Just used with INTERVAL mode!!!");
        }
        int i2 = component3;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (list == null) {
            throw new IllegalArgumentException("selectedDays can't be null!!!");
        }
        int i5 = i2 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        Iterator<FullDay> it = list.iterator();
        while (it.hasNext()) {
            int i7 = component2 + 93;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                addSelectedDayToMonth(it.next());
                int i8 = 42 / 0;
            } else {
                addSelectedDayToMonth(it.next());
            }
            int i9 = component2 + 65;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    protected void addSelectedDayToMonth(FullDay fullDay) {
        int i = 2 % 2;
        if (!this.mSCMonth.equals(new SCMonth(fullDay.getYear(), fullDay.getMonth()))) {
            throw new IllegalArgumentException("The day not belong to any month!!!");
        }
        int i2 = component3 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.mSCMonth.addSelectedDay(fullDay);
        this.sDays.add(fullDay);
        int i4 = component3 + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void segmentSelect(MonthView monthView, FullDay fullDay) {
        int i = 2 % 2;
        if (this.mSegmentSelectListener.onInterceptSelect(fullDay)) {
            int i2 = component3 + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (this.startRecord.day == null && this.endRecord.day == null) {
            this.startRecord.day = fullDay;
            monthView.addSelectedDay(fullDay);
            int i4 = component2 + 107;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (this.endRecord.day != null) {
            monthView.clearSelectedDays();
            monthView.addSelectedDay(fullDay);
            this.startRecord.day = fullDay;
            this.endRecord.reset();
            return;
        }
        if (this.startRecord.day.getDay() == fullDay.getDay()) {
            int i6 = component3 + 123;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                this.mSegmentSelectListener.selectedSameDay(fullDay);
                monthView.clearSelectedDays();
                this.startRecord.reset();
                this.endRecord.reset();
                int i7 = 92 / 0;
            } else {
                this.mSegmentSelectListener.selectedSameDay(fullDay);
                monthView.clearSelectedDays();
                this.startRecord.reset();
                this.endRecord.reset();
            }
            int i8 = component3 + 97;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 30 / 0;
                return;
            }
            return;
        }
        if (this.startRecord.day.getDay() < fullDay.getDay()) {
            int i10 = component2 + 23;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            if (this.mSegmentSelectListener.onInterceptSelect(this.startRecord.day, fullDay)) {
                return;
            }
            for (int day = this.startRecord.day.getDay(); day <= fullDay.getDay(); day++) {
                monthView.addSelectedDay(new FullDay(monthView.getYear(), monthView.getMonth(), day));
            }
            this.endRecord.day = fullDay;
        } else if (this.startRecord.day.getDay() > fullDay.getDay()) {
            if (this.mSegmentSelectListener.onInterceptSelect(fullDay, this.startRecord.day)) {
                return;
            }
            for (int day2 = fullDay.getDay(); day2 <= this.startRecord.day.getDay(); day2++) {
                monthView.addSelectedDay(new FullDay(monthView.getYear(), monthView.getMonth(), day2));
            }
            this.endRecord.day = this.startRecord.day;
            this.startRecord.day = fullDay;
        }
        this.mSegmentSelectListener.onSegmentSelect(this.startRecord.day, this.endRecord.day);
    }

    public void bind(final MonthView monthView) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (monthView == null) {
            throw new IllegalArgumentException("Invalid params of bind(final ViewGroup container, final SSMonthView monthView, final int position) method.");
        }
        int i4 = this.selectMode;
        if (i4 == 0) {
            int i5 = i2 + 81;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (this.mIntervalSelectListener == null) {
                throw new IllegalArgumentException("Please set IntervalSelectListener for Mode.INTERVAL mode.");
            }
        }
        if (i4 == 1 && this.mSegmentSelectListener == null) {
            throw new IllegalArgumentException("Please set SegmentSelectListener for Mode.SEGMENT mode.");
        }
        monthView.setMonthDayClickListener(new MonthView.OnMonthDayClickListener() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void onMonthDayClick(FullDay fullDay) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 79;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                SingleMonthSelector singleMonthSelector = this.f$0;
                if (i8 == 0) {
                    SingleMonthSelector.$r8$lambda$kDzq45K5tlxt1R5TsBtZaFMUfjw(singleMonthSelector, monthView, fullDay);
                    return;
                }
                SingleMonthSelector.$r8$lambda$kDzq45K5tlxt1R5TsBtZaFMUfjw(singleMonthSelector, monthView, fullDay);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i6 = component2 + 65;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    private void lambda$bind$0(MonthView monthView, FullDay fullDay) {
        int i = 2 % 2;
        if (!SCDateUtils.isMonthDay(monthView.getYear(), monthView.getMonth(), fullDay.getYear(), fullDay.getMonth())) {
            int i2 = component2 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = this.selectMode;
        if (i4 != 0) {
            int i5 = component3 + 109;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            if (i4 == 1) {
                segmentSelect(monthView, fullDay);
            }
        } else {
            intervalSelect(monthView, fullDay);
        }
        int i7 = component3 + 55;
        component2 = i7 % 128;
        int i8 = i7 % 2;
    }

    protected void intervalSelect(MonthView monthView, FullDay fullDay) {
        int i = 2 % 2;
        if (!monthView.getSelectedDays().contains(fullDay)) {
            if (this.mIntervalSelectListener.onInterceptSelect(this.sDays, fullDay)) {
                return;
            }
            this.sDays.add(fullDay);
            monthView.addSelectedDay(fullDay);
            int i2 = component2 + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = component3 + 61;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            this.sDays.remove(fullDay);
            monthView.removeSelectedDay(fullDay);
            if (this.mIntervalSelectListener.onInterceptSelect(this.sDays, fullDay)) {
                return;
            }
        }
        this.mIntervalSelectListener.onIntervalSelect(this.sDays);
    }

    public void setIntervalSelectListener(IntervalSelectListener intervalSelectListener) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.mIntervalSelectListener = intervalSelectListener;
        if (i3 == 0) {
            throw null;
        }
    }

    public void setSegmentSelectListener(SegmentSelectListener segmentSelectListener) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.mSegmentSelectListener = segmentSelectListener;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public List<FullDay> getIntervalSelectedDays() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<FullDay> list = this.sDays;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        parcel.writeInt(this.selectMode);
        parcel.writeParcelable(this.endRecord, i);
        parcel.writeParcelable(this.startRecord, i);
        parcel.writeTypedList(this.sDays);
        int i5 = component3 + 75;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected SingleMonthSelector(Parcel parcel) {
        this.selectMode = -1;
        this.startRecord = new SelectedRecord();
        this.endRecord = new SelectedRecord();
        this.sDays = new LinkedList();
        this.selectMode = parcel.readInt();
        this.endRecord = (SelectedRecord) parcel.readParcelable(SelectedRecord.class.getClassLoader());
        this.startRecord = (SelectedRecord) parcel.readParcelable(SelectedRecord.class.getClassLoader());
        this.sDays = parcel.createTypedArrayList(FullDay.CREATOR);
    }

    public static class SelectedRecord implements Parcelable {
        public static final Parcelable.Creator<SelectedRecord> CREATOR = new Parcelable.Creator<SelectedRecord>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public SelectedRecord createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 31;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                SelectedRecord selectedRecordComponent3 = component3(parcel);
                int i4 = component2 + 119;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return selectedRecordComponent3;
            }

            @Override
            public SelectedRecord[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 77;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SelectedRecord[] selectedRecordArrComponent2 = component2(i);
                int i5 = copydefault + 69;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return selectedRecordArrComponent2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public SelectedRecord[] component2(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 51;
                int i4 = i3 % 128;
                component2 = i4;
                SelectedRecord[] selectedRecordArr = new SelectedRecord[i];
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 63;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return selectedRecordArr;
            }

            public SelectedRecord component3(Parcel parcel) {
                int i = 2 % 2;
                SelectedRecord selectedRecord = new SelectedRecord(parcel);
                int i2 = component2 + 17;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return selectedRecord;
            }
        };
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;
        public FullDay day;
        public int position;

        public SelectedRecord() {
            this.position = -1;
        }

        public void reset() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 67;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                this.position = -1;
                this.day = null;
                int i4 = i2 + 97;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            this.position = -1;
            this.day = null;
            obj.hashCode();
            throw null;
        }

        public boolean isRecord() {
            int i = 2 % 2;
            if (this.position < 0) {
                return false;
            }
            int i2 = component3;
            int i3 = i2 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (this.day == null) {
                return false;
            }
            int i5 = i2 + 37;
            ShareDataUIState = i5 % 128;
            return i5 % 2 != 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 47;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.day, 0);
            int i5 = ShareDataUIState + 3;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SelectedRecord{position=" + this.position + ", day=" + this.day + AbstractJsonLexerKt.END_OBJ;
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        protected SelectedRecord(Parcel parcel) {
            this.position = -1;
            this.position = parcel.readInt();
            this.day = (FullDay) parcel.readParcelable(FullDay.class.getClassLoader());
        }

        static {
            int i = component1 + 85;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 17;
            ShareDataUIState = i2 % 128;
            return 1 ^ (i2 % 2 == 0 ? 0 : 1);
        }
    }

    static {
        int i = component1 + 19;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static void $r8$lambda$kDzq45K5tlxt1R5TsBtZaFMUfjw(SingleMonthSelector singleMonthSelector, MonthView monthView, FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        singleMonthSelector.lambda$bind$0(monthView, fullDay);
        int i4 = component2 + 13;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
