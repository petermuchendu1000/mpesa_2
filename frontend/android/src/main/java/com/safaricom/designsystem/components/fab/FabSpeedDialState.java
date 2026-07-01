package com.safaricom.designsystem.components.fab;

import com.safaricom.designsystem.components.fab.ExtendedFabState;
import com.safaricom.designsystem.components.fab.FabOptionsState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/safaricom/designsystem/components/fab/FabSpeedDialState;", "", "extendedFabState", "Lcom/safaricom/designsystem/components/fab/ExtendedFabState;", "optionsState", "Lcom/safaricom/designsystem/components/fab/FabOptionsState;", "<init>", "(Lcom/safaricom/designsystem/components/fab/ExtendedFabState;Lcom/safaricom/designsystem/components/fab/FabOptionsState;)V", "getExtendedFabState", "()Lcom/safaricom/designsystem/components/fab/ExtendedFabState;", "getOptionsState", "()Lcom/safaricom/designsystem/components/fab/FabOptionsState;", "areOptionsVisible", "", "getAreOptionsVisible", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FabSpeedDialState {
    public static final int $stable = 0;
    private final FabOptionsState component1;
    private final ExtendedFabState component3;

    public FabSpeedDialState(ExtendedFabState extendedFabState, FabOptionsState fabOptionsState) {
        Intrinsics.checkNotNullParameter(extendedFabState, "");
        Intrinsics.checkNotNullParameter(fabOptionsState, "");
        this.component3 = extendedFabState;
        this.component1 = fabOptionsState;
    }

    public FabSpeedDialState(ExtendedFabState.EXPANDED expanded, FabOptionsState.HIDDEN hidden, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ExtendedFabState.EXPANDED.INSTANCE : expanded, (i & 2) != 0 ? FabOptionsState.HIDDEN.INSTANCE : hidden);
    }

    public final ExtendedFabState getExtendedFabState() {
        return this.component3;
    }

    public final FabOptionsState getOptionsState() {
        return this.component1;
    }

    public final boolean getAreOptionsVisible() {
        return Intrinsics.areEqual(this.component1, FabOptionsState.VISIBLE.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FabSpeedDialState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static FabSpeedDialState copy$default(FabSpeedDialState fabSpeedDialState, ExtendedFabState extendedFabState, FabOptionsState fabOptionsState, int i, Object obj) {
        if ((i & 1) != 0) {
            extendedFabState = fabSpeedDialState.component3;
        }
        if ((i & 2) != 0) {
            fabOptionsState = fabSpeedDialState.component1;
        }
        return fabSpeedDialState.copy(extendedFabState, fabOptionsState);
    }

    public final ExtendedFabState getComponent3() {
        return this.component3;
    }

    public final FabOptionsState getComponent1() {
        return this.component1;
    }

    public final FabSpeedDialState copy(ExtendedFabState extendedFabState, FabOptionsState optionsState) {
        Intrinsics.checkNotNullParameter(extendedFabState, "");
        Intrinsics.checkNotNullParameter(optionsState, "");
        return new FabSpeedDialState(extendedFabState, optionsState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FabSpeedDialState)) {
            return false;
        }
        FabSpeedDialState fabSpeedDialState = (FabSpeedDialState) other;
        return Intrinsics.areEqual(this.component3, fabSpeedDialState.component3) && Intrinsics.areEqual(this.component1, fabSpeedDialState.component1);
    }

    public int hashCode() {
        return (this.component3.hashCode() * 31) + this.component1.hashCode();
    }

    public String toString() {
        return "FabSpeedDialState(extendedFabState=" + this.component3 + ", optionsState=" + this.component1 + ")";
    }
}
