package com.safaricom.designsystem.components.menu;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/safaricom/designsystem/components/menu/MenuActionStyleDefaults;", "", "<init>", "()V", "defaultStyle", "Lcom/safaricom/designsystem/components/menu/MenuActionStyle;", "iconTint", "Landroidx/compose/ui/graphics/Color;", "defaultStyle-Iv8Zu3U", "(JLandroidx/compose/runtime/Composer;II)Lcom/safaricom/designsystem/components/menu/MenuActionStyle;", "imageStyle", "contentColor", "imageStyle--OWjLjI", "(JJ)Lcom/safaricom/designsystem/components/menu/MenuActionStyle;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuActionStyleDefaults {
    public static final int $stable = 0;
    public static final MenuActionStyleDefaults INSTANCE = new MenuActionStyleDefaults();

    private MenuActionStyleDefaults() {
    }

    public final MenuActionStyle m12585defaultStyleIv8Zu3U(long j, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1276931659);
        if ((i2 & 1) != 0) {
            j = Color.INSTANCE.m6090getUnspecified0d7_KjU();
        }
        MenuActionStyle menuActionStyle = new MenuActionStyle(j, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), null);
        composer.endReplaceGroup();
        return menuActionStyle;
    }

    public static MenuActionStyle m12584imageStyleOWjLjI$default(MenuActionStyleDefaults menuActionStyleDefaults, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m6091getWhite0d7_KjU();
        }
        if ((i & 2) != 0) {
            j2 = Color.INSTANCE.m6089getTransparent0d7_KjU();
        }
        return menuActionStyleDefaults.m12586imageStyleOWjLjI(j, j2);
    }

    public final MenuActionStyle m12586imageStyleOWjLjI(long iconTint, long contentColor) {
        return new MenuActionStyle(iconTint, contentColor, null);
    }
}
