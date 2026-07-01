package com.huawei.digitalpayment.consumer.home.widget;

import androidx.recyclerview.widget.RecyclerView;

public class SearchDecoration extends RecyclerView.ItemDecoration {
    private static int component2 = 1;
    private static int component3;
    private int ShareDataUIState;

    public SearchDecoration(int i) {
        this.ShareDataUIState = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[PHI: r6
  0x0038: PHI (r6v6 int) = (r6v3 int), (r6v15 int) binds: [B:8:0x0026, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getItemOffsets(android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, androidx.recyclerview.widget.RecyclerView.State r8) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component3
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1c
            super.getItemOffsets(r5, r6, r7, r8)
            int r6 = r7.getChildAdapterPosition(r6)
            int r6 = r6 << 3
            if (r6 != 0) goto L38
            goto L28
        L1c:
            super.getItemOffsets(r5, r6, r7, r8)
            int r6 = r7.getChildAdapterPosition(r6)
            int r6 = r6 + r3
            int r6 = r6 % 4
            if (r3 != r6) goto L38
        L28:
            r5.left = r2
            int r6 = r4.ShareDataUIState
            r5.right = r6
            int r5 = com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component3
            int r5 = r5 + 123
        L32:
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component2 = r6
            int r5 = r5 % r0
            goto L60
        L38:
            if (r6 != 0) goto L53
            int r6 = com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component2
            int r6 = r6 + 9
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component3 = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L4c
            int r6 = r4.ShareDataUIState
            r5.left = r6
            r5.right = r3
            goto L60
        L4c:
            int r6 = r4.ShareDataUIState
            r5.left = r6
            r5.right = r2
            goto L60
        L53:
            int r6 = r4.ShareDataUIState
            r5.left = r6
            int r6 = r4.ShareDataUIState
            r5.right = r6
            int r5 = com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.component3
            int r5 = r5 + 119
            goto L32
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.widget.SearchDecoration.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
