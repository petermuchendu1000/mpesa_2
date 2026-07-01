package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiSelectInfo;", "Ljava/io/Serializable;", "key", "", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getLabel", "setLabel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiSelectInfo implements Serializable {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private String key;
    private String label;

    public GuiSelectInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.label = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLabel() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.label;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setKey(String str) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.key = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        int i3 = component2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void setLabel(String str) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.label = str;
        int i4 = component2 + 123;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static GuiSelectInfo copy$default(GuiSelectInfo guiSelectInfo, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = guiSelectInfo.key;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 7;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            str2 = guiSelectInfo.label;
            int i6 = i4 + 13;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return guiSelectInfo.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i2 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.label;
        int i4 = i2 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return str;
    }

    public final GuiSelectInfo copy(String key, String label) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(label, "");
        GuiSelectInfo guiSelectInfo = new GuiSelectInfo(key, label);
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return guiSelectInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 43;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof GuiSelectInfo)) {
            int i4 = ShareDataUIState;
            int i5 = i4 + 33;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 21;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        GuiSelectInfo guiSelectInfo = (GuiSelectInfo) other;
        if (!Intrinsics.areEqual(this.key, guiSelectInfo.key) || !Intrinsics.areEqual(this.label, guiSelectInfo.label)) {
            return false;
        }
        int i9 = ShareDataUIState + 83;
        component2 = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.key.hashCode() * 31) + this.label.hashCode();
        int i4 = component2 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuiSelectInfo(key=" + this.key + ", label=" + this.label + ")";
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
