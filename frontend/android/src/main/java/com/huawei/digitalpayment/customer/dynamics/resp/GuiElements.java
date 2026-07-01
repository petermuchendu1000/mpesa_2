package com.huawei.digitalpayment.customer.dynamics.resp;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.model.ElementMode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElements;", "Ljava/io/Serializable;", "guiElement", "Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElement;", "value", "", "<init>", "(Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElement;Ljava/lang/String;)V", "getGuiElement", "()Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElement;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiElements implements Serializable {

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private final GuiElement guiElement;
    private final String value;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElements$Companion;", "", "<init>", "()V", "toElement", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "editMode", "", "guiElements", "Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElements;", "showVisibly", "elementMode", "Lcom/huawei/digitalpayment/customer/dynamics/model/ElementMode;", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public static DynamicsElement toElement$default(Companion companion, boolean z, GuiElements guiElements, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 77;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 61;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
            return companion.toElement(z, guiElements);
        }

        public final DynamicsElement toElement(boolean editMode, GuiElements guiElements) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(guiElements, "");
                return GuiElementsKt.toElement(guiElements, editMode);
            }
            Intrinsics.checkNotNullParameter(guiElements, "");
            DynamicsElement element = GuiElementsKt.toElement(guiElements, editMode);
            int i3 = 6 / 0;
            return element;
        }

        public static boolean showVisibly$default(Companion companion, boolean z, GuiElements guiElements, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 35;
            copydefault = i4 % 128;
            if (i4 % 2 != 0 && (i & 1) != 0) {
                int i5 = i3 + 107;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i3 + 93;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            }
            return companion.showVisibly(z, guiElements);
        }

        public final boolean showVisibly(boolean editMode, GuiElements guiElements) {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(guiElements, "");
            boolean zShowVisibly = GuiElementsKt.showVisibly(guiElements, guiElements.getGuiElement().getGuiVisibility(), editMode);
            int i4 = copydefault + 95;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return zShowVisibly;
            }
            throw null;
        }

        public final boolean showVisibly(ElementMode elementMode, GuiElements guiElements) {
            int i = 2 % 2;
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(elementMode, "");
            Intrinsics.checkNotNullParameter(guiElements, "");
            boolean zShowVisibly = GuiElementsKt.showVisibly(guiElements, guiElements.getGuiElement().getGuiVisibility(), elementMode);
            int i4 = component2 + 51;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return zShowVisibly;
            }
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GuiElements(GuiElement guiElement, String str) {
        Intrinsics.checkNotNullParameter(guiElement, "");
        this.guiElement = guiElement;
        this.value = str;
    }

    public final GuiElement getGuiElement() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        GuiElement guiElement = this.guiElement;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return guiElement;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 19;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static GuiElements copy$default(GuiElements guiElements, GuiElement guiElement, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 73;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            guiElement = guiElements.guiElement;
        }
        if ((i & 2) != 0) {
            str = guiElements.value;
        }
        GuiElements guiElementsCopy = guiElements.copy(guiElement, str);
        int i5 = component2 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return guiElementsCopy;
    }

    public final GuiElement component1() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GuiElement guiElement = this.guiElement;
        int i4 = i3 + 67;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return guiElement;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GuiElements copy(GuiElement guiElement, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(guiElement, "");
        GuiElements guiElements = new GuiElements(guiElement, value);
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return guiElements;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 57;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof GuiElements)) {
            return false;
        }
        GuiElements guiElements = (GuiElements) other;
        if (!Intrinsics.areEqual(this.guiElement, guiElements.guiElement)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, guiElements.value)) {
            int i4 = component2 + 21;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = component2 + 17;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.guiElement.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.guiElement.hashCode();
        String str = this.value;
        if (str == null) {
            int i3 = ShareDataUIState + 109;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiElements(guiElement=" + this.guiElement + ", value=" + this.value + ")";
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
