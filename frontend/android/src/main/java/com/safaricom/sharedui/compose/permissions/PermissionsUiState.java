package com.safaricom.sharedui.compose.permissions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState;", "", "PermissionsNeeded", "AllPermissionsGranted", "Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState$AllPermissionsGranted;", "Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState$PermissionsNeeded;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PermissionsUiState {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState$PermissionsNeeded;", "Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState;", "currentPermission", "Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;", "<init>", "(Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;)V", "getCurrentPermission", "()Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissionsNeeded implements PermissionsUiState {
        public static final int $stable = 0;
        private final PredefinedPermissionInfo copydefault;

        public PermissionsNeeded(PredefinedPermissionInfo predefinedPermissionInfo) {
            Intrinsics.checkNotNullParameter(predefinedPermissionInfo, "");
            this.copydefault = predefinedPermissionInfo;
        }

        public final PredefinedPermissionInfo getCurrentPermission() {
            return this.copydefault;
        }

        public static PermissionsNeeded copy$default(PermissionsNeeded permissionsNeeded, PredefinedPermissionInfo predefinedPermissionInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                predefinedPermissionInfo = permissionsNeeded.copydefault;
            }
            return permissionsNeeded.copy(predefinedPermissionInfo);
        }

        public final PredefinedPermissionInfo getCopydefault() {
            return this.copydefault;
        }

        public final PermissionsNeeded copy(PredefinedPermissionInfo currentPermission) {
            Intrinsics.checkNotNullParameter(currentPermission, "");
            return new PermissionsNeeded(currentPermission);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PermissionsNeeded) && this.copydefault == ((PermissionsNeeded) other).copydefault;
        }

        public int hashCode() {
            return this.copydefault.hashCode();
        }

        public String toString() {
            return "PermissionsNeeded(currentPermission=" + this.copydefault + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState$AllPermissionsGranted;", "Lcom/safaricom/sharedui/compose/permissions/PermissionsUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AllPermissionsGranted implements PermissionsUiState {
        public static final int $stable = 0;
        public static final AllPermissionsGranted INSTANCE = new AllPermissionsGranted();

        public int hashCode() {
            return -1852953948;
        }

        private AllPermissionsGranted() {
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllPermissionsGranted)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "AllPermissionsGranted";
        }
    }
}
