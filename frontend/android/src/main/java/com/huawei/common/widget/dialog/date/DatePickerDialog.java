package com.huawei.common.widget.dialog.date;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.common.R;
import com.huawei.common.widget.date.WheelPicker;
import com.huawei.common.widget.dialog.BottomDialog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class DatePickerDialog extends BottomDialog<ViewDataBinding> {
    private static final String component2 = "DatePickerDialog";
    private Calendar ArtificialStackFrames;
    private String CoroutineDebuggingKt;
    private int ShareDataUIState;
    private View component1;
    private int component3;
    private Calendar component4;
    private String copy;
    private int copydefault;
    private WheelPicker coroutineBoundary;
    private WheelPicker coroutineCreation;
    private View.OnClickListener equals;
    private WheelPicker getARTIFICIAL_FRAME_PACKAGE_NAME;
    private View.OnClickListener getAsAtTimestamp;
    private String getRequestBeneficiariesState;
    private Typeface getShareableDataState;
    private Typeface getSponsorBeneficiariesState;
    private TextView hashCode;
    private String toString;

    public DatePickerDialog() {
        this(null, null, null);
    }

    public DatePickerDialog(Calendar calendar, Calendar calendar2, Calendar calendar3) {
        this(null, calendar, calendar2, calendar3);
    }

    public DatePickerDialog(String str, Calendar calendar, Calendar calendar2, Calendar calendar3) {
        this.CoroutineDebuggingKt = TimeModel.NUMBER_FORMAT;
        this.getRequestBeneficiariesState = TimeModel.NUMBER_FORMAT;
        this.copy = TimeModel.NUMBER_FORMAT;
        if (calendar3 == null) {
            calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(System.currentTimeMillis());
        }
        int i = calendar3.get(1);
        if (calendar == null) {
            calendar = Calendar.getInstance();
            calendar.set(1, i - 1000);
        }
        calendar3 = calendar3.compareTo(calendar) < 0 ? calendar : calendar3;
        if (calendar2 == null) {
            calendar2 = Calendar.getInstance();
            calendar2.set(1, i + 1000);
        }
        calendar3 = calendar3.compareTo(calendar2) > 0 ? calendar2 : calendar3;
        this.toString = str;
        this.ArtificialStackFrames = calendar;
        this.component4 = calendar2;
        this.component3 = calendar3.get(1);
        this.ShareDataUIState = calendar3.get(2) + 1;
        this.copydefault = calendar3.get(5);
    }

    public void setYearFormat(String str) {
        this.CoroutineDebuggingKt = str;
    }

    public void setMonthFormat(String str) {
        this.getRequestBeneficiariesState = str;
    }

    public void setDayFormat(String str) {
        this.copy = str;
    }

    public void setOnConfirmClickListener(View.OnClickListener onClickListener) {
        this.equals = onClickListener;
    }

    public void setOnCancelListener(View.OnClickListener onClickListener) {
        this.getAsAtTimestamp = onClickListener;
    }

    @Override
    public int getLayoutId() {
        return R.layout.common_dialog_date_picker;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return getLayoutInflater(layoutInflater).inflate(getLayoutId(), viewGroup, false);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        synchronized (this) {
            super.onDismiss(dialogInterface);
            View.OnClickListener onClickListener = this.getAsAtTimestamp;
            if (onClickListener != null) {
                onClickListener.onClick(null);
            }
        }
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.component1 = view.findViewById(R.id.btn_confirm);
        this.hashCode = (TextView) view.findViewById(R.id.tv_title);
        this.coroutineBoundary = (WheelPicker) view.findViewById(R.id.wheelyear);
        this.coroutineCreation = (WheelPicker) view.findViewById(R.id.wheelMonth);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = (WheelPicker) view.findViewById(R.id.wheelDay);
        setTypeface(this.getSponsorBeneficiariesState);
        setSelectedTypeface(this.getShareableDataState);
        View view2 = this.component1;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    DatePickerDialog.component1(this.f$0, view3);
                }
            });
        }
        TextView textView = this.hashCode;
        if (textView != null && (str = this.toString) != null) {
            textView.setText(str);
        }
        ShareDataUIState();
        component3();
        copydefault();
    }

    private void component3(View view) {
        this.getAsAtTimestamp = null;
        View.OnClickListener onClickListener = this.equals;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void ShareDataUIState() {
        ArrayList arrayList = new ArrayList();
        final int i = this.ArtificialStackFrames.get(1);
        int i2 = 0;
        for (int i3 = i; i3 <= this.component4.get(1); i3++) {
            if (i3 == this.component3) {
                i2 = i3 - i;
            }
            arrayList.add(getFormatYear(i3));
        }
        WheelPicker wheelPicker = this.coroutineBoundary;
        if (wheelPicker != null) {
            wheelPicker.setData(arrayList);
            this.coroutineBoundary.setSelectedItemPosition(i2, false);
            this.coroutineBoundary.setOnItemSelectedListener(new WheelPicker.OnItemSelectedListener() {
                @Override
                public final void onItemSelected(WheelPicker wheelPicker2, Object obj, int i4) {
                    this.f$0.component1(i, wheelPicker2, obj, i4);
                }
            });
        }
    }

    public void component1(int i, WheelPicker wheelPicker, Object obj, int i2) {
        this.component3 = i + i2;
        component3();
        copydefault();
    }

    public String getFormatYear(int i) {
        return String.format(Locale.ENGLISH, this.CoroutineDebuggingKt, Integer.valueOf(i));
    }

    public String getFormatMonth(int i) {
        return String.format(Locale.ENGLISH, this.getRequestBeneficiariesState, Integer.valueOf(i));
    }

    public String getFormatDay(int i) {
        return String.format(Locale.ENGLISH, this.copy, Integer.valueOf(i));
    }

    private void component3() {
        final int i = this.component3 == this.ArtificialStackFrames.get(1) ? this.ArtificialStackFrames.get(2) + 1 : 1;
        int i2 = this.component3 == this.component4.get(1) ? this.component4.get(2) + 1 : 12;
        ArrayList arrayList = new ArrayList();
        for (int i3 = i; i3 <= i2; i3++) {
            arrayList.add(getFormatMonth(i3));
        }
        if (!arrayList.contains(getFormatMonth(this.ShareDataUIState))) {
            if (this.ShareDataUIState < i) {
                this.ShareDataUIState = i;
            } else {
                this.ShareDataUIState = i2;
            }
        }
        int iIndexOf = arrayList.indexOf(getFormatMonth(this.ShareDataUIState));
        WheelPicker wheelPicker = this.coroutineCreation;
        if (wheelPicker != null) {
            wheelPicker.setData(arrayList);
            this.coroutineCreation.setSelectedItemPosition(iIndexOf, false);
            this.ShareDataUIState = iIndexOf + i;
            this.coroutineCreation.setOnItemSelectedListener(new WheelPicker.OnItemSelectedListener() {
                @Override
                public final void onItemSelected(WheelPicker wheelPicker2, Object obj, int i4) {
                    this.f$0.component3(i, wheelPicker2, obj, i4);
                }
            });
        }
    }

    public void component3(int i, WheelPicker wheelPicker, Object obj, int i2) {
        this.ShareDataUIState = i + i2;
        copydefault();
    }

    private void copydefault() {
        int iComponent2;
        final int i = (this.component3 == this.ArtificialStackFrames.get(1) && this.ShareDataUIState == this.ArtificialStackFrames.get(2) + 1) ? this.ArtificialStackFrames.get(5) : 1;
        int i2 = this.component4.get(1);
        int i3 = this.component4.get(2);
        if (this.component3 == i2 && this.ShareDataUIState == i3 + 1) {
            iComponent2 = this.component4.get(5);
        } else {
            iComponent2 = component2();
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = i; i4 <= iComponent2; i4++) {
            arrayList.add(getFormatDay(i4));
        }
        if (!arrayList.contains(getFormatDay(this.copydefault))) {
            if (this.copydefault < i) {
                this.copydefault = i;
            } else {
                this.copydefault = iComponent2;
            }
        }
        int iIndexOf = arrayList.indexOf(getFormatDay(this.copydefault));
        WheelPicker wheelPicker = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (wheelPicker != null) {
            wheelPicker.setData(arrayList);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setSelectedItemPosition(iIndexOf, false);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setOnItemSelectedListener(new WheelPicker.OnItemSelectedListener() {
                @Override
                public final void onItemSelected(WheelPicker wheelPicker2, Object obj, int i5) {
                    this.f$0.component2(i, wheelPicker2, obj, i5);
                }
            });
        }
    }

    public void component2(int i, WheelPicker wheelPicker, Object obj, int i2) {
        this.copydefault = i + i2;
    }

    public Calendar getSelectedCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.component3);
        calendar.set(2, this.ShareDataUIState - 1);
        calendar.set(5, this.copydefault);
        return calendar;
    }

    private int component2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.component3);
        calendar.set(2, this.ShareDataUIState - 1);
        calendar.set(5, 1);
        calendar.roll(5, -1);
        return calendar.get(5);
    }

    public void setSelectedTypeface(Typeface typeface) {
        this.getShareableDataState = typeface;
        WheelPicker wheelPicker = this.coroutineBoundary;
        if (wheelPicker != null) {
            wheelPicker.setSelectedTypeface(typeface);
        }
        WheelPicker wheelPicker2 = this.coroutineCreation;
        if (wheelPicker2 != null) {
            wheelPicker2.setSelectedTypeface(typeface);
        }
        WheelPicker wheelPicker3 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (wheelPicker3 != null) {
            wheelPicker3.setSelectedTypeface(typeface);
        }
    }

    public void setTypeface(Typeface typeface) {
        this.getSponsorBeneficiariesState = typeface;
        WheelPicker wheelPicker = this.coroutineBoundary;
        if (wheelPicker != null) {
            wheelPicker.setTypeface(typeface);
        }
        WheelPicker wheelPicker2 = this.coroutineCreation;
        if (wheelPicker2 != null) {
            wheelPicker2.setTypeface(typeface);
        }
        WheelPicker wheelPicker3 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (wheelPicker3 != null) {
            wheelPicker3.setTypeface(typeface);
        }
    }

    public static void component1(DatePickerDialog datePickerDialog, View view) {
        Callback.onClick_enter(view);
        try {
            datePickerDialog.component3(view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
