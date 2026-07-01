package com.huawei.digitalpayment.consumer.base.session;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.safaricom.mpesa.logging.L;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/session/SFCGlobalActivityLifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "onActivityCreated", "", "p0", "Landroid/app/Activity;", "p1", "Landroid/os/Bundle;", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCGlobalActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    private static int component1 = 1;
    public static int component2 = 2007495733;
    private static int component3;

    @Override
    public void onActivityResumed(Activity p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        L.INSTANCE.d("SFCGlobalActivityLifecycleCallback", "onActivityResumed: " + p0, new Object[0]);
        SFCSessionOutManager.INSTANCE.onActivityResumed(p0);
        int i2 = component1 + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onActivityCreated(Activity p0, Bundle p1) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = component1 + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onActivityDestroyed(Activity p0) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = component1 + 107;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onActivityPaused(Activity p0) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        int i5 = component3 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int i4 = component1 + 27;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }

    @Override
    public void onActivityStarted(Activity p0) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
    }

    @Override
    public void onActivityStopped(Activity p0) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = component3 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
