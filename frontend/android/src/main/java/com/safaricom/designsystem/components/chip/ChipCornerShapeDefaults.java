package com.safaricom.designsystem.components.chip;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/safaricom/designsystem/components/chip/ChipCornerShapeDefaults;", "", "<init>", "()V", "default", "Lcom/safaricom/designsystem/components/chip/ChipCornerShape;", "getDefault", "(Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/components/chip/ChipCornerShape;", "rounded", "getRounded", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChipCornerShapeDefaults {
    public static final int $stable = 0;
    public static final ChipCornerShapeDefaults INSTANCE = new ChipCornerShapeDefaults();

    private ChipCornerShapeDefaults() {
    }

    public final ChipCornerShape getDefault(Composer composer, int i) {
        return new ChipCornerShape(MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getMedium());
    }

    public final ChipCornerShape getRounded(Composer composer, int i) {
        return new ChipCornerShape(RoundedCornerShapeKt.getCircleShape());
    }
}
