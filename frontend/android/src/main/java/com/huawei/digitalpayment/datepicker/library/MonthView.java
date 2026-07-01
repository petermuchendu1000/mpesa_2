package com.huawei.digitalpayment.datepicker.library;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.SizeUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.util.L;
import java.lang.reflect.Array;
import java.util.List;

public class MonthView extends FrameLayout {
    private static final int COL_COUNT = 7;
    private static final int ROW_COUNT = 6;
    private static int ShareDataUIState = 1;
    private static final String TAG = "MonthView";
    private static int copydefault;
    private int dayHeight;
    private DayViewInflater dayInflater;
    private DayViewHolder[][] dayViewHolders;
    private int dayWidth;
    protected Context mContext;
    private int mDefaultHeight;
    private int mDefaultWidth;
    protected DisplayMetrics mDisplayMetrics;
    private OnMonthDayClickListener mMonthDayClickListener;
    private SCMonth mSCMonth;
    private SingleMonthSelector monthSelector;
    private boolean neededRelayout;
    private int realRowCount;

    public interface OnMonthDayClickListener {
        void onMonthDayClick(FullDay fullDay);
    }

    public MonthView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private MonthView(Context context) {
        super(context);
        this.realRowCount = 6;
        this.dayViewHolders = (DayViewHolder[][]) Array.newInstance((Class<?>) DayViewHolder.class, 6, 7);
        this.neededRelayout = false;
    }

