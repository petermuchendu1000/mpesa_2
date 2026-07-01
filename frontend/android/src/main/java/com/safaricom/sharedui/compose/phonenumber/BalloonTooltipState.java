package com.safaricom.sharedui.compose.phonenumber;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState;", "", "<init>", "()V", "Show", "Hide", "Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState$Hide;", "Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState$Show;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BalloonTooltipState {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState$Show;", "Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState;", "message", "", "toastDuration", "", "<init>", "(Ljava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getToastDuration", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Show extends BalloonTooltipState {
        public static final int $stable = 0;
        private final String component1;
        private final long component3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(String str, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
            this.component3 = j;
        }

        public final String getMessage() {
            return this.component1;
        }

        public final long getToastDuration() {
            return this.component3;
        }

        public static Show copy$default(Show show, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = show.component1;
            }
            if ((i & 2) != 0) {
                j = show.component3;
            }
            return show.copy(str, j);
        }

        public final String getComponent1() {
            return this.component1;
        }

        public final long getComponent3() {
            return this.component3;
        }

        public final Show copy(String message, long toastDuration) {
            Intrinsics.checkNotNullParameter(message, "");
            return new Show(message, toastDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Show)) {
                return false;
            }
            Show show = (Show) other;
            return Intrinsics.areEqual(this.component1, show.component1) && this.component3 == show.component3;
        }

        public int hashCode() {
            return (this.component1.hashCode() * 31) + Long.hashCode(this.component3);
        }

        public String toString() {
            return "Show(message=" + this.component1 + ", toastDuration=" + this.component3 + ')';
        }
    }

    private BalloonTooltipState() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState$Hide;", "Lcom/safaricom/sharedui/compose/phonenumber/BalloonTooltipState;", "<init>", "()V", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hide extends BalloonTooltipState {
        public static final int $stable = 0;
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super(null);
        }
    }

    public BalloonTooltipState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
