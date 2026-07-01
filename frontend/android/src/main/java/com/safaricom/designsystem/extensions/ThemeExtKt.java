package com.safaricom.designsystem.extensions;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.safaricom.designsystem.theme.token.avatar.Avatars;
import com.safaricom.designsystem.theme.token.avatar.AvatarsKt;
import com.safaricom.designsystem.theme.token.colors.ColorScheme;
import com.safaricom.designsystem.theme.token.colors.ColorSchemeKt;
import com.safaricom.designsystem.theme.token.dimensions.Dimensions;
import com.safaricom.designsystem.theme.token.dimensions.DimensionsKt;
import com.safaricom.designsystem.theme.token.elevations.Elevations;
import com.safaricom.designsystem.theme.token.elevations.ElevationsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"customColors", "Lcom/safaricom/designsystem/theme/token/colors/ColorScheme;", "Landroidx/compose/material3/MaterialTheme;", "getCustomColors", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/theme/token/colors/ColorScheme;", "dimensions", "Lcom/safaricom/designsystem/theme/token/dimensions/Dimensions;", "getDimensions", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/theme/token/dimensions/Dimensions;", "elevations", "Lcom/safaricom/designsystem/theme/token/elevations/Elevations;", "getElevations", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/theme/token/elevations/Elevations;", "avatars", "Lcom/safaricom/designsystem/theme/token/avatar/Avatars;", "getAvatars", "(Landroidx/compose/material3/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/theme/token/avatar/Avatars;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ThemeExtKt {
    public static final ColorScheme getCustomColors(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "");
        ProvidableCompositionLocal<ColorScheme> localColorScheme = ColorSchemeKt.getLocalColorScheme();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localColorScheme);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return (ColorScheme) objConsume;
    }

    public static final Dimensions getDimensions(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "");
        ProvidableCompositionLocal<Dimensions> localDimensions = DimensionsKt.getLocalDimensions();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDimensions);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return (Dimensions) objConsume;
    }

    public static final Elevations getElevations(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "");
        ProvidableCompositionLocal<Elevations> localElevations = ElevationsKt.getLocalElevations();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localElevations);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return (Elevations) objConsume;
    }

    public static final Avatars getAvatars(MaterialTheme materialTheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(materialTheme, "");
        ProvidableCompositionLocal<Avatars> localAvatars = AvatarsKt.getLocalAvatars();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localAvatars);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return (Avatars) objConsume;
    }
}
