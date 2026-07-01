package com.safaricom.designsystem.theme.token.dimensions;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import com.safaricom.designsystem.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/designsystem/theme/token/dimensions/DimensionDefaults;", "", "<init>", "()V", "V1", "Lcom/safaricom/designsystem/theme/token/dimensions/Dimensions;", "getV1", "(Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/theme/token/dimensions/Dimensions;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DimensionDefaults {
    public static final int $stable = 0;
    public static final DimensionDefaults INSTANCE = new DimensionDefaults();

    private DimensionDefaults() {
    }

    public final Dimensions getV1(Composer composer, int i) {
        return new Dimensions(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_xxxsmall, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_xxsmall, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_xsmall, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_small, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_medium, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_large, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_xlarge, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.dimen_xxlarge, composer, 0), 1, null);
    }
}
