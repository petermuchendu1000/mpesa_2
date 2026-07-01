package com.safaricom.designsystem.theme.token.shapes;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import com.safaricom.designsystem.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/designsystem/theme/token/shapes/ShapeDefaults;", "", "<init>", "()V", "V1", "Landroidx/compose/material3/Shapes;", "getV1", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShapeDefaults {
    public static final int $stable = 0;
    public static final ShapeDefaults INSTANCE = new ShapeDefaults();

    private ShapeDefaults() {
    }

    public final Shapes getV1(Composer composer, int i) {
        return new Shapes(RoundedCornerShapeKt.m1524RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.radius_xsmall, composer, 0)), RoundedCornerShapeKt.m1524RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.radius_small, composer, 0)), RoundedCornerShapeKt.m1524RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.radius_medium, composer, 0)), RoundedCornerShapeKt.m1524RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.radius_large, composer, 0)), RoundedCornerShapeKt.m1524RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.radius_xlarge, composer, 0)));
    }
}
