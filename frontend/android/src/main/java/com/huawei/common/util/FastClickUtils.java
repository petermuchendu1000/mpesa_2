package com.huawei.common.util;

import android.view.View;
import com.huawei.common.listener.FilterFastClickListener;

public class FastClickUtils {
    public static void setOnClickListener(View view, View.OnClickListener onClickListener) {
        setOnClickListener(view, onClickListener, 600L);
    }

    public static void setOnClickListener(View view, final View.OnClickListener onClickListener, long j) {
        if (view == null) {
            return;
        }
        if (onClickListener == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new FilterFastClickListener(j) {
                @Override
                public void onFilterClick(View view2) {
                    onClickListener.onClick(view2);
                }
            });
        }
    }
}
