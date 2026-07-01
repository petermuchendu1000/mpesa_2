package com.safaricom.designsystem.components.menu;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u000eR+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/safaricom/designsystem/components/menu/MoreMenuExpandedState;", "", "<init>", "()V", "<set-?>", "", "expanded", "getExpanded", "()Z", "setExpanded", "(Z)V", "expanded$delegate", "Landroidx/compose/runtime/MutableState;", "toggleExpanded", "", "Companion", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MoreMenuExpandedState {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<MoreMenuExpandedState, Boolean> component1 = SaverKt.Saver(new Function2() {
        @Override
        public final Object invoke(Object obj, Object obj2) {
            return MoreMenuExpandedState.copydefault((SaverScope) obj, (MoreMenuExpandedState) obj2);
        }
    }, new Function1() {
        @Override
        public final Object invoke(Object obj) {
            return MoreMenuExpandedState.copydefault(((Boolean) obj).booleanValue());
        }
    });
    private final MutableState component2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/safaricom/designsystem/components/menu/MoreMenuExpandedState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/safaricom/designsystem/components/menu/MoreMenuExpandedState;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Saver<MoreMenuExpandedState, Boolean> getSaver() {
            return MoreMenuExpandedState.component1;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final Boolean copydefault(SaverScope saverScope, MoreMenuExpandedState moreMenuExpandedState) {
        Intrinsics.checkNotNullParameter(saverScope, "");
        Intrinsics.checkNotNullParameter(moreMenuExpandedState, "");
        return Boolean.valueOf(moreMenuExpandedState.getExpanded());
    }

    public static final MoreMenuExpandedState copydefault(boolean z) {
        MoreMenuExpandedState moreMenuExpandedState = new MoreMenuExpandedState();
        moreMenuExpandedState.component3(z);
        return moreMenuExpandedState;
    }

    private final void component3(boolean z) {
        this.component2.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getExpanded() {
        return ((Boolean) this.component2.getValue()).booleanValue();
    }

    public final void toggleExpanded() {
        component3(!getExpanded());
    }
}
