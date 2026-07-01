package com.huawei.common.widget.gloading;

import android.view.View;
import com.huawei.common.widget.Gloading;

public class GlobalAdapter implements Gloading.Adapter {
    public static final String HIDE_LOADING_STATUS_MSG = "hide_loading_status_msg";

    @Override
    public View getView(Gloading.Holder holder, View view, int i) {
        GlobalLoadingStatusView globalLoadingStatusView = view instanceof GlobalLoadingStatusView ? (GlobalLoadingStatusView) view : null;
        if (globalLoadingStatusView == null) {
            globalLoadingStatusView = new GlobalLoadingStatusView(holder.getContext(), holder.getRetryTask());
        }
        globalLoadingStatusView.setStatus(i);
        globalLoadingStatusView.setMsgViewVisibility(!HIDE_LOADING_STATUS_MSG.equals(holder.getData()));
        return globalLoadingStatusView;
    }
}
