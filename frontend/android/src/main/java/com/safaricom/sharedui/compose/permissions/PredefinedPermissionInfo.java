package com.safaricom.sharedui.compose.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.Painter;
import com.blankj.utilcode.constant.PermissionConstants;
import com.safaricom.sharedui.compose.R;
import com.safaricom.sharedui.compose.permissions.PermissionInfoProvider;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00072\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;", "Lcom/safaricom/sharedui/compose/permissions/PermissionInfoProvider;", "", "<init>", "(Ljava/lang/String;I)V", PermissionConstants.CAMERA, "READ_CONTACTS", "Companion", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PredefinedPermissionInfo implements PermissionInfoProvider {
    private static final EnumEntries $ENTRIES;
    private static final PredefinedPermissionInfo[] $VALUES;

    public static final Companion INSTANCE;
    public static final PredefinedPermissionInfo CAMERA = new PredefinedPermissionInfo(PermissionConstants.CAMERA, 0) {
        @Override
        public boolean isOptional() {
            return false;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override
        public String getPermission() {
            return "android.permission.CAMERA";
        }

        @Override
        public int getDrawableResId() {
            return R.drawable.ic_no_camera_permission;
        }

        @Override
        public Integer getPermissionTitleResId() {
            return Integer.valueOf(R.string.camera_permission_required_title);
        }

        @Override
        public int getPermissionBodyTextResId() {
            return R.string.camera_permission_required_text;
        }

        @Override
        public int getRationaleBodyTextResId() {
            return R.string.camera_permission_declined_rationale;
        }

        @Override
        public int getIconAccessibilityTextResId() {
            return R.string.camera_permission_accessibility_text;
        }

        @Override
        public Integer getButtonTextResId() {
            return Integer.valueOf(R.string.action_permissions_enable_camera);
        }
    };
    public static final PredefinedPermissionInfo READ_CONTACTS = new PredefinedPermissionInfo("READ_CONTACTS", 1) {
        @Override
        public boolean isOptional() {
            return false;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override
        public String getPermission() {
            return "android.permission.READ_CONTACTS";
        }

        @Override
        public int getDrawableResId() {
            return R.drawable.ic_no_contact_permission;
        }

        @Override
        public Integer getPermissionTitleResId() {
            return Integer.valueOf(R.string.contact_permission_required_title);
        }

        @Override
        public int getPermissionBodyTextResId() {
            return R.string.contact_permission_required_text;
        }

        @Override
        public int getRationaleBodyTextResId() {
            return R.string.contact_permission_declined_rationale;
        }

        @Override
        public int getIconAccessibilityTextResId() {
            return R.string.contact_permission_accessibility_text;
        }

        @Override
        public Integer getButtonTextResId() {
            return Integer.valueOf(R.string.action_permissions_request_permission);
        }
    };

    private PredefinedPermissionInfo(String str, int i) {
    }

    @Override
    public Painter getPainter(Composer composer, int i) {
        return PermissionInfoProvider.DefaultImpls.getPainter(this, composer, i);
    }

    static {
        PredefinedPermissionInfo[] predefinedPermissionInfoArr$values = $values();
        $VALUES = predefinedPermissionInfoArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(predefinedPermissionInfoArr$values);
        INSTANCE = new Companion(null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo$Companion;", "", "<init>", "()V", "fromPermissionString", "Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;", "permissionString", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PredefinedPermissionInfo fromPermissionString(String permissionString) {
            PredefinedPermissionInfo next;
            Intrinsics.checkNotNullParameter(permissionString, "");
            Iterator<PredefinedPermissionInfo> it = PredefinedPermissionInfo.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getPermission(), permissionString)) {
                    break;
                }
            }
            return next;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static PredefinedPermissionInfo valueOf(String str) {
        return (PredefinedPermissionInfo) Enum.valueOf(PredefinedPermissionInfo.class, str);
    }

    public static PredefinedPermissionInfo[] values() {
        return (PredefinedPermissionInfo[]) $VALUES.clone();
    }

    private static final PredefinedPermissionInfo[] $values() {
        return new PredefinedPermissionInfo[]{CAMERA, READ_CONTACTS};
    }

    public PredefinedPermissionInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<PredefinedPermissionInfo> getEntries() {
        return $ENTRIES;
    }
}
