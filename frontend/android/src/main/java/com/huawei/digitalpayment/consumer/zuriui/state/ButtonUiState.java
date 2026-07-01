package com.huawei.digitalpayment.consumer.zuriui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/state/ButtonUiState;", "", "text", "", "type", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonUiState {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int component4 = 0;
    private static int equals = 1;
    private final String ShareDataUIState;
    private final String component2;
    private final String copydefault;

    public ButtonUiState(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.component2 = str2;
        this.ShareDataUIState = str3;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = equals + 65;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 51;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component4 + 119;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = equals + 89;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 77;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static ButtonUiState copy$default(ButtonUiState buttonUiState, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 41;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            str = buttonUiState.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = buttonUiState.component2;
            int i5 = component4 + 5;
            equals = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            str3 = buttonUiState.ShareDataUIState;
            int i7 = equals + 109;
            component4 = i7 % 128;
            int i8 = i7 % 2;
        }
        return buttonUiState.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 119;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 93;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 43;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 1;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 71;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final ButtonUiState copy(String text, String type, String url) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(type, "");
        ButtonUiState buttonUiState = new ButtonUiState(text, type, url);
        int i2 = equals + 65;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return buttonUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 61;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof ButtonUiState) {
            ButtonUiState buttonUiState = (ButtonUiState) other;
            return Intrinsics.areEqual(this.copydefault, buttonUiState.copydefault) && !(Intrinsics.areEqual(this.component2, buttonUiState.component2) ^ true) && Intrinsics.areEqual(this.ShareDataUIState, buttonUiState.ShareDataUIState);
        }
        int i4 = component4 + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 121;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            this.copydefault.hashCode();
            this.component2.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.component2.hashCode();
        String str = this.ShareDataUIState;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i4 = equals + 79;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ButtonUiState(text=" + this.copydefault + ", type=" + this.component2 + ", url=" + this.ShareDataUIState + ')';
        int i2 = equals + 55;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
