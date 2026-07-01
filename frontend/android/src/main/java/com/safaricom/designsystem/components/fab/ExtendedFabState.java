package com.safaricom.designsystem.components.fab;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/designsystem/components/fab/ExtendedFabState;", "", "<init>", "()V", "EXPANDED", "COLLAPSED", "Lcom/safaricom/designsystem/components/fab/ExtendedFabState$COLLAPSED;", "Lcom/safaricom/designsystem/components/fab/ExtendedFabState$EXPANDED;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ExtendedFabState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/fab/ExtendedFabState$EXPANDED;", "Lcom/safaricom/designsystem/components/fab/ExtendedFabState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EXPANDED extends ExtendedFabState {
        public static final int $stable = 0;
        public static final EXPANDED INSTANCE = new EXPANDED();

        public int hashCode() {
            return -1990978100;
        }

        private EXPANDED() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EXPANDED)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "EXPANDED";
        }
    }

    private ExtendedFabState() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/fab/ExtendedFabState$COLLAPSED;", "Lcom/safaricom/designsystem/components/fab/ExtendedFabState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class COLLAPSED extends ExtendedFabState {
        public static final int $stable = 0;
        public static final COLLAPSED INSTANCE = new COLLAPSED();

        public int hashCode() {
            return 271977348;
        }

        private COLLAPSED() {
            super(null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof COLLAPSED)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "COLLAPSED";
        }
    }

    public ExtendedFabState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
