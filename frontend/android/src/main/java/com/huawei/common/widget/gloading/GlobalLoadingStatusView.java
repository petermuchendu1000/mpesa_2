package com.huawei.common.widget.gloading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;

public class GlobalLoadingStatusView extends LinearLayout implements View.OnClickListener {
    private final Button btnTryAgain;
    private final ImageView imageView;
    private final ProgressBar progressBar;
    private final Runnable retryTask;
    private final TextView textView;

    public GlobalLoadingStatusView(Context context, Runnable runnable) {
        super(context);
        setGravity(1);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.common_view_global_loading_status, (ViewGroup) this, true);
        this.imageView = (ImageView) findViewById(R.id.image);
        this.progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        this.textView = (TextView) findViewById(R.id.text);
        this.btnTryAgain = (Button) findViewById(R.id.btn_search_again);
        this.retryTask = runnable;
        setBackgroundColor(-1);
    }

    public void setMsgViewVisibility(boolean z) {
        this.textView.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStatus(int r8) {
        /*
            r7 = this;
            int r0 = com.huawei.common.R.string.str_none
            r1 = 2
            r2 = -1
            r3 = 3
            r4 = 0
            if (r8 == r1) goto L27
            r1 = 1
            if (r8 == r3) goto L14
            r5 = 4
            if (r8 == r5) goto Lf
            goto L28
        Lf:
            int r0 = com.huawei.common.R.string.no_record_yet
            int r5 = com.huawei.common.R.mipmap.icon_no_record_yet
            goto L29
        L14:
            boolean r0 = com.blankj.utilcode.util.NetworkUtils.isConnected()
            if (r0 != 0) goto L1f
            int r0 = com.huawei.common.R.string.network_exception
            int r5 = com.huawei.common.R.mipmap.icon_no_wifi
            goto L23
        L1f:
            int r0 = com.huawei.common.R.string.system_server_error
            int r5 = com.huawei.common.R.mipmap.icon_system_server_error
        L23:
            r7.setOnClickListener(r7)
            goto L29
        L27:
            r1 = r4
        L28:
            r5 = r2
        L29:
            r6 = 8
            if (r5 == r2) goto L3d
            android.widget.ProgressBar r2 = r7.progressBar
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r7.imageView
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r7.imageView
            r2.setImageResource(r5)
            goto L47
        L3d:
            android.widget.ProgressBar r2 = r7.progressBar
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r7.imageView
            r2.setVisibility(r6)
        L47:
            java.lang.Runnable r2 = r7.retryTask
            if (r2 == 0) goto L58
            if (r3 != r8) goto L58
            android.widget.Button r8 = r7.btnTryAgain
            r8.setVisibility(r4)
            android.widget.Button r8 = r7.btnTryAgain
            r8.setOnClickListener(r7)
            goto L5d
        L58:
            android.widget.Button r8 = r7.btnTryAgain
            r8.setVisibility(r6)
        L5d:
            android.widget.TextView r8 = r7.textView
            r8.setText(r0)
            if (r1 == 0) goto L65
            goto L66
        L65:
            r4 = r6
        L66:
            r7.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.gloading.GlobalLoadingStatusView.setStatus(int):void");
    }

    @Override
    public void onClick(View view) {
        Callback.onClick_enter(view);
        try {
            Runnable runnable = this.retryTask;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            Callback.onClick_exit();
        }
    }
}
