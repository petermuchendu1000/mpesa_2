package com.safaricom.sharedui.compose.permissions;

import com.google.accompanist.permissions.MultiplePermissionsState;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PermissionsHandler;", "", "<init>", "()V", "getRequestedPermissions", "", "Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;", "permissionStates", "Lcom/google/accompanist/permissions/MultiplePermissionsState;", "mandatoryPermissions", "", "", "mapToPermissionEnum", "permission", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionsHandler {
    public static final int $stable = 0;
    public static final PermissionsHandler INSTANCE = new PermissionsHandler();

    private PermissionsHandler() {
    }

    public final Set<PredefinedPermissionInfo> getRequestedPermissions(MultiplePermissionsState permissionStates, List<String> mandatoryPermissions) {
        Intrinsics.checkNotNullParameter(permissionStates, "");
        Intrinsics.checkNotNullParameter(mandatoryPermissions, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PermissionState permissionState : permissionStates.getPermissions()) {
            PredefinedPermissionInfo predefinedPermissionInfoComponent1 = component1(permissionState.getPermission());
            if ((predefinedPermissionInfoComponent1 != null && !PermissionsUtilKt.isGranted(permissionState.getStatus())) || mandatoryPermissions.contains(permissionState.getPermission())) {
                Intrinsics.checkNotNull(predefinedPermissionInfoComponent1);
                linkedHashSet.add(predefinedPermissionInfoComponent1);
            } else if (!mandatoryPermissions.contains(permissionState.getPermission()) && !PermissionsUtilKt.isGranted(permissionState.getStatus())) {
                Intrinsics.checkNotNull(predefinedPermissionInfoComponent1);
                linkedHashSet.add(predefinedPermissionInfoComponent1);
            }
        }
        return linkedHashSet;
    }

    private final PredefinedPermissionInfo component1(String str) {
        return PredefinedPermissionInfo.INSTANCE.fromPermissionString(str);
    }
}
