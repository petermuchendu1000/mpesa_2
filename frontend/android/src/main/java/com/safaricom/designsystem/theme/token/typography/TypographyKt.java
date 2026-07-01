package com.safaricom.designsystem.theme.token.typography;

import androidx.compose.material3.Typography;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TypographyKt {
    private static final ProvidableCompositionLocal<Typography> copydefault = CompositionLocalKt.staticCompositionLocalOf(new Function0() {
        @Override
        public final Object invoke() {
            return TypographyKt.ShareDataUIState();
        }
    });

    public static final Typography ShareDataUIState() {
        return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return copydefault;
    }
}
