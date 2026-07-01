package com.huawei.common.util.permission;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.PermissionUtils;
import com.huawei.common.util.permission.IPermissionListenerWrap;
import java.util.List;

public class PermissionHelper {
    private final FragmentActivity copydefault;

    private PermissionHelper(FragmentActivity fragmentActivity) {
        this.copydefault = fragmentActivity;
    }

    public static PermissionHelper init(FragmentActivity fragmentActivity) {
        return new PermissionHelper(fragmentActivity);
    }

    public static PermissionHelper init(Fragment fragment) {
        return new PermissionHelper(fragment.getActivity());
    }

    public void requestWriteStoragePermission(IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        if (checkPermissions(this.copydefault, strArr) || Build.VERSION.SDK_INT >= 29) {
            iPermissionListener.onAccepted(true);
        } else {
            requestPermissions(strArr, iPermissionListener);
        }
    }

    public void requestReadStoragePermission(IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        if (checkPermissions(this.copydefault, strArr) || Build.VERSION.SDK_INT >= 29) {
            iPermissionListener.onAccepted(true);
        } else {
            requestPermissions(strArr, iPermissionListener);
        }
    }

    public void requestPermission(String str, IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        requestPermissions(new String[]{str}, iPermissionListener);
    }

    public void requestPermissions(final String[] strArr, final IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        PermissionUtils.permission(strArr).callback(new PermissionUtils.FullCallback(this) {
            @Override
            public void onGranted(List<String> list) {
                if (iPermissionListener == null || strArr.length != list.size()) {
                    return;
                }
                iPermissionListener.onAccepted(true);
            }

            @Override
            public void onDenied(List<String> list, List<String> list2) {
                IPermissionListenerWrap.IPermissionListener iPermissionListener2 = iPermissionListener;
                if (iPermissionListener2 != null) {
                    iPermissionListener2.onAccepted(false);
                }
            }
        }).request();
    }

    public boolean checkPermission(Context context, String str) {
        return checkPermissions(context, str);
    }

    public boolean checkPermissions(Context context, String... strArr) {
        boolean z = true;
        for (String str : strArr) {
            z = z && ContextCompat.checkSelfPermission(context, str) == 0;
        }
        return z;
    }
}
