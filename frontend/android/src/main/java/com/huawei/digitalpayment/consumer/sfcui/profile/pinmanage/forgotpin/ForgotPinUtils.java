package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.forgotpin;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/forgotpin/ForgotPinUtils;", "", "<init>", "()V", "activityList", "", "Landroid/app/Activity;", "addActivity", "", "activity", "clearActivityList", "closeActivity", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ForgotPinUtils {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    public static final ForgotPinUtils INSTANCE = new ForgotPinUtils();
    private static final List<Activity> component3 = new ArrayList();
    public static final int $stable = 8;

    private ForgotPinUtils() {
    }

    static {
        int i = component2 + 107;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    public final void addActivity(Activity activity) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            component3.add(activity);
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            component3.add(activity);
            int i3 = 0 / 0;
        }
    }

    public final void clearActivityList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component3.clear();
        int i4 = component1 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void closeActivity() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Iterator<Activity> it = component3.iterator();
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            Activity next = it.next();
            if (!next.isFinishing()) {
                int i6 = component1 + 97;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                next.finish();
                if (i7 == 0) {
                    int i8 = 33 / 0;
                }
            }
        }
    }
}
