package com.huawei.digitalpayment.consumer.baselib.service;

import androidx.appcompat.app.AppCompatActivity;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.baselib.util.update.provider.AppUpdate;
import com.mpesa.qrcode.constants.QRFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/AppUpdateService;", "", "setCachedUpdateBean", "", "bean", "Lcom/huawei/digitalpayment/consumer/baselib/util/update/UpdateBean;", "getCachedUpdateBean", "showAppUpdateDialog", "params", "Lcom/huawei/digitalpayment/consumer/baselib/util/update/provider/AppUpdate;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", QRFormat.STRING, "", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppUpdateService {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 1;
        private static int copydefault;

        public static UpdateBean getCachedUpdateBean(AppUpdateService appUpdateService) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 31;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 91 / 0;
            }
            int i5 = i2 + 3;
            component1 = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public static void setCachedUpdateBean(AppUpdateService appUpdateService, UpdateBean updateBean) {
            int i = 2 % 2;
            int i2 = copydefault + 49;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void showAppUpdateDialog(AppUpdateService appUpdateService, AppUpdate appUpdate, AppCompatActivity appCompatActivity, String str) {
            int i = 2 % 2;
            int i2 = component1 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(appUpdate, "");
            Intrinsics.checkNotNullParameter(appCompatActivity, "");
            Intrinsics.checkNotNullParameter(str, "");
            int i4 = component1 + 101;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
        }
    }

    UpdateBean getCachedUpdateBean();

    void setCachedUpdateBean(UpdateBean bean);

    void showAppUpdateDialog(AppUpdate params, AppCompatActivity activity, String String);
}
