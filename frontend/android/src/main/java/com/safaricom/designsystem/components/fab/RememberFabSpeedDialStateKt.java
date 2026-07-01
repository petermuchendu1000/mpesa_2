package com.safaricom.designsystem.components.fab;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.safaricom.designsystem.components.fab.ExtendedFabState;
import com.safaricom.designsystem.components.fab.FabOptionsState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberFabSpeedDialState", "Landroidx/compose/runtime/MutableState;", "Lcom/safaricom/designsystem/components/fab/FabSpeedDialState;", "extendedFabState", "Lcom/safaricom/designsystem/components/fab/ExtendedFabState;", "optionsState", "Lcom/safaricom/designsystem/components/fab/FabOptionsState;", "(Lcom/safaricom/designsystem/components/fab/ExtendedFabState;Lcom/safaricom/designsystem/components/fab/FabOptionsState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberFabSpeedDialStateKt {
    public static int ShareDataUIState = -1054985079;

    public static final MutableState<FabSpeedDialState> rememberFabSpeedDialState(ExtendedFabState extendedFabState, FabOptionsState fabOptionsState, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1774941940);
        if ((i2 & 1) != 0) {
            extendedFabState = ExtendedFabState.EXPANDED.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            fabOptionsState = FabOptionsState.HIDDEN.INSTANCE;
        }
        composer.startReplaceGroup(-42668514);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new FabSpeedDialState(extendedFabState, fabOptionsState), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState<FabSpeedDialState> mutableState = (MutableState) objRememberedValue;
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        return mutableState;
    }
}
