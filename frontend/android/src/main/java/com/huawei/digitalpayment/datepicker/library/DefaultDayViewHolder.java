package com.huawei.digitalpayment.datepicker.library;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.digitalpayment.datepicker.R;

public final class DefaultDayViewHolder extends DayViewHolder {
    private static int component1 = 0;
    private static int copydefault = 1;
    protected View bgEnd;
    protected View bgStart;
    private int component2;
    private int component3;
    protected TextView tvDay;

    public DefaultDayViewHolder(View view) {
        super(view);
        this.tvDay = (TextView) view.findViewById(R.id.tvDay);
        this.bgStart = view.findViewById(R.id.bgStart);
        this.bgEnd = view.findViewById(R.id.bgEnd);
        this.component3 = ContextCompat.getColor(this.mContext, R.color.colorSecondaryText);
        this.component2 = ContextCompat.getColor(this.mContext, R.color.colorSecondaryText);
        int iWithAlpha = ColorUtils.INSTANCE.withAlpha(0.1f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorPrimary));
        this.bgStart.setBackgroundColor(iWithAlpha);
        this.bgEnd.setBackgroundColor(iWithAlpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if ((r6 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r5.tvDay.setTextColor(androidx.core.content.ContextCompat.getColor(r5.mContext, com.huawei.digitalpayment.datepicker.R.color.common_colorWhite));
        r5.tvDay.setBackgroundColor(com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.datepicker.R.color.colorPrimary));
        r5.bgStart.setVisibility(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        r5.tvDay.setTextColor(androidx.core.content.ContextCompat.getColor(r5.mContext, com.huawei.digitalpayment.datepicker.R.color.common_colorWhite));
        r5.tvDay.setBackgroundColor(com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.datepicker.R.color.colorPrimary));
        r5.bgStart.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r5.bgEnd.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (r6.getDayFlag() != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r5.tvDay.setTextColor(androidx.core.content.ContextCompat.getColor(r5.mContext, com.huawei.digitalpayment.datepicker.R.color.common_colorWhite));
        r5.tvDay.setBackgroundColor(com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.datepicker.R.color.colorPrimary));
        r5.bgStart.setVisibility(0);
        r5.bgEnd.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        if (r6.getDayFlag() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        r6 = com.huawei.digitalpayment.datepicker.library.DefaultDayViewHolder.component1 + 125;
        com.huawei.digitalpayment.datepicker.library.DefaultDayViewHolder.copydefault = r6 % 128;
        r6 = r6 % 2;
        r5.tvDay.setTextColor(androidx.core.content.ContextCompat.getColor(r5.mContext, com.huawei.digitalpayment.datepicker.R.color.colorMainText));
        r5.tvDay.setBackgroundColor(0);
        r5.bgStart.setVisibility(0);
        r5.bgEnd.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00eb, code lost:
    
        if (r6.getDayFlag() == (-2)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        if (r6.getDayFlag() != (-3)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
    
        r5.tvDay.setTextColor(androidx.core.content.ContextCompat.getColor(r5.mContext, com.huawei.digitalpayment.datepicker.R.color.colorMainText));
        r5.tvDay.setBackgroundColor(0);
        r5.bgStart.setVisibility(4);
        r5.bgEnd.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0112, code lost:
    
        r5.tvDay.setTextColor(androidx.core.content.ContextCompat.getColor(r5.mContext, com.huawei.digitalpayment.datepicker.R.color.common_colorWhite));
        r5.tvDay.setBackgroundColor(com.blankj.utilcode.util.ColorUtils.getColor(com.huawei.digitalpayment.datepicker.R.color.colorPrimary));
        r5.bgStart.setVisibility(4);
        r5.bgEnd.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0134, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r6.getDayFlag() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6.getDayFlag() == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r6 = com.huawei.digitalpayment.datepicker.library.DefaultDayViewHolder.copydefault + 23;
        com.huawei.digitalpayment.datepicker.library.DefaultDayViewHolder.component1 = r6 % 128;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentMonthDayText(com.huawei.digitalpayment.datepicker.library.FullDay r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.datepicker.library.DefaultDayViewHolder.setCurrentMonthDayText(com.huawei.digitalpayment.datepicker.library.FullDay, boolean):void");
    }

    @Override
    public void setPrevMonthDayText(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.tvDay.setTextColor(this.component3);
        this.tvDay.setText(String.valueOf(fullDay.getDay()));
        this.tvDay.setBackgroundResource(R.drawable.datepicker_shape_dayview_text_bg_normal);
        this.bgStart.setVisibility(4);
        this.bgEnd.setVisibility(4);
        int i4 = component1 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setNextMonthDayText(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.tvDay.setTextColor(this.component2);
        this.tvDay.setText(String.valueOf(fullDay.getDay()));
        this.tvDay.setBackgroundResource(R.drawable.datepicker_shape_dayview_text_bg_normal);
        this.bgStart.setVisibility(4);
        this.bgEnd.setVisibility(4);
        int i4 = copydefault + 119;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void setBeyondRangeDayText(FullDay fullDay) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.tvDay.setTextColor(this.component2);
        this.tvDay.setText(String.valueOf(fullDay.getDay()));
        this.tvDay.setBackgroundResource(R.drawable.datepicker_shape_dayview_text_bg_normal);
        this.bgStart.setVisibility(4);
        this.bgEnd.setVisibility(4);
        int i4 = component1 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
