package com.huawei.digitalpayment.consumer.ootb;

import android.app.Application;
import com.safaricom.mpesa.logging.L;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/ootb/LogHelper;", "", "<init>", "()V", "initializeLogging", "", "applicationContext", "Landroid/app/Application;", "SFC-consumer-prod-release_v5.1.9_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogHelper {
    public static final LogHelper INSTANCE = new LogHelper();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    private LogHelper() {
    }

    public final void initializeLogging(Application applicationContext) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(applicationContext, "");
            L.INSTANCE.setEnabled(BuildConfig.LOGS_ENABLED.booleanValue());
            L.INSTANCE.isEnabled();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(applicationContext, "");
        L.INSTANCE.setEnabled(BuildConfig.LOGS_ENABLED.booleanValue());
        if (L.INSTANCE.isEnabled()) {
            L.INSTANCE.setDeveloperLogsEnabled(true);
            String str = "My OneApp-5.1.9-prod-log-report-" + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + ".log";
            try {
                L l = L.INSTANCE;
                File filesDir = applicationContext.getFilesDir();
                Intrinsics.checkNotNullExpressionValue(filesDir, "");
                l.setFileLogger(filesDir, str);
            } catch (Exception e) {
                L.INSTANCE.e("Unable to create file logger. Error was=" + e.getMessage(), new Object[0]);
            }
        }
        int i3 = component3 + 75;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = copydefault + 113;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
