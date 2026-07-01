package com.huawei.common.widget.recyclerview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewDivider extends RecyclerView.ItemDecoration {
    private int ShareDataUIState;
    private final Paint component1;
    private int component2;
    private int component3;
    private int copy;
    private final int copydefault;
    private int equals;
    private boolean getRequestBeneficiariesState;

    public void setStartDivider(int i) {
        if (i < 0) {
            return;
        }
        this.equals = i;
    }

    public void setShowEndLine(boolean z) {
        this.getRequestBeneficiariesState = z;
    }

    public RecycleViewDivider(int i, int i2) {
        Paint paint = new Paint();
        this.component1 = paint;
        paint.setColor(i);
        this.copydefault = i2;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.component2 = i;
        this.copy = i2;
        this.ShareDataUIState = i3;
        this.component3 = i4;
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemCount() : recyclerView.getChildCount();
        if (childAdapterPosition >= this.equals && (this.getRequestBeneficiariesState || childAdapterPosition != itemCount - 1)) {
            rect.bottom = this.copy + this.copydefault + this.component3;
        } else {
            rect.bottom = 0;
        }
    }

    @Override
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth();
        int paddingRight = recyclerView.getPaddingRight();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            int itemCount = recyclerView.getAdapter() != null ? recyclerView.getAdapter().getItemCount() : childCount;
            if (childAdapterPosition >= this.equals && (this.getRequestBeneficiariesState || childAdapterPosition != itemCount - 1)) {
                float bottom = childAt.getBottom();
                int bottom2 = childAt.getBottom();
                int i2 = this.copy;
                int i3 = this.copydefault;
                canvas.drawRect(paddingLeft + this.component2, bottom + i2, (width - paddingRight) - this.ShareDataUIState, (((bottom2 + i2) + i3) + r11) - this.component3, this.component1);
            }
        }
    }
}
