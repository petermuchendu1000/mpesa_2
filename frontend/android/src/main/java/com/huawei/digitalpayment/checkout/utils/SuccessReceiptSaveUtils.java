package com.huawei.digitalpayment.checkout.utils;

import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AppUtils;
import com.huawei.digitalpayment.checkout.model.response.TransRecordDetailResponse;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils;
import com.huawei.digitalpayment.consumer.baselib.util.permission.IPermissionListenerWrap;
import com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionsHelper;

public class SuccessReceiptSaveUtils {
    private static int component1 = 0;
    private static int component3 = 1;

    public static void checkPermission(final FragmentActivity fragmentActivity, final TransferResp transferResp) {
        int i = 2 % 2;
        PermissionsHelper.init(fragmentActivity).requestWriteStoragePermission(new IPermissionListenerWrap.IPermissionListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onAccepted(boolean z) {
                int i2 = 2 % 2;
                int i3 = copydefault + 95;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    SuccessReceiptSaveUtils.copydefault(fragmentActivity, transferResp, z);
                    obj.hashCode();
                    throw null;
                }
                SuccessReceiptSaveUtils.copydefault(fragmentActivity, transferResp, z);
                int i4 = component2 + 3;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component1 + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault(FragmentActivity fragmentActivity, TransferResp transferResp, boolean z) {
        int i = 2 % 2;
        if (!z) {
            AppUtils.launchAppDetailsSettings();
            int i2 = component1 + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = component1 + 91;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            generateSuccessReceipt(fragmentActivity, transferResp);
        } else {
            generateSuccessReceipt(fragmentActivity, transferResp);
            int i5 = 3 / 0;
        }
    }

    private static String component3(TransRecordDetailResponse.Field field) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if ("timestamp".equals(field.getType())) {
            try {
                return ReceiptToolsUtils.getTransactionTime(Long.parseLong(field.getFieldValue()));
            } catch (NumberFormatException unused) {
                return field.getFieldValue();
            }
        }
        String fieldValue = field.getFieldValue();
        int i4 = component1 + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return fieldValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void generateSuccessReceipt(androidx.fragment.app.FragmentActivity r12, com.huawei.digitalpayment.checkout.model.response.TransferResp r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.utils.SuccessReceiptSaveUtils.generateSuccessReceipt(androidx.fragment.app.FragmentActivity, com.huawei.digitalpayment.checkout.model.response.TransferResp):void");
    }
}
