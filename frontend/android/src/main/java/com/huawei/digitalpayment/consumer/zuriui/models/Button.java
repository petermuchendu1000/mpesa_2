package com.huawei.digitalpayment.consumer.zuriui.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/Button;", "", "text", "", "type", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getType", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Button {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 57 % 128;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final String component3;
    private final String copydefault;

    public Button(String str, String str2, String str3) {
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.copydefault = str3;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = equals + 15;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 5;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 51;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 31;
        equals = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 21;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = 57 % 2;
    }

    public static Button copy$default(Button button, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 55;
        int i4 = i3 % 128;
        equals = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = button.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = button.component3;
            int i5 = i4 + 27;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            str3 = button.copydefault;
            int i7 = getAsAtTimestamp + 101;
            equals = i7 % 128;
            int i8 = i7 % 2;
        }
        return button.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 87;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 9;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 115;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Button copy(String text, String type, String url) {
        int i = 2 % 2;
        Button button = new Button(text, type, url);
        int i2 = getAsAtTimestamp + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return button;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 17;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Button)) {
            int i4 = getAsAtTimestamp + 91;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Button button = (Button) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, button.ShareDataUIState)) {
            int i6 = equals + 33;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component3, button.component3)) {
            return Intrinsics.areEqual(this.copydefault, button.copydefault);
        }
        int i8 = equals + 25;
        getAsAtTimestamp = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.ShareDataUIState;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = equals + 49;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.component3;
        if (str2 == null) {
            int i4 = getAsAtTimestamp + 33;
            equals = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.copydefault;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i6 = getAsAtTimestamp + 33;
            equals = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Button(text=" + this.ShareDataUIState + ", type=" + this.component3 + ", url=" + this.copydefault + ')';
        int i2 = getAsAtTimestamp + 45;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
