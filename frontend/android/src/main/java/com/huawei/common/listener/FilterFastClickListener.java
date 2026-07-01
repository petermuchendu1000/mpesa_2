package com.huawei.common.listener;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;

public abstract class FilterFastClickListener implements View.OnClickListener {
    private long component3;

    public abstract void onFilterClick(View view);

    public FilterFastClickListener() {
        this.component3 = 600L;
    }

    public FilterFastClickListener(long j) {
        this.component3 = j;
    }

    @Override
    public void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object tag = view.getTag(R.id.view_last_click_time);
            if (tag == null) {
                view.setTag(R.id.view_last_click_time, Long.valueOf(jCurrentTimeMillis));
                onFilterClick(view);
            } else {
                if (jCurrentTimeMillis - ((Long) tag).longValue() < this.component3) {
                    return;
                }
                view.setTag(R.id.view_last_click_time, Long.valueOf(jCurrentTimeMillis));
                onFilterClick(view);
            }
        } finally {
            Callback.onClick_exit();
        }
    }
}
