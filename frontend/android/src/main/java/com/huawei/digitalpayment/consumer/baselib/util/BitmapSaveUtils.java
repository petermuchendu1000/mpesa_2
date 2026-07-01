package com.huawei.digitalpayment.consumer.baselib.util;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.dialog.SuccessDialog;

public class BitmapSaveUtils {
    private static int component1 = 1;
    private static int component2;

    public static void generateReceipt(FragmentActivity fragmentActivity, Bitmap bitmap, SuccessDialog.Builder builder) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (!(!ImageUtil.saveImageToGallery(fragmentActivity, bitmap))) {
            int i4 = component1 + 91;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            CommonToast.show(fragmentActivity.getResources().getString(R.string.base_savepicture_tips1), R.mipmap.base_icon_complete);
        } else {
            CommonToast.showText(fragmentActivity.getResources().getString(R.string.history_module_fail_to_album));
            int i6 = component2 + 59;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        bitmap.recycle();
        int i8 = component2 + 49;
        component1 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 67 / 0;
        }
    }
}
