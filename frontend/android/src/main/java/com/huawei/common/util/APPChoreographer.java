package com.huawei.common.util;

import android.util.Log;
import android.view.Choreographer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/huawei/common/util/APPChoreographer;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "()V", "TAG1", "", "TAG", "NANOS_PER_MS", "", "TIME_INTERVAL", "WARNING_FRAME_COUNT", "lastFrameTimeNanos", "", "currentTotalTime", "frameCount", "startTime", "endTime", "start", "", "doFrame", "frameTimeNanos", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class APPChoreographer implements Choreographer.FrameCallback {
    private static final int ShareDataUIState = 1000000;
    private static final String component1 = "FrameMonitorWaring";
    private static final int component2 = 40;
    private static final int component3 = 970;
    private static int component4 = 0;
    private static final String copydefault = "FrameMonitor";
    private static long equals;
    private static long getRequestBeneficiariesState;
    public static final APPChoreographer INSTANCE = new APPChoreographer();
    private static String getAsAtTimestamp = "";
    private static String copy = "";

    private APPChoreographer() {
    }

    public final void start() {
        Choreographer.getInstance().postFrameCallback(this);
    }

    @Override
    public void doFrame(long frameTimeNanos) {
        long j = getRequestBeneficiariesState;
        if (j == 0) {
            getRequestBeneficiariesState = frameTimeNanos;
            getAsAtTimestamp = TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd:HH:mm:ss.SSS");
            start();
            return;
        }
        getRequestBeneficiariesState = frameTimeNanos;
        long j2 = equals + ((frameTimeNanos - j) / ((long) 1000000));
        equals = j2;
        if (j2 >= 970) {
            String time = TimeUtils.formatTime(System.currentTimeMillis(), "yyyy-MM-dd:HH:mm:ss.SSS");
            copy = time;
            Log.d(copydefault, getAsAtTimestamp + "-" + time + " total " + equals + "ms 绘制帧数为:" + component4);
            int i = component4;
            if (i < 40) {
                Log.e(component1, getAsAtTimestamp + "-" + copy + " total " + equals + "ms 绘制帧数为:" + i);
            }
            getAsAtTimestamp = copy;
            copy = "";
            component4 = 0;
            equals = 0L;
            start();
            return;
        }
        component4++;
        start();
    }
}
