package com.huawei.digitalpayment.consumer.baselib.util.permission;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;

public class PermissionSettingUtils {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static final String copydefault = "PermissionSettingUtils";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void goSystemPermissionPage(android.app.Activity r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 1
            switch(r2) {
                case -1206476313: goto L42;
                case -759499589: goto L2e;
                case 3418016: goto L23;
                case 3620012: goto L18;
                default: goto L17;
            }
        L17:
            goto L4d
        L18:
            java.lang.String r2 = "vivo"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            goto L4d
        L21:
            r1 = r3
            goto L4e
        L23:
            java.lang.String r2 = "oppo"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2c
            goto L4d
        L2c:
            r1 = r0
            goto L4e
        L2e:
            java.lang.String r2 = "xiaomi"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L37
            goto L4d
        L37:
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionSettingUtils.component3
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionSettingUtils.ShareDataUIState = r2
            int r1 = r1 % r0
            r1 = r4
            goto L4e
        L42:
            java.lang.String r2 = "huawei"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4b
            goto L4d
        L4b:
            r1 = 0
            goto L4e
        L4d:
            r1 = -1
        L4e:
            if (r1 == 0) goto L66
            if (r1 == r4) goto L62
            if (r1 == r0) goto L5e
            if (r1 == r3) goto L5a
            copydefault(r5)
            goto L69
        L5a:
            ShareDataUIState(r5)
            goto L69
        L5e:
            component2(r5)
            goto L69
        L62:
            component3(r5)
            goto L69
        L66:
            component1(r5)
        L69:
            int r5 = com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionSettingUtils.component3
            int r5 = r5 + 87
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionSettingUtils.ShareDataUIState = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionSettingUtils.goSystemPermissionPage(android.app.Activity):void");
    }

    private static void component1(Activity activity) {
        int i = 2 % 2;
        try {
            Intent intent = new Intent(activity.getPackageName());
            intent.setFlags(268435456);
            intent.setClassName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.SingleAppActivity");
            if (component1(intent)) {
                activity.startActivity(intent);
                return;
            }
            intent.setClassName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity");
            if (!component1(intent)) {
                intent.setClassName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity");
                component1(activity, intent);
                return;
            }
            int i2 = component3 + 77;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                activity.startActivity(intent);
                int i3 = 1 / 0;
            } else {
                activity.startActivity(intent);
            }
            int i4 = ShareDataUIState + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            L.e(copydefault, e.toString());
            copydefault(activity);
        }
    }

    private static void component3(Activity activity) {
        int i = 2 % 2;
        try {
            String packageName = activity.getPackageName();
            Intent intent = new Intent();
            intent.setAction("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_pkgname", packageName);
            Object obj = null;
            if (component1(intent)) {
                int i2 = component3 + 35;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    activity.startActivity(intent);
                    return;
                } else {
                    activity.startActivity(intent);
                    throw null;
                }
            }
            intent.setPackage("com.miui.securitycenter");
            if (component1(intent)) {
                int i3 = ShareDataUIState + 45;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    activity.startActivity(intent);
                    return;
                } else {
                    activity.startActivity(intent);
                    obj.hashCode();
                    throw null;
                }
            }
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            if (!component1(intent)) {
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                component1(activity, intent);
            } else {
                int i4 = component3 + 39;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                activity.startActivity(intent);
            }
        } catch (Exception e) {
            L.e(copydefault, e.toString());
            copydefault(activity);
        }
    }

    private static void ShareDataUIState(Activity activity) {
        int i = 2 % 2;
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packagename", activity.getPackageName());
            intent.setClassName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity");
            if (component1(intent)) {
                int i2 = component3 + 17;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                activity.startActivity(intent);
                return;
            }
            intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
            if (component1(intent)) {
                int i4 = ShareDataUIState + 103;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    activity.startActivity(intent);
                    return;
                } else {
                    activity.startActivity(intent);
                    int i5 = 63 / 0;
                    return;
                }
            }
            intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity");
            if (!component1(intent)) {
                intent.setClassName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity");
                component1(activity, intent);
                return;
            }
            int i6 = ShareDataUIState + 41;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                activity.startActivity(intent);
            } else {
                activity.startActivity(intent);
                throw null;
            }
        } catch (Exception e) {
            L.e(copydefault, e.toString());
            copydefault(activity);
        }
    }

    private static void component2(Activity activity) {
        Intent intent;
        int i = 2 % 2;
        Object obj = null;
        try {
            intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packagename", activity.getPackageName());
            intent.setClassName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity");
        } catch (Exception e) {
            L.e(copydefault, e.toString());
            copydefault(activity);
        }
        if (component1(intent)) {
            activity.startActivity(intent);
            return;
        }
        intent.setClassName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity");
        if (component1(intent)) {
            activity.startActivity(intent);
            return;
        }
        intent.setClassName("com.coloros.securitypermission", "com.coloros.securitypermission.permission.PermissionGroupsActivity");
        if (component1(intent)) {
            int i2 = ShareDataUIState + 123;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                activity.startActivity(intent);
                obj.hashCode();
                throw null;
            }
            activity.startActivity(intent);
            int i3 = component3 + 51;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        intent.setClassName("com.coloros.securitypermission", "com.coloros.securitypermission.permission.PermissionManagerActivity");
        if (!component1(intent)) {
            intent.setClassName("com.oppo.safe", "com.oppo.safe.permission.PermissionAppListActivity");
            component1(activity, intent);
            int i5 = ShareDataUIState + 29;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i6 = ShareDataUIState + 103;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            activity.startActivity(intent);
        } else {
            activity.startActivity(intent);
            int i7 = 42 / 0;
        }
    }

    private static void component1(Activity activity, Intent intent) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            if (component1(intent)) {
                int i3 = ShareDataUIState + 57;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                activity.startActivity(intent);
                return;
            }
            copydefault(activity);
            int i5 = component3 + 69;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        component1(intent);
        throw null;
    }

    private static void copydefault(Activity activity) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(WiseOpenHianalyticsData.UNION_PACKAGE, activity.getPackageName(), null));
        try {
            activity.startActivity(intent);
            int i2 = component3 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            L.e(copydefault, e.toString());
        }
        int i4 = ShareDataUIState + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static boolean component1(Intent intent) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = Utils.getApp().getPackageManager().queryIntentActivities(intent, 65536).isEmpty();
        int i4 = component3 + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zIsEmpty;
    }
}
