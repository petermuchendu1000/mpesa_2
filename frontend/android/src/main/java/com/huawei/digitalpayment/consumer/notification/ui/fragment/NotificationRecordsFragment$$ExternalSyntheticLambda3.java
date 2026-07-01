package com.huawei.digitalpayment.consumer.notification.ui.fragment;

import kotlin.postWhenReportersAreDone;
import kotlin.reportRunnablelambda2;

public final class NotificationRecordsFragment$$ExternalSyntheticLambda3 implements Runnable {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final NotificationRecordsFragment f$0;

    public NotificationRecordsFragment$$ExternalSyntheticLambda3(NotificationRecordsFragment notificationRecordsFragment) {
        this.f$0 = notificationRecordsFragment;
    }

    public static void component2() {
        reportRunnablelambda2.component2[0] = postWhenReportersAreDone.component2[0];
    }

    @Override
    public final void run() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordsFragment.m10796$r8$lambda$gcUW8Q3XC3m4Py2BGX6EoEnplI(this.f$0);
        int i4 = ShareDataUIState + 125;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }
}
