package com.safaricom.sharedui.compose.permissions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0017¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH'J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH'J\b\u0010\u000e\u001a\u00020\nH'J\b\u0010\u000f\u001a\u00020\nH'J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Lcom/safaricom/sharedui/compose/permissions/PermissionInfoProvider;", "", "getPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "getPermission", "", "isOptional", "", "getDrawableResId", "", "getPermissionTitleResId", "()Ljava/lang/Integer;", "getPermissionBodyTextResId", "getRationaleBodyTextResId", "getIconAccessibilityTextResId", "getButtonTextResId", "Lcom/safaricom/sharedui/compose/permissions/PredefinedPermissionInfo;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PermissionInfoProvider {
    Integer getButtonTextResId();

    int getDrawableResId();

    int getIconAccessibilityTextResId();

    Painter getPainter(Composer composer, int i);

    String getPermission();

    int getPermissionBodyTextResId();

    Integer getPermissionTitleResId();

    int getRationaleBodyTextResId();

    boolean isOptional();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Painter getPainter(PermissionInfoProvider permissionInfoProvider, Composer composer, int i) {
            composer.startReplaceGroup(-1202429703);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(permissionInfoProvider.getDrawableResId(), composer, 0);
            composer.endReplaceGroup();
            return painterPainterResource;
        }
    }
}
