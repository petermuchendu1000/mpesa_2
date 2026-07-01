package com.safaricom.designsystem.extensions;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.core.graphics.ColorUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"toHslColor", "", "", "saturation", "", "lightness", "adjustLightness", "", "textFieldOutlineColor", "Landroidx/compose/ui/graphics/Color;", "hasError", "isFocused", "(ZZLandroidx/compose/runtime/Composer;I)J", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorExtKt {
    public static int toHslColor$default(String str, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        if ((i & 2) != 0) {
            f2 = 0.85f;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return toHslColor(str, f, f2, z);
    }

    public static final int toHslColor(String str, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            f2 = 0.3f;
        }
        String str2 = str;
        int iCharAt = 0;
        for (int i = 0; i < str2.length(); i++) {
            iCharAt = (iCharAt * 37) + str2.charAt(i);
        }
        return ColorUtils.HSLToColor(new float[]{Math.abs(iCharAt % AUScreenAdaptTool.WIDTH_BASE), f, f2});
    }

    public static final long textFieldOutlineColor(boolean z, boolean z2, Composer composer, int i) {
        long onSurface;
        composer.startReplaceGroup(-2047898602);
        if (z2) {
            composer.startReplaceGroup(27476130);
            onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary();
        } else {
            composer.startReplaceGroup(27477380);
            onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface();
        }
        composer.endReplaceGroup();
        if (z) {
            onSurface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError();
        }
        composer.endReplaceGroup();
        return onSurface;
    }
}
