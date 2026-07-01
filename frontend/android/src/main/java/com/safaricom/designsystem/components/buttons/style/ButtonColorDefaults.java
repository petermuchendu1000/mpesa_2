package com.safaricom.designsystem.components.buttons.style;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/components/buttons/style/ButtonColorDefaults;", "", "<init>", "()V", "filled", "Lcom/safaricom/designsystem/components/buttons/style/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "disabledContainerColor", CdpConstants.CONTENT_TEXT_COLOR, "disabledTextColor", "filled-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Lcom/safaricom/designsystem/components/buttons/style/ButtonColors;", "outlined", "outlineColor", "disabledOutlineColor", "outlined-ro_MJ88", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonColorDefaults {
    public static final int $stable = 0;
    public static final ButtonColorDefaults INSTANCE = new ButtonColorDefaults();

    private ButtonColorDefaults() {
    }

    public final ButtonColors m12449filledro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        return new ButtonColors((i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary() : j, (i2 & 2) != 0 ? Color.m6053copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2, 0L, 0L, (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary() : j3, (i2 & 8) != 0 ? Color.m6053copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4, 12, null);
    }

    public final ButtonColors m12450outlinedro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        return new ButtonColors(0L, 0L, (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary() : j, (i2 & 2) != 0 ? Color.m6053copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2, (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary() : j3, (i2 & 8) != 0 ? Color.m6053copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j4, 3, null);
    }
}
