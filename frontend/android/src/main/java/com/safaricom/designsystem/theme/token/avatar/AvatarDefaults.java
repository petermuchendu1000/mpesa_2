package com.safaricom.designsystem.theme.token.avatar;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import com.safaricom.designsystem.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/designsystem/theme/token/avatar/AvatarDefaults;", "", "<init>", "()V", "V1", "Lcom/safaricom/designsystem/theme/token/avatar/Avatars;", "getV1", "(Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/theme/token/avatar/Avatars;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvatarDefaults {
    public static final int $stable = 0;
    public static final AvatarDefaults INSTANCE = new AvatarDefaults();

    private AvatarDefaults() {
    }

    public final Avatars getV1(Composer composer, int i) {
        return new Avatars(PrimitiveResources_androidKt.dimensionResource(R.dimen.avatar_normal, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.avatar_small, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.avatar_medium, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.avatar_large, composer, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.avatar_xlarge, composer, 0), null);
    }
}
