package com.huawei.common.photo;

import com.blankj.utilcode.util.Utils;
import com.huawei.common.R;

public interface PhotoErrorCode {
    public static final int ERROR_CODE_CAMERA_PERMISSION_DENIED = 6;
    public static final int ERROR_CODE_SDCARD_DISABLE = 1;
    public static final int ERROR_CODE_STORAGE_PERMISSION_DENIED = 5;
    public static final int ERROR_CODE_USER_CANCELED = 7;

    static String getErrorMsg(int i) {
        if (i == 1) {
            return Utils.getApp().getString(R.string.no_sd_card);
        }
        if (i == 5 || i == 6) {
            return Utils.getApp().getString(R.string.common_permission_deny);
        }
        return "";
    }
}
