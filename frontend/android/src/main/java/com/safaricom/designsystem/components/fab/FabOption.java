package com.safaricom.designsystem.components.fab;

import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/safaricom/designsystem/components/fab/FabOption;", "", "icon", "Landroidx/compose/ui/graphics/painter/Painter;", "label", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getIcon", "()Landroidx/compose/ui/graphics/painter/Painter;", "getLabel", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FabOption {
    public static final int $stable = 8;
    private final Function0<Unit> ShareDataUIState;
    private final String component2;
    private final Painter copydefault;

    public FabOption(Painter painter, String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(painter, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = painter;
        this.component2 = str;
        this.ShareDataUIState = function0;
    }

    public final Painter getIcon() {
        return this.copydefault;
    }

    public final String getLabel() {
        return this.component2;
    }

    public final Function0<Unit> getOnClick() {
        return this.ShareDataUIState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FabOption copy$default(FabOption fabOption, Painter painter, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            painter = fabOption.copydefault;
        }
        if ((i & 2) != 0) {
            str = fabOption.component2;
        }
        if ((i & 4) != 0) {
            function0 = fabOption.ShareDataUIState;
        }
        return fabOption.copy(painter, str, function0);
    }

    public final Painter getCopydefault() {
        return this.copydefault;
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final Function0<Unit> component3() {
        return this.ShareDataUIState;
    }

    public final FabOption copy(Painter icon, String label, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(icon, "");
        Intrinsics.checkNotNullParameter(label, "");
        Intrinsics.checkNotNullParameter(onClick, "");
        return new FabOption(icon, label, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FabOption)) {
            return false;
        }
        FabOption fabOption = (FabOption) other;
        return Intrinsics.areEqual(this.copydefault, fabOption.copydefault) && Intrinsics.areEqual(this.component2, fabOption.component2) && Intrinsics.areEqual(this.ShareDataUIState, fabOption.ShareDataUIState);
    }

    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.component2.hashCode()) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        return "FabOption(icon=" + this.copydefault + ", label=" + this.component2 + ", onClick=" + this.ShareDataUIState + ")";
    }
}
