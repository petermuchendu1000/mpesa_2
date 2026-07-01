package com.safaricom.designsystem.components.alert;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import com.safaricom.designsystem.extensions.ThemeExtKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/alert/AlertBorderDefaults;", "", "<init>", "()V", "None", "Lcom/safaricom/designsystem/components/alert/AlertBorder;", "getNone", "(Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/components/alert/AlertBorder;", "Line", "getLine", "Dashed", "getDashed", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertBorderDefaults {
    public static final int $stable = 0;
    public static final AlertBorderDefaults INSTANCE = new AlertBorderDefaults();

    private AlertBorderDefaults() {
    }

    public final AlertBorder getNone(Composer composer, int i) {
        return new AlertBorder(0.0f, ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getShareDataUIState(), 0.0f, 0.0f, 13, null);
    }

    public final AlertBorder getLine(Composer composer, int i) {
        return new AlertBorder(ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getEquals(), ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getShareDataUIState(), 0.0f, 0.0f, 12, null);
    }

    public final AlertBorder getDashed(Composer composer, int i) {
        return new AlertBorder(ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getEquals(), ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getShareDataUIState(), ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getGetRequestBeneficiariesState(), ThemeExtKt.getDimensions(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getComponent4(), null);
    }
}
