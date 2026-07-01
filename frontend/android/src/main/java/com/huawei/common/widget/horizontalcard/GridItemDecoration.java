package com.huawei.common.widget.horizontalcard;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class GridItemDecoration extends RecyclerView.ItemDecoration {
    private final int ShareDataUIState;
    private final int component1;
    private final int component3;

    public GridItemDecoration(int i, int i2) {
        this.ShareDataUIState = i;
        this.component3 = i2;
        this.component1 = (i2 * (i - 1)) / i;
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int i = this.ShareDataUIState;
        rect.left = Math.round((this.component1 * (childLayoutPosition % i)) / (i - 1));
        rect.right = this.component1 - rect.left;
        rect.top = 0;
        rect.bottom = this.component3;
    }
}
