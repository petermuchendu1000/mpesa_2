package com.safaricom.sharedui.compose.navigation;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "T", "", WindowInfoFieldGroup.FIELD_SCREEN, "direction", "Lcom/safaricom/sharedui/compose/navigation/ScreenDirection;", "<init>", "(Ljava/lang/Object;Lcom/safaricom/sharedui/compose/navigation/ScreenDirection;)V", "getScreen", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDirection", "()Lcom/safaricom/sharedui/compose/navigation/ScreenDirection;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/safaricom/sharedui/compose/navigation/ScreenDirection;)Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "equals", "", "other", "hashCode", "", "toString", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenInformation<T> {
    public static final int $stable = 0;
    private final T component2;
    private final ScreenDirection copydefault;

    public ScreenInformation(T t, ScreenDirection screenDirection) {
        Intrinsics.checkNotNullParameter(screenDirection, "");
        this.component2 = t;
        this.copydefault = screenDirection;
    }

    public final ScreenDirection getDirection() {
        return this.copydefault;
    }

    public final T getScreen() {
        return this.component2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScreenInformation copy$default(ScreenInformation screenInformation, Object obj, ScreenDirection screenDirection, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = screenInformation.component2;
        }
        if ((i & 2) != 0) {
            screenDirection = screenInformation.copydefault;
        }
        return screenInformation.copy(obj, screenDirection);
    }

    public final T component1() {
        return this.component2;
    }

    public final ScreenDirection getCopydefault() {
        return this.copydefault;
    }

    public final ScreenInformation<T> copy(T screen, ScreenDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "");
        return new ScreenInformation<>(screen, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenInformation)) {
            return false;
        }
        ScreenInformation screenInformation = (ScreenInformation) other;
        return Intrinsics.areEqual(this.component2, screenInformation.component2) && this.copydefault == screenInformation.copydefault;
    }

    public int hashCode() {
        T t = this.component2;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        return "ScreenInformation(screen=" + this.component2 + ", direction=" + this.copydefault + ')';
    }
}
