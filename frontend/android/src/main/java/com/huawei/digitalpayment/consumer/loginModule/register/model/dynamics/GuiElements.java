package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElements;", "Ljava/io/Serializable;", "guiElement", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElement;", "value", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElement;Ljava/lang/String;)V", "getGuiElement", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElement;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiElements implements Serializable {

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final GuiElement guiElement;
    private final String value;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElements$Companion;", "", "<init>", "()V", "toElement", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "editMode", "", "guiElements", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElements;", "showVisibly", "elementMode", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/ElementMode;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 1;
        private static int copydefault;

        private Companion() {
        }

        public static DynamicsElement toElement$default(Companion companion, boolean z, GuiElements guiElements, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 83;
            int i4 = i3 % 128;
            copydefault = i4;
            if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                int i5 = i4 + 45;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            }
            DynamicsElement element = companion.toElement(z, guiElements);
            int i7 = component2 + 101;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return element;
        }

        public final DynamicsElement toElement(boolean editMode, GuiElements guiElements) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(guiElements, "");
            DynamicsElement element = GuiElementsKt.toElement(guiElements, editMode);
            int i4 = copydefault + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return element;
        }

        public static boolean showVisibly$default(Companion companion, boolean z, GuiElements guiElements, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component2;
                int i4 = i3 + 5;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 117;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            }
            return companion.showVisibly(z, guiElements);
        }

        public final boolean showVisibly(boolean editMode, GuiElements guiElements) {
            int i = 2 % 2;
            int i2 = component2 + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(guiElements, "");
            boolean zShowVisibly = GuiElementsKt.showVisibly(guiElements, guiElements.getGuiElement().getGuiVisibility(), editMode);
            int i4 = copydefault + 59;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return zShowVisibly;
        }

        public final boolean showVisibly(ElementMode elementMode, GuiElements guiElements) {
            int i = 2 % 2;
            int i2 = component2 + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(elementMode, "");
            Intrinsics.checkNotNullParameter(guiElements, "");
            boolean zShowVisibly = GuiElementsKt.showVisibly(guiElements, guiElements.getGuiElement().getGuiVisibility(), elementMode);
            int i4 = component2 + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return zShowVisibly;
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
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        GuiElement guiElement = this.guiElement;
        int i4 = i3 + 17;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return guiElement;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 65;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static GuiElements copy$default(GuiElements guiElements, GuiElement guiElement, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 43;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            guiElement = guiElements.guiElement;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 45;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str2 = guiElements.value;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = guiElements.value;
        }
        return guiElements.copy(guiElement, str);
    }

    public final GuiElement component1() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        GuiElement guiElement = this.guiElement;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return guiElement;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GuiElements copy(GuiElement guiElement, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(guiElement, "");
        GuiElements guiElements = new GuiElements(guiElement, value);
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 16 / 0;
        }
        return guiElements;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof GuiElements))) {
            GuiElements guiElements = (GuiElements) other;
            if (Intrinsics.areEqual(this.guiElement, guiElements.guiElement)) {
                return Intrinsics.areEqual(this.value, guiElements.value);
            }
            int i5 = component1 + 103;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 45;
        int i8 = i7 % 128;
        component1 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 35;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.guiElement.hashCode();
        String str = this.value;
        if (str == null) {
            int i4 = component1 + 99;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = component1 + 113;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiElements(guiElement=" + this.guiElement + ", value=" + this.value + ")";
        int i2 = component1 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
