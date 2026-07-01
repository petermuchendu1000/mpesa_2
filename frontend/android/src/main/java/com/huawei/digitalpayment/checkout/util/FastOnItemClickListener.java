package com.huawei.digitalpayment.checkout.util;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

public abstract class FastOnItemClickListener implements OnItemClickListener {
    private static int component2 = 1;
    private static int component3;
    private long ShareDataUIState;
    private long copydefault;

    public abstract void onFastClick(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i);

    public FastOnItemClickListener() {
        this.ShareDataUIState = 0L;
        this.copydefault = 500L;
    }

    public FastOnItemClickListener(long j) {
        this.ShareDataUIState = 0L;
        this.copydefault = j;
    }

    @Override
    public void onItemClick(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
        long jCurrentTimeMillis;
        int i2 = 2 % 2;
        int i3 = component3 + 19;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if ((this.ShareDataUIState | jCurrentTimeMillis) <= this.copydefault) {
                return;
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.ShareDataUIState <= this.copydefault) {
                return;
            }
        }
        int i4 = component2 + 61;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            this.ShareDataUIState = jCurrentTimeMillis;
            onFastClick(baseQuickAdapter, view, i);
        } else {
            this.ShareDataUIState = jCurrentTimeMillis;
            onFastClick(baseQuickAdapter, view, i);
            int i5 = 28 / 0;
        }
    }
}
