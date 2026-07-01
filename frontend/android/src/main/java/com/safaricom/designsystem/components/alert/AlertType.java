package com.safaricom.designsystem.components.alert;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/safaricom/designsystem/components/alert/AlertType;", "", "background", "Landroidx/compose/ui/graphics/Color;", "borderColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBorderColor-0d7_KjU", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertType {
    public static final int $stable = 0;
    private final long ShareDataUIState;
    private final long copydefault;

    private AlertType(long j, long j2) {
        this.ShareDataUIState = j;
        this.copydefault = j2;
    }

    public AlertType(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.INSTANCE.m6091getWhite0d7_KjU() : j, (i & 2) != 0 ? Color.INSTANCE.m6091getWhite0d7_KjU() : j2, null);
    }

    public final long getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final long getCopydefault() {
        return this.copydefault;
    }

    public AlertType(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
