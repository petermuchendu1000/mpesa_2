package com.safaricom.designsystem.theme.token.elevations;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalElevations", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/safaricom/designsystem/theme/token/elevations/Elevations;", "getLocalElevations", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElevationsKt {
    private static final ProvidableCompositionLocal<Elevations> copydefault = CompositionLocalKt.staticCompositionLocalOf(new Function0() {
        @Override
        public final Object invoke() {
            return ElevationsKt.component3();
        }
    });

    public static final Elevations component3() {
        return new Elevations(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 127, null);
    }

    public static final ProvidableCompositionLocal<Elevations> getLocalElevations() {
        return copydefault;
    }
}
