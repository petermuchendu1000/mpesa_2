package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiGroup;", "Ljava/io/Serializable;", "groupCode", "", "groupLabel", "value", "guiElements", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElements;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupCode", "()Ljava/lang/String;", "getGroupLabel", "getValue", "getGuiElements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiGroup implements Serializable {
    private static int component3 = 1;
    private static int copydefault;
    private final String groupCode;
    private final String groupLabel;
    private final List<GuiElements> guiElements;
    private final String value;

    public GuiGroup(String str, String str2, String str3, List<GuiElements> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.groupCode = str;
        this.groupLabel = str2;
        this.value = str3;
        this.guiElements = list;
    }

    public final String getGroupCode() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.groupCode;
        int i5 = i3 + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGroupLabel() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.groupLabel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<GuiElements> getGuiElements() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<GuiElements> list = this.guiElements;
        int i4 = i3 + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GuiGroup copy$default(GuiGroup guiGroup, String str, String str2, String str3, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 25;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = guiGroup.groupCode;
        }
        if ((i & 2) != 0) {
            str2 = guiGroup.groupLabel;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 107;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str3 = guiGroup.value;
        }
        if ((i & 8) != 0) {
            int i7 = component3 + 59;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            list = guiGroup.guiElements;
        }
        return guiGroup.copy(str, str2, str3, list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.groupCode;
            int i4 = 1 / 0;
        } else {
            str = this.groupCode;
        }
        int i5 = i2 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.groupLabel;
        int i5 = i3 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<GuiElements> component4() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<GuiElements> list = this.guiElements;
        int i5 = i3 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final GuiGroup copy(String groupCode, String groupLabel, String value, List<GuiElements> guiElements) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(groupCode, "");
        Intrinsics.checkNotNullParameter(groupLabel, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(guiElements, "");
        GuiGroup guiGroup = new GuiGroup(groupCode, groupLabel, value, guiElements);
        int i2 = copydefault + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return guiGroup;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 33;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof GuiGroup)) {
            int i8 = i4 + 13;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        GuiGroup guiGroup = (GuiGroup) other;
        if (Intrinsics.areEqual(this.groupCode, guiGroup.groupCode)) {
            return Intrinsics.areEqual(this.groupLabel, guiGroup.groupLabel) && Intrinsics.areEqual(this.value, guiGroup.value) && Intrinsics.areEqual(this.guiElements, guiGroup.guiElements);
        }
        int i10 = copydefault + 121;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.groupCode.hashCode() * 31) + this.groupLabel.hashCode()) * 31) + this.value.hashCode()) * 31) + this.guiElements.hashCode();
        int i4 = copydefault + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiGroup(groupCode=" + this.groupCode + ", groupLabel=" + this.groupLabel + ", value=" + this.value + ", guiElements=" + this.guiElements + ")";
        int i2 = copydefault + 3;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return str;
    }
}
