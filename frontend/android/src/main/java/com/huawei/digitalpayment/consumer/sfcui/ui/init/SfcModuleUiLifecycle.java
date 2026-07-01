package com.huawei.digitalpayment.consumer.sfcui.ui.init;

import android.content.Context;
import com.huawei.common.module.UserLifecycle;
import com.huawei.digitalpayment.consumer.base.util.FavouriteHelper;
import com.huawei.digitalpayment.consumer.base.util.IVEncryptHelper;
import com.huawei.digitalpayment.consumer.sfcui.utils.ContactUtils;
import com.huawei.digitalpayment.mobileapp.report.EventReportUtils;
import java.util.concurrent.Executors;

public class SfcModuleUiLifecycle implements UserLifecycle {
    private static int component1 = 1;
    private static int component2;
    private boolean copydefault = false;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAfterLogin(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            r4 = 2
            int r5 = r4 % r4
            int r5 = com.huawei.digitalpayment.consumer.sfcui.ui.init.SfcModuleUiLifecycle.component1
            int r5 = r5 + 53
            int r0 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.init.SfcModuleUiLifecycle.component2 = r0
            int r5 = r5 % r4
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r1 = 1
            if (r5 == 0) goto L1c
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r1] = r0
            boolean r5 = com.blankj.utilcode.util.PermissionUtils.isGranted(r5)
            if (r5 == 0) goto L32
            goto L26
        L1c:
            java.lang.String[] r5 = new java.lang.String[]{r0}
            boolean r5 = com.blankj.utilcode.util.PermissionUtils.isGranted(r5)
            if (r5 == 0) goto L32
        L26:
            r2.copydefault(r3)
            int r3 = com.huawei.digitalpayment.consumer.sfcui.ui.init.SfcModuleUiLifecycle.component2
            int r3 = r3 + 31
            int r5 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.init.SfcModuleUiLifecycle.component1 = r5
            int r3 = r3 % r4
        L32:
            com.huawei.digitalpayment.consumer.base.util.IVEncryptHelper r3 = com.huawei.digitalpayment.consumer.base.util.IVEncryptHelper.INSTANCE
            r4 = 6
            java.lang.String r4 = com.huawei.common.util.encrypt.EncryptUtils.createRandomDynamicIv(r4)
            r3.setIvLoginEncrypt(r4)
            com.huawei.digitalpayment.consumer.base.util.FavouriteHelper r3 = com.huawei.digitalpayment.consumer.base.util.FavouriteHelper.INSTANCE
            r3.setNeedReFresh(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.init.SfcModuleUiLifecycle.onAfterLogin(android.content.Context, java.lang.String, boolean):void");
    }

    private void copydefault(final Context context) {
        int i = 2 % 2;
        if (ContactUtils.INSTANCE.getAllContacts().isEmpty()) {
            int i2 = component1 + 21;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            Executors.newSingleThreadExecutor().execute(new Runnable() {
                private static int ShareDataUIState = 0;
                private static int component1 = 1;

                @Override
                public final void run() {
                    int i3 = 2 % 2;
                    int i4 = ShareDataUIState + 67;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    SfcModuleUiLifecycle.component3(context);
                    int i6 = component1 + 27;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 77 / 0;
                    }
                }
            });
            int i3 = component2 + 57;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static void component3(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ContactUtils.INSTANCE.fetchContacts(context);
        int i4 = component2 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            EventReportUtils.INSTANCE.setInitiatorMsisdn(null);
            IVEncryptHelper.INSTANCE.setIvLoginEncrypt(null);
            FavouriteHelper.INSTANCE.clearCacheData();
        } else {
            EventReportUtils.INSTANCE.setInitiatorMsisdn(null);
            IVEncryptHelper.INSTANCE.setIvLoginEncrypt(null);
            FavouriteHelper.INSTANCE.clearCacheData();
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 9999;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
    }
}
