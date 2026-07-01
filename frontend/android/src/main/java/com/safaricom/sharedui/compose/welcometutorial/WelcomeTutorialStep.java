package com.safaricom.sharedui.compose.welcometutorial;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialStep;", "", "position", "", "direction", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialDirection;", "<init>", "(ILcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialDirection;)V", "getPosition", "()I", "getDirection", "()Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialDirection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WelcomeTutorialStep {
    public static final int $stable = 0;
    private final int component2;
    private final WelcomeTutorialDirection copydefault;

    public WelcomeTutorialStep(int i, WelcomeTutorialDirection welcomeTutorialDirection) {
        Intrinsics.checkNotNullParameter(welcomeTutorialDirection, "");
        this.component2 = i;
        this.copydefault = welcomeTutorialDirection;
    }

    public final int getPosition() {
        return this.component2;
    }

    public WelcomeTutorialStep(int i, WelcomeTutorialDirection welcomeTutorialDirection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? WelcomeTutorialDirection.FORWARD : welcomeTutorialDirection);
    }

    public final WelcomeTutorialDirection getDirection() {
        return this.copydefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeTutorialStep() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static WelcomeTutorialStep copy$default(WelcomeTutorialStep welcomeTutorialStep, int i, WelcomeTutorialDirection welcomeTutorialDirection, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = welcomeTutorialStep.component2;
        }
        if ((i2 & 2) != 0) {
            welcomeTutorialDirection = welcomeTutorialStep.copydefault;
        }
        return welcomeTutorialStep.copy(i, welcomeTutorialDirection);
    }

    public final int getComponent2() {
        return this.component2;
    }

    public final WelcomeTutorialDirection getCopydefault() {
        return this.copydefault;
    }

    public final WelcomeTutorialStep copy(int position, WelcomeTutorialDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "");
        return new WelcomeTutorialStep(position, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeTutorialStep)) {
            return false;
        }
        WelcomeTutorialStep welcomeTutorialStep = (WelcomeTutorialStep) other;
        return this.component2 == welcomeTutorialStep.component2 && this.copydefault == welcomeTutorialStep.copydefault;
    }

    public int hashCode() {
        return (Integer.hashCode(this.component2) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        return "WelcomeTutorialStep(position=" + this.component2 + ", direction=" + this.copydefault + ')';
    }
}
