package com.safaricom.designsystem.components.fab;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/safaricom/designsystem/components/fab/ExtendedFabStyleDefaults;", "", "<init>", "()V", "default", "Lcom/safaricom/designsystem/components/fab/ExtendedFabStyle;", CdpConstants.CONTENT_TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "iconColor", "containerColor", "default-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Lcom/safaricom/designsystem/components/fab/ExtendedFabStyle;", "primary", "primary-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Lcom/safaricom/designsystem/components/fab/ExtendedFabStyle;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExtendedFabStyleDefaults {
    public static final int $stable = 0;
    public static final ExtendedFabStyleDefaults INSTANCE = new ExtendedFabStyleDefaults();

    private ExtendedFabStyleDefaults() {
    }

    public final ExtendedFabStyle m12531defaultRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        return new ExtendedFabStyle((i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary() : j, (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary() : j2, (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface() : j3, null);
    }

    public final ExtendedFabStyle m12532primarydgg9oW8(long j, long j2, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary();
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnPrimary();
        }
        return new ExtendedFabStyle(j3, j2, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null);
    }
}
