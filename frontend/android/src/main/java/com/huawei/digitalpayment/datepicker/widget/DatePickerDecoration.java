package com.huawei.digitalpayment.datepicker.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class DatePickerDecoration extends RecyclerView.ItemDecoration {
    private static int component3 = 0;
    private static int copydefault = 1;
    private int component2;

    public DatePickerDecoration(int i) {
        this.component2 = i;
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0 ? recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1 : recyclerView.getChildAdapterPosition(view) == (recyclerView.getAdapter().getItemCount() << 1)) {
            rect.bottom = 0;
            return;
        }
        rect.bottom = this.component2;
        int i3 = component3 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }
}
