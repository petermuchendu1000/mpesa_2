package com.huawei.digitalpayment.consumer.baselib.util.permission;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.huawei.common.util.permission.PermissionHelper;
import com.huawei.digitalpayment.consumer.baselib.util.permission.IPermissionListenerWrap;
import java.util.Objects;

public class PermissionsHelper {
    private static int component1 = 1;
    private static int copydefault;
    private final FragmentActivity component2;

    private PermissionsHelper(FragmentActivity fragmentActivity) {
        this.component2 = fragmentActivity;
    }

    public static PermissionsHelper init(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        PermissionsHelper permissionsHelper = new PermissionsHelper(fragmentActivity);
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return permissionsHelper;
    }

    public static PermissionsHelper init(Fragment fragment) {
        int i = 2 % 2;
        PermissionsHelper permissionsHelper = new PermissionsHelper(fragment.getActivity());
        int i2 = copydefault + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return permissionsHelper;
    }

    public void requestCameraStoragePermission(IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        int i = 2 % 2;
        String[] strArr = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        if (checkPermissions(this.component2, strArr)) {
            iPermissionListener.onAccepted(true);
            int i2 = component1 + 123;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        requestPermissions(strArr, iPermissionListener);
        int i3 = copydefault + 55;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
    }

    public void requestWriteStoragePermission(IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        int i = 2 % 2;
        PermissionHelper permissionHelperInit = PermissionHelper.init(this.component2);
        Objects.requireNonNull(iPermissionListener);
        permissionHelperInit.requestWriteStoragePermission(new PermissionsHelper$$ExternalSyntheticLambda0(iPermissionListener));
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void requestReadStoragePermission(IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        int i = 2 % 2;
        PermissionHelper permissionHelperInit = PermissionHelper.init(this.component2);
        Objects.requireNonNull(iPermissionListener);
        permissionHelperInit.requestReadStoragePermission(new PermissionsHelper$$ExternalSyntheticLambda0(iPermissionListener));
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public void requestStoragePermission(IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 33) {
            iPermissionListener.onAccepted(true);
            int i4 = component1 + 73;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        if (Build.VERSION.SDK_INT < 29) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        if (checkPermissions(this.component2, strArr)) {
            iPermissionListener.onAccepted(true);
        } else {
            requestPermissions(strArr, iPermissionListener);
        }
    }

    public void requestPermission(String str, IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            String[] strArr = new String[1];
            strArr[1] = str;
            requestPermissions(strArr, iPermissionListener);
        } else {
            requestPermissions(new String[]{str}, iPermissionListener);
        }
        int i3 = copydefault + 25;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void requestPermissions(String[] strArr, IPermissionListenerWrap.IPermissionListener iPermissionListener) {
        int i = 2 % 2;
        PermissionHelper permissionHelperInit = PermissionHelper.init(this.component2);
        Objects.requireNonNull(iPermissionListener);
        permissionHelperInit.requestPermissions(strArr, new PermissionsHelper$$ExternalSyntheticLambda0(iPermissionListener));
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public boolean checkPermission(Context context, String str) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zCheckPermissions = checkPermissions(context, str);
        int i4 = copydefault + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zCheckPermissions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean checkPermissions(Context context, String... strArr) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zCheckPermissions = PermissionHelper.init(this.component2).checkPermissions(context, strArr);
        int i4 = copydefault + 35;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zCheckPermissions;
        }
        throw null;
    }
}
