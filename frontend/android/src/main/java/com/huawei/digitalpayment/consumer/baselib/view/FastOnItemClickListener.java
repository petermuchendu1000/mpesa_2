package com.huawei.digitalpayment.consumer.baselib.view;

import android.view.View;
import com.chad.library.adapter4.BaseQuickAdapter;

public abstract class FastOnItemClickListener<T> implements BaseQuickAdapter.OnItemClickListener<T> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private long component1;
    private long component2;

    public abstract void onFastClick(BaseQuickAdapter<T, ?> baseQuickAdapter, View view, int i);

    public FastOnItemClickListener() {
        this.component1 = 0L;
        this.component2 = 500L;
    }

    public FastOnItemClickListener(long j) {
        this.component1 = 0L;
        this.component2 = j;
    }

    public void onClick(BaseQuickAdapter<T, ?> baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.component1 > this.component2) {
            int i3 = copydefault + 67;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                this.component1 = jCurrentTimeMillis;
                onFastClick(baseQuickAdapter, view, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.component1 = jCurrentTimeMillis;
            onFastClick(baseQuickAdapter, view, i);
            int i4 = copydefault + 97;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
