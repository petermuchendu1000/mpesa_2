package com.safaricom.designsystem.components.fab;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/designsystem/components/fab/FabOptionsState;", "", "<init>", "()V", "VISIBLE", "HIDDEN", "Lcom/safaricom/designsystem/components/fab/FabOptionsState$HIDDEN;", "Lcom/safaricom/designsystem/components/fab/FabOptionsState$VISIBLE;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FabOptionsState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/fab/FabOptionsState$VISIBLE;", "Lcom/safaricom/designsystem/components/fab/FabOptionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VISIBLE extends FabOptionsState {
        public static final int $stable = 0;
        public static final VISIBLE INSTANCE = new VISIBLE();

        public int hashCode() {
            return 1928738630;
        }

        private VISIBLE() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VISIBLE)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "VISIBLE";
        }
    }

    private FabOptionsState() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/fab/FabOptionsState$HIDDEN;", "Lcom/safaricom/designsystem/components/fab/FabOptionsState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HIDDEN extends FabOptionsState {
        public static final int $stable = 0;
        public static final HIDDEN INSTANCE = new HIDDEN();

        public int hashCode() {
            return 1877714998;
        }

        private HIDDEN() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HIDDEN)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "HIDDEN";
        }
    }

    public FabOptionsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
