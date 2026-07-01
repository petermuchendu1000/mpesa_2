package com.huawei.digitalpayment.consumer.basic.ui.service;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.service.DefaultAppUpdateServiceIml;
import com.huawei.digitalpayment.consumer.baselib.util.update.provider.AppUpdate;
import com.huawei.digitalpayment.consumer.basic.ui.dialog.AppUpdateRemindDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/service/AppUpdateServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultAppUpdateServiceIml;", "<init>", "()V", "updateRemindDialog", "Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/AppUpdateRemindDialog;", "showAppUpdateDialog", "", "params", "Lcom/huawei/digitalpayment/consumer/baselib/util/update/provider/AppUpdate;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "tag", "", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppUpdateServiceIml extends DefaultAppUpdateServiceIml {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private AppUpdateRemindDialog ShareDataUIState;

    @Override
    public void showAppUpdateDialog(AppUpdate params, AppCompatActivity activity, String tag) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(tag, "");
        if (params.isNeedUpdate()) {
            int i4 = component1 + 33;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            AppUpdateRemindDialog appUpdateRemindDialog = this.ShareDataUIState;
            if (appUpdateRemindDialog == null || !appUpdateRemindDialog.isShowing) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(activity.getString(R.string.appUpdate), params);
                AppUpdateRemindDialog appUpdateRemindDialogNewInstance = AppUpdateRemindDialog.INSTANCE.newInstance(bundle);
                this.ShareDataUIState = appUpdateRemindDialogNewInstance;
                if (appUpdateRemindDialogNewInstance != null) {
                    appUpdateRemindDialogNewInstance.show(activity.getSupportFragmentManager(), tag);
                }
            }
        }
        int i6 = copydefault + 87;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
    }

    static {
        int i = 1 + 63;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
