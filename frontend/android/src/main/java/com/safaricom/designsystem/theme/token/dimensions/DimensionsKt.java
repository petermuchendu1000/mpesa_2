package com.safaricom.designsystem.theme.token.dimensions;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalDimensions", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/safaricom/designsystem/theme/token/dimensions/Dimensions;", "getLocalDimensions", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DimensionsKt {
    private static final ProvidableCompositionLocal<Dimensions> component2 = CompositionLocalKt.staticCompositionLocalOf(new Function0() {
        @Override
        public final Object invoke() {
            return DimensionsKt.component3();
        }
    });

    public static final Dimensions component3() {
        return new Dimensions(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
    }

    public static final ProvidableCompositionLocal<Dimensions> getLocalDimensions() {
        return component2;
    }
}
