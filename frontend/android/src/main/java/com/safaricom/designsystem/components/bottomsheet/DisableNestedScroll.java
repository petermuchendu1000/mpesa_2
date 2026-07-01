package com.safaricom.designsystem.components.bottomsheet;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/bottomsheet/DisableNestedScroll;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "<init>", "()V", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisableNestedScroll implements NestedScrollConnection {
    public static final int $stable = 0;
    public static final DisableNestedScroll INSTANCE = new DisableNestedScroll();

    @Override
    public long mo894onPostScrollDzOQY0M(long consumed, long available, int source) {
        return available;
    }

    private DisableNestedScroll() {
    }
}