    public MonthView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.realRowCount = 6;
        this.dayViewHolders = (DayViewHolder[][]) Array.newInstance((Class<?>) DayViewHolder.class, 6, 7);
        this.neededRelayout = false;
        this.mContext = context;
        setWillNotDraw(false);
        this.mDisplayMetrics = new DisplayMetrics();
        ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.mDisplayMetrics);
        this.mDefaultHeight = SizeUtils.dp2px(48.0f) * 6;
        this.mDefaultWidth = this.mDisplayMetrics.widthPixels;
        this.dayInflater = new DefaultDayViewInflater(getContext());
    }

    public void setMonthSelector(SingleMonthSelector singleMonthSelector) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.monthSelector = singleMonthSelector;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setSCMonth(SCMonth sCMonth, DayViewInflater dayViewInflater) {
        int i = 2 % 2;
        if (sCMonth.getYear() > 0 && sCMonth.getMonth() > 0) {
            int i2 = copydefault + 117;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0 ? sCMonth.getMonth() <= 12 : sCMonth.getMonth() <= 103) {
                int i3 = ShareDataUIState;
                int i4 = i3 + 35;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                if (dayViewInflater != null) {
                    int i6 = i3 + 29;
                    int i7 = i6 % 128;
                    copydefault = i7;
                    if (i6 % 2 != 0) {
                        this.dayInflater = dayViewInflater;
                        int i8 = 30 / 0;
                    } else {
                        this.dayInflater = dayViewInflater;
                    }
                    int i9 = i7 + 19;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                }
                this.mSCMonth = sCMonth;
                calculateDays();
                if (getChildCount() > 0) {
                    refresh();
                } else {
                    post(new Runnable() {
                        private static int ShareDataUIState = 0;
                        private static int component1 = 1;

                        @Override
                        public final void run() {
                            int i11 = 2 % 2;
                            int i12 = component1 + 23;
                            ShareDataUIState = i12 % 128;
                            int i13 = i12 % 2;
                            MonthView.$r8$lambda$r00NydxGtl86W7rslGbMaJ_N9sc(this.f$0);
                            int i14 = component1 + 43;
                            ShareDataUIState = i14 % 128;
                            if (i14 % 2 != 0) {
                                throw null;
                            }
                        }
                    });
                }
                if (this.neededRelayout) {
                    requestLayout();
                    this.neededRelayout = false;
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalidate year or month");
    }

    private void lambda$setSCMonth$0() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        createDayViews();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = ShareDataUIState + 105;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void drawDays(int i, int i2, View view) {
        int i3 = 2 % 2;
        SCMonth sCMonth = this.mSCMonth;
        if (sCMonth == null) {
            return;
        }
        FullDay[][] monthDays = sCMonth.getMonthDays();
        if (monthDays != null) {
            int i4 = ShareDataUIState + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            if (monthDays.length > i) {
                FullDay[] fullDayArr = monthDays[i];
                if (fullDayArr.length > i2) {
                    FullDay fullDay = fullDayArr[i2];
                    fullDay.setDayFlag(2);
                    DayViewHolder dayViewHolder = this.dayViewHolders[i][i2];
                    boolean zIsPrevMonthDay = SCDateUtils.isPrevMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth());
                    boolean zIsNextMonthDay = SCDateUtils.isNextMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth());
                    boolean zContains = getSelectedDays().contains(fullDay);
                    view.setVisibility(0);
                    if (zIsPrevMonthDay) {
                        dayViewHolder.setPrevMonthDayText(fullDay);
                    } else if (zIsNextMonthDay) {
                        dayViewHolder.setNextMonthDayText(fullDay);
                    } else if (!SCDateUtils.isInDateRange(fullDay, this.mSCMonth.getRangeStartDay(), this.mSCMonth.getRangeEndDay())) {
                        dayViewHolder.setBeyondRangeDayText(fullDay);
                    } else {
                        setCurrentMonthDayText(fullDay, dayViewHolder, zContains);
                    }
                }
            }
        }
        int i6 = ShareDataUIState + 87;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setCurrentMonthDayText(com.huawei.digitalpayment.datepicker.library.FullDay r6, com.huawei.digitalpayment.datepicker.library.DayViewHolder r7, boolean r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            if (r8 == 0) goto La0
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r1 = r5.monthSelector
            if (r1 != 0) goto La
            return
        La:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r1.startRecord
            r2 = 0
            if (r1 == 0) goto L69
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r1 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r1.startRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r1 = r1.day
            boolean r1 = r6.equals(r1)
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L69
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState
            int r1 = r1 + 65
            int r4 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.copydefault = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L59
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r1 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r1.startRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r1 = r1.day
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r2 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r2 = r2.endRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r2 = r2.day
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3f
            r0 = -3
            r6.setDayFlag(r0)
            goto La3
        L3f:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r1 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r1.endRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r1 = r1.day
            if (r1 != 0) goto L55
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.copydefault
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState = r2
            int r1 = r1 % r0
            r0 = -2
            r6.setDayFlag(r0)
            goto La3
        L55:
            r6.setDayFlag(r3)
            goto La3
        L59:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r6 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r6 = r6.startRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r6 = r6.day
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r7 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r7 = r7.endRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r7 = r7.day
            r6.equals(r7)
            throw r2
        L69:
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r1 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r1.endRecord
            if (r1 == 0) goto L9b
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.copydefault
            int r1 = r1 + 107
            int r3 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState = r3
            int r1 = r1 % r0
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector r1 = r5.monthSelector
            com.huawei.digitalpayment.datepicker.library.SingleMonthSelector$SelectedRecord r1 = r1.endRecord
            com.huawei.digitalpayment.datepicker.library.FullDay r1 = r1.day
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L9b
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.copydefault
            int r1 = r1 + 51
            int r3 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState = r3
            int r1 = r1 % r0
            r0 = -1
            if (r1 == 0) goto L94
            r6.setDayFlag(r0)
            goto La3
        L94:
            r6.setDayFlag(r0)
            r2.hashCode()
            throw r2
        L9b:
            r0 = 0
            r6.setDayFlag(r0)
            goto La3
        La0:
            r6.setDayFlag(r0)
        La3:
            r7.setCurrentMonthDayText(r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.MonthView.setCurrentMonthDayText(com.huawei.digitalpayment.datepicker.library.FullDay, com.huawei.digitalpayment.datepicker.library.DayViewHolder, boolean):void");
    }

    private void createDayViews() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        for (final int i7 = 0; i7 < 6; i7++) {
            final int i8 = 0;
            while (i8 < 7) {
                DayViewHolder dayViewHolderInflateDayView = this.dayInflater.inflateDayView(this);
                View dayView = dayViewHolderInflateDayView.getDayView();
                dayView.setLayoutParams(new ViewGroup.LayoutParams(this.dayWidth, this.dayHeight));
                addView(dayView);
                this.dayViewHolders[i7][i8] = dayViewHolderInflateDayView;
                drawDays(i7, i8, dayView);
                dayView.setClickable(true);
                dayView.setOnClickListener(new View.OnClickListener() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final void onClick(View view) {
                        int i9 = 2 % 2;
                        int i10 = component3 + 71;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        MonthView monthView = this.f$0;
                        if (i11 == 0) {
                            MonthView.m12219$r8$lambda$GZZm4G2327D5rtfWnMfGIFB1ZA(monthView, i7, i8, view);
                        } else {
                            MonthView.m12219$r8$lambda$GZZm4G2327D5rtfWnMfGIFB1ZA(monthView, i7, i8, view);
                            throw null;
                        }
                    }
                });
                i8++;
                int i9 = copydefault + 5;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    private void lambda$createDayViews$1(int i, int i2, View view) {
        int i3 = 2 % 2;
        int i4 = copydefault + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        measureClickCell(i, i2);
        int i6 = copydefault + 65;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
    }

    private boolean isFirstRowFullCurrentMonthDays() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FullDay[] fullDayArr = this.mSCMonth.getMonthDays()[0];
        int length = fullDayArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = copydefault + 23;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                FullDay fullDay = fullDayArr[i4];
                SCDateUtils.isPrevMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            FullDay fullDay2 = fullDayArr[i4];
            if (SCDateUtils.isPrevMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay2.getYear(), fullDay2.getMonth())) {
                return false;
            }
        }
        int i6 = copydefault + 29;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private void calculateDays() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (this.realRowCount != this.mSCMonth.getRealRowCount()) {
            int i4 = ShareDataUIState + 119;
            copydefault = i4 % 128;
            this.neededRelayout = i4 % 2 == 0;
        }
        this.realRowCount = this.mSCMonth.getRealRowCount();
    }

    List<FullDay> getSelectedDays() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SCMonth sCMonth = getSCMonth();
        if (i3 == 0) {
            return sCMonth.getSelectedDays();
        }
        sCMonth.getSelectedDays();
        throw null;
    }

    public void addSelectedDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        getSelectedDays().add(fullDay);
        notifySelectedDaysChanged();
        int i4 = ShareDataUIState + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void addSelectedDays(List<FullDay> list) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        getSelectedDays().addAll(list);
        notifySelectedDaysChanged();
        int i4 = ShareDataUIState + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void removeSelectedDay(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        getSelectedDays().remove(fullDay);
        notifySelectedDaysChanged();
        int i4 = ShareDataUIState + 45;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public void clearSelectedDays() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            getSelectedDays().clear();
            notifySelectedDaysChanged();
            int i3 = ShareDataUIState + 111;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getSelectedDays().clear();
        notifySelectedDaysChanged();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void notifySelectedDaysChanged() {
        int i = 2 % 2;
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            int i3 = copydefault + 27;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = i2 >>> 13;
                drawDays(i4, i2 % (i4 << 86), getChildAt(i2));
                i2 += 66;
            } else {
                int i5 = i2 / 7;
                drawDays(i5, i2 - (i5 * 7), getChildAt(i2));
                i2++;
            }
        }
        int i6 = ShareDataUIState + 103;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public SCMonth getSCMonth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        SCMonth sCMonth = this.mSCMonth;
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return sCMonth;
    }

    public void setSCMonth(SCMonth sCMonth) {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        setSCMonth(sCMonth, null);
        int i4 = ShareDataUIState + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setMonthDayClickListener(OnMonthDayClickListener onMonthDayClickListener) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.mMonthDayClickListener = onMonthDayClickListener;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }

    public int getMonth() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            getSCMonth().getMonth();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int month = getSCMonth().getMonth();
        int i3 = copydefault + 93;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return month;
    }

    public int getYear() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            getSCMonth().getYear();
            throw null;
        }
        int year = getSCMonth().getYear();
        int i3 = copydefault + 51;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return year;
        }
        throw null;
    }

    private void measureClickCell(int i, int i2) {
        int i3 = 2 % 2;
        if (i < this.realRowCount) {
            int i4 = ShareDataUIState + 57;
            copydefault = i4 % 128;
            if (i4 % 2 == 0 ? i2 < 7 : i2 < 89) {
                FullDay[] fullDayArr = this.mSCMonth.getMonthDays()[i];
                if (fullDayArr == null || fullDayArr.length == 0) {
                    L.d(TAG, "Not found the row's days");
                    return;
                }
                FullDay fullDay = fullDayArr[i2];
                if (this.mMonthDayClickListener != null) {
                    if (SCDateUtils.isMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth())) {
                        this.mMonthDayClickListener.onMonthDayClick(new FullDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getDay(), fullDay.getDayFlag()));
                    } else if (SCDateUtils.isPrevMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth())) {
                        this.mMonthDayClickListener.onMonthDayClick(new FullDay(this.mSCMonth.getPrevMonth().getYear(), this.mSCMonth.getPrevMonth().getMonth(), fullDay.getDay(), fullDay.getDayFlag()));
                    } else if (SCDateUtils.isNextMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth())) {
                        this.mMonthDayClickListener.onMonthDayClick(new FullDay(this.mSCMonth.getNextMonth().getYear(), this.mSCMonth.getNextMonth().getMonth(), fullDay.getDay(), fullDay.getDayFlag()));
                    }
                }
                int i5 = copydefault + 23;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        L.d(TAG, "Out of bound");
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        super.onMeasure(i, i2);
        int measurement = getMeasurement(i, this.mDefaultWidth);
        int measurement2 = getMeasurement(i2, SizeUtils.dp2px(48.0f) * this.realRowCount);
        this.dayWidth = measurement / 7;
        this.dayHeight = SizeUtils.dp2px(48.0f);
        setMeasuredDimension(measurement, measurement2);
        int i6 = ShareDataUIState + 91;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[PHI: r0 r1 r2 r10
  0x0039: PHI (r0v5 int) = (r0v1 int), (r0v6 int) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r1v9 int) = (r1v1 int), (r1v14 int) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r2v5 int) = (r2v0 int), (r2v7 int) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r10v7 android.view.View) = (r10v4 android.view.View), (r10v8 android.view.View) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[PHI: r0 r1 r2 r10
  0x0048: PHI (r0v2 int) = (r0v1 int), (r0v6 int) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r1v2 int) = (r1v1 int), (r1v14 int) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r2v1 int) = (r2v0 int), (r2v7 int) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r10v5 android.view.View) = (r10v4 android.view.View), (r10v8 android.view.View) binds: [B:10:0x0037, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            r6 = 2
            int r7 = r6 % r6
            boolean r7 = com.blankj.utilcode.util.ViewUtils.isLayoutRtl()
            int r8 = r5.getChildCount()
            r9 = 0
        Lc:
            if (r9 >= r8) goto L60
            int r10 = com.huawei.digitalpayment.datepicker.library.MonthView.copydefault
            int r10 = r10 + 87
            int r0 = r10 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState = r0
            int r10 = r10 % r6
            if (r10 != 0) goto L28
            android.view.View r10 = r5.getChildAt(r9)
            int r0 = r9 << 51
            int r1 = r0 % 16
            int r1 = r9 - r1
            int r2 = r5.dayWidth
            if (r7 != 0) goto L39
            goto L48
        L28:
            android.view.View r10 = r5.getChildAt(r9)
            int r0 = r9 / 7
            int r1 = r0 * 7
            int r1 = r9 - r1
            int r2 = r5.dayWidth
            r3 = r7 ^ 1
            r4 = 1
            if (r3 == r4) goto L48
        L39:
            int r3 = r2 * 7
            int r1 = r1 * r2
            int r3 = r3 - r1
            int r3 = r3 - r2
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.copydefault = r2
            int r1 = r1 % r6
            goto L53
        L48:
            int r3 = r1 * r2
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.copydefault = r2
            int r1 = r1 % r6
        L53:
            int r1 = r5.dayHeight
            int r0 = r0 * r1
            int r2 = r5.dayWidth
            int r2 = r2 + r3
            int r1 = r1 + r0
            r10.layout(r3, r0, r2, r1)
            int r9 = r9 + 1
            goto Lc
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.MonthView.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r7 = com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState + 99;
        com.huawei.digitalpayment.datepicker.library.MonthView.copydefault = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r1 == 1073741824) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        return java.lang.Math.min(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r1 == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getMeasurement(int r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L1f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            r4 = 32
            int r4 = r4 / r2
            if (r1 == r3) goto L3c
            goto L29
        L1f:
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            if (r1 == r3) goto L3c
        L29:
            if (r1 == 0) goto L40
            int r7 = com.huawei.digitalpayment.datepicker.library.MonthView.ShareDataUIState
            int r7 = r7 + 99
            int r3 = r7 % 128
            com.huawei.digitalpayment.datepicker.library.MonthView.copydefault = r3
            int r7 = r7 % r0
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L3a
            r7 = r2
            goto L40
        L3a:
            r7 = r6
            goto L40
        L3c:
            int r7 = java.lang.Math.min(r6, r7)
        L40:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.MonthView.getMeasurement(int, int):int");
    }

    public int getCurrentMonthLastRowDayCount() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        for (FullDay fullDay : this.mSCMonth.getMonthDays()[this.realRowCount - 1]) {
            int i5 = copydefault + 105;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            if (SCDateUtils.isMonthDay(this.mSCMonth.getYear(), this.mSCMonth.getMonth(), fullDay.getYear(), fullDay.getMonth())) {
                int i7 = ShareDataUIState;
                int i8 = i7 + 3;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                i4++;
                int i10 = i7 + 87;
                copydefault = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        return i4;
    }

    public void refresh() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        notifySelectedDaysChanged();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m12219$r8$lambda$GZZm4G2327D5rtfWnMfGIFB1ZA(MonthView monthView, int i, int i2, View view) {
        int i3 = 2 % 2;
        int i4 = copydefault + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        m12220instrumented$0$createDayViews$V(monthView, i, i2, view);
        int i6 = copydefault + 65;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$r00NydxGtl86W7rslGbMaJ_N9sc(MonthView monthView) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        monthView.lambda$setSCMonth$0();
        int i4 = ShareDataUIState + 53;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m12220instrumented$0$createDayViews$V(MonthView monthView, int i, int i2, View view) {
        int i3 = 2 % 2;
        int i4 = copydefault + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        Callback.onClick_enter(view);
        try {
            monthView.lambda$createDayViews$1(i, i2, view);
            Callback.onClick_exit();
            int i6 = copydefault + 27;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
