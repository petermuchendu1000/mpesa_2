package com.safaricom.designsystem.components.menu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberMoreMenuExpandedState", "Lcom/safaricom/designsystem/components/menu/MoreMenuExpandedState;", "(Landroidx/compose/runtime/Composer;I)Lcom/safaricom/designsystem/components/menu/MoreMenuExpandedState;", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberMoreMenuExpandedStateKt {
    public static final MoreMenuExpandedState component1() {
        return new MoreMenuExpandedState();
    }

    public static final MoreMenuExpandedState rememberMoreMenuExpandedState(Composer composer, int i) {
        composer.startReplaceGroup(481858312);
        MoreMenuExpandedState moreMenuExpandedState = (MoreMenuExpandedState) RememberSaveableKt.m5466rememberSaveable(new Object[0], (Saver) MoreMenuExpandedState.INSTANCE.getSaver(), new Function0() {
            @Override
            public final Object invoke() {
                return RememberMoreMenuExpandedStateKt.component1();
            }
        }, composer, 456);
        composer.endReplaceGroup();
        return moreMenuExpandedState;
    }
}
